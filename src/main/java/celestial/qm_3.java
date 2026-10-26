/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.pg_3;
import celestial.qc_3;
import celestial.rMA;
import celestial.rqO_2;
import celestial.wB_2;

public class qm_3
extends qc_3<rMA, wB_2<rMA>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/cat/ocelot.png");

    public qm_3(pg_3 pg_32) {
        super(pg_32, new wB_2(0.0f), 0.4f);
    }

    @Override
    public rqO_2 id_class(rMA rMA2) {
        return id_class;
    }
}

