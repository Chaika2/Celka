/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class aW_2
extends ev_3 {
    public aW_2(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.WEAPON, rXQArray);
    }

    @Override
    public int id_class(int n) {
        return 5 + (n - 1) * 9;
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + 15;
    }

    public static float id_throws(int n) {
        return 1.0f - 1.0f / (float)(n + 1);
    }
}

