/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhY_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rym_3;

public class rkb_3
extends rdb_3 {
    public rkb_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rYB2.id_class((rhd_3)null, rhd_32.rx(), rhd_32.re(), rhd_32.BO(), rqn_3.xu, rqL_2.NEUTRAL, 0.5f, 0.4f / (id_private.nextFloat() * 0.4f + 0.8f));
        if (!rYB2.id_continue) {
            rhY_2 rhY_22 = new rhY_2(rYB2, rhd_32);
            rhY_22.id_break(rdn_32);
            rhY_22.id_class(rhd_32, ((Float)rhd_32.id_throws[16]).floatValue(), ((Float)rhd_32.id_throws[15]).floatValue(), 0.0f, 1.5f, 1.0f);
            rYB2.a_(rhY_22);
        }
        rhd_32.id_class(rlB_2.id_byte.id_break(this));
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        return rym_3.id_class(rdn_32, rYB2.id_import());
    }
}

