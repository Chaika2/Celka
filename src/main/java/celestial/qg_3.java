/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ta_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOX;
import celestial.rqO_2;
import celestial.wn_3;

public class qg_3
extends qc_3<rOX, wn_3<rOX>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/snow_golem.png");

    public qg_3(pg_3 pg_32) {
        super(pg_32, new wn_3(), 0.5f);
        this.id_class(new Ta_1(this));
    }

    @Override
    public rqO_2 id_class(rOX rOX2) {
        return id_class;
    }
}

