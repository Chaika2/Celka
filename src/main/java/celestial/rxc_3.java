/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rYB;
import celestial.rba_3;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;

public class rxc_3
extends rdb_3 {
    public rxc_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        rdn_3 rdn_33 = super.id_class(rdn_32, rYB2, iB_22);
        if (!rYB2.id_continue) {
            double d = iB_22.rx();
            double d2 = iB_22.re();
            double d3 = iB_22.BO();
            for (int i = 0; i < 16; ++i) {
                double d4 = iB_22.rx() + (iB_22.Sa().nextDouble() - 0.5) * 16.0;
                double d5 = rfU_2.id_class(iB_22.re() + (double)(iB_22.Sa().nextInt(16) - 8), 0.0, (double)(rYB2.id_float() - 1));
                double d6 = iB_22.BO() + (iB_22.Sa().nextDouble() - 0.5) * 16.0;
                if (iB_22.Pm()) {
                    iB_22.BH();
                }
                if (!iB_22.id_class(d4, d5, d6, true)) continue;
                rqA_2 rqA_22 = iB_22 instanceof rba_3 ? rqn_3.SH : rqn_3.rK;
                rYB2.id_class((rhd_3)null, d, d2, d3, rqA_22, rqL_2.PLAYERS, 1.0f, 1.0f);
                iB_22.id_class(rqA_22, 1.0f, 1.0f);
                break;
            }
            if (iB_22 instanceof rhd_3) {
                ((rhd_3)iB_22).sK().id_class((rdb_3)this, 20);
            }
        }
        return rdn_33;
    }
}

