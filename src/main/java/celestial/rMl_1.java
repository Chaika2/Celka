/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.an_3;
import celestial.au_3;
import celestial.ay_3;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBC;
import celestial.rBx_1;
import celestial.rEi_1;
import celestial.rLQ;
import celestial.rLk_1;
import celestial.rMH;
import celestial.rMI;
import celestial.rMT;
import celestial.rMV;
import celestial.rMf_1;
import celestial.rMg_1;
import celestial.rMj_1;
import celestial.rMp_1;
import celestial.rMq_1;
import celestial.rMt_1;
import celestial.rMw_1;
import celestial.rMy_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rRu_1;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;
import java.util.function.Predicate;

public class rMl_1
extends rbZ_2 {
    private static final rut_3<Integer> id_this = rmE_2.id_class(rMl_1.class, ruw_3.id_break);
    private static final rut_3<Integer> id_else = rmE_2.id_class(rMl_1.class, ruw_3.id_break);
    private static final rut_3<Integer> id_synchronized = rmE_2.id_class(rMl_1.class, ruw_3.id_break);
    private static final rut_3<Byte> id_return = rmE_2.id_class(rMl_1.class, ruw_3.id_class);
    private static final rut_3<Byte> id_public = rmE_2.id_class(rMl_1.class, ruw_3.id_class);
    private static final rut_3<Byte> id_goto = rmE_2.id_class(rMl_1.class, ruw_3.id_class);
    public static final ay_3 id_while = new ay_3().id_class(8.0).id_break().id_class();
    public boolean id_try;
    public boolean id_instanceof;
    public int id_super;
    private rjU_2 id_throw;
    private float id_interface;
    private float id_char;
    private float id_abstract;
    private float id_long;
    private float id_float;
    private float id_void;
    public rMg_1 id_static;
    public static final Predicate<rsE_2> id_import = rsE_22 -> {
        rdb_3 rdb_32 = rsE_22.id_protected().id_break();
        return (rdb_32 == xu_3.hs.id_case() || rdb_32 == xu_3.BB.id_case()) && rsE_22.BM() && !rsE_22.id_package();
    };

    public float id_char(float f) {
        return rfU_2.id_catch(f, this.id_void, this.id_float);
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Mi;
    }

    public static /* synthetic */ Random id_byte(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    public rMl_1(aI_2<? extends rMl_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_native = new rMw_1(this);
        if (!this.n_()) {
            this.id_byte(true);
        }
    }

    private int sp() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
    }

    public void id_this(boolean bl) {
        this.id_protected(8, bl);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.sA()) {
            if (((rYB)this.id_throws[7]).S() && !this.rT()) {
                this.id_this(true);
                this.id_synchronized(false);
            } else if (!this.sd()) {
                this.id_this(false);
            }
        }
        if (this.I_() == null) {
            this.id_try = false;
            this.id_instanceof = false;
        }
        if (this.L() > 0) {
            if (this.I_() != null) {
                this.id_class((an_3)this.I_(), 90.0f, 90.0f);
            }
            if (this.L() == 29 || this.L() == 14) {
                this.id_class(rqn_3.MU, 1.0f, 1.0f);
            }
            this.id_else(this.L() - 1);
        }
        if (this.n()) {
            this.id_synchronized(this.sc() + 1);
            if (this.sc() > 20) {
                this.id_return(false);
                this.sj();
            } else if (this.sc() == 1) {
                this.id_class(rqn_3.Mg, 1.0f, 1.0f);
            }
        }
        if (this.sZ()) {
            this.sf();
        } else {
            this.id_super = 0;
        }
        if (this.sJ()) {
            Float f = Float.valueOf(0.0f);
            this.id_throws[16] = f;
        }
        this.st();
        this.sq();
        this.sw();
        this.sI();
    }

    public boolean sl() {
        return this.sA() && ((rYB)this.id_throws[7]).S();
    }

    public boolean n() {
        return this.id_public(2);
    }

    public float id_interface(float f) {
        return rfU_2.id_catch(f, this.id_long, this.id_abstract);
    }

    public void id_class(rMl_1 rMl_12, rMl_1 rMl_13) {
        if (rMl_13 == null) {
            if (((Random)this.id_throws[40]).nextBoolean()) {
                this.id_class(rMl_12.sV());
                this.id_break(rMq_1.id_class((Random)this.id_throws[40]));
            } else {
                this.id_class(rMq_1.id_class((Random)this.id_throws[40]));
                this.id_break(rMl_12.sV());
            }
        } else if (((Random)this.id_throws[40]).nextBoolean()) {
            this.id_class(rMl_12.sV());
            this.id_break(rMl_13.sV());
        } else {
            this.id_class(rMl_13.sV());
            this.id_break(rMl_12.sV());
        }
        if (((Random)this.id_throws[40]).nextInt(32) == 0) {
            this.id_class(rMq_1.id_class((Random)this.id_throws[40]));
        }
        if (((Random)this.id_throws[40]).nextInt(32) == 0) {
            this.id_break(rMq_1.id_class((Random)this.id_throws[40]));
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_class(rMq_1.id_class((Random)this.id_throws[40]));
        this.id_break(rMq_1.id_class((Random)this.id_throws[40]));
        this.sH();
        if (aU_22 == null) {
            aU_22 = new am_3(0.2f);
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        rMl_1 rMl_12 = aI_2.h.id_class(rrEm_12);
        if (au_32 instanceof rMl_1) {
            rMl_12.id_class(this, (rMl_1)au_32);
        }
        rMl_12.sH();
        return rMl_12;
    }

    public void id_class(rMq_1 rMq_12) {
        if (rMq_12.id_class() > 6) {
            rMq_12 = rMq_1.id_class((Random)this.id_throws[40]);
        }
        ((rmE_2)this.id_throws[49]).id_break(id_return, (byte)rMq_12.id_class());
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("MainGene", this.su().id_break());
        rcd_32.id_class("HiddenGene", this.sm().id_break());
    }

    public static /* synthetic */ Random id_class(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    public rMq_1 sm() {
        return rMq_1.id_class(((rmE_2)this.id_throws[49]).id_class(id_public).byteValue());
    }

    public int sc() {
        return ((rmE_2)this.id_throws[49]).id_class(id_else);
    }

    @Override
    public boolean v() {
        return this.sF() == rMq_1.AGGRESSIVE;
    }

    public boolean sd() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized) > 0;
    }

    private void sj() {
        rjU_2 rjU_22 = this.rv();
        ((rYB)this.id_throws[7]).id_class(rLQ.id_switch, this.rx() - (double)(this.PN() + 1.0f) * 0.5 * (double)rfU_2.id_class(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180)), this.rH() - (double)0.1f, this.BO() + (double)(this.PN() + 1.0f) * 0.5 * (double)rfU_2.id_break(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180)), rjU_22.id_break, 0.0, rjU_22.id_protected);
        this.id_class(rqn_3.MR, 1.0f, 1.0f);
        for (rMl_1 rMl_12 : ((rYB)this.id_throws[7]).id_class(rMl_1.class, this.rN().id_class(10.0))) {
            if (rMl_12.n_() || !((Boolean)rMl_12.id_throws[20]).booleanValue() || rMl_12.rT() || !rMl_12.sy()) continue;
            rMl_12.id_continue(false);
        }
        if (!((rYB)this.id_throws[7]).id_import() && ((Random)this.id_throws[40]).nextInt(700) == 0 && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_throws)) {
            this.id_class((rpL_2)rdy_3.XO);
        }
    }

    private void sw() {
        this.id_long = this.id_abstract;
        this.id_abstract = this.sx() ? Math.min(1.0f, this.id_abstract + 0.15f) : Math.max(0.0f, this.id_abstract - 0.19f);
    }

    private void sf() {
        ++this.id_super;
        if (this.id_super > 32) {
            this.id_public(false);
        } else if (!((rYB)this.id_throws[7]).id_continue) {
            rjU_2 rjU_22 = this.rv();
            if (this.id_super == 1) {
                float f = ((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180);
                float f2 = this.n_() ? 0.1f : 0.2f;
                this.id_throw = new rjU_2(rjU_22.id_break + (double)(-rfU_2.id_class(f) * f2), 0.0, rjU_22.id_protected + (double)(rfU_2.id_break(f) * f2));
                this.id_byte(this.id_throw.id_break(0.0, 0.27, 0.0));
            } else if ((float)this.id_super != 7.0f && (float)this.id_super != 15.0f && (float)this.id_super != 23.0f) {
                this.id_catch(this.id_throw.id_break, rjU_22.id_byte, this.id_throw.id_protected);
            } else {
                this.id_catch(0.0, (Boolean)this.id_throws[20] != false ? 0.27 : rjU_22.id_byte, 0.0);
            }
        }
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (this.sl()) {
            return ryZ_2.PASS;
        }
        if (this.sx()) {
            this.id_else(false);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        if (this.id_extends(rdn_32)) {
            if (this.I_() != null) {
                this.id_try = true;
            }
            if (this.n_()) {
                this.id_class(rhd_32, rdn_32);
                this.id_class((int)((float)(-this.O_() / 20) * 0.1f), true);
            } else if (!((rYB)this.id_throws[7]).id_continue && this.O_() == 0 && this.sk()) {
                this.id_class(rhd_32, rdn_32);
                this.id_throws(rhd_32);
            } else {
                if (((rYB)this.id_throws[7]).id_continue || this.sJ() || this.rT()) {
                    return ryZ_2.PASS;
                }
                this.sg();
                this.id_synchronized(true);
                rdn_3 rdn_33 = this.id_class(rXQ.MAINHAND);
                if (!rdn_33.id_class() && !((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    this.a_(rdn_33);
                }
                this.id_class(rXQ.MAINHAND, new rdn_3(rdn_32.id_break(), 1));
                this.id_class(rhd_32, rdn_32);
            }
            return ryZ_2.SUCCESS;
        }
        return ryZ_2.PASS;
    }

    public static /* synthetic */ Random id_break(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.MD, 0.15f, 1.0f);
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        if (this.id_class(rXQ.MAINHAND).id_class() && id_import.test(rsE_22)) {
            this.id_class(rsE_22);
            rdn_3 rdn_32 = rsE_22.id_protected();
            this.id_class(rXQ.MAINHAND, rdn_32);
            this.id_new[rXQ.MAINHAND.id_break()] = 2.0f;
            this.id_class((an_3)rsE_22, rdn_32.id_char());
            rsE_22.PD();
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        this.id_this(false);
        return super.id_break(rye_32, f);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class(rMq_1.id_class(rcd_32.id_native("MainGene")));
        this.id_break(rMq_1.id_class(rcd_32.id_native("HiddenGene")));
    }

    public void id_break(rMq_1 rMq_12) {
        if (rMq_12.id_class() > 6) {
            rMq_12 = rMq_1.id_class((Random)this.id_throws[40]);
        }
        ((rmE_2)this.id_throws[49]).id_break(id_public, (byte)rMq_12.id_class());
    }

    public static /* synthetic */ Random id_throws(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        if (!this.id_class(rXQ2).id_class()) {
            return false;
        }
        return rXQ2 == rXQ.MAINHAND && super.id_throws(rdn_32);
    }

    public int L() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    public boolean sx() {
        return this.id_public(16);
    }

    public static iz_3 sv() {
        return is_3.id_package().id_class(iQ_2.id_protected, 0.15f).id_class(iQ_2.id_case, 6.0);
    }

    public static /* synthetic */ Random id_finally(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    public static /* synthetic */ Random id_catch(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break() == xu_3.hs.id_case();
    }

    public static /* synthetic */ Random id_extends(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    public static /* synthetic */ boolean id_case(rMl_1 rMl_12) {
        return (Boolean)rMl_12.id_throws[20];
    }

    public void id_else(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, n);
    }

    public void id_else(boolean bl) {
        this.id_protected(16, bl);
    }

    public static /* synthetic */ Random id_implements(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    public void id_return(boolean bl) {
        this.id_protected(2, bl);
        if (!bl) {
            this.id_synchronized(0);
        }
    }

    private void id_return(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, n);
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_char, this.id_interface);
    }

    @Override
    protected rqA_2 id_static() {
        if (this.v()) {
            return rqn_3.Me;
        }
        return this.sA() ? rqn_3.Ma : rqn_3.MY;
    }

    public void id_public(boolean bl) {
        this.id_protected(4, bl);
    }

    private boolean id_public(int n) {
        return (((rmE_2)this.id_throws[49]).id_class(id_goto) & n) != 0;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        this.id_class(rqn_3.Or, 1.0f, 1.0f);
        if (!this.v()) {
            this.id_instanceof = true;
        }
        return super.id_public(an_32);
    }

    public static /* synthetic */ Random id_protected(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return false;
    }

    private void id_protected(int n, boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_goto);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_goto, (byte)(by | n));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_goto, (byte)(by & ~n));
        }
    }

    public static /* synthetic */ Random id_private(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(2, new rMI(this, 2.0));
        this.id_package.id_class(2, new rMt_1(this, this, 1.0));
        this.id_package.id_class(3, new rMH(this, (double)1.2f, true));
        this.id_package.id_class(4, new rSO((aA_2)this, 1.0, rkg_3.id_class(xu_3.hs.id_case()), false));
        this.id_package.id_class(6, new rMy_1<rhd_3>(this, rhd_3.class, 8.0f, 2.0, 2.0));
        this.id_package.id_class(6, new rMy_1<rEi_1>(this, rEi_1.class, 4.0f, 2.0, 2.0));
        this.id_package.id_class(7, new rMV(this));
        this.id_package.id_class(8, new rMT(this));
        this.id_package.id_class(8, new rMp_1(this));
        this.id_static = new rMg_1(this, rhd_3.class, 6.0f);
        this.id_package.id_class(9, this.id_static);
        this.id_package.id_class(10, new rBC(this));
        this.id_package.id_class(12, new rMj_1(this));
        this.id_package.id_class(13, new rBx_1(this, 1.25));
        this.id_package.id_class(14, new rSk_1(this, 1.0));
        this.id_int.id_class(1, new rMf_1(this, new Class[0]).id_class(new Class[0]));
    }

    public void id_synchronized(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, bl ? 1 : 0);
    }

    public void id_synchronized(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_else, n);
    }

    private boolean id_native(rdn_3 rdn_32) {
        return this.id_extends(rdn_32) || rdn_32.id_break() == xu_3.BB.id_case();
    }

    public static /* synthetic */ Random id_native(rMl_1 rMl_12) {
        return (Random)rMl_12.id_throws[40];
    }

    private void st() {
        this.id_char = this.id_interface;
        this.id_interface = this.sJ() ? Math.min(1.0f, this.id_interface + 0.15f) : Math.max(0.0f, this.id_interface - 0.19f);
    }

    public boolean sn() {
        return this.sF() == rMq_1.PLAYFUL;
    }

    private void sq() {
        if (!this.sd() && this.sJ() && !this.sl() && !this.id_class(rXQ.MAINHAND).id_class() && ((Random)this.id_throws[40]).nextInt(80) == 1) {
            this.id_synchronized(true);
        } else if (this.id_class(rXQ.MAINHAND).id_class() || !this.sJ()) {
            this.id_synchronized(false);
        }
        if (this.sd()) {
            this.sT();
            if (!((rYB)this.id_throws[7]).id_continue && this.sp() > 80 && ((Random)this.id_throws[40]).nextInt(20) == 1) {
                if (this.sp() > 100 && this.id_native(this.id_class(rXQ.MAINHAND))) {
                    if (!((rYB)this.id_throws[7]).id_continue) {
                        this.id_class(rXQ.MAINHAND, rdn_3.id_break);
                    }
                    this.id_this(false);
                }
                this.id_synchronized(false);
                return;
            }
            this.id_return(this.sp() + 1);
        }
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Mo;
    }

    public boolean sJ() {
        return this.id_public(8);
    }

    public boolean sy() {
        return !this.sx() && !this.sl() && !this.sd() && !this.sZ() && !this.sJ();
    }

    public boolean sL() {
        return this.sF() == rMq_1.LAZY;
    }

    public void sH() {
        if (this.sC()) {
            this.id_byte(iQ_2.id_class).id_class(10.0);
        }
        if (this.sL()) {
            this.id_byte(iQ_2.id_protected).id_class(0.07f);
        }
    }

    private void sT() {
        if (this.sp() % 5 == 0) {
            this.id_class(rqn_3.MK, 0.5f + 0.5f * (float)((Random)this.id_throws[40]).nextInt(2), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
            for (int i = 0; i < 6; ++i) {
                rjU_2 rjU_22 = new rjU_2(((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.1);
                rjU_22 = rjU_22.id_class(-((Float)this.id_throws[16]).floatValue() * ((float)Math.PI / 180));
                rjU_22 = rjU_22.id_break(-((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180));
                double d = (double)(-((Random)this.id_throws[40]).nextFloat()) * 0.6 - 0.3;
                rjU_2 rjU_23 = new rjU_2(((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.8, d, 1.0 + ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.4);
                rjU_23 = rjU_23.id_break(-((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
                rjU_23 = rjU_23.id_break(this.rx(), this.rH() + 1.0, this.BO());
                ((rYB)this.id_throws[7]).id_class(new rLk_1(rLQ.id_void, this.id_class(rXQ.MAINHAND)), rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, rjU_22.id_break, rjU_22.id_byte + 0.05, rjU_22.id_protected);
            }
        }
    }

    private void sI() {
        this.id_void = this.id_float;
        this.id_float = this.sZ() ? Math.min(1.0f, this.id_float + 0.15f) : Math.max(0.0f, this.id_float - 0.19f);
    }

    private rMq_1 sV() {
        return ((Random)this.id_throws[40]).nextBoolean() ? this.su() : this.sm();
    }

    public rMq_1 su() {
        return rMq_1.id_class(((rmE_2)this.id_throws[49]).id_class(id_return).byteValue());
    }

    public boolean sZ() {
        return this.id_public(4);
    }

    public rMq_1 sF() {
        return rMq_1.id_class(this.su(), this.sm());
    }

    public boolean sA() {
        return this.sF() == rMq_1.WORRIED;
    }

    public boolean sC() {
        return this.sF() == rMq_1.WEAK;
    }

    public void sg() {
        if (!this.rT()) {
            this.id_catch(0.0f);
            this.id_public().id_final();
            this.id_this(true);
        }
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_else, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_return, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_public, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_goto, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, 0);
    }
}

