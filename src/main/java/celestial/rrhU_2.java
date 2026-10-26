/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.TE;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rAv_1;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wI_2;

public class rrhU_2
extends rrMi_1 {
    public rrhU_2() {
        super(aI_2.D, "villager", 0.5f);
    }

    protected rrhU_2(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wI_2)) {
            return null;
        }
        wI_2 wI_22 = (wI_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 0);
        }
        if (string.equals("headwear")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 1);
        }
        if (string.equals("headwear2")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 2);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 3);
        }
        if (string.equals("bodywear")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 4);
        }
        if (string.equals("arms")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 5);
        }
        if (string.equals("right_leg")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 6);
        }
        if (string.equals("left_leg")) {
            return (Iq_1)rrxr_3.Ep.id_class(wI_22, 7);
        }
        return string.equals("nose") ? (Iq_1)rrxr_3.Ep.id_class(wI_22, 8) : null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        rAv_1 rAv_12 = (rAv_1)QY.id_instanceof().F();
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TE tE = new TE(pg_32, rAv_12);
        tE.id_throws = (wI_2)in_1;
        tE.id_byte = f;
        return tE;
    }

    @Override
    public In_1 id_throws() {
        return new wI_2(0.0f);
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "headwear", "headwear2", "body", "bodywear", "arms", "right_leg", "left_leg", "nose"};
    }
}

