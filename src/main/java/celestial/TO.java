/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rGi_1;
import celestial.rqO_2;
import celestial.tE_2;
import celestial.wf_3;

public class TO
extends qc_3<rGi_1, wf_3<rGi_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/witch.png");

    public TO(pg_3 pg_32) {
        super(pg_32, new wf_3(0.0f), 0.5f);
        this.id_class(new tE_2<rGi_1>(this));
    }

    @Override
    public rqO_2 id_class(rGi_1 rGi_12) {
        return id_class;
    }

    @Override
    protected void id_class(rGi_1 rGi_12, Ml_1 ml_1, float f) {
        float f2 = 0.9375f;
        ml_1.id_class(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    public void id_class(rGi_1 rGi_12, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ((wf_3)this.id_throws).id_break(!rGi_12.ss().id_class());
        super.id_class(rGi_12, f, f2, ml_1, hx_1, n);
    }
}

