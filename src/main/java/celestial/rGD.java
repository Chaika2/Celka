/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBU;
import celestial.rBc_1;
import celestial.rEB;
import celestial.rEP;
import celestial.rEi_1;
import celestial.rEr_1;
import celestial.rEs_1;
import celestial.rGU;
import celestial.rGa_1;
import celestial.rGe_1;
import celestial.rLA;
import celestial.rMZ;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rpc_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rsi_3;
import celestial.rsy_3;
import celestial.rye_3;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Predicate;

public class rGD
extends rsi_3 {
    public static final Predicate<rRO> id_protected = rRO2 -> rRO2 == rRO.NORMAL || rRO2 == rRO.HARD;
    public boolean id_super;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.ku;
    }

    @Override
    protected void id_double() {
        if (!this.c() && rpc_3.id_class(this)) {
            boolean bl = ((rrEm_1)((rYB)this.id_throws[7])).id_char(this.Bs());
            ((rLA)this.id_public()).id_class(bl);
        }
        super.id_double();
    }

    public rGD(aI_2<? extends rGD> aI_22, rYB rYB2) {
        super((aI_2<? extends rsi_3>)aI_22, rYB2);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        aU_2 aU_23 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        ((rLA)this.id_public()).id_class(true);
        this.id_class(rRh_12);
        this.id_break(rRh_12);
        return aU_23;
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        if (this.sx() == null) {
            this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OT));
        }
    }

    @Override
    public void id_class(int n, boolean bl) {
        boolean bl2;
        rdn_3 rdn_32 = new rdn_3(rdy_3.OT);
        rrEr_1 rrEr_12 = this.sx();
        int n2 = 1;
        if (n > rrEr_12.id_class(rRO.NORMAL)) {
            n2 = 2;
        }
        boolean bl3 = bl2 = ((Random)this.id_throws[40]).nextFloat() <= rrEr_12.id_else();
        if (bl2) {
            HashMap hashMap = Maps.newHashMap();
            hashMap.put(eY_2.id_volatile, n2);
            eA_2.id_class(hashMap, rdn_32);
        }
        this.id_class(rXQ.MAINHAND, rdn_32);
    }

    public static /* synthetic */ Random id_class(rGD rGD2) {
        return (Random)rGD2.id_throws[40];
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_super) {
            rcd_32.id_class("Johnny", true);
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("Johnny", 99)) {
            this.id_super = rcd_32.id_new("Johnny");
        }
    }

    @Override
    public void id_break(rgP_2 rgP_22) {
        super.id_break(rgP_22);
        if (!this.id_super && rgP_22 != null && rgP_22.getString().equals("Johnny")) {
            this.id_super = true;
        }
    }

    @Override
    public rEr_1 id_throws() {
        if (this.v()) {
            return rEr_1.ATTACKING;
        }
        return this.sW() ? rEr_1.CELEBRATING : rEr_1.CROSSED;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.kQ;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rGe_1(this));
        this.id_package.id_class(2, new rEP(this, this));
        this.id_package.id_class(3, new rEs_1(this, this, 10.0f));
        this.id_package.id_class(4, new rGU(this, this));
        this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
        this.id_int.id_class(3, new rBI<rsy_3>((is_3)this, rsy_3.class, true));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, true));
        this.id_int.id_class(4, new rGa_1(this));
        this.id_package.id_class(8, new rBU(this, 0.6));
        this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0f, 1.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 8.0f));
    }

    @Override
    public boolean id_final(an_3 an_32) {
        if (super.id_final(an_32)) {
            return true;
        }
        if (an_32 instanceof iB_2 && ((iB_2)an_32).sG() == aL_2.id_protected) {
            return this.BG() == null && an_32.BG() == null;
        }
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.kc;
    }

    public static iz_3 sN() {
        return rEi_1.sm().id_class(iQ_2.id_protected, 0.35f).id_class(iQ_2.id_break, 12.0).id_class(iQ_2.id_class, 24.0).id_class(iQ_2.id_case, 5.0);
    }

    @Override
    public rqA_2 sQ() {
        return rqn_3.kN;
    }
}

