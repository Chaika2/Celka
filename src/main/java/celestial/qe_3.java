/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.fZ_2;
import celestial.pg_3;
import celestial.qN_2;
import celestial.rfU_2;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rsv_3;
import celestial.xc_3;

public class qe_3
extends qN_2<rsv_3> {
    public qe_3(pg_3 pg_32) {
        super(pg_32);
    }

    public static void id_class(xc_3 xc_32, Ml_1 ml_1, Hx_1 hx_1, int n, boolean bl) {
        int n2 = bl ? fZ_2.id_class(fZ_2.id_class(1.0f), 10) : fZ_2.id_class;
        if (rrbb_3.rs() && bl) {
            rrdZ.id_break(1.0f, 1.0f, 1.0f, 0.5f);
        }
        QY.id_instanceof().id_synchronized().id_class(xc_32, ml_1, hx_1, n, n2);
        if (rrbb_3.rs()) {
            rrdZ.id_break(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override
    protected void id_class(rsv_3 rsv_32, float f, xc_3 xc_32, Ml_1 ml_1, Hx_1 hx_1, int n) {
        int n2 = rsv_32.id_return();
        if (n2 > -1 && (float)n2 - f + 1.0f < 10.0f) {
            float f2 = 1.0f - ((float)n2 - f + 1.0f) / 10.0f;
            f2 = rfU_2.id_class(f2, 0.0f, 1.0f);
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            ml_1.id_class(f3, f3, f3);
        }
        qe_3.id_class(xc_32, ml_1, hx_1, n, n2 > -1 && n2 / 5 % 2 == 0);
    }
}

