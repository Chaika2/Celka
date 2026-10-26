/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rKj_1;
import celestial.rrBC;
import celestial.rrBq_1;
import celestial.rrBx_1;

public final class rrBk_1
extends Enum<rrBk_1>
implements rrBC,
rrBq_1 {
    public static final /* enum */ rrBk_1 INSTANCE = new rrBk_1();
    private static final /* synthetic */ rrBk_1[] $VALUES;

    static {
        $VALUES = rrBk_1.id_class();
    }

    public static rrBk_1[] values() {
        return (rrBk_1[])$VALUES.clone();
    }

    public static rrBk_1 valueOf(String string) {
        return Enum.valueOf(rrBk_1.class, string);
    }

    private static /* synthetic */ rrBk_1[] id_class() {
        return new rrBk_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, rKj_1 rKj_12, rKj_1 rKj_13, int n, int n2) {
        int n3 = rKj_12.id_class(this.id_class(n), this.id_break(n2));
        int n4 = rKj_13.id_class(this.id_class(n), this.id_break(n2));
        if (!rrBx_1.id_class(n3)) {
            return n3;
        }
        int n5 = 8;
        int n6 = 4;
        for (int i = -8; i <= 8; i += 4) {
            for (int j = -8; j <= 8; j += 4) {
                int n7 = rKj_12.id_class(this.id_class(n + i), this.id_break(n2 + j));
                if (rrBx_1.id_class(n7)) continue;
                if (n4 == 44) {
                    return 45;
                }
                if (n4 != 10) continue;
                return 46;
            }
        }
        if (n3 == 24) {
            if (n4 == 45) {
                return 48;
            }
            if (n4 == 0) {
                return 24;
            }
            if (n4 == 46) {
                return 49;
            }
            if (n4 == 10) {
                return 50;
            }
        }
        return n4;
    }
}

