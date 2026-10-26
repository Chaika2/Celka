/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qI_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wv_3;

public class rrhA_2
extends rrMi_1 {
    public rrhA_2() {
        super(aI_2.v, "shulker", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qI_2 qI_22 = new qI_2(pg_32);
        qI_22.id_throws = (wv_3)in_1;
        qI_22.id_byte = f;
        return qI_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wv_3)) {
            return null;
        }
        wv_3 wv_32 = (wv_3)in_1;
        if (string.equals("base")) {
            return (Iq_1)rrxr_3.Er.id_class(wv_32, 0);
        }
        if (string.equals("lid")) {
            return (Iq_1)rrxr_3.Er.id_class(wv_32, 1);
        }
        return string.equals("head") ? (Iq_1)rrxr_3.Er.id_class(wv_32, 2) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wv_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"base", "lid", "head"};
    }
}

