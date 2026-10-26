/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.Th_1;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wj_3;

public class rrXr_1
extends rrMi_1 {
    public rrXr_1() {
        super(aI_2.i, "wither", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Th_1 th_1 = new Th_1(pg_32);
        th_1.id_throws = (wj_3)in_1;
        th_1.id_byte = f;
        return th_1;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wj_3)) {
            return null;
        }
        wj_3 wj_32 = (wj_3)in_1;
        String string2 = "body";
        if (string.startsWith(string2)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(wj_32, rrxr_3.Ew);
            if (iq_1Array == null) {
                return null;
            }
            String string3 = string.substring(string2.length());
            int n = rrbb_3.id_class(string3, -1);
            return --n >= 0 && n < iq_1Array.length ? iq_1Array[n] : null;
        }
        String string4 = "head";
        if (string.startsWith(string4)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(wj_32, rrxr_3.EI);
            if (iq_1Array == null) {
                return null;
            }
            String string5 = string.substring(string4.length());
            int n = rrbb_3.id_class(string5, -1);
            return --n >= 0 && n < iq_1Array.length ? iq_1Array[n] : null;
        }
        return null;
    }

    @Override
    public In_1 id_throws() {
        return new wj_3(0.0f);
    }

    @Override
    public String[] id_case() {
        return new String[]{"body1", "body2", "body3", "head1", "head2", "head3"};
    }
}

