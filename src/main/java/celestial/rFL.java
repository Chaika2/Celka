/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rFL
extends Enum<rFL> {
    public static final /* enum */ rFL ADD = new rFL();
    public static final /* enum */ rFL REMOVE = new rFL();
    public static final /* enum */ rFL UPDATE_PCT = new rFL();
    public static final /* enum */ rFL UPDATE_NAME = new rFL();
    public static final /* enum */ rFL UPDATE_STYLE = new rFL();
    public static final /* enum */ rFL UPDATE_PROPERTIES = new rFL();
    private static final /* synthetic */ rFL[] $VALUES;

    static {
        $VALUES = rFL.id_class();
    }

    public static rFL[] values() {
        return (rFL[])$VALUES.clone();
    }

    public static rFL valueOf(String string) {
        return Enum.valueOf(rFL.class, string);
    }

    private static /* synthetic */ rFL[] id_class() {
        return new rFL[]{ADD, REMOVE, UPDATE_PCT, UPDATE_NAME, UPDATE_STYLE, UPDATE_PROPERTIES};
    }
}

