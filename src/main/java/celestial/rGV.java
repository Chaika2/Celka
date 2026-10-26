/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iO_2;
import celestial.rEb_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rRf_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhF_2;
import celestial.rhm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;
import java.util.Random;

public class rGV
extends rEb_1 {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.dP;
    }

    public rGV(aI_2<? extends rGV> aI_22, rYB rYB2) {
        super((aI_2<? extends rEb_1>)aI_22, rYB2);
    }

    public static boolean id_class(aI_2<rGV> aI_22, rRf_1 rRf_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rGV.id_break(aI_22, rRf_12, iO_22, rfH_22, random) && (iO_22 == iO_2.SPAWNER || rRf_12.id_case(rfH_22));
    }

    @Override
    protected rhm_3 id_break(rdn_3 rdn_32, float f) {
        rhm_3 rhm_32 = super.id_break(rdn_32, f);
        if (rhm_32 instanceof rhF_2) {
            ((rhF_2)rhm_32).id_class(new rLY(rLD.id_break, 600));
        }
        return rhm_32;
    }

    @Override
    public rqA_2 L() {
        return rqn_3.dB;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.xi;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.dr;
    }
}

