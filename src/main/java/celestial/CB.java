/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CH;
import celestial.CL;
import celestial.Cr_1;
import celestial.Cy_1;
import celestial.Hh_1;
import celestial.QY;
import celestial.gm_3;
import celestial.ne_3;
import celestial.rLQ;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rxL_2;
import celestial.rxV_2;

public class CB
extends CL {
    private int id_class;
    private final Cy_1 id_break;
    private rcy_3 id_instanceof;
    private boolean id_throw;

    public CB(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Cy_1 cy_1, rcd_3 rcd_32) {
        super(gm_32, d, d2, d3);
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
        this.id_break = cy_1;
        this.id_this = 8;
        if (rcd_32 != null) {
            this.id_instanceof = rcd_32.id_protected("Explosions", 10);
            if (this.id_instanceof.isEmpty()) {
                this.id_instanceof = null;
            } else {
                this.id_this = this.id_instanceof.size() * 2 - 1;
                for (int i = 0; i < this.id_instanceof.size(); ++i) {
                    rcd_3 rcd_33 = this.id_instanceof.id_class(i);
                    if (!rcd_33.id_new("Flicker")) continue;
                    this.id_throw = true;
                    this.id_this += 15;
                    break;
                }
            }
        }
    }

    private void id_class(double d, int n, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d2 = this.id_catch;
        double d3 = this.id_private;
        double d4 = this.id_implements;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    double d5 = (double)j + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 0.5;
                    double d6 = (double)i + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 0.5;
                    double d7 = (double)k + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 0.5;
                    double d8 = (double)rfU_2.id_class(d5 * d5 + d6 * d6 + d7 * d7) / d + this.id_continue.nextGaussian() * 0.05;
                    this.id_class(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, nArray, nArray2, bl, bl2);
                    if (i == -n || i == n || j == -n || j == n) continue;
                    k += n * 2 - 1;
                }
            }
        }
    }

    private void id_class(double d, double[][] dArray, int[] nArray, int[] nArray2, boolean bl, boolean bl2, boolean bl3) {
        double d2 = dArray[0][0];
        double d3 = dArray[0][1];
        this.id_class(this.id_catch, this.id_private, this.id_implements, d2 * d, d3 * d, 0.0, nArray, nArray2, bl, bl2);
        float f = this.id_continue.nextFloat() * (float)Math.PI;
        double d4 = bl3 ? 0.034 : 0.34;
        for (int i = 0; i < 3; ++i) {
            double d5 = (double)f + (double)((float)i * (float)Math.PI) * d4;
            double d6 = d2;
            double d7 = d3;
            for (int j = 1; j < dArray.length; ++j) {
                double d8 = dArray[j][0];
                double d9 = dArray[j][1];
                for (double d10 = 0.25; d10 <= 1.0; d10 += 0.25) {
                    double d11 = rfU_2.id_protected(d10, d6, d8) * d;
                    double d12 = rfU_2.id_protected(d10, d7, d9) * d;
                    double d13 = d11 * Math.sin(d5);
                    d11 *= Math.cos(d5);
                    for (double d14 = -1.0; d14 <= 1.0; d14 += 2.0) {
                        this.id_class(this.id_catch, this.id_private, this.id_implements, d11 * d14, d12, d13 * d14, nArray, nArray2, bl, bl2);
                    }
                }
                d6 = d8;
                d7 = d9;
            }
        }
    }

    private void id_class(int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d = this.id_continue.nextGaussian() * 0.05;
        double d2 = this.id_continue.nextGaussian() * 0.05;
        for (int i = 0; i < 70; ++i) {
            double d3 = this.id_finally * 0.5 + this.id_continue.nextGaussian() * 0.15 + d;
            double d4 = this.id_native * 0.5 + this.id_continue.nextGaussian() * 0.15 + d2;
            double d5 = this.id_extends * 0.5 + this.id_continue.nextDouble() * 0.5;
            this.id_class(this.id_catch, this.id_private, this.id_implements, d3, d5, d4, nArray, nArray2, bl, bl2);
        }
    }

    private void id_class(double d, double d2, double d3, double d4, double d5, double d6, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        Cr_1 cr_1 = (Cr_1)this.id_break.id_class(rLQ.id_goto, d, d2, d3, d4, d5, d6);
        cr_1.id_class(bl);
        cr_1.id_break(bl2);
        cr_1.id_throws(0.99f);
        int n = this.id_continue.nextInt(nArray.length);
        cr_1.id_break(nArray[n]);
        if (nArray2.length > 0) {
            cr_1.id_byte(rqR_2.id_class(nArray2, this.id_continue));
        }
    }

    private boolean id_break() {
        QY qY = QY.id_instanceof();
        return ((Hh_1)qY.id_class[16]).id_finally().id_break().id_protected(this.id_catch, this.id_private, this.id_implements) >= 256.0;
    }

    @Override
    public void id_case() {
        Object object;
        int n;
        if (this.id_class == 0 && this.id_instanceof != null) {
            n = this.id_break();
            boolean bl = false;
            if (this.id_instanceof.size() >= 3) {
                bl = true;
            } else {
                for (int i = 0; i < this.id_instanceof.size(); ++i) {
                    rcd_3 rcd_32 = this.id_instanceof.id_class(i);
                    if (rxV_2.id_class(rcd_32.id_case("Type")) != rxV_2.LARGE_BALL) continue;
                    bl = true;
                    break;
                }
            }
            object = bl ? (n != 0 ? rqn_3.SO : rqn_3.SM) : (n != 0 ? rqn_3.Sb : rqn_3.SG);
            this.id_byte.id_class(this.id_catch, this.id_private, this.id_implements, (rqA_2)object, rqL_2.AMBIENT, 20.0f, 0.95f + this.id_continue.nextFloat() * 0.1f, true);
        }
        if (this.id_class % 2 == 0 && this.id_instanceof != null && this.id_class / 2 < this.id_instanceof.size()) {
            n = this.id_class / 2;
            rcd_3 rcd_33 = this.id_instanceof.id_class(n);
            object = rxV_2.id_class(rcd_33.id_case("Type"));
            boolean bl = rcd_33.id_new("Trail");
            boolean bl2 = rcd_33.id_new("Flicker");
            int[] nArray = rcd_33.id_final("Colors");
            int[] nArray2 = rcd_33.id_final("FadeColors");
            if (nArray.length == 0) {
                nArray = new int[]{rxL_2.BLACK.id_case()};
            }
            switch (ne_3.id_class[((Enum)object).ordinal()]) {
                default: {
                    this.id_class(0.25, 2, nArray, nArray2, bl, bl2);
                    break;
                }
                case 2: {
                    this.id_class(0.5, 4, nArray, nArray2, bl, bl2);
                    break;
                }
                case 3: {
                    this.id_class(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, nArray, nArray2, bl, bl2, false);
                    break;
                }
                case 4: {
                    this.id_class(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, nArray, nArray2, bl, bl2, true);
                    break;
                }
                case 5: {
                    this.id_class(nArray, nArray2, bl, bl2);
                }
            }
            int n2 = nArray[0];
            float f = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
            float f2 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
            float f3 = (float)((n2 & 0xFF) >> 0) / 255.0f;
            CH cH = this.id_break.id_class(rLQ.id_interface, this.id_catch, this.id_private, this.id_implements, 0.0, 0.0, 0.0);
            cH.id_class(f, f2, f3);
        }
        ++this.id_class;
        if (this.id_class > this.id_this) {
            if (this.id_throw) {
                n = this.id_break() ? 1 : 0;
                rqA_2 rqA_22 = n != 0 ? rqn_3.Sx : rqn_3.SJ;
                this.id_byte.id_class(this.id_catch, this.id_private, this.id_implements, rqA_22, rqL_2.AMBIENT, 20.0f, 0.9f + this.id_continue.nextFloat() * 0.15f, true);
            }
            this.id_finally();
        }
    }
}

