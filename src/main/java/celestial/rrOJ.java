/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pL_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrht_3;
import celestial.wC_2;

public class rrOJ
extends rrht_3 {
    public rrOJ() {
        super(aI_2.id_implements, "cave_spider", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pL_2 pL_22 = new pL_2(pg_32);
        pL_22.id_throws = (wC_2)in_1;
        pL_22.id_byte = f;
        return pL_22;
    }
}

