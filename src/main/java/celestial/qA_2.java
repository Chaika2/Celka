/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TK;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rMo_1;
import celestial.rqO_2;
import celestial.wM_2;

public class qA_2
extends qc_3<rMo_1, wM_2<rMo_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/pig/pig.png");

    public qA_2(pg_3 pg_32) {
        super(pg_32, new wM_2(), 0.7f);
        this.id_class(new TK(this, new wM_2(0.5f), new rqO_2("textures/entity/pig/pig_saddle.png")));
    }

    @Override
    public rqO_2 id_class(rMo_1 rMo_12) {
        return id_class;
    }
}

