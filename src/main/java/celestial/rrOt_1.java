/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.Wf_1;
import celestial.jQ_2;
import celestial.jW_2;
import celestial.jx_3;
import celestial.jz_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.ryW_2;
import java.util.Map;

public class rrOt_1
extends rrMi_1 {
    public rrOt_1() {
        super(ryW_2.id_package, "head_dragon", 0.0f);
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
        map.put(Wf_1.DRAGON, in_1);
        return jW_22;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof jQ_2)) {
            return null;
        }
        jQ_2 jQ_22 = (jQ_2)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.id_class(jQ_22, rrxr_3.sG);
        }
        return string.equals("jaw") ? (Iq_1)rrxr_3.id_class(jQ_22, rrxr_3.sb) : null;
    }

    @Override
    public In_1 id_throws() {
        return new jQ_2(0.0f);
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "jaw"};
    }
}

