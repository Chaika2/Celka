/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.aI_2;
import celestial.ap_3;
import celestial.iG_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBY;
import celestial.rLw_1;
import celestial.rLy_1;
import celestial.rOT;
import celestial.rOl_1;
import celestial.rOq_1;
import celestial.rPD;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpJ_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public abstract class rOp_1
extends rOl_1 {
    private static final rut_3<Boolean> id_class = rmE_2.id_class(rOp_1.class, ruw_3.id_implements);

    public rOp_1(aI_2<? extends rOp_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOl_1>)aI_22, rYB2);
        this.id_native = new rOq_1(this);
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl);
    }

    protected boolean n() {
        return true;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("FromBucket", this.sx());
    }

    @Override
    public void id_default() {
        if (!this.rT() && ((Boolean)this.id_throws[20]).booleanValue() && ((Boolean)this.id_throws[24]).booleanValue()) {
            this.id_byte(this.rv().id_break((((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * 0.05f, 0.4f, (((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * 0.05f));
            Boolean bl = false;
            this.id_throws[20] = bl;
            Boolean bl2 = true;
            this.id_throws[57] = bl2;
            this.id_class(this.sJ(), this.Si(), this.SN());
        }
        super.id_default();
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.65f;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("FromBucket"));
    }

    public static boolean id_break(aI_2<? extends rOp_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_byte(rfH_22).id_class(xu_3.id_try) && rRg_12.id_byte(rfH_22.id_final()).id_class(xu_3.id_try);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rLw_1(this, rYB2);
    }

    @Override
    protected ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_break() == rdy_3.hR && this.BM()) {
            this.id_class(rqn_3.rN, 1.0f, 1.0f);
            rdn_32.id_catch(1);
            rdn_3 rdn_33 = this.L();
            this.id_extends(rdn_33);
            if (!((rYB)this.id_throws[7]).id_continue) {
                Oo_1.id_finally.id_class((rhN_2)rhd_32, rdn_33);
            }
            if (rdn_32.id_class()) {
                rhd_32.id_class(rpm_32, rdn_33);
            } else if (!((rhz_3)rhd_32.id_implements[1]).id_throws(rdn_33)) {
                rhd_32.id_class(rdn_33, false);
            }
            this.PD();
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    public static iz_3 id_throws() {
        return is_3.id_package().id_class(iQ_2.id_class, 3.0);
    }

    protected abstract rdn_3 L();

    private boolean sx() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    protected void id_extends(rdn_3 rdn_32) {
        if (this.Bk()) {
            rdn_32.id_class(this.rD());
        }
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.id_try() && this.rT()) {
            this.id_class(0.01f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class(0.9));
            if (this.I_() == null) {
                this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
            }
        } else {
            super.id_private(rjU_22);
        }
    }

    @Override
    public boolean id_private(double d) {
        return !this.sx() && !this.Bk();
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rBY(this, 1.25));
        this.id_package.id_class(2, new rPD<rhd_3>(this, rhd_3.class, 8.0f, 1.6, 1.4, rpJ_2.id_catch::test));
        this.id_package.id_class(4, new rOT(this));
    }

    @Override
    public boolean id_strictfp() {
        return super.id_strictfp() || this.sx();
    }

    @Override
    public int E() {
        return 8;
    }

    @Override
    protected rqA_2 BB() {
        return rqn_3.SW;
    }

    protected abstract rqA_2 sJ();

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, false);
    }
}

