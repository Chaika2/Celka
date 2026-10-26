/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qc_3;
import celestial.rEO;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.tN_2;

public class pZ_2
extends qc_3<rEO, tN_2<rEO>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/blaze.png");

    public pZ_2(pg_3 pg_32) {
        super(pg_32, new tN_2(), 0.5f);
    }

    @Override
    protected int id_class(rEO rEO2, rfH_2 rfH_22) {
        return 15;
    }

    @Override
    public rqO_2 id_class(rEO rEO2) {
        return id_class;
    }
}

