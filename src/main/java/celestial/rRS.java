/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rRS
extends Enum<rRS> {
    public static final /* enum */ rRS SIEGE_CAN_ACTIVATE = new rRS();
    public static final /* enum */ rRS SIEGE_TONIGHT = new rRS();
    public static final /* enum */ rRS SIEGE_DONE = new rRS();
    private static final /* synthetic */ rRS[] $VALUES;

    static {
        $VALUES = rRS.id_class();
    }

    public static rRS[] values() {
        return (rRS[])$VALUES.clone();
    }

    public static rRS valueOf(String string) {
        return Enum.valueOf(rRS.class, string);
    }

    private static /* synthetic */ rRS[] id_class() {
        return new rRS[]{SIEGE_CAN_ACTIVATE, SIEGE_TONIGHT, SIEGE_DONE};
    }
}

