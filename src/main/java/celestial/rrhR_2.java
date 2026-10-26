/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.Tr_1;
import celestial.aI_2;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wp_3;

public class rrhR_2
extends rrMi_1 {
    public rrhR_2() {
        super(aI_2.g, "trident", 0.0f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        Tr_1 tr_1 = new Tr_1(pg_32);
        if (!rrxr_3.Gs.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderTrident.modelTrident");
            return null;
        }
        rrxr_3.id_class((Object)tr_1, rrxr_3.Gs, (Object)in_1);
        tr_1.id_byte = f;
        return tr_1;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wp_3)) {
            return null;
        }
        wp_3 wp_32 = (wp_3)in_1;
        return string.equals("body") ? (Iq_1)rrxr_3.Em.id_class(wp_32) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wp_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body"};
    }
}

