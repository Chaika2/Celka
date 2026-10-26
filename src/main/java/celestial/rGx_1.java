/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.kZ_2;
import celestial.rBA;
import celestial.rBI;
import celestial.rBW;
import celestial.rBc_1;
import celestial.rEB;
import celestial.rEi_1;
import celestial.rGd_1;
import celestial.rGk_1;
import celestial.rLQ;
import celestial.rLy_1;
import celestial.rMZ;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rSK;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rsi_3;
import celestial.rsy_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;
import java.util.function.Predicate;

public class rGx_1
extends rEB {
    private static final Predicate<an_3> id_protected = an_32 -> an_32.BM() && !(an_32 instanceof rGx_1);
    private int id_super;
    private int id_this;
    private int id_else;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Xd;
    }

    public rGx_1(aI_2<? extends rGx_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEB>)aI_22, rYB2);
        Float f = Float.valueOf(1.0f);
        this.id_throws[37] = f;
        this.id_finally = 20;
    }

    @Override
    public int S() {
        return 45;
    }

    private void sl() {
        if (this.BM()) {
            for (an_3 an_32 : ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_class(4.0), id_protected)) {
                if (!(an_32 instanceof rsi_3)) {
                    an_32.id_break(rye_3.id_byte(this), 6.0f);
                }
                this.id_class(an_32);
            }
            rjU_2 rjU_22 = this.rN().id_case();
            for (int i = 0; i < 40; ++i) {
                double d = ((Random)this.id_throws[40]).nextGaussian() * 0.2;
                double d2 = ((Random)this.id_throws[40]).nextGaussian() * 0.2;
                double d3 = ((Random)this.id_throws[40]).nextGaussian() * 0.2;
                ((rYB)this.id_throws[7]).id_class(rLQ.id_boolean, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, d, d2, d3);
            }
        }
    }

    @Override
    public void id_class(byte by) {
        if (by == 4) {
            this.id_super = 10;
            this.id_class(rqn_3.XX, 1.0f, 1.0f);
        } else if (by == 39) {
            this.id_this = 40;
        }
        super.id_class(by);
    }

    @Override
    public void id_class(int n, boolean bl) {
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return !rRR2.id_protected(this.rN());
    }

    private void id_class(an_3 an_32) {
        double d = an_32.rx() - this.rx();
        double d2 = an_32.BO() - this.BO();
        double d3 = Math.max(d * d + d2 * d2, 0.001);
        an_32.id_implements(d / d3 * 4.0, 0.2, d2 / d3 * 4.0);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("AttackTick", this.id_super);
        rcd_32.id_break("StunTick", this.id_this);
        rcd_32.id_break("RoarTick", this.id_else);
    }

    public int sc() {
        return this.id_this;
    }

    @Override
    public void id_default() {
        super.id_default();
        if (this.BM()) {
            if (this.BK()) {
                this.id_byte(iQ_2.id_protected).id_class(0.0);
            } else {
                double d = this.I_() != null ? 0.35 : 0.3;
                double d2 = this.id_byte(iQ_2.id_protected).id_break();
                this.id_byte(iQ_2.id_protected).id_class(rfU_2.id_protected(0.1, d2, d));
            }
            if (((Boolean)this.id_throws[23]).booleanValue() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
                boolean bl = false;
                rfl_3 rfl_32 = this.rN().id_class(0.2);
                for (rfH_2 rfH_22 : rfH_2.id_break(rfU_2.id_byte(rfl_32.id_class), rfU_2.id_byte(rfl_32.id_break), rfU_2.id_byte(rfl_32.id_byte), rfU_2.id_byte(rfl_32.id_protected), rfU_2.id_byte(rfl_32.id_throws), rfU_2.id_byte(rfl_32.id_case))) {
                    xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
                    xd_3 xd_32 = xc_32.id_break();
                    if (!(xd_32 instanceof kZ_2)) continue;
                    bl = ((rYB)this.id_throws[7]).id_class(rfH_22, true, this) || bl;
                }
                if (!bl && ((Boolean)this.id_throws[20]).booleanValue()) {
                    this.id_continue(false);
                }
            }
            if (this.id_else > 0) {
                --this.id_else;
                if (this.id_else == 10) {
                    this.sl();
                }
            }
            if (this.id_super > 0) {
                --this.id_super;
            }
            if (this.id_this > 0) {
                --this.id_this;
                this.sC();
                if (this.id_this == 0) {
                    this.id_class(rqn_3.Xz, 1.0f, 1.0f);
                    this.id_else = 20;
                }
            }
        }
    }

    @Override
    protected void id_void() {
        boolean bl = !(this.rU() instanceof is_3) || this.rU().BC().id_class(rlE_2.id_byte);
        boolean bl2 = !(this.ra() instanceof rSK);
        this.id_package.id_class(rBW.MOVE, bl);
        this.id_package.id_class(rBW.JUMP, bl && bl2);
        this.id_package.id_class(rBW.LOOK, bl);
        this.id_package.id_class(rBW.TARGET, bl);
    }

    @Override
    protected void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rqn_3.Xk, 0.15f, 1.0f);
    }

    @Override
    protected rLy_1 id_break(rYB rYB2) {
        return new rGk_1(this, rYB2);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_super = rcd_32.id_private("AttackTick");
        this.id_this = rcd_32.id_private("StunTick");
        this.id_else = rcd_32.id_private("RoarTick");
    }

    @Override
    protected void id_throws(iB_2 iB_22) {
        if (this.id_else == 0) {
            if (((Random)this.id_throws[40]).nextDouble() < 0.5) {
                this.id_this = 40;
                this.id_class(rqn_3.XW, 1.0f, 1.0f);
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)39);
                iB_22.id_byte(this);
            } else {
                this.id_class((an_3)iB_22);
            }
            Boolean bl = true;
            iB_22.id_throws[25] = bl;
        }
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_class, 100.0).id_class(iQ_2.id_protected, 0.3).id_class(iQ_2.id_byte, 0.75).id_class(iQ_2.id_case, 12.0).id_class(iQ_2.id_catch, 1.5).id_class(iQ_2.id_break, 32.0);
    }

    @Override
    public boolean G() {
        return !this.c() && this.rU() instanceof iB_2;
    }

    @Override
    public boolean id_while(an_3 an_32) {
        return this.id_this <= 0 && this.id_else <= 0 ? super.id_while(an_32) : false;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Xh;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        this.id_super = 10;
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)4);
        this.id_class(rqn_3.XX, 1.0f, 1.0f);
        return super.id_public(an_32);
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(4, new rGd_1(this));
        this.id_package.id_class(5, new rSk_1(this, 0.4));
        this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 8.0f));
        this.id_int.id_class(2, new rBc_1(this, rEB.class).id_class(new Class[0]));
        this.id_int.id_class(3, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
        this.id_int.id_class(4, new rBI<rsy_3>((is_3)this, rsy_3.class, true));
        this.id_int.id_class(4, new rBI<rMZ>((is_3)this, rMZ.class, true));
    }

    public int sn() {
        return this.id_else;
    }

    @Override
    public an_3 rU() {
        return this.Bh().isEmpty() ? null : this.Bh().get(0);
    }

    @Override
    public double PS() {
        return 2.1;
    }

    @Override
    protected boolean BK() {
        return super.BK() || this.id_super > 0 || this.id_this > 0 || this.id_else > 0;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Xx;
    }

    public int sN() {
        return this.id_super;
    }

    @Override
    public boolean su() {
        return false;
    }

    @Override
    public rqA_2 sQ() {
        return rqn_3.XJ;
    }

    private void sC() {
        if (((Random)this.id_throws[40]).nextInt(6) == 0) {
            double d = this.rx() - (double)this.PN() * Math.sin(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180)) + (((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3);
            double d2 = this.re() + (double)this.Bm() - 0.3;
            double d3 = this.BO() + (double)this.PN() * Math.cos(((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180)) + (((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3);
            ((rYB)this.id_throws[7]).id_class(rLQ.id_else, d, d2, d3, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
        }
    }
}

