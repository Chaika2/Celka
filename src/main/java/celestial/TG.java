/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Tb_1;
import celestial.pg_3;
import celestial.qG_2;
import celestial.rGD;
import celestial.rqO_2;
import celestial.tK_2;

public class TG
extends qG_2<rGD> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/illager/vindicator.png");

    public TG(pg_3 pg_32) {
        super(pg_32, new tK_2(0.0f, 0.0f, 64, 64), 0.5f);
        this.id_class(new Tb_1(this, this));
    }

    @Override
    public rqO_2 id_class(rGD rGD2) {
        return id_class;
    }
}

