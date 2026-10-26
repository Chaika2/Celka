/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Wy_1;
import celestial.dd_3;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rDo_1
extends rUO<rUt_1> {
    public rDo_1(Codec<rUt_1> codec) {
        super(codec);
    }

    protected abstract boolean id_class(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4);

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        xc_3 xc_32 = ((xd_3)rls_3.s.id_class(random)).id_continue();
        return this.id_class(rRI2, random, rfH_22, xc_32);
    }

    protected boolean id_break(rRg_1 rRg_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        rfH_2 rfH_23 = rfH_22.id_final();
        xc_3 xc_33 = rRg_12.id_byte(rfH_22);
        if ((xc_33.id_class(xu_3.id_try) || xc_33.id_class(rls_3.b)) && rRg_12.id_byte(rfH_23).id_class(xu_3.id_try)) {
            rRg_12.id_class(rfH_22, xc_32, 3);
            if (random.nextFloat() < 0.25f) {
                rRg_12.id_class(rfH_23, ((xd_3)rls_3.b.id_class(random)).id_continue(), 2);
            } else if (random.nextFloat() < 0.05f) {
                rRg_12.id_class(rfH_23, (xc_3)xu_3.hr.id_continue().id_class(Wy_1.id_volatile, random.nextInt(4) + 1), 2);
            }
            for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                rfH_2 rfH_24;
                if (!(random.nextFloat() < 0.2f) || !rRg_12.id_byte(rfH_24 = rfH_22.id_break(rpr_32)).id_class(xu_3.id_try)) continue;
                xc_3 xc_34 = (xc_3)((xd_3)rls_3.E.id_class(random)).id_continue().id_class(dd_3.id_final, rpr_32);
                rRg_12.id_class(rfH_24, xc_34, 2);
            }
            return true;
        }
        return false;
    }
}

