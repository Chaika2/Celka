/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rku_3;
import celestial.ryS_2;
import celestial.xc_3;
import celestial.xd_3;

public class rks_3
extends rku_3 {
    public rks_3(rdO_2 rdO_22, xd_3 xd_32, xd_3 xd_33) {
        super(xd_32, xd_33, rdO_22);
    }

    @Override
    protected boolean id_class(rfH_2 rfH_22, rYB rYB2, rhd_3 rhd_32, rdn_3 rdn_32, xc_3 xc_32) {
        boolean bl = super.id_class(rfH_22, rYB2, rhd_32, rdn_32, xc_32);
        if (!rYB2.id_continue && !bl && rhd_32 != null) {
            rhd_32.id_class((ryS_2)rYB2.id_class(rfH_22));
        }
        return bl;
    }
}

