/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ag_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBJ;
import celestial.rBP;
import celestial.rBR;
import celestial.rBc_1;
import celestial.rBf_1;
import celestial.rBg_1;
import celestial.rBl_1;
import celestial.rBv_1;
import celestial.rEJ;
import celestial.rEb_1;
import celestial.rEy_1;
import celestial.rLQ;
import celestial.rOD;
import celestial.rON;
import celestial.rOQ;
import celestial.rOy_1;
import celestial.rPU;
import celestial.rSG;
import celestial.rSP;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhP_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxA_2;
import celestial.rxL_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rOH
extends rOQ
implements ag_3 {
    private static final rut_3<Boolean> id_this = rmE_2.id_class(rOH.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_else = rmE_2.id_class(rOH.class, ruw_3.id_break);
    private static final rut_3<Integer> id_synchronized = rmE_2.id_class(rOH.class, ruw_3.id_break);
    public static final Predicate<iB_2> id_super = iB_22 -> {
        aI_2<?> aI_22 = iB_22.BC();
        return aI_22 == aI_2.Z || aI_22 == aI_2.c || aI_22 == aI_2.id_throw;
    };
    private float id_goto;
    private float id_while;
    private boolean id_try;
    private boolean id_instanceof;
    private float id_throw;
    private float id_interface;
    private static final rqb_3 id_char = rqt_3.id_class(20, 39);
    private UUID id_abstract;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Wh;
    }

    @Override
    public UUID id_byte() {
        return this.id_abstract;
    }

    public rOH(aI_2<? extends rOH> aI_22, rYB rYB2) {
        super((aI_2<? extends rOQ>)aI_22, rYB2);
        this.id_return(false);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.BM()) {
            this.id_while = this.id_goto;
            this.id_goto = this.sd() ? (this.id_goto += (1.0f - this.id_goto) * 0.4f) : (this.id_goto += (0.0f - this.id_goto) * 0.4f);
            if (this.Pk()) {
                this.id_try = true;
                if (this.id_instanceof && !((rYB)this.id_throws[7]).id_continue) {
                    ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)56);
                    this.sc();
                }
            } else if ((this.id_try || this.id_instanceof) && this.id_instanceof) {
                if (this.id_throw == 0.0f) {
                    this.id_class(rqn_3.WJ, this.Si(), (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
                }
                this.id_interface = this.id_throw;
                this.id_throw += 0.05f;
                if (this.id_interface >= 2.0f) {
                    this.id_try = false;
                    this.id_instanceof = false;
                    this.id_interface = 0.0f;
                    this.id_throw = 0.0f;
                }
                if (this.id_throw > 0.4f) {
                    float f = (float)this.re();
                    int n = (int)(rfU_2.id_class((this.id_throw - 0.4f) * (float)Math.PI) * 7.0f);
                    rjU_2 rjU_22 = this.rv();
                    for (int i = 0; i < n; ++i) {
                        float f2 = (((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * this.PN() * 0.5f;
                        float f3 = (((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * this.PN() * 0.5f;
                        ((rYB)this.id_throws[7]).id_class(rLQ.E, this.rx() + (double)f2, (double)(f + 0.8f), this.BO() + (double)f3, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
                    }
                }
            }
        }
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_this, bl);
    }

    public boolean n() {
        return this.id_try;
    }

    public float id_interface(float f) {
        return rfU_2.id_catch(f, this.id_while, this.id_goto) * 0.15f * (float)Math.PI;
    }

    @Override
    public int id_class() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
    }

    @Override
    public void id_class(byte by) {
        if (by == 8) {
            this.id_instanceof = true;
            this.id_throw = 0.0f;
            this.id_interface = 0.0f;
        } else if (by == 56) {
            this.sc();
        } else {
            super.id_class(by);
        }
    }

    public void id_class(rxL_2 rxL_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_else, rxL_22.id_break());
    }

    @Override
    public void id_class(UUID uUID) {
        this.id_abstract = uUID;
    }

    @Override
    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, n);
    }

    @Override
    public boolean id_class(iB_2 iB_22, iB_2 iB_23) {
        if (!(iB_22 instanceof rEJ) && !(iB_22 instanceof rEy_1)) {
            if (iB_22 instanceof rOH) {
                rOH rOH2 = (rOH)iB_22;
                return !rOH2.sZ() || rOH2.sF() != iB_23;
            }
            if (iB_22 instanceof rhd_3 && iB_23 instanceof rhd_3 && !((rhd_3)iB_23).id_throws((rhd_3)iB_22)) {
                return false;
            }
            if (iB_22 instanceof rOD && ((rOD)iB_22).sm()) {
                return false;
            }
            return !(iB_22 instanceof rOQ) || !((rOQ)iB_22).sZ();
        }
        return false;
    }

    public static /* synthetic */ Random id_class(rOH rOH2) {
        return (Random)rOH2.id_throws[40];
    }

    @Override
    public boolean id_class(rbZ_2 rbZ_22) {
        if (rbZ_22 == this) {
            return false;
        }
        if (!this.sZ()) {
            return false;
        }
        if (!(rbZ_22 instanceof rOH)) {
            return false;
        }
        rOH rOH2 = (rOH)rbZ_22;
        if (!rOH2.sZ()) {
            return false;
        }
        if (rOH2.Sc()) {
            return false;
        }
        return this.sQ() && rOH2.sQ();
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("CollarColor", (byte)this.sx().id_break());
        this.a_(rcd_32);
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    private void sc() {
        this.id_instanceof = false;
        this.id_throw = 0.0f;
        this.id_interface = 0.0f;
    }

    @Override
    public void id_default() {
        super.id_default();
        if (!((rYB)this.id_throws[7]).id_continue && this.id_try && !this.id_instanceof && !this.id_catch() && ((Boolean)this.id_throws[20]).booleanValue()) {
            this.id_instanceof = true;
            this.id_throw = 0.0f;
            this.id_interface = 0.0f;
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)8);
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
        }
    }

    public boolean sd() {
        return ((rmE_2)this.id_throws[49]).id_class(id_this);
    }

    @Override
    public int r() {
        return this.Sc() ? 20 : super.r();
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (((rYB)this.id_throws[7]).id_continue) {
            boolean bl = this.id_private(rhd_32) || this.sZ() || rdb_32 == rdy_3.XR && !this.sZ() && !this.T_();
            return bl ? ryZ_2.CONSUME : ryZ_2.PASS;
        }
        if (this.sZ()) {
            if (this.id_extends(rdn_32) && this.Ss() < this.SK()) {
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
                this.id_protected((float)rdb_32.id_this().id_class());
                return ryZ_2.SUCCESS;
            }
            if (!(rdb_32 instanceof rxA_2)) {
                ryZ_2 ryZ_22 = super.id_break(rhd_32, rpm_32);
                if ((!ryZ_22.id_class() || this.n_()) && this.id_private(rhd_32)) {
                    this.id_goto(!this.sL());
                    Boolean bl = false;
                    this.id_private[41] = bl;
                    this.id_final.id_final();
                    this.id_byte((iB_2)null);
                    return ryZ_2.SUCCESS;
                }
                return ryZ_22;
            }
            rxL_2 rxL_22 = ((rxA_2)rdb_32).id_byte();
            if (rxL_22 != this.sx()) {
                this.id_class(rxL_22);
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
                return ryZ_2.SUCCESS;
            }
        } else if (rdb_32 == rdy_3.XR && !this.T_()) {
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            if (((Random)this.id_throws[40]).nextInt(3) == 0) {
                this.id_case(rhd_32);
                this.id_final.id_final();
                this.id_byte((iB_2)null);
                this.id_goto(true);
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)7);
            } else {
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)6);
            }
            return ryZ_2.SUCCESS;
        }
        return super.id_break(rhd_32, rpm_32);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.Wx, 0.15f, 1.0f);
    }

    public rOH id_break(rrEm_1 rrEm_12, au_3 au_32) {
        rOH rOH2 = aI_2.rB.id_class(rrEm_12);
        UUID uUID = this.sv();
        if (uUID != null) {
            rOH2.id_break(uUID);
            rOH2.id_return(true);
        }
        return rOH2;
    }

    @Override
    public void id_break(rye_3 rye_32) {
        this.id_try = false;
        this.id_instanceof = false;
        this.id_interface = 0.0f;
        this.id_throw = 0.0f;
        super.id_break(rye_32);
    }

    public float id_break(float f, float f2) {
        float f3 = (rfU_2.id_catch(f, this.id_interface, this.id_throw) + f2) / 1.8f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return rfU_2.id_class(f3 * (float)Math.PI) * rfU_2.id_class(f3 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.8f;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("CollarColor", 99)) {
            this.id_class(rxL_2.id_class(rcd_32.id_private("CollarColor")));
        }
        this.id_class((rrEm_1)((rYB)this.id_throws[7]), rcd_32);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        an_3 an_32 = rye_32.id_extends();
        this.id_goto(false);
        if (an_32 != null && !(an_32 instanceof rhd_3) && !(an_32 instanceof rhm_3)) {
            f = (f + 1.0f) / 2.0f;
        }
        return super.id_break(rye_32, f);
    }

    public static iz_3 L() {
        return is_3.id_package().id_class(iQ_2.id_protected, 0.3f).id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_case, 2.0);
    }

    public rxL_2 sx() {
        return rxL_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_else));
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rdb_32.id_super() && rdb_32.id_this().id_byte();
    }

    @Override
    public void id_return(boolean bl) {
        super.id_return(bl);
        if (bl) {
            this.id_byte(iQ_2.id_class).id_class(20.0);
            this.id_public(20.0f);
        } else {
            this.id_byte(iQ_2.id_class).id_class(8.0);
        }
        this.id_byte(iQ_2.id_case).id_class(4.0);
    }

    public float id_throw(float f) {
        return Math.min(0.5f + rfU_2.id_catch(f, this.id_interface, this.id_throw) / 2.0f * 0.5f, 1.0f);
    }

    @Override
    protected rqA_2 id_static() {
        if (this.T_()) {
            return rqn_3.WM;
        }
        if (((Random)this.id_throws[40]).nextInt(3) == 0) {
            return this.sZ() && this.Ss() < 10.0f ? rqn_3.Wd : rqn_3.WX;
        }
        return rqn_3.WG;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl = an_32.id_break(rye_3.id_byte(this), (int)this.id_class(iQ_2.id_case));
        if (bl) {
            this.id_class((iB_2)this, an_32);
        }
        return bl;
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return !this.T_() && super.id_protected(rhd_32);
    }

    @Override
    public void id_protected() {
        this.id_class(id_char.id_class((Random)this.id_throws[40]));
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(2, new rSG(this));
        this.id_package.id_class(3, new rOy_1(this, this, rhP_2.class, 24.0f, 1.5, 1.5));
        this.id_package.id_class(4, new rBv_1(this, 0.4f));
        this.id_package.id_class(5, new rBl_1(this, 1.0, true));
        this.id_package.id_class(6, new rBJ(this, 1.0, 10.0f, 2.0f, false));
        this.id_package.id_class(7, new rBP(this, 1.0));
        this.id_package.id_class(8, new rSk_1(this, 1.0));
        this.id_package.id_class(9, new rPU(this, 8.0f));
        this.id_package.id_class(10, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(10, new rBC(this));
        this.id_int.id_class(1, new rBg_1(this));
        this.id_int.id_class(2, new rBR(this));
        this.id_int.id_class(3, new rBc_1(this, new Class[0]).id_class(new Class[0]));
        this.id_int.id_class(4, new rBI<rhd_3>(this, rhd_3.class, 10, true, false, this::b_));
        this.id_int.id_class(5, new rBf_1<rbZ_2>(this, rbZ_2.class, false, id_super));
        this.id_int.id_class(6, new rBf_1<rON>(this, rON.class, false, rON.id_super));
        this.id_int.id_class(7, new rBI<rEb_1>((is_3)this, rEb_1.class, false));
        this.id_int.id_class(8, new rSP<rOH>(this, true));
    }

    @Override
    public int E() {
        return 8;
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.6f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Wb;
    }

    public float sJ() {
        if (this.T_()) {
            return 1.5393804f;
        }
        return this.sZ() ? (0.55f - (this.SK() - this.Ss()) * 0.02f) * (float)Math.PI : 0.62831855f;
    }

    @Override
    protected float Si() {
        return 0.4f;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_this, false);
        ((rmE_2)this.id_throws[49]).id_class(id_else, rxL_2.RED.id_break());
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, 0);
    }
}

