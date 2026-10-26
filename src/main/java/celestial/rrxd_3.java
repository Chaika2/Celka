/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rja_3;
import celestial.roJ_2;
import celestial.roQ_2;
import celestial.rpr_3;
import celestial.rrbb_3;
import celestial.ryI_2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class rrxd_3 {
    public static final int id_class = 63;
    public static final rpr_3[][] id_break = rrxd_3.id_class(false);
    public static final rpr_3[][] id_byte = rrxd_3.id_class(true);
    private static int id_protected = 0;
    private static int id_throws = -1;
    private static int id_case = 16;
    private static rYB id_catch = null;
    private static int id_private = Integer.MIN_VALUE;
    private static int id_implements = Integer.MIN_VALUE;

    private static rpr_3[][] id_class(boolean bl) {
        int n = 64;
        rpr_3[][] rpr_3Array = new rpr_3[n][];
        for (int i = 0; i < n; ++i) {
            ArrayList<rpr_3> arrayList = new ArrayList<rpr_3>();
            for (int j = 0; j < rpr_3.VALUES.length; ++j) {
                rpr_3 rpr_32 = rpr_3.VALUES[j];
                rpr_3 rpr_33 = bl ? rpr_32.id_case() : rpr_32;
                int n2 = 1 << rpr_33.ordinal();
                if ((i & n2) == 0) continue;
                arrayList.add(rpr_32);
            }
            rpr_3[] rpr_3Array2 = arrayList.toArray(new rpr_3[arrayList.size()]);
            rpr_3Array[i] = rpr_3Array2;
        }
        return rpr_3Array;
    }

    public static rpr_3[] id_class(int n) {
        int n2 = ~n & 0x3F;
        return id_byte[n2];
    }

    public static int id_class(rYB rYB2, an_3 an_32, int n) {
        int n2 = rfU_2.id_byte(an_32.rx()) >> 4;
        int n3 = rfU_2.id_byte(an_32.re()) >> 4;
        int n4 = rfU_2.id_byte(an_32.BO()) >> 4;
        n3 = rrbb_3.id_class(n3, 0, 15);
        roJ_2 roJ_22 = rYB2.id_throws(n2, n4);
        int n5 = n2 - n;
        int n6 = n2 + n;
        int n7 = n4 - n;
        int n8 = n4 + n;
        if (rYB2 != id_catch || n2 != id_private || n4 != id_implements) {
            id_protected = 0;
            id_case = 16;
            id_catch = rYB2;
            id_private = n2;
            id_implements = n4;
        }
        if (id_protected == 0) {
            id_throws = -1;
        }
        int n9 = id_throws;
        switch (id_protected) {
            case 0: {
                n6 = n2;
                n8 = n4;
                break;
            }
            case 1: {
                n5 = n2;
                n8 = n4;
                break;
            }
            case 2: {
                n6 = n2;
                n7 = n4;
                break;
            }
            case 3: {
                n5 = n2;
                n7 = n4;
            }
        }
        for (int i = n5; i < n6; ++i) {
            block9: for (int j = n7; j < n8; ++j) {
                ryI_2<an_3>[] ryI_2Array;
                roJ_2 roJ_23 = rYB2.id_throws(i, j);
                if (roJ_23.id_catch()) continue;
                roQ_2[] roQ_2Array = roJ_23.id_byte();
                for (int k = roQ_2Array.length - 1; k > n9; --k) {
                    roQ_2 roQ_22 = roQ_2Array[k];
                    if (roQ_22 == null || roQ_22.id_byte()) continue;
                    if (k <= n9) break;
                    n9 = k;
                    break;
                }
                try {
                    ryI_2Array = roJ_23.id_volatile();
                    if (!ryI_2Array.isEmpty()) {
                        for (ryI_2<an_3> ryI_22 : ryI_2Array.keySet()) {
                            int n10 = ((rja_3)((Object)ryI_22)).c_() >> 4;
                            if (n10 <= n9) continue;
                            n9 = n10;
                        }
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    // empty catch block
                }
                ryI_2Array = roJ_23.id_final();
                for (int k = ryI_2Array.length - 1; k > n9; --k) {
                    ryI_2<an_3> ryI_22;
                    ryI_22 = ryI_2Array[k];
                    if (ryI_22.isEmpty() || roJ_23 == roJ_22 && k == n3 && ryI_22.size() == 1) continue;
                    if (k <= n9) continue block9;
                    n9 = k;
                    continue block9;
                }
            }
        }
        if (id_protected < 3) {
            id_throws = n9;
            n9 = id_case;
        } else {
            id_case = n9;
            id_throws = -1;
        }
        id_protected = (id_protected + 1) % 4;
        return n9 << 4;
    }

    public static boolean id_class() {
        return id_protected == 0;
    }

    public static void id_break() {
        id_catch = null;
    }
}

