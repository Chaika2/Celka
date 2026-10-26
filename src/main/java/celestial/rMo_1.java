/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aK_2;
import celestial.an_3;
import celestial.au_3;
import celestial.av_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.ir_3;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBP;
import celestial.rBY;
import celestial.rBx_1;
import celestial.rRO;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSg_1;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbG_2;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rmE_2;
import celestial.rpB_2;
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

public class rMo_1
extends rbZ_2
implements aK_2,
ir_3 {
    private static final rut_3<Boolean> id_super = rmE_2.id_class(rMo_1.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_this = rmE_2.id_class(rMo_1.class, ruw_3.id_break);
    private static final rkg_3 id_else = rkg_3.id_class(rdy_3.ds, rdy_3.dE, rdy_3.kX);
    private final av_3 id_synchronized;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.OD;
    }

    @Override
    public boolean id_byte() {
        return this.id_synchronized.id_break();
    }

    public rMo_1(aI_2<? extends rMo_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_synchronized = new av_3((rmE_2)this.id_throws[49], id_this, id_super);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_synchronized.id_class(rcd_32);
    }

    @Override
    public void id_class(rjU_2 rjU_22) {
        super.id_private(rjU_22);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
        if (rrEm_12.id_abstract() != rRO.PEACEFUL) {
            rbG_2 rbG_22 = aI_2.rb.id_class(rrEm_12);
            rbG_22.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OA));
            rbG_22.id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            rbG_22.id_protected(this.c());
            rbG_22.id_class(this.n_());
            if (this.Bk()) {
                rbG_22.id_break(this.rD());
                rbG_22.id_final(this.D());
            }
            rbG_22.b();
            rrEm_12.a_(rbG_22);
            this.PD();
        } else {
            super.id_class(rrEm_12, rSg_12);
        }
    }

    @Override
    public void id_class(rqL_2 rqL_22) {
        this.id_synchronized.id_class(true);
        if (rqL_22 != null) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.OU, rqL_22, 0.5f, 1.0f);
        }
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_this.equals(rut_32) && ((rYB)this.id_throws[7]).id_continue) {
            this.id_synchronized.id_class();
        }
        super.id_class(rut_32);
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public boolean id_class() {
        return this.BM() && !this.n_();
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_synchronized.id_break(rcd_32);
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
        return ryZ_22;
    }

    public rMo_1 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.x.id_class(rrEm_12);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.Oe, 0.15f, 1.0f);
    }

    @Override
    public float id_throws() {
        return (float)this.id_class(iQ_2.id_protected) * 0.225f;
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 0.25);
    }

    @Override
    public boolean G() {
        an_3 an_32 = this.rU();
        if (!(an_32 instanceof rhd_3)) {
            return false;
        }
        rhd_3 rhd_32 = (rhd_3)an_32;
        return rhd_32.ss().id_break() == rdy_3.dW || rhd_32.Sn().id_break() == rdy_3.dW;
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_else.id_class(rdn_32);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Oo;
    }

    @Override
    public boolean id_protected() {
        return this.id_synchronized.id_class(this.Sa());
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        this.id_class(this, this.id_synchronized, rjU_22);
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(1, new rBY(this, 1.25));
        this.id_package.id_class(3, new rBP(this, 1.0));
        this.id_package.id_class(4, new rSO((aA_2)this, 1.2, rkg_3.id_class(rdy_3.dW), false));
        this.id_package.id_class(4, new rSO((aA_2)this, 1.2, false, id_else));
        this.id_package.id_class(5, new rBx_1(this, 1.1));
        this.id_package.id_class(6, new rSk_1(this, 1.0));
        this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(8, new rBC(this));
    }

    @Override
    public an_3 rU() {
        return this.Bh().isEmpty() ? null : this.Bh().get(0);
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.6f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.OK;
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
        rpr_3 rpr_32 = this.rS();
        if (rpr_32.id_final() == rpB_2.Y) {
            return super.a_(iB_22);
        }
        int[][] nArray = rqI_2.id_class(rpr_32);
        rfH_2 rfH_22 = this.Bs();
        rfw_3 rfw_32 = new rfw_3();
        for (iM_2 iM_22 : iB_22.BV()) {
            rfl_3 rfl_32 = iB_22.id_catch(iM_22);
            for (int[] nArray2 : nArray) {
                rjU_2 rjU_22;
                rfw_32.id_class(rfH_22.b_() + nArray2[0], rfH_22.c_(), rfH_22.d_() + nArray2[1]);
                double d = ((rYB)this.id_throws[7]).id_private(rfw_32);
                if (!rqI_2.id_class(d) || !rqI_2.id_class((rYB)this.id_throws[7], iB_22, rfl_32.id_protected(rjU_22 = rjU_2.id_class(rfw_32, d)))) continue;
                iB_22.id_class(iM_22);
                return rjU_22;
            }
        }
        return super.a_(iB_22);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, false);
        ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
    }
}

