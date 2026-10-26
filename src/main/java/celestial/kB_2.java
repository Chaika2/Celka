/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Oo_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rLQ;
import celestial.rLX;
import celestial.rRq_1;
import celestial.rSK;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rqn_3;
import celestial.rsJ_2;
import celestial.rsX_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xm_3;
import celestial.xu_3;

public class kB_2
extends xm_3 {
    protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

    private static boolean id_byte(an_3 an_32) {
        return an_32 instanceof iB_2 || an_32 instanceof rsJ_2 || an_32 instanceof rsX_2 || an_32 instanceof rSK;
    }

    public kB_2(Jq_1 jq_1) {
        super(jq_1);
    }

    private void id_class(rYB rYB2, an_3 an_32) {
        if (kB_2.id_byte(an_32)) {
            if (rYB2.id_int.nextInt(5) == 0) {
                an_32.id_class(rqn_3.so, 1.0f, 1.0f);
            }
            if (!rYB2.id_continue && rYB2.id_int.nextInt(5) == 0) {
                rYB2.id_class(an_32, (byte)53);
            }
        }
    }

    public static void id_class(an_3 an_32) {
        kB_2.id_class(an_32, 5);
    }

    private static void id_class(an_3 an_32, int n) {
        if (((rYB)an_32.id_throws[7]).id_continue) {
            xc_3 xc_32 = xu_3.Jh.id_continue();
            for (int i = 0; i < n; ++i) {
                ((rYB)an_32.id_throws[7]).id_class(new rLX(rLQ.id_protected, xc_32), an_32.rx(), an_32.re(), an_32.BO(), 0.0, 0.0, 0.0);
            }
        }
    }

    private void id_class(an_3 an_32, rfH_2 rfH_22) {
        if (an_32 instanceof rhN_2 && ((rYB)an_32.id_throws[7]).r() % 20L == 0L) {
            Oo_1.id_static.id_class((rhN_2)an_32, ((rYB)an_32.id_throws[7]).id_byte(rfH_22));
        }
    }

    private boolean id_class(rfH_2 rfH_22, an_3 an_32) {
        if (an_32.BL()) {
            return false;
        }
        if (an_32.re() > (double)rfH_22.c_() + 0.9375 - 1.0E-7) {
            return false;
        }
        if (an_32.rv().id_byte >= -0.08) {
            return false;
        }
        double d = Math.abs((double)rfH_22.b_() + 0.5 - an_32.rx());
        double d2 = Math.abs((double)rfH_22.d_() + 0.5 - an_32.BO());
        double d3 = 0.4375 + (double)(an_32.PN() / 2.0f);
        return d + 1.0E-7 > d3 || d2 + 1.0E-7 > d3;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (this.id_class(rfH_22, an_32)) {
            this.id_class(an_32, rfH_22);
            this.id_protected(an_32);
            this.id_class(rYB2, an_32);
        }
        super.id_class(xc_32, rYB2, rfH_22, an_32);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32, float f) {
        an_32.id_class(rqn_3.so, 1.0f, 1.0f);
        if (!rYB2.id_continue) {
            rYB2.id_class(an_32, (byte)54);
        }
        if (an_32.id_class(f, 0.2f)) {
            an_32.id_class(this.id_case.id_catch(), this.id_case.id_class() * 0.5f, this.id_case.id_break() * 0.75f);
        }
    }

    public static void id_break(an_3 an_32) {
        kB_2.id_class(an_32, 10);
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    private void id_protected(an_3 an_32) {
        rjU_2 rjU_22 = an_32.rv();
        if (rjU_22.id_byte < -0.13) {
            double d = -0.05 / rjU_22.id_byte;
            an_32.id_byte(new rjU_2(rjU_22.id_break * d, -0.05, rjU_22.id_protected * d));
        } else {
            an_32.id_byte(new rjU_2(rjU_22.id_break, -0.05, rjU_22.id_protected));
        }
        Float f = Float.valueOf(0.0f);
        an_32.id_throws[31] = f;
    }
}

