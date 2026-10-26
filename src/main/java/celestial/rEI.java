/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBT;
import celestial.rBU;
import celestial.rBW;
import celestial.rEV;
import celestial.rEf_1;
import celestial.rEi_1;
import celestial.rEj_1;
import celestial.rLQ;
import celestial.rLp_1;
import celestial.rLw_1;
import celestial.rLy_1;
import celestial.rRO;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrTR;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.EnumSet;
import java.util.Random;

public class rEI
extends rEi_1 {
    private static final rut_3<Boolean> id_class = rmE_2.id_class(rEI.class, ruw_3.id_implements);
    private static final rut_3<Integer> id_protected = rmE_2.id_class(rEI.class, ruw_3.id_break);
    private float id_super;
    private float id_this;
    private float id_else;
    private float id_synchronized;
    private float id_return;
    private iB_2 id_public;
    private int id_goto;
    private boolean id_while;
    protected rBU id_break;

    @Override
    public int id_char() {
        return 160;
    }

    public float id_char(float f) {
        return ((float)this.id_goto + f) / (float)this.L();
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return this.Pa() ? rqn_3.sl : rqn_3.sH;
    }

    public rEI(aI_2<? extends rEI> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.id_finally = 10;
        this.id_class(rLp_1.WATER, 0.0f);
        this.id_native = new rEj_1(this);
        this.id_this = this.id_super = ((Random)this.id_throws[40]).nextFloat();
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, bl);
    }

    public float id_interface(float f) {
        return rfU_2.id_catch(f, this.id_return, this.id_synchronized);
    }

    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, n);
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        super.id_class(rut_32);
        if (id_protected.equals(rut_32)) {
            this.id_goto = 0;
            this.id_public = null;
        }
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return rRR2.id_protected(this);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return rRR2.id_break(rfH_22).id_class(rlG_2.id_break) ? 10.0f + rRR2.id_native(rfH_22) - 0.5f : super.id_class(rfH_22, rRR2);
    }

    @Override
    public void id_default() {
        if (this.BM()) {
            if (((rYB)this.id_throws[7]).id_continue) {
                rrTR rrTR2;
                this.id_this = this.id_super;
                if (!this.rT()) {
                    this.id_else = 2.0f;
                    rrTR2 = this.rv();
                    if (((rjU_2)rrTR2).id_byte > 0.0 && this.id_while && !this.BF()) {
                        ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), this.sJ(), this.Pr(), 1.0f, 1.0f, false);
                    }
                    this.id_while = ((rjU_2)rrTR2).id_byte < 0.0 && ((rYB)this.id_throws[7]).id_class(this.Bs().id_break(), (an_3)this);
                } else {
                    this.id_else = this.sd() ? (this.id_else < 0.5f ? 4.0f : (this.id_else += (0.5f - this.id_else) * 0.1f)) : (this.id_else += (0.125f - this.id_else) * 0.2f);
                }
                this.id_super += this.id_else;
                this.id_return = this.id_synchronized;
                this.id_synchronized = !this.Pa() ? ((Random)this.id_throws[40]).nextFloat() : (this.sd() ? (this.id_synchronized += (0.0f - this.id_synchronized) * 0.25f) : (this.id_synchronized += (1.0f - this.id_synchronized) * 0.06f));
                if (this.sd() && this.rT()) {
                    rrTR2 = this.id_break(0.0f);
                    for (int i = 0; i < 2; ++i) {
                        ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, this.id_break(0.5) - ((rjU_2)rrTR2).id_break * 1.5, this.Ph() - ((rjU_2)rrTR2).id_byte * 1.5, this.id_protected(0.5) - ((rjU_2)rrTR2).id_protected * 1.5, 0.0, 0.0, 0.0);
                    }
                }
                if (this.sk()) {
                    if (this.id_goto < this.L()) {
                        ++this.id_goto;
                    }
                    if ((rrTR2 = this.sW()) != null) {
                        this.id_continue().id_class((an_3)rrTR2, 90.0f, 90.0f);
                        this.id_continue().id_class();
                        double d = this.id_char(0.0f);
                        double d2 = ((an_3)rrTR2).rx() - this.rx();
                        double d3 = ((an_3)rrTR2).id_byte(0.5) - this.rH();
                        double d4 = ((an_3)rrTR2).BO() - this.BO();
                        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                        d2 /= d5;
                        d3 /= d5;
                        d4 /= d5;
                        double d6 = ((Random)this.id_throws[40]).nextDouble();
                        while (d6 < d5) {
                            ((rYB)this.id_throws[7]).id_class(rLQ.id_throws, this.rx() + d2 * (d6 += 1.8 - d + ((Random)this.id_throws[40]).nextDouble() * (1.7 - d)), this.rH() + d3 * d6, this.BO() + d4 * d6, 0.0, 0.0, 0.0);
                        }
                    }
                }
            }
            if (this.Pa()) {
                this.id_throws(300);
            } else if (((Boolean)this.id_throws[20]).booleanValue()) {
                this.id_byte(this.rv().id_break((((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * 0.4f, 0.5, (((Random)this.id_throws[40]).nextFloat() * 2.0f - 1.0f) * 0.4f));
                Float f = Float.valueOf(((Random)this.id_throws[40]).nextFloat() * 360.0f);
                this.id_throws[15] = f;
                Boolean bl = false;
                this.id_throws[20] = bl;
                Boolean bl2 = true;
                this.id_throws[57] = bl2;
            }
            if (this.sk()) {
                Float f = Float.valueOf(((Float)this.id_private[25]).floatValue());
                this.id_throws[15] = f;
            }
        }
        super.id_default();
    }

    public boolean sd() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    @Override
    public int r() {
        return 180;
    }

    public static boolean id_break(aI_2<? extends rEI> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return !(random.nextInt(20) != 0 && rRg_12.id_extends(rfH_22) || rRg_12.id_abstract() == rRO.PEACEFUL || iO_22 != iO_2.SPAWNER && !rRg_12.id_break(rfH_22).id_class(rlG_2.id_break));
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rLw_1(this, rYB2);
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.5f;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (!this.sd() && !rye_32.id_this() && rye_32.id_finally() instanceof iB_2) {
            iB_2 iB_22 = (iB_2)rye_32.id_finally();
            if (!rye_32.id_protected()) {
                iB_22.id_break(rye_3.id_class(this), 2.0f);
            }
        }
        if (this.id_break != null) {
            this.id_break.id_private();
        }
        return super.id_break(rye_32, f);
    }

    public int L() {
        return 80;
    }

    public static iz_3 sx() {
        return rEi_1.sm().id_class(iQ_2.id_case, 6.0).id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 16.0).id_class(iQ_2.id_class, 30.0);
    }

    public boolean sk() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected) != 0;
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_this, this.id_super);
    }

    @Override
    protected rqA_2 id_static() {
        return this.Pa() ? rqn_3.sv : rqn_3.sF;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.id_try() && this.rT()) {
            this.id_class(0.1f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class(0.9));
            if (!this.sd() && this.I_() == null) {
                this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
            }
        } else {
            super.id_private(rjU_22);
        }
    }

    @Override
    protected void id_final() {
        rBT rBT2 = new rBT(this, 1.0);
        this.id_break = new rBU(this, 1.0, 80);
        this.id_package.id_class(4, new rEf_1(this));
        this.id_package.id_class(5, rBT2);
        this.id_package.id_class(7, this.id_break);
        this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(8, new rBA(this, rEI.class, 12.0f, 0.01f));
        this.id_package.id_class(9, new rBC(this));
        this.id_break.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
        rBT2.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
        this.id_int.id_class(1, new rBI<iB_2>(this, iB_2.class, 10, true, false, new rEV(this)));
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return this.Pa() ? rqn_3.sA : rqn_3.sn;
    }

    protected rqA_2 sJ() {
        return rqn_3.sC;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_throws;
    }

    public iB_2 sW() {
        if (!this.sk()) {
            return null;
        }
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_public != null) {
                return this.id_public;
            }
            an_3 an_32 = ((rYB)this.id_throws[7]).id_break(((rmE_2)this.id_throws[49]).id_class(id_protected));
            if (an_32 instanceof iB_2) {
                this.id_public = (iB_2)an_32;
                return this.id_public;
            }
            return null;
        }
        return this.I_();
    }

    @Override
    public boolean SO() {
        return true;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, false);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, 0);
    }
}

