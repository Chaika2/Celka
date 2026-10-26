/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrke_1
extends Enum<rrke_1> {
    public static final /* enum */ rrke_1 TEXTURE_1D = new rrke_1(3552);
    public static final /* enum */ rrke_1 TEXTURE_2D = new rrke_1(3553);
    public static final /* enum */ rrke_1 TEXTURE_3D = new rrke_1(32879);
    public static final /* enum */ rrke_1 TEXTURE_RECTANGLE = new rrke_1(34037);
    private int id;
    private static final /* synthetic */ rrke_1[] $VALUES;

    private rrke_1(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = rrke_1.id_break();
    }

    public static rrke_1[] values() {
        return (rrke_1[])$VALUES.clone();
    }

    public static rrke_1 valueOf(String string) {
        return Enum.valueOf(rrke_1.class, string);
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ rrke_1[] id_break() {
        return new rrke_1[]{TEXTURE_1D, TEXTURE_2D, TEXTURE_3D, TEXTURE_RECTANGLE};
    }
}

