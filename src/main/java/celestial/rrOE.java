/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.fa_3;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMf_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrOE
extends rrMi_1 {
    public rrOE() {
        super(ryW_2.id_interface, "bell", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_interface);
        if (!(jW_22 instanceof fa_3)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new fa_3(jz_32);
        }
        if (!(in_1 instanceof rrMf_1)) {
            rrbb_3.id_protected("Not a bell model: " + in_1);
            return null;
        }
        rrMf_1 rrMf_12 = (rrMf_1)in_1;
        return rrMf_12.id_class(jW_22);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMf_1)) {
            return null;
        }
        rrMf_1 rrMf_12 = (rrMf_1)in_1;
        return string.equals("body") ? rrMf_12.id_class : null;
    }

    @Override
    public In_1 id_throws() {
        return new rrMf_1();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body"};
    }
}

