/*
 * Decompiled with CFR 0.152.
 */
package celestial;

@Deprecated
public final class MD
extends Enum<MD> {
    public static final /* enum */ MD LINEAR = new MD(9729);
    public static final /* enum */ MD EXP = new MD(2048);
    public static final /* enum */ MD EXP2 = new MD(2049);
    public final int param;
    private static final /* synthetic */ MD[] $VALUES;

    private MD(int n2) {
        this.param = n2;
    }

    static {
        $VALUES = MD.id_class();
    }

    public static MD[] values() {
        return (MD[])$VALUES.clone();
    }

    public static MD valueOf(String string) {
        return Enum.valueOf(MD.class, string);
    }

    private static /* synthetic */ MD[] id_class() {
        return new MD[]{LINEAR, EXP, EXP2};
    }
}

