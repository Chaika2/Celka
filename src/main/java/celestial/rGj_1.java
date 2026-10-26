/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import celestial.rBI;
import celestial.rGw_1;

public class rGj_1<T extends iB_2>
extends rBI<T> {
    public rGj_1(rGw_1 rGw_12, Class<T> clazz) {
        super((is_3)rGw_12, clazz, true);
    }

    @Override
    public boolean id_class() {
        float f = this.id_throws.rX();
        return f >= 0.5f ? false : super.id_class();
    }
}

