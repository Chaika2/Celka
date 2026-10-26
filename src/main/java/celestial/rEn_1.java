/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rEA;
import celestial.rGT;
import celestial.rGt_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhC_2;
import celestial.rjC_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.xc_3;

public class rEn_1
extends rGt_1 {
    public final /* synthetic */ rEA id_class;

    public rEn_1(rEA rEA2) {
        this.id_class = rEA2;
        super(rEA2);
    }

    private void id_class(double d, double d2, double d3, double d4, float f, int n) {
        rfH_2 rfH_22 = new rfH_2(d, d4, d2);
        boolean bl = false;
        double d5 = 0.0;
        do {
            xc_3 xc_32;
            rjC_2 rjC_22;
            rfH_2 rfH_23;
            xc_3 xc_33;
            if (!(xc_33 = ((rYB)this.id_class.id_throws[7]).id_byte(rfH_23 = rfH_22.id_break())).id_protected((rYB)this.id_class.id_throws[7], rfH_23, rpr_3.UP)) continue;
            if (!((rYB)this.id_class.id_throws[7]).id_finally(rfH_22) && !(rjC_22 = (xc_32 = ((rYB)this.id_class.id_throws[7]).id_byte(rfH_22)).id_extends((rYB)this.id_class.id_throws[7], rfH_22)).id_break()) {
                d5 = rjC_22.id_byte(rpB_2.Y);
            }
            bl = true;
            break;
        } while ((rfH_22 = rfH_22.id_break()).c_() >= rfU_2.id_byte(d3) - 1);
        if (bl) {
            ((rYB)this.id_class.id_throws[7]).a_(new rhC_2((rYB)this.id_class.id_throws[7], d, (double)rfH_22.c_() + d5, d2, f, n, this.id_class));
        }
    }

    @Override
    protected void id_finally() {
        iB_2 iB_22 = this.id_class.I_();
        double d = Math.min(iB_22.re(), this.id_class.re());
        double d2 = Math.max(iB_22.re(), this.id_class.re()) + 1.0;
        float f = (float)rfU_2.id_protected(iB_22.BO() - this.id_class.BO(), iB_22.rx() - this.id_class.rx());
        if (this.id_class.id_int(iB_22) < 9.0) {
            float f2;
            int n;
            for (n = 0; n < 5; ++n) {
                f2 = f + (float)n * (float)Math.PI * 0.4f;
                this.id_class(this.id_class.rx() + (double)rfU_2.id_break(f2) * 1.5, this.id_class.BO() + (double)rfU_2.id_class(f2) * 1.5, d, d2, f2, 0);
            }
            for (n = 0; n < 8; ++n) {
                f2 = f + (float)n * (float)Math.PI * 2.0f / 8.0f + 1.2566371f;
                this.id_class(this.id_class.rx() + (double)rfU_2.id_break(f2) * 2.5, this.id_class.BO() + (double)rfU_2.id_class(f2) * 2.5, d, d2, f2, 3);
            }
        } else {
            for (int i = 0; i < 16; ++i) {
                double d3 = 1.25 * (double)(i + 1);
                int n = 1 * i;
                this.id_class(this.id_class.rx() + (double)rfU_2.id_break(f) * d3, this.id_class.BO() + (double)rfU_2.id_class(f) * d3, d, d2, f, n);
            }
        }
    }

    @Override
    protected int id_catch() {
        return 40;
    }

    @Override
    protected rqA_2 id_extends() {
        return rqn_3.Ba;
    }

    @Override
    protected int id_private() {
        return 100;
    }

    @Override
    protected rGT id_native() {
        return rGT.FANGS;
    }
}

