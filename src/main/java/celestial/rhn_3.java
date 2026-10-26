/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rLQ;
import celestial.rLk_1;
import celestial.rYB;
import celestial.rbR_2;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfo_3;
import celestial.rhV_2;
import celestial.rjG_2;
import celestial.rye_3;
import java.util.Random;

public class rhn_3
extends rhV_2 {
    public rhn_3(rYB rYB2, double d, double d2, double d3) {
        super((aI_2<? extends rhV_2>)aI_2.I, d, d2, d3, rYB2);
    }

    public rhn_3(rYB rYB2, iB_2 iB_22) {
        super((aI_2<? extends rhV_2>)aI_2.I, iB_22, rYB2);
    }

    public rhn_3(aI_2<? extends rhn_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhV_2>)aI_22, rYB2);
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        if (!((rYB)this.id_throws[7]).id_continue) {
            if (((Random)this.id_throws[40]).nextInt(8) == 0) {
                int n = 1;
                if (((Random)this.id_throws[40]).nextInt(32) == 0) {
                    n = 4;
                }
                for (int i = 0; i < n; ++i) {
                    rbR_2 rbR_22 = aI_2.id_finally.id_class((rYB)this.id_throws[7]);
                    rbR_22.e_(-24000);
                    rbR_22.id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), 0.0f);
                    ((rYB)this.id_throws[7]).a_(rbR_22);
                }
            }
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)3);
            this.PD();
        }
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        rfo_32.id_class().id_break(rye_3.id_break(this, this.id_else()), 0.0f);
    }

    @Override
    public void id_class(byte by) {
        if (by == 3) {
            double d = 0.08;
            for (int i = 0; i < 8; ++i) {
                ((rYB)this.id_throws[7]).id_class(new rLk_1(rLQ.id_void, this.id_class()), this.rx(), this.re(), this.BO(), ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.08, ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.08, ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.08);
            }
        }
    }

    @Override
    protected rdb_3 id_protected() {
        return rdy_3.XJ;
    }
}

