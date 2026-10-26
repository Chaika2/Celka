/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ta_3;

public class rrOa_1
extends rrMi_1 {
    public rrOa_1() {
        super(aI_2.id_for, "llama_spit", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qz_3 qz_32 = new qz_3(pg_32);
        if (!rrxr_3.EK.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderLlamaSpit.model");
            return null;
        }
        rrxr_3.id_class((Object)qz_32, rrxr_3.EK, (Object)in_1);
        qz_32.id_byte = f;
        return qz_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof ta_3)) {
            return null;
        }
        ta_3 ta_32 = (ta_3)in_1;
        return string.equals("body") ? (Iq_1)rrxr_3.sF.id_class(ta_32) : null;
    }

    @Override
    public In_1 id_throws() {
        return new ta_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body"};
    }
}

