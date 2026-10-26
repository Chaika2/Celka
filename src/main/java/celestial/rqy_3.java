/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rqy_3
extends Enum<rqy_3> {
    public static final /* enum */ rqy_3 DAYS = new rqy_3();
    public static final /* enum */ rqy_3 HOURS = new rqy_3();
    public static final /* enum */ rqy_3 MINUTES = new rqy_3();
    public static final /* enum */ rqy_3 SECONDS = new rqy_3();
    public static final rqy_3[] ALL_VALUES;
    private static final /* synthetic */ rqy_3[] $VALUES;

    static {
        $VALUES = rqy_3.id_class();
        ALL_VALUES = rqy_3.values();
    }

    public static rqy_3[] values() {
        return (rqy_3[])$VALUES.clone();
    }

    public static rqy_3 valueOf(String string) {
        return Enum.valueOf(rqy_3.class, string);
    }

    private static /* synthetic */ rqy_3[] id_class() {
        return new rqy_3[]{DAYS, HOURS, MINUTES, SECONDS};
    }
}

