/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpr_3;
import celestial.rxa_3;

public class rdh_3
extends rxa_3 {
    public rdh_3(rdO_2 rdO_22) {
        super(aI_2.id_default, rdO_22);
    }

    @Override
    protected boolean id_class(rhd_3 rhd_32, rpr_3 rpr_32, rdn_3 rdn_32, rfH_2 rfH_22) {
        return !rYB.id_super(rfH_22) && rhd_32.id_class(rfH_22, rpr_32, rdn_32);
    }
}

