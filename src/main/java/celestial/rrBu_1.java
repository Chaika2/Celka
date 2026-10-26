/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;
import celestial.rrBx_1;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public final class rrBu_1
extends Enum<rrBu_1>
implements rrBp_1 {
    public static final /* enum */ rrBu_1 INSTANCE = new rrBu_1();
    private static final IntSet field_242942_b;
    private static final IntSet field_242943_c;
    private static final /* synthetic */ rrBu_1[] $VALUES;

    private static boolean id_byte(int n) {
        return field_242943_c.contains(n) || n == 4 || n == 5 || rrBx_1.id_class(n);
    }

    static {
        $VALUES = rrBu_1.id_class();
        field_242942_b = new IntOpenHashSet(new int[]{26, 11, 12, 13, 140, 30, 31, 158, 10});
        field_242943_c = new IntOpenHashSet(new int[]{168, 169, 21, 22, 23, 149, 151});
    }

    public static rrBu_1[] values() {
        return (rrBu_1[])$VALUES.clone();
    }

    public static rrBu_1 valueOf(String string) {
        return Enum.valueOf(rrBu_1.class, string);
    }

    private static /* synthetic */ rrBu_1[] id_class() {
        return new rrBu_1[]{INSTANCE};
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        if (n5 == 14) {
            if (rrBx_1.id_break(n) || rrBx_1.id_break(n2) || rrBx_1.id_break(n3) || rrBx_1.id_break(n4)) {
                return 15;
            }
        } else if (field_242943_c.contains(n5)) {
            if (!(rrBu_1.id_byte(n) && rrBu_1.id_byte(n2) && rrBu_1.id_byte(n3) && rrBu_1.id_byte(n4))) {
                return 23;
            }
            if (rrBx_1.id_class(n) || rrBx_1.id_class(n2) || rrBx_1.id_class(n3) || rrBx_1.id_class(n4)) {
                return 16;
            }
        } else if (n5 != 3 && n5 != 34 && n5 != 20) {
            if (field_242942_b.contains(n5)) {
                if (!rrBx_1.id_class(n5) && (rrBx_1.id_class(n) || rrBx_1.id_class(n2) || rrBx_1.id_class(n3) || rrBx_1.id_class(n4))) {
                    return 26;
                }
            } else if (n5 != 37 && n5 != 38) {
                if (!rrBx_1.id_class(n5) && n5 != 7 && n5 != 6 && (rrBx_1.id_class(n) || rrBx_1.id_class(n2) || rrBx_1.id_class(n3) || rrBx_1.id_class(n4))) {
                    return 16;
                }
            } else if (!(rrBx_1.id_class(n) || rrBx_1.id_class(n2) || rrBx_1.id_class(n3) || rrBx_1.id_class(n4) || this.id_protected(n) && this.id_protected(n2) && this.id_protected(n3) && this.id_protected(n4))) {
                return 2;
            }
        } else if (!rrBx_1.id_class(n5) && (rrBx_1.id_class(n) || rrBx_1.id_class(n2) || rrBx_1.id_class(n3) || rrBx_1.id_class(n4))) {
            return 25;
        }
        return n5;
    }

    private boolean id_protected(int n) {
        return n == 37 || n == 38 || n == 39 || n == 165 || n == 166 || n == 167;
    }
}

