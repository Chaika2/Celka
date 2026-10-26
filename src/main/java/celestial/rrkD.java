/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrkD
extends Enum<rrkD> {
    public static final /* enum */ rrkD RED = new rrkD(6403);
    public static final /* enum */ rrkD RG = new rrkD(33319);
    public static final /* enum */ rrkD RGB = new rrkD(6407);
    public static final /* enum */ rrkD BGR = new rrkD(32992);
    public static final /* enum */ rrkD RGBA = new rrkD(6408);
    public static final /* enum */ rrkD BGRA = new rrkD(32993);
    public static final /* enum */ rrkD RED_INTEGER = new rrkD(36244);
    public static final /* enum */ rrkD RG_INTEGER = new rrkD(33320);
    public static final /* enum */ rrkD RGB_INTEGER = new rrkD(36248);
    public static final /* enum */ rrkD BGR_INTEGER = new rrkD(36250);
    public static final /* enum */ rrkD RGBA_INTEGER = new rrkD(36249);
    public static final /* enum */ rrkD BGRA_INTEGER = new rrkD(36251);
    private int id;
    private static final /* synthetic */ rrkD[] $VALUES;

    private rrkD(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = rrkD.id_break();
    }

    public static rrkD[] values() {
        return (rrkD[])$VALUES.clone();
    }

    public static rrkD valueOf(String string) {
        return Enum.valueOf(rrkD.class, string);
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ rrkD[] id_break() {
        return new rrkD[]{RED, RG, RGB, BGR, RGBA, BGRA, RED_INTEGER, RG_INTEGER, RGB_INTEGER, BGR_INTEGER, RGBA_INTEGER, BGRA_INTEGER};
    }
}

