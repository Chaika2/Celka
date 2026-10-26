/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qD_2;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wL_2;

public class rrhI_2
extends rrOG {
    public rrhI_2() {
        super(aI_2.t, "stray", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qD_2 qD_22 = new qD_2(pg_32);
        qD_22.id_throws = (wL_2)in_1;
        qD_22.id_byte = f;
        return qD_22;
    }

    @Override
    public In_1 id_throws() {
        return new wL_2();
    }
}

