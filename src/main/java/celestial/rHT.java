/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHS;
import celestial.rJO;
import celestial.rJr_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rkj_3;
import celestial.ryW_2;

public class rHT
extends rHS {
    public rHT() {
        super(ryW_2.id_class, rkj_3.id_break);
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rJO(n, rhz_32, this, this.id_break);
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.furnace");
    }
}

