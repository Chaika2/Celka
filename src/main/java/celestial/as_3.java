/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class as_3
extends ev_3 {
    public as_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.BREAKABLE, rXQArray);
    }

    @Override
    public int id_class() {
        return 1;
    }

    @Override
    public int id_class(int n) {
        return n * 25;
    }

    @Override
    public boolean id_break() {
        return true;
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + 50;
    }
}

