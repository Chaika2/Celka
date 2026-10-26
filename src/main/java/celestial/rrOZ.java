/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pq_3;
import celestial.rrMa_1;
import celestial.rrXE;
import celestial.tC_2;

public class rrOZ
extends rrXE {
    public rrOZ() {
        super(aI_2.id_new, "drowned", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pq_3 pq_32 = new pq_3(pg_32);
        pq_32.id_throws = (tC_2)in_1;
        pq_32.id_byte = f;
        return pq_32;
    }

    @Override
    public In_1 id_throws() {
        return new tC_2(0.0f, 0.0f, 64, 64);
    }
}

