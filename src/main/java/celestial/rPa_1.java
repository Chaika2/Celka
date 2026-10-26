/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.is_3;
import celestial.rBp_1;
import celestial.rLQ;
import celestial.rLk_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.roC_2;
import celestial.roN_2;
import celestial.rrEm_1;
import celestial.xd_3;
import java.util.Random;

public class rPa_1
extends rBp_1 {
    private final xd_3 id_catch;
    private final is_3 id_private;
    private int id_implements;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_implements = 0;
    }

    public rPa_1(xd_3 xd_32, aA_2 aA_22, double d, int n) {
        super(aA_22, d, 24, n);
        this.id_catch = xd_32;
        this.id_private = aA_22;
    }

    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22) {
    }

    private rfH_2 id_class(rfH_2 rfH_22, rRq_1 rRq_12) {
        rfH_2[] rfH_2Array;
        if (rRq_12.id_byte(rfH_22).id_class(this.id_catch)) {
            return rfH_22;
        }
        for (rfH_2 rfH_23 : rfH_2Array = new rfH_2[]{rfH_22.id_break(), rfH_22.id_byte(), rfH_22.id_extends(), rfH_22.id_private(), rfH_22.id_protected(), rfH_22.id_break().id_break()}) {
            if (!rRq_12.id_byte(rfH_23).id_class(this.id_catch)) continue;
            return rfH_23;
        }
        return null;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        roC_2 roC_22 = rRR2.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4, roN_2.id_volatile, false);
        if (roC_22 == null) {
            return false;
        }
        return roC_22.id_byte(rfH_22).id_class(this.id_catch) && roC_22.id_byte(rfH_22.id_final()).id_catch() && roC_22.id_byte(rfH_22.id_break(2)).id_catch();
    }

    @Override
    public boolean id_class() {
        if (!((rYB)this.id_private.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return false;
        }
        if (this.id_byte > 0) {
            --this.id_byte;
            return false;
        }
        if (this.id_final()) {
            this.id_byte = 20;
            return true;
        }
        this.id_byte = this.id_class(this.id_class);
        return false;
    }

    @Override
    public void id_throws() {
        super.id_throws();
        rYB rYB2 = (rYB)this.id_private.id_throws[7];
        rfH_2 rfH_22 = this.id_private.Bs();
        rfH_2 rfH_23 = this.id_class(rfH_22, rYB2);
        Random random = this.id_private.Sa();
        if (this.id_native() && rfH_23 != null) {
            double d;
            rjU_2 rjU_22;
            if (this.id_implements > 0) {
                rjU_22 = this.id_private.rv();
                this.id_private.id_catch(rjU_22.id_break, 0.3, rjU_22.id_protected);
                if (!rYB2.id_continue) {
                    d = 0.08;
                    ((rrEm_1)rYB2).id_class(new rLk_1(rLQ.id_void, new rdn_3(rdy_3.XJ)), (double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.7, (double)rfH_23.d_() + 0.5, 3, ((double)random.nextFloat() - 0.5) * 0.08, ((double)random.nextFloat() - 0.5) * 0.08, ((double)random.nextFloat() - 0.5) * 0.08, 0.15f);
                }
            }
            if (this.id_implements % 2 == 0) {
                rjU_22 = this.id_private.rv();
                this.id_private.id_catch(rjU_22.id_break, -0.3, rjU_22.id_protected);
                if (this.id_implements % 6 == 0) {
                    this.id_class((rRg_1)rYB2, this.id_throws);
                }
            }
            if (this.id_implements > 60) {
                rYB2.id_class(rfH_23, false);
                if (!rYB2.id_continue) {
                    for (int i = 0; i < 20; ++i) {
                        d = random.nextGaussian() * 0.02;
                        double d2 = random.nextGaussian() * 0.02;
                        double d3 = random.nextGaussian() * 0.02;
                        ((rrEm_1)rYB2).id_class(rLQ.id_boolean, (double)rfH_23.b_() + 0.5, rfH_23.c_(), (double)rfH_23.d_() + 0.5, 1, d, d2, d3, 0.15f);
                    }
                    this.id_class(rYB2, rfH_23);
                }
            }
            ++this.id_implements;
        }
    }

    @Override
    public void id_protected() {
        super.id_protected();
        Float f = Float.valueOf(1.0f);
        this.id_private.id_throws[31] = f;
    }

    private boolean id_final() {
        return this.id_throws != null && this.id_class((rRR)((rYB)this.id_class.id_throws[7]), this.id_throws) ? true : this.id_volatile();
    }
}

