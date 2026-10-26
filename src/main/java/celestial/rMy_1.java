/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rMl_1;
import celestial.rPD;
import celestial.rpJ_2;

public class rMy_1<T extends iB_2>
extends rPD<T> {
    private final rMl_1 id_implements;

    public rMy_1(rMl_1 rMl_12, Class<T> clazz, float f, double d, double d2) {
        super(rMl_12, clazz, f, d, d2, rpJ_2.id_catch::test);
        this.id_implements = rMl_12;
    }

    @Override
    public boolean id_class() {
        return this.id_implements.sA() && this.id_implements.sy() && super.id_class();
    }
}

