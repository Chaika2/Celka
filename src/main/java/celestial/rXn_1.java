/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rqs_3;
import celestial.rsE_2;
import java.util.Random;

public class rXn_1 {
    private static final Random id_class = new Random();

    public static void id_class(rYB rYB2, rfH_2 rfH_22, rqs_3<rdn_3> rqs_32) {
        rqs_32.forEach(rdn_32 -> rXn_1.id_class(rYB2, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), rdn_32));
    }

    public static void id_class(rYB rYB2, double d, double d2, double d3, rdn_3 rdn_32) {
        double d4 = aI_2.id_short.id_extends();
        double d5 = 1.0 - d4;
        double d6 = d4 / 2.0;
        double d7 = Math.floor(d) + id_class.nextDouble() * d5 + d6;
        double d8 = Math.floor(d2) + id_class.nextDouble() * d5;
        double d9 = Math.floor(d3) + id_class.nextDouble() * d5 + d6;
        while (!rdn_32.id_class()) {
            rsE_2 rsE_22 = new rsE_2(rYB2, d7, d8, d9, rdn_32.id_class(id_class.nextInt(21) + 10));
            float f = 0.05f;
            rsE_22.id_catch(id_class.nextGaussian() * (double)0.05f, id_class.nextGaussian() * (double)0.05f + (double)0.2f, id_class.nextGaussian() * (double)0.05f);
            rYB2.a_(rsE_22);
        }
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, rXu_1 rXu_12) {
        rXn_1.id_class(rYB2, (double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), rXu_12);
    }

    private static void id_class(rYB rYB2, double d, double d2, double d3, rXu_1 rXu_12) {
        for (int i = 0; i < rXu_12.id_else(); ++i) {
            rXn_1.id_class(rYB2, d, d2, d3, rXu_12.id_extends(i));
        }
    }

    public static void id_class(rYB rYB2, an_3 an_32, rXu_1 rXu_12) {
        rXn_1.id_class(rYB2, an_32.rx(), an_32.re(), an_32.BO(), rXu_12);
    }
}

