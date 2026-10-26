/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class aS_2
extends ev_3 {
    protected aS_2(eF_2 eF_22, eC_2 eC_22, rXQ ... rXQArray) {
        super(eF_22, eC_22, rXQArray);
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public int id_class(int n) {
        return 15 + (n - 1) * 9;
    }

    @Override
    public int id_break(int n) {
        return super.id_class(n) + 50;
    }
}

