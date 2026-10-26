/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rmQ_2
extends Enum<rmQ_2> {
    public static final /* enum */ rmQ_2 HELLO = new rmQ_2();
    public static final /* enum */ rmQ_2 KEY = new rmQ_2();
    public static final /* enum */ rmQ_2 AUTHENTICATING = new rmQ_2();
    public static final /* enum */ rmQ_2 NEGOTIATING = new rmQ_2();
    public static final /* enum */ rmQ_2 READY_TO_ACCEPT = new rmQ_2();
    public static final /* enum */ rmQ_2 DELAY_ACCEPT = new rmQ_2();
    public static final /* enum */ rmQ_2 ACCEPTED = new rmQ_2();
    private static final /* synthetic */ rmQ_2[] $VALUES;

    static {
        $VALUES = rmQ_2.id_class();
    }

    public static rmQ_2[] values() {
        return (rmQ_2[])$VALUES.clone();
    }

    public static rmQ_2 valueOf(String string) {
        return Enum.valueOf(rmQ_2.class, string);
    }

    private static /* synthetic */ rmQ_2[] id_class() {
        return new rmQ_2[]{HELLO, KEY, AUTHENTICATING, NEGOTIATING, READY_TO_ACCEPT, DELAY_ACCEPT, ACCEPTED};
    }
}

