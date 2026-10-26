/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wn_3;

public class rrhT_2
extends rrMi_1 {
    public rrhT_2() {
        super(aI_2.H, "snow_golem", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qg_3 qg_32 = new qg_3(pg_32);
        qg_32.id_throws = (wn_3)in_1;
        qg_32.id_byte = f;
        return qg_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wn_3)) {
            return null;
        }
        wn_3 wn_32 = (wn_3)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.Ex.id_class(wn_32, 0);
        }
        if (string.equals("body_bottom")) {
            return (Iq_1)rrxr_3.Ex.id_class(wn_32, 1);
        }
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.Ex.id_class(wn_32, 2);
        }
        if (string.equals("right_hand")) {
            return (Iq_1)rrxr_3.Ex.id_class(wn_32, 3);
        }
        return string.equals("left_hand") ? (Iq_1)rrxr_3.Ex.id_class(wn_32, 4) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wn_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
    }
}

