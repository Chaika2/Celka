/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.an_3;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rHU;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rrEy_1;

public class jM_2
extends jW_2<rHU> {
    public jM_2(jz_3 jz_32) {
        super(jz_32);
    }

    @Override
    public void id_class(rHU rHU2, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        ml_1.id_class();
        ml_1.id_class(0.5, 0.0, 0.5);
        rrEy_1 rrEy_12 = rHU2.id_catch();
        an_3 an_32 = rrEy_12.id_protected();
        if (an_32 != null) {
            float f2 = 0.53125f;
            float f3 = Math.max(an_32.PN(), an_32.Bm());
            if ((double)f3 > 1.0) {
                f2 /= f3;
            }
            ml_1.id_class(0.0, (double)0.4f, 0.0);
            ml_1.id_class(rje_3.id_protected.id_byte((float)rfU_2.id_protected((double)f, rrEy_12.id_case(), rrEy_12.id_throws()) * 10.0f));
            ml_1.id_class(0.0, (double)-0.2f, 0.0);
            ml_1.id_class(rje_3.id_break.id_byte(-30.0f));
            ml_1.id_class(f2, f2, f2);
            QY.id_instanceof().id_case().id_class(an_32, 0.0, 0.0, 0.0, 0.0f, f, ml_1, hx_1, n);
        }
        ml_1.id_break();
    }
}

