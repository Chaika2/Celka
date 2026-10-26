/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class WM
extends Enum<WM> {
    public static final /* enum */ WM EVERYTHING = new WM();
    public static final /* enum */ WM MOBS = new WM();
    private static final /* synthetic */ WM[] $VALUES;

    static {
        $VALUES = WM.id_class();
    }

    public static WM[] values() {
        return (WM[])$VALUES.clone();
    }

    public static WM valueOf(String string) {
        return Enum.valueOf(WM.class, string);
    }

    private static /* synthetic */ WM[] id_class() {
        return new WM[]{EVERYTHING, MOBS};
    }
}

