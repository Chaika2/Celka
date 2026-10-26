/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rPx_1
extends Enum<rPx_1> {
    public static final /* enum */ rPx_1 UNCHARGED = new rPx_1();
    public static final /* enum */ rPx_1 CHARGING = new rPx_1();
    public static final /* enum */ rPx_1 CHARGED = new rPx_1();
    public static final /* enum */ rPx_1 READY_TO_ATTACK = new rPx_1();
    private static final /* synthetic */ rPx_1[] $VALUES;

    static {
        $VALUES = rPx_1.id_class();
    }

    public static rPx_1[] values() {
        return (rPx_1[])$VALUES.clone();
    }

    public static rPx_1 valueOf(String string) {
        return Enum.valueOf(rPx_1.class, string);
    }

    private static /* synthetic */ rPx_1[] id_class() {
        return new rPx_1[]{UNCHARGED, CHARGING, CHARGED, READY_TO_ATTACK};
    }
}

