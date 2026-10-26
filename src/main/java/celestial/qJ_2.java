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
import celestial.rqO_2;
import celestial.rsM_2;
import celestial.tU_2;

public class qJ_2
extends pV_2<rsM_2> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/lead_knot.png");
    private final tU_2<rsM_2> id_throws = new tU_2();

    public qJ_2(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public void id_class(rsM_2 rsM_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        ml_1.id_class();
        ml_1.id_class(-1.0f, -1.0f, 1.0f);
        this.id_throws.id_class(rsM_22, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        Ok_1 ok_1 = hx_1.getBuffer(this.id_throws.id_class(id_class));
        this.id_throws.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
        ml_1.id_break();
        super.id_class(rsM_22, f, f2, ml_1, hx_1, n);
    }

    @Override
    public rqO_2 id_class(rsM_2 rsM_22) {
        return id_class;
    }
}

