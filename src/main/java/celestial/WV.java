/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wf_1;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rzP_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zV_2;
import java.util.List;

public class WV
extends zV_2 {
    protected WV(Jq_1 jq_1) {
        super(Wf_1.PLAYER, jq_1);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        xu_3.sd.id_class(rYB2, rfH_22, xc_32, iB_22, rdn_32);
    }

    @Override
    public List<rdn_3> id_class(xc_3 xc_32, rzP_2 rzP_22) {
        return xu_3.sd.id_class(xc_32, rzP_22);
    }
}

