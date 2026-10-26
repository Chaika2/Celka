/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHS;
import celestial.rJK;
import celestial.rJr_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rkj_3;
import celestial.ryW_2;

public class ryE_2
extends rHS {
    public ryE_2() {
        super(ryW_2.id_try, rkj_3.id_protected);
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rJK(n, rhz_32, this, this.id_break);
    }

    @Override
    protected int id_class(rdn_3 rdn_32) {
        return super.id_class(rdn_32) / 2;
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.smoker");
    }
}

