/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXu_1;
import celestial.rhd_3;

public class FA
extends rJY {
    public FA(rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        if (super.id_class(rhd_32) && this.id_break()) {
            return this.id_class().id_break("CustomCreativeLock") == null;
        }
        return !this.id_break();
    }
}

