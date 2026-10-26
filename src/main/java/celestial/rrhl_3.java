/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.jJ_2;
import celestial.jW_2;
import celestial.jX_2;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ryW_2;

public class rrhl_3
extends rrMi_1 {
    public rrhl_3() {
        super(ryW_2.id_private, "sign", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_private);
        if (!(jW_22 instanceof jX_2)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new jX_2(jz_32);
        }
        if (!rrxr_3.GH.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntitySignRenderer.model");
            return null;
        }
        rrxr_3.id_class((Object)jW_22, rrxr_3.GH, (Object)in_1);
        return jW_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof jJ_2)) {
            return null;
        }
        jJ_2 jJ_22 = (jJ_2)in_1;
        if (string.equals("board")) {
            return (Iq_1)rrxr_3.Es.id_class(jJ_22, 0);
        }
        return string.equals("stick") ? (Iq_1)rrxr_3.Es.id_class(jJ_22, 1) : null;
    }

    @Override
    public In_1 id_throws() {
        return new jJ_2();
    }

    @Override
    public String[] id_case() {
        return new String[]{"board", "stick"};
    }
}

