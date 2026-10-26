/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fj_3;
import celestial.rYG;
import celestial.rrMk_1;
import celestial.rrMn_1;
import celestial.xc_3;

public class rrMl_1 {
    public static boolean id_class(int n, int[] nArray) {
        if (nArray == null) {
            return true;
        }
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(fj_3 fj_32, fj_3[] fj_3Array) {
        if (fj_3Array == null) {
            return true;
        }
        for (int i = 0; i < fj_3Array.length; ++i) {
            if (fj_3Array[i] != fj_32) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(rYG rYG2, rrMk_1[] rrMk_1Array) {
        if (rrMk_1Array == null) {
            return true;
        }
        for (int i = 0; i < rrMk_1Array.length; ++i) {
            rrMk_1 rrMk_12 = rrMk_1Array[i];
            if (rrMk_12 == null || rrMk_12.id_class() != rYG2) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(int n, rrMn_1[] rrMn_1Array) {
        if (rrMn_1Array == null) {
            return true;
        }
        for (int i = 0; i < rrMn_1Array.length; ++i) {
            rrMn_1 rrMn_12 = rrMn_1Array[i];
            if (rrMn_12.id_class() != n) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(int n, int n2, rrMn_1[] rrMn_1Array) {
        if (rrMn_1Array == null) {
            return true;
        }
        for (int i = 0; i < rrMn_1Array.length; ++i) {
            rrMn_1 rrMn_12 = rrMn_1Array[i];
            if (!rrMn_12.id_class(n, n2)) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(xc_3 xc_32, rrMn_1[] rrMn_1Array) {
        if (rrMn_1Array == null) {
            return true;
        }
        for (int i = 0; i < rrMn_1Array.length; ++i) {
            rrMn_1 rrMn_12 = rrMn_1Array[i];
            if (!rrMn_12.id_class(xc_32)) continue;
            return true;
        }
        return false;
    }
}

