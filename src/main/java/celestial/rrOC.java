/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pY_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOY;
import celestial.tK_2;
import celestial.tp_3;

public class rrOC
extends rrOY {
    public rrOC() {
        super(aI_2.id_return, "evoker", 0.5f, new String[]{"evocation_illager"});
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pY_2 pY_22 = new pY_2(pg_32);
        pY_22.id_throws = (tp_3)in_1;
        pY_22.id_byte = f;
        return pY_22;
    }

    @Override
    public In_1 id_throws() {
        return new tK_2(0.0f, 0.0f, 64, 64);
    }
}

