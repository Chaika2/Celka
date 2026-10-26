/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rOH;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.wV_2;

public class tb_3
extends Tf_1<rOH, wV_2<rOH>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/wolf/wolf_collar.png");

    public tb_3(qE_2<rOH, wV_2<rOH>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rOH rOH2, float f, float f2, float f3, float f4, float f5, float f6) {
        if (rOH2.sZ() && !rOH2.Pp()) {
            float[] fArray = rOH2.sx().id_protected();
            if (rrbb_3.K()) {
                fArray = rrbN_2.id_class(rOH2.sx(), fArray);
            }
            tb_3.id_class(this.id_byte(), id_class, ml_1, hx_1, n, rOH2, fArray[0], fArray[1], fArray[2]);
        }
    }
}

