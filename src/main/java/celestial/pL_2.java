/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qY_2;
import celestial.rEX;
import celestial.rqO_2;

public class pL_2
extends qY_2<rEX> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/spider/cave_spider.png");

    public pL_2(pg_3 pg_32) {
        super(pg_32);
        this.id_byte *= 0.7f;
    }

    @Override
    protected void id_class(rEX rEX2, Ml_1 ml_1, float f) {
        ml_1.id_class(0.7f, 0.7f, 0.7f);
    }

    @Override
    public rqO_2 id_class(rEX rEX2) {
        return id_class;
    }
}

