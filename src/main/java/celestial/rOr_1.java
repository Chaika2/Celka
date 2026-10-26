/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rMi_1;
import celestial.rPD;

public class rOr_1<T extends iB_2>
extends rPD<T> {
    private final rMi_1 id_implements;

    public rOr_1(rMi_1 rMi_12, Class<T> clazz, float f, double d, double d2) {
        super(rMi_12, clazz, f, d, d2);
        this.id_implements = rMi_12;
    }

    @Override
    public boolean id_class() {
        return this.id_implements.sx() != 99 && super.id_class();
    }
}

