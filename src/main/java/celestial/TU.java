/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.qI_2;
import celestial.qd_3;
import celestial.rGz_1;
import celestial.rjY_2;
import celestial.rqO_2;
import celestial.rxL_2;
import celestial.wv_3;

public class TU
extends Tf_1<rGz_1, wv_3<rGz_1>> {
    public TU(qE_2<rGz_1, wv_3<rGz_1>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rGz_1 rGz_12, float f, float f2, float f3, float f4, float f5, float f6) {
        ml_1.id_class();
        ml_1.id_class(0.0, 1.0, 0.0);
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        rjY_2 rjY_22 = rGz_12.n().id_case().id_break();
        rjY_22.id_throws();
        ml_1.id_class(rjY_22);
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        ml_1.id_class(0.0, -1.0, 0.0);
        rxL_2 rxL_22 = rGz_12.sz();
        rqO_2 rqO_22 = rxL_22 == null ? qI_2.id_class : qI_2.id_package[rxL_22.id_break()];
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_break(rqO_22));
        ((wv_3)this.id_byte()).id_protected().id_class(ml_1, ok_1, n, qd_3.id_byte(rGz_12, 0.0f));
        ml_1.id_break();
    }
}

