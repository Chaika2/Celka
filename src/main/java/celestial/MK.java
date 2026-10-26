/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class MK
extends Enum<MK> {
    public static final /* enum */ MK CONSTANT_ALPHA = new MK(32771);
    public static final /* enum */ MK CONSTANT_COLOR = new MK(32769);
    public static final /* enum */ MK DST_ALPHA = new MK(772);
    public static final /* enum */ MK DST_COLOR = new MK(774);
    public static final /* enum */ MK ONE = new MK(1);
    public static final /* enum */ MK ONE_MINUS_CONSTANT_ALPHA = new MK(32772);
    public static final /* enum */ MK ONE_MINUS_CONSTANT_COLOR = new MK(32770);
    public static final /* enum */ MK ONE_MINUS_DST_ALPHA = new MK(773);
    public static final /* enum */ MK ONE_MINUS_DST_COLOR = new MK(775);
    public static final /* enum */ MK ONE_MINUS_SRC_ALPHA = new MK(771);
    public static final /* enum */ MK ONE_MINUS_SRC_COLOR = new MK(769);
    public static final /* enum */ MK SRC_ALPHA = new MK(770);
    public static final /* enum */ MK SRC_COLOR = new MK(768);
    public static final /* enum */ MK ZERO = new MK(0);
    public final int param;
    private static final /* synthetic */ MK[] $VALUES;

    private MK(int n2) {
        this.param = n2;
    }

    static {
        $VALUES = MK.id_class();
    }

    public static MK[] values() {
        return (MK[])$VALUES.clone();
    }

    public static MK valueOf(String string) {
        return Enum.valueOf(MK.class, string);
    }

    private static /* synthetic */ MK[] id_class() {
        return new MK[]{CONSTANT_ALPHA, CONSTANT_COLOR, DST_ALPHA, DST_COLOR, ONE, ONE_MINUS_CONSTANT_ALPHA, ONE_MINUS_CONSTANT_COLOR, ONE_MINUS_DST_ALPHA, ONE_MINUS_DST_COLOR, ONE_MINUS_SRC_ALPHA, ONE_MINUS_SRC_COLOR, SRC_ALPHA, SRC_COLOR, ZERO};
    }
}

