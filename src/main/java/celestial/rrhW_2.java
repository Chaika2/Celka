/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qC_2;
import celestial.rrMa_1;
import celestial.rrOY;
import celestial.tK_2;

public class rrhW_2
extends rrOY {
    public rrhW_2() {
        super(aI_2.W, "pillager", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qC_2 qC_22 = new qC_2(pg_32);
        qC_22.id_throws = (tK_2)in_1;
        qC_22.id_byte = f;
        return qC_22;
    }

    @Override
    public In_1 id_throws() {
        return new tK_2(0.0f, 0.0f, 64, 64);
    }
}

