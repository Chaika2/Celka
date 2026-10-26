/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class ak_3
extends ev_3 {
    public ak_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.ARMOR_FEET, rXQArray);
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public int id_class(int n) {
        return n * 10;
    }

    @Override
    public boolean id_break() {
        return true;
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + 15;
    }

    @Override
    public boolean id_implements() {
        return false;
    }

    @Override
    public boolean id_private() {
        return false;
    }
}

