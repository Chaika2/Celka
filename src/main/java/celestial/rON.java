/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.au_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rOA;
import celestial.rOC;
import celestial.rOF;
import celestial.rOL;
import celestial.rOZ;
import celestial.rOc_1;
import celestial.rOm_1;
import celestial.rOn_1;
import celestial.rOu_1;
import celestial.rOv_1;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rRu_1;
import celestial.rSg_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zH_2;
import java.util.Random;
import java.util.function.Predicate;

public class rON
extends rbZ_2 {
    private static final rut_3<rfH_2> id_this = rmE_2.id_class(rON.class, ruw_3.id_native);
    private static final rut_3<Boolean> id_else = rmE_2.id_class(rON.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rON.class, ruw_3.id_implements);
    private static final rut_3<rfH_2> id_return = rmE_2.id_class(rON.class, ruw_3.id_native);
    private static final rut_3<Boolean> id_public = rmE_2.id_class(rON.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_goto = rmE_2.id_class(rON.class, ruw_3.id_implements);
    public int id_while;
    public static final Predicate<iB_2> id_super = iB_22 -> iB_22.n_() && !iB_22.rT();

    @Override
    public int id_char() {
        return 200;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return this.n_() ? rqn_3.dy : rqn_3.dH;
    }

    public static /* synthetic */ Random id_byte(rON rON2) {
        return (Random)rON2.id_throws[40];
    }

    public rON(aI_2<? extends rON> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_class(rLp_1.WATER, 0.0f);
        this.id_native = new rOv_1(this);
        Float f = Float.valueOf(1.0f);
        this.id_throws[37] = f;
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_else, bl);
    }

    public boolean n() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_implements(this.Bs());
        this.id_finally(rfH_2.id_protected);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        if (!this.sc() && rRR2.id_break(rfH_22).id_class(rlG_2.id_break)) {
            return 10.0f;
        }
        return zH_2.id_class(rRR2, rfH_22) ? 10.0f : rRR2.id_native(rfH_22) - 0.5f;
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.o.id_class(rrEm_12);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("HomePosX", this.sx().b_());
        rcd_32.id_break("HomePosY", this.sx().c_());
        rcd_32.id_break("HomePosZ", this.sx().d_());
        rcd_32.id_class("HasEgg", this.L());
        rcd_32.id_break("TravelPosX", this.sd().b_());
        rcd_32.id_break("TravelPosY", this.sd().c_());
        rcd_32.id_break("TravelPosZ", this.sd().d_());
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
        this.id_break(rye_3.id_break, Float.MAX_VALUE);
    }

    public static /* synthetic */ Random id_class(rON rON2) {
        return (Random)rON2.id_throws[40];
    }

    public boolean sc() {
        return ((rmE_2)this.id_throws[49]).id_class(id_public);
    }

    @Override
    public void id_default() {
        rfH_2 rfH_22;
        super.id_default();
        if (this.BM() && this.n() && this.id_while >= 1 && this.id_while % 5 == 0 && zH_2.id_class((rYB)this.id_throws[7], rfH_22 = this.Bs())) {
            ((rYB)this.id_throws[7]).id_byte(2001, rfH_22, xd_3.id_finally(xu_3.id_throw.id_continue()));
        }
    }

    public rfH_2 sd() {
        return ((rmE_2)this.id_throws[49]).id_class(id_return);
    }

    @Override
    public boolean u() {
        return false;
    }

    public static /* synthetic */ boolean id_break(rON rON2) {
        return (Boolean)rON2.id_throws[20];
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        rqA_2 rqA_22 = this.n_() ? rqn_3.dT : rqn_3.dq;
        this.id_class(rqA_22, 0.15f, 1.0f);
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rOF(this, rYB2);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        int n = rcd_32.id_private("HomePosX");
        int n2 = rcd_32.id_private("HomePosY");
        int n3 = rcd_32.id_private("HomePosZ");
        this.id_implements(new rfH_2(n, n2, n3));
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("HasEgg"));
        int n4 = rcd_32.id_private("TravelPosX");
        int n5 = rcd_32.id_private("TravelPosY");
        int n6 = rcd_32.id_private("TravelPosZ");
        this.id_finally(new rfH_2(n4, n5, n6));
    }

    public static boolean id_break(aI_2<rON> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rfH_22.c_() < rRg_12.id_short() + 4 && zH_2.id_class(rRg_12, rfH_22) && rRg_12.id_class(rfH_22, 0) > 8;
    }

    public boolean L() {
        return ((rmE_2)this.id_throws[49]).id_class(id_else);
    }

    public rfH_2 sx() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    @Override
    public boolean sk() {
        return super.sk() && !this.L();
    }

    public void id_finally(rfH_2 rfH_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_return, rfH_22);
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break() == xu_3.rr.id_case();
    }

    public void id_else(boolean bl) {
        this.id_while = bl ? 1 : 0;
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, bl);
    }

    public void id_implements(rfH_2 rfH_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, rfH_22);
    }

    public void id_return(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_goto, bl);
    }

    @Override
    protected rqA_2 id_static() {
        return !this.rT() && (Boolean)this.id_throws[20] != false && !this.n_() ? rqn_3.dF : super.id_static();
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return false;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.id_try() && this.rT()) {
            this.id_class(0.1f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class(0.9));
            if (!(this.I_() != null || this.sc() && this.sx().id_class((eX_2)this.Ps(), 20.0))) {
                this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
            }
        } else {
            super.id_private(rjU_22);
        }
    }

    @Override
    protected void id_private(float f) {
        super.id_private(f * 1.5f);
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rOL(this, 1.2));
        this.id_package.id_class(1, new rOZ(this, 1.0));
        this.id_package.id_class(1, new rOm_1(this, 1.0));
        this.id_package.id_class(2, new rOA(this, 1.1, xu_3.rr.id_case()));
        this.id_package.id_class(3, new rOu_1(this, 1.0));
        this.id_package.id_class(4, new rOc_1(this, 1.0));
        this.id_package.id_class(7, new rOn_1(this, 1.0));
        this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(9, new rOC(this, 1.0, 100));
    }

    public void id_synchronized(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_public, bl);
    }

    @Override
    protected void P_() {
        super.P_();
        if (!this.n_() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws)) {
            this.id_class(rdy_3.OE, 1);
        }
    }

    @Override
    protected float rQ() {
        return ((Float)this.id_throws[30]).floatValue() + 0.15f;
    }

    @Override
    protected rqA_2 BB() {
        return rqn_3.dt;
    }

    @Override
    protected rqA_2 Bt() {
        return this.n_() ? rqn_3.dA : rqn_3.dL;
    }

    public static iz_3 sJ() {
        return is_3.id_package().id_class(iQ_2.id_class, 30.0).id_class(iQ_2.id_protected, 0.25);
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_throws;
    }

    @Override
    public float SR() {
        return this.n_() ? 0.3f : 1.0f;
    }

    public boolean su() {
        return ((rmE_2)this.id_throws[49]).id_class(id_goto);
    }

    @Override
    public boolean SO() {
        return true;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_this, rfH_2.id_protected);
        ((rmE_2)this.id_throws[49]).id_class(id_else, false);
        ((rmE_2)this.id_throws[49]).id_class(id_return, rfH_2.id_protected);
        ((rmE_2)this.id_throws[49]).id_class(id_public, false);
        ((rmE_2)this.id_throws[49]).id_class(id_goto, false);
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
    }
}

