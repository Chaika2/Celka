/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.aq_3;
import celestial.au_3;
import celestial.aw_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.is_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rBy_1;
import celestial.rEJ;
import celestial.rEi_1;
import celestial.rLA;
import celestial.rMZ;
import celestial.rON;
import celestial.rPi_1;
import celestial.rRO;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rRu_1;
import celestial.rSW;
import celestial.rSk_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rbE_2;
import celestial.rbG_2;
import celestial.rbR_2;
import celestial.rbS_2;
import celestial.rbs_3;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rlG_2;
import celestial.rmE_2;
import celestial.rpJ_2;
import celestial.rpc_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEj_1;
import celestial.rrEm_1;
import celestial.rsq_3;
import celestial.rsy_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rbB_2
extends rEi_1 {
    private static final UUID id_class = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final ix_3 id_break = new ix_3(id_class, "Baby speed boost", 0.5, id_3.MULTIPLY_BASE);
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rbB_2.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_super = rmE_2.id_class(rbB_2.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_this = rmE_2.id_class(rbB_2.class, ruw_3.id_implements);
    private static final Predicate<rRO> id_else = rRO2 -> rRO2 == rRO.HARD;
    private final rPi_1 id_synchronized = new rPi_1(this, id_else);
    private boolean id_return;
    private int id_public;
    private int id_goto;

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        if (this.n_()) {
            this.id_finally = (int)((float)this.id_finally * 2.5f);
        }
        return super.id_byte(rhd_32);
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.We;
    }

    public rbB_2(aI_2<? extends rbB_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
    }

    public rbB_2(rYB rYB2) {
        this((aI_2<? extends rbB_2>)aI_2.rs, rYB2);
    }

    @Override
    public void id_this() {
        if (!((rYB)this.id_throws[7]).id_continue && this.BM() && !this.c()) {
            if (this.sQ()) {
                --this.id_goto;
                if (this.id_goto < 0) {
                    this.sW();
                }
            } else if (this.sd()) {
                if (((an_3)this).id_class(rlG_2.id_break)) {
                    ++this.id_public;
                    if (this.id_public >= 600) {
                        this.id_class(300);
                    }
                } else {
                    this.id_public = -1;
                }
            }
        }
        super.id_this();
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_protected.equals(rut_32)) {
            this.q_();
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_class(boolean bl) {
        this.BQ().id_break(id_protected, bl);
        if ((rYB)this.id_throws[7] != null && !((rYB)this.id_throws[7]).id_continue) {
            ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
            ic_32.id_protected(id_break);
            if (bl) {
                ic_32.id_break(id_break);
            }
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("IsBaby", this.n_());
        rcd_32.id_class("CanBreakDoors", this.sN());
        rcd_32.id_break("InWaterTime", this.rT() ? this.id_public : -1);
        rcd_32.id_break("DrownedConversionTime", this.sQ() ? this.id_goto : -1);
    }

    @Override
    protected void id_class(rye_3 rye_32, int n, boolean bl) {
        rdn_3 rdn_32;
        rEJ rEJ2;
        super.id_class(rye_32, n, bl);
        an_3 an_32 = rye_32.id_extends();
        if (an_32 instanceof rEJ && (rEJ2 = (rEJ)an_32).sd() && !(rdn_32 = this.sx()).id_class()) {
            rEJ2.sk();
            this.a_(rdn_32);
        }
    }

    private void id_class(int n) {
        this.id_goto = n;
        this.BQ().id_break(id_this, true);
    }

    public static boolean id_class(Random random) {
        return random.nextFloat() < 0.05f;
    }

    public static /* synthetic */ Random id_class(rbB_2 rbB_22) {
        return (Random)rbB_22.id_throws[40];
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        Object object;
        aU_22 = super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
        float f = rRh_12.id_byte();
        this.id_byte(((Random)this.id_throws[40]).nextFloat() < 0.55f * f);
        if (aU_22 == null) {
            aU_22 = new rbs_3(rbB_2.id_class(rRf_12.id_long()), true);
        }
        if (aU_22 instanceof rbs_3) {
            object = (rbs_3)aU_22;
            if (((rbs_3)object).id_class) {
                this.id_class(true);
                if (((rbs_3)object).id_break) {
                    if ((double)rRf_12.id_long().nextFloat() < 0.05) {
                        var8_8 = rRf_12.id_class(rbR_2.class, this.rN().id_byte(5.0, 3.0, 5.0), rpJ_2.id_byte);
                        if (!var8_8.isEmpty()) {
                            rbR_2 rbR_22 = (rbR_2)var8_8.get(0);
                            rbR_22.id_this(true);
                            this.id_this(rbR_22);
                        }
                    } else if ((double)rRf_12.id_long().nextFloat() < 0.05) {
                        var8_8 = aI_2.id_finally.id_class((rYB)this.id_throws[7]);
                        ((an_3)((Object)var8_8)).id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), 0.0f);
                        ((au_3)((Object)var8_8)).id_class(rRf_12, rRh_12, iO_2.JOCKEY, null, null);
                        ((rbR_2)((Object)var8_8)).id_this(true);
                        this.id_this((an_3)((Object)var8_8));
                        rRf_12.a_((an_3)((Object)var8_8));
                    }
                }
            }
            this.id_else(this.L() && ((Random)this.id_throws[40]).nextFloat() < f * 0.1f);
            this.id_class(rRh_12);
            this.id_break(rRh_12);
        }
        if (this.id_class(rXQ.HEAD).id_class()) {
            object = LocalDate.now();
            int n = ((LocalDate)object).get(ChronoField.DAY_OF_MONTH);
            int n2 = ((LocalDate)object).get(ChronoField.MONTH_OF_YEAR);
            if (n2 == 10 && n == 31 && ((Random)this.id_throws[40]).nextFloat() < 0.25f) {
                this.id_class(rXQ.HEAD, new rdn_3(((Random)this.id_throws[40]).nextFloat() < 0.1f ? xu_3.BP : xu_3.Br));
                this.id_continue[rXQ.HEAD.id_break()] = 0.0f;
            }
        }
        this.id_throw(f);
        return aU_22;
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        super.id_class(rRh_12);
        float f = ((Random)this.id_throws[40]).nextFloat();
        float f2 = ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD ? 0.05f : 0.01f;
        if (f < f2) {
            int n = ((Random)this.id_throws[40]).nextInt(3);
            if (n == 0) {
                this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Oy));
            } else {
                this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Op));
            }
        }
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        super.id_class(rrEm_12, iB_22);
        if ((rrEm_12.id_abstract() == rRO.NORMAL || rrEm_12.id_abstract() == rRO.HARD) && iB_22 instanceof rsq_3) {
            if (rrEm_12.id_abstract() != rRO.HARD && ((Random)this.id_throws[40]).nextBoolean()) {
                return;
            }
            rsq_3 rsq_32 = (rsq_3)iB_22;
            rbE_2 rbE_22 = rsq_32.id_class(aI_2.rG, false);
            rbE_22.id_class(rrEm_12, rrEm_12.id_throws(rbE_22.Bs()), iO_2.CONVERSION, new rbs_3(false, true), (rcd_3)null);
            rbE_22.id_class(rsq_32.su());
            rbE_22.id_class((rcZ_2)rsq_32.sL().id_class(rcf_3.id_class).getValue());
            rbE_22.id_catch(rsq_32.id_break().id_class());
            rbE_22.id_class(rsq_32.id_protected());
            if (!this.BF()) {
                rrEm_12.id_class((rhd_3)null, 1026, this.Bs(), 0);
            }
        }
    }

    protected void sc() {
        this.id_byte(iQ_2.id_native).id_class(((Random)this.id_throws[40]).nextDouble() * (double)0.1f);
    }

    @Override
    public void id_default() {
        if (this.BM()) {
            boolean bl;
            boolean bl2 = bl = this.R_() && this.F();
            if (bl) {
                rdn_3 rdn_32 = this.id_class(rXQ.HEAD);
                if (!rdn_32.id_class()) {
                    if (rdn_32.id_throws()) {
                        rdn_32.id_break(rdn_32.id_catch() + ((Random)this.id_throws[40]).nextInt(2));
                        if (rdn_32.id_catch() >= rdn_32.id_private()) {
                            this.id_break(rXQ.HEAD);
                            this.id_class(rXQ.HEAD, rdn_3.id_break);
                        }
                    }
                    bl = false;
                }
                if (bl) {
                    this.id_case(8);
                }
            }
        }
        super.id_default();
    }

    protected boolean sd() {
        return true;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class(rcd_32.id_new("IsBaby"));
        this.id_else(rcd_32.id_new("CanBreakDoors"));
        this.id_public = rcd_32.id_private("InWaterTime");
        if (rcd_32.id_byte("DrownedConversionTime", 99) && rcd_32.id_private("DrownedConversionTime") > -1) {
            this.id_class(rcd_32.id_private("DrownedConversionTime"));
        }
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(this.sJ(), 0.15f, 1.0f);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return this.n_() ? 0.93f : 1.74f;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (!super.id_break(rye_32, f)) {
            return false;
        }
        if (!((rYB)this.id_throws[7] instanceof rrEm_1)) {
            return false;
        }
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_throws[7]);
        iB_2 iB_22 = this.I_();
        if (iB_22 == null && rye_32.id_extends() instanceof iB_2) {
            iB_22 = (iB_2)rye_32.id_extends();
        }
        if (iB_22 != null && ((rYB)this.id_throws[7]).id_abstract() == rRO.HARD && (double)((Random)this.id_throws[40]).nextFloat() < this.id_class(iQ_2.id_native) && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_protected)) {
            int n = rfU_2.id_byte(this.rx());
            int n2 = rfU_2.id_byte(this.re());
            int n3 = rfU_2.id_byte(this.BO());
            rbB_2 rbB_22 = new rbB_2((rYB)this.id_throws[7]);
            for (int i = 0; i < 50; ++i) {
                int n4 = n + rfU_2.id_class((Random)this.id_throws[40], 7, 40) * rfU_2.id_class((Random)this.id_throws[40], -1, 1);
                int n5 = n2 + rfU_2.id_class((Random)this.id_throws[40], 7, 40) * rfU_2.id_class((Random)this.id_throws[40], -1, 1);
                int n6 = n3 + rfU_2.id_class((Random)this.id_throws[40], 7, 40) * rfU_2.id_class((Random)this.id_throws[40], -1, 1);
                rfH_2 rfH_22 = new rfH_2(n4, n5, n6);
                aI_2<?> aI_22 = rbB_22.BC();
                aw_3 aw_32 = aq_3.id_class(aI_22);
                if (!rrEj_1.id_class(aw_32, (rYB)this.id_throws[7], rfH_22, aI_22) || !aq_3.id_class(aI_22, rrEm_12, iO_2.REINFORCEMENT, rfH_22, ((rYB)this.id_throws[7]).id_int)) continue;
                rbB_22.id_new(n4, n5, n6);
                if (((rYB)this.id_throws[7]).id_class((double)n4, (double)n5, (double)n6, 7.0) || !((rYB)this.id_throws[7]).id_protected(rbB_22) || !((rYB)this.id_throws[7]).id_throws(rbB_22) || ((rYB)this.id_throws[7]).id_protected(rbB_22.rN())) continue;
                rbB_22.id_byte(iB_22);
                rbB_22.id_class(rrEm_12, ((rYB)this.id_throws[7]).id_throws(rbB_22.Bs()), iO_2.REINFORCEMENT, (aU_2)null, (rcd_3)null);
                rrEm_12.id_class((an_3)rbB_22);
                this.id_byte(iQ_2.id_native).id_byte(new ix_3("Zombie reinforcement caller charge", -0.05f, id_3.ADDITION));
                rbB_22.id_byte(iQ_2.id_native).id_byte(new ix_3("Zombie reinforcement callee charge", -0.05f, id_3.ADDITION));
                break;
            }
        }
        return true;
    }

    protected void id_break(aI_2<? extends rbB_2> aI_22) {
        rbB_2 rbB_22 = this.id_class(aI_22, true);
        if (rbB_22 != null) {
            rbB_22.id_throw(((rYB)rbB_22.id_throws[7]).id_throws(rbB_22.Bs()).id_byte());
            rbB_22.id_else(rbB_22.L() && this.sN());
        }
    }

    protected void id_throws() {
        this.id_package.id_class(2, new rSW(this, 1.0, false));
        this.id_package.id_class(6, new rBy_1(this, 1.0, true, 4, this::sN));
        this.id_package.id_class(7, new rSk_1(this, 1.0));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]).id_class(rbG_2.class));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
        this.id_int.id_class(3, new rBI<rsy_3>((is_3)this, rsy_3.class, false));
        this.id_int.id_class(3, new rBI<rMZ>((is_3)this, rMZ.class, true));
        this.id_int.id_class(5, new rBI<rON>(this, rON.class, 10, true, false, rON.id_super));
    }

    protected boolean L() {
        return true;
    }

    protected rdn_3 sx() {
        return new rdn_3(rdy_3.dx);
    }

    public void id_else(boolean bl) {
        if (this.L() && rpc_3.id_class(this)) {
            if (this.id_return != bl) {
                this.id_return = bl;
                ((rLA)this.id_public()).id_class(bl);
                if (bl) {
                    this.id_package.id_class(1, this.id_synchronized);
                } else {
                    this.id_package.id_class(this.id_synchronized);
                }
            }
        } else if (this.id_return) {
            this.id_package.id_class(this.id_synchronized);
            this.id_return = false;
        }
    }

    protected void id_throw(float f) {
        this.sc();
        this.id_byte(iQ_2.id_byte).id_byte(new ix_3("Random spawn bonus", ((Random)this.id_throws[40]).nextDouble() * (double)0.05f, id_3.ADDITION));
        double d = ((Random)this.id_throws[40]).nextDouble() * 1.5 * (double)f;
        if (d > 1.0) {
            this.id_byte(iQ_2.id_break).id_byte(new ix_3("Random zombie-spawn bonus", d, id_3.MULTIPLY_TOTAL));
        }
        if (((Random)this.id_throws[40]).nextFloat() < f * 0.05f) {
            this.id_byte(iQ_2.id_native).id_byte(new ix_3("Leader zombie bonus", ((Random)this.id_throws[40]).nextDouble() * 0.25 + 0.5, id_3.ADDITION));
            this.id_byte(iQ_2.id_class).id_byte(new ix_3("Leader zombie bonus", ((Random)this.id_throws[40]).nextDouble() * 3.0 + 1.0, id_3.MULTIPLY_TOTAL));
            this.id_else(this.L());
        }
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Wf;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        boolean bl = super.id_public(an_32);
        if (bl) {
            float f = ((rYB)this.id_throws[7]).id_throws(this.Bs()).id_break();
            if (this.ss().id_class() && this.Pz() && ((Random)this.id_throws[40]).nextFloat() < f * 0.3f) {
                an_32.id_case(2 * (int)f);
            }
        }
        return bl;
    }

    @Override
    public boolean id_private(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.XJ && this.n_() && this.Pm() ? false : super.id_private(rdn_32);
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(4, new rbS_2(this, (aA_2)this, 1.0, 3));
        this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_throws();
    }

    public static iz_3 sz() {
        return rEi_1.sm().id_class(iQ_2.id_break, 35.0).id_class(iQ_2.id_protected, 0.23f).id_class(iQ_2.id_case, 3.0).id_class(iQ_2.id_implements, 2.0).id_class(iQ_2.id_native);
    }

    protected boolean R_() {
        return true;
    }

    @Override
    public double Pv() {
        return this.n_() ? 0.0 : -0.45;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.WY;
    }

    protected rqA_2 sJ() {
        return rqn_3.zS;
    }

    public boolean sN() {
        return this.id_return;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_break;
    }

    protected void sW() {
        this.id_break(aI_2.id_new);
        if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1040, this.Bs(), 0);
        }
    }

    public boolean sQ() {
        return this.BQ().id_class(id_this);
    }

    @Override
    protected void m_() {
        super.m_();
        this.BQ().id_class(id_protected, false);
        this.BQ().id_class(id_super, 0);
        this.BQ().id_class(id_this, false);
    }

    @Override
    public boolean n_() {
        return this.BQ().id_class(id_protected);
    }
}

