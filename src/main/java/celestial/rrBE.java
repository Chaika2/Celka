/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKC;
import celestial.rrBp_1;
import celestial.rrBx_1;

public final class rrBE
extends Enum<rrBE>
implements rrBp_1 {
    public static final /* enum */ rrBE INSTANCE = new rrBE();
    private static final /* synthetic */ rrBE[] $VALUES;

    static {
        $VALUES = rrBE.id_class();
    }

    public static rrBE[] values() {
        return (rrBE[])$VALUES.clone();
    }

    public static rrBE valueOf(String string) {
        return Enum.valueOf(rrBE.class, string);
    }

    private boolean id_class(int[] nArray, int n) {
        if (!rrBx_1.id_class(n, 3)) {
            return false;
        }
        nArray[0] = n;
        return true;
    }

    private static /* synthetic */ rrBE[] id_class() {
        return new rrBE[]{INSTANCE};
    }

    private boolean id_class(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 != n6) {
            return false;
        }
        nArray[0] = rrBx_1.id_class(n, n6) && rrBx_1.id_class(n2, n6) && rrBx_1.id_class(n4, n6) && rrBx_1.id_class(n3, n6) ? n5 : n7;
        return true;
    }

    @Override
    public int id_class(rKC rKC2, int n, int n2, int n3, int n4, int n5) {
        int[] nArray = new int[1];
        if (!(this.id_class(nArray, n5) || this.id_class(nArray, n, n2, n3, n4, n5, 38, 37) || this.id_class(nArray, n, n2, n3, n4, n5, 39, 37) || this.id_class(nArray, n, n2, n3, n4, n5, 32, 5))) {
            if (n5 != 2 || n != 12 && n2 != 12 && n4 != 12 && n3 != 12) {
                if (n5 == 6) {
                    if (n == 2 || n2 == 2 || n4 == 2 || n3 == 2 || n == 30 || n2 == 30 || n4 == 30 || n3 == 30 || n == 12 || n2 == 12 || n4 == 12 || n3 == 12) {
                        return 1;
                    }
                    if (n == 21 || n3 == 21 || n2 == 21 || n4 == 21 || n == 168 || n3 == 168 || n2 == 168 || n4 == 168) {
                        return 23;
                    }
                }
                return n5;
            }
            return 34;
        }
        return nArray[0];
    }
}

