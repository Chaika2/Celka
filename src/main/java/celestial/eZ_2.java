/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rdy_3;

public class eZ_2
extends ev_3 {
    protected eZ_2(eF_2 eF_22, rXQ ... rXQArray) {
        super(eF_22, eC_2.DIGGER, rXQArray);
    }

    @Override
    public int id_class() {
        return 5;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.JJ ? true : super.id_class(rdn_32);
    }

    @Override
    public int id_class(int n) {
        return 1 + 10 * (n - 1);
    }

    @Override
    public int id_break(int n) {
        return super.id_class(n) + 50;
    }
}

