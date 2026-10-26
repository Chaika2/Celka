/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rKy_1;
import celestial.rrBA;

public final class rrBz_1
extends Enum<rrBz_1>
implements rrBA {
    public static final /* enum */ rrBz_1 INSTANCE = new rrBz_1();
    private static final /* synthetic */ rrBz_1[] $VALUES;

    static {
        $VALUES = rrBz_1.id_class();
    }

    public static rrBz_1[] values() {
        return (rrBz_1[])$VALUES.clone();
    }

    public static rrBz_1 valueOf(String string) {
        return Enum.valueOf(rrBz_1.class, string);
    }

    private static /* synthetic */ rrBz_1[] id_class() {
        return new rrBz_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2) {
        rKy_1 rKy_12 = rKC2.id_class();
        double d = rKy_12.id_class((double)n / 8.0, (double)n2 / 8.0, 0.0, 0.0, 0.0);
        if (d > 0.4) {
            return 44;
        }
        if (d > 0.2) {
            return 45;
        }
        if (d < -0.4) {
            return 10;
        }
        return d < -0.2 ? 46 : 0;
    }
}

