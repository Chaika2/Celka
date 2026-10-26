import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Reproducible bytecode patcher for celestial/Aq_1.class.
 *
 * Bug: in Aq_1.id_class(rvD_2) (server teleport handler) the rotation written
 * into the follow-up CPlayerPositionAndRotation (rZX) and into rrAH is taken
 * from the local player instead of from the teleport packet. Combined with the
 * hardcoded player yaw of -180.0f set in id_class(rvZ_2) (JoinGame), the client
 * confirms a teleport and then immediately reports yaw=-180/pitch=0, which the
 * server-side "mandatory teleport" validator rejects -> re-issues the teleport
 * with a new id -> eventually kicks to Lobby.
 *
 * Fix (all edits are length-preserving, no branch offsets change):
 *   In Aq_1.id_class(rvD_2):
 *   - 53108..53124 (17 bytes) : "f3 = player.yaw"   -> nops
 *   - 53125..53141 (17 bytes) : "f4 = player.pitch" -> nops
 *   - 53142..53156 (15 bytes) : rrAH arg1 (yaw)     -> fload 34 + nops
 *   - 53157..53171 (15 bytes) : rrAH arg2 (pitch)   -> fload 35 + nops
 *   - 53263..53267 ( 5 bytes) : rZX yaw   = rrAH   -> fload 34 + nops
 *   - 53268..53272 ( 5 bytes) : rZX pitch = rrAH   -> fload 35 + nops
 *
 * The last two matter because celestial/rrCS (a listener on the same event bus)
 * stomps rrAH back to the local player rotation when it handles the rrAH event,
 * so reading rrAH for the outgoing CPlayerPositionAndRotation re-introduced the
 * bug. Reading the computed locals directly avoids that.
 *
 * Slots 34/35 hold the correctly computed rotation (packet rotation plus any
 * relative-rotation flags), see Aq_1.id_class(rvD_2) bytecode.
 *
 * Usage: java PatchAq1 <in.class> <out.class>
 */
public final class PatchAq1 {

    // Expected original bytes (used as an integrity check before patching).
    // Full 17-byte "load local yaw into f3" sequence (override #1).
    private static final int[] YAW_LOCAL = {
        0x19, 0x08, 0xB4, 0x03, 0xB8, 0x13, 0x0D, 0xAF, 0x32, 0xC0, 0x00, 0xF5, 0xB6, 0x03, 0x51, 0x38, 0x22
    };
    // Full 17-byte "load local pitch into f4" sequence (override #2).
    private static final int[] PITCH_LOCAL = {
        0x19, 0x08, 0xB4, 0x03, 0xB8, 0x13, 0x0D, 0xB6, 0x32, 0xC0, 0x00, 0xF5, 0xB6, 0x03, 0x51, 0x38, 0x23
    };
    // 15-byte "push local player.yaw" expression used as the rrAH argument.
    private static final int[] YAW_PUSH = {
        0x19, 0x08, 0xB4, 0x03, 0xB8, 0x13, 0x0D, 0xAF, 0x32, 0xC0, 0x00, 0xF5, 0xB6, 0x03, 0x51
    };
    // 15-byte "push local player.pitch" expression used as the rrAH argument.
    private static final int[] PITCH_PUSH = {
        0x19, 0x08, 0xB4, 0x03, 0xB8, 0x13, 0x0D, 0xB6, 0x32, 0xC0, 0x00, 0xF5, 0xB6, 0x03, 0x51
    };
    // 5-byte "aload 36; invokevirtual rrAH.id_class:()F" (rZX yaw argument).
    private static final int[] RZX_YAW = {0x19, 0x24, 0xB6, 0x03, 0xEF};
    // 5-byte "aload 36; invokevirtual rrAH.id_byte:()F" (rZX pitch argument).
    private static final int[] RZX_PITCH = {0x19, 0x24, 0xB6, 0x03, 0xF1};

    // Offsets are absolute file offsets in the shipped Aq_1.class.
    private static final int OVERRIDE_YAW   = 53108; // 17 bytes
    private static final int OVERRIDE_PITCH = 53125; // 17 bytes
    private static final int RRAH_ARG_YAW   = 53142; // 15 bytes
    private static final int RRAH_ARG_PITCH = 53157; // 15 bytes
    private static final int RZX_ARG_YAW    = 53263; // 5 bytes
    private static final int RZX_ARG_PITCH  = 53268; // 5 bytes

    private static final int FLOAD    = 0x17; // fload <index> (index >= 4)
    private static final int SLOT_34  = 0x22; // local slot holding the yaw
    private static final int SLOT_35  = 0x23; // local slot holding the pitch
    private static final int NOP      = 0x00;

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("usage: java PatchAq1 <in.class> <out.class>");
            System.exit(2);
        }
        Path in = Paths.get(args[0]);
        Path out = Paths.get(args[1]);
        byte[] b = Files.readAllBytes(in);

        require(b, OVERRIDE_YAW, YAW_LOCAL, "player-yaw override");
        require(b, OVERRIDE_PITCH, PITCH_LOCAL, "player-pitch override");
        require(b, RRAH_ARG_YAW, YAW_PUSH, "rrAH yaw argument");
        require(b, RRAH_ARG_PITCH, PITCH_PUSH, "rrAH pitch argument");
        require(b, RZX_ARG_YAW, RZX_YAW, "rZX yaw argument");
        require(b, RZX_ARG_PITCH, RZX_PITCH, "rZX pitch argument");

        // Remove the two event-driven overrides; f3/f4 keep the packet rotation.
        fill(b, OVERRIDE_YAW, 17, NOP);
        fill(b, OVERRIDE_PITCH, 17, NOP);

        // Build rrAH from the computed rotation instead of the local player one.
        emitFload(b, RRAH_ARG_YAW, 15, SLOT_34);
        emitFload(b, RRAH_ARG_PITCH, 15, SLOT_35);

        // The outgoing position-and-rotation must also use the computed rotation,
        // not rrAH (a bus listener, celestial/rrCS, rewrites rrAH with the local
        // player rotation after Aq_1 dispatches the event).
        emitFload(b, RZX_ARG_YAW, 5, SLOT_34);
        emitFload(b, RZX_ARG_PITCH, 5, SLOT_35);

        Files.createDirectories(out.toAbsolutePath().getParent());
        Files.write(out, b);
        System.out.println("patched: " + out.toAbsolutePath() + " (" + b.length + " bytes)");
    }

    private static void require(byte[] b, int off, int[] expected, String what) {
        for (int i = 0; i < expected.length; i++) {
            int got = b[off + i] & 0xFF;
            if (got != expected[i]) {
                throw new IllegalStateException(String.format(
                    "unexpected bytecode at offset %d (%s): expected %02X, found %02X. "
                    + "The runtime jar differs from the version this patch targets.",
                    off + i, what, expected[i], got));
            }
        }
    }

    private static void fill(byte[] b, int off, int len, int value) {
        for (int i = 0; i < len; i++) {
            b[off + i] = (byte) value;
        }
    }

    /**
     * Writes "fload <slot>" (2 bytes) at off and pads the rest of the original
     * instruction slot (len bytes) with nops.
     */
    private static void emitFload(byte[] b, int off, int len, int slot) {
        fill(b, off, len, NOP);
        b[off] = (byte) FLOAD;
        b[off + 1] = (byte) slot;
    }
}
