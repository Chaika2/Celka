/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.iB_2;
import celestial.rHH;
import celestial.rJE;
import celestial.rJR;
import celestial.rJZ;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpA_2;
import celestial.rpm_3;
import celestial.rpq_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class dv_3
extends dB_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

    protected dv_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHH) {
            rgP_2 rgP_22 = ((rpA_2)((Object)ryO_22)).L_();
            return new rJR((n, rhz_32, rhd_32) -> new rJE(n, rhz_32, rpq_3.id_class(rYB2, rfH_22)), rgP_22);
        }
        return null;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHH) {
            ((rHH)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        rhd_32.id_class(xc_32.id_break(rYB2, rfH_22));
        return ryZ_2.CONSUME;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        super.id_class(xc_32, rYB2, rfH_22, random);
        for (int i = -2; i <= 2; ++i) {
            block1: for (int j = -2; j <= 2; ++j) {
                if (i > -2 && i < 2 && j == -1) {
                    j = 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int k = 0; k <= 1; ++k) {
                    rfH_2 rfH_23 = rfH_22.id_break(i, k, j);
                    if (!rYB2.id_byte(rfH_23).id_class(xu_3.rj)) continue;
                    if (!rYB2.id_finally(rfH_22.id_break(i / 2, 0, j / 2))) continue block1;
                    rYB2.id_class(rLQ.id_super, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 2.0, (double)rfH_22.d_() + 0.5, (double)((float)i + random.nextFloat()) - 0.5, (double)((float)k - random.nextFloat() - 1.0f), (double)((float)j + random.nextFloat()) - 0.5);
                }
            }
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHH();
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }
}

