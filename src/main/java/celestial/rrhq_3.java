/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qV_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wA_2;

public class rrhq_3
extends rrMi_1 {
    public rrhq_3() {
        super(aI_2.C, "slime", 0.25f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qV_2 qV_22 = new qV_2(pg_32);
        qV_22.id_throws = (wA_2)in_1;
        qV_22.id_byte = f;
        return qV_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wA_2)) {
            return null;
        }
        wA_2 wA_22 = (wA_2)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.id_class((Object)wA_22, rrxr_3.EX, 0);
        }
        if (string.equals("left_eye")) {
            return (Iq_1)rrxr_3.id_class((Object)wA_22, rrxr_3.EX, 1);
        }
        if (string.equals("right_eye")) {
            return (Iq_1)rrxr_3.id_class((Object)wA_22, rrxr_3.EX, 2);
        }
        return string.equals("mouth") ? (Iq_1)rrxr_3.id_class((Object)wA_22, rrxr_3.EX, 3) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wA_2(16);
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "left_eye", "right_eye", "mouth"};
    }
}

