/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.ap_3;
import celestial.au_3;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBP;
import celestial.rBY;
import celestial.rBx_1;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rkg_3;
import celestial.rpO_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;

public class rbY_2
extends rbZ_2 {
    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.PW;
    }

    public rbY_2(aI_2<? extends rbY_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.hg && !this.n_()) {
            rhd_32.id_class(rqn_3.Pz, 1.0f, 1.0f);
            rdn_3 rdn_33 = rpO_2.id_class(rdn_32, rhd_32, rdy_3.hi.id_continue());
            rhd_32.id_class(rpm_32, rdn_33);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    public rbY_2 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.id_native.id_class(rrEm_12);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? ap_32.id_break * 0.95f : 1.3f;
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.PQ, 0.15f, 1.0f);
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.2f);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Pd;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rBY(this, 2.0));
        this.id_package.id_class(2, new rBP(this, 1.0));
        this.id_package.id_class(3, new rSO((aA_2)this, 1.25, rkg_3.id_class(rdy_3.hB), false));
        this.id_package.id_class(4, new rBx_1(this, 1.25));
        this.id_package.id_class(5, new rSk_1(this, 1.0));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(7, new rBC(this));
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Pk;
    }

    @Override
    protected float Si() {
        return 0.4f;
    }
}

