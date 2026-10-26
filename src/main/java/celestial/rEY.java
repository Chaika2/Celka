/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.rLD;
import celestial.rLY;
import celestial.rRf_1;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;
import java.util.Random;

public class rEY
extends rbB_2 {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.EQ;
    }

    public rEY(aI_2<? extends rEY> aI_22, rYB rYB2) {
        super((aI_2<? extends rbB_2>)aI_22, rYB2);
    }

    public static boolean id_class(aI_2<rEY> aI_22, rRf_1 rRf_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rEY.id_break(aI_22, rRf_12, iO_22, rfH_22, random) && (iO_22 == iO_2.SPAWNER || rRf_12.id_case(rfH_22));
    }

    @Override
    protected boolean sd() {
        return true;
    }

    @Override
    protected rdn_3 sx() {
        return rdn_3.id_break;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Ek;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl = super.id_public(an_32);
        if (bl && this.ss().id_class() && an_32 instanceof iB_2) {
            float f = ((rYB)this.id_throws[7]).id_throws(this.Bs()).id_break();
            ((iB_2)an_32).id_break(new rLY(rLD.id_new, 140 * (int)f));
        }
        return bl;
    }

    @Override
    protected boolean R_() {
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Ez;
    }

    @Override
    protected rqA_2 sJ() {
        return rqn_3.EN;
    }

    @Override
    protected void sW() {
        this.id_break(aI_2.rs);
        if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1041, this.Bs(), 0);
        }
    }
}

