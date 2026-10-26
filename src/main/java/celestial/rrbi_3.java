/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.rrbQ_2;
import celestial.rrbb_3;

public class rrbi_3 {
    private rrbQ_2 id_class = null;
    private float[][] id_break = new float[16][3];
    private float[][] id_byte = new float[16][3];

    public rrbi_3(rrbQ_2 rrbQ_22) {
        this.id_class = rrbQ_22;
    }

    private static void id_class(String string) {
        rrbb_3.id_byte("CustomColors: " + string);
    }

    private void id_class(float[][] fArray, float f, int n, int n2, float[][] fArray2) {
        int n3;
        int n4 = (int)Math.floor(f);
        if (n4 == (n3 = (int)Math.ceil(f))) {
            for (int i = 0; i < 16; ++i) {
                float[] fArray3 = fArray[n + i * n2 + n4];
                float[] fArray4 = fArray2[i];
                for (int j = 0; j < 3; ++j) {
                    fArray4[j] = fArray3[j];
                }
            }
        } else {
            float f2 = 1.0f - (f - (float)n4);
            float f3 = 1.0f - ((float)n3 - f);
            for (int i = 0; i < 16; ++i) {
                float[] fArray5 = fArray[n + i * n2 + n4];
                float[] fArray6 = fArray[n + i * n2 + n3];
                float[] fArray7 = fArray2[i];
                for (int j = 0; j < 3; ++j) {
                    fArray7[j] = fArray5[j] * f2 + fArray6[j] * f3;
                }
            }
        }
    }

    public boolean id_class(gm_3 gm_32, float f, int[] nArray, boolean bl) {
        if (this.id_class == null) {
            return false;
        }
        int n = this.id_class.id_case();
        if (bl && n < 64) {
            return false;
        }
        int n2 = this.id_class.id_throws();
        if (n2 < 16) {
            rrbi_3.id_break("Invalid lightmap width: " + n2);
            this.id_class = null;
            return false;
        }
        int n3 = 0;
        if (bl) {
            n3 = n2 * 16 * 2;
        }
        float f2 = 1.1666666f * (gm_32.id_class(1.0f) - 0.2f);
        if (gm_32.id_super() > 0) {
            f2 = 1.0f;
        }
        f2 = rrbb_3.id_class(f2);
        float f3 = f2 * (float)(n2 - 1);
        float f4 = rrbb_3.id_class(f + 0.5f) * (float)(n2 - 1);
        float f5 = rrbb_3.id_class((float)rrbb_3.rE().a);
        boolean bl2 = f5 > 1.0E-4f;
        float[][] fArray = this.id_class.id_break();
        this.id_class(fArray, f3, n3, n2, this.id_break);
        this.id_class(fArray, f4, n3 + 16 * n2, n2, this.id_byte);
        float[] fArray2 = new float[3];
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n4;
                for (n4 = 0; n4 < 3; ++n4) {
                    float f6 = rrbb_3.id_class(this.id_break[i][n4] + this.id_byte[j][n4]);
                    if (bl2) {
                        float f7 = 1.0f - f6;
                        f7 = 1.0f - f7 * f7 * f7 * f7;
                        f6 = f5 * f7 + (1.0f - f5) * f6;
                    }
                    fArray2[n4] = f6;
                }
                n4 = (int)(fArray2[0] * 255.0f);
                int n5 = (int)(fArray2[1] * 255.0f);
                int n6 = (int)(fArray2[2] * 255.0f);
                nArray[i * 16 + j] = 0xFF000000 | n6 << 16 | n5 << 8 | n4;
            }
        }
        return true;
    }

    public rrbQ_2 id_class() {
        return this.id_class;
    }

    private static void id_break(String string) {
        rrbb_3.id_protected("CustomColors: " + string);
    }
}

