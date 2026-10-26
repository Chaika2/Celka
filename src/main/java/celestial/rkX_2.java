/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rkk_3;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rym_3;

public class rkX_2
extends rkk_3 {
    public rkX_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rYB2.id_class((rhd_3)null, rhd_32.rx(), rhd_32.re(), rhd_32.BO(), rqn_3.xw, rqL_2.PLAYERS, 0.5f, 0.4f / (id_private.nextFloat() * 0.4f + 0.8f));
        return super.id_class(rYB2, rhd_32, rpm_32);
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 0;
    }
}

