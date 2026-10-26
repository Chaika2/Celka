/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TT;
import celestial.pg_3;
import celestial.qG_2;
import celestial.rGJ;
import celestial.rqO_2;
import celestial.tK_2;

public class qC_2
extends qG_2<rGJ> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/illager/pillager.png");

    public qC_2(pg_3 pg_32) {
        super(pg_32, new tK_2(0.0f, 0.0f, 64, 64), 0.5f);
        this.id_class(new TT<rGJ, tK_2<rGJ>>(this));
    }

    @Override
    public rqO_2 id_class(rGJ rGJ2) {
        return id_class;
    }
}

