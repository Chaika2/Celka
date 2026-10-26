/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rje_3;
import celestial.tp_3;

public class TF<T extends iB_2, M extends tp_3<T>>
extends Tf_1<T, M> {
    public TF(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        ml_1.id_class();
        ml_1.id_class(0.0, (double)0.4f, (double)-0.4f);
        ml_1.id_class(rje_3.id_break.id_byte(180.0f));
        rdn_3 rdn_32 = ((iB_2)t).id_class(rXQ.MAINHAND);
        QY.id_instanceof().id_import().id_class((iB_2)t, rdn_32, IQ.GROUND, false, ml_1, hx_1, n);
        ml_1.id_break();
    }
}

