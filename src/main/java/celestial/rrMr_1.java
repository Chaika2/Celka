/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fN_2;
import celestial.gm_3;
import celestial.rrbi_3;
import celestial.rrzc_3;

public class rrMr_1 {
    private rrbi_3 id_class;
    private rrbi_3 id_break;
    private rrbi_3 id_byte;
    private int[] id_protected = new int[0];
    private int[] id_throws = new int[0];
    private int[] id_case = new int[0];

    public rrMr_1(rrbi_3 rrbi_32, rrbi_3 rrbi_33, rrbi_3 rrbi_34) {
        if (rrbi_33 != null || rrbi_34 != null) {
            if (rrbi_33 == null) {
                rrbi_33 = rrbi_32;
            }
            if (rrbi_34 == null) {
                rrbi_34 = rrbi_33;
            }
        }
        this.id_class = rrbi_32;
        this.id_break = rrbi_33;
        this.id_byte = rrbi_34;
    }

    private boolean id_class(int[] nArray, float f, int[] nArray2, float f2, int[] nArray3, float f3) {
        if (nArray2.length == nArray.length && nArray3.length == nArray.length) {
            for (int i = 0; i < nArray.length; ++i) {
                int n = nArray[i];
                int n2 = n >> 16 & 0xFF;
                int n3 = n >> 8 & 0xFF;
                int n4 = n & 0xFF;
                int n5 = nArray2[i];
                int n6 = n5 >> 16 & 0xFF;
                int n7 = n5 >> 8 & 0xFF;
                int n8 = n5 & 0xFF;
                int n9 = nArray3[i];
                int n10 = n9 >> 16 & 0xFF;
                int n11 = n9 >> 8 & 0xFF;
                int n12 = n9 & 0xFF;
                int n13 = (int)((float)n2 * f + (float)n6 * f2 + (float)n10 * f3);
                int n14 = (int)((float)n3 * f + (float)n7 * f2 + (float)n11 * f3);
                int n15 = (int)((float)n4 * f + (float)n8 * f2 + (float)n12 * f3);
                nArray[i] = 0xFF000000 | n13 << 16 | n14 << 8 | n15;
            }
            return true;
        }
        return false;
    }

    private boolean id_class(int[] nArray, float f, int[] nArray2, float f2) {
        if (nArray2.length != nArray.length) {
            return false;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            int n2 = n >> 16 & 0xFF;
            int n3 = n >> 8 & 0xFF;
            int n4 = n & 0xFF;
            int n5 = nArray2[i];
            int n6 = n5 >> 16 & 0xFF;
            int n7 = n5 >> 8 & 0xFF;
            int n8 = n5 & 0xFF;
            int n9 = (int)((float)n2 * f + (float)n6 * f2);
            int n10 = (int)((float)n3 * f + (float)n7 * f2);
            int n11 = (int)((float)n4 * f + (float)n8 * f2);
            nArray[i] = 0xFF000000 | n9 << 16 | n10 << 8 | n11;
        }
        return true;
    }

    public boolean id_class(gm_3 gm_32, float f, int[] nArray, boolean bl, float f2) {
        if (this.id_break == null && this.id_byte == null) {
            return this.id_class.id_class(gm_32, f, nArray, bl);
        }
        if (!rrzc_3.id_protected(gm_32) && !rrzc_3.id_break(gm_32)) {
            boolean bl2;
            float f3 = gm_32.id_private(f2);
            float f4 = gm_32.id_case(f2);
            float f5 = 1.0E-4f;
            boolean bl3 = f3 > f5;
            boolean bl4 = bl2 = f4 > f5;
            if (!bl3 && !bl2) {
                return this.id_class.id_class(gm_32, f, nArray, bl);
            }
            if (f3 > 0.0f) {
                f4 /= f3;
            }
            float f6 = 1.0f - f3;
            float f7 = f3 - f4;
            if (this.id_protected.length != nArray.length) {
                this.id_protected = new int[nArray.length];
                this.id_throws = new int[nArray.length];
            }
            int n = 0;
            int[][] nArrayArray = new int[][]{nArray, this.id_protected, this.id_throws};
            float[] fArray = new float[3];
            if (f6 > f5 && this.id_class.id_class(gm_32, f, nArrayArray[n], bl)) {
                fArray[n] = f6;
                ++n;
            }
            if (f7 > f5 && this.id_break != null && this.id_break.id_class(gm_32, f, nArrayArray[n], bl)) {
                fArray[n] = f7;
                ++n;
            }
            if (f4 > f5 && this.id_byte != null && this.id_byte.id_class(gm_32, f, nArrayArray[n], bl)) {
                fArray[n] = f4;
                ++n;
            }
            if (n == 2) {
                return this.id_class(nArrayArray[0], fArray[0], nArrayArray[1], fArray[1]);
            }
            return n == 3 ? this.id_class(nArrayArray[0], fArray[0], nArrayArray[1], fArray[1], nArrayArray[2], fArray[2]) : true;
        }
        return this.id_class.id_class(gm_32, f, nArray, bl);
    }

    public boolean id_class(gm_3 gm_32, float f, fN_2 fN_22, boolean bl, float f2) {
        int n = fN_22.id_class() * fN_22.id_break();
        if (this.id_case.length != n) {
            this.id_case = new int[n];
        }
        fN_22.id_private().get(this.id_case);
        boolean bl2 = this.id_class(gm_32, f, this.id_case, bl, f2);
        if (bl2) {
            fN_22.id_private().put(this.id_case);
        }
        return bl2;
    }
}

