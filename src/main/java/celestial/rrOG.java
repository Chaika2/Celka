/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.aI_2;
import celestial.rrMi_1;
import celestial.tW_2;

public abstract class rrOG
extends rrMi_1 {
    public rrOG(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tW_2)) {
            return null;
        }
        tW_2 tW_22 = (tW_2)in_1;
        if (string.equals("head")) {
            return tW_22.id_class;
        }
        if (string.equals("headwear")) {
            return tW_22.id_break;
        }
        if (string.equals("body")) {
            return tW_22.id_byte;
        }
        if (string.equals("left_arm")) {
            return tW_22.id_throws;
        }
        if (string.equals("right_arm")) {
            return tW_22.id_protected;
        }
        if (string.equals("left_leg")) {
            return tW_22.id_catch;
        }
        return string.equals("right_leg") ? tW_22.id_case : null;
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg"};
    }
}

