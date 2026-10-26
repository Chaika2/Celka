/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrAb_1;
import celestial.rrEm_1;
import celestial.rrQX;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class zz_3
extends xF_2
implements kX_2 {
    public static final rCm_1 id_volatile = rCT.J;
    private static final rjC_2 id_final = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
    private static final rjC_2 id_package = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    public zz_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return xc_32.id_byte(id_volatile) < 3;
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        int n = Math.min(3, xc_32.id_byte(id_volatile) + 1);
        rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n), 2);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        boolean bl;
        int n = xc_32.id_byte(id_volatile);
        boolean bl2 = bl = n == 3;
        if (!bl && rhd_32.id_protected(rpm_32).id_break() == rdy_3.Xg) {
            return ryZ_2.PASS;
        }
        if (n > 1) {
            int n2 = 1 + rYB2.id_int.nextInt(2);
            zz_3.id_class(rYB2, rfH_22, new rdn_3(rdy_3.WQ, n2 + (bl ? 1 : 0)));
            rYB2.id_class(null, rfH_22, rqn_3.dE, rqL_2.BLOCKS, 1.0f, 0.8f + rYB2.id_int.nextFloat() * 0.4f);
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, 1), 2);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return super.id_class(xc_32, rYB2, rfH_22, rhd_32, rpm_32, rff_32);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (xc_32.id_byte(id_volatile) == 0) {
            return id_final;
        }
        return xc_32.id_byte(id_volatile) < 3 ? id_package : super.id_class(xc_32, rRq_12, rfH_22, rjm_32);
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n = xc_32.id_byte(id_volatile);
        if (n < 3 && random.nextInt(5) == 0 && rrEm_12.id_class(rfH_22.id_final(), 0) >= 9) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, n + 1), 2);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (an_32 instanceof iB_2 && an_32.BC() != aI_2.id_throw && an_32.BC() != aI_2.id_throws) {
            if (an_32 == (cb_3)QY.id_instanceof().id_class[57]) {
                rrAb_1 rrAb_12 = rrAb_1.id_class(this, new rjU_2(0.8f, 0.75, 0.8f));
                if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAb_12).id_byte()) {
                    an_32.id_class(xc_32, rrAb_12.id_break());
                }
            } else {
                an_32.id_class(xc_32, new rjU_2(0.8f, 0.75, 0.8f));
            }
            an_32.id_class(this);
            if (!(rYB2.id_continue || xc_32.id_byte(id_volatile) <= 0 || ((Double)an_32.id_throws[34]).doubleValue() == an_32.rx() && ((Double)an_32.id_throws[36]).doubleValue() == an_32.BO())) {
                double d = Math.abs(an_32.rx() - (Double)an_32.id_throws[34]);
                double d2 = Math.abs(an_32.BO() - (Double)an_32.id_throws[36]);
                if (d >= (double)0.003f || d2 >= (double)0.003f) {
                    an_32.id_break(rye_3.id_else, 1.0f);
                }
            }
        }
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(rdy_3.WQ);
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) < 3;
    }
}

