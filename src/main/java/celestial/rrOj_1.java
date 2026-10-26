/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.Wf_1;
import celestial.jW_2;
import celestial.jx_3;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ryW_2;
import celestial.tg_3;
import java.util.Map;

public class rrOj_1
extends rrMi_1 {
    public rrOj_1() {
        super(ryW_2.id_package, "head_zombie", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        Map map;
        jz_3 jz_32 = jz_3.id_break;
        jW_2 jW_22 = jz_32.id_class(ryW_2.id_package);
        if (!(jW_22 instanceof jx_3)) {
            return null;
        }
        if (jW_22.id_byte() == null) {
            jW_22 = new jx_3(jz_32);
        }
        if ((map = (Map)rrxr_3.Gp.id_byte()) == null) {
            rrbb_3.id_protected("Field not found: TileEntitySkullRenderer.MODELS");
            return null;
        }
        map.put(Wf_1.ZOMBIE, in_1);
        return jW_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tg_3)) {
            return null;
        }
        tg_3 tg_32 = (tg_3)in_1;
        return string.equals("head") ? (Iq_1)rrxr_3.SZ.id_class(tg_32) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tg_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head"};
    }
}

