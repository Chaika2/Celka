/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.TP;
import celestial.aI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wT_2;

public class rrho_3
extends rrMi_1 {
    public rrho_3() {
        super(aI_2.Y, "tropical_fish_b", 0.2f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        TP tP;
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pV_2 pV_22 = pg_32.id_throws().get(aI_2.Y);
        if (!(pV_22 instanceof TP)) {
            rrbb_3.id_protected("Not a TropicalFishRenderer: " + pV_22);
            return null;
        }
        if (pV_22.id_byte() == null) {
            tP = new TP(pg_32);
            tP.id_byte = f;
            pV_22 = tP;
        }
        tP = (TP)pV_22;
        if (!rrxr_3.Gb.id_protected()) {
            rrbb_3.id_protected("Model field not found: RenderTropicalFish.modelB");
            return null;
        }
        rrxr_3.Gb.id_class(tP, in_1);
        return tP;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wT_2)) {
            return null;
        }
        wT_2 wT_22 = (wT_2)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.EL.id_class(wT_22, 0);
        }
        if (string.equals("tail")) {
            return (Iq_1)rrxr_3.EL.id_class(wT_22, 1);
        }
        if (string.equals("fin_right")) {
            return (Iq_1)rrxr_3.EL.id_class(wT_22, 2);
        }
        if (string.equals("fin_left")) {
            return (Iq_1)rrxr_3.EL.id_class(wT_22, 3);
        }
        if (string.equals("fin_top")) {
            return (Iq_1)rrxr_3.EL.id_class(wT_22, 4);
        }
        return string.equals("fin_bottom") ? (Iq_1)rrxr_3.EL.id_class(wT_22, 5) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wT_2(0.0f);
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "tail", "fin_right", "fin_left", "fin_top", "fin_bottom"};
    }
}

