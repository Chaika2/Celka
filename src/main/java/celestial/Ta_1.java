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
import celestial.qd_3;
import celestial.rOX;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rje_3;
import celestial.wn_3;
import celestial.xu_3;

public class Ta_1
extends Tf_1<rOX, wn_3<rOX>> {
    public Ta_1(qE_2<rOX, wn_3<rOX>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rOX rOX2, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!rOX2.Pp() && rOX2.L()) {
            ml_1.id_class();
            ((wn_3)this.id_byte()).id_break().id_class(ml_1);
            float f7 = 0.625f;
            ml_1.id_class(0.0, -0.34375, 0.0);
            ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
            ml_1.id_class(0.625f, -0.625f, -0.625f);
            rdn_3 rdn_32 = new rdn_3(xu_3.Br);
            QY.id_instanceof().id_float().id_class(rOX2, rdn_32, IQ.HEAD, false, ml_1, hx_1, (rYB)rOX2.id_throws[7], n, qd_3.id_byte(rOX2, 0.0f));
            ml_1.id_break();
        }
    }
}

