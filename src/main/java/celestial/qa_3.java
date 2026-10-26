/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.fJ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qe_3;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rsX_2;
import celestial.xu_3;

public class qa_3
extends pV_2<rsX_2> {
    public qa_3(pg_3 pg_32) {
        super(pg_32);
        this.id_byte = 0.5f;
    }

    @Override
    public rqO_2 id_class(rsX_2 rsX_22) {
        return fJ_2.id_class;
    }

    @Override
    public void id_class(rsX_2 rsX_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(0.0, 0.5, 0.0);
        if ((float)rsX_22.id_case() - f2 + 1.0f < 10.0f) {
            float f3 = 1.0f - ((float)rsX_22.id_case() - f2 + 1.0f) / 10.0f;
            f3 = rfU_2.id_class(f3, 0.0f, 1.0f);
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            ml_1.id_class(f4, f4, f4);
        }
        ml_1.id_class(rje_3.id_protected.id_byte(-90.0f));
        ml_1.id_class(-0.5, -0.5, 0.5);
        ml_1.id_class(rje_3.id_protected.id_byte(90.0f));
        qe_3.id_class(xu_3.rf.id_continue(), ml_1, hx_1, n, rsX_22.id_case() / 5 % 2 == 0);
        ml_1.id_break();
        super.id_class(rsX_22, f, f2, ml_1, hx_1, n);
    }
}

