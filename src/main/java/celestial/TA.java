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
import celestial.rbo_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rpZ_2;
import celestial.tn_3;

public class TA
extends Tf_1<rbo_3, tn_3<rbo_3>> {
    public TA(qE_2<rbo_3, tn_3<rbo_3>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rbo_3 rbo_32, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean bl = rbo_32.Su() == rpZ_2.RIGHT;
        ml_1.id_class();
        float f7 = 1.0f;
        float f8 = -1.0f;
        float f9 = rfU_2.id_throws(((Float)rbo_32.id_throws[16]).floatValue()) / 60.0f;
        if (((Float)rbo_32.id_throws[16]).floatValue() < 0.0f) {
            ml_1.id_class(0.0, (double)(1.0f - f9 * 0.5f), (double)(-1.0f + f9 * 0.5f));
        } else {
            ml_1.id_class(0.0, (double)(1.0f + f9 * 0.8f), (double)(-1.0f + f9 * 0.2f));
        }
        rdn_3 rdn_32 = bl ? rbo_32.ss() : rbo_32.Sn();
        QY.id_instanceof().id_import().id_class(rbo_32, rdn_32, IQ.GROUND, false, ml_1, hx_1, n);
        ml_1.id_break();
    }
}

