/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qY_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tp_3;
import celestial.wC_2;

public class rrht_3
extends rrMi_1 {
    public rrht_3() {
        super(aI_2.q, "spider", 1.0f);
    }

    protected rrht_3(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wC_2)) {
            return null;
        }
        wC_2 wC_22 = (wC_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 0);
        }
        if (string.equals("neck")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 1);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 2);
        }
        if (string.equals("leg1")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 3);
        }
        if (string.equals("leg2")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 4);
        }
        if (string.equals("leg3")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 5);
        }
        if (string.equals("leg4")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 6);
        }
        if (string.equals("leg5")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 7);
        }
        if (string.equals("leg6")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 8);
        }
        if (string.equals("leg7")) {
            return (Iq_1)rrxr_3.Ek.id_class(wC_22, 9);
        }
        return string.equals("leg8") ? (Iq_1)rrxr_3.Ek.id_class(wC_22, 10) : null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qY_2 qY_22 = new qY_2(pg_32);
        qY_22.id_throws = (tp_3)in_1;
        qY_22.id_byte = f;
        return qY_22;
    }

    @Override
    public In_1 id_throws() {
        return new wC_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8"};
    }
}

