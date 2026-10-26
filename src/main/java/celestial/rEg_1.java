/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iF_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.iz_3;
import celestial.rEK;
import celestial.rER;
import celestial.rEi_1;
import celestial.rEo_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rbP_2;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrP_2;
import celestial.rrr_3;
import celestial.ruP_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Random;

public class rEg_1
extends rbZ_2
implements rEK,
rEo_1 {
    private static final rut_3<Boolean> id_else = rmE_2.id_class(rEg_1.class, ruw_3.id_implements);
    private int id_synchronized;
    private int id_return = 0;
    private boolean id_public = false;
    protected static final ImmutableList<? extends rrP_2<? extends rrr_3<? super rEg_1>>> id_super = ImmutableList.of(rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_final, rrP_2.id_volatile);
    protected static final ImmutableList<? extends il_3<?>> id_this = ImmutableList.of(il_3.id_continue, il_3.id_catch, il_3.id_private, il_3.id_extends, il_3.id_native, il_3.id_final, il_3.id_volatile, il_3.id_interface, il_3.id_this, il_3.id_package, il_3.id_int, il_3.G, (Object[])new il_3[]{il_3.id_while, il_3.M, il_3.O, il_3.E, il_3.id_void, il_3.J, il_3.x});

    private void id_byte(rrEm_1 rrEm_12) {
        rbP_2 rbP_22 = this.id_class(aI_2.rS, true);
        if (rbP_22 != null) {
            rbP_22.id_break(new rLY(rLD.id_implements, 200, 0));
        }
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.sI;
    }

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        return this.id_finally;
    }

    @Override
    protected void id_double() {
        this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
        rER.id_class(this);
        if (this.sx()) {
            ++this.id_return;
            if (this.id_return > 300) {
                this.id_class(rqn_3.st);
                this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
            }
        } else {
            this.id_return = 0;
        }
    }

    public rEg_1(aI_2<? extends rEg_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_finally = 5;
    }

    public void id_this(boolean bl) {
        this.BQ().id_break(id_else, bl);
    }

    @Override
    public int n() {
        return this.id_synchronized;
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        if (rER.id_class(this, rfH_22)) {
            return -1.0f;
        }
        return rRR2.id_byte(rfH_22.id_break()).id_class(xu_3.XL) ? 10.0f : 0.0f;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (rRf_12.id_long().nextFloat() < 0.2f) {
            this.id_class(true);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.sc()) {
            rcd_32.id_class("IsImmuneToZombification", true);
        }
        rcd_32.id_break("TimeInOverworld", this.id_return);
        if (this.id_public) {
            rcd_32.id_class("CannotBeHunted", true);
        }
    }

    @Override
    public void id_class(byte by) {
        if (by == 4) {
            this.id_synchronized = 10;
            this.id_class(rqn_3.sT, 1.0f, this.SN());
        } else {
            super.id_class(by);
        }
    }

    protected void id_class(rqA_2 rqA_22) {
        this.id_class(rqA_22, this.Si(), this.SN());
    }

    @Override
    protected iZ_2<?> id_class(Dynamic<?> dynamic) {
        return rER.id_class(this.SV().id_class(dynamic));
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        rEg_1 rEg_12 = aI_2.id_long.id_class(rrEm_12);
        if (rEg_12 != null) {
            rEg_12.b();
        }
        return rEg_12;
    }

    private boolean sc() {
        return this.BQ().id_class(id_else);
    }

    @Override
    public void id_default() {
        if (this.id_synchronized > 0) {
            --this.id_synchronized;
        }
        super.id_default();
    }

    public boolean sd() {
        return this.sJ() && !this.id_public;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        boolean bl = super.id_break(rye_32, f);
        if (((rYB)this.id_throws[7]).id_continue) {
            return false;
        }
        if (bl && rye_32.id_extends() instanceof iB_2) {
            rER.id_break(this, (iB_2)rye_32.id_extends());
        }
        return bl;
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.sj, 0.15f, 1.0f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("IsImmuneToZombification"));
        this.id_return = rcd_32.id_private("TimeInOverworld");
        this.id_else(rcd_32.id_new("CannotBeHunted"));
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        ryZ_2 ryZ_22 = super.id_break(rhd_32, rpm_32);
        if (ryZ_22.id_class()) {
            this.b();
        }
        return ryZ_22;
    }

    public static boolean id_break(aI_2<rEg_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return !rRg_12.id_byte(rfH_22.id_break()).id_class(xu_3.bg);
    }

    @Override
    protected void id_throws(iB_2 iB_22) {
        if (this.sJ()) {
            rEo_1.id_break(this, iB_22);
        }
    }

    public static iz_3 L() {
        return rEi_1.sm().id_class(iQ_2.id_class, 40.0).id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_byte, 0.6f).id_class(iQ_2.id_catch, 1.0).id_class(iQ_2.id_case, 6.0);
    }

    public boolean sx() {
        return !((rYB)this.id_throws[7]).id_default().id_catch() && !this.sc() && !this.c();
    }

    @Override
    public boolean sk() {
        return !rER.id_byte(this) && super.sk();
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.rn;
    }

    private void id_else(boolean bl) {
        this.id_public = bl;
    }

    @Override
    protected void id_for() {
        super.id_for();
        ruP_2.id_class(this);
    }

    @Override
    protected rqA_2 id_static() {
        return ((rYB)this.id_throws[7]).id_continue ? null : rER.id_break(this).orElse(null);
    }

    @Override
    public boolean id_public(an_3 an_32) {
        if (!(an_32 instanceof iB_2)) {
            return false;
        }
        this.id_synchronized = 10;
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)4);
        this.id_class(rqn_3.sT, 1.0f, this.SN());
        rER.id_class(this, (iB_2)an_32);
        return rEo_1.id_class(this, (iB_2)an_32);
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return !this.z();
    }

    @Override
    public boolean id_private(double d) {
        return !this.O();
    }

    @Override
    protected void P_() {
        if (this.n_()) {
            this.id_finally = 3;
            this.id_byte(iQ_2.id_case).id_class(0.5);
        } else {
            this.id_finally = 5;
            this.id_byte(iQ_2.id_case).id_class(6.0);
        }
    }

    @Override
    public double PS() {
        return (double)this.Bm() - (this.n_() ? 0.2 : 0.15);
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    protected rqA_2 BB() {
        return rqn_3.Ed;
    }

    @Override
    protected rqA_2 BJ() {
        return rqn_3.Ex;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.sw;
    }

    public boolean sJ() {
        return !this.n_();
    }

    @Override
    protected boolean Sp() {
        return true;
    }

    public iZ_2<rEg_1> SF() {
        return super.SF();
    }

    protected iF_2<rEg_1> SV() {
        return iZ_2.id_class(id_this, id_super);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_else, false);
    }
}

