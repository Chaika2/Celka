/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBp_1;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rba_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zz_3;

public class rMB
extends rBp_1 {
    protected int id_catch;
    public final /* synthetic */ rba_3 id_private;

    @Override
    public void id_byte() {
        this.id_catch = 0;
        this.id_private.id_this(false);
        super.id_byte();
    }

    public rMB(rba_3 rba_32, double d, int n, int n2) {
        this.id_private = rba_32;
        super(rba_32, d, n, n2);
    }

    @Override
    public boolean id_class() {
        return !this.id_private.Sc() && super.id_class();
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_32 = rRR2.id_byte(rfH_22);
        return xc_32.id_class(xu_3.XJ) && xc_32.id_byte(zz_3.id_volatile) >= 2;
    }

    @Override
    public void id_throws() {
        if (this.id_native()) {
            if (this.id_catch >= 40) {
                this.id_final();
            } else {
                ++this.id_catch;
            }
        } else if (!this.id_native() && rba_3.id_class(this.id_private).nextFloat() < 0.05f) {
            this.id_private.id_class(rqn_3.SC, 1.0f, 1.0f);
        }
        super.id_throws();
    }

    @Override
    public boolean id_extends() {
        return this.id_protected % 100 == 0;
    }

    @Override
    public double id_private() {
        return 2.0;
    }

    protected void id_final() {
        xc_3 xc_32;
        if (((rYB)this.id_private.id_throws[7]).B().id_break(rRu_1.id_break) && (xc_32 = ((rYB)this.id_private.id_throws[7]).id_byte(this.id_throws)).id_class(xu_3.XJ)) {
            int n = xc_32.id_byte(zz_3.id_volatile);
            xc_32.id_class(zz_3.id_volatile, 1);
            int n2 = 1 + ((rYB)this.id_private.id_throws[7]).id_int.nextInt(2) + (n == 3 ? 1 : 0);
            rdn_3 rdn_32 = this.id_private.id_class(rXQ.MAINHAND);
            if (rdn_32.id_class()) {
                this.id_private.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.WQ));
                --n2;
            }
            if (n2 > 0) {
                xd_3.id_class((rYB)this.id_private.id_throws[7], this.id_throws, new rdn_3(rdy_3.WQ, n2));
            }
            this.id_private.id_class(rqn_3.dE, 1.0f, 1.0f);
            ((rYB)this.id_private.id_throws[7]).id_class(this.id_throws, (xc_3)xc_32.id_class(zz_3.id_volatile, 1), 2);
        }
    }
}

