/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class fu_3
extends Enum<fu_3> {
    public static final /* enum */ fu_3 RGBA = new fu_3(6408);
    public static final /* enum */ fu_3 RGB = new fu_3(6407);
    public static final /* enum */ fu_3 LUMINANCE_ALPHA = new fu_3(6410);
    public static final /* enum */ fu_3 LUMINANCE = new fu_3(6409);
    public static final /* enum */ fu_3 INTENSITY = new fu_3(32841);
    private final int glConstant;
    private static final /* synthetic */ fu_3[] $VALUES;

    private fu_3(int n2) {
        this.glConstant = n2;
    }

    static {
        $VALUES = fu_3.id_break();
    }

    public static fu_3[] values() {
        return (fu_3[])$VALUES.clone();
    }

    public static fu_3 valueOf(String string) {
        return Enum.valueOf(fu_3.class, string);
    }

    public int id_class() {
        return this.glConstant;
    }

    private static /* synthetic */ fu_3[] id_break() {
        return new fu_3[]{RGBA, RGB, LUMINANCE_ALPHA, LUMINANCE, INTENSITY};
    }
}

