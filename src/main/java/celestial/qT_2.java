/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOV;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.wQ_2;

public class qT_2
extends qc_3<rOV, wQ_2<rOV>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/fish/salmon.png");

    public qT_2(pg_3 pg_32) {
        super(pg_32, new wQ_2(), 0.4f);
    }

    @Override
    public rqO_2 id_class(rOV rOV2) {
        return id_class;
    }

    @Override
    protected void id_class(rOV rOV2, Ml_1 ml_1, float f, float f2, float f3) {
        super.id_class(rOV2, ml_1, f, f2, f3);
        float f4 = 1.0f;
        float f5 = 1.0f;
        if (!rOV2.rT()) {
            f4 = 1.3f;
            f5 = 1.7f;
        }
        float f6 = f4 * 4.3f * rfU_2.id_class(f5 * 0.6f * f);
        ml_1.id_class(rje_3.id_protected.id_byte(f6));
        ml_1.id_class(0.0, 0.0, (double)-0.4f);
        if (!rOV2.rT()) {
            ml_1.id_class((double)0.2f, (double)0.1f, 0.0);
            ml_1.id_class(rje_3.id_case.id_byte(90.0f));
        }
    }
}

