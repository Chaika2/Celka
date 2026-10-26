/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pQ_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrOG;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tJ_2;
import celestial.tx_3;

public class rrOr_1
extends rrOG {
    public rrOr_1() {
        super(aI_2.id_break, "armor_stand", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pQ_2 pQ_22 = new pQ_2(pg_32);
        pQ_22.id_throws = (tJ_2)in_1;
        pQ_22.id_byte = f;
        return pQ_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tx_3)) {
            return null;
        }
        tx_3 tx_32 = (tx_3)in_1;
        if (string.equals("right")) {
            return (Iq_1)rrxr_3.id_class((Object)tx_32, rrxr_3.SF, 0);
        }
        if (string.equals("left")) {
            return (Iq_1)rrxr_3.id_class((Object)tx_32, rrxr_3.SF, 1);
        }
        if (string.equals("waist")) {
            return (Iq_1)rrxr_3.id_class((Object)tx_32, rrxr_3.SF, 2);
        }
        return string.equals("base") ? (Iq_1)rrxr_3.id_class((Object)tx_32, rrxr_3.SF, 3) : super.id_class((In_1)tx_32, string);
    }

    @Override
    public In_1 id_throws() {
        return new tx_3();
    }

    @Override
    public String[] id_case() {
        Object[] objectArray = super.id_case();
        return (String[])rrbb_3.id_class(objectArray, (Object[])new String[]{"right", "left", "waist", "base"});
    }
}

