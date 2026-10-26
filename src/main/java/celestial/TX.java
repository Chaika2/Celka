/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qj_3;
import celestial.rEb_1;
import celestial.rqO_2;

public class TX
extends qj_3 {
    private static final rqO_2 id_class = new rqO_2("textures/entity/skeleton/wither_skeleton.png");

    public TX(pg_3 pg_32) {
        super(pg_32);
    }

    @Override
    public rqO_2 id_class(rEb_1 rEb_12) {
        return id_class;
    }

    @Override
    protected void id_class(rEb_1 rEb_12, Ml_1 ml_1, float f) {
        ml_1.id_class(1.2f, 1.2f, 1.2f);
    }
}

