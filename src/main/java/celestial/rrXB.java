/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.TJ;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tt_3;

public class rrXB
extends rrMi_1 {
    public rrXB() {
        super(aI_2.rP, "wither_skull", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        TJ tJ = new TJ(pg_32);
        if (!rrxr_3.GO.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderWitherSkull_model");
            return null;
        }
        rrxr_3.id_class((Object)tJ, rrxr_3.GO, (Object)in_1);
        tJ.id_byte = f;
        return tJ;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tt_3)) {
            return null;
        }
        tt_3 tt_32 = (tt_3)in_1;
        return string.equals("head") ? (Iq_1)rrxr_3.EG.id_class(tt_32) : null;
    }

    @Override
    public In_1 id_throws() {
        return new tt_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"head"};
    }
}

