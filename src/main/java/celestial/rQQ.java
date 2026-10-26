/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQE;
import celestial.rQG;
import celestial.rQN;
import celestial.rQz_1;

@FunctionalInterface
public interface rQQ {
    default public rQQ id_class() {
        return rQN.id_class(this);
    }

    default public rQG id_class(rQQ rQQ2) {
        return rQE.id_class(this, rQQ2);
    }

    public rQz_1 build();
}

