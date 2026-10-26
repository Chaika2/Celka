/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rFm_1
extends Enum<rFm_1> {
    public static final /* enum */ rFm_1 TITLE = new rFm_1();
    public static final /* enum */ rFm_1 SUBTITLE = new rFm_1();
    public static final /* enum */ rFm_1 ACTIONBAR = new rFm_1();
    public static final /* enum */ rFm_1 TIMES = new rFm_1();
    public static final /* enum */ rFm_1 CLEAR = new rFm_1();
    public static final /* enum */ rFm_1 RESET = new rFm_1();
    private static final /* synthetic */ rFm_1[] $VALUES;

    static {
        $VALUES = rFm_1.id_class();
    }

    public static rFm_1[] values() {
        return (rFm_1[])$VALUES.clone();
    }

    public static rFm_1 valueOf(String string) {
        return Enum.valueOf(rFm_1.class, string);
    }

    private static /* synthetic */ rFm_1[] id_class() {
        return new rFm_1[]{TITLE, SUBTITLE, ACTIONBAR, TIMES, CLEAR, RESET};
    }
}

