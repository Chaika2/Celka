/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class Ma_1
extends Enum<Ma_1> {
    public static final /* enum */ Ma_1 AND = new Ma_1(5377);
    public static final /* enum */ Ma_1 AND_INVERTED = new Ma_1(5380);
    public static final /* enum */ Ma_1 AND_REVERSE = new Ma_1(5378);
    public static final /* enum */ Ma_1 CLEAR = new Ma_1(5376);
    public static final /* enum */ Ma_1 COPY = new Ma_1(5379);
    public static final /* enum */ Ma_1 COPY_INVERTED = new Ma_1(5388);
    public static final /* enum */ Ma_1 EQUIV = new Ma_1(5385);
    public static final /* enum */ Ma_1 INVERT = new Ma_1(5386);
    public static final /* enum */ Ma_1 NAND = new Ma_1(5390);
    public static final /* enum */ Ma_1 NOOP = new Ma_1(5381);
    public static final /* enum */ Ma_1 NOR = new Ma_1(5384);
    public static final /* enum */ Ma_1 OR = new Ma_1(5383);
    public static final /* enum */ Ma_1 OR_INVERTED = new Ma_1(5389);
    public static final /* enum */ Ma_1 OR_REVERSE = new Ma_1(5387);
    public static final /* enum */ Ma_1 SET = new Ma_1(5391);
    public static final /* enum */ Ma_1 XOR = new Ma_1(5382);
    public final int opcode;
    private static final /* synthetic */ Ma_1[] $VALUES;

    private Ma_1(int n2) {
        this.opcode = n2;
    }

    static {
        $VALUES = Ma_1.id_class();
    }

    public static Ma_1[] values() {
        return (Ma_1[])$VALUES.clone();
    }

    public static Ma_1 valueOf(String string) {
        return Enum.valueOf(Ma_1.class, string);
    }

    private static /* synthetic */ Ma_1[] id_class() {
        return new Ma_1[]{AND, AND_INVERTED, AND_REVERSE, CLEAR, COPY, COPY_INVERTED, EQUIV, INVERT, NAND, NOOP, NOR, OR, OR_INVERTED, OR_REVERSE, SET, XOR};
    }
}

