/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fj_3;
import celestial.rrbM_2;
import celestial.rrbO_2;
import celestial.rrbx_3;
import celestial.rrxF_2;
import celestial.wK_2;
import java.util.IdentityHashMap;
import java.util.Map;

public class rrbX_2 {
    private static final int id_class = 0;
    private static final int id_break = 1;
    private static final int id_byte = 2;
    private static final int id_protected = 3;
    private static final int id_throws = 4;

    private static wK_2 id_class(fj_3 fj_32, rrbx_3 rrbx_32, int n, wK_2 wK_22, rrxF_2 rrxF_22) {
        switch (rrbx_32) {
            case UP: {
                return rrbX_2.id_class(fj_32, rrbx_32, 0, 0, 16, 8, n, wK_22, rrxF_22);
            }
            case UP_RIGHT: {
                return rrbX_2.id_class(fj_32, rrbx_32, 8, 0, 16, 8, n, wK_22, rrxF_22);
            }
            case RIGHT: {
                return rrbX_2.id_class(fj_32, rrbx_32, 8, 0, 16, 16, n, wK_22, rrxF_22);
            }
            case DOWN_RIGHT: {
                return rrbX_2.id_class(fj_32, rrbx_32, 8, 8, 16, 16, n, wK_22, rrxF_22);
            }
            case DOWN: {
                return rrbX_2.id_class(fj_32, rrbx_32, 0, 8, 16, 16, n, wK_22, rrxF_22);
            }
            case DOWN_LEFT: {
                return rrbX_2.id_class(fj_32, rrbx_32, 0, 8, 8, 16, n, wK_22, rrxF_22);
            }
            case LEFT: {
                return rrbX_2.id_class(fj_32, rrbx_32, 0, 0, 8, 16, n, wK_22, rrxF_22);
            }
            case UP_LEFT: {
                return rrbX_2.id_class(fj_32, rrbx_32, 0, 0, 8, 8, n, wK_22, rrxF_22);
            }
        }
        return wK_22;
    }

    private static wK_2[] id_class(rrbx_3 rrbx_32, int n, rrbx_3 rrbx_33, int n2, rrbx_3 rrbx_34, int n3, rrbx_3 rrbx_35, int n4, fj_3[] fj_3Array, int n5, wK_2 wK_22, rrxF_2 rrxF_22) {
        wK_2 wK_23 = rrbX_2.id_class(fj_3Array[n], rrbx_32, n5, wK_22, rrxF_22);
        wK_2 wK_24 = rrbX_2.id_class(fj_3Array[n2], rrbx_33, n5, wK_22, rrxF_22);
        wK_2 wK_25 = rrbX_2.id_class(fj_3Array[n3], rrbx_34, n5, wK_22, rrxF_22);
        wK_2 wK_26 = rrbX_2.id_class(fj_3Array[n4], rrbx_35, n5, wK_22, rrxF_22);
        return rrxF_22.id_class(wK_23, wK_24, wK_25, wK_26);
    }

    private static wK_2[] id_class(rrbx_3 rrbx_32, int n, rrbx_3 rrbx_33, int n2, rrbx_3 rrbx_34, int n3, fj_3[] fj_3Array, int n4, wK_2 wK_22, rrxF_2 rrxF_22) {
        wK_2 wK_23 = rrbX_2.id_class(fj_3Array[n], rrbx_32, n4, wK_22, rrxF_22);
        wK_2 wK_24 = rrbX_2.id_class(fj_3Array[n2], rrbx_33, n4, wK_22, rrxF_22);
        wK_2 wK_25 = rrbX_2.id_class(fj_3Array[n3], rrbx_34, n4, wK_22, rrxF_22);
        return rrxF_22.id_class(wK_23, wK_24, wK_25);
    }

