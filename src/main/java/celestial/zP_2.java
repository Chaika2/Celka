/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.rHU;
import celestial.rRq_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.xN_2;
import celestial.xc_3;

public class zP_2
extends dB_2 {
    protected zP_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return rdn_3.id_break;
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        super.id_class(xc_32, rrEm_12, rfH_22, rdn_32);
        int n = 15 + rrEm_12.id_int.nextInt(15) + rrEm_12.id_int.nextInt(15);
        this.id_class(rrEm_12, rfH_22, n);
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHU();
    }
}

