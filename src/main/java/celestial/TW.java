/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Tc_1;
import celestial.iB_2;
import celestial.pg_3;
import celestial.pm_3;
import celestial.rAv_1;
import celestial.rbE_2;
import celestial.rqO_2;
import celestial.ts_3;
import celestial.wR_2;

public class TW
extends pm_3<rbE_2, wR_2<rbE_2>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/zombie_villager/zombie_villager.png");

    public TW(pg_3 pg_32, rAv_1 rAv_12) {
        super(pg_32, new wR_2(0.0f, false), 0.5f);
        this.id_class(new Tc_1(this, new wR_2(0.5f, true), new wR_2(1.0f, true)));
        this.id_class(new ts_3<rbE_2, wR_2<rbE_2>>(this, rAv_12, "zombie_villager"));
    }

    @Override
    public rqO_2 id_class(rbE_2 rbE_22) {
        return id_class;
    }

    @Override
    protected /* synthetic */ boolean id_class(iB_2 iB_22) {
        return this.id_break((rbE_2)iB_22);
    }

    @Override
    protected boolean id_break(rbE_2 rbE_22) {
        return rbE_22.sZ();
    }
}

