/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qT_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wQ_2;

public class rrhv_3
extends rrMi_1 {
    public rrhv_3() {
        super(aI_2.m, "salmon", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qT_2 qT_22 = new qT_2(pg_32);
        qT_22.id_throws = (wQ_2)in_1;
        qT_22.id_byte = f;
        return qT_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        Iq_1 iq_1;
        if (!(in_1 instanceof wQ_2)) {
            return null;
        }
        wQ_2 wQ_22 = (wQ_2)in_1;
        if (string.equals("body_front")) {
            return (Iq_1)rrxr_3.sa.id_class(wQ_22, 0);
        }
        if (string.equals("body_back")) {
            return (Iq_1)rrxr_3.sa.id_class(wQ_22, 1);
        }
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.sa.id_class(wQ_22, 2);
        }
        if (string.equals("fin_back_1") && (iq_1 = (Iq_1)rrxr_3.sa.id_class(wQ_22, 0)) != null) {
            return iq_1.id_class(0);
        }
        if (string.equals("fin_back_2") && (iq_1 = (Iq_1)rrxr_3.sa.id_class(wQ_22, 1)) != null) {
            return iq_1.id_class(1);
        }
        if (string.equals("tail") && (iq_1 = (Iq_1)rrxr_3.sa.id_class(wQ_22, 1)) != null) {
            return iq_1.id_class(0);
        }
        if (string.equals("fin_right")) {
            return (Iq_1)rrxr_3.sa.id_class(wQ_22, 3);
        }
        return string.equals("fin_left") ? (Iq_1)rrxr_3.sa.id_class(wQ_22, 4) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wQ_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body_front", "body_back", "head", "fin_back_1", "fin_back_2", "tail", "fin_right", "fin_left"};
    }
}

