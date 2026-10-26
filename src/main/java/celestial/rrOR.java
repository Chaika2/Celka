/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qs_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.wg_3;

public class rrOR
extends rrOG {
    public rrOR() {
        super(aI_2.id_void, "husk", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qs_3 qs_32 = new qs_3(pg_32);
        qs_32.id_throws = (wg_3)in_1;
        qs_32.id_byte = f;
        return qs_32;
    }

    @Override
    public In_1 id_throws() {
        return new wg_3(0.0f, false);
    }
}

