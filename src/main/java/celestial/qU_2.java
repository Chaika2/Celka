/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.TK;
import celestial.iB_2;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOk_1;
import celestial.rqO_2;
import celestial.wH_2;

public class qU_2
extends qc_3<rOk_1, wH_2<rOk_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/strider/strider.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/strider/strider_cold.png");

    public qU_2(pg_3 pg_32) {
        super(pg_32, new wH_2(), 0.5f);
        this.id_class(new TK(this, new wH_2(), new rqO_2("textures/entity/strider/strider_saddle.png")));
    }

    @Override
    protected /* synthetic */ boolean id_class(iB_2 iB_22) {
        return this.id_break((rOk_1)iB_22);
    }

    @Override
    public rqO_2 id_class(rOk_1 rOk_12) {
        return rOk_12.L() ? id_package : id_class;
    }

    @Override
    protected void id_class(rOk_1 rOk_12, Ml_1 ml_1, float f) {
        if (rOk_12.n_()) {
            ml_1.id_class(0.5f, 0.5f, 0.5f);
            this.id_byte = 0.25f;
        } else {
            this.id_byte = 0.5f;
        }
    }

    @Override
    protected boolean id_break(rOk_1 rOk_12) {
        return rOk_12.L();
    }
}

