/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.fJ_2;
import celestial.fZ_2;
import celestial.lo_3;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rRp_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rsB_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.yS_2;
import java.util.Random;

public class pD_2
extends pV_2<rsB_2> {
    public pD_2(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.5f;
    }

    @Override
    public rqO_2 id_class(rsB_2 rsB_22) {
        return fJ_2.id_class;
    }

    @Override
    public void id_class(rsB_2 rsB_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        rYB rYB2;
        xc_3 xc_32 = rsB_22.id_case();
        if (xc_32.id_private() == xN_2.MODEL && xc_32 != (rYB2 = rsB_22.id_throws()).id_byte(rsB_22.Bs()) && xc_32.id_private() != xN_2.INVISIBLE) {
            ml_1.id_class();
            rfH_2 rfH_22 = new rfH_2(rsB_22.rx(), rsB_22.rN().id_throws, rsB_22.BO());
            ml_1.id_class(-0.5, 0.0, -0.5);
            lo_3 lo_32 = QY.id_instanceof().id_synchronized();
            lo_32.id_byte().id_class((rRp_1)rYB2, lo_32.id_class(xc_32), xc_32, rfH_22, ml_1, hx_1.getBuffer(yS_2.id_break(xc_32)), false, new Random(), xc_32.id_break(rsB_22.id_protected()), fZ_2.id_class);
            ml_1.id_break();
            super.id_class(rsB_22, f, f2, ml_1, hx_1, n);
        }
    }
}

