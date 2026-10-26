/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rMA;
import celestial.rPD;
import celestial.rpJ_2;

public class rMn_1<T extends iB_2>
extends rPD<T> {
    private final rMA id_implements;

    public rMn_1(rMA rMA2, Class<T> clazz, float f, double d, double d2) {
        super(rMA2, clazz, f, d, d2, rpJ_2.id_throws::test);
        this.id_implements = rMA2;
    }

    @Override
    public boolean id_class() {
        return !this.id_implements.sJ() && super.id_class();
    }

    @Override
    public boolean id_break() {
        return !this.id_implements.sJ() && super.id_break();
    }
}

