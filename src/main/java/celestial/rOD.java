/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.aD_2;
import celestial.aI_2;
import celestial.aK_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.ay_3;
import celestial.eA_2;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBP;
import celestial.rBY;
import celestial.rBx_1;
import celestial.rCE;
import celestial.rLD;
import celestial.rLO;
import celestial.rLQ;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rSs_1;
import celestial.rXA;
import celestial.rXQ;
import celestial.rXm_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rmE_2;
import celestial.rpZ_2;
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
import celestial.xu_3;
import celestial.zr_3;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public abstract class rOD
extends rbZ_2
implements aD_2,
aK_2,
rXm_1 {
    private static final Predicate<iB_2> id_try = iB_22 -> iB_22 instanceof rOD && ((rOD)iB_22).sA();
    private static final ay_3 id_instanceof = new ay_3().id_class(16.0).id_class().id_break().id_byte().id_class(id_try);
    private static final rkg_3 id_throw = rkg_3.id_class(rdy_3.hB, rdy_3.XY, xu_3.Ey.id_case(), rdy_3.Ob, rdy_3.dO, rdy_3.hy, rdy_3.hp);
    private static final rut_3<Byte> id_interface = rmE_2.id_class(rOD.class, ruw_3.id_class);
    private static final rut_3<Optional<UUID>> id_char = rmE_2.id_class(rOD.class, ruw_3.id_package);
    private int id_abstract;
    private int id_long;
    private int id_float;
    public int id_super;
    public int id_this;
    protected boolean id_else;
    protected rXA id_synchronized;
    protected int id_return;
    protected float id_public;
    private boolean id_void;
    private float id_static;
    private float id_import;
    private float id_short;
    private float id_default;
    private float id_const;
    private float id_strictfp;
    protected boolean id_goto = true;
    protected int id_while;

    @Override
    public int id_char() {
        return 400;
    }

    public float id_char(float f) {
        return rfU_2.id_catch(f, this.id_strictfp, this.id_const);
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        if (((Random)this.id_throws[40]).nextInt(3) == 0) {
            this.sc();
        }
        return null;
    }

    @Override
    protected void id_byte(float f) {
        if (f > 6.0f && this.sF()) {
            this.id_public(false);
        }
    }

    @Override
    public boolean id_byte() {
        return this.id_else(4);
    }

    protected boolean id_byte(rhd_3 rhd_32, rdn_3 rdn_32) {
        boolean bl = false;
        float f = 0.0f;
        int n = 0;
        int n2 = 0;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 == rdy_3.hB) {
            f = 2.0f;
            n = 20;
            n2 = 3;
        } else if (rdb_32 == rdy_3.XY) {
            f = 1.0f;
            n = 30;
            n2 = 3;
        } else if (rdb_32 == xu_3.Ey.id_case()) {
            f = 20.0f;
            n = 180;
        } else if (rdb_32 == rdy_3.Ob) {
            f = 3.0f;
            n = 60;
            n2 = 3;
        } else if (rdb_32 == rdy_3.dO) {
            f = 4.0f;
            n = 60;
            n2 = 5;
            if (!((rYB)this.id_throws[7]).id_continue && this.sm() && this.O_() == 0 && !this.sQ()) {
                bl = true;
                this.id_throws(rhd_32);
            }
        } else if (rdb_32 == rdy_3.hy || rdb_32 == rdy_3.hp) {
            f = 10.0f;
            n = 240;
            n2 = 10;
            if (!((rYB)this.id_throws[7]).id_continue && this.sm() && this.O_() == 0 && !this.sQ()) {
                bl = true;
                this.id_throws(rhd_32);
            }
        }
        if (this.Ss() < this.SK() && f > 0.0f) {
            this.id_protected(f);
            bl = true;
        }
        if (this.n_() && n > 0) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_char, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), 0.0, 0.0, 0.0);
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.d_(n);
            }
            bl = true;
        }
        if (n2 > 0 && (bl || !this.sm()) && this.sn() < this.sT()) {
            bl = true;
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_return(n2);
            }
        }
        if (bl) {
            this.n();
        }
        return bl;
    }

    protected rOD(aI_2<? extends rOD> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        Float f = Float.valueOf(1.0f);
        this.id_throws[37] = f;
        this.sC();
    }

    protected rqA_2 sp() {
        this.sc();
        return null;
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.id_long > 0 && ++this.id_long > 30) {
            this.id_long = 0;
            this.id_protected(64, false);
        }
        if ((this.Po() || this.id_try()) && this.id_float > 0 && ++this.id_float > 20) {
            this.id_float = 0;
            this.id_goto(false);
        }
        if (this.id_super > 0 && ++this.id_super > 8) {
            this.id_super = 0;
        }
        if (this.id_this > 0) {
            ++this.id_this;
            if (this.id_this > 300) {
                this.id_this = 0;
            }
        }
        this.id_import = this.id_static;
        if (this.sF()) {
            this.id_static += (1.0f - this.id_static) * 0.4f + 0.05f;
            if (this.id_static > 1.0f) {
                this.id_static = 1.0f;
            }
        } else {
            this.id_static += (0.0f - this.id_static) * 0.4f - 0.05f;
            if (this.id_static < 0.0f) {
                this.id_static = 0.0f;
            }
        }
        this.id_default = this.id_short;
        if (this.sL()) {
            this.id_import = this.id_static = 0.0f;
            this.id_short += (1.0f - this.id_short) * 0.4f + 0.05f;
            if (this.id_short > 1.0f) {
                this.id_short = 1.0f;
            }
        } else {
            this.id_void = false;
            this.id_short += (0.8f * this.id_short * this.id_short * this.id_short - this.id_short) * 0.6f - 0.05f;
            if (this.id_short < 0.0f) {
                this.id_short = 0.0f;
            }
        }
        this.id_strictfp = this.id_const;
        if (this.id_else(64)) {
            this.id_const += (1.0f - this.id_const) * 0.7f + 0.05f;
            if (this.id_const > 1.0f) {
                this.id_const = 1.0f;
            }
        } else {
            this.id_const += (0.0f - this.id_const) * 0.7f - 0.05f;
            if (this.id_const < 0.0f) {
                this.id_const = 0.0f;
            }
        }
    }

    protected void sl() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_protected(4, !this.id_synchronized.id_extends(0).id_class());
        }
    }

    private void n() {
        rqA_2 rqA_22;
        this.sd();
        if (!this.BF() && (rqA_22 = this.sy()) != null) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqA_22, this.Pr(), 1.0f, 1.0f + (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f);
        }
    }

    public float id_interface(float f) {
        return rfU_2.id_catch(f, this.id_default, this.id_short);
    }

    protected void id_class(zr_3 zr_32) {
        this.id_class(rqn_3.EB, zr_32.id_class() * 0.15f, zr_32.id_break());
    }

    @Override
    public au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return null;
    }

    protected void id_class(au_3 au_32, rOD rOD2) {
        double d = this.id_break(iQ_2.id_class) + au_32.id_break(iQ_2.id_class) + (double)this.sV();
        rOD2.id_byte(iQ_2.id_class).id_class(d / 3.0);
        double d2 = this.id_break(iQ_2.id_volatile) + au_32.id_break(iQ_2.id_volatile) + this.sg();
        rOD2.id_byte(iQ_2.id_volatile).id_class(d2 / 3.0);
        double d3 = this.id_break(iQ_2.id_protected) + au_32.id_break(iQ_2.id_protected) + this.sR();
        rOD2.id_byte(iQ_2.id_protected).id_class(d3 / 3.0);
    }

    @Override
    public boolean id_class(float f, float f2) {
        int n;
        if (f > 1.0f) {
            this.id_class(rqn_3.EE, 0.4f, 1.0f);
        }
        if ((n = this.id_implements(f, f2)) <= 0) {
            return false;
        }
        this.id_break(rye_3.id_extends, (float)n);
        if (this.BP()) {
            for (an_3 an_32 : this.PP()) {
                an_32.id_break(rye_3.id_extends, n);
            }
        }
        this.sM();
        return true;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("EatingHaystack", this.sF());
        rcd_32.id_class("Bred", this.sA());
        rcd_32.id_break("Temper", this.sn());
        rcd_32.id_class("Tame", this.sm());
        if (this.sZ() != null) {
            rcd_32.id_class("Owner", this.sZ());
        }
        if (!this.id_synchronized.id_extends(0).id_class()) {
            rcd_32.id_class("SaddleItem", this.id_synchronized.id_extends(0).id_break(new rcd_3()));
        }
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        boolean bl = this.id_byte();
        this.sl();
        if ((Integer)this.id_throws[41] > 20 && !bl && this.id_byte()) {
            this.id_class(rqn_3.EG, 0.5f, 1.0f);
        }
    }

    @Override
    public void id_class(int n) {
        if (this.id_byte()) {
            if (n < 0) {
                n = 0;
            } else {
                this.id_void = true;
                this.sc();
            }
            this.id_public = n >= 90 ? 1.0f : 0.4f + 0.4f * (float)n / 90.0f;
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (aU_22 == null) {
            aU_22 = new am_3(0.2f);
        }
        this.L();
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(byte by) {
        if (by == 7) {
            this.id_while(true);
        } else if (by == 6) {
            this.id_while(false);
        } else {
            super.id_class(by);
        }
    }

    private rjU_2 id_class(rjU_2 rjU_22, iB_2 iB_22) {
        double d = this.rx() + rjU_22.id_break;
        double d2 = this.rN().id_break;
        double d3 = this.BO() + rjU_22.id_protected;
        rfw_3 rfw_32 = new rfw_3();
        block0: for (iM_2 iM_22 : iB_22.BV()) {
            rfw_32.id_break(d, d2, d3);
            double d4 = this.rN().id_throws + 0.75;
            do {
                rjU_2 rjU_23;
                rfl_3 rfl_32;
                double d5 = ((rYB)this.id_throws[7]).id_private(rfw_32);
                if ((double)rfw_32.c_() + d5 > d4) continue block0;
                if (rqI_2.id_class(d5) && rqI_2.id_class((rYB)this.id_throws[7], iB_22, (rfl_32 = iB_22.id_catch(iM_22)).id_protected(rjU_23 = new rjU_2(d, (double)rfw_32.c_() + d5, d3)))) {
                    iB_22.id_class(iM_22);
                    return rjU_23;
                }
                rfw_32.id_class(rpr_3.UP);
            } while ((double)rfw_32.c_() < d4);
        }
        return null;
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        int n2 = n - 400;
        if (n2 >= 0 && n2 < 2 && n2 < this.id_synchronized.id_else()) {
            if (n2 == 0 && rdn_32.id_break() != rdy_3.hK) {
                return false;
            }
            if (n2 != 1 || this.sY() && this.id_native(rdn_32)) {
                this.id_synchronized.id_break(n2, rdn_32);
                this.sl();
                return true;
            }
            return false;
        }
        int n3 = n - 500 + 2;
        if (n3 >= 2 && n3 < this.id_synchronized.id_else()) {
            this.id_synchronized.id_break(n3, rdn_32);
            return true;
        }
        return false;
    }

    @Override
    public void id_class(rqL_2 rqL_22) {
        this.id_synchronized.id_break(0, new rdn_3(rdy_3.hK));
        if (rqL_22 != null) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.EG, rqL_22, 0.5f, 1.0f);
        }
    }

    @Override
    public boolean id_class() {
        return this.BM() && !this.n_() && this.sm();
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        return false;
    }

    public boolean sm() {
        return this.id_else(2);
    }

    private void sc() {
        if (this.Po() || this.id_try()) {
            this.id_float = 1;
            this.id_goto(true);
        }
    }

    @Override
    public void id_default() {
        if (((Random)this.id_throws[40]).nextInt(200) == 0) {
            this.sJ();
        }
        super.id_default();
        if (!((rYB)this.id_throws[7]).id_continue && this.BM()) {
            if (((Random)this.id_throws[40]).nextInt(900) == 0 && (Integer)this.id_private[13] == 0) {
                this.id_protected(1.0f);
            }
            if (this.sw()) {
                if (!this.sF() && !this.BP() && ((Random)this.id_throws[40]).nextInt(300) == 0 && ((rYB)this.id_throws[7]).id_byte(this.Bs().id_break()).id_class(xu_3.id_implements)) {
                    this.id_public(true);
                }
                if (this.sF() && ++this.id_abstract > 50) {
                    this.id_abstract = 0;
                    this.id_public(false);
                }
            }
            this.st();
        }
    }

    private void sd() {
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_long = 1;
            this.id_protected(64, true);
        }
    }

    protected boolean sj() {
        return !this.BP() && !this.Pm() && this.sm() && !this.n_() && this.Ss() >= this.SK() && this.sQ();
    }

    public boolean sw() {
        return true;
    }

    protected void sf() {
        this.id_class(rqn_3.Es, 0.4f, 1.0f);
    }

    @Override
    public void id_break(int n) {
        this.id_void = true;
        this.sc();
        this.sf();
    }

    public ryZ_2 id_break(rhd_3 rhd_32, rdn_3 rdn_32) {
        boolean bl = this.id_byte(rhd_32, rdn_32);
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        if (((rYB)this.id_throws[7]).id_continue) {
            return ryZ_2.CONSUME;
        }
        return bl ? ryZ_2.SUCCESS : ryZ_2.PASS;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.95f;
    }

    public void id_break(UUID uUID) {
        ((rmE_2)this.id_throws[49]).id_break(id_char, Optional.ofNullable(uUID));
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        Object object;
        UUID uUID;
        super.id_break(rcd_32);
        this.id_public(rcd_32.id_new("EatingHaystack"));
        this.id_return(rcd_32.id_new("Bred"));
        this.id_synchronized(rcd_32.id_private("Temper"));
        this.id_else(rcd_32.id_new("Tame"));
        if (rcd_32.id_break("Owner")) {
            uUID = rcd_32.id_class("Owner");
        } else {
            object = rcd_32.id_native("Owner");
            uUID = rCE.id_class(this.rC(), (String)object);
        }
        if (uUID != null) {
            this.id_break(uUID);
        }
        if (rcd_32.id_byte("SaddleItem", 10) && ((rdn_3)(object = rdn_3.id_class(rcd_32.id_int("SaddleItem")))).id_break() == rdy_3.hK) {
            this.id_synchronized.id_break(0, (rdn_3)object);
        }
        this.sl();
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        if (!xc_32.id_byte().id_class()) {
            xc_3 xc_33 = ((rYB)this.id_throws[7]).id_byte(rfH_22.id_final());
            zr_3 zr_32 = xc_32.id_package();
            if (xc_33.id_class(xu_3.Pq)) {
                zr_32 = xc_33.id_package();
            }
            if (this.BP() && this.id_goto) {
                ++this.id_while;
                if (this.id_while > 5 && this.id_while % 3 == 0) {
                    this.id_class(zr_32);
                } else if (this.id_while <= 5) {
                    this.id_class(rqn_3.EM, zr_32.id_class() * 0.15f, zr_32.id_break());
                }
            } else if (zr_32 == zr_3.id_class) {
                this.id_class(rqn_3.EM, zr_32.id_class() * 0.15f, zr_32.id_break());
            } else {
                this.id_class(rqn_3.Eb, zr_32.id_class() * 0.15f, zr_32.id_break());
            }
        }
    }

    @Override
    public boolean id_throws() {
        return this.id_byte();
    }

    protected void L() {
    }

    protected int sx() {
        return 2;
    }

    public boolean so() {
        return !this.id_class(rXQ.CHEST).id_class();
    }

    public boolean sv() {
        return this.id_else;
    }

    protected void id_catch(rhd_3 rhd_32) {
        this.id_public(false);
        this.id_goto(false);
        if (!((rYB)this.id_throws[7]).id_continue) {
            Float f = Float.valueOf(((Float)this.id_throws[15]).floatValue());
            rhd_32.id_throws[15] = f;
            Float f2 = Float.valueOf(((Float)this.id_throws[16]).floatValue());
            rhd_32.id_throws[16] = f2;
            rhd_32.id_this(this);
        }
    }

    @Override
    public void id_catch(an_3 an_32) {
        super.id_catch(an_32);
        if (an_32 instanceof is_3) {
            is_3 is_32 = (is_3)an_32;
            Float f = Float.valueOf(((Float)is_32.id_private[23]).floatValue());
            this.id_private[23] = f;
        }
        if (this.id_default > 0.0f) {
            float f = rfU_2.id_class(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
            float f2 = rfU_2.id_break(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180));
            float f3 = 0.7f * this.id_default;
            float f4 = 0.15f * this.id_default;
            an_32.id_new(this.rx() + (double)(f3 * f), this.re() + this.PS() + an_32.Pv() + (double)f4, this.BO() - (double)(f3 * f2));
            if (an_32 instanceof iB_2) {
                Float f5 = Float.valueOf(((Float)this.id_private[23]).floatValue());
                ((iB_2)an_32).id_private[23] = f5;
            }
        }
    }

    @Override
    public boolean G() {
        return this.rU() instanceof iB_2;
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return id_throw.id_class(rdn_32);
    }

    public void id_goto(boolean bl) {
        if (bl) {
            this.id_public(false);
        }
        this.id_protected(32, bl);
    }

    @Override
    public void id_case() {
    }

    public void id_case(rhd_3 rhd_32) {
        if (!((rYB)this.id_throws[7]).id_continue && (!this.BP() || this.id_synchronized(rhd_32)) && this.sm()) {
            rhd_32.id_class(this, this.id_synchronized);
        }
    }

    public void id_else(boolean bl) {
        this.id_protected(2, bl);
    }

    protected boolean id_else(int n) {
        return (((rmE_2)this.id_throws[49]).id_class(id_interface) & n) != 0;
    }

    @Override
    protected int id_implements(float f, float f2) {
        return rfU_2.id_case((f * 0.5f - 3.0f) * f2);
    }

    public int id_return(int n) {
        int n2 = rfU_2.id_class(this.sn() + n, 0, this.sT());
        this.id_synchronized(n2);
        return n2;
    }

    public void id_return(boolean bl) {
        this.id_protected(8, bl);
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_import, this.id_static);
    }

    protected void id_while(boolean bl) {
        rLO rLO2 = bl ? rLQ.id_long : rLQ.id_double;
        for (int i = 0; i < 7; ++i) {
            double d = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLO2, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), d, d2, d3);
        }
    }

    @Override
    protected rqA_2 id_static() {
        if (((Random)this.id_throws[40]).nextInt(10) == 0 && !this.BK()) {
            this.sc();
        }
        return null;
    }

    public void id_public(boolean bl) {
        this.id_protected(16, bl);
    }

    protected void id_protected(int n, boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_interface);
        if (bl) {
            ((rmE_2)this.id_throws[49]).id_break(id_interface, (byte)(by | n));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_interface, (byte)(by & ~n));
        }
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.BM()) {
            if (this.BP() && this.G() && this.id_byte()) {
                iB_2 iB_22 = (iB_2)this.rU();
                Float f = Float.valueOf(iB_22.sO());
                this.id_throws[15] = f;
                Float f2 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
                this.id_throws[17] = f2;
                Float f3 = Float.valueOf(iB_22.Bo() * 0.5f);
                this.id_throws[16] = f3;
                this.id_case(((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
                Float f4 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
                this.id_private[23] = f4;
                Float f5 = Float.valueOf(((Float)this.id_private[23]).floatValue());
                this.id_private[25] = f5;
                float f6 = ((Float)iB_22.id_private[42]).floatValue() * 0.5f;
                float f7 = ((Float)iB_22.id_private[44]).floatValue();
                if (f7 <= 0.0f) {
                    f7 *= 0.25f;
                    this.id_while = 0;
                }
                if (((Boolean)this.id_throws[20]).booleanValue() && this.id_public == 0.0f && this.sL() && !this.id_void) {
                    f6 = 0.0f;
                    f7 = 0.0f;
                }
                if (this.id_public > 0.0f && !this.sv() && ((Boolean)this.id_throws[20]).booleanValue()) {
                    double d = this.sH() * (double)this.id_public * (double)this.rl();
                    double d2 = this.id_break(rLD.id_private) ? d + (double)((float)(this.id_byte(rLD.id_private).id_byte() + 1) * 0.1f) : d;
                    rjU_2 rjU_23 = this.rv();
                    this.id_catch(rjU_23.id_break, d2, rjU_23.id_protected);
                    this.id_synchronized(true);
                    Boolean bl = true;
                    this.id_throws[57] = bl;
                    if (f7 > 0.0f) {
                        float f8 = rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180));
                        float f9 = rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180));
                        this.id_byte(this.rv().id_break(-0.4f * f8 * this.id_public, 0.0, 0.4f * f9 * this.id_public));
                    }
                    this.id_public = 0.0f;
                }
                Float f10 = Float.valueOf(this.sB() * 0.1f);
                this.id_private[29] = f10;
                if (this.Po()) {
                    this.id_super((float)this.id_class(iQ_2.id_protected));
                    super.id_private(new rjU_2(f6, rjU_22.id_byte, f7));
                } else if (iB_22 instanceof rhd_3) {
                    this.id_byte(rjU_2.id_class);
                }
                if (((Boolean)this.id_throws[20]).booleanValue()) {
                    this.id_public = 0.0f;
                    this.id_synchronized(false);
                }
                this.id_class((iB_2)this, false);
            } else {
                Float f = Float.valueOf(0.02f);
                this.id_private[29] = f;
                super.id_private(rjU_22);
            }
        }
    }

    public boolean id_private(rhd_3 rhd_32) {
        this.id_break(rhd_32.ro());
        this.id_else(true);
        if (rhd_32 instanceof rhN_2) {
            Oo_1.id_public.id_class((rhN_2)rhd_32, this);
        }
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)7);
        return true;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rBY(this, 1.2));
        this.id_package.id_class(1, new rSs_1(this, 1.2));
        this.id_package.id_class(2, new rBP(this, 1.0, rOD.class));
        this.id_package.id_class(4, new rBx_1(this, 1.0));
        this.id_package.id_class(6, new rSk_1(this, 0.7));
        this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(8, new rBC(this));
        this.su();
    }

    public void id_synchronized(int n) {
        this.id_return = n;
    }

    public void id_synchronized(boolean bl) {
        this.id_else = bl;
    }

    public boolean id_native(rdn_3 rdn_32) {
        return false;
    }

    protected void st() {
        rOD rOD2;
        if (this.sA() && this.n_() && !this.sF() && (rOD2 = ((rYB)this.id_throws[7]).id_class(rOD.class, id_instanceof, this, this.rx(), this.re(), this.BO(), this.rN().id_class(16.0))) != null && this.id_int(rOD2) > 4.0) {
            this.id_final.id_class((an_3)rOD2, 0);
        }
    }

    @Override
    public int E() {
        return 6;
    }

    public int sn() {
        return this.id_return;
    }

    public static iz_3 sq() {
        return is_3.id_package().id_class(iQ_2.id_volatile).id_class(iQ_2.id_class, 53.0).id_class(iQ_2.id_protected, 0.225f);
    }

    @Override
    public boolean rG() {
        return !this.BP();
    }

    @Override
    public an_3 rU() {
        return this.Bh().isEmpty() ? null : this.Bh().get(0);
    }

    @Override
    protected boolean BK() {
        return super.BK() && this.BP() && this.id_byte() || this.sF() || this.sL();
    }

    @Override
    protected rqA_2 Bt() {
        return null;
    }

    private void sJ() {
        this.id_super = 1;
    }

    protected rqA_2 sy() {
        return null;
    }

    public boolean sL() {
        return this.id_else(32);
    }

    public double sH() {
        return this.id_class(iQ_2.id_volatile);
    }

    public int sT() {
        return 100;
    }

    public void sI() {
        if (!this.sL()) {
            this.sc();
            rqA_2 rqA_22 = this.sp();
            if (rqA_22 != null) {
                this.id_class(rqA_22, this.Si(), this.SN());
            }
        }
    }

    @Override
    protected void Sx() {
        super.Sx();
        if (this.id_synchronized != null) {
            for (int i = 0; i < this.id_synchronized.id_else(); ++i) {
                rdn_3 rdn_32 = this.id_synchronized.id_extends(i);
                if (rdn_32.id_class() || eA_2.id_throws(rdn_32)) continue;
                this.a_(rdn_32);
            }
        }
    }

    protected float sV() {
        return 15.0f + (float)((Random)this.id_throws[40]).nextInt(8) + (float)((Random)this.id_throws[40]).nextInt(9);
    }

    protected void su() {
        this.id_package.id_class(0, new rSb_1(this));
    }

    @Override
    protected float Si() {
        return 0.8f;
    }

    public UUID sZ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_char).orElse(null);
    }

    public boolean sF() {
        return this.id_else(16);
    }

    public boolean sA() {
        return this.id_else(8);
    }

    protected void sC() {
        rXA rXA2 = this.id_synchronized;
        this.id_synchronized = new rXA(this.sx());
        if (rXA2 != null) {
            rXA2.id_break(this);
            int n = Math.min(rXA2.id_else(), this.id_synchronized.id_else());
            for (int i = 0; i < n; ++i) {
                rdn_3 rdn_32 = rXA2.id_extends(i);
                if (rdn_32.id_class()) continue;
                this.id_synchronized.id_break(i, rdn_32.id_implements());
            }
        }
        this.id_synchronized.id_class(this);
        this.sl();
    }

    protected double sg() {
        return (double)0.4f + ((Random)this.id_throws[40]).nextDouble() * 0.2 + ((Random)this.id_throws[40]).nextDouble() * 0.2 + ((Random)this.id_throws[40]).nextDouble() * 0.2;
    }

    protected double sR() {
        return ((double)0.45f + ((Random)this.id_throws[40]).nextDouble() * 0.3 + ((Random)this.id_throws[40]).nextDouble() * 0.3 + ((Random)this.id_throws[40]).nextDouble() * 0.3) * 0.25;
    }

    public boolean sY() {
        return false;
    }

    @Override
    public rjU_2 a_(iB_2 iB_22) {
        rjU_2 rjU_22 = rOD.id_class(this.PN(), (double)iB_22.PN(), ((Float)this.id_throws[15]).floatValue() + (iB_22.Su() == rpZ_2.RIGHT ? 90.0f : -90.0f));
        rjU_2 rjU_23 = this.id_class(rjU_22, iB_22);
        if (rjU_23 != null) {
            return rjU_23;
        }
        rjU_2 rjU_24 = rOD.id_class(this.PN(), (double)iB_22.PN(), ((Float)this.id_throws[15]).floatValue() + (iB_22.Su() == rpZ_2.LEFT ? 90.0f : -90.0f));
        rjU_2 rjU_25 = this.id_class(rjU_24, iB_22);
        return rjU_25 != null ? rjU_25 : this.Ps();
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_interface, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_char, Optional.empty());
    }

    @Override
    public boolean o_() {
        return false;
    }
}

