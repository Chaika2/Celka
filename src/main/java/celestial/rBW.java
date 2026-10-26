/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rBW
extends Enum<rBW> {
    public static final /* enum */ rBW MOVE = new rBW();
    public static final /* enum */ rBW LOOK = new rBW();
    public static final /* enum */ rBW JUMP = new rBW();
    public static final /* enum */ rBW TARGET = new rBW();
    private static final /* synthetic */ rBW[] $VALUES;

    static {
        $VALUES = rBW.id_class();
    }

    public static rBW[] values() {
        return (rBW[])$VALUES.clone();
    }

    public static rBW valueOf(String string) {
        return Enum.valueOf(rBW.class, string);
    }

    private static /* synthetic */ rBW[] id_class() {
        return new rBW[]{MOVE, LOOK, JUMP, TARGET};
    }
}

