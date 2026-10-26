/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBH;
import celestial.rrBx_1;

public class rrBS
implements rrBH {
    private static final int[] id_class = new int[]{2, 4, 3, 6, 1, 5};
    private static final int[] id_break = new int[]{2, 2, 2, 35, 35, 1};
    private static final int[] id_byte = new int[]{4, 29, 3, 1, 27, 6};
    private static final int[] id_protected = new int[]{4, 3, 5, 1};
    private static final int[] id_throws = new int[]{12, 12, 12, 30};
    private int[] id_case = id_break;

    public rrBS(boolean bl) {
        if (bl) {
            this.id_case = id_class;
        }
    }

    @Override
    public int id_class(rKC rKC2, int n) {
        int n2 = (n & 0xF00) >> 8;
        if (!rrBx_1.id_class(n &= 0xFFFFF0FF) && n != 14) {
            switch (n) {
                case 1: {
                    if (n2 > 0) {
                        return rKC2.id_class(3) == 0 ? 39 : 38;
                    }
                    return this.id_case[rKC2.id_class(this.id_case.length)];
                }
                case 2: {
                    if (n2 > 0) {
                        return 21;
                    }
                    return id_byte[rKC2.id_class(id_byte.length)];
                }
                case 3: {
                    if (n2 > 0) {
                        return 32;
                    }
                    return id_protected[rKC2.id_class(id_protected.length)];
                }
                case 4: {
                    return id_throws[rKC2.id_class(id_throws.length)];
                }
            }
            return 14;
        }
        return n;
    }
}

