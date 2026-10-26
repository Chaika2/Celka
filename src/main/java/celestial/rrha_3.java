/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.TM;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrhU_2;
import celestial.wI_2;

public class rrha_3
extends rrhU_2 {
    public rrha_3() {
        super(aI_2.e, "wandering_trader", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TM tM = new TM(pg_32);
        tM.id_throws = (wI_2)in_1;
        tM.id_byte = f;
        return tM;
    }
}

