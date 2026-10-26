/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rZu_1
extends Enum<rZu_1> {
    public static final /* enum */ rZu_1 OPENED_TAB = new rZu_1();
    public static final /* enum */ rZu_1 CLOSED_SCREEN = new rZu_1();
    private static final /* synthetic */ rZu_1[] $VALUES;

    static {
        $VALUES = rZu_1.id_class();
    }

    public static rZu_1[] values() {
        return (rZu_1[])$VALUES.clone();
    }

    public static rZu_1 valueOf(String string) {
        return Enum.valueOf(rZu_1.class, string);
    }

    private static /* synthetic */ rZu_1[] id_class() {
        return new rZu_1[]{OPENED_TAB, CLOSED_SCREEN};
    }
}

