/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qO_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tD_2;

public class rrOK
extends rrMi_1 {
    public rrOK() {
        super(aI_2.id_import, "iron_golem", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qO_2 qO_22 = new qO_2(pg_32);
        qO_22.id_throws = (tD_2)in_1;
        qO_22.id_byte = f;
        return qO_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tD_2)) {
            return null;
        }
        tD_2 tD_22 = (tD_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.sk.id_class(tD_22, 0);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sk.id_class(tD_22, 1);
        }
        if (string.equals("right_arm")) {
            return (Iq_1)rrxr_3.sk.id_class(tD_22, 2);
        }
        if (string.equals("left_arm")) {
            return (Iq_1)rrxr_3.sk.id_class(tD_22, 3);
        }
        if (string.equals("left_leg")) {
            return (Iq_1)rrxr_3.sk.id_class(tD_22, 4);
        }
        return string.equals("right_leg") ? (Iq_1)rrxr_3.sk.id_class(tD_22, 5) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tD_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
    }
}

