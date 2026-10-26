/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBl_1;
import celestial.rrBx_1;

public final class rrBr_1
extends Enum<rrBr_1>
implements rrBl_1 {
    public static final /* enum */ rrBr_1 INSTANCE = new rrBr_1();
    private static final /* synthetic */ rrBr_1[] $VALUES;

    static {
        $VALUES = rrBr_1.id_class();
    }

    public static rrBr_1[] values() {
        return (rrBr_1[])$VALUES.clone();
    }

    public static rrBr_1 valueOf(String string) {
        return Enum.valueOf(rrBr_1.class, string);
    }

    private static /* synthetic */ rrBr_1[] id_class() {
        return new rrBr_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        if (!rrBx_1.id_break(n5) || rrBx_1.id_break(n4) && rrBx_1.id_break(n3) && rrBx_1.id_break(n) && rrBx_1.id_break(n2)) {
            if (!rrBx_1.id_break(n5) && (rrBx_1.id_break(n4) || rrBx_1.id_break(n) || rrBx_1.id_break(n3) || rrBx_1.id_break(n2)) && rKC2.id_class(5) == 0) {
                if (rrBx_1.id_break(n4)) {
                    return n5 == 4 ? 4 : n4;
                }
                if (rrBx_1.id_break(n)) {
                    return n5 == 4 ? 4 : n;
                }
                if (rrBx_1.id_break(n3)) {
                    return n5 == 4 ? 4 : n3;
                }
                if (rrBx_1.id_break(n2)) {
                    return n5 == 4 ? 4 : n2;
                }
            }
            return n5;
        }
        int n6 = 1;
        int n7 = 1;
        if (!rrBx_1.id_break(n4) && rKC2.id_class(n6++) == 0) {
            n7 = n4;
        }
        if (!rrBx_1.id_break(n3) && rKC2.id_class(n6++) == 0) {
            n7 = n3;
        }
        if (!rrBx_1.id_break(n) && rKC2.id_class(n6++) == 0) {
            n7 = n;
        }
        if (!rrBx_1.id_break(n2) && rKC2.id_class(n6++) == 0) {
            n7 = n2;
        }
        if (rKC2.id_class(3) == 0) {
            return n7;
        }
        return n7 == 4 ? 4 : n5;
    }
}