    private static wK_2 id_class(fj_3 fj_32, rrbx_3 rrbx_32, int n, int n2, int n3, int n4, int n5, wK_2 wK_22, rrxF_2 rrxF_22) {
        Map[][] mapArray = rrbO_2.id_class();
        if (mapArray == null) {
            return wK_22;
        }
        int n6 = fj_32.id_new();
        if (n6 >= 0 && n6 < mapArray.length) {
            wK_2 wK_23;
            IdentityHashMap<wK_2, wK_2> identityHashMap;
            Map[] mapArray2 = mapArray[n6];
            if (mapArray2 == null) {
                mapArray2 = new Map[rrbx_3.VALUES.length];
                mapArray[n6] = mapArray2;
            }
            if ((identityHashMap = mapArray2[rrbx_32.ordinal()]) == null) {
                mapArray2[rrbx_32.ordinal()] = identityHashMap = new IdentityHashMap<wK_2, wK_2>(1);
            }
            if ((wK_23 = (wK_2)identityHashMap.get(wK_22)) == null) {
                wK_23 = rrbX_2.id_class(wK_22, fj_32, n5, n, n2, n3, n4);
                identityHashMap.put(wK_22, wK_23);
            }
            return wK_23;
        }
        return wK_22;
    }

    private static wK_2 id_class(wK_2 wK_22, fj_3 fj_32, int n, int n2, int n3, int n4, int n5) {
        int[] nArray = (int[])wK_22.id_class().clone();
        fj_3 fj_33 = wK_22.id_case();
        for (int i = 0; i < 4; ++i) {
            rrbX_2.id_class(nArray, i, fj_33, fj_32, n, n2, n3, n4, n5);
        }
        return new wK_2(nArray, wK_22.id_byte(), wK_22.id_protected(), fj_32, wK_22.id_throws());
    }

    private static void id_class(int[] nArray, int n, fj_3 fj_32, fj_3 fj_33, int n2, int n3, int n4, int n5, int n6) {
        float f;
        float f2;
        int n7 = nArray.length / 4;
        int n8 = n7 * n;
        float f3 = Float.intBitsToFloat(nArray[n8 + 4]);
        float f4 = Float.intBitsToFloat(nArray[n8 + 4 + 1]);
        double d = fj_32.id_class(f3);
        double d2 = fj_32.id_break(f4);
        float f5 = Float.intBitsToFloat(nArray[n8 + 0]);
        float f6 = Float.intBitsToFloat(nArray[n8 + 1]);
        float f7 = Float.intBitsToFloat(nArray[n8 + 2]);
        switch (n2) {
            case 0: {
                f2 = f5;
                f = 1.0f - f7;
                break;
            }
            case 1: {
                f2 = f5;
                f = f7;
                break;
            }
            case 2: {
                f2 = 1.0f - f5;
                f = 1.0f - f6;
                break;
            }
            case 3: {
                f2 = f5;
                f = 1.0f - f6;
                break;
            }
            case 4: {
                f2 = f7;
                f = 1.0f - f6;
                break;
            }
            case 5: {
                f2 = 1.0f - f7;
                f = 1.0f - f6;
                break;
            }
            default: {
                return;
            }
        }
        float f8 = (float)fj_32.id_protected() / (fj_32.id_catch() - fj_32.id_case());
        float f9 = (float)fj_32.id_throws() / (fj_32.id_implements() - fj_32.id_private());
        float f10 = 4.0f / Math.max(f9, f8);
        float f11 = 16.0f * (1.0f - f10);
        float f12 = 16.0f * (1.0f - f10);
        if (d < (double)n3) {
            f2 = (float)((double)f2 + ((double)n3 - d) / (double)f11);
            d = n3;
        }
        if (d > (double)n5) {
            f2 = (float)((double)f2 - (d - (double)n5) / (double)f11);
            d = n5;
        }
        if (d2 < (double)n4) {
            f = (float)((double)f + ((double)n4 - d2) / (double)f12);
            d2 = n4;
        }
        if (d2 > (double)n6) {
            f = (float)((double)f - (d2 - (double)n6) / (double)f12);
            d2 = n6;
        }
        switch (n2) {
            case 0: {
                f5 = f2;
                f7 = 1.0f - f;
                break;
            }
            case 1: {
                f5 = f2;
                f7 = f;
                break;
            }
            case 2: {
                f5 = 1.0f - f2;
                f6 = 1.0f - f;
                break;
            }
            case 3: {
                f5 = f2;
                f6 = 1.0f - f;
                break;
            }
            case 4: {
                f7 = f2;
                f6 = 1.0f - f;
                break;
            }
            case 5: {
                f7 = 1.0f - f2;
                f6 = 1.0f - f;
                break;
            }
            default: {
                return;
            }
        }
        nArray[n8 + 4] = Float.floatToRawIntBits(fj_33.id_class(d));
        nArray[n8 + 4 + 1] = Float.floatToRawIntBits(fj_33.id_break(d2));
        nArray[n8 + 0] = Float.floatToRawIntBits(f5);
        nArray[n8 + 1] = Float.floatToRawIntBits(f6);
        nArray[n8 + 2] = Float.floatToRawIntBits(f7);
    }

