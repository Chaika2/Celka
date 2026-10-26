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
import celestial.aY_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.eA_2;
import celestial.iB_2;
import celestial.iF_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iZ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.il_3;
import celestial.is_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rEi_1;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rRu_1;
import celestial.rXA;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbJ_2;
import celestial.rbM_2;
import celestial.rbW_2;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rkB_2;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrP_2;
import celestial.rrr_3;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rbk_3
extends rbM_2
implements aY_2 {
    private static final rut_3<Boolean> id_this = rmE_2.id_class(rbk_3.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_else = rmE_2.id_class(rbk_3.class, ruw_3.id_implements);
    private static final rut_3<Boolean> id_synchronized = rmE_2.id_class(rbk_3.class, ruw_3.id_implements);
    private static final UUID id_return = UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667");
    private static final ix_3 id_public = new ix_3(id_return, "Baby speed boost", (double)0.2f, id_3.MULTIPLY_BASE);
    private final rXA id_goto = new rXA(8);
    private boolean id_while = false;
    protected static final ImmutableList<rrP_2<? extends rrr_3<? super rbk_3>>> id_protected = ImmutableList.of(rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_break, rrP_2.id_case, rrP_2.id_extends);
    protected static final ImmutableList<il_3<?>> id_super = ImmutableList.of(il_3.id_final, il_3.id_synchronized, il_3.id_catch, il_3.id_private, il_3.id_extends, il_3.id_native, il_3.s, il_3.S, il_3.id_static, il_3.id_public, il_3.id_goto, il_3.id_volatile, (Object[])new il_3[]{il_3.id_interface, il_3.id_package, il_3.id_int, il_3.id_new, il_3.id_this, il_3.id_short, il_3.id_default, il_3.id_while, il_3.id_const, il_3.id_strictfp, il_3.id_transient, il_3.id_boolean, il_3.id_double, il_3.id_switch, il_3.id_for, il_3.P, il_3.id_import, il_3.b, il_3.id_super, il_3.M, il_3.O, il_3.r, il_3.B, il_3.h, il_3.X, il_3.J});

    @Override
    protected boolean id_boolean() {
        return false;
    }

    @Override
    protected void id_byte(rrEm_1 rrEm_12) {
        rbW_2.id_byte(this);
        this.id_goto.id_protected().forEach(this::a_);
        super.id_byte(rrEm_12);
    }

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        return this.id_finally;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.hs;
    }

    @Override
    protected void id_double() {
        this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
        rbW_2.id_break(this);
        super.id_double();
    }

    public rbk_3(aI_2<? extends rbM_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        this.id_finally = 5;
    }

    @Override
    public boolean id_class(rkB_2 rkB_22) {
        return rkB_22 == rdy_3.kU;
    }

    @Override
    protected boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        boolean bl;
        if (eA_2.id_protected(rdn_33)) {
            return false;
        }
        boolean bl2 = rbW_2.id_class(rdn_32.id_break()) || rdn_32.id_break() == rdy_3.kU;
        boolean bl3 = bl = rbW_2.id_class(rdn_33.id_break()) || rdn_33.id_break() == rdy_3.kU;
        if (bl2 && !bl) {
            return true;
        }
        if (!bl2 && bl) {
            return false;
        }
        return this.sx() && rdn_32.id_break() != rdy_3.kU && rdn_33.id_break() == rdy_3.kU ? false : super.id_class(rdn_32, rdn_33);
    }

    @Override
    protected iZ_2<?> id_class(Dynamic<?> dynamic) {
        return rbW_2.id_class(this, this.SV().id_class(dynamic));
    }

    @Override
    public boolean id_class(an_3 an_32, boolean bl) {
        if (this.n_() && an_32.BC() == aI_2.id_long) {
            an_32 = this.id_break(an_32, 3);
        }
        return super.id_class(an_32, bl);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        super.id_class(rye_32, n, bl);
        this.id_goto.id_protected().forEach(this::a_);
    }

    @Override
    public void id_class() {
        Integer n = 0;
        this.id_private[33] = n;
    }

    @Override
    public void id_class(boolean bl) {
        this.BQ().id_break(id_this, bl);
        if (!((rYB)this.id_throws[7]).id_continue) {
            ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
            ic_32.id_protected(id_public);
            if (bl) {
                ic_32.id_break(id_public);
            }
        }
    }

    @Override
    public void id_class(iB_2 iB_22, rdn_3 rdn_32, rhf_3 rhf_32, float f) {
        this.id_class(this, iB_22, rhf_32, f, 1.6f);
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        super.id_class(rut_32);
        if (id_this.equals(rut_32)) {
            this.q_();
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.n_()) {
            rcd_32.id_class("IsBaby", true);
        }
        if (this.id_while) {
            rcd_32.id_class("CannotHunt", true);
        }
        rcd_32.id_class("Inventory", this.id_goto.id_byte());
    }

    protected void id_class(rqA_2 rqA_22) {
        this.id_class(rqA_22, this.Si(), this.SN());
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        if (this.sx()) {
            this.id_protected(rXQ.HEAD, new rdn_3(rdy_3.hc));
            this.id_protected(rXQ.CHEST, new rdn_3(rdy_3.hu));
            this.id_protected(rXQ.LEGS, new rdn_3(rdy_3.hm));
            this.id_protected(rXQ.FEET, new rdn_3(rdy_3.hZ));
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (iO_22 != iO_2.STRUCTURE) {
            if (rRf_12.id_long().nextFloat() < 0.2f) {
                this.id_class(true);
            } else if (this.sx()) {
                this.id_class(rXQ.MAINHAND, this.sN());
            }
        }
        rbW_2.id_class(this);
        this.id_class(rRh_12);
        this.id_break(rRh_12);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    private boolean sc() {
        return ((rmE_2)this.id_throws[49]).id_class(id_else);
    }

    @Override
    public rbJ_2 sd() {
        if (this.sQ()) {
            return rbJ_2.DANCING;
        }
        if (rbW_2.id_class(this.Sn().id_break())) {
            return rbJ_2.ADMIRING_ITEM;
        }
        if (this.v() && this.sk()) {
            return rbJ_2.ATTACKING_WITH_MELEE_WEAPON;
        }
        if (this.sc()) {
            return rbJ_2.CROSSBOW_CHARGE;
        }
        return this.v() && this.id_class(rdy_3.kU) ? rbJ_2.CROSSBOW_HOLD : rbJ_2.DEFAULT;
    }

    @Override
    public void id_break(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_else, bl);
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        this.id_class(rsE_22);
        rbW_2.id_class(this, rsE_22);
    }

    private an_3 id_break(an_3 an_32, int n) {
        List<an_3> list = an_32.Bh();
        return n != 1 && !list.isEmpty() ? this.id_break(list.get(0), n - 1) : an_32;
    }

    @Override
    public void id_break(iB_2 iB_22, float f) {
        this.id_class((iB_2)this, 1.6f);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.hG, 0.15f, 1.0f);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        boolean bl = super.id_break(rye_32, f);
        if (((rYB)this.id_throws[7]).id_continue) {
            return false;
        }
        if (bl && rye_32.id_extends() instanceof iB_2) {
            rbW_2.id_class(this, (iB_2)rye_32.id_extends());
        }
        return bl;
    }

    public static boolean id_break(aI_2<rbk_3> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return !rRg_12.id_byte(rfH_22.id_break()).id_class(xu_3.bg);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        ryZ_2 ryZ_22 = super.id_break(rhd_32, rpm_32);
        if (ryZ_22.id_class()) {
            return ryZ_22;
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            return rbW_2.id_class(this, rhd_32, rpm_32);
        }
        boolean bl = rbW_2.id_break(this, rhd_32.id_protected(rpm_32)) && this.sd() != rbJ_2.ADMIRING_ITEM;
        return bl ? ryZ_2.SUCCESS : ryZ_2.PASS;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class(rcd_32.id_new("IsBaby"));
        this.id_synchronized(rcd_32.id_new("CannotHunt"));
        this.id_goto.id_class(rcd_32.id_protected("Inventory", 10));
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? 0.93f : 1.74f;
    }

    @Override
    protected boolean id_throws() {
        return !this.id_while;
    }

    protected rdn_3 id_extends(rdn_3 rdn_32) {
        return this.id_goto.id_class(rdn_32);
    }

    public void id_else(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, bl);
    }

    @Override
    public boolean id_implements(rdn_3 rdn_32) {
        return ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) && this.M() && rbW_2.id_class(this, rdn_32);
    }

    protected boolean id_package(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        rdn_3 rdn_33 = this.id_class(rXQ2);
        return this.id_class(rdn_32, rdn_33);
    }

    @Override
    protected rqA_2 id_static() {
        return ((rYB)this.id_throws[7]).id_continue ? null : rbW_2.id_protected(this).orElse(null);
    }

    private void id_protected(rXQ rXQ2, rdn_3 rdn_32) {
        if (((rYB)this.id_throws[7]).id_int.nextFloat() < 0.1f) {
            this.id_class(rXQ2, rdn_32);
        }
    }

    @Override
    public boolean id_private(double d) {
        return !this.O();
    }

    protected void id_final(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rbW_2.id_class) {
            this.id_class(rXQ.OFFHAND, rdn_32);
            this.id_protected(rXQ.OFFHAND);
        } else {
            this.id_break(rXQ.OFFHAND, rdn_32);
        }
    }

    protected void id_volatile(rdn_3 rdn_32) {
        this.id_break(rXQ.MAINHAND, rdn_32);
    }

    private void id_synchronized(boolean bl) {
        this.id_while = bl;
    }

    protected boolean id_native(rdn_3 rdn_32) {
        return this.id_goto.id_break(rdn_32);
    }

    public static iz_3 sz() {
        return rEi_1.sm().id_class(iQ_2.id_class, 16.0).id_class(iQ_2.id_protected, 0.35f).id_class(iQ_2.id_case, 5.0);
    }

    @Override
    public double PS() {
        return (double)this.Bm() * 0.92;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.hB;
    }

    private rdn_3 sN() {
        return (double)((Random)this.id_throws[40]).nextFloat() < 0.5 ? new rdn_3(rdy_3.kU) : new rdn_3(rdy_3.OA);
    }

    public iZ_2<rbk_3> SF() {
        return super.SF();
    }

    @Override
    protected void sW() {
        this.id_class(rqn_3.hb);
    }

    protected iF_2<rbk_3> SV() {
        return iZ_2.id_class(id_super, id_protected);
    }

    public boolean sQ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_this, false);
        ((rmE_2)this.id_throws[49]).id_class(id_else, false);
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, false);
    }

    @Override
    public boolean n_() {
        return this.BQ().id_class(id_this);
    }
}

