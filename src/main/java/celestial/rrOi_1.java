/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qQ_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ti_3;

public class rrOi_1
extends rrMi_1 {
    public rrOi_1() {
        super(aI_2.id_double, "magma_cube", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qQ_2 qQ_22 = new qQ_2(pg_32);
        qQ_22.id_throws = (ti_3)in_1;
        qQ_22.id_byte = f;
        return qQ_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof ti_3)) {
            return null;
        }
        ti_3 ti_32 = (ti_3)in_1;
        if (string.equals("core")) {
            return (Iq_1)rrxr_3.id_class(ti_32, rrxr_3.sC);
        }
        String string2 = "segment";
        if (string.startsWith(string2)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(ti_32, rrxr_3.sl);
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
        return new ti_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8"};
    }
}

