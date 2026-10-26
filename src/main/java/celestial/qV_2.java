/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Te_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rGA;
import celestial.rfU_2;
import celestial.rqO_2;
import celestial.wA_2;

public class qV_2
extends qc_3<rGA, wA_2<rGA>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/slime/slime.png");

    public qV_2(pg_3 pg_32) {
        super(pg_32, new wA_2(16), 0.25f);
        this.id_class(new Te_1<rGA>(this));
    }

    @Override
    protected void id_class(rGA rGA2, Ml_1 ml_1, float f) {
        float f2 = 0.999f;
        ml_1.id_class(0.999f, 0.999f, 0.999f);
        ml_1.id_class(0.0, (double)0.001f, 0.0);
        float f3 = rGA2.sk();
        float f4 = rfU_2.id_catch(f, rGA2.id_protected, rGA2.id_break) / (f3 * 0.5f + 1.0f);
        float f5 = 1.0f / (f4 + 1.0f);
        ml_1.id_class(f5 * f3, 1.0f / f5 * f3, f5 * f3);
    }

    @Override
    public rqO_2 id_class(rGA rGA2) {
        return id_class;
    }

    @Override
    public void id_class(rGA rGA2, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        this.id_byte = 0.25f * (float)rGA2.sk();
        super.id_class(rGA2, f, f2, ml_1, hx_1, n);
    }
}

