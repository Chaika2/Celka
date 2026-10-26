/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TF;
import celestial.Tp_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rqO_2;
import celestial.rsU_2;
import celestial.wI_2;

public class TM
extends qc_3<rsU_2, wI_2<rsU_2>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/wandering_trader.png");

    public TM(pg_3 pg_32) {
        super(pg_32, new wI_2(0.0f), 0.5f);
        this.id_class(new Tp_1<rsU_2, wI_2<rsU_2>>(this));
        this.id_class(new TF<rsU_2, wI_2<rsU_2>>(this));
    }

    @Override
    public rqO_2 id_class(rsU_2 rsU_22) {
        return id_class;
    }

    @Override
    protected void id_class(rsU_2 rsU_22, Ml_1 ml_1, float f) {
        float f2 = 0.9375f;
        ml_1.id_class(0.9375f, 0.9375f, 0.9375f);
    }
}

