/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUA
extends rUO<rUt_1> {
    public rUA(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        int n;
        int n2;
        while (rRI2.id_finally(rfH_22) && rfH_22.c_() > 2) {
            rfH_22 = rfH_22.id_break();
        }
        if (!rRI2.id_byte(rfH_22).id_class(xu_3.Pt)) {
            return false;
        }
        rfH_22 = rfH_22.id_break(random.nextInt(4));
        int n3 = random.nextInt(4) + 7;
        int n4 = n3 / 4 + random.nextInt(2);
        if (n4 > 1 && random.nextInt(60) == 0) {
            rfH_22 = rfH_22.id_break(10 + random.nextInt(30));
        }
        for (n2 = 0; n2 < n3; ++n2) {
            float f = (1.0f - (float)n2 / (float)n3) * (float)n4;
            n = rfU_2.id_case(f);
            for (int i = -n; i <= n; ++i) {
                float f2 = (float)rfU_2.id_class(i) - 0.25f;
                for (int j = -n; j <= n; ++j) {
                    float f3 = (float)rfU_2.id_class(j) - 0.25f;
                    if ((i != 0 || j != 0) && f2 * f2 + f3 * f3 > f * f || (i == -n || i == n || j == -n || j == n) && random.nextFloat() > 0.75f) continue;
                    xc_3 xc_32 = rRI2.id_byte(rfH_22.id_break(i, n2, j));
                    xd_3 xd_32 = xc_32.id_break();
                    if (xc_32.id_catch() || rUA.id_break(xd_32) || xd_32 == xu_3.Pt || xd_32 == xu_3.PT) {
                        this.id_class(rRI2, rfH_22.id_break(i, n2, j), xu_3.Ei.id_continue());
                    }
                    if (n2 == 0 || n <= 1) continue;
                    xc_32 = rRI2.id_byte(rfH_22.id_break(i, -n2, j));
                    xd_32 = xc_32.id_break();
                    if (!xc_32.id_catch() && !rUA.id_break(xd_32) && xd_32 != xu_3.Pt && xd_32 != xu_3.PT) continue;
                    this.id_class(rRI2, rfH_22.id_break(i, -n2, j), xu_3.Ei.id_continue());
                }
            }
        }
        n2 = n4 - 1;
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 > 1) {
            n2 = 1;
        }
        for (int i = -n2; i <= n2; ++i) {
            block5: for (n = -n2; n <= n2; ++n) {
                rfH_2 rfH_23 = rfH_22.id_break(i, -1, n);
                int n5 = 50;
                if (Math.abs(i) == 1 && Math.abs(n) == 1) {
                    n5 = random.nextInt(5);
                }
                while (rfH_23.c_() > 50) {
                    xc_3 xc_33 = rRI2.id_byte(rfH_23);
                    xd_3 xd_33 = xc_33.id_break();
                    if (!xc_33.id_catch() && !rUA.id_break(xd_33) && xd_33 != xu_3.Pt && xd_33 != xu_3.PT && xd_33 != xu_3.Ei) continue block5;
                    this.id_class(rRI2, rfH_23, xu_3.Ei.id_continue());
                    rfH_23 = rfH_23.id_break();
                    if (--n5 > 0) continue;
                    rfH_23 = rfH_23.id_catch(random.nextInt(5) + 1);
                    n5 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}

