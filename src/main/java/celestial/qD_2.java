/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qj_3;
import celestial.rEb_1;
import celestial.rqO_2;
import celestial.tP_2;
import celestial.wL_2;

public class qD_2
extends qj_3 {
    private static final rqO_2 id_class = new rqO_2("textures/entity/skeleton/stray.png");

    public qD_2(pg_3 pg_32) {
        super(pg_32);
        this.id_class(new tP_2<rEb_1, wL_2<rEb_1>>(this));
    }

    @Override
    public rqO_2 id_class(rEb_1 rEb_12) {
        return id_class;
    }
}

