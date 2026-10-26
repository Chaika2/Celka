/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Je_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reh_3
extends rUO<rUt_1> {
    private static final rpr_3[] id_class = rpr_3.values();

    public reh_3(Codec<rUt_1> codec) {
        super(codec);
    }

    public static void id_class(rRg_1 rRg_12, Random random, rfw_3 rfw_32, int n, int n2, int n3) {
        for (int i = 0; i <= n; ++i) {
            if (rRg_12.id_finally(rfw_32)) {
                if (i == n || !rRg_12.id_finally(rfw_32.id_break())) {
                    rRg_12.id_class((rfH_2)rfw_32, (xc_3)xu_3.XC.id_continue().id_class(Je_1.id_int, rfU_2.id_class(random, n2, n3)), 2);
                    break;
                }
                rRg_12.id_class((rfH_2)rfw_32, xu_3.Xl.id_continue(), 2);
            }
            rfw_32.id_class(rpr_3.DOWN);
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        if (!rRI2.id_finally(rfH_22)) {
            return false;
        }
        xc_3 xc_32 = rRI2.id_byte(rfH_22.id_final());
        if (!xc_32.id_class(xu_3.PR) && !xc_32.id_class(xu_3.bg)) {
            return false;
        }
        this.id_class(rRI2, random, rfH_22);
        this.id_break(rRI2, random, rfH_22);
        return true;
    }

    private void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22) {
        rRg_12.id_class(rfH_22, xu_3.bg.id_continue(), 2);
        rfw_3 rfw_32 = new rfw_3();
        rfw_3 rfw_33 = new rfw_3();
        for (int i = 0; i < 200; ++i) {
            rfw_32.id_class(rfH_22, random.nextInt(6) - random.nextInt(6), random.nextInt(2) - random.nextInt(5), random.nextInt(6) - random.nextInt(6));
            if (!rRg_12.id_finally(rfw_32)) continue;
            int n = 0;
            for (rpr_3 rpr_32 : id_class) {
                xc_3 xc_32 = rRg_12.id_byte(rfw_33.id_class((rja_3)rfw_32, rpr_32));
                if (xc_32.id_class(xu_3.PR) || xc_32.id_class(xu_3.bg)) {
                    ++n;
                }
                if (n > 1) break;
            }
            if (n != true) continue;
            rRg_12.id_class((rfH_2)rfw_32, xu_3.bg.id_continue(), 2);
        }
    }

    private void id_break(rRg_1 rRg_12, Random random, rfH_2 rfH_22) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < 100; ++i) {
            xc_3 xc_32;
            rfw_32.id_class(rfH_22, random.nextInt(8) - random.nextInt(8), random.nextInt(2) - random.nextInt(7), random.nextInt(8) - random.nextInt(8));
            if (!rRg_12.id_finally(rfw_32) || !(xc_32 = rRg_12.id_byte(rfw_32.id_final())).id_class(xu_3.PR) && !xc_32.id_class(xu_3.bg)) continue;
            int n = rfU_2.id_class(random, 1, 8);
            if (random.nextInt(6) == 0) {
                n *= 2;
            }
            if (random.nextInt(5) == 0) {
                n = 1;
            }
            int n2 = 17;
            int n3 = 25;
            reh_3.id_class(rRg_12, random, rfw_32, n, 17, 25);
        }
    }
}

