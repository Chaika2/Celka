/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.is_3;
import celestial.qE_2;
import celestial.rqO_2;
import celestial.tp_3;
import celestial.wL_2;

public class tP_2<T extends is_3, M extends tp_3<T>>
extends Tf_1<T, M> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/skeleton/stray_overlay.png");
    private final wL_2<T> id_break = new wL_2(0.25f, true);

    public tP_2(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        tP_2.id_class(this.id_byte(), this.id_break, id_class, ml_1, hx_1, n, t, f, f2, f4, f5, f6, f3, 1.0f, 1.0f, 1.0f);
    }
}

