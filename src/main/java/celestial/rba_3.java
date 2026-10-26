/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBI;
import celestial.rBk_1;
import celestial.rBv_1;
import celestial.rLQ;
import celestial.rLk_1;
import celestial.rLp_1;
import celestial.rMB;
import celestial.rME;
import celestial.rMG;
import celestial.rMJ;
import celestial.rMK;
import celestial.rMM;
import celestial.rMN;
import celestial.rMO;
import celestial.rMP;
import celestial.rMQ;
import celestial.rMS;
import celestial.rMW;
import celestial.rMX;
import celestial.rMb_1;
import celestial.rMc_1;
import celestial.rMd_1;
import celestial.rMh_1;
import celestial.rMi_1;
import celestial.rMk_1;
import celestial.rMs_1;
import celestial.rMx_1;
import celestial.rMz_1;
import celestial.rOH;
import celestial.rON;
import celestial.rOp_1;
import celestial.rOt_1;
import celestial.rPD;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rYG;
import celestial.rbR_2;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpJ_2;
import celestial.rqA_2;
import celestial.rqM_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rba_3
extends rbZ_2 {
    private static final rut_3<Integer> id_super = rmE_2.id_class(rba_3.class, ruw_3.id_break);
    private static final rut_3<Byte> id_this = rmE_2.id_class(rba_3.class, ruw_3.id_class);
    private static final rut_3<Optional<UUID>> id_else = rmE_2.id_class(rba_3.class, ruw_3.id_package);
    private static final rut_3<Optional<UUID>> id_synchronized = rmE_2.id_class(rba_3.class, ruw_3.id_package);
    public static final Predicate<rsE_2> id_return = rsE_22 -> !rsE_22.id_package() && rsE_22.BM();
    private static final Predicate<an_3> id_public = an_32 -> {
        if (!(an_32 instanceof iB_2)) {
            return false;
        }
        iB_2 iB_22 = (iB_2)an_32;
        return iB_22.SZ() != null && iB_22.SE() < (Integer)iB_22.id_throws[41] + 600;
    };
    public static final Predicate<an_3> id_goto = an_32 -> an_32 instanceof rbR_2 || an_32 instanceof rMi_1;
    private static final Predicate<an_3> id_while = an_32 -> !an_32.Pw() && rpJ_2.id_throws.test((an_3)an_32);
    private rBk_1 id_try;
    private rBk_1 id_instanceof;
    private rBk_1 id_throw;
    private float id_interface;
    private float id_char;
    public float id_abstract;
    public float id_long;
    private int id_float;

    @Override
    public void id_byte(iB_2 iB_22) {
        if (this.sv() && iB_22 == null) {
            this.id_goto(false);
        }
        super.id_byte(iB_22);
    }

    public boolean id_byte(UUID uUID) {
        return this.sZ().contains(uUID);
    }

    public static /* synthetic */ boolean id_byte(rba_3 rba_32) {
        return (Boolean)rba_32.id_throws[20];
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.SL;
    }

    @Override
    public void id_long() {
        rqA_2 rqA_22 = this.id_static();
        if (rqA_22 == rqn_3.SA) {
            this.id_class(rqA_22, 2.0f, this.SN());
        } else {
            super.id_long();
        }
    }

    public rba_3(aI_2<? extends rba_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_extends = new rMO(this);
        this.id_native = new rMX(this);
        this.id_class(rLp_1.DANGER_OTHER, 0.0f);
        this.id_class(rLp_1.DAMAGE_OTHER, 0.0f);
        this.id_byte(true);
    }

    public void id_this(boolean bl) {
        this.id_protected(1, bl);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.id_try()) {
            boolean bl = this.rT();
            if (bl || this.I_() != null || ((rYB)this.id_throws[7]).S()) {
                this.sF();
            }
            if (bl || this.Sc()) {
                this.id_this(false);
            }
            if (this.sx() && ((rYB)this.id_throws[7]).id_int.nextFloat() < 0.2f) {
                rfH_2 rfH_22 = this.Bs();
                xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
                ((rYB)this.id_throws[7]).id_byte(2001, rfH_22, xd_3.id_finally(xc_32));
            }
        }
        this.id_char = this.id_interface;
        this.id_interface = this.su() ? (this.id_interface += (1.0f - this.id_interface) * 0.4f) : (this.id_interface += (0.0f - this.id_interface) * 0.4f);
        this.id_long = this.id_abstract;
        if (this.x()) {
            this.id_abstract += 0.2f;
            if (this.id_abstract > 3.0f) {
                this.id_abstract = 3.0f;
            }
        } else {
            this.id_abstract = 0.0f;
        }
    }

    @Override
    public boolean x() {
        return this.id_else(4);
    }

    public rMN n() {
        return rMN.id_class(((rmE_2)this.id_throws[49]).id_class(id_super));
    }

    public float id_interface(float f) {
        return rfU_2.id_catch(f, this.id_long, this.id_abstract);
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        if (((Random)this.id_throws[40]).nextFloat() < 0.2f) {
            float f = ((Random)this.id_throws[40]).nextFloat();
            rdn_3 rdn_32 = f < 0.05f ? new rdn_3(rdy_3.dP) : (f < 0.2f ? new rdn_3(rdy_3.XJ) : (f < 0.4f ? (((Random)this.id_throws[40]).nextBoolean() ? new rdn_3(rdy_3.dy) : new rdn_3(rdy_3.dp)) : (f < 0.6f ? new rdn_3(rdy_3.hB) : (f < 0.8f ? new rdn_3(rdy_3.ha) : new rdn_3(rdy_3.Oi)))));
            this.id_class(rXQ.MAINHAND, rdn_32);
        }
    }

    @Override
    protected void id_class(rhd_3 rhd_32, is_3 is_32) {
        ((rba_3)is_32).id_break(rhd_32.ro());
    }

    public static /* synthetic */ Random id_class(rba_3 rba_32) {
        return (Random)rba_32.id_throws[40];
    }

    @Override
    public void id_class(byte by) {
        if (by == 45) {
            rdn_3 rdn_32 = this.id_class(rXQ.MAINHAND);
            if (!rdn_32.id_class()) {
                for (int i = 0; i < 8; ++i) {
                    rjU_2 rjU_22 = new rjU_2(((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0).id_class(-((Float)this.id_throws[16]).floatValue() * ((float)Math.PI / 180)).id_break(-((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180));
                    ((rYB)this.id_throws[7]).id_class(new rLk_1(rLQ.id_void, rdn_32), this.rx() + this.m().id_break / 2.0, this.re(), this.BO() + this.m().id_protected / 2.0, rjU_22.id_break, rjU_22.id_byte + 0.05, rjU_22.id_protected);
                }
            }
        } else {
            super.id_class(by);
        }
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    public static boolean id_class(rba_3 rba_32, iB_2 iB_22) {
        double d = iB_22.BO() - rba_32.BO();
        double d2 = iB_22.rx() - rba_32.rx();
        double d3 = d / d2;
        int n = 6;
        for (int i = 0; i < 6; ++i) {
            double d4 = d3 == 0.0 ? 0.0 : d * (double)((float)i / 6.0f);
            double d5 = d3 == 0.0 ? d2 * (double)((float)i / 6.0f) : d4 / d3;
            for (int j = 1; j < 4; ++j) {
                if (((rYB)rba_32.id_throws[7]).id_byte(new rfH_2(rba_32.rx() + d5, rba_32.re() + (double)j, rba_32.BO() + d4)).id_byte().id_throws()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        Optional<rqM_2<rYG>> optional = rRf_12.id_protected(this.Bs());
        rMN rMN2 = rMN.id_class(optional);
        boolean bl = false;
        if (aU_22 instanceof rMb_1) {
            rMN2 = ((rMb_1)aU_22).id_class;
            if (((rMb_1)aU_22).id_class() >= 2) {
                bl = true;
            }
        } else {
            aU_22 = new rMb_1(rMN2);
        }
        this.id_class(rMN2);
        if (bl) {
            this.e_(-24000);
        }
        if (rRf_12 instanceof rrEm_1) {
            this.sm();
        }
        this.id_class(rRh_12);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        List<UUID> list = this.sZ();
        rcy_3 rcy_32 = new rcy_3();
        for (UUID uUID : list) {
            if (uUID == null) continue;
            rcy_32.add(rco_3.id_class(uUID));
        }
        rcd_32.id_class("Trusted", rcy_32);
        rcd_32.id_class("Sleeping", this.Sc());
        rcd_32.id_class("Type", this.n().id_class());
        rcd_32.id_class("Sitting", this.sJ());
        rcd_32.id_class("Crouching", this.x());
    }

    private void id_class(rMN rMN2) {
        ((rmE_2)this.id_throws[49]).id_break(id_super, rMN2.id_break());
    }

    @Override
    protected void id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        if (this.id_extends(rdn_32)) {
            this.id_class(this.id_protected(rdn_32), 1.0f, 1.0f);
        }
        super.id_class(rhd_32, rdn_32);
    }

    private void sm() {
        if (this.n() == rMN.RED) {
            this.id_int.id_class(4, this.id_try);
            this.id_int.id_class(4, this.id_instanceof);
            this.id_int.id_class(6, this.id_throw);
        } else {
            this.id_int.id_class(4, this.id_throw);
            this.id_int.id_class(6, this.id_try);
            this.id_int.id_class(6, this.id_instanceof);
        }
    }

    public boolean sc() {
        return this.id_abstract == 3.0f;
    }

    @Override
    public void id_default() {
        if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.id_try()) {
            Object object;
            ++this.id_float;
            rdn_3 rdn_32 = this.id_class(rXQ.MAINHAND);
            if (this.id_native(rdn_32)) {
                if (this.id_float > 600) {
                    object = rdn_32.id_class((rYB)this.id_throws[7], this);
                    if (!((rdn_3)object).id_class()) {
                        this.id_class(rXQ.MAINHAND, (rdn_3)object);
                    }
                    this.id_float = 0;
                } else if (this.id_float > 560 && ((Random)this.id_throws[40]).nextFloat() < 0.1f) {
                    this.id_class(this.id_protected(rdn_32), 1.0f, 1.0f);
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)45);
                }
            }
            if ((object = this.I_()) == null || !((iB_2)object).BM()) {
                this.id_synchronized(false);
                this.id_return(false);
            }
        }
        if (this.Sc() || this.BK()) {
            Boolean bl = false;
            this.id_private[41] = bl;
            Float f = Float.valueOf(0.0f);
            this.id_private[42] = f;
            Float f2 = Float.valueOf(0.0f);
            this.id_private[44] = f2;
        }
        super.id_default();
        if (this.sv() && ((Random)this.id_throws[40]).nextFloat() < 0.05f) {
            this.id_class(rqn_3.Su, 1.0f, 1.0f);
        }
    }

    public boolean sd() {
        return this.id_else(16);
    }

    public static /* synthetic */ boolean id_break(rba_3 rba_32) {
        return (Boolean)rba_32.id_private[41];
    }

    public void id_break(UUID uUID) {
        if (((rmE_2)this.id_throws[49]).id_class(id_else).isPresent()) {
            ((rmE_2)this.id_throws[49]).id_break(id_synchronized, Optional.ofNullable(uUID));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_else, Optional.ofNullable(uUID));
        }
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        rdn_3 rdn_32 = rsE_22.id_protected();
        if (this.id_private(rdn_32)) {
            int n = rdn_32.id_char();
            if (n > 1) {
                this.id_final(rdn_32.id_class(n - 1));
            }
            this.id_volatile(this.id_class(rXQ.MAINHAND));
            this.id_class(rsE_22);
            this.id_class(rXQ.MAINHAND, rdn_32.id_class(1));
            this.id_new[rXQ.MAINHAND.id_break()] = 2.0f;
            this.id_class((an_3)rsE_22, rdn_32.id_char());
            rsE_22.PD();
            this.id_float = 0;
        }
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? ap_32.id_break * 0.85f : 0.4f;
    }

    public rba_3 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        rba_3 rba_32 = aI_2.id_throw.id_class(rrEm_12);
        rba_32.id_class(((Random)this.id_throws[40]).nextBoolean() ? this.n() : ((rba_3)au_32).n());
        return rba_32;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        rcy_3 rcy_32 = rcd_32.id_protected("Trusted", 11);
        for (int i = 0; i < rcy_32.size(); ++i) {
            this.id_break(rco_3.id_class(rcy_32.id_finally(i)));
        }
        this.id_while(rcd_32.id_new("Sleeping"));
        this.id_class(rMN.id_class(rcd_32.id_native("Type")));
        this.id_this(rcd_32.id_new("Sitting"));
        this.id_synchronized(rcd_32.id_new("Crouching"));
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            this.sm();
        }
    }

    @Override
    public boolean id_throws(rdn_3 rdn_32) {
        rXQ rXQ2 = is_3.id_finally(rdn_32);
        if (!this.id_class(rXQ2).id_class()) {
            return false;
        }
        return rXQ2 == rXQ.MAINHAND && super.id_throws(rdn_32);
    }

    public static /* synthetic */ Random id_throws(rba_3 rba_32) {
        return (Random)rba_32.id_throws[40];
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_break, 32.0).id_class(iQ_2.id_case, 2.0);
    }

    public boolean sx() {
        return this.id_else(64);
    }

    public boolean sv() {
        return this.id_else(128);
    }

    @Override
    public boolean Sc() {
        return this.id_else(32);
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.WQ;
    }

    public void id_goto(boolean bl) {
        this.id_protected(128, bl);
    }

    public static /* synthetic */ Random id_case(rba_3 rba_32) {
        return (Random)rba_32.id_throws[40];
    }

    public void id_else(boolean bl) {
        this.id_protected(16, bl);
    }

    private boolean id_else(int n) {
        return (((rmE_2)this.id_throws[49]).id_class(id_this) & n) != 0;
    }

    @Override
    protected int id_implements(float f, float f2) {
        return rfU_2.id_case((f - 5.0f) * f2);
    }

    public void id_return(boolean bl) {
        this.id_protected(8, bl);
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_char, this.id_interface) * 0.11f * (float)Math.PI;
    }

    public void id_while(boolean bl) {
        this.id_protected(32, bl);
    }

    @Override
    protected rqA_2 id_static() {
        List<an_3> list;
        if (this.Sc()) {
            return rqn_3.Sn;
        }
        if (!((rYB)this.id_throws[7]).id_strictfp() && ((Random)this.id_throws[40]).nextFloat() < 0.1f && (list = ((rYB)this.id_throws[7]).id_class(rhd_3.class, this.rN().id_byte(16.0, 16.0, 16.0), rpJ_2.id_catch)).isEmpty()) {
            return rqn_3.SA;
        }
        return rqn_3.Sm;
    }

    public void id_public(boolean bl) {
        this.id_protected(64, bl);
    }

    public static /* synthetic */ boolean id_protected(rba_3 rba_32) {
        return (Boolean)rba_32.id_throws[20];
    }

    @Override
    protected void id_protected(rye_3 rye_32) {
        rdn_3 rdn_32 = this.id_class(rXQ.MAINHAND);
        if (!rdn_32.id_class()) {
            this.a_(rdn_32);
            this.id_class(rXQ.MAINHAND, rdn_3.id_break);
        }
        super.id_protected(rye_32);
    }

    private void id_protected(int n, boolean bl) {
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_this, (byte)(((rmE_2)this.id_throws[49]).id_class(id_this) | n));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_this, (byte)(((rmE_2)this.id_throws[49]).id_class(id_this) & ~n));
        }
    }

    @Override
    public rqA_2 id_protected(rdn_3 rdn_32) {
        return rqn_3.SF;
    }

    @Override
    public boolean id_private(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        rdn_3 rdn_33 = this.id_class(rXQ.MAINHAND);
        return rdn_33.id_class() || this.id_float > 0 && rdb_32.id_super() && !rdn_33.id_break().id_super();
    }

    @Override
    protected void id_final() {
        this.id_try = new rBI<rbZ_2>(this, rbZ_2.class, 10, false, false, iB_22 -> iB_22 instanceof rbR_2 || iB_22 instanceof rMi_1);
        this.id_instanceof = new rBI<rON>(this, rON.class, 10, false, false, rON.id_super);
        this.id_throw = new rBI<rOp_1>(this, rOp_1.class, 20, false, false, iB_22 -> iB_22 instanceof rOt_1);
        this.id_package.id_class(0, new rMQ(this));
        this.id_package.id_class(1, new rMM(this));
        this.id_package.id_class(2, new rMJ(this, 2.2));
        this.id_package.id_class(3, new rMh_1(this, 1.0));
        this.id_package.id_class(4, new rPD<rhd_3>(this, rhd_3.class, 16.0f, 1.6, 1.4, iB_22 -> id_while.test((an_3)iB_22) && !this.id_byte(iB_22.ro()) && !this.sv()));
        this.id_package.id_class(4, new rPD<rOH>(this, rOH.class, 8.0f, 1.6, 1.4, iB_22 -> !((rOH)iB_22).sZ() && !this.sv()));
        this.id_package.id_class(4, new rPD<rMK>(this, rMK.class, 8.0f, 1.6, 1.4, iB_22 -> !this.sv()));
        this.id_package.id_class(5, new rMG(this));
        this.id_package.id_class(6, new rMx_1(this));
        this.id_package.id_class(6, new rMs_1(this, 1.25));
        this.id_package.id_class(7, new rMP(this, (double)1.2f, true));
        this.id_package.id_class(7, new rMW(this));
        this.id_package.id_class(8, new rME(this, this, 1.25));
        this.id_package.id_class(9, new rMz_1(this, 32, 200));
        this.id_package.id_class(10, new rMB(this, (double)1.2f, 12, 2));
        this.id_package.id_class(10, new rBv_1(this, 0.4f));
        this.id_package.id_class(11, new rSk_1(this, 1.0));
        this.id_package.id_class(11, new rMS(this));
        this.id_package.id_class(12, new rMc_1(this, this, rhd_3.class, 24.0f));
        this.id_package.id_class(13, new rMk_1(this));
        this.id_int.id_class(3, new rMd_1(this, iB_2.class, false, false, iB_22 -> id_public.test((an_3)iB_22) && !this.id_byte(iB_22.ro())));
    }

    private void id_final(rdn_3 rdn_32) {
        rsE_2 rsE_22 = new rsE_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), rdn_32);
        ((rYB)this.id_throws[7]).a_(rsE_22);
    }

    private void id_volatile(rdn_3 rdn_32) {
        if (!rdn_32.id_class() && !((rYB)this.id_throws[7]).id_continue) {
            rsE_2 rsE_22 = new rsE_2((rYB)this.id_throws[7], this.rx() + this.m().id_break, this.re() + 1.0, this.BO() + this.m().id_protected, rdn_32);
            rsE_22.id_class(40);
            rsE_22.id_byte(this.ro());
            this.id_class(rqn_3.Sl, 1.0f, 1.0f);
            ((rYB)this.id_throws[7]).a_(rsE_22);
        }
    }

    public void id_synchronized(boolean bl) {
        this.id_protected(4, bl);
    }

    private boolean id_native(rdn_3 rdn_32) {
        return rdn_32.id_break().id_super() && this.I_() == null && (Boolean)this.id_throws[20] != false && !this.Sc();
    }

    @Override
    protected boolean BK() {
        return this.Sl();
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.55f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Sv;
    }

    public boolean sJ() {
        return this.id_else(1);
    }

    public void sL() {
        this.id_return(false);
        this.id_synchronized(false);
        this.id_this(false);
        this.id_while(false);
        this.id_goto(false);
        this.id_public(false);
    }

    public boolean su() {
        return this.id_else(8);
    }

    public List<UUID> sZ() {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(((rmE_2)this.id_throws[49]).id_class(id_else).orElse(null));
        arrayList.add(((rmE_2)this.id_throws[49]).id_class(id_synchronized).orElse(null));
        return arrayList;
    }

    public void sF() {
        this.id_while(false);
    }

    public boolean sA() {
        return !this.Sc() && !this.sJ() && !this.sx();
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_else, Optional.empty());
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, Optional.empty());
        ((rmE_2)this.id_throws[49]).id_class(id_super, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_this, (byte)0);
    }
}

