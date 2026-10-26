/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.fD_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrMw_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrOP
extends rrMi_1 {
    public rrOP() {
        super(ryW_2.id_super, "banner", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_super);
        if (!(jW_22 instanceof fD_2)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new fD_2(jz_32);
        }
        if (!(in_1 instanceof rrMw_1)) {
            rrbb_3.id_protected("Not a banner model: " + in_1);
            return null;
        }
        rrMw_1 rrMw_12 = (rrMw_1)in_1;
        return rrMw_12.id_class(jW_22);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMw_1)) {
            return null;
        }
        rrMw_1 rrMw_12 = (rrMw_1)in_1;
        if (string.equals("slate")) {
            return rrMw_12.id_class;
        }
        if (string.equals("stand")) {
            return rrMw_12.id_break;
        }
        return string.equals("top") ? rrMw_12.id_byte : null;
    }

    @Override
    public In_1 id_throws() {
        return new rrMw_1();
    }

    @Override
    public String[] id_case() {
        return new String[]{"slate", "stand", "top"};
    }
}

