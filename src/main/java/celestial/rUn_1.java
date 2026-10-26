/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.QP;
import celestial.rDq_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUn_1
extends rUO<rDq_1> {
    private boolean id_byte(xd_3 xd_32) {
        return xd_32 == xu_3.Ei || xd_32 == xu_3.Pt || xd_32 == xu_3.hP;
    }

    public rUn_1(Codec<rDq_1> codec) {
        super(codec);
    }

    private double id_class(int n, int n2, rfH_2 rfH_22, int n3, Random random) {
        float f = 10.0f * rfU_2.id_class(random.nextFloat(), 0.2f, 0.8f) / (float)n3;
        return (double)f + Math.pow(n - rfH_22.b_(), 2.0) + Math.pow(n2 - rfH_22.d_(), 2.0) - Math.pow(n3, 2.0);
    }

    private double id_class(int n, int n2, rfH_2 rfH_22, int n3, int n4, double d) {
        return Math.pow(((double)(n - rfH_22.b_()) * Math.cos(d) - (double)(n2 - rfH_22.d_()) * Math.sin(d)) / (double)n3, 2.0) + Math.pow(((double)(n - rfH_22.b_()) * Math.sin(d) + (double)(n2 - rfH_22.d_()) * Math.cos(d)) / (double)n4, 2.0) - 1.0;
    }

    private int id_class(Random random, int n, int n2, int n3) {
        float f = 3.5f - random.nextFloat();
        float f2 = (1.0f - (float)Math.pow(n, 2.0) / ((float)n2 * f)) * (float)n3;
        if (n2 > 15 + random.nextInt(5)) {
            int n4 = n < 3 + random.nextInt(6) ? n / 2 : n;
            f2 = (1.0f - (float)n4 / ((float)n2 * f * 0.4f)) * (float)n3;
        }
        return rfU_2.id_case(f2 / 2.0f);
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        return rRq_12.id_byte(rfH_22.id_break()).id_byte() == QP.id_class;
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n, int n2, boolean bl, int n3) {
        int n4 = bl ? n3 : n / 2;
        for (int i = -n4; i <= n4; ++i) {
            for (int j = -n4; j <= n4; ++j) {
                for (int k = 0; k <= n2; ++k) {
                    rfH_2 rfH_23 = rfH_22.id_break(i, k, j);
                    xd_3 xd_32 = rRg_12.id_byte(rfH_23).id_break();
                    if (!this.id_byte(xd_32) && xd_32 != xu_3.Pq) continue;
                    if (this.id_class((rRq_1)rRg_12, rfH_23)) {
                        this.id_class(rRg_12, rfH_23, xu_3.id_class.id_continue());
                        this.id_class(rRg_12, rfH_23.id_final(), xu_3.id_class.id_continue());
                        continue;
                    }
                    if (!this.id_byte(xd_32)) continue;
                    xd_3[] xd_3Array = new xd_3[]{rRg_12.id_byte(rfH_23.id_byte()).id_break(), rRg_12.id_byte(rfH_23.id_extends()).id_break(), rRg_12.id_byte(rfH_23.id_private()).id_break(), rRg_12.id_byte(rfH_23.id_protected()).id_break()};
                    int n5 = 0;
                    for (xd_3 xd_33 : xd_3Array) {
                        if (this.id_byte(xd_33)) continue;
                        ++n5;
                    }
                    if (n5 < 3) continue;
                    this.id_class(rRg_12, rfH_23, xu_3.id_class.id_continue());
                }
            }
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDq_1 rDq_12) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        rfH_22 = new rfH_2(rfH_22.b_(), rKd_12.id_case(), rfH_22.d_());
        boolean bl = random.nextDouble() > 0.7;
        xc_3 xc_32 = rDq_12.id_break;
        double d = random.nextDouble() * 2.0 * Math.PI;
        int n6 = 11 - random.nextInt(5);
        int n7 = 3 + random.nextInt(3);
        boolean bl2 = random.nextDouble() > 0.7;
        int n8 = 11;
        int n9 = n5 = bl2 ? random.nextInt(6) + 6 : random.nextInt(15) + 3;
        if (!bl2 && random.nextDouble() > 0.9) {
            n5 += random.nextInt(19) + 7;
        }
        int n10 = Math.min(n5 + random.nextInt(11), 18);
        int n11 = Math.min(n5 + random.nextInt(7) - random.nextInt(5), 11);
        int n12 = bl2 ? n6 : 11;
        for (n4 = -n12; n4 < n12; ++n4) {
            for (n3 = -n12; n3 < n12; ++n3) {
                for (n2 = 0; n2 < n5; ++n2) {
                    int n13 = n = bl2 ? this.id_break(n2, n5, n11) : this.id_class(random, n2, n5, n11);
                    if (!bl2 && n4 >= n) continue;
                    this.id_class(rRI2, random, rfH_22, n5, n4, n2, n3, n, n12, bl2, n7, d, bl, xc_32);
                }
            }
        }
        this.id_class(rRI2, rfH_22, n11, n5, bl2, n6);
        for (n4 = -n12; n4 < n12; ++n4) {
            for (n3 = -n12; n3 < n12; ++n3) {
                for (n2 = -1; n2 > -n10; --n2) {
                    n = bl2 ? rfU_2.id_case((float)n12 * (1.0f - (float)Math.pow(n2, 2.0) / ((float)n10 * 8.0f))) : n12;
                    int n14 = this.id_break(random, -n2, n10, n11);
                    if (n4 >= n14) continue;
                    this.id_class(rRI2, random, rfH_22, n10, n4, n2, n3, n14, n, bl2, n7, d, bl, xc_32);
                }
            }
        }
        int n15 = bl2 ? (random.nextDouble() > 0.1 ? 1 : 0) : (n4 = random.nextDouble() > 0.7 ? 1 : 0);
        if (n4 != 0) {
            this.id_class(random, rRI2, n11, n5, rfH_22, bl2, n6, d, n7);
        }
        return true;
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        if (rRg_12.id_byte(rfH_22.id_final()).id_class(xu_3.Pq)) {
            this.id_class(rRg_12, rfH_22.id_final(), xu_3.id_class.id_continue());
        }
    }

    private void id_class(int n, int n2, rfH_2 rfH_22, rRg_1 rRg_12, boolean bl, double d, rfH_2 rfH_23, int n3, int n4) {
        int n5 = n + 1 + n3 / 3;
        int n6 = Math.min(n - 3, 3) + n4 / 2 - 1;
        for (int i = -n5; i < n5; ++i) {
            for (int j = -n5; j < n5; ++j) {
                rfH_2 rfH_24;
                xd_3 xd_32;
                double d2 = this.id_class(i, j, rfH_23, n5, n6, d);
                if (!(d2 < 0.0) || !this.id_byte(xd_32 = rRg_12.id_byte(rfH_24 = rfH_22.id_break(i, n2, j)).id_break()) && xd_32 != xu_3.Pt) continue;
                if (bl) {
                    this.id_class(rRg_12, rfH_24, xu_3.id_try.id_continue());
                    continue;
                }
                this.id_class(rRg_12, rfH_24, xu_3.id_class.id_continue());
                this.id_class(rRg_12, rfH_24);
            }
        }
    }

    private void id_class(Random random, rRg_1 rRg_12, int n, int n2, rfH_2 rfH_22, boolean bl, int n3, double d, int n4) {
        int n5;
        int n6;
        int n7 = random.nextBoolean() ? -1 : 1;
        int n8 = random.nextBoolean() ? -1 : 1;
        int n9 = random.nextInt(Math.max(n / 2 - 2, 1));
        if (random.nextBoolean()) {
            n9 = n / 2 + 1 - random.nextInt(Math.max(n - n / 2 - 1, 1));
        }
        int n10 = random.nextInt(Math.max(n / 2 - 2, 1));
        if (random.nextBoolean()) {
            n10 = n / 2 + 1 - random.nextInt(Math.max(n - n / 2 - 1, 1));
        }
        if (bl) {
            n9 = n10 = random.nextInt(Math.max(n3 - 5, 1));
        }
        rfH_2 rfH_23 = new rfH_2(n7 * n9, 0, n8 * n10);
        double d2 = bl ? d + 1.5707963267948966 : random.nextDouble() * 2.0 * Math.PI;
        for (n6 = 0; n6 < n2 - 3; ++n6) {
            n5 = this.id_class(random, n6, n2, n);
            this.id_class(n5, n6, rfH_22, rRg_12, false, d2, rfH_23, n3, n4);
        }
        for (n6 = -1; n6 > -n2 + random.nextInt(5); --n6) {
            n5 = this.id_break(random, -n6, n2, n);
            this.id_class(n5, n6, rfH_22, rRg_12, true, d2, rfH_23, n3, n4);
        }
    }

    private int id_class(int n, int n2, int n3) {
        int n4 = n3;
        if (n > 0 && n2 - n <= 3) {
            n4 = n3 - (4 - (n2 - n));
        }
        return n4;
    }

    private void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, int n7, double d, boolean bl2, xc_3 xc_32) {
        double d2;
        double d3 = d2 = bl ? this.id_class(n2, n4, rfH_2.id_protected, n6, this.id_class(n3, n, n7), d) : this.id_class(n2, n4, rfH_2.id_protected, n5, random);
        if (d2 < 0.0) {
            double d4;
            rfH_2 rfH_23 = rfH_22.id_break(n2, n3, n4);
            double d5 = d4 = bl ? -0.5 : (double)(-6 - random.nextInt(3));
            if (d2 > d4 && random.nextDouble() > 0.9) {
                return;
            }
            this.id_class(rfH_23, rRg_12, random, n - n3, n, bl, bl2, xc_32);
        }
    }

    private void id_class(rfH_2 rfH_22, rRg_1 rRg_12, Random random, int n, int n2, boolean bl, boolean bl2, xc_3 xc_32) {
        xc_3 xc_33 = rRg_12.id_byte(rfH_22);
        if (xc_33.id_byte() == QP.id_class || xc_33.id_class(xu_3.Pt) || xc_33.id_class(xu_3.PT) || xc_33.id_class(xu_3.id_try)) {
            int n3;
            boolean bl3 = !bl || random.nextDouble() > 0.05;
            int n4 = n3 = bl ? 3 : 2;
            if (bl2 && !xc_33.id_class(xu_3.id_try) && (double)n <= (double)random.nextInt(Math.max(1, n2 / n3)) + (double)n2 * 0.6 && bl3) {
                this.id_class(rRg_12, rfH_22, xu_3.Pt.id_continue());
            } else {
                this.id_class(rRg_12, rfH_22, xc_32);
            }
        }
    }

    private int id_break(Random random, int n, int n2, int n3) {
        float f = 1.0f + random.nextFloat() / 2.0f;
        float f2 = (1.0f - (float)n / ((float)n2 * f)) * (float)n3;
        return rfU_2.id_case(f2 / 2.0f);
    }

    private int id_break(int n, int n2, int n3) {
        float f = 1.0f;
        float f2 = (1.0f - (float)Math.pow(n, 2.0) / ((float)n2 * 1.0f)) * (float)n3;
        return rfU_2.id_case(f2 / 2.0f);
    }
}

