/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qF_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.ws_3;

public class rrhX_2
extends rrMi_1 {
    public rrhX_2() {
        super(aI_2.X, "parrot", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qF_2 qF_22 = new qF_2(pg_32);
        qF_22.id_throws = (ws_3)in_1;
        qF_22.id_byte = f;
        return qF_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof ws_3)) {
            return null;
        }
        ws_3 ws_32 = (ws_3)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 0);
        }
        if (string.equals("tail")) {
            return (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 1);
        }
        if (string.equals("left_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 2);
        }
        if (string.equals("right_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 3);
        }
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 4);
        }
        if (string.equals("left_leg")) {
            return (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 9);
        }
        return string.equals("right_leg") ? (Iq_1)rrxr_3.id_class((Object)ws_32, rrxr_3.st, 10) : null;
    }

    @Override
    public In_1 id_throws() {
        return new ws_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "tail", "left_wing", "right_wing", "head", "left_leg", "right_leg"};
    }
}

