/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhF_2;
import celestial.rhm_3;

public class rxb_3
extends rdb_3 {
    public rxb_3(rdO_2 rdO_22) {
        super(rdO_22);
        rdO_22.id_class(true);
    }

    public rhm_3 id_class(rYB rYB2, rdn_3 rdn_32, iB_2 iB_22) {
        rhF_2 rhF_22 = new rhF_2(rYB2, iB_22);
        rhF_22.id_break(rdn_32);
        return rhF_22;
    }
}

