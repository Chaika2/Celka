/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TF;
import celestial.Tp_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rAv_1;
import celestial.rqO_2;
import celestial.rsq_3;
import celestial.ts_3;
import celestial.wI_2;

public class TE
extends qc_3<rsq_3, wI_2<rsq_3>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/villager/villager.png");

    public TE(pg_3 pg_32, rAv_1 rAv_12) {
        super(pg_32, new wI_2(0.0f), 0.5f);
        this.id_class(new Tp_1<rsq_3, wI_2<rsq_3>>(this));
        this.id_class(new ts_3<rsq_3, wI_2<rsq_3>>(this, rAv_12, "villager"));
        this.id_class(new TF<rsq_3, wI_2<rsq_3>>(this));
    }

    @Override
    public rqO_2 id_class(rsq_3 rsq_32) {
        return id_class;
    }

    @Override
    protected void id_class(rsq_3 rsq_32, Ml_1 ml_1, float f) {
        float f2 = 0.9375f;
        if (rsq_32.n_()) {
            f2 = (float)((double)f2 * 0.5);
            this.id_byte = 0.25f;
        } else {
            this.id_byte = 0.5f;
        }
        ml_1.id_class(f2, f2, f2);
    }
}

