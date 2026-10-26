/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rGw_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rcd_3;

public class rEX
extends rGw_1 {
    public rEX(aI_2<? extends rEX> aI_22, rYB rYB2) {
        super((aI_2<? extends rGw_1>)aI_22, rYB2);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        return aU_22;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.45f;
    }

    public static iz_3 id_throws() {
        return rGw_1.L().id_class(iQ_2.id_class, 12.0);
    }

    @Override
    public boolean id_public(an_3 an_32) {
        if (super.id_public(an_32)) {
            if (an_32 instanceof iB_2) {
                int n = 0;
                if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL) {
                    n = 7;
                } else if (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
                    n = 15;
                }
                if (n > 0) {
                    ((iB_2)an_32).id_break(new rLY(rLD.id_super, n * 20, 0));
                }
            }
            return true;
        }
        return false;
    }
}

