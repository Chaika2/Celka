/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qf_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wF_2;

public class rrhH_2
extends rrMi_1 {
    public rrhH_2() {
        super(aI_2.L, "silverfish", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qf_3 qf_32 = new qf_3(pg_32);
        qf_32.id_throws = (wF_2)in_1;
        qf_32.id_byte = f;
        return qf_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wF_2)) {
            return null;
        }
        wF_2 wF_22 = (wF_2)in_1;
        String string2 = "body";
        if (string.startsWith(string2)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(wF_22, rrxr_3.EM);
            if (iq_1Array == null) {
                return null;
            }
            String string3 = string.substring(string2.length());
            int n = rrbb_3.id_class(string3, -1);
            return --n >= 0 && n < iq_1Array.length ? iq_1Array[n] : null;
        }
        String string4 = "wing";
        if (string.startsWith(string4)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(wF_22, rrxr_3.EO);
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
        return new wF_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3"};
    }
}

