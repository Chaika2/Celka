/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QP;
import celestial.dj_3;
import celestial.eC_2;
import celestial.eF_2;
import celestial.eX_2;
import celestial.eY_2;
import celestial.ev_3;
import celestial.iB_2;
import celestial.rRR;
import celestial.rXQ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rjm_3;
import celestial.xc_3;
import celestial.xu_3;

public class eD_2
extends ev_3 {
    public eD_2(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.ARMOR_FEET, rXQArray);
    }

    @Override
    public boolean id_class(ev_3 ev_32) {
        return super.id_class(ev_32) && ev_32 != eY_2.id_implements;
    }

    @Override
    public int id_class() {
        return 2;
    }

    public static void id_class(iB_2 iB_22, rYB rYB2, rfH_2 rfH_22, int n) {
        if (iB_22.BL()) {
            xc_3 xc_32 = xu_3.bj.id_continue();
            float f = Math.min(16, 2 + n);
            rfw_3 rfw_32 = new rfw_3();
            for (rfH_2 rfH_23 : rfH_2.id_class(rfH_22.id_byte(-f, -1.0, -f), rfH_22.id_byte(f, -1.0, f))) {
                xc_3 xc_33;
                if (!rfH_23.id_class((eX_2)iB_22.Ps(), (double)f)) continue;
                rfw_32.id_class(rfH_23.b_(), rfH_23.c_() + 1, rfH_23.d_());
                xc_3 xc_34 = rYB2.id_byte(rfw_32);
                if (!xc_34.id_catch() || (xc_33 = rYB2.id_byte(rfH_23)).id_byte() != QP.id_finally || xc_33.id_byte(dj_3.id_volatile) != 0 || !xc_32.id_class((rRR)rYB2, rfH_23) || !rYB2.id_class(xc_32, rfH_23, rjm_3.id_break())) continue;
                rYB2.id_break(rfH_23, xc_32);
                rYB2.id_finally().id_class(rfH_23, xu_3.bj, rfU_2.id_class(iB_22.Sa(), 60, 120));
            }
        }
    }

    @Override
    public int id_class(int n) {
        return n * 10;
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + 15;
    }

    @Override
    public boolean id_break() {
        return true;
    }
}

