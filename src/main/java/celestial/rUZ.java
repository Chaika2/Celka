/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.QP;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUm_1;
import celestial.reh_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUZ
extends rUO<rUm_1> {
    public rUZ(Codec<rUm_1> codec) {
        super(codec);
    }

    private static void id_class(rfH_2 rfH_22, rRg_1 rRg_12, Random random) {
        rfw_3 rfw_32 = rfH_22.id_new().id_class(rpr_3.DOWN);
        if (rRg_12.id_finally(rfw_32)) {
            int n = rfU_2.id_class(random, 1, 5);
            if (random.nextInt(7) == 0) {
                n *= 2;
            }
            int n2 = 23;
            int n3 = 25;
            reh_3.id_class(rRg_12, random, rfw_32, n, 23, 25);
        }
    }

    private void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        if (rRg_12.id_byte(rfH_22.id_break()).id_class(xc_32.id_break())) {
            this.id_class(rRg_12, rfH_22, xc_32);
        } else if ((double)random.nextFloat() < 0.15) {
            this.id_class(rRg_12, rfH_22, xc_32);
            if (bl && random.nextInt(11) == 0) {
                rUZ.id_class(rfH_22, rRg_12, random);
            }
        }
    }

    private void id_class(rRg_1 rRg_12, Random random, rUm_1 rUm_12, rfw_3 rfw_32, float f, float f2, float f3) {
        if (random.nextFloat() < f) {
            this.id_class(rRg_12, rfw_32, rUm_12.id_implements);
        } else if (random.nextFloat() < f2) {
            this.id_class(rRg_12, rfw_32, rUm_12.id_private);
            if (random.nextFloat() < f3) {
                rUZ.id_class(rfw_32, rRg_12, random);
            }
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUm_1 rUm_12) {
        xd_3 xd_32 = rUm_12.id_case.id_break();
        rfH_2 rfH_23 = null;
        xd_3 xd_33 = rRI2.id_byte(rfH_22.id_break()).id_break();
        if (xd_33 == xd_32) {
            rfH_23 = rfH_22;
        }
        if (rfH_23 == null) {
            return false;
        }
        int n2 = rfU_2.id_class(random, 4, 13);
        if (random.nextInt(12) == 0) {
            n2 *= 2;
        }
        if (!rUm_12.id_finally) {
            int n = rKd_12.id_throws();
            if (rfH_23.c_() + n2 + 1 >= n) {
                return false;
            }
        }
        boolean bl = !rUm_12.id_finally && random.nextFloat() < 0.06f;
        rRI2.id_class(rfH_22, xu_3.id_class.id_continue(), 4);
        this.id_class(rRI2, random, rUm_12, rfH_23, n2, bl);
        this.id_break(rRI2, random, rUm_12, rfH_23, n2, bl);
        return true;
    }

    private void id_class(rRg_1 rRg_12, Random random, rUm_1 rUm_12, rfH_2 rfH_22, int n, boolean bl) {
        rfw_3 rfw_32 = new rfw_3();
        xc_3 xc_32 = rUm_12.id_catch;
        int n2 = bl ? 1 : 0;
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                boolean bl2 = bl && rfU_2.id_class(i) == n2 && rfU_2.id_class(j) == n2;
                for (int k = 0; k < n; ++k) {
                    rfw_32.id_class(rfH_22, i, k, j);
                    if (!rUZ.id_class(rRg_12, rfw_32, true)) continue;
                    if (rUm_12.id_finally) {
                        if (!rRg_12.id_byte(rfw_32.id_break()).id_catch()) {
                            rRg_12.id_break((rfH_2)rfw_32, true);
                        }
                        rRg_12.id_class((rfH_2)rfw_32, xc_32, 3);
                        continue;
                    }
                    if (bl2) {
                        if (!(random.nextFloat() < 0.1f)) continue;
                        this.id_class(rRg_12, rfw_32, xc_32);
                        continue;
                    }
                    this.id_class(rRg_12, rfw_32, xc_32);
                }
            }
        }
    }

    private static boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, boolean bl) {
        return rRg_12.id_class(rfH_22, xc_32 -> {
            QP qP = xc_32.id_byte();
            return xc_32.id_byte().id_throws() || bl && qP == QP.id_throws;
        });
    }

    private void id_break(rRg_1 rRg_12, Random random, rUm_1 rUm_12, rfH_2 rfH_22, int n, boolean bl) {
        int n2;
        rfw_3 rfw_32 = new rfw_3();
        boolean bl2 = rUm_12.id_private.id_class(xu_3.bg);
        int n3 = Math.min(random.nextInt(1 + n / 3) + 5, n);
        for (int i = n2 = n - n3; i <= n; ++i) {
            int n4;
            int n5 = n4 = i < n - random.nextInt(3) ? 2 : 1;
            if (n3 > 8 && i < n2 + 4) {
                n4 = 3;
            }
            if (bl) {
                ++n4;
            }
            for (int j = -n4; j <= n4; ++j) {
                for (int k = -n4; k <= n4; ++k) {
                    boolean bl3 = j == -n4 || j == n4;
                    boolean bl4 = k == -n4 || k == n4;
                    boolean bl5 = !bl3 && !bl4 && i != n;
                    boolean bl6 = bl3 && bl4;
                    boolean bl7 = i < n2 + 3;
                    rfw_32.id_class(rfH_22, j, i, k);
                    if (!rUZ.id_class(rRg_12, rfw_32, false)) continue;
                    if (rUm_12.id_finally && !rRg_12.id_byte(rfw_32.id_break()).id_catch()) {
                        rRg_12.id_break((rfH_2)rfw_32, true);
                    }
                    if (bl7) {
                        if (bl5) continue;
                        this.id_class(rRg_12, random, rfw_32, rUm_12.id_private, bl2);
                        continue;
                    }
                    if (bl5) {
                        this.id_class(rRg_12, random, rUm_12, rfw_32, 0.1f, 0.2f, bl2 ? 0.1f : 0.0f);
                        continue;
                    }
                    if (bl6) {
                        this.id_class(rRg_12, random, rUm_12, rfw_32, 0.01f, 0.7f, bl2 ? 0.083f : 0.0f);
                        continue;
                    }
                    this.id_class(rRg_12, random, rUm_12, rfw_32, 5.0E-4f, 0.98f, bl2 ? 0.07f : 0.0f);
                }
            }
        }
    }
}

