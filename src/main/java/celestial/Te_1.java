/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.qE_2;
import celestial.qd_3;
import celestial.tp_3;
import celestial.wA_2;

public class Te_1<T extends iB_2>
extends Tf_1<T, wA_2<T>> {
    private final tp_3<T> id_class = new wA_2(0);

    public Te_1(qE_2<T, wA_2<T>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!((an_3)t).Pp()) {
            ((wA_2)this.id_byte()).id_class(this.id_class);
            this.id_class.id_class(t, f, f2, f3);
            this.id_class.id_class(t, f, f2, f4, f5, f6);
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_private(this.id_class(t)));
            this.id_class.id_class(ml_1, ok_1, n, qd_3.id_byte(t, 0.0f), 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}

