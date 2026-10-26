/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TZ;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rYB;
import celestial.rbf_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tZ_2;

public class pF_2
extends qc_3<rbf_3, tZ_2<rbf_3>> {
    public pF_2(pg_3 pg_32) {
        super(pg_32, new tZ_2(0.0f), 0.4f);
        this.id_class(new TZ(this));
    }

    @Override
    protected void id_class(rbf_3 rbf_32, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rbf_32, ml_1, f, f2, f3);
        float f4 = rbf_32.id_throw(f3);
        if (f4 > 0.0f) {
            ml_1.id_class((double)(0.4f * f4), (double)(0.15f * f4), (double)(0.1f * f4));
            ml_1.id_class(rje_3.id_case.id_byte(rfU_2.id_private(f4, 0.0f, 90.0f)));
            rfH_2 rfH_22 = rbf_32.Bs();
            for (rhd_3 rhd_32 : ((rYB)rbf_32.id_throws[7]).id_class(rhd_3.class, new rfl_3(rfH_22).id_byte(2.0, 2.0, 2.0))) {
                if (!rhd_32.Sc()) continue;
                ml_1.id_class((double)(0.15f * f4), 0.0, 0.0);
                break;
            }
        }
    }

    @Override
    protected void id_class(rbf_3 rbf_32, Ml_1 ml_1, float f) {
        super.id_class(rbf_32, ml_1, f);
        ml_1.id_class(0.8f, 0.8f, 0.8f);
    }

    @Override
    public rqO_2 id_class(rbf_3 rbf_32) {
        return rbf_32.L();
    }
}

