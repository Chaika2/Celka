/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qv_3;
import celestial.rrMa_1;
import celestial.rrhu_3;
import celestial.wS_2;

public class rrhh_3
extends rrhu_3 {
    public rrhh_3() {
        super(aI_2.h, "panda", 0.9f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qv_3 qv_32 = new qv_3(pg_32);
        qv_32.id_throws = (wS_2)in_1;
        qv_32.id_byte = f;
        return qv_32;
    }

    @Override
    public In_1 id_throws() {
        return new wS_2(9, 0.0f);
    }
}

