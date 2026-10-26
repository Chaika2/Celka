/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.an_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rOD;
import celestial.rSJ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rlG_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.ryZ_2;
import celestial.rye_3;

public class rhG_2
extends rOD {
    private final rSJ id_try = new rSJ(this);
    private boolean id_instanceof;
    private int id_throw;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        super.id_byte(rye_32);
        return rqn_3.Jn;
    }

    public rhG_2(aI_2<? extends rhG_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rOD>)aI_22, rYB2);
    }

    public void id_this(boolean bl) {
        if (bl != this.id_instanceof) {
            this.id_instanceof = bl;
            if (bl) {
                this.id_package.id_class(1, this.id_try);
            } else {
                this.id_package.id_class(this.id_try);
            }
        }
    }

    public static iz_3 n() {
        return rhG_2.sq().id_class(iQ_2.id_class, 15.0).id_class(iQ_2.id_protected, 0.2f);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("SkeletonTrap", this.sJ());
        rcd_32.id_break("SkeletonTrapTime", this.id_throw);
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.n.id_class(rrEm_12);
    }

    @Override
    public void id_default() {
        super.id_default();
        if (this.sJ() && this.id_throw++ >= 18000) {
            this.PD();
        }
    }

    @Override
    protected void sf() {
        if (this.rT()) {
            this.id_class(rqn_3.Jy, 0.4f, 1.0f);
        } else {
            super.sf();
        }
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!this.sm()) {
            return ryZ_2.PASS;
        }
        if (this.n_()) {
            return super.id_break(rhd_32, rpm_32);
        }
        if (rhd_32.sN()) {
            this.id_case(rhd_32);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (this.BP()) {
            return super.id_break(rhd_32, rpm_32);
        }
        if (!rdn_32.id_class()) {
            if (rdn_32.id_break() == rdy_3.hK && !this.id_byte()) {
                this.id_case(rhd_32);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            ryZ_2 ryZ_22 = rdn_32.id_class(rhd_32, (iB_2)this, rpm_32);
            if (ryZ_22.id_class()) {
                return ryZ_22;
            }
        }
        this.id_catch(rhd_32);
        return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("SkeletonTrap"));
        this.id_throw = rcd_32.id_private("SkeletonTrapTime");
    }

    @Override
    protected void L() {
        this.id_byte(iQ_2.id_volatile).id_class(this.sg());
    }

    @Override
    protected rqA_2 id_static() {
        super.id_static();
        return ((an_3)this).id_class(rlG_2.id_break) ? rqn_3.Jl : rqn_3.JL;
    }

    @Override
    protected void id_private(float f) {
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            super.id_private(0.3f);
        } else {
            super.id_private(Math.min(0.1f, f * 25.0f));
        }
    }

    @Override
    public boolean PH() {
        return true;
    }

    @Override
    public double PS() {
        return super.PS() - 0.1875;
    }

    @Override
    protected rqA_2 BB() {
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            if (!this.BP()) {
                return rqn_3.Jp;
            }
            ++this.id_while;
            if (this.id_while > 5 && this.id_while % 3 == 0) {
                return rqn_3.JH;
            }
            if (this.id_while <= 5) {
                return rqn_3.Jp;
            }
        }
        return rqn_3.JC;
    }

    @Override
    protected rqA_2 Bt() {
        super.Bt();
        return rqn_3.JA;
    }

    @Override
    protected float Bf() {
        return 0.96f;
    }

    public boolean sJ() {
        return this.id_instanceof;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_break;
    }

    @Override
    protected void su() {
    }
}

