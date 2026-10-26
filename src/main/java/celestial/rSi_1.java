/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rEL;
import celestial.rLQ;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfo_3;
import celestial.rhN_2;
import celestial.rhV_2;
import celestial.rhd_3;
import celestial.rjG_2;
import celestial.rrEm_1;
import celestial.rrQX;
import celestial.rrnX_2;
import celestial.rrnh_3;
import celestial.rye_3;
import java.util.Random;

public class rSi_1
extends rhV_2 {
    public rSi_1(rYB rYB2, double d, double d2, double d3) {
        super((aI_2<? extends rhV_2>)aI_2.f, d, d2, d3, rYB2);
    }

    public rSi_1(rYB rYB2, iB_2 iB_22) {
        super((aI_2<? extends rhV_2>)aI_2.f, iB_22, rYB2);
    }

    public rSi_1(aI_2<? extends rSi_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rhV_2>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        an_3 an_32 = this.id_else();
        if (an_32 instanceof rhd_3 && !an_32.BM()) {
            this.PD();
        } else {
            super.id_this();
        }
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnh_3.id_class((rrnX_2)((Object)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[2])));
        an_3 an_32 = this.id_else();
        for (int i = 0; i < 32; ++i) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_transient, this.rx(), this.re() + ((Random)this.id_throws[40]).nextDouble() * 2.0, this.BO(), ((Random)this.id_throws[40]).nextGaussian(), 0.0, ((Random)this.id_throws[40]).nextGaussian());
        }
        if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue()) {
            if (an_32 instanceof rhN_2) {
                rhN_2 rhN_22 = (rhN_2)an_32;
                if (rhN_22.id_class.id_class().id_case() && (rYB)rhN_22.id_throws[7] == (rYB)this.id_throws[7] && !rhN_22.Sc()) {
                    if (((Random)this.id_throws[40]).nextFloat() < 0.05f && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_protected)) {
                        rEL rEL2 = aI_2.id_synchronized.id_class((rYB)this.id_throws[7]);
                        rEL2.id_this(true);
                        rEL2.id_class(an_32.rx(), an_32.re(), an_32.BO(), ((Float)an_32.id_throws[15]).floatValue(), ((Float)an_32.id_throws[16]).floatValue());
                        ((rYB)this.id_throws[7]).a_(rEL2);
                    }
                    if (an_32.Pm()) {
                        an_32.BH();
                    }
                    an_32.id_case(this.rx(), this.re(), this.BO());
                    Float f = Float.valueOf(0.0f);
                    an_32.id_throws[31] = f;
                    an_32.id_break(rye_3.id_extends, 5.0f);
                }
            } else if (an_32 != null) {
                an_32.id_case(this.rx(), this.re(), this.BO());
                Float f = Float.valueOf(0.0f);
                an_32.id_throws[31] = f;
            }
            this.PD();
        }
    }

    @Override
    public an_3 id_class(rrEm_1 rrEm_12) {
        an_3 an_32 = this.id_else();
        if (an_32 != null && ((rYB)an_32.id_throws[7]).E() != rrEm_12.E()) {
            this.id_break((an_3)null);
        }
        return super.id_class(rrEm_12);
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        rfo_32.id_class().id_break(rye_3.id_break(this, this.id_else()), 0.0f);
    }

    @Override
    protected rdb_3 id_protected() {
        return rdy_3.Jm;
    }
}

