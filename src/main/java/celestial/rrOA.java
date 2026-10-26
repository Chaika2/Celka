/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pf_3;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.tH_2;

public class rrOA
extends rrOG {
    public rrOA() {
        super(aI_2.id_else, "enderman", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pf_3 pf_32 = new pf_3(pg_32);
        pf_32.id_throws = (tH_2)in_1;
        pf_32.id_byte = f;
        return pf_32;
    }

    @Override
    public In_1 id_throws() {
        return new tH_2(0.0f);
    }
}

