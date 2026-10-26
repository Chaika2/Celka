/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qH_2;
import celestial.rrMa_1;
import celestial.rrhu_3;
import celestial.wX_2;

public class rrhz_3
extends rrhu_3 {
    public rrhz_3() {
        super(aI_2.z, "polar_bear", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qH_2 qH_22 = new qH_2(pg_32);
        qH_22.id_throws = (wX_2)in_1;
        qH_22.id_byte = f;
        return qH_22;
    }

    @Override
    public In_1 id_throws() {
        return new wX_2();
    }
}

