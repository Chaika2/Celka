/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;

public final class rrMt_1
extends Enum<rrMt_1> {
    public static final /* enum */ rrMt_1 CLEAR = new rrMt_1();
    public static final /* enum */ rrMt_1 RAIN = new rrMt_1();
    public static final /* enum */ rrMt_1 THUNDER = new rrMt_1();
    private static final /* synthetic */ rrMt_1[] $VALUES;

    static {
        $VALUES = rrMt_1.id_class();
    }

    public static rrMt_1[] values() {
        return (rrMt_1[])$VALUES.clone();
    }

    public static rrMt_1 valueOf(String string) {
        return Enum.valueOf(rrMt_1.class, string);
    }

    private static /* synthetic */ rrMt_1[] id_class() {
        return new rrMt_1[]{CLEAR, RAIN, THUNDER};
    }

    public static rrMt_1 id_class(rYB rYB2, float f) {
        float f2 = rYB2.id_case(f);
        if (f2 > 0.5f) {
            return THUNDER;
        }
        float f3 = rYB2.id_private(f);
        return f3 > 0.5f ? RAIN : CLEAR;
    }
}

