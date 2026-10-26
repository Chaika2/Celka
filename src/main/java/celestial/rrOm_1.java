/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pI_2;
import celestial.pg_3;
import celestial.pw_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;

public class rrOm_1
extends rrMi_1 {
    public rrOm_1() {
        super(aI_2.id_this, "dragon", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pw_3 pw_32 = new pw_3(pg_32);
        if (!rrxr_3.Sb.id_protected()) {
            rrbb_3.id_protected("Field not found: EnderDragonRenderer.model");
            return null;
        }
        rrxr_3.id_class((Object)pw_32, rrxr_3.Sb, (Object)in_1);
        pw_32.id_byte = f;
        return pw_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof pI_2)) {
            return null;
        }
        pI_2 pI_22 = (pI_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 0);
        }
        if (string.equals("spine")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 1);
        }
        if (string.equals("jaw")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 2);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 3);
        }
        if (string.equals("left_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 4);
        }
        if (string.equals("left_wing_tip")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 5);
        }
        if (string.equals("front_left_leg")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 6);
        }
        if (string.equals("front_left_shin")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 7);
        }
        if (string.equals("front_left_foot")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 8);
        }
        if (string.equals("back_left_leg")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 9);
        }
        if (string.equals("back_left_shin")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 10);
        }
        if (string.equals("back_left_foot")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 11);
        }
        if (string.equals("right_wing")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 12);
        }
        if (string.equals("right_wing_tip")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 13);
        }
        if (string.equals("front_right_leg")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 14);
        }
        if (string.equals("front_right_shin")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 15);
        }
        if (string.equals("front_right_foot")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 16);
        }
        if (string.equals("back_right_leg")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 17);
        }
        if (string.equals("back_right_shin")) {
            return (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 18);
        }
        return string.equals("back_right_foot") ? (Iq_1)rrxr_3.id_class((Object)pI_22, rrxr_3.So, 19) : null;
    }

    @Override
    public In_1 id_throws() {
        return new pI_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "spine", "jaw", "body", "left_wing", "left_wing_tip", "front_left_leg", "front_left_shin", "front_left_foot", "back_left_leg", "back_left_shin", "back_left_foot", "right_wing", "right_wing_tip", "front_right_leg", "front_right_shin", "front_right_foot", "back_right_leg", "back_right_shin", "back_right_foot"};
    }
}

