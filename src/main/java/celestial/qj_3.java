/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Tc_1;
import celestial.pg_3;
import celestial.pm_3;
import celestial.rEb_1;
import celestial.rqO_2;
import celestial.wL_2;

public class qj_3
extends pm_3<rEb_1, wL_2<rEb_1>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/skeleton/skeleton.png");

    public qj_3(pg_3 pg_32) {
        super(pg_32, new wL_2(), 0.5f);
        this.id_class(new Tc_1(this, new wL_2(0.5f, true), new wL_2(1.0f, true)));
    }

    @Override
    public rqO_2 id_class(rEb_1 rEb_12) {
        return id_class;
    }
}

