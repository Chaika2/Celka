/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.VD;
import celestial.rAB;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rkk_3;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rym_3;
import java.util.List;

public class rdt_3
extends rkk_3 {
    public rdt_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rAB.id_class(rdn_32, list, 0.25f);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rYB2.id_class((rhd_3)null, rhd_32.rx(), rhd_32.re(), rhd_32.BO(), rqn_3.Gh, rqL_2.NEUTRAL, 0.5f, 0.4f / (id_private.nextFloat() * 0.4f + 0.8f));
        return super.id_class(rYB2, rhd_32, rpm_32);
    }
}

