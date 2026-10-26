/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rVU
extends Enum<rVU> {
    public static final /* enum */ rVU CHAT = new rVU(0, false);
    public static final /* enum */ rVU SYSTEM = new rVU(1, true);
    public static final /* enum */ rVU GAME_INFO = new rVU(2, true);
    private final byte id;
    private final boolean interrupts;
    private static final /* synthetic */ rVU[] $VALUES;

    private static /* synthetic */ rVU[] id_byte() {
        return new rVU[]{CHAT, SYSTEM, GAME_INFO};
    }

    private rVU(byte by, boolean bl) {
        this.id = by;
        this.interrupts = bl;
    }

    static {
        $VALUES = rVU.id_byte();
    }

    public static rVU[] values() {
        return (rVU[])$VALUES.clone();
    }

    public static rVU valueOf(String string) {
        return Enum.valueOf(rVU.class, string);
    }

    public static rVU id_class(byte by) {
        for (rVU rVU2 : rVU.values()) {
            if (by != rVU2.id) continue;
            return rVU2;
        }
        return CHAT;
    }

    public byte id_class() {
        return this.id;
    }

    public boolean id_break() {
        return this.interrupts;
    }
}

