/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rEi_1;
import celestial.rLA;
import celestial.rLD;
import celestial.rLY;
import celestial.rLp_1;
import celestial.rYB;
import celestial.rbG_2;
import celestial.rbJ_2;
import celestial.rbW_2;
import celestial.rcd_3;
import celestial.rkW_2;
import celestial.rmE_2;
import celestial.rpc_3;
import celestial.rrEm_1;
import celestial.ruP_2;
import celestial.rut_3;
import celestial.ruw_3;

public abstract class rbM_2
extends rEi_1 {
    protected static final rut_3<Boolean> id_class = rmE_2.id_class(rbM_2.class, ruw_3.id_implements);
    protected int id_break = 0;

    protected void id_byte(rrEm_1 rrEm_12) {
        rbG_2 rbG_22 = this.id_class(aI_2.rb, true);
        if (rbG_22 != null) {
            rbG_22.id_break(new rLY(rLD.id_implements, 200, 0));
        }
    }

    @Override
    public void id_long() {
        if (rbW_2.id_protected(this)) {
            super.id_long();
        }
    }

    @Override
    protected void id_double() {
        super.id_double();
        this.id_break = this.sJ() ? ++this.id_break : 0;
        if (this.id_break > 300) {
            this.sW();
            this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
        }
    }

    public rbM_2(aI_2<? extends rbM_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.id_byte(true);
        this.sz();
        this.id_class(rLp_1.DANGER_FIRE, 16.0f);
        this.id_class(rLp_1.DAMAGE_FIRE, -1.0f);
    }

    public void id_this(boolean bl) {
        this.BQ().id_break(id_class, bl);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.L()) {
            rcd_32.id_class("IsImmuneToZombification", true);
        }
        rcd_32.id_break("TimeInOverworld", this.id_break);
    }

    public abstract rbJ_2 sd();

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("IsImmuneToZombification"));
        this.id_break = rcd_32.id_private("TimeInOverworld");
    }

    protected abstract boolean id_throws();

    protected boolean L() {
        return this.BQ().id_class(id_class);
    }

    public boolean sx() {
        return !this.n_();
    }

    protected boolean sk() {
        return this.ss().id_break() instanceof rkW_2;
    }

    @Override
    protected void id_for() {
        super.id_for();
        ruP_2.id_class(this);
    }

    private void sz() {
        if (rpc_3.id_class(this)) {
            ((rLA)this.id_public()).id_class(true);
        }
    }

    @Override
    public iB_2 I_() {
        return ((iZ_2)this.id_private[72]).id_byte(il_3.id_package).orElse(null);
    }

    @Override
    public double Pv() {
        return this.n_() ? -0.05 : -0.45;
    }

    public boolean sJ() {
        return !((rYB)this.id_throws[7]).id_default().id_catch() && !this.L() && !this.c();
    }

    protected abstract void sW();

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, false);
    }
}

