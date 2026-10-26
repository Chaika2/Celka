/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pF_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrhO_2;
import celestial.tZ_2;

public class rrOX
extends rrhO_2 {
    public rrOX() {
        super(aI_2.id_private, "cat", 0.4f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pF_2 pF_22 = new pF_2(pg_32);
        pF_22.id_throws = (tZ_2)in_1;
        pF_22.id_byte = f;
        return pF_22;
    }

    @Override
    public In_1 id_throws() {
        return new tZ_2(0.0f);
    }
}

