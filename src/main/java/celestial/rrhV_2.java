/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.jr_3;
import celestial.jz_3;
import celestial.rrMV;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.ryW_2;

public class rrhV_2
extends rrMi_1 {
    public rrhV_2() {
        super(ryW_2.id_byte, "trapped_chest", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jr_3 jr_32 = jz_32.id_class(ryW_2.id_byte);
        if (!(jr_32 instanceof jr_3)) {
            return null;
        }
        if (jr_32.id_byte() == null) {
            jr_32 = new jr_3(jz_32);
        }
        if (!(in_1 instanceof rrMV)) {
            rrbb_3.id_protected("Not a chest model: " + in_1);
            return null;
        }
        rrMV rrMV2 = (rrMV)in_1;
        return rrMV2.id_class(jr_32);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof rrMV)) {
            return null;
        }
        rrMV rrMV2 = (rrMV)in_1;
        if (string.equals("lid")) {
            return rrMV2.id_class;
        }
        if (string.equals("base")) {
            return rrMV2.id_break;
        }
        return string.equals("knob") ? rrMV2.id_byte : null;
    }

    @Override
    public In_1 id_throws() {
        return new rrMV();
    }

    @Override
    public String[] id_case() {
        return new String[]{"lid", "base", "knob"};
    }
}

