/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qA_2;
import celestial.rrMa_1;
import celestial.rrhu_3;
import celestial.wM_2;

public class rrhx_3
extends rrhu_3 {
    public rrhx_3() {
        super(aI_2.x, "pig", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qA_2 qA_22 = new qA_2(pg_32);
        qA_22.id_throws = (wM_2)in_1;
        qA_22.id_byte = f;
        return qA_22;
    }

    @Override
    public In_1 id_throws() {
        return new wM_2();
    }
}

