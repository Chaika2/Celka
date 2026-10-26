/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aL_2;
import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class ea_3
extends ev_3 {
    public ea_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.TRIDENT, rXQArray);
    }

    @Override
    public int id_class() {
        return 5;
    }

    @Override
    public float id_class(int n, aL_2 aL_22) {
        return aL_22 == aL_2.id_throws ? (float)n * 2.5f : 0.0f;
    }

    @Override
    public int id_class(int n) {
        return 1 + (n - 1) * 8;
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + 20;
    }
}

