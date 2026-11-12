import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Fixes the Celestial Discord RPC presence.
 *
 * <p>Two problems are patched in {@code celestial.rrZP}:</p>
 *
 * <ol>
 *   <li><b>Timer starts in 2026.</b> The static initializer helper
 *       {@code id_throws()V} stores the fixed epoch {@code 1787089031580L}
 *       (2026-08-16) in the object array that later becomes the presence start
 *       timestamp, so Discord showed thousands of hours played. That
 *       {@code ldc2_w} is replaced with {@code System.currentTimeMillis()};
 *       the stack shape is unchanged, so frames and max stack stay valid.</li>
 *   <li><b>No server in the text.</b> {@code id_class(celestial.rrZr_1)V}
 *       always calls {@code setState("Build » 1.1 (1.16.5)")}. The argument is
 *       replaced with {@code celestial.DiscordRpcServer.line()}, which returns
 *       the recognised server name, the raw server address, "singleplayer" or
 *       the old build line while in the menu. The helper is shipped in the
 *       same fix directory as the patched class.</li>
 * </ol>
 */
public final class DiscordRpcPresenceFix {
    private static final String OWNER = "celestial/rrZP";

    private static final String STATIC_HELPER = "id_throws";
    private static final String STATIC_HELPER_DESC = "()V";
    private static final long OLD_TIMESTAMP = 1787089031580L;

    private static final String PRESENCE_METHOD = "id_class";
    private static final String PRESENCE_DESC = "(Lcelestial/rrZr_1;)V";
    private static final String SET_STATE = "setState";
    private static final String SET_STATE_DESC = "(Ljava/lang/String;)Ldiscord/DiscordRichPresence$Builder;";
    private static final String SERVER_HELPER = "celestial/DiscordRpcServer";
    private static final String SERVER_LINE = "line";
    private static final String SERVER_LINE_DESC = "()Ljava/lang/String;";

    private DiscordRpcPresenceFix() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException("usage: DiscordRpcPresenceFix <input.class> <output.class>");
        }

        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);
        byte[] original = Files.readAllBytes(input);

        ClassReader reader = new ClassReader(original);
        if (!OWNER.equals(reader.getClassName())) {
            throw new IllegalStateException("expected " + OWNER + ", got " + reader.getClassName());
        }

        ClassWriter writer = new ClassWriter(reader, 0);
        int[] timestampReplacements = {0};
        int[] stateReplacements = {0};

        ClassVisitor visitor = new ClassVisitor(Opcodes.ASM9, writer) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor,
                                             String signature, String[] exceptions) {
                MethodVisitor target = super.visitMethod(access, name, descriptor, signature, exceptions);

                if (STATIC_HELPER.equals(name) && STATIC_HELPER_DESC.equals(descriptor)) {
                    return new MethodVisitor(Opcodes.ASM9, target) {
                        @Override
                        public void visitLdcInsn(Object value) {
                            if (value instanceof Long && ((Long) value).longValue() == OLD_TIMESTAMP) {
                                timestampReplacements[0]++;
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System",
                                        "currentTimeMillis", "()J", false);
                                return;
                            }
                            super.visitLdcInsn(value);
                        }
                    };
                }

                if (PRESENCE_METHOD.equals(name) && PRESENCE_DESC.equals(descriptor)) {
                    return new MethodVisitor(Opcodes.ASM9, target) {
                        @Override
                        public void visitMethodInsn(int opcode, String owner, String methodName,
                                                    String methodDescriptor, boolean itf) {
                            if (opcode == Opcodes.INVOKEVIRTUAL
                                    && SET_STATE.equals(methodName)
                                    && SET_STATE_DESC.equals(methodDescriptor)) {
                                stateReplacements[0]++;
                                // Stack before: builder, "Build » 1.1 (1.16.5)".
                                // Drop the constant, push the session's server line instead.
                                super.visitInsn(Opcodes.POP);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, SERVER_HELPER,
                                        SERVER_LINE, SERVER_LINE_DESC, false);
                            }
                            super.visitMethodInsn(opcode, owner, methodName, methodDescriptor, itf);
                        }
                    };
                }

                return target;
            }
        };

        reader.accept(visitor, 0);

        if (timestampReplacements[0] != 1) {
            throw new IllegalStateException("expected exactly one " + OLD_TIMESTAMP + " constant in "
                    + OWNER + "." + STATIC_HELPER + STATIC_HELPER_DESC
                    + ", found " + timestampReplacements[0]);
        }
        if (stateReplacements[0] != 1) {
            throw new IllegalStateException("expected exactly one " + SET_STATE + " call in "
                    + OWNER + "." + PRESENCE_METHOD + PRESENCE_DESC
                    + ", found " + stateReplacements[0]);
        }

        Files.write(output, writer.toByteArray());
    }
}