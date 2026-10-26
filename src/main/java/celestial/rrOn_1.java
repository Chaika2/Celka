/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pj_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ty_3;

public class rrOn_1
extends rrMi_1 {
    public rrOn_1() {
        super(aI_2.id_synchronized, "endermite", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pj_3 pj_32 = new pj_3(pg_32);
        pj_32.id_throws = (ty_3)in_1;
        pj_32.id_byte = f;
        return pj_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof ty_3)) {
            return null;
        }
        ty_3 ty_32 = (ty_3)in_1;
        String string2 = "body";
        if (string.startsWith(string2)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(ty_32, rrxr_3.Se);
            if (iq_1Array == null) {
                return null;
            }
            String string3 = string.substring(string2.length());
            int n = rrbb_3.id_class(string3, -1);
            return --n >= 0 && n < iq_1Array.length ? iq_1Array[n] : null;
        }
        return null;
    }

    @Override
    public In_1 id_throws() {
        return new ty_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body1", "body2", "body3", "body4"};
    }
}

