/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOI;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tF_2;

public class pC_2
extends qc_3<rOI, tF_2<rOI>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/fish/cod.png");

    public pC_2(pg_3 pg_32) {
        super(pg_32, new tF_2(), 0.3f);
    }

    @Override
    public rqO_2 id_class(rOI rOI2) {
        return id_class;
    }

    @Override
    protected void id_class(rOI rOI2, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rOI2, ml_1, f, f2, f3);
        float f4 = 4.3f * rfU_2.id_class(0.6f * f);
        ml_1.id_class(rje_3.id_protected.id_byte(f4));
        if (!rOI2.rT()) {
            ml_1.id_class((double)0.1f, (double)0.1f, (double)-0.1f);
            ml_1.id_class(rje_3.id_case.id_byte(90.0f));
        }
    }
}

