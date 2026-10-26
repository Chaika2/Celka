/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.jr_3;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrMj_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrOd_1
extends rrMi_1 {
    public rrOd_1() {
        super(ryW_2.id_break, "chest_large", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jr_3 jr_32 = jz_32.id_class(ryW_2.id_break);
        if (!(jr_32 instanceof jr_3)) {
            return null;
        }
        if (jr_32.id_byte() == null) {
            jr_32 = new jr_3(jz_32);
        }
        if (!(in_1 instanceof rrMj_1)) {
            rrbb_3.id_protected("Not a large chest model: " + in_1);
            return null;
        }
        rrMj_1 rrMj_12 = (rrMj_1)in_1;
        return rrMj_12.id_class(jr_32);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMj_1)) {
            return null;
        }
        rrMj_1 rrMj_12 = (rrMj_1)in_1;
        if (string.equals("lid_left")) {
            return rrMj_12.id_class;
        }
        if (string.equals("base_left")) {
            return rrMj_12.id_break;
        }
        if (string.equals("knob_left")) {
            return rrMj_12.id_byte;
        }
        if (string.equals("lid_right")) {
            return rrMj_12.id_protected;
        }
        if (string.equals("base_right")) {
            return rrMj_12.id_throws;
        }
        return string.equals("knob_right") ? rrMj_12.id_case : null;
    }

    @Override
    public In_1 id_throws() {
        return new rrMj_1();
    }

    @Override
    public String[] id_case() {
        return new String[]{"lid_left", "base_left", "knob_left", "lid_right", "base_right", "knob_right"};
    }
}

