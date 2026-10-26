/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rPD;
import celestial.rbf_3;
import celestial.rpJ_2;

public class rbj_3<T extends iB_2>
extends rPD<T> {
    private final rbf_3 id_implements;

    public rbj_3(rbf_3 rbf_32, Class<T> clazz, float f, double d, double d2) {
        super(rbf_32, clazz, f, d, d2, rpJ_2.id_throws::test);
        this.id_implements = rbf_32;
    }

    @Override
    public boolean id_class() {
        return !this.id_implements.sZ() && super.id_class();
    }

    @Override
    public boolean id_break() {
        return !this.id_implements.sZ() && super.id_break();
    }
}

