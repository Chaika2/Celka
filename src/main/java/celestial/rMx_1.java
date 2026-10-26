/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rBm_1;
import celestial.rYB;
import celestial.rba_3;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.xu_3;

public class rMx_1
extends rBm_1 {
    public final /* synthetic */ rba_3 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_super(true);
        this.id_class.id_else(true);
        this.id_class.id_return(false);
        iB_2 iB_22 = this.id_class.I_();
        this.id_class.id_continue().id_class(iB_22, 60.0f, 30.0f);
        rjU_2 rjU_22 = new rjU_2(iB_22.rx() - this.id_class.rx(), iB_22.re() - this.id_class.re(), iB_22.BO() - this.id_class.BO()).id_protected();
        this.id_class.id_byte(this.id_class.rv().id_break(rjU_22.id_break * 0.8, 0.9, rjU_22.id_protected * 0.8));
        this.id_class.id_public().id_final();
    }

    public rMx_1(rba_3 rba_32) {
        this.id_class = rba_32;
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.sc()) {
            return false;
        }
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null && iB_22.BM()) {
            if (iB_22.rS() != iB_22.Pg()) {
                return false;
            }
            boolean bl = rba_3.id_class(this.id_class, iB_22);
            if (!bl) {
                this.id_class.id_public().id_class((an_3)iB_22, 0);
                this.id_class.id_synchronized(false);
                this.id_class.id_return(false);
            }
            return bl;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null && iB_22.BM()) {
            double d = this.id_class.rv().id_byte;
            return !(d * d < (double)0.05f && Math.abs(((Float)this.id_class.id_throws[16]).floatValue()) < 15.0f && rba_3.id_byte(this.id_class) || this.id_class.sx());
        }
        return false;
    }

    @Override
    public void id_throws() {
        iB_2 iB_22 = this.id_class.I_();
        if (iB_22 != null) {
            this.id_class.id_continue().id_class(iB_22, 60.0f, 30.0f);
        }
        if (!this.id_class.sx()) {
            rjU_2 rjU_22 = this.id_class.rv();
            if (rjU_22.id_byte * rjU_22.id_byte < (double)0.03f && ((Float)this.id_class.id_throws[16]).floatValue() != 0.0f) {
                Float f = Float.valueOf(rfU_2.id_implements(((Float)this.id_class.id_throws[16]).floatValue(), 0.0f, 0.2f));
                this.id_class.id_throws[16] = f;
            } else {
                double d = Math.sqrt(an_3.id_case(rjU_22));
                double d2 = Math.signum(-rjU_22.id_byte) * Math.acos(d / rjU_22.id_case()) * 57.2957763671875;
                Float f = Float.valueOf((float)d2);
                this.id_class.id_throws[16] = f;
            }
        }
        if (iB_22 != null && this.id_class.id_implements((an_3)iB_22) <= 2.0f) {
            this.id_class.id_public(iB_22);
        } else if (((Float)this.id_class.id_throws[16]).floatValue() > 0.0f && rba_3.id_protected(this.id_class) && (float)this.id_class.rv().id_byte != 0.0f && ((rYB)this.id_class.id_throws[7]).id_byte(this.id_class.Bs()).id_class(xu_3.Pq)) {
            Float f = Float.valueOf(60.0f);
            this.id_class.id_throws[16] = f;
            this.id_class.id_byte((iB_2)null);
            this.id_class.id_public(true);
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_synchronized(false);
        this.id_class.id_abstract = 0.0f;
        this.id_class.id_long = 0.0f;
        this.id_class.id_return(false);
        this.id_class.id_else(false);
    }

    @Override
    public boolean J_() {
        return false;
    }
}

