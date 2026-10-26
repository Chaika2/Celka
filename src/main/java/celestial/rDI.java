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
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDI
extends rUO<rUt_1> {
    public rDI(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        if (rfH_22.c_() > rRI2.id_short() - 1) {
            return false;
        }
        if (!rRI2.id_byte(rfH_22).id_class(xu_3.id_try) && !rRI2.id_byte(rfH_22.id_break()).id_class(xu_3.id_try)) {
            return false;
        }
        boolean bl = false;
        for (rpr_3 object : rpr_3.values()) {
            if (object == rpr_3.DOWN || !rRI2.id_byte(rfH_22.id_break(object)).id_class(xu_3.Ei)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return false;
        }
        rRI2.id_class(rfH_22, xu_3.hP.id_continue(), 2);
        block1: for (int i = 0; i < 200; ++i) {
            rfH_2 rfH_23;
            xc_3 xc_32;
            int n = random.nextInt(5) - random.nextInt(6);
            int n2 = 3;
            if (n < 2) {
                n2 += n / 2;
            }
            if (n2 < 1 || (xc_32 = rRI2.id_byte(rfH_23 = rfH_22.id_break(random.nextInt(n2) - random.nextInt(n2), n, random.nextInt(n2) - random.nextInt(n2)))).id_byte() != QP.id_class && !xc_32.id_class(xu_3.id_try) && !xc_32.id_class(xu_3.Ei) && !xc_32.id_class(xu_3.PT)) continue;
            for (rpr_3 rpr_32 : rpr_3.values()) {
                xc_3 xc_33 = rRI2.id_byte(rfH_23.id_break(rpr_32));
                if (!xc_33.id_class(xu_3.hP)) continue;
                rRI2.id_class(rfH_23, xu_3.hP.id_continue(), 2);
                continue block1;
            }
        }
        return true;
    }
}

