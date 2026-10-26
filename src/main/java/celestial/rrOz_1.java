/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.jP_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMg_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrOz_1
extends rrMi_1 {
    public rrOz_1() {
        super(ryW_2.id_goto, "conduit", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_goto);
        if (!(jW_22 instanceof jP_2)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new jP_2(jz_32);
        }
        if (!(in_1 instanceof rrMg_1)) {
            rrbb_3.id_protected("Not a conduit model: " + in_1);
            return null;
        }
        rrMg_1 rrMg_12 = (rrMg_1)in_1;
        return rrMg_12.id_class(jW_22);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMg_1)) {
            return null;
        }
        rrMg_1 rrMg_12 = (rrMg_1)in_1;
        if (string.equals("eye")) {
            return rrMg_12.id_class;
        }
        if (string.equals("wind")) {
            return rrMg_12.id_break;
        }
        if (string.equals("base")) {
            return rrMg_12.id_byte;
        }
        return string.equals("cage") ? rrMg_12.id_protected : null;
    }

    @Override
    public In_1 id_throws() {
        return new rrMg_1();
    }

    @Override
    public String[] id_case() {
        return new String[]{"eye", "wind", "base", "cage"};
    }
}

