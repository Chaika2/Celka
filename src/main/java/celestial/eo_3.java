/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class eo_3
extends ev_3 {
    protected eo_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.WEAPON, rXQArray);
    }

    @Override
    public int id_class() {
        return 2;
    }

    @Override
    public int id_class(int n) {
        return 10 + 20 * (n - 1);
    }

    @Override
    public int id_break(int n) {
        return super.id_class(n) + 50;
    }
}

