/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ev_3;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rrMF;
import celestial.rrWN;

public class rrMy_1
implements rrMF {
    @Override
    public int id_class(String string, int n) {
        rqO_2 rqO_22 = new rqO_2(string);
        ev_3 ev_32 = rrWN.id_class(rqO_22);
        return ev_32 == null ? n : rVL.id_boolean.id_class(ev_32);
    }
}

