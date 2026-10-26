/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qW_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.te_3;

public class rrOU
extends rrMi_1 {
    public rrOU() {
        super(aI_2.id_transient, "llama", 0.7f);
    }

    public rrOU(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof te_3)) {
            return null;
        }
        te_3 te_32 = (te_3)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 0);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 1);
        }
        if (string.equals("leg1")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 2);
        }
        if (string.equals("leg2")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 3);
        }
        if (string.equals("leg3")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 4);
        }
        if (string.equals("leg4")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 5);
        }
        if (string.equals("chest_right")) {
            return (Iq_1)rrxr_3.sZ.id_class(te_32, 6);
        }
        return string.equals("chest_left") ? (Iq_1)rrxr_3.sZ.id_class(te_32, 7) : null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qW_2 qW_22 = new qW_2(pg_32);
        qW_22.id_throws = (te_3)in_1;
        qW_22.id_byte = f;
        return qW_22;
    }

    @Override
    public In_1 id_throws() {
        return new te_3(0.0f);
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "chest_right", "chest_left"};
    }
}

