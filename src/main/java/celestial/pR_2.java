/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.fZ_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rhC_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.tq_3;

public class pR_2
extends pV_2<rhC_2> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/illager/evoker_fangs.png");
    private final tq_3<rhC_2> id_throws = new tq_3();

    public pR_2(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public void id_class(rhC_2 rhC_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        float f3 = rhC_22.id_byte(f2);
        if (f3 != 0.0f) {
            float f4 = 2.0f;
            if (f3 > 0.9f) {
                f4 = (float)((double)f4 * ((1.0 - (double)f3) / (double)0.1f));
            }
            ml_1.id_class();
            ml_1.id_class(rje_3.id_protected.id_byte(90.0f - ((Float)rhC_22.id_throws[15]).floatValue()));
            ml_1.id_class(-f4, -f4, f4);
            float f5 = 0.03125f;
            ml_1.id_class(0.0, (double)-0.626f, 0.0);
            ml_1.id_class(0.5f, 0.5f, 0.5f);
            this.id_throws.id_class(rhC_22, f3, 0.0f, 0.0f, ((Float)rhC_22.id_throws[15]).floatValue(), ((Float)rhC_22.id_throws[16]).floatValue());
            Ok_1 ok_1 = hx_1.getBuffer(this.id_throws.id_class(id_class));
            this.id_throws.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
            ml_1.id_break();
            super.id_class(rhC_22, f, f2, ml_1, hx_1, n);
        }
    }

    @Override
    public rqO_2 id_class(rhC_2 rhC_22) {
        return id_class;
    }
}

