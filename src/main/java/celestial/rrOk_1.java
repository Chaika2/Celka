/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pn_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tv_3;

public class rrOk_1
extends rrMi_1 {
    public rrOk_1() {
        super(aI_2.id_finally, "chicken", 0.3f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pn_3 pn_32 = new pn_3(pg_32);
        pn_32.id_throws = (tv_3)in_1;
        pn_32.id_byte = f;
        return pn_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tv_3)) {
            return null;
        }
        tv_3 tv_32 = (tv_3)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 0);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 1);
        }
        if (string.equals("right_leg")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 2);
        }
        if (string.equals("left_leg")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 3);
        }
        if (string.equals("right_wing")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 4);
        }
        if (string.equals("left_wing")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 5);
        }
        if (string.equals("bill")) {
            return (Iq_1)rrxr_3.Sf.id_class(tv_32, 6);
        }
        return string.equals("chin") ? (Iq_1)rrxr_3.Sf.id_class(tv_32, 7) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tv_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
    }
}

