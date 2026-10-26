/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QY;
import celestial.an_3;
import celestial.cb_3;
import celestial.kh_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rLQ;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrAd_1;
import celestial.rrAx_1;
import celestial.rrEm_1;
import celestial.rrQX;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xv_3
extends xd_3
implements kh_3 {
    public static final rCN id_volatile = rCT.id_throws;

    public xv_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, true));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjw_3.id_class();
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
        return xc_33.id_class(xu_3.hM) || xc_33.id_class(xu_3.bV) || xc_33.id_class(xu_3.PY);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            return xu_3.id_try.id_continue();
        }
        if (rpr_32 == rpr_3.DOWN) {
            rRg_12.id_class(rfH_22, (xc_3)xu_3.hM.id_continue().id_class(id_volatile, xv_3.id_class((rRq_1)rRg_12, rfH_23)), 2);
        } else if (rpr_32 == rpr_3.UP && !xc_33.id_class(xu_3.hM) && xv_3.id_class(rRg_12, rfH_23)) {
            rRg_12.id_finally().id_class(rfH_22, this, 5);
        }
        rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (an_32 == (cb_3)QY.id_instanceof().id_class[57] && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAx_1.id_class((rrAd_1)((Object)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[3]))).id_byte()) {
            return;
        }
        xc_3 xc_33 = rYB2.id_byte(rfH_22.id_final());
        if (xc_33.id_catch()) {
            an_32.id_private(xc_32.id_byte(id_volatile));
            if (!rYB2.id_continue) {
                rrEm_1 rrEm_12 = (rrEm_1)rYB2;
                for (int i = 0; i < 2; ++i) {
                    rrEm_12.id_class(rLQ.E, (double)rfH_22.b_() + rYB2.id_int.nextDouble(), rfH_22.c_() + 1, (double)rfH_22.d_() + rYB2.id_int.nextDouble(), 1, 0.0, 0.0, 0.0, 1.0);
                    rrEm_12.id_class(rLQ.id_throws, (double)rfH_22.b_() + rYB2.id_int.nextDouble(), rfH_22.c_() + 1, (double)rfH_22.d_() + rYB2.id_int.nextDouble(), 1, 0.0, 0.01, 0.0, 0.2);
                }
            }
        } else {
            an_32.id_new(xc_32.id_byte(id_volatile));
        }
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.INVISIBLE;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        double d = rfH_22.b_();
        double d2 = rfH_22.c_();
        double d3 = rfH_22.d_();
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rYB2.id_break(rLQ.M, d + 0.5, d2 + 0.8, d3, 0.0, 0.0, 0.0);
            if (random.nextInt(200) == 0) {
                rYB2.id_class(d, d2, d3, rqn_3.rx, rqL_2.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        } else {
            rYB2.id_break(rLQ.O, d + 0.5, d2, d3 + 0.5, 0.0, 0.04, 0.0);
            rYB2.id_break(rLQ.O, d + (double)random.nextFloat(), d2 + (double)random.nextFloat(), d3 + (double)random.nextFloat(), 0.0, 0.04, 0.0);
            if (random.nextInt(200) == 0) {
                rYB2.id_class(d, d2, d3, rqn_3.rX, rqL_2.BLOCKS, 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        xv_3.id_class((rRg_1)rYB2, rfH_22.id_final(), xv_3.id_class((rRq_1)rYB2, rfH_22.id_break()));
    }

    public static void id_class(rRg_1 rRg_12, rfH_2 rfH_22, boolean bl) {
        if (xv_3.id_class(rRg_12, rfH_22)) {
            rRg_12.id_class(rfH_22, (xc_3)xu_3.hM.id_continue().id_class(id_volatile, bl), 2);
        }
    }

    public static boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        rXE rXE2 = rRg_12.id_break(rfH_22);
        return rRg_12.id_byte(rfH_22).id_class(xu_3.id_try) && rXE2.id_throws() >= 8 && rXE2.id_break();
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        if (xc_32.id_class(xu_3.hM)) {
            return xc_32.id_byte(id_volatile);
        }
        return !xc_32.id_class(xu_3.PY);
    }

    @Override
    public rXs_1 id_break(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        rRg_12.id_class(rfH_22, xu_3.id_class.id_continue(), 11);
        return rXG.id_byte;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        xv_3.id_class((rRg_1)rrEm_12, rfH_22.id_final(), xv_3.id_class((rRq_1)rrEm_12, rfH_22));
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return rXG.id_byte.id_class(false);
    }
}

