/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pZ_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tN_2;

public class rrOb_1
extends rrMi_1 {
    public rrOb_1() {
        super(aI_2.id_case, "blaze", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pZ_2 pZ_22 = new pZ_2(pg_32);
        pZ_22.id_throws = (tN_2)in_1;
        pZ_22.id_byte = f;
        return pZ_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tN_2)) {
            return null;
        }
        tN_2 tN_22 = (tN_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.id_class(tN_22, rrxr_3.SH);
        }
        String string2 = "stick";
        if (string.startsWith(string2)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(tN_22, rrxr_3.Sy);
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
        return new tN_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12"};
    }
}

