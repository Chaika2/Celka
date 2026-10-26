/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rrkU
extends Enum<rrkU> {
    public static final /* enum */ rrkU BYTE = new rrkU(5120);
    public static final /* enum */ rrkU SHORT = new rrkU(5122);
    public static final /* enum */ rrkU INT = new rrkU(5124);
    public static final /* enum */ rrkU HALF_FLOAT = new rrkU(5131);
    public static final /* enum */ rrkU FLOAT = new rrkU(5126);
    public static final /* enum */ rrkU UNSIGNED_BYTE = new rrkU(5121);
    public static final /* enum */ rrkU UNSIGNED_BYTE_3_3_2 = new rrkU(32818);
    public static final /* enum */ rrkU UNSIGNED_BYTE_2_3_3_REV = new rrkU(33634);
    public static final /* enum */ rrkU UNSIGNED_SHORT = new rrkU(5123);
    public static final /* enum */ rrkU UNSIGNED_SHORT_5_6_5 = new rrkU(33635);
    public static final /* enum */ rrkU UNSIGNED_SHORT_5_6_5_REV = new rrkU(33636);
    public static final /* enum */ rrkU UNSIGNED_SHORT_4_4_4_4 = new rrkU(32819);
    public static final /* enum */ rrkU UNSIGNED_SHORT_4_4_4_4_REV = new rrkU(33637);
    public static final /* enum */ rrkU UNSIGNED_SHORT_5_5_5_1 = new rrkU(32820);
    public static final /* enum */ rrkU UNSIGNED_SHORT_1_5_5_5_REV = new rrkU(33638);
    public static final /* enum */ rrkU UNSIGNED_INT = new rrkU(5125);
    public static final /* enum */ rrkU UNSIGNED_INT_8_8_8_8 = new rrkU(32821);
    public static final /* enum */ rrkU UNSIGNED_INT_8_8_8_8_REV = new rrkU(33639);
    public static final /* enum */ rrkU UNSIGNED_INT_10_10_10_2 = new rrkU(32822);
    public static final /* enum */ rrkU UNSIGNED_INT_2_10_10_10_REV = new rrkU(33640);
    private int id;
    private static final /* synthetic */ rrkU[] $VALUES;

    private rrkU(int n2) {
        this.id = n2;
    }

    static {
        $VALUES = rrkU.id_break();
    }

    public static rrkU[] values() {
        return (rrkU[])$VALUES.clone();
    }

    public static rrkU valueOf(String string) {
        return Enum.valueOf(rrkU.class, string);
    }

    public int id_class() {
        return this.id;
    }

    private static /* synthetic */ rrkU[] id_break() {
        return new rrkU[]{BYTE, SHORT, INT, HALF_FLOAT, FLOAT, UNSIGNED_BYTE, UNSIGNED_BYTE_3_3_2, UNSIGNED_BYTE_2_3_3_REV, UNSIGNED_SHORT, UNSIGNED_SHORT_5_6_5, UNSIGNED_SHORT_5_6_5_REV, UNSIGNED_SHORT_4_4_4_4, UNSIGNED_SHORT_4_4_4_4_REV, UNSIGNED_SHORT_5_5_5_1, UNSIGNED_SHORT_1_5_5_5_REV, UNSIGNED_INT, UNSIGNED_INT_8_8_8_8, UNSIGNED_INT_8_8_8_8_REV, UNSIGNED_INT_10_10_10_2, UNSIGNED_INT_2_10_10_10_REV};
    }
}

