/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pc_3;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.td_3;

public class rrOB
extends rrMi_1 {
    public rrOB() {
        super(aI_2.id_protected, "bat", 0.25f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pc_3 pc_32 = new pc_3(pg_32);
        pc_32.id_throws = (td_3)in_1;
        pc_32.id_byte = f;
        return pc_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof td_3)) {
            return null;
        }
        td_3 td_32 = (td_3)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.id_class((Object)td_32, rrxr_3.SA, 0);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.id_class((Object)td_32, rrxr_3.SA, 1);
        }
        if (string.equals("right_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)td_32, rrxr_3.SA, 2);
        }
        if (string.equals("left_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)td_32, rrxr_3.SA, 3);
        }
        if (string.equals("outer_right_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)td_32, rrxr_3.SA, 4);
        }
        return string.equals("outer_left_wing") ? (Iq_1)rrxr_3.id_class((Object)td_32, rrxr_3.SA, 5) : null;
    }

    @Override
    public In_1 id_throws() {
        return new td_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
    }
}

