/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qn_3;
import celestial.rrMa_1;
import celestial.rrhd_3;
import celestial.wO_2;

public class rrXM
extends rrhd_3 {
    public rrXM() {
        super(aI_2.rb, "zombified_piglin", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qn_3 qn_32 = new qn_3(pg_32, true);
        qn_32.id_throws = (wO_2)in_1;
        qn_32.id_byte = f;
        return qn_32;
    }
}

