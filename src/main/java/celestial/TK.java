/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.In_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.aK_2;
import celestial.an_3;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rqO_2;
import celestial.tp_3;

public class TK<T extends an_3, M extends tp_3<T>>
extends Tf_1<T, M> {
    private final rqO_2 id_class;
    private final M id_break;

    public TK(qE_2<T, M> qE_22, M m, rqO_2 rqO_22) {
        super(qE_22);
        this.id_break = m;
        this.id_class = rqO_22;
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        if (((aK_2)t).id_byte()) {
            ((tp_3)this.id_byte()).id_class(this.id_break);
            ((tp_3)this.id_break).id_class(t, f, f2, f3);
            ((tp_3)this.id_break).id_class(t, f, f2, f4, f5, f6);
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_protected(this.id_class));
            ((In_1)this.id_break).id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}

