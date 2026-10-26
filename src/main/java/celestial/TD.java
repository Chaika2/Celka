/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rOb_1;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.rxL_2;
import celestial.wc_3;
import celestial.wu_3;

public class TD
extends Tf_1<rOb_1, wc_3<rOb_1>> {
    private static final rqO_2 id_break = new rqO_2("textures/entity/sheep/sheep_fur.png");
    public wu_3<rOb_1> id_class = new wu_3();

    public TD(qE_2<rOb_1, wc_3<rOb_1>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rOb_1 rOb_12, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!rOb_12.sJ() && !rOb_12.Pp()) {
            float f7;
            float f8;
            float f9;
            if (rOb_12.Bk() && "jeb_".equals(rOb_12.g().id_break())) {
                int n2 = 25;
                int n3 = (Integer)rOb_12.id_throws[41] / 25 + rOb_12.V();
                int n4 = rxL_2.values().length;
                int n5 = n3 % n4;
                int n6 = (n3 + 1) % n4;
                float f10 = ((float)((Integer)rOb_12.id_throws[41] % 25) + f3) / 25.0f;
                float[] fArray = rOb_1.id_class(rxL_2.id_class(n5));
                float[] fArray2 = rOb_1.id_class(rxL_2.id_class(n6));
                if (rrbb_3.K()) {
                    fArray = rrbN_2.id_break(rxL_2.id_class(n5), fArray);
                    fArray2 = rrbN_2.id_break(rxL_2.id_class(n6), fArray2);
                }
                f9 = fArray[0] * (1.0f - f10) + fArray2[0] * f10;
                f8 = fArray[1] * (1.0f - f10) + fArray2[1] * f10;
                f7 = fArray[2] * (1.0f - f10) + fArray2[2] * f10;
            } else {
                float[] fArray = rOb_1.id_class(rOb_12.n());
                if (rrbb_3.K()) {
                    fArray = rrbN_2.id_break(rOb_12.n(), fArray);
                }
                f9 = fArray[0];
                f8 = fArray[1];
                f7 = fArray[2];
            }
            TD.id_class(this.id_byte(), this.id_class, id_break, ml_1, hx_1, n, rOb_12, f, f2, f4, f5, f6, f3, f9, f8, f7);
        }
    }
}

