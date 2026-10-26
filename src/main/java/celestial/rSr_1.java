/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rSr_1
extends Enum<rSr_1> {
    public static final /* enum */ rSr_1 UNCHARGED = new rSr_1();
    public static final /* enum */ rSr_1 CHARGING = new rSr_1();
    public static final /* enum */ rSr_1 CHARGED = new rSr_1();
    public static final /* enum */ rSr_1 READY_TO_ATTACK = new rSr_1();
    private static final /* synthetic */ rSr_1[] $VALUES;

    static {
        $VALUES = rSr_1.id_class();
    }

    public static rSr_1[] values() {
        return (rSr_1[])$VALUES.clone();
    }

    public static rSr_1 valueOf(String string) {
        return Enum.valueOf(rSr_1.class, string);
    }

    private static /* synthetic */ rSr_1[] id_class() {
        return new rSr_1[]{UNCHARGED, CHARGING, CHARGED, READY_TO_ATTACK};
    }
}

