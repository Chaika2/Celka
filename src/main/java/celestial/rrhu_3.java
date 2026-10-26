/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.aI_2;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wk_3;

public abstract class rrhu_3
extends rrMi_1 {
    public rrhu_3(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wk_3)) {
            return null;
        }
        wk_3 wk_32 = (wk_3)in_1;
        if (string.equals("head")) {
            return (Iq_1)rrxr_3.sY.id_class(wk_32, 0);
        }
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sY.id_class(wk_32, 1);
        }
        if (string.equals("leg1")) {
            return (Iq_1)rrxr_3.sY.id_class(wk_32, 2);
        }
        if (string.equals("leg2")) {
            return (Iq_1)rrxr_3.sY.id_class(wk_32, 3);
        }
        if (string.equals("leg3")) {
            return (Iq_1)rrxr_3.sY.id_class(wk_32, 4);
        }
        return string.equals("leg4") ? (Iq_1)rrxr_3.sY.id_class(wk_32, 5) : null;
    }

    @Override
    public String[] id_case() {
        return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4"};
    }
}

