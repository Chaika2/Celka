/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qj_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wL_2;

public class rrhy_3
extends rrOG {
    public rrhy_3() {
        super(aI_2.A, "skeleton", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qj_3 qj_32 = new qj_3(pg_32);
        qj_32.id_throws = (wL_2)in_1;
        qj_32.id_byte = f;
        return qj_32;
    }

    @Override
    public In_1 id_throws() {
        return new wL_2();
    }
}

