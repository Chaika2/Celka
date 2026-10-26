/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rEx_1;
import celestial.rqO_2;
import celestial.tC_2;

public class Tn_1<T extends rEx_1>
extends Tf_1<T, tC_2<T>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/drowned_outer_layer.png");
    private final tC_2<T> id_break = new tC_2(0.25f, 0.0f, 64, 64);

    public Tn_1(qE_2<T, tC_2<T>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        Tn_1.id_class(this.id_byte(), this.id_break, id_class, ml_1, hx_1, n, t, f, f2, f4, f5, f6, f3, 1.0f, 1.0f, 1.0f);
    }
}

