/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qe_3;
import celestial.rrMa_1;
import celestial.rrbb_3;
import celestial.rrhr_3;
import celestial.rrxr_3;

public class rrhG_2
extends rrhr_3 {
    public rrhG_2() {
        super(aI_2.E, "tnt_minecart", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qe_3 qe_32 = new qe_3(pg_32);
        if (!rrxr_3.Gr.id_protected()) {
            rrbb_3.id_protected("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        rrxr_3.id_class((Object)qe_32, rrxr_3.Gr, (Object)in_1);
        qe_32.id_byte = f;
        return qe_32;
    }
}

