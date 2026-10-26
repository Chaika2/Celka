/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rPZ
extends Enum<rPZ> {
    public static final /* enum */ rPZ STOPPED = new rPZ();
    public static final /* enum */ rPZ RUNNING = new rPZ();
    private static final /* synthetic */ rPZ[] $VALUES;

    static {
        $VALUES = rPZ.id_class();
    }

    public static rPZ[] values() {
        return (rPZ[])$VALUES.clone();
    }

    public static rPZ valueOf(String string) {
        return Enum.valueOf(rPZ.class, string);
    }

    private static /* synthetic */ rPZ[] id_class() {
        return new rPZ[]{STOPPED, RUNNING};
    }
}

