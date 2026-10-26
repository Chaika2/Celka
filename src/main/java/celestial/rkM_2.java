/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhx_3;

public class rkM_2
extends rdb_3 {
    public rkM_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public rdn_3 id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        rdn_3 rdn_33 = super.id_class(rdn_32, rYB2, iB_22);
        return iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_protected ? rdn_33 : new rdn_3(rdy_3.OU);
    }
}

