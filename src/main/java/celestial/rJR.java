/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJZ;
import celestial.rJm_1;
import celestial.rJr_1;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rhz_3;

public final class rJR
implements rJZ {
    private final rgP_2 id_class;
    private final rJm_1 id_break;

    public rJR(rJm_1 rJm_12, rgP_2 rgP_22) {
        this.id_break = rJm_12;
        this.id_class = rgP_22;
    }

    @Override
    public rgP_2 L_() {
        return this.id_class;
    }

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        return this.id_break.createMenu(n, rhz_32, rhd_32);
    }
}

