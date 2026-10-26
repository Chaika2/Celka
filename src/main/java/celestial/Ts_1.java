/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.pm_3;
import celestial.rGg_1;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.ww_3;

public class Ts_1
extends pm_3<rGg_1, ww_3> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/illager/vex.png");
    private static final rqO_2 id_package = new rqO_2("textures/entity/illager/vex_charging.png");

    public Ts_1(pg_3 pg_32) {
        super(pg_32, new ww_3(), 0.3f);
    }

    @Override
    protected int id_class(rGg_1 rGg_12, rfH_2 rfH_22) {
        return 15;
    }

    @Override
    protected void id_class(rGg_1 rGg_12, Ml_1 ml_1, float f) {
        ml_1.id_class(0.4f, 0.4f, 0.4f);
    }

    @Override
    public rqO_2 id_class(rGg_1 rGg_12) {
        return rGg_12.sx() ? id_package : id_class;
    }
}

