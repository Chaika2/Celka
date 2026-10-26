/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.po_3;
import celestial.qG_2;
import celestial.rGp_1;
import celestial.rqO_2;
import celestial.tK_2;

public class pY_2<T extends rGp_1>
extends qG_2<T> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/illager/evoker.png");

    public pY_2(pg_3 pg_32) {
        super(pg_32, new tK_2(0.0f, 0.0f, 64, 64), 0.5f);
        this.id_class(new po_3(this, this));
    }

    @Override
    public rqO_2 id_class(T t) {
        return id_class;
    }
}

