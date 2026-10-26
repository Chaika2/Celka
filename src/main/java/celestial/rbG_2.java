/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ag_3;
import celestial.iB_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rLp_1;
import celestial.rRO;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSP;
import celestial.rSW;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbB_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEm_1;
import celestial.rye_3;
import celestial.xu_3;
import java.util.Random;
import java.util.UUID;

public class rbG_2
extends rbB_2
implements ag_3 {
    private static final UUID id_class = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final ix_3 id_break = new ix_3(id_class, "Attacking speed boost", 0.05, id_3.ADDITION);
    private static final rqb_3 id_protected = rqt_3.id_class(0, 1);
    private int id_super;
    private static final rqb_3 id_this = rqt_3.id_class(20, 39);
    private int id_else;
    private UUID id_synchronized;
    private static final rqb_3 id_return = rqt_3.id_class(4, 6);
    private int id_public;

    @Override
    public void id_byte(iB_2 iB_22) {
        if (this.I_() == null && iB_22 != null) {
            this.id_super = id_protected.id_class((Random)this.id_throws[40]);
            this.id_public = id_return.id_class((Random)this.id_throws[40]);
        }
        if (iB_22 instanceof rhd_3) {
            this.id_break((rhd_3)iB_22);
        }
        super.id_byte(iB_22);
    }

    @Override
    public UUID id_byte() {
        return this.id_synchronized;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.zB;
    }

    @Override
    protected void id_double() {
        ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
        if (this.T_()) {
            if (!this.n_() && !ic_32.id_class(id_break)) {
                ic_32.id_break(id_break);
            }
            this.sZ();
        } else if (ic_32.id_class(id_break)) {
            ic_32.id_protected(id_break);
        }
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
        if (this.I_() != null) {
            this.sv();
        }
        if (this.T_()) {
            Integer n = (int)((Integer)this.id_throws[41]);
            this.id_private[31] = n;
        }
        super.id_double();
    }

    public rbG_2(aI_2<? extends rbG_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rbB_2>)aI_22, rYB2);
        this.id_class(rLp_1.LAVA, 8.0f);
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return rRR2.id_protected(this) && !rRR2.id_protected(this.rN());
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OA));
    }

    @Override
    public void id_class(int n) {
        this.id_else = n;
    }

    @Override
    public int id_class() {
        return this.id_else;
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_synchronized = uUID;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.a_(rcd_32);
    }

    @Override
    protected void sc() {
        this.id_byte(iQ_2.id_native).id_class(0.0);
    }

    @Override
    protected boolean sd() {
        return false;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), rcd_32);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return this.id_class(rye_32) ? false : super.id_break(rye_32, f);
    }

    public static boolean id_break(aI_2<rbG_2> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rRg_12.id_abstract() != rRO.PEACEFUL && rRg_12.id_byte(rfH_22.id_break()).id_break() != xu_3.bg;
    }

    @Override
    public boolean id_throws(rhd_3 rhd_32) {
        return this.b_(rhd_32);
    }

    @Override
    protected void id_throws() {
        this.id_package.id_class(2, new rSW(this, 1.0, false));
        this.id_package.id_class(7, new rSk_1(this, 1.0));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, this::b_));
        this.id_int.id_class(3, new rSP<rbG_2>(this, true));
    }

    @Override
    protected rdn_3 sx() {
        return rdn_3.id_break;
    }

    private void sv() {
        if (this.id_public > 0) {
            --this.id_public;
        } else {
            if (this.id_goto().id_class(this.I_())) {
                this.sF();
            }
            this.id_public = id_return.id_class((Random)this.id_throws[40]);
        }
    }

    @Override
    protected rqA_2 id_static() {
        return this.T_() ? rqn_3.zr : rqn_3.Wi;
    }

    @Override
    public void id_protected() {
        this.id_class(id_this.id_class((Random)this.id_throws[40]));
    }

    @Override
    public double Pv() {
        return this.n_() ? -0.05 : -0.45;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.zP;
    }

    private void sL() {
        this.id_class(rqn_3.zr, this.Si() * 2.0f, this.SN() * 1.8f);
    }

    public static iz_3 su() {
        return rbB_2.sz().id_class(iQ_2.id_native, 0.0).id_class(iQ_2.id_protected, 0.23f).id_class(iQ_2.id_case, 5.0);
    }

    private void sZ() {
        if (this.id_super > 0) {
            --this.id_super;
            if (this.id_super == 0) {
                this.sL();
            }
        }
    }

    private void sF() {
        double d = this.id_class(iQ_2.id_break);
        rfl_3 rfl_32 = rfl_3.id_class(this.Ps()).id_byte(d, 10.0, d);
        ((rYB)this.id_throws[7]).id_break(rbG_2.class, rfl_32).stream().filter(rbG_22 -> rbG_22 != this).filter(rbG_22 -> rbG_22.I_() == null).filter(rbG_22 -> !rbG_22.id_final(this.I_())).forEach(rbG_22 -> rbG_22.id_byte(this.I_()));
    }
}

