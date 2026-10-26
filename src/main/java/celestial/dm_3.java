/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dH_2;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpm_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public class dm_3
extends dH_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

    private void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        for (int i = 0; i < 1000; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(rYB2.id_int.nextInt(16) - rYB2.id_int.nextInt(16), rYB2.id_int.nextInt(8) - rYB2.id_int.nextInt(8), rYB2.id_int.nextInt(16) - rYB2.id_int.nextInt(16));
            if (!rYB2.id_byte(rfH_23).id_catch()) continue;
            if (rYB2.id_continue) {
                for (int j = 0; j < 128; ++j) {
                    double d = rYB2.id_int.nextDouble();
                    float f = (rYB2.id_int.nextFloat() - 0.5f) * 0.2f;
                    float f2 = (rYB2.id_int.nextFloat() - 0.5f) * 0.2f;
                    float f3 = (rYB2.id_int.nextFloat() - 0.5f) * 0.2f;
                    double d2 = rfU_2.id_protected(d, (double)rfH_23.b_(), (double)rfH_22.b_()) + (rYB2.id_int.nextDouble() - 0.5) + 0.5;
                    double d3 = rfU_2.id_protected(d, (double)rfH_23.c_(), (double)rfH_22.c_()) + rYB2.id_int.nextDouble() - 0.5;
                    double d4 = rfU_2.id_protected(d, (double)rfH_23.d_(), (double)rfH_22.d_()) + (rYB2.id_int.nextDouble() - 0.5) + 0.5;
                    rYB2.id_class(rLQ.id_transient, d2, d3, d4, (double)f, (double)f2, f3);
                }
            } else {
                rYB2.id_class(rfH_23, xc_32, 2);
                rYB2.id_class(rfH_22, false);
            }
            return;
        }
    }

    public dm_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        this.id_byte(xc_32, rYB2, rfH_22);
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        this.id_byte(xc_32, rYB2, rfH_22);
    }

    @Override
    protected int id_break() {
        return 5;
    }
}

