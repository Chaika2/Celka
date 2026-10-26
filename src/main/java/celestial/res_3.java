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
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class res_3
extends rUO<rUt_1> {
    public res_3(Codec<rUt_1> codec) {
        super(codec);
    }

    private static boolean id_class(rRg_1 rRg_12, rfw_3 rfw_32) {
        do {
            rfw_32.id_byte(0, -1, 0);
            if (!rYB.id_super(rfw_32)) continue;
            return false;
        } while (rRg_12.id_byte(rfw_32).id_catch());
        rfw_32.id_byte(0, 1, 0);
        return true;
    }

    public static void id_class(rRg_1 rRg_12, Random random, rfw_3 rfw_32, int n, int n2, int n3) {
        for (int i = 1; i <= n; ++i) {
            if (rRg_12.id_finally(rfw_32)) {
                if (i == n || !rRg_12.id_finally(rfw_32.id_final())) {
                    rRg_12.id_class((rfH_2)rfw_32, (xc_3)xu_3.XH.id_continue().id_class(Je_1.id_int, rfU_2.id_class(random, n2, n3)), 2);
                    break;
                }
                rRg_12.id_class((rfH_2)rfw_32, xu_3.Xy.id_continue(), 2);
            }
            rfw_32.id_class(rpr_3.UP);
        }
    }

    private static boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        if (!rRg_12.id_finally(rfH_22)) {
            return true;
        }
        xc_3 xc_32 = rRg_12.id_byte(rfH_22.id_break());
        return !xc_32.id_class(xu_3.PR) && !xc_32.id_class(xu_3.Xz) && !xc_32.id_class(xu_3.XN);
    }

    public static boolean id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22, int n, int n2, int n3) {
        if (res_3.id_class(rRg_12, rfH_22)) {
            return false;
        }
        res_3.id_break(rRg_12, random, rfH_22, n, n2, n3);
        return true;
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        return res_3.id_class((rRg_1)rRI2, random, rfH_22, 8, 4, 8);
    }

    private static void id_break(rRg_1 rRg_12, Random random, rfH_2 rfH_22, int n, int n2, int n3) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < n * n; ++i) {
            rfw_32.id_class(rfH_22).id_byte(rfU_2.id_class(random, -n, n), rfU_2.id_class(random, -n2, n2), rfU_2.id_class(random, -n, n));
            if (!res_3.id_class(rRg_12, rfw_32) || res_3.id_class(rRg_12, (rfH_2)rfw_32)) continue;
            int n4 = rfU_2.id_class(random, 1, n3);
            if (random.nextInt(6) == 0) {
                n4 *= 2;
            }
            if (random.nextInt(5) == 0) {
                n4 = 1;
            }
            int n5 = 17;
            int n6 = 25;
            res_3.id_class(rRg_12, random, rfw_32, n4, 17, 25);
        }
    }
}

