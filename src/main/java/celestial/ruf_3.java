/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.rmb_3;
import celestial.ruu_3;

public class ruf_3
implements rmb_3<rLx_1> {
    @Override
    public rLx_1 id_class(rLx_1 rLx_12) {
        return rLx_12;
    }

    @Override
    public void id_class(ruu_3 ruu_32, rLx_1 rLx_12) {
        ruu_32.id_protected(rVL.id_switch.id_class(rLx_12.id_protected()));
        rLx_12.id_class(ruu_32);
    }

    @Override
    public rLx_1 id_class(ruu_3 ruu_32) {
        return this.id_class(ruu_32, (rLz_1)rVL.id_switch.id_class(ruu_32.id_case()));
    }

    private <T extends rLx_1> T id_class(ruu_3 ruu_32, rLz_1<T> rLz_12) {
        return rLz_12.id_case().id_break(rLz_12, ruu_32);
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

