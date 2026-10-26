/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aL_2;
import celestial.ag_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.iX_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBP;
import celestial.rBx_1;
import celestial.rHx_1;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rLp_1;
import celestial.rLx_1;
import celestial.rLy_1;
import celestial.rMm_1;
import celestial.rPV;
import celestial.rRO;
import celestial.rRR;
import celestial.rSO;
import celestial.rSP;
import celestial.rSb_1;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rbA_2;
import celestial.rbC_2;
import celestial.rbH_2;
import celestial.rbI_2;
import celestial.rbL_2;
import celestial.rbT_2;
import celestial.rbZ_2;
import celestial.rbl_3;
import celestial.rbn_3;
import celestial.rbp_3;
import celestial.rbt_3;
import celestial.rbw_3;
import celestial.rby_3;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rlb_3;
import celestial.rlc_3;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEm_1;
import celestial.ruP_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.rye_3;
import celestial.xc_3;
import java.util.Random;
import java.util.UUID;

public class rbF_2
extends rbZ_2
implements ag_3,
rMm_1 {
    private static final rut_3<Byte> id_super = rmE_2.id_class(rbF_2.class, ruw_3.id_class);
    private static final rut_3<Integer> id_this = rmE_2.id_class(rbF_2.class, ruw_3.id_break);
    private static final rqb_3 id_else = rqt_3.id_class(20, 39);
    private UUID id_synchronized;
    private float id_return;
    private float id_public;
    private int id_goto;
    public int id_while;
    private int id_try;
    private int id_instanceof;
    public int id_throw = 0;
    public int id_interface = 0;
    public rfH_2 id_char = null;
    public rfH_2 id_abstract = null;
    public rbT_2 id_long;
    public rbH_2 id_float;
    private rby_3 id_void;
    private int id_static;

    @Override
    public UUID id_byte() {
        return this.id_synchronized;
    }

    @Override
    protected void id_byte(rlb_3<rXs_1> rlb_32) {
        this.id_byte(this.rv().id_break(0.0, 0.01, 0.0));
    }

    public static /* synthetic */ rLy_1 id_byte(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.H;
    }

    public static /* synthetic */ Random id_int(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    @Override
    protected void id_double() {
        boolean bl = this.su();
        this.id_static = this.Pa() ? ++this.id_static : 0;
        if (this.id_static > 20) {
            this.id_break(rye_3.id_private, 1.0f);
        }
        if (bl) {
            ++this.id_goto;
            if (this.id_goto % 5 == 0 && ((Random)this.id_throws[40]).nextInt(rfU_2.id_class(1200 - this.id_goto, 1, 1200)) == 0) {
                this.id_break(rye_3.id_final, this.Ss());
            }
        }
        if (!this.sc()) {
            ++this.id_while;
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class((rrEm_1)((rYB)this.id_throws[7]), false);
        }
    }

    public rbF_2(aI_2<? extends rbF_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_native = new rPV(this, 20, true);
        this.id_extends = new rbC_2(this, this);
        this.id_class(rLp_1.DANGER_FIRE, -1.0f);
        this.id_class(rLp_1.WATER, -1.0f);
        this.id_class(rLp_1.WATER_BORDER, 16.0f);
        this.id_class(rLp_1.COCOA, -1.0f);
        this.id_class(rLp_1.FENCE, -1.0f);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.sc() && this.sn() < 10 && ((Random)this.id_throws[40]).nextFloat() < 0.05f) {
            for (int i = 0; i < ((Random)this.id_throws[40]).nextInt(2) + 1; ++i) {
                this.id_class((rYB)this.id_throws[7], this.rx() - (double)0.3f, this.rx() + (double)0.3f, this.BO() - (double)0.3f, this.BO() + (double)0.3f, this.id_byte(0.5), rLQ.z);
            }
        }
        this.sL();
    }

    public void id_this(boolean bl) {
        if (bl) {
            this.sJ();
        }
        this.id_protected(8, bl);
    }

    public static /* synthetic */ Random id_this(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    public void sl() {
        ++this.id_instanceof;
    }

    public boolean n() {
        return this.id_char != null;
    }

    @Override
    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, n);
    }

    @Override
    public int id_class() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_synchronized = uUID;
    }

    @Override
    protected void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.sx()) {
            rcd_32.id_class("HivePos", rco_3.id_class(this.sd()));
        }
        if (this.n()) {
            rcd_32.id_class("FlowerPos", rco_3.id_class(this.L()));
        }
        rcd_32.id_class("HasNectar", this.sc());
        rcd_32.id_class("HasStung", this.su());
        rcd_32.id_break("TicksSincePollination", this.id_while);
        rcd_32.id_break("CannotEnterHiveTicks", this.id_try);
        rcd_32.id_break("CropsGrownSincePollination", this.id_instanceof);
        this.a_(rcd_32);
    }

    public static /* synthetic */ rLy_1 id_class(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    private void id_class(rYB rYB2, double d, double d2, double d3, double d4, double d5, rLx_1 rLx_12) {
        rYB2.id_class(rLx_12, rfU_2.id_protected(rYB2.id_int.nextDouble(), d, d2), d5, rfU_2.id_protected(rYB2.id_int.nextDouble(), d3, d4), 0.0, 0.0, 0.0);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return rRR2.id_byte(rfH_22).id_catch() ? 10.0f : 0.0f;
    }

    public static iz_3 sm() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_throws, 0.6f).id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_case, 2.0).id_class(iQ_2.id_break, 48.0);
    }

    public boolean sc() {
        return this.id_synchronized(8);
    }

    @Override
    public void id_default() {
        super.id_default();
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (this.id_try > 0) {
                --this.id_try;
            }
            if (this.id_throw > 0) {
                --this.id_throw;
            }
            if (this.id_interface > 0) {
                --this.id_interface;
            }
            boolean bl = this.T_() && !this.su() && this.I_() != null && this.I_().id_int(this) < 4.0;
            this.id_synchronized(bl);
            if ((Integer)this.id_throws[41] % 20 == 0 && !this.sH()) {
                this.id_abstract = null;
            }
        }
    }

    public rfH_2 sd() {
        return this.id_abstract;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        this.id_abstract = null;
        if (rcd_32.id_throws("HivePos")) {
            this.id_abstract = rco_3.id_break(rcd_32.id_int("HivePos"));
        }
        this.id_char = null;
        if (rcd_32.id_throws("FlowerPos")) {
            this.id_char = rco_3.id_break(rcd_32.id_int("FlowerPos"));
        }
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("HasNectar"));
        this.id_else(rcd_32.id_new("HasStung"));
        this.id_while = rcd_32.id_private("TicksSincePollination");
        this.id_try = rcd_32.id_private("CannotEnterHiveTicks");
        this.id_instanceof = rcd_32.id_private("CropsGrownSincePollination");
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), rcd_32);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
    }

    public boolean id_break(rfH_2 rfH_22, int n) {
        return rfH_22.id_class(this.Bs(), (double)n);
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        rbL_2 rbL_22 = new rbL_2(this, this, rYB2);
        rbL_22.id_class(false);
        rbL_22.id_byte(false);
        rbL_22.id_break(true);
        return rbL_22;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? ap_32.id_break * 0.5f : ap_32.id_break * 0.5f;
    }

    public rbF_2 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        return aI_2.id_throws.id_class(rrEm_12);
    }

    public static /* synthetic */ rLy_1 id_break(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        an_3 an_32 = rye_32.id_extends();
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_long.id_native();
        }
        return super.id_break(rye_32, f);
    }

    public static /* synthetic */ rLy_1 id_throws(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public rfH_2 L() {
        return this.id_char;
    }

    public boolean sx() {
        return this.id_abstract != null;
    }

    private boolean sv() {
        return this.id_while > 3600;
    }

    public static /* synthetic */ rLy_1 id_finally(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public void id_finally(rfH_2 rfH_22) {
        rjU_2 rjU_22;
        rjU_2 rjU_23 = rjU_2.id_protected(rfH_22);
        int n = 0;
        rfH_2 rfH_23 = this.Bs();
        int n2 = (int)rjU_23.id_byte - rfH_23.c_();
        if (n2 > 2) {
            n = 4;
        } else if (n2 < -2) {
            n = -4;
        }
        int n3 = 6;
        int n4 = 8;
        int n5 = rfH_23.id_implements(rfH_22);
        if (n5 < 15) {
            n3 = n5 / 2;
            n4 = n5 / 2;
        }
        if ((rjU_22 = iX_2.id_break(this, n3, n4, n, rjU_23, 0.3141592741012573)) != null) {
            this.id_final.id_class(0.5f);
            this.id_final.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, 1.0);
        }
    }

    public static /* synthetic */ rLy_1 id_catch(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break().id_class(rlc_3.id_default);
    }

    public boolean id_extends(rfH_2 rfH_22) {
        ryO_2 ryO_22 = ((rYB)this.id_throws[7]).id_class(rfH_22);
        if (ryO_22 instanceof rHx_1) {
            return !((rHx_1)ryO_22).id_private();
        }
        return false;
    }

    public static /* synthetic */ rLy_1 id_extends(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ Random id_goto(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    public static /* synthetic */ rLy_1 id_case(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ Random id_continue(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    public static /* synthetic */ rLy_1 id_else(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public void id_else(int n) {
        this.id_try = n;
    }

    private void id_else(boolean bl) {
        this.id_protected(4, bl);
    }

    @Override
    protected void id_for() {
        super.id_for();
        ruP_2.id_class(this);
    }

    public void id_implements(rfH_2 rfH_22) {
        this.id_char = rfH_22;
    }

    public static /* synthetic */ rLy_1 id_implements(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ rLy_1 id_instanceof(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ rLy_1 id_new(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ Random id_package(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    public static /* synthetic */ Random id_return(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    public static /* synthetic */ rLy_1 id_super(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_public, this.id_return);
    }

    public static /* synthetic */ rLy_1 id_try(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ rLy_1 id_while(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    @Override
    protected rqA_2 id_static() {
        return null;
    }

    public static /* synthetic */ rLy_1 id_public(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl = an_32.id_break(rye_3.id_break(this), (int)this.id_class(iQ_2.id_case));
        if (bl) {
            this.id_class((iB_2)this, an_32);
            if (an_32 instanceof iB_2) {
                ((iB_2)an_32).id_package(((iB_2)an_32).SM() + 1);
                int n = 0;
                if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL) {
                    n = 10;
                } else if (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
                    n = 18;
                }
                if (n > 0) {
                    ((iB_2)an_32).id_break(new rLY(rLD.id_super, n * 20, 0));
                }
            }
            this.id_else(true);
            this.S_();
            this.id_class(rqn_3.q, 1.0f, 1.0f);
        }
        return bl;
    }

    @Override
    public void id_protected() {
        this.id_class(id_else.id_class((Random)this.id_throws[40]));
    }

    private void id_protected(int n, boolean bl) {
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(((rmE_2)this.id_throws[49]).id_class(id_super) | n));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(((rmE_2)this.id_throws[49]).id_class(id_super) & ~n));
        }
    }

    public static /* synthetic */ rLy_1 id_protected(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ rLy_1 id_private(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public static /* synthetic */ Random id_final(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rbt_3(this, this, 1.4f, true));
        this.id_package.id_class(1, new rbl_3(this));
        this.id_package.id_class(2, new rBP(this, 1.0));
        this.id_package.id_class(3, new rSO((aA_2)this, 1.25, rkg_3.id_class(rlc_3.id_default), false));
        this.id_long = new rbT_2(this);
        this.id_package.id_class(4, this.id_long);
        this.id_package.id_class(5, new rBx_1(this, 1.25));
        this.id_package.id_class(5, new rbw_3(this));
        this.id_float = new rbH_2(this);
        this.id_package.id_class(5, this.id_float);
        this.id_void = new rby_3(this);
        this.id_package.id_class(6, this.id_void);
        this.id_package.id_class(7, new rbp_3(this));
        this.id_package.id_class(8, new rbI_2(this));
        this.id_package.id_class(9, new rSb_1(this));
        this.id_int.id_class(1, new rbA_2(this, this).id_class(new Class[0]));
        this.id_int.id_class(2, new rbn_3(this));
        this.id_int.id_class(3, new rSP<rbF_2>(this, true));
    }

    public static /* synthetic */ rLy_1 id_volatile(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public boolean id_volatile(rfH_2 rfH_22) {
        return ((rYB)this.id_throws[7]).id_synchronized(rfH_22) && ((rYB)this.id_throws[7]).id_byte(rfH_22).id_break().id_class(rls_3.id_strictfp);
    }

    private void id_synchronized(boolean bl) {
        this.id_protected(2, bl);
    }

    public static /* synthetic */ Random id_synchronized(rbF_2 rbF_22) {
        return (Random)rbF_22.id_throws[40];
    }

    private boolean id_synchronized(int n) {
        return (((rmE_2)this.id_throws[49]).id_class(id_super) & n) != 0;
    }

    public boolean id_native(rfH_2 rfH_22) {
        return !this.id_break(rfH_22, 32);
    }

    public static /* synthetic */ rLy_1 id_native(rbF_2 rbF_22) {
        return rbF_22.id_final;
    }

    public int sn() {
        return this.id_instanceof;
    }

    @Override
    protected boolean PJ() {
        return true;
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.5f * this.Bx(), this.PN() * 0.2f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.l;
    }

    public void sJ() {
        this.id_while = 0;
    }

    private boolean sy() {
        return this.id_synchronized(2);
    }

    private void sL() {
        this.id_public = this.id_return;
        this.id_return = this.sy() ? Math.min(1.0f, this.id_return + 0.2f) : Math.max(0.0f, this.id_return - 0.24f);
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_byte;
    }

    public boolean sH() {
        if (!this.sx()) {
            return false;
        }
        ryO_2 ryO_22 = ((rYB)this.id_throws[7]).id_class(this.id_abstract);
        return ryO_22 != null && ryO_22.id_void() == ryW_2.id_long;
    }

    public boolean su() {
        return this.id_synchronized(4);
    }

    @Override
    protected float Si() {
        return 0.4f;
    }

    public void sZ() {
        this.id_this(false);
        this.sC();
    }

    public boolean sF() {
        if (this.id_try <= 0 && !this.id_long.id_extends() && !this.su() && this.I_() == null) {
            boolean bl = this.sv() || ((rYB)this.id_throws[7]).s() || ((rYB)this.id_throws[7]).id_boolean() || this.sc();
            return bl && !this.sA();
        }
        return false;
    }

    private boolean sA() {
        if (this.id_abstract == null) {
            return false;
        }
        ryO_2 ryO_22 = ((rYB)this.id_throws[7]).id_class(this.id_abstract);
        return ryO_22 instanceof rHx_1 && ((rHx_1)ryO_22).id_class();
    }

    private void sC() {
        this.id_instanceof = 0;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
    }
}

