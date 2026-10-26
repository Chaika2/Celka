/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iG_2;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rLD;
import celestial.rLQ;
import celestial.rOd_1;
import celestial.rOl_1;
import celestial.rOx_1;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rye_3;
import java.util.Random;

public class rOJ
extends rOl_1 {
    public float id_class;
    public float id_break;
    public float id_protected;
    public float id_super;
    public float id_this;
    public float id_else;
    public float id_synchronized;
    public float id_return;
    private float id_public;
    private float id_goto;
    private float id_while;
    private float id_try;
    private float id_instanceof;
    private float id_throw;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.xj;
    }

    public void id_byte(float f, float f2, float f3) {
        this.id_try = f;
        this.id_instanceof = f2;
        this.id_throw = f3;
    }

    public rOJ(aI_2<? extends rOJ> aI_22, rYB rYB2) {
        super((aI_2<? extends rOl_1>)aI_22, rYB2);
        ((Random)this.id_throws[40]).setSeed(this.V());
        this.id_goto = 1.0f / (((Random)this.id_throws[40]).nextFloat() + 1.0f) * 0.2f;
    }

    private void n() {
        this.id_class(rqn_3.xV, this.Si(), this.SN());
        rjU_2 rjU_22 = this.id_finally(new rjU_2(0.0, -1.0, 0.0)).id_break(this.rx(), this.re(), this.BO());
        for (int i = 0; i < 30; ++i) {
            rjU_2 rjU_23 = this.id_finally(new rjU_2((double)((Random)this.id_throws[40]).nextFloat() * 0.6 - 0.3, -1.0, (double)((Random)this.id_throws[40]).nextFloat() * 0.6 - 0.3));
            rjU_2 rjU_24 = rjU_23.id_class(0.3 + (double)(((Random)this.id_throws[40]).nextFloat() * 2.0f));
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(rLQ.P, rjU_22.id_break, rjU_22.id_byte + 0.5, rjU_22.id_protected, 0, rjU_24.id_break, rjU_24.id_byte, rjU_24.id_protected, 0.1f);
        }
    }

    public static /* synthetic */ boolean id_class(rOJ rOJ2) {
        return (Boolean)rOJ2.id_throws[43];
    }

    @Override
    public void id_class(byte by) {
        if (by == 19) {
            this.id_this = 0.0f;
        } else {
            super.id_class(by);
        }
    }

    @Override
    public void id_default() {
        super.id_default();
        this.id_break = this.id_class;
        this.id_super = this.id_protected;
        this.id_else = this.id_this;
        this.id_return = this.id_synchronized;
        this.id_this += this.id_goto;
        if ((double)this.id_this > Math.PI * 2) {
            if (((rYB)this.id_throws[7]).id_continue) {
                this.id_this = (float)Math.PI * 2;
            } else {
                this.id_this = (float)((double)this.id_this - Math.PI * 2);
                if (((Random)this.id_throws[40]).nextInt(10) == 0) {
                    this.id_goto = 1.0f / (((Random)this.id_throws[40]).nextFloat() + 1.0f) * 0.2f;
                }
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)19);
            }
        }
        if (this.Pa()) {
            if (this.id_this < (float)Math.PI) {
                float f = this.id_this / (float)Math.PI;
                this.id_synchronized = rfU_2.id_class(f * f * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f > 0.75) {
                    this.id_public = 1.0f;
                    this.id_while = 1.0f;
                } else {
                    this.id_while *= 0.8f;
                }
            } else {
                this.id_synchronized = 0.0f;
                this.id_public *= 0.9f;
                this.id_while *= 0.99f;
            }
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_catch(this.id_try * this.id_public, this.id_instanceof * this.id_public, this.id_throw * this.id_public);
            }
            rjU_2 rjU_22 = this.rv();
            float f = rfU_2.id_class(rOJ.id_case(rjU_22));
            rOJ rOJ2 = this;
            Float f2 = Float.valueOf(((Float)rOJ2.id_private[23]).floatValue() + (-((float)rfU_2.id_protected(rjU_22.id_break, rjU_22.id_protected)) * 57.295776f - ((Float)this.id_private[23]).floatValue()) * 0.1f);
            rOJ2.id_private[23] = f2;
            Float f3 = Float.valueOf(((Float)this.id_private[23]).floatValue());
            this.id_throws[15] = f3;
            this.id_protected = (float)((double)this.id_protected + Math.PI * (double)this.id_while * 1.5);
            this.id_class += (-((float)rfU_2.id_protected((double)f, rjU_22.id_byte)) * 57.295776f - this.id_class) * 0.1f;
        } else {
            this.id_synchronized = rfU_2.id_throws(rfU_2.id_class(this.id_this)) * (float)Math.PI * 0.25f;
            if (!((rYB)this.id_throws[7]).id_continue) {
                double d = this.rv().id_byte;
                if (this.id_break(rLD.id_goto)) {
                    d = 0.05 * (double)(this.id_byte(rLD.id_goto).id_byte() + 1);
                } else if (!this.rw()) {
                    d -= 0.08;
                }
                this.id_catch(0.0, d * (double)0.98f, 0.0);
            }
            this.id_class = (float)((double)this.id_class + (double)(-90.0f - this.id_class) * 0.02);
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (super.id_break(rye_32, f) && this.Sr() != null) {
            this.n();
            return true;
        }
        return false;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.5f;
    }

    public static boolean id_break(aI_2<rOJ> aI_22, rRg_1 rRg_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        return rfH_22.c_() > 45 && rfH_22.c_() < rRg_12.id_short();
    }

    public static iz_3 id_throws() {
        return is_3.id_package().id_class(iQ_2.id_class, 10.0);
    }

    public boolean L() {
        return this.id_try != 0.0f || this.id_instanceof != 0.0f || this.id_throw != 0.0f;
    }

    private rjU_2 id_finally(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22.id_class(this.id_break * ((float)Math.PI / 180));
        return rjU_23.id_break(-((Float)this.id_private[24]).floatValue() * ((float)Math.PI / 180));
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.xI;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        this.id_class(iG_2.SELF, this.rv());
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(0, new rOd_1(this, this));
        this.id_package.id_class(1, new rOx_1(this));
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.xf;
    }

    @Override
    protected float Si() {
        return 0.4f;
    }
}

