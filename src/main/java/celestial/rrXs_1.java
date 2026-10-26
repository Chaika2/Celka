/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.Td_1;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOV;
import celestial.tc_3;

public class rrXs_1
extends rrOV {
    public rrXs_1() {
        super(aI_2.rS, "zoglin", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Td_1 td_1 = new Td_1(pg_32);
        td_1.id_throws = (tc_3)in_1;
        td_1.id_byte = f;
        return td_1;
    }
}