    private static wK_2[] id_class(int n, int n2, fj_3[] fj_3Array, int n3, wK_2 wK_22, rrxF_2 rrxF_22) {
        return rrbX_2.id_class(rrbx_3.LEFT, n, rrbx_3.RIGHT, n2, fj_3Array, n3, wK_22, rrxF_22);
    }

    public static wK_2[] id_class(int n, rrbM_2 rrbM_22, int n2, wK_2 wK_22, rrxF_2 rrxF_22) {
        int n3;
        if (rrbM_22.id_final != null && n >= 0 && n < rrbM_22.id_final.length && (n3 = rrbM_22.id_final[n]) >= 0 && n3 <= rrbM_22.id_goto.length) {
            return rrbX_2.id_class(n3, rrbM_22.id_goto, wK_22, rrxF_22);
        }
        switch (n) {
            case 1: {
                return rrbX_2.id_class(0, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 2: {
                return rrbX_2.id_class(3, rrbM_22.id_goto, wK_22, rrxF_22);
            }
            case 3: {
                return rrbX_2.id_class(3, 0, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 4: {
                return rrbX_2.id_class(0, 3, 2, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 5: {
                return rrbX_2.id_class(3, 0, 4, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 6: {
                return rrbX_2.id_class(2, 4, 2, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 7: {
                return rrbX_2.id_class(3, 3, 4, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 8: {
                return rrbX_2.id_class(4, 1, 4, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 9: {
                return rrbX_2.id_class(4, 4, 4, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 10: {
                return rrbX_2.id_class(1, 4, 1, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 11: {
                return rrbX_2.id_class(1, 1, 4, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 12: {
                return rrbX_2.id_break(0, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 13: {
                return rrbX_2.id_class(0, 3, 2, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 14: {
                return rrbX_2.id_break(3, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 15: {
                return rrbX_2.id_class(3, 0, 1, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 16: {
                return rrbX_2.id_class(2, 4, 0, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 17: {
                return rrbX_2.id_class(4, 2, 3, 0, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 18: {
                return rrbX_2.id_class(4, 4, 3, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 19: {
                return rrbX_2.id_class(4, 2, 4, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 20: {
                return rrbX_2.id_class(1, 4, 4, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 21: {
                return rrbX_2.id_class(4, 4, 1, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 22: {
                return rrbX_2.id_class(4, 4, 1, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 23: {
                return rrbX_2.id_class(4, 1, 4, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 24: {
                return rrbX_2.id_class(2, rrbM_22.id_goto, wK_22, rrxF_22);
            }
            case 25: {
                return rrbX_2.id_class(2, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 26: {
                return rrbX_2.id_class(1, rrbM_22.id_goto, wK_22, rrxF_22);
            }
            case 27: {
                return rrbX_2.id_class(1, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 28: {
                return rrbX_2.id_class(2, 4, 2, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 29: {
                return rrbX_2.id_class(3, 3, 1, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 30: {
                return rrbX_2.id_class(2, 1, 2, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 31: {
                return rrbX_2.id_class(3, 3, 4, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 32: {
                return rrbX_2.id_class(1, 1, 1, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 33: {
                return rrbX_2.id_class(1, 1, 4, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 34: {
                return rrbX_2.id_class(4, 1, 1, 4, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 35: {
                return rrbX_2.id_class(1, 4, 4, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 36: {
                return rrbX_2.id_break(2, 0, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 37: {
                return rrbX_2.id_class(2, 1, 0, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 38: {
                return rrbX_2.id_break(1, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 39: {
                return rrbX_2.id_class(1, 2, 3, 0, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 40: {
                return rrbX_2.id_class(4, 1, 3, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 41: {
                return rrbX_2.id_class(1, 2, 4, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 42: {
                return rrbX_2.id_class(1, 4, 3, 3, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 43: {
                return rrbX_2.id_class(4, 2, 1, 2, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 44: {
                return rrbX_2.id_class(1, 4, 1, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 45: {
                return rrbX_2.id_class(4, 1, 1, 1, rrbM_22.id_goto, n2, wK_22, rrxF_22);
            }
            case 46: {
                return rrbX_2.id_class(4, rrbM_22.id_goto, wK_22, rrxF_22);
            }
        }
        return rrbX_2.id_class(0, rrbM_22.id_goto, wK_22, rrxF_22);
    }

    private static wK_2[] id_class(int n, int n2, int n3, int n4, fj_3[] fj_3Array, int n5, wK_2 wK_22, rrxF_2 rrxF_22) {
        if (n == n2) {
            return n3 == n4 ? rrbX_2.id_class(rrbx_3.UP, n, rrbx_3.DOWN, n3, fj_3Array, n5, wK_22, rrxF_22) : rrbX_2.id_class(rrbx_3.UP, n, rrbx_3.DOWN_LEFT, n3, rrbx_3.DOWN_RIGHT, n4, fj_3Array, n5, wK_22, rrxF_22);
        }
        if (n3 == n4) {
            return rrbX_2.id_class(rrbx_3.UP_LEFT, n, rrbx_3.UP_RIGHT, n2, rrbx_3.DOWN, n3, fj_3Array, n5, wK_22, rrxF_22);
        }
        if (n == n3) {
            return n2 == n4 ? rrbX_2.id_class(rrbx_3.LEFT, n, rrbx_3.RIGHT, n2, fj_3Array, n5, wK_22, rrxF_22) : rrbX_2.id_class(rrbx_3.LEFT, n, rrbx_3.UP_RIGHT, n2, rrbx_3.DOWN_RIGHT, n4, fj_3Array, n5, wK_22, rrxF_22);
        }
        return n2 == n4 ? rrbX_2.id_class(rrbx_3.UP_LEFT, n, rrbx_3.DOWN_LEFT, n3, rrbx_3.RIGHT, n2, fj_3Array, n5, wK_22, rrxF_22) : rrbX_2.id_class(rrbx_3.UP_LEFT, n, rrbx_3.UP_RIGHT, n2, rrbx_3.DOWN_LEFT, n3, rrbx_3.DOWN_RIGHT, n4, fj_3Array, n5, wK_22, rrxF_22);
    }

    private static wK_2[] id_class(int n, fj_3[] fj_3Array, wK_2 wK_22, rrxF_2 rrxF_22) {
        fj_3 fj_32 = fj_3Array[n];
        return rrbO_2.id_class(fj_32, wK_22, rrxF_22);
    }

    private static wK_2[] id_class(rrbx_3 rrbx_32, int n, rrbx_3 rrbx_33, int n2, fj_3[] fj_3Array, int n3, wK_2 wK_22, rrxF_2 rrxF_22) {
        wK_2 wK_23 = rrbX_2.id_class(fj_3Array[n], rrbx_32, n3, wK_22, rrxF_22);
        wK_2 wK_24 = rrbX_2.id_class(fj_3Array[n2], rrbx_33, n3, wK_22, rrxF_22);
        return rrxF_22.id_class(wK_23, wK_24);
    }

    private static wK_2[] id_break(int n, int n2, fj_3[] fj_3Array, int n3, wK_2 wK_22, rrxF_2 rrxF_22) {
        return rrbX_2.id_class(rrbx_3.UP, n, rrbx_3.DOWN, n2, fj_3Array, n3, wK_22, rrxF_22);
    }
}

