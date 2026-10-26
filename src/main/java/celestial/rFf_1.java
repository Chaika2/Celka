/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rFf_1
extends Enum<rFf_1> {
    public static final /* enum */ rFf_1 SET_SIZE = new rFf_1();
    public static final /* enum */ rFf_1 LERP_SIZE = new rFf_1();
    public static final /* enum */ rFf_1 SET_CENTER = new rFf_1();
    public static final /* enum */ rFf_1 INITIALIZE = new rFf_1();
    public static final /* enum */ rFf_1 SET_WARNING_TIME = new rFf_1();
    public static final /* enum */ rFf_1 SET_WARNING_BLOCKS = new rFf_1();
    private static final /* synthetic */ rFf_1[] $VALUES;

    static {
        $VALUES = rFf_1.id_class();
    }

    public static rFf_1[] values() {
        return (rFf_1[])$VALUES.clone();
    }

    public static rFf_1 valueOf(String string) {
        return Enum.valueOf(rFf_1.class, string);
    }

    private static /* synthetic */ rFf_1[] id_class() {
        return new rFf_1[]{SET_SIZE, LERP_SIZE, SET_CENTER, INITIALIZE, SET_WARNING_TIME, SET_WARNING_BLOCKS};
    }
}

