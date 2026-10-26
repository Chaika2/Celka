/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.jW_2;
import celestial.jh_3;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ryW_2;
import celestial.wv_3;

public class rrhn_3
extends rrMi_1 {
    public rrhn_3() {
        super(ryW_2.id_return, "shulker_box", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_return);
        if (!(jW_22 instanceof jh_3)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new jh_3((wv_3)in_1, jz_32);
        }
        if (!rrxr_3.GC.id_protected()) {
            rrbb_3.id_protected("Field not found: TileEntityShulkerBoxRenderer.model");
            return null;
        }
        rrxr_3.id_class((Object)jW_22, rrxr_3.GC, (Object)in_1);
        return jW_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wv_3)) {
            return null;
        }
        wv_3 wv_32 = (wv_3)in_1;
        if (string.equals("base")) {
            return (Iq_1)rrxr_3.Er.id_class(wv_32, 0);
        }
        if (string.equals("lid")) {
            return (Iq_1)rrxr_3.Er.id_class(wv_32, 1);
        }
        return string.equals("head") ? (Iq_1)rrxr_3.Er.id_class(wv_32, 2) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wv_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"base", "lid", "head"};
    }
}

