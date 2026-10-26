/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rZN
extends Enum<rZN> {
    public static final /* enum */ rZN SUCCESSFULLY_LOADED = new rZN();
    public static final /* enum */ rZN DECLINED = new rZN();
    public static final /* enum */ rZN FAILED_DOWNLOAD = new rZN();
    public static final /* enum */ rZN ACCEPTED = new rZN();
    private static final /* synthetic */ rZN[] $VALUES;

    static {
        $VALUES = rZN.id_class();
    }

    public static rZN[] values() {
        return (rZN[])$VALUES.clone();
    }

    public static rZN valueOf(String string) {
        return Enum.valueOf(rZN.class, string);
    }

    private static /* synthetic */ rZN[] id_class() {
        return new rZN[]{SUCCESSFULLY_LOADED, DECLINED, FAILED_DOWNLOAD, ACCEPTED};
    }
}

