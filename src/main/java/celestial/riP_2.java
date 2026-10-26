/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDC;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class riP_2
extends rUO<rDC> {
    public riP_2(Codec<rDC> codec) {
        super(codec);
    }

    private static rfH_2 id_class(rRg_1 rRg_12, rfw_3 rfw_32, xd_3 xd_32) {
        while (rfw_32.c_() > 1) {
            xc_3 xc_32 = rRg_12.id_byte(rfw_32);
            if (xc_32.id_class(xd_32)) {
                return rfw_32;
            }
            rfw_32.id_class(rpr_3.DOWN);
        }
        return null;
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDC rDC2) {
        xd_3 xd_32 = rDC2.id_break.id_break();
        rfH_2 rfH_23 = riP_2.id_class(rRI2, rfH_22.id_new().id_class(rpB_2.Y, 1, rRI2.id_try() - 1), xd_32);
        if (rfH_23 == null) {
            return false;
        }
        int n = rDC2.id_class().id_class(random);
        boolean bl = false;
        for (rfH_2 rfH_24 : rfH_2.id_class(rfH_23, n, n, n)) {
            if (rfH_24.id_implements(rfH_23) > n) break;
            xc_3 xc_32 = rRI2.id_byte(rfH_24);
            if (!xc_32.id_class(xd_32)) continue;
            this.id_class(rRI2, rfH_24, rDC2.id_byte);
            bl = true;
        }
        return bl;
    }
}

