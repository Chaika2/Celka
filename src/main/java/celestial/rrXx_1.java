/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXh_1;
import celestial.rrXz_1;

public class rrXx_1 {
    private rrXz_1[] id_class;

    public rrXx_1(rrXz_1[] rrXz_1Array) {
        this.id_class = rrXz_1Array;
    }

    public void id_class() {
        for (int i = 0; i < this.id_class.length; ++i) {
            rrXz_1 rrXz_12 = this.id_class[i];
            rrXz_12.id_class();
        }
    }

    public boolean id_class(rrXh_1 rrXh_12) {
        for (int i = 0; i < this.id_class.length; ++i) {
            rrXz_1 rrXz_12 = this.id_class[i];
            if (rrXz_12.id_class(rrXh_12)) continue;
            return false;
        }
        return true;
    }
}

