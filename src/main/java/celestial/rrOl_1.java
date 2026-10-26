/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pR_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tq_3;

public class rrOl_1
extends rrMi_1 {
    public rrOl_1() {
        super(aI_2.id_public, "evoker_fangs", 0.0f, new String[]{"evocation_fangs"});
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pR_2 pR_22 = new pR_2(pg_32);
        if (!rrxr_3.EY.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderEvokerFangs.model");
            return null;
        }
        rrxr_3.id_class((Object)pR_22, rrxr_3.EY, (Object)in_1);
        pR_22.id_byte = f;
        return pR_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tq_3)) {
            return null;
        }
        tq_3 tq_32 = (tq_3)in_1;
        if (string.equals("base")) {
            return (Iq_1)rrxr_3.id_class((Object)tq_32, rrxr_3.Si, 0);
        }
        if (string.equals("upper_jaw")) {
            return (Iq_1)rrxr_3.id_class((Object)tq_32, rrxr_3.Si, 1);
        }
        return string.equals("lower_jaw") ? (Iq_1)rrxr_3.id_class((Object)tq_32, rrxr_3.Si, 2) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tq_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"base", "upper_jaw", "lower_jaw"};
    }
}

