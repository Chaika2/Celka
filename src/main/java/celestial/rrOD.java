/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qJ_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tU_2;

public class rrOD
extends rrMi_1 {
    public rrOD() {
        super(aI_2.id_strictfp, "lead_knot", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qJ_2 qJ_22 = new qJ_2(pg_32);
        if (!rrxr_3.su.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderLeashKnot.leashKnotModel");
            return null;
        }
        rrxr_3.id_class((Object)qJ_22, rrxr_3.su, (Object)in_1);
        qJ_22.id_byte = f;
        return qJ_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tU_2)) {
            return null;
        }
        tU_2 tU_22 = (tU_2)in_1;
        return string.equals("knot") ? (Iq_1)rrxr_3.sN.id_class(tU_22) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tU_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"knot"};
    }
}

