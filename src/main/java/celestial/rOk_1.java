/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aK_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.an_3;
import celestial.au_3;
import celestial.av_3;
import celestial.dj_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.ir_3;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBP;
import celestial.rBU;
import celestial.rBY;
import celestial.rBx_1;
import celestial.rLp_1;
import celestial.rLy_1;
import celestial.rOW;
import celestial.rOz_1;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSO;
import celestial.rXQ;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rbZ_2;
import celestial.rbs_3;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rkg_3;
import celestial.rlG_2;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqI_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import com.google.common.collect.Sets;
import java.util.LinkedHashSet;
import java.util.Random;

public class rOk_1
extends rbZ_2
implements aK_2,
ir_3 {
    private static final rkg_3 id_super = rkg_3.id_class(rdy_3.rC);
    private static final rkg_3 id_this = rkg_3.id_class(rdy_3.rC, rdy_3.dz);
    private static final rut_3<Integer> id_else = rmE_2.id_class(rOk_1.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rOk_1.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_return = rmE_2.id_class(rOk_1.class, ruw_3.id_implements);
    private final av_3 id_public;
    private rSO id_goto;
    private rBY id_while;

    @Override
    public boolean id_byte() {
        return this.id_public.id_break();
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.xh;
    }

    @Override
    protected boolean id_int() {
        return true;
    }

    public rOk_1(aI_2<? extends rOk_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_public = new av_3((rmE_2)this.id_throws[49], id_else, id_return);
        Boolean bl = true;
        this.id_throws[2] = bl;
        this.id_class(rLp_1.WATER, -1.0f);
        this.id_class(rLp_1.LAVA, 0.0f);
        this.id_class(rLp_1.DANGER_FIRE, 0.0f);
        this.id_class(rLp_1.DAMAGE_FIRE, 0.0f);
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, bl);
    }

    @Override
    public void id_this() {
        if (this.sd() && ((Random)this.id_throws[40]).nextInt(140) == 0) {
            this.id_class(rqn_3.xb, 1.0f, this.SN());
        } else if (this.sx() && ((Random)this.id_throws[40]).nextInt(60) == 0) {
            this.id_class(rqn_3.xM, 1.0f, this.SN());
        }
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(this.Bs());
        xc_3 xc_33 = this.Pl();
        boolean bl = xc_32.id_class(rls_3.C) || xc_33.id_class(rls_3.C) || this.id_break(rlG_2.id_byte) > 0.0;
        this.id_this(!bl);
        super.id_this();
        this.sc();
        this.Px();
    }

    public float n() {
        return (float)this.id_class(iQ_2.id_protected) * (this.L() ? 0.66f : 1.0f);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        aU_2 aU_23;
        if (this.n_()) {
            return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        }
        if (((Random)this.id_throws[40]).nextInt(30) == 0) {
            is_3 is_32 = aI_2.rb.id_class(rRf_12.id_byte());
            aU_23 = this.id_class(rRf_12, rRh_12, is_32, new rbs_3(rbB_2.id_class((Random)this.id_throws[40]), false));
            is_32.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.dz));
            this.id_class((rqL_2)null);
        } else if (((Random)this.id_throws[40]).nextInt(10) == 0) {
            au_3 au_32 = aI_2.w.id_class(rRf_12.id_byte());
            au_32.e_(-24000);
            aU_23 = this.id_class(rRf_12, rRh_12, au_32, (aU_2)null);
        } else {
            aU_23 = new am_3(0.5f);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_23, rcd_32);
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return rRR2.id_protected(this);
    }

    private aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, is_3 is_32, aU_2 aU_22) {
        is_32.id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), 0.0f);
        is_32.id_class(rRf_12, rRh_12, iO_2.JOCKEY, aU_22, (rcd_3)null);
        is_32.id_class((an_3)this, true);
        return new am_3(0.0f);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        if (rRR2.id_byte(rfH_22).id_volatile().id_class(rlG_2.id_byte)) {
            return 10.0f;
        }
        return this.ry() ? Float.NEGATIVE_INFINITY : 0.0f;
    }

    @Override
    public void id_class(rjU_2 rjU_22) {
        super.id_private(rjU_22);
    }

    @Override
    protected void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
        this.Px();
        if (this.ry()) {
            Float f = Float.valueOf(0.0f);
            this.id_throws[31] = f;
        } else {
            super.id_class(d, bl, xc_32, rfH_22);
        }
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public void id_class(rqL_2 rqL_22) {
        this.id_public.id_class(true);
        if (rqL_22 != null) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.xd, rqL_22, 0.5f, 1.0f);
        }
    }

    @Override
    public boolean id_class() {
        return this.BM() && !this.n_();
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_public.id_class(rcd_32);
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_else.equals(rut_32) && ((rYB)this.id_throws[7]).id_continue) {
            this.id_public.id_class();
        }
        super.id_class(rut_32);
    }

    @Override
    public boolean id_class(rXs_1 rXs_12) {
        return rXs_12.id_class(rlG_2.id_byte);
    }

    private void sc() {
        if (this.ry()) {
            rjm_3 rjm_32 = rjm_3.id_class(this);
            if (rjm_32.id_class(dj_3.id_package, this.Bs(), true) && !((rYB)this.id_throws[7]).id_break(this.Bs().id_final()).id_class(rlG_2.id_byte)) {
                Boolean bl = true;
                this.id_throws[20] = bl;
            } else {
                this.id_byte(this.rv().id_class(0.5).id_break(0.0, 0.05, 0.0));
            }
        }
    }

    private boolean sd() {
        return this.id_goto != null && this.id_goto.id_private();
    }

    public static boolean id_break(aI_2<rOk_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        rfw_3 rfw_32 = rfH_22.id_new();
        do {
            rfw_32.id_class(rpr_3.UP);
        } while (rRg_12.id_break(rfw_32).id_class(rlG_2.id_byte));
        return rRg_12.id_byte(rfw_32).id_catch();
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_public.id_break(rcd_32);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        boolean bl = this.id_extends(rhd_32.id_protected(rpm_32));
        if (!bl && this.id_byte() && !this.BP() && !rhd_32.sN()) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                rhd_32.id_this(this);
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        ryZ_2 ryZ_22 = super.id_break(rhd_32, rpm_32);
        if (!ryZ_22.id_class()) {
            rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
            return rdn_32.id_break() == rdy_3.hK ? rdn_32.id_class(rhd_32, (iB_2)this, rpm_32) : ryZ_2.PASS;
        }
        if (bl && !this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.xx, this.Pr(), 1.0f, 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f);
        }
        return ryZ_22;
    }

    public rOk_1 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.w.id_class(rrEm_12);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(this.ry() ? rqn_3.xJ : rqn_3.xX, 1.0f, 1.0f);
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rOW(this, rYB2);
    }

    @Override
    public float id_throws() {
        return (float)this.id_class(iQ_2.id_protected) * (this.L() ? 0.23f : 0.55f);
    }

    public boolean L() {
        return this.ra() instanceof rOk_1 ? ((rOk_1)this.ra()).L() : ((rmE_2)this.id_throws[49]).id_class(id_synchronized).booleanValue();
    }

    private boolean sx() {
        return this.id_while != null && this.id_while.id_private();
    }

    @Override
    public boolean G() {
        an_3 an_32 = this.rU();
        if (!(an_32 instanceof rhd_3)) {
            return false;
        }
        rhd_3 rhd_32 = (rhd_3)an_32;
        return rhd_32.ss().id_break() == rdy_3.dz || rhd_32.Sn().id_break() == rdy_3.dz;
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_super.id_class(rdn_32);
    }

    @Override
    protected boolean id_case(an_3 an_32) {
        return this.Bh().isEmpty() && !((an_3)this).id_class(rlG_2.id_byte);
    }

    @Override
    protected rqA_2 id_static() {
        return !this.sx() && !this.sd() ? rqn_3.xG : null;
    }

    @Override
    public boolean id_protected() {
        return this.id_public.id_class(this.Sa());
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        this.id_super(this.n());
        this.id_class(this, this.id_public, rjU_22);
    }

    @Override
    protected void id_final() {
        this.id_while = new rBY(this, 1.65);
        this.id_package.id_class(1, this.id_while);
        this.id_package.id_class(2, new rBP(this, 1.0));
        this.id_goto = new rSO((aA_2)this, 1.4, false, id_this);
        this.id_package.id_class(3, this.id_goto);
        this.id_package.id_class(4, new rOz_1(this, 1.5));
        this.id_package.id_class(5, new rBx_1(this, 1.1));
        this.id_package.id_class(7, new rBU(this, 1.0, 60));
        this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_package.id_class(9, new rBA(this, rOk_1.class, 8.0f));
    }

    @Override
    protected float rQ() {
        return ((Float)this.id_throws[30]).floatValue() + 0.6f;
    }

    @Override
    public boolean Pz() {
        return false;
    }

    @Override
    public an_3 rU() {
        return this.Bh().isEmpty() ? null : this.Bh().get(0);
    }

    @Override
    public double PS() {
        float f = Math.min(0.25f, ((Float)this.id_private[18]).floatValue());
        float f2 = ((Float)this.id_private[19]).floatValue();
        return (double)this.Bm() - 0.19 + (double)(0.12f * rfU_2.id_break(f2 * 1.5f) * 2.0f * f);
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.6f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.xO;
    }

    @Override
    public boolean BU() {
        return true;
    }

    public static iz_3 sJ() {
        return is_3.id_package().id_class(iQ_2.id_protected, 0.175f).id_class(iQ_2.id_break, 16.0);
    }

    @Override
    protected void Sx() {
        super.Sx();
        if (this.id_byte()) {
            this.id_class((rpL_2)rdy_3.hK);
        }
    }

    @Override
    public rjU_2 a_(iB_2 iB_22) {
        rjU_2[] rjU_2Array = new rjU_2[]{rOk_1.id_class(this.PN(), (double)iB_22.PN(), ((Float)iB_22.id_throws[15]).floatValue()), rOk_1.id_class(this.PN(), (double)iB_22.PN(), ((Float)iB_22.id_throws[15]).floatValue() - 22.5f), rOk_1.id_class(this.PN(), (double)iB_22.PN(), ((Float)iB_22.id_throws[15]).floatValue() + 22.5f), rOk_1.id_class(this.PN(), (double)iB_22.PN(), ((Float)iB_22.id_throws[15]).floatValue() - 45.0f), rOk_1.id_class(this.PN(), (double)iB_22.PN(), ((Float)iB_22.id_throws[15]).floatValue() + 45.0f)};
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        double d = this.rN().id_throws;
        double d2 = this.rN().id_break - 0.5;
        rfw_3 rfw_32 = new rfw_3();
        for (rjU_2 rjU_22 : rjU_2Array) {
            rfw_32.id_break(this.rx() + rjU_22.id_break, d, this.BO() + rjU_22.id_protected);
            for (double d3 = d; d3 > d2; d3 -= 1.0) {
                linkedHashSet.add(rfw_32.id_int());
                rfw_32.id_class(rpr_3.DOWN);
            }
        }
        for (rfH_2 rfH_22 : linkedHashSet) {
            double d4;
            if (((rYB)this.id_throws[7]).id_break(rfH_22).id_class(rlG_2.id_byte) || !rqI_2.id_class(d4 = ((rYB)this.id_throws[7]).id_private(rfH_22))) continue;
            rjU_2 rjU_23 = rjU_2.id_class(rfH_22, d4);
            for (iM_2 iM_22 : iB_22.BV()) {
                rfl_3 rfl_32 = iB_22.id_catch(iM_22);
                if (!rqI_2.id_class((rYB)this.id_throws[7], iB_22, rfl_32.id_protected(rjU_23))) continue;
                iB_22.id_class(iM_22);
                return rjU_23;
            }
        }
        return new rjU_2(this.rx(), this.rN().id_throws, this.BO());
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_else, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
        ((rmE_2)this.id_throws[49]).id_class(id_return, false);
    }
}

