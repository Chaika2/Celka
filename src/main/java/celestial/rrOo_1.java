/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qb_3;
import celestial.rrMa_1;
import celestial.rrOY;
import celestial.tK_2;

public class rrOo_1
extends rrOY {
    public rrOo_1() {
        super(aI_2.id_static, "illusioner", 0.5f, new String[]{"illusion_illager"});
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qb_3 qb_32 = new qb_3(pg_32);
        qb_32.id_throws = (tK_2)in_1;
        qb_32.id_byte = f;
        return qb_32;
    }

    @Override
    public In_1 id_throws() {
        tK_2 tK_22 = new tK_2(0.0f, 0.0f, 64, 64);
        tK_22.id_break().id_finally = true;
        return tK_22;
    }
}

