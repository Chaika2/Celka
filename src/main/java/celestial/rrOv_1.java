/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pT_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOq_1;
import celestial.tf_3;

public class rrOv_1
extends rrOq_1 {
    public rrOv_1() {
        super(aI_2.id_continue, "elder_guardian", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pT_2 pT_22 = new pT_2(pg_32);
        pT_22.id_throws = (tf_3)in_1;
        pT_22.id_byte = f;
        return pT_22;
    }
}

