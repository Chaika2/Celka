/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TS;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOg_1;
import celestial.tV_2;

public class rrhp_3
extends rrOg_1 {
    public rrhp_3() {
        super(aI_2.n, "skeleton_horse", 0.75f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TS tS = new TS(pg_32);
        tS.id_throws = (tV_2)in_1;
        tS.id_byte = f;
        return tS;
    }
}

