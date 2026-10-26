/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;
import celestial.rrBx_1;

public final class rrBs_1
extends Enum<rrBs_1>
implements rrBp_1 {
    public static final /* enum */ rrBs_1 INSTANCE = new rrBs_1();
    private static final /* synthetic */ rrBs_1[] $VALUES;

    static {
        $VALUES = rrBs_1.id_class();
    }

    public static rrBs_1[] values() {
        return (rrBs_1[])$VALUES.clone();
    }

    public static rrBs_1 valueOf(String string) {
        return Enum.valueOf(rrBs_1.class, string);
    }

    private static /* synthetic */ rrBs_1[] id_class() {
        return new rrBs_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        if (rrBx_1.id_break(n5)) {
            int n6 = 0;
            if (rrBx_1.id_break(n)) {
                ++n6;
            }
            if (rrBx_1.id_break(n2)) {
                ++n6;
            }
            if (rrBx_1.id_break(n4)) {
                ++n6;
            }
            if (rrBx_1.id_break(n3)) {
                ++n6;
            }
            if (n6 > 3) {
                if (n5 == 44) {
                    return 47;
                }
                if (n5 == 45) {
                    return 48;
                }
                if (n5 == 0) {
                    return 24;
                }
                if (n5 == 46) {
                    return 49;
                }
                if (n5 == 10) {
                    return 50;
                }
                return 24;
            }
        }
        return n5;
    }
}

