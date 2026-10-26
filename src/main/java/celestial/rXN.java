/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rXN
extends Enum<rXN> {
    public static final /* enum */ rXN HAND = new rXN();
    public static final /* enum */ rXN ARMOR = new rXN();
    private static final /* synthetic */ rXN[] $VALUES;

    static {
        $VALUES = rXN.id_class();
    }

    public static rXN[] values() {
        return (rXN[])$VALUES.clone();
    }

    public static rXN valueOf(String string) {
        return Enum.valueOf(rXN.class, string);
    }

    private static /* synthetic */ rXN[] id_class() {
        return new rXN[]{HAND, ARMOR};
    }
}

