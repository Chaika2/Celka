/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rkc_3
extends Enum<rkc_3> {
    public static final /* enum */ rkc_3 NONE = new rkc_3();
    public static final /* enum */ rkc_3 EAT = new rkc_3();
    public static final /* enum */ rkc_3 DRINK = new rkc_3();
    public static final /* enum */ rkc_3 BLOCK = new rkc_3();
    public static final /* enum */ rkc_3 BOW = new rkc_3();
    public static final /* enum */ rkc_3 SPEAR = new rkc_3();
    public static final /* enum */ rkc_3 CROSSBOW = new rkc_3();
    private static final /* synthetic */ rkc_3[] $VALUES;

    static {
        $VALUES = rkc_3.id_class();
    }

    public static rkc_3[] values() {
        return (rkc_3[])$VALUES.clone();
    }

    public static rkc_3 valueOf(String string) {
        return Enum.valueOf(rkc_3.class, string);
    }

    private static /* synthetic */ rkc_3[] id_class() {
        return new rkc_3[]{NONE, EAT, DRINK, BLOCK, BOW, SPEAR, CROSSBOW};
    }
}

