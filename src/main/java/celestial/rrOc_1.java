/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.py_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrXO;
import celestial.tn_3;
import java.util.Iterator;

public class rrOc_1
extends rrMi_1 {
    public rrOc_1() {
        super(aI_2.id_final, "dolphin", 0.7f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        py_3 py_32 = new py_3(pg_32);
        py_32.id_throws = (tn_3)in_1;
        py_32.id_byte = f;
        return py_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tn_3)) {
            return null;
        }
        tn_3 tn_32 = (tn_3)in_1;
        Iterator<Iq_1> iterator = tn_32.id_class().iterator();
        Iq_1 iq_1 = rrXO.id_class(iterator, 0);
        if (iq_1 == null) {
            return null;
        }
        if (string.equals("body")) {
            return iq_1;
        }
        if (string.equals("back_fin")) {
            return iq_1.id_class(0);
        }
        if (string.equals("left_fin")) {
            return iq_1.id_class(1);
        }
        if (string.equals("right_fin")) {
            return iq_1.id_class(2);
        }
        if (string.equals("tail")) {
            return iq_1.id_class(3);
        }
        if (string.equals("tail_fin")) {
            return iq_1.id_class(3).id_class(0);
        }
        return string.equals("head") ? iq_1.id_class(4) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tn_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "back_fin", "left_fin", "right_fin", "tail", "tail_fin", "head"};
    }
}

