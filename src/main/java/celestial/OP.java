/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class OP
extends Enum<OP> {
    public static final /* enum */ OP CONSTANT_ALPHA = new OP(32771);
    public static final /* enum */ OP CONSTANT_COLOR = new OP(32769);
    public static final /* enum */ OP DST_ALPHA = new OP(772);
    public static final /* enum */ OP DST_COLOR = new OP(774);
    public static final /* enum */ OP ONE = new OP(1);
    public static final /* enum */ OP ONE_MINUS_CONSTANT_ALPHA = new OP(32772);
    public static final /* enum */ OP ONE_MINUS_CONSTANT_COLOR = new OP(32770);
    public static final /* enum */ OP ONE_MINUS_DST_ALPHA = new OP(773);
    public static final /* enum */ OP ONE_MINUS_DST_COLOR = new OP(775);
    public static final /* enum */ OP ONE_MINUS_SRC_ALPHA = new OP(771);
    public static final /* enum */ OP ONE_MINUS_SRC_COLOR = new OP(769);
    public static final /* enum */ OP SRC_ALPHA = new OP(770);
    public static final /* enum */ OP SRC_ALPHA_SATURATE = new OP(776);
    public static final /* enum */ OP SRC_COLOR = new OP(768);
    public static final /* enum */ OP ZERO = new OP(0);
    public final int param;
    private static final /* synthetic */ OP[] $VALUES;

    private OP(int n2) {
        this.param = n2;
    }

    static {
        $VALUES = OP.id_class();
    }

    public static OP[] values() {
        return (OP[])$VALUES.clone();
    }

    public static OP valueOf(String string) {
        return Enum.valueOf(OP.class, string);
    }

    private static /* synthetic */ OP[] id_class() {
        return new OP[]{CONSTANT_ALPHA, CONSTANT_COLOR, DST_ALPHA, DST_COLOR, ONE, ONE_MINUS_CONSTANT_ALPHA, ONE_MINUS_CONSTANT_COLOR, ONE_MINUS_DST_ALPHA, ONE_MINUS_DST_COLOR, ONE_MINUS_SRC_ALPHA, ONE_MINUS_SRC_COLOR, SRC_ALPHA, SRC_ALPHA_SATURATE, SRC_COLOR, ZERO};
    }
}

