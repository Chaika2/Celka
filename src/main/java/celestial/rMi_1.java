/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.au_3;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBP;
import celestial.rBc_1;
import celestial.rEi_1;
import celestial.rLC;
import celestial.rOB;
import celestial.rOE;
import celestial.rOG;
import celestial.rOH;
import celestial.rOP;
import celestial.rOS;
import celestial.rOr_1;
import celestial.rOs_1;
import celestial.rPg_1;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSO;
import celestial.rSb_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYJ;
import celestial.rYh_1;
import celestial.rbZ_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class rMi_1
extends rbZ_2 {
    private static final rut_3<Integer> id_super = rmE_2.id_class(rMi_1.class, ruw_3.id_break);
    private static final rqO_2 id_this = new rqO_2("killer_bunny");
    private int id_else;
    private int id_synchronized;
    private boolean id_return;
    private int id_public;
    public int id_goto;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.Xb;
    }

    public static /* synthetic */ rPg_1 id_byte(rMi_1 rMi_12) {
        return rMi_12.id_volatile;
    }

    @Override
    public void id_double() {
        if (this.id_public > 0) {
            --this.id_public;
        }
        if (this.id_goto > 0) {
            this.id_goto -= ((Random)this.id_throws[40]).nextInt(3);
            if (this.id_goto < 0) {
                this.id_goto = 0;
            }
        }
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            Object object;
            if (!this.id_return) {
                this.id_super(false);
                this.sm();
            }
            if (this.sx() == 99 && this.id_public == 0 && (object = this.I_()) != null && this.id_int((an_3)object) < 16.0) {
                this.id_class(((an_3)object).rx(), ((an_3)object).BO());
                this.id_native.id_class(((an_3)object).rx(), ((an_3)object).re(), ((an_3)object).BO(), this.id_native.id_byte());
                this.L();
                this.id_return = true;
            }
            if (!((rOB)(object = (rOB)this.id_volatile)).id_byte()) {
                if (this.id_native.id_break() && this.id_public == 0) {
                    rLC rLC2 = this.id_final.id_finally();
                    rjU_2 rjU_22 = new rjU_2(this.id_native.id_protected(), this.id_native.id_throws(), this.id_native.id_case());
                    if (rLC2 != null && !rLC2.id_byte()) {
                        rjU_22 = rLC2.id_class(this);
                    }
                    this.id_class(rjU_22.id_break, rjU_22.id_protected);
                    this.L();
                }
            } else if (!((rOB)object).id_protected()) {
                this.sd();
            }
        }
        this.id_return = (Boolean)this.id_throws[20];
    }

    public rMi_1(aI_2<? extends rMi_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rbZ_2>)aI_22, rYB2);
        this.id_volatile = new rOB(this, this);
        this.id_native = new rOS(this);
        this.id_implements(0.0);
    }

    @Override
    public boolean B() {
        return false;
    }

    public static iz_3 n() {
        return is_3.id_package().id_class(iQ_2.id_class, 3.0).id_class(iQ_2.id_protected, 0.3f);
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    private void id_class(double d, double d2) {
        Float f = Float.valueOf((float)(rfU_2.id_protected(d2 - this.BO(), d - this.rx()) * 57.2957763671875) - 90.0f);
        this.id_throws[15] = f;
    }

    public static /* synthetic */ boolean id_class(rMi_1 rMi_12) {
        return (Boolean)rMi_12.id_throws[20];
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("RabbitType", this.sx());
        rcd_32.id_break("MoreCarrotTicks", this.id_goto);
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        int n = this.id_class(rRf_12);
        if (aU_22 instanceof rOE) {
            n = ((rOE)aU_22).id_class;
        } else {
            aU_22 = new rOE(n);
        }
        this.id_else(n);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    private int id_class(rRg_1 rRg_12) {
        rYG rYG2 = rRg_12.id_implements(this.Bs());
        int n = ((Random)this.id_throws[40]).nextInt(100);
        if (rYG2.id_byte() == rYJ.SNOW) {
            return n < 80 ? 1 : 3;
        }
        if (rYG2.id_this() == rYh_1.DESERT) {
            return 4;
        }
        return n < 50 ? 0 : (n < 90 ? 5 : 2);
    }

    @Override
    public void id_class(byte by) {
        if (by == 1) {
            this.Bb();
            this.id_synchronized = 10;
            this.id_else = 0;
        } else {
            super.id_class(by);
        }
    }

    private void sm() {
        this.su();
        this.sc();
    }

    private void sc() {
        ((rOB)this.id_volatile).id_class(false);
    }

    @Override
    public void id_default() {
        super.id_default();
        if (this.id_else != this.id_synchronized) {
            ++this.id_else;
        } else if (this.id_synchronized != 0) {
            this.id_else = 0;
            this.id_synchronized = 0;
            this.id_super(false);
        }
    }

    private void sd() {
        ((rOB)this.id_volatile).id_class(true);
    }

    public static /* synthetic */ boolean id_break(rMi_1 rMi_12) {
        return (Boolean)rMi_12.id_private[41];
    }

    public static boolean id_break(aI_2<rMi_1> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        xc_3 xc_32 = rRg_12.id_byte(rfH_22.id_break());
        return (xc_32.id_class(xu_3.id_implements) || xc_32.id_class(xu_3.Pq) || xc_32.id_class(xu_3.id_throw)) && rRg_12.id_class(rfH_22, 0) > 8;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return this.id_class(rye_32) ? false : super.id_break(rye_32, f);
    }

    private boolean id_break(rdb_3 rdb_32) {
        return rdb_32 == rdy_3.ds || rdb_32 == rdy_3.dO || rdb_32 == xu_3.ru.id_case();
    }

    public rMi_1 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        rMi_1 rMi_12 = aI_2.c.id_class(rrEm_12);
        int n = this.id_class((rRg_1)rrEm_12);
        if (((Random)this.id_throws[40]).nextInt(20) != 0) {
            n = au_32 instanceof rMi_1 && ((Random)this.id_throws[40]).nextBoolean() ? ((rMi_1)au_32).sx() : this.sx();
        }
        rMi_12.id_else(n);
        return rMi_12;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_else(rcd_32.id_private("RabbitType"));
        this.id_goto = rcd_32.id_private("MoreCarrotTicks");
    }

    public void L() {
        this.id_super(true);
        this.id_synchronized = 10;
        this.id_else = 0;
    }

    public int sx() {
        return ((rmE_2)this.id_throws[49]).id_class(id_super);
    }

    @Override
    public boolean id_extends(rdn_3 rdn_32) {
        return this.id_break(rdn_32.id_break());
    }

    @Override
    protected void id_continue(boolean bl) {
        double d;
        super.id_continue(bl);
        double d2 = this.id_native.id_byte();
        if (d2 > 0.0 && (d = rMi_1.id_case(this.rv())) < 0.01) {
            this.id_class(0.1f, new rjU_2(0.0, 0.0, 1.0));
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)1);
        }
    }

    public void id_else(int n) {
        if (n == 99) {
            this.id_byte(iQ_2.id_implements).id_class(8.0);
            this.id_package.id_class(4, new rOP(this));
            this.id_int.id_class(1, new rBc_1(this, new Class[0]).id_class(new Class[0]));
            this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
            this.id_int.id_class(2, new rBI<rOH>((is_3)this, rOH.class, true));
            if (!this.Bk()) {
                this.id_break(new rgn_3(rqR_2.id_class("entity", id_this)));
            }
        }
        ((rmE_2)this.id_throws[49]).id_break(id_super, n);
    }

    public void id_implements(double d) {
        this.id_public().id_class(d);
        this.id_native.id_class(this.id_native.id_protected(), this.id_native.id_throws(), this.id_native.id_case(), d);
    }

    @Override
    public void id_super(boolean bl) {
        super.id_super(bl);
        if (bl) {
            this.id_class(this.sJ(), this.Si(), ((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    public float id_throw(float f) {
        return this.id_synchronized == 0 ? 0.0f : ((float)this.id_else + f) / (float)this.id_synchronized;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Xs;
    }

    @Override
    public boolean id_public(an_3 an_32) {
        if (this.sx() == 99) {
            this.id_class(rqn_3.XE, 1.0f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
            return an_32.id_break(rye_3.id_byte(this), 8.0f);
        }
        return an_32.id_break(rye_3.id_byte(this), 3.0f);
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rSb_1(this));
        this.id_package.id_class(1, new rOs_1(this, 2.2));
        this.id_package.id_class(2, new rBP(this, 0.8));
        this.id_package.id_class(3, new rSO((aA_2)this, 1.0, rkg_3.id_class(rdy_3.ds, rdy_3.dO, xu_3.ru), false));
        this.id_package.id_class(4, new rOr_1<rhd_3>(this, rhd_3.class, 8.0f, 2.2, 2.2));
        this.id_package.id_class(4, new rOr_1<rOH>(this, rOH.class, 10.0f, 2.2, 2.2));
        this.id_package.id_class(4, new rOr_1<rEi_1>(this, rEi_1.class, 4.0f, 2.2, 2.2));
        this.id_package.id_class(5, new rOG(this));
        this.id_package.id_class(6, new rSk_1(this, 0.6));
        this.id_package.id_class(11, new rBA(this, rhd_3.class, 10.0f));
    }

    @Override
    public rqL_2 Pr() {
        return this.sx() == 99 ? rqL_2.HOSTILE : rqL_2.NEUTRAL;
    }

    @Override
    public rjU_2 BA() {
        return new rjU_2(0.0, 0.6f * this.Bx(), this.PN() * 0.4f);
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.XG;
    }

    protected rqA_2 sJ() {
        return rqn_3.XM;
    }

    @Override
    protected float ST() {
        if (!(((Boolean)this.id_throws[23]).booleanValue() || this.id_native.id_break() && this.id_native.id_throws() > this.re() + 0.5)) {
            rLC rLC2 = this.id_final.id_finally();
            if (rLC2 != null && !rLC2.id_byte()) {
                rjU_2 rjU_22 = rLC2.id_class(this);
                if (rjU_22.id_byte > this.re() + 0.5) {
                    return 0.5f;
                }
            }
            return this.id_native.id_byte() <= 0.6 ? 0.2f : 0.3f;
        }
        return 0.5f;
    }

    private void su() {
        this.id_public = this.id_native.id_byte() < 2.2 ? 10 : 1;
    }

    public boolean sZ() {
        return this.id_goto == 0;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, 0);
    }
}

