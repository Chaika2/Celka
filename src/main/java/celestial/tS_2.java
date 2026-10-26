/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rOg_1;
import celestial.tO_2;
import celestial.tp_3;
import celestial.wT_2;
import celestial.wq_3;

public class tS_2
extends Tf_1<rOg_1, tp_3<rOg_1>> {
    private final wq_3<rOg_1> id_class = new wq_3(0.008f);
    private final wT_2<rOg_1> id_break = new wT_2(0.008f);

    public tS_2(qE_2<rOg_1, tp_3<rOg_1>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rOg_1 rOg_12, float f, float f2, float f3, float f4, float f5, float f6) {
        tO_2 tO_22 = rOg_12.sZ() == 0 ? this.id_class : this.id_break;
        float[] fArray = rOg_12.sm();
        tS_2.id_class(this.id_byte(), tO_22, rOg_12.sv(), ml_1, hx_1, n, rOg_12, f, f2, f4, f5, f6, f3, fArray[0], fArray[1], fArray[2]);
    }
}

