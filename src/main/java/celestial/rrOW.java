/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pC_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tF_2;

public class rrOW
extends rrMi_1 {
    public rrOW() {
        super(aI_2.id_extends, "cod", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pC_2 pC_22 = new pC_2(pg_32);
        pC_22.id_throws = (tF_2)in_1;
        pC_22.id_byte = f;
        return pC_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tF_2)) {
            return null;
        }
        tF_2 tF_22 = (tF_2)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.SV.id_class(tF_22, 0);
        }
        if (string.equals("fin_back")) {
            return (Iq_1)rrxr_3.SV.id_class(tF_22, 1);
        }
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.SV.id_class(tF_22, 2);
        }
        if (string.equals("nose")) {
            return (Iq_1)rrxr_3.SV.id_class(tF_22, 3);
        }
        if (string.equals("fin_right")) {
            return (Iq_1)rrxr_3.SV.id_class(tF_22, 4);
        }
        if (string.equals("fin_left")) {
            return (Iq_1)rrxr_3.SV.id_class(tF_22, 5);
        }
        return string.equals("tail") ? (Iq_1)rrxr_3.SV.id_class(tF_22, 6) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tF_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "fin_back", "head", "nose", "fin_right", "fin_left", "tail"};
    }
}

