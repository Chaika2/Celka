/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;

public final class rLo_1
extends Enum<rLo_1> {
    public static final /* enum */ rLo_1 BENEFICIAL = new rLo_1(rgF_2.BLUE);
    public static final /* enum */ rLo_1 HARMFUL = new rLo_1(rgF_2.RED);
    public static final /* enum */ rLo_1 NEUTRAL = new rLo_1(rgF_2.BLUE);
    private final rgF_2 color;
    private static final /* synthetic */ rLo_1[] $VALUES;

    private rLo_1(rgF_2 rgF_22) {
        this.color = rgF_22;
    }

    static {
        $VALUES = rLo_1.id_break();
    }

    public static rLo_1[] values() {
        return (rLo_1[])$VALUES.clone();
    }

    public static rLo_1 valueOf(String string) {
        return Enum.valueOf(rLo_1.class, string);
    }

    public rgF_2 id_class() {
        return this.color;
    }

    private static /* synthetic */ rLo_1[] id_break() {
        return new rLo_1[]{BENEFICIAL, HARMFUL, NEUTRAL};
    }
}

