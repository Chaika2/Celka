/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLA;
import celestial.rLf_1;
import celestial.rLl_1;
import celestial.rLp_1;
import celestial.rOk_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xu_3;

public class rOW
extends rLA {
    public rOW(rOk_1 rOk_12, rYB rYB2) {
        super(rOk_12, rYB2);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22) {
        return this.id_byte.id_byte(rfH_22).id_class(xu_3.id_instanceof) || super.id_class(rfH_22);
    }

    @Override
    protected boolean id_class(rLp_1 rLp_12) {
        return rLp_12 != rLp_1.LAVA && rLp_12 != rLp_1.DAMAGE_FIRE && rLp_12 != rLp_1.DANGER_FIRE ? super.id_class(rLp_12) : true;
    }

    @Override
    protected rLl_1 id_class(int n) {
        this.id_int = new rLf_1();
        return new rLl_1(this.id_int, n);
    }
}

