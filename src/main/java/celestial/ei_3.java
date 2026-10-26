/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.as_3;
import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;

public class ei_3
extends ev_3 {
    public ei_3(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.BOW, rXQArray);
    }

    @Override
    public int id_class() {
        return 1;
    }

    @Override
    public boolean id_class(ev_3 ev_32) {
        return ev_32 instanceof as_3 ? false : super.id_class(ev_32);
    }

    @Override
    public int id_class(int n) {
        return 20;
    }

    @Override
    public int id_break(int n) {
        return 50;
    }
}

