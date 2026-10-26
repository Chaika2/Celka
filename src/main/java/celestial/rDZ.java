/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDZ
extends rUO<rUt_1> {
    public rDZ(Codec<rUt_1> codec) {
        super(codec);
    }

    private void id_class(rRg_1 rRg_12, Random random, rfH_2 rfH_22) {
        if (random.nextBoolean()) {
            rRg_12.id_class(rfH_22, xu_3.PK.id_continue(), 2);
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        if (rRI2.id_finally(rfH_22) && !rRI2.id_finally(rfH_22.id_final())) {
            rfw_3 rfw_32 = rfH_22.id_new();
            rfw_3 rfw_33 = rfH_22.id_new();
            boolean bl = true;
            boolean bl2 = true;
            boolean bl3 = true;
            boolean bl4 = true;
            while (rRI2.id_finally(rfw_32)) {
                if (rYB.id_super(rfw_32)) {
                    return true;
                }
                rRI2.id_class((rfH_2)rfw_32, xu_3.PK.id_continue(), 2);
                bl = bl && this.id_break(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.NORTH));
                bl2 = bl2 && this.id_break(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.SOUTH));
                bl3 = bl3 && this.id_break(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.WEST));
                bl4 = bl4 && this.id_break(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.EAST));
                rfw_32.id_class(rpr_3.DOWN);
            }
            rfw_32.id_class(rpr_3.UP);
            this.id_class(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.NORTH));
            this.id_class(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.SOUTH));
            this.id_class(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.WEST));
            this.id_class(rRI2, random, rfw_33.id_class((rja_3)rfw_32, rpr_3.EAST));
            rfw_32.id_class(rpr_3.DOWN);
            rfw_3 rfw_34 = new rfw_3();
            for (int i = -3; i < 4; ++i) {
                for (int j = -3; j < 4; ++j) {
                    int n = rfU_2.id_class(i) * rfU_2.id_class(j);
                    if (random.nextInt(10) >= 10 - n) continue;
                    rfw_34.id_class(rfw_32.id_break(i, 0, j));
                    int n2 = 3;
                    while (rRI2.id_finally(rfw_33.id_class((rja_3)rfw_34, rpr_3.DOWN))) {
                        rfw_34.id_class(rpr_3.DOWN);
                        if (--n2 > 0) continue;
                    }
                    if (rRI2.id_finally(rfw_33.id_class((rja_3)rfw_34, rpr_3.DOWN))) continue;
                    rRI2.id_class((rfH_2)rfw_34, xu_3.PK.id_continue(), 2);
                }
            }
            return true;
        }
        return false;
    }

    private boolean id_break(rRg_1 rRg_12, Random random, rfH_2 rfH_22) {
        if (random.nextInt(10) != 0) {
            rRg_12.id_class(rfH_22, xu_3.PK.id_continue(), 2);
            return true;
        }
        return false;
    }
}

