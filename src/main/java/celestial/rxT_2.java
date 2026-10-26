/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.QJ;
import celestial.dA_2;
import celestial.rYB;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhl_3;
import celestial.rhx_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjs_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrrZ;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class rxT_2
extends rdb_3 {
    public rxT_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        rfH_2 rfH_22;
        rYB rYB2 = rdH_22.id_int();
        xc_3 xc_32 = rYB2.id_byte(rfH_22 = rdH_22.id_class());
        if (xc_32.id_class(xu_3.SO) && !xc_32.id_byte(dA_2.id_final).booleanValue()) {
            if (rYB2.id_continue) {
                return ryZ_2.SUCCESS;
            }
            xc_3 xc_33 = (xc_3)xc_32.id_class(dA_2.id_final, true);
            xd_3.id_class(xc_32, xc_33, rYB2, rfH_22);
            rYB2.id_class(rfH_22, xc_33, 2);
            rYB2.id_byte(rfH_22, xu_3.SO);
            rdH_22.id_volatile().id_catch(1);
            rYB2.id_byte(1503, rfH_22, 0);
            QJ qJ = dA_2.id_break().id_class(rYB2, rfH_22);
            if (qJ != null) {
                rfH_2 rfH_23 = qJ.id_class().id_break(-3, 0, -3);
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        rYB2.id_class(rfH_23.id_break(i, 0, j), xu_3.SM.id_continue(), 2);
                    }
                }
                rYB2.id_break(1038, rfH_23.id_break(1, 0, 1), 0);
            }
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rfH_2 rfH_22;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rff_3 rff_32 = rxT_2.id_class(rYB2, rhd_32, rjs_3.NONE);
        if (((rjG_2)rff_32).id_byte() == rjM_2.BLOCK && rYB2.id_byte(rff_32.id_class()).id_class(xu_3.SO)) {
            return rym_3.id_byte(rdn_32);
        }
        rhd_32.id_break(rpm_32);
        if (rYB2 instanceof rrEm_1 && (rfH_22 = ((rrEm_1)rYB2).id_else().id_implements().id_class((rrEm_1)rYB2, rrrZ.id_extends, rhd_32.Bs(), 100, false)) != null) {
            rhl_3 rhl_32 = new rhl_3(rYB2, rhd_32.rx(), rhd_32.id_byte(0.5), rhd_32.BO());
            rhl_32.id_break(rdn_32);
            rhl_32.id_class(rfH_22);
            rYB2.a_(rhl_32);
            if (rhd_32 instanceof rhN_2) {
                Oo_1.id_volatile.id_class((rhN_2)rhd_32, rfH_22);
            }
            rYB2.id_class((rhd_3)null, rhd_32.rx(), rhd_32.re(), rhd_32.BO(), rqn_3.BC, rqL_2.NEUTRAL, 0.5f, 0.4f / (id_private.nextFloat() * 0.4f + 0.8f));
            rYB2.id_class((rhd_3)null, 1003, rhd_32.Bs(), 0);
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            rhd_32.id_class(rlB_2.id_byte.id_break(this));
            rhd_32.id_class(rpm_32, true);
            return rym_3.id_class(rdn_32);
        }
        return rym_3.id_break(rdn_32);
    }
}

