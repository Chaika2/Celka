/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.eY_2;
import celestial.ev_3;
import celestial.rXQ;

public class em_3
extends ev_3 {
    public em_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.ARMOR_FEET, rXQArray);
    }

    @Override
    public int id_class() {
        return 3;
    }

    @Override
    public boolean id_class(ev_3 ev_32) {
        return super.id_class(ev_32) && ev_32 != eY_2.id_finally;
    }

    @Override
    public int id_class(int n) {
        return n * 10;
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + 15;
    }
}

