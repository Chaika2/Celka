/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.QY;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rHc_1;
import celestial.rdn_3;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.rqs_3;
import celestial.xn_3;

public class fi_3
extends jW_2<rHc_1> {
    public fi_3(jz_3 jz_32) {
        super(jz_32);
    }

    @Override
    public void id_class(rHc_1 rHc_12, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        rpr_3 rpr_32 = rHc_12.id_abstract().id_byte(xn_3.id_new);
        rqs_3<rdn_3> rqs_32 = rHc_12.id_class();
        for (int i = 0; i < rqs_32.size(); ++i) {
            rdn_3 rdn_32 = rqs_32.get(i);
            if (rdn_32 == rdn_3.id_break) continue;
            ml_1.id_class();
            ml_1.id_class(0.5, 0.44921875, 0.5);
            rpr_3 rpr_33 = rpr_3.id_break((i + rpr_32.id_protected()) % 4);
            float f2 = -rpr_33.id_package();
            ml_1.id_class(rje_3.id_protected.id_byte(f2));
            ml_1.id_class(rje_3.id_break.id_byte(90.0f));
            ml_1.id_class(-0.3125, -0.3125, 0.0);
            ml_1.id_class(0.375f, 0.375f, 0.375f);
            QY.id_instanceof().id_float().id_class(rdn_32, IQ.FIXED, n, n2, ml_1, hx_1);
            ml_1.id_break();
        }
    }
}

