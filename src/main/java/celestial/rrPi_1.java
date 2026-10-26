/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBy_1;

public final class rrPi_1
extends Enum<rrPi_1>
implements rrBy_1 {
    public static final /* enum */ rrPi_1 INSTANCE = new rrPi_1();
    private static final /* synthetic */ rrPi_1[] $VALUES;

    static {
        $VALUES = rrPi_1.id_class();
    }

    public static rrPi_1[] values() {
        return (rrPi_1[])$VALUES.clone();
    }

    public static rrPi_1 valueOf(String string) {
        return Enum.valueOf(rrPi_1.class, string);
    }

    private static /* synthetic */ rrPi_1[] id_class() {
        return new rrPi_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n) {
        return rKC2.id_class(10) == 0 && n == 21 ? 168 : n;
    }
}

