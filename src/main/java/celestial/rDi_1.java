/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Qd_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDi_1
extends rUO<rUt_1> {
    private static final Qd_1 id_class = Qd_1.id_class(xu_3.id_throw);
    private final xc_3 b = xu_3.Ga.id_continue();
    private final xc_3 M = xu_3.F.id_continue();
    private final xc_3 O = xu_3.id_try.id_continue();

    public rDi_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        int n;
        int n2;
        int n3;
        rfH_22 = rfH_22.id_final();
        while (rRI2.id_finally(rfH_22) && rfH_22.c_() > 2) {
            rfH_22 = rfH_22.id_break();
        }
        if (!id_class.id_class(rRI2.id_byte(rfH_22))) {
            return false;
        }
        for (n3 = -2; n3 <= 2; ++n3) {
            for (n2 = -2; n2 <= 2; ++n2) {
                if (!rRI2.id_finally(rfH_22.id_break(n3, -1, n2)) || !rRI2.id_finally(rfH_22.id_break(n3, -2, n2))) continue;
                return false;
            }
        }
        for (n3 = -1; n3 <= 0; ++n3) {
            for (n2 = -2; n2 <= 2; ++n2) {
                for (int i = -2; i <= 2; ++i) {
                    rRI2.id_class(rfH_22.id_break(n2, n3, i), this.M, 2);
                }
            }
        }
        rRI2.id_class(rfH_22, this.O, 2);
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rRI2.id_class(rfH_22.id_break(rpr_32), this.O, 2);
        }
        for (n = -2; n <= 2; ++n) {
            for (int i = -2; i <= 2; ++i) {
                if (n != -2 && n != 2 && i != -2 && i != 2) continue;
                rRI2.id_class(rfH_22.id_break(n, 1, i), this.M, 2);
            }
        }
        rRI2.id_class(rfH_22.id_break(2, 1, 0), this.b, 2);
        rRI2.id_class(rfH_22.id_break(-2, 1, 0), this.b, 2);
        rRI2.id_class(rfH_22.id_break(0, 1, 2), this.b, 2);
        rRI2.id_class(rfH_22.id_break(0, 1, -2), this.b, 2);
        for (n = -1; n <= 1; ++n) {
            for (int i = -1; i <= 1; ++i) {
                if (n == 0 && i == 0) {
                    rRI2.id_class(rfH_22.id_break(n, 4, i), this.M, 2);
                    continue;
                }
                rRI2.id_class(rfH_22.id_break(n, 4, i), this.b, 2);
            }
        }
        for (n = 1; n <= 3; ++n) {
            rRI2.id_class(rfH_22.id_break(-1, n, -1), this.M, 2);
            rRI2.id_class(rfH_22.id_break(-1, n, 1), this.M, 2);
            rRI2.id_class(rfH_22.id_break(1, n, -1), this.M, 2);
            rRI2.id_class(rfH_22.id_break(1, n, 1), this.M, 2);
        }
        return true;
    }
}

