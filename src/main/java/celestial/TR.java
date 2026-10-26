/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rMl_1;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.wS_2;

public class TR
extends Tf_1<rMl_1, wS_2<rMl_1>> {
    public TR(qE_2<rMl_1, wS_2<rMl_1>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rMl_1 rMl_12, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32 = rMl_12.id_class(rXQ.MAINHAND);
        if (rMl_12.sJ() && !rMl_12.sl()) {
            float f7 = -0.6f;
            float f8 = 1.4f;
            if (rMl_12.sd()) {
                f7 -= 0.2f * rfU_2.id_class(f4 * 0.6f) + 0.2f;
                f8 -= 0.09f * rfU_2.id_class(f4 * 0.6f);
            }
            ml_1.id_class();
            ml_1.id_class((double)0.1f, (double)f8, (double)f7);
            QY.id_instanceof().id_import().id_class(rMl_12, rdn_32, IQ.GROUND, false, ml_1, hx_1, n);
            ml_1.id_break();
        }
    }
}

