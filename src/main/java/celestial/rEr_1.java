/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class rEr_1
extends Enum<rEr_1> {
    public static final /* enum */ rEr_1 CROSSED = new rEr_1();
    public static final /* enum */ rEr_1 ATTACKING = new rEr_1();
    public static final /* enum */ rEr_1 SPELLCASTING = new rEr_1();
    public static final /* enum */ rEr_1 BOW_AND_ARROW = new rEr_1();
    public static final /* enum */ rEr_1 CROSSBOW_HOLD = new rEr_1();
    public static final /* enum */ rEr_1 CROSSBOW_CHARGE = new rEr_1();
    public static final /* enum */ rEr_1 CELEBRATING = new rEr_1();
    public static final /* enum */ rEr_1 NEUTRAL = new rEr_1();
    private static final /* synthetic */ rEr_1[] $VALUES;

    static {
        $VALUES = rEr_1.id_class();
    }

    public static rEr_1[] values() {
        return (rEr_1[])$VALUES.clone();
    }

    public static rEr_1 valueOf(String string) {
        return Enum.valueOf(rEr_1.class, string);
    }

    private static /* synthetic */ rEr_1[] id_class() {
        return new rEr_1[]{CROSSED, ATTACKING, SPELLCASTING, BOW_AND_ARROW, CROSSBOW_HOLD, CROSSBOW_CHARGE, CELEBRATING, NEUTRAL};
    }
}

