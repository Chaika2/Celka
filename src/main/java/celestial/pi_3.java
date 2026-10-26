/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rEy_1;
import celestial.rqO_2;
import celestial.tw_3;

public class pi_3
extends qc_3<rEy_1, tw_3<rEy_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/ghast/ghast.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/ghast/ghast_shooting.png");

    public pi_3(pg_3 pg_32) {
        super(pg_32, new tw_3(), 1.5f);
    }

    @Override
    public rqO_2 id_class(rEy_1 rEy_12) {
        return rEy_12.id_throws() ? id_package : id_class;
    }

    @Override
    protected void id_class(rEy_1 rEy_12, Ml_1 ml_1, float f) {
        float f2 = 1.0f;
        float f3 = 4.5f;
        float f4 = 4.5f;
        ml_1.id_class(4.5f, 4.5f, 4.5f);
    }
}

