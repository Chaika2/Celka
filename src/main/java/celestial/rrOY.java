/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.aI_2;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tK_2;

public abstract class rrOY
extends rrMi_1 {
    public rrOY(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    public rrOY(aI_2 aI_22, String string, float f, String[] stringArray) {
        super(aI_22, string, f, stringArray);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        Iq_1 iq_1;
        if (!(in_1 instanceof tK_2)) {
            return null;
        }
        tK_2 tK_22 = (tK_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 0);
        }
        if (string.equals("hat")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 1);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 2);
        }
        if (string.equals("arms")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 3);
        }
        if (string.equals("right_leg")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 4);
        }
        if (string.equals("left_leg")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 5);
        }
        if (string.equals("nose") && (iq_1 = (Iq_1)rrxr_3.sx.id_class(tK_22, 0)) != null) {
            return iq_1.id_class(0);
        }
        if (string.equals("right_arm")) {
            return (Iq_1)rrxr_3.sx.id_class(tK_22, 6);
        }
        return string.equals("left_arm") ? (Iq_1)rrxr_3.sx.id_class(tK_22, 7) : null;
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "hat", "body", "arms", "right_leg", "left_leg", "nose", "right_arm", "left_arm"};
    }
}

