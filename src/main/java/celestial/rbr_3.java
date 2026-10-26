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
import celestial.is_3;
import celestial.rBI;
import celestial.rEJ;
import celestial.rEb_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rLp_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbM_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhm_3;
import celestial.rpL_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rye_3;

public class rbr_3
extends rEb_1 {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.WS;
    }

    public rbr_3(aI_2<? extends rbr_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rEb_1>)aI_22, rYB2);
        this.id_class(rLp_1.LAVA, 8.0f);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        rEJ rEJ2;
        super.id_class(rye_32, n, bl);
        an_3 an_32 = rye_32.id_extends();
        if (an_32 instanceof rEJ && (rEJ2 = (rEJ)an_32).sd()) {
            rEJ2.sk();
            this.id_class((rpL_2)rdy_3.dX);
        }
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Om));
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        aU_2 aU_23 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        this.id_byte(iQ_2.id_case).id_class(4.0);
        this.sJ();
        return aU_23;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 2.1f;
    }

    @Override
    protected rhm_3 id_break(rdn_3 rdn_32, float f) {
        rhm_3 rhm_32 = super.id_break(rdn_32, f);
        rhm_32.id_case(100);
        return rhm_32;
    }

    @Override
    protected void id_break(rRh_1 rRh_12) {
    }

    @Override
    public boolean id_throws(rLY rLY2) {
        return rLY2.id_class() == rLD.id_this ? false : super.id_throws(rLY2);
    }

    @Override
    public rqA_2 L() {
        return rqn_3.Ws;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.WP;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        if (!super.id_public(an_32)) {
            return false;
        }
        if (an_32 instanceof iB_2) {
            ((iB_2)an_32).id_break(new rLY(rLD.id_this, 200));
        }
        return true;
    }

    @Override
    protected void id_final() {
        this.id_int.id_class(3, new rBI<rbM_2>((is_3)this, rbM_2.class, true));
        super.id_final();
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.WB;
    }
}

