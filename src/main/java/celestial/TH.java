/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.aR_2;
import celestial.an_3;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rqO_2;
import celestial.tp_3;

public abstract class TH<T extends an_3, M extends tp_3<T>>
extends Tf_1<T, M> {
    public TH(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    protected abstract rqO_2 id_class();

    protected abstract float id_class(float var1);

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        if (((aR_2)t).id_class()) {
            float f7 = (float)((Integer)((an_3)t).id_throws[41]).intValue() + f3;
            tp_3<T> tp_32 = this.id_break();
            tp_32.id_class(t, f, f2, f3);
            ((tp_3)this.id_byte()).id_class(tp_32);
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_class(this.id_class(), this.id_class(f7), f7 * 0.01f));
            tp_32.id_class(t, f, f2, f4, f5, f6);
            tp_32.id_class(ml_1, ok_1, n, fZ_2.id_class, 0.5f, 0.5f, 0.5f, 1.0f);
        }
    }

    protected abstract tp_3<T> id_break();
}

