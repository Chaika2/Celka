/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ev_3;
import celestial.rVL;
import celestial.rqO_2;
import java.util.HashMap;
import java.util.Map;

public class rrWN {
    private static final Map<String, ev_3> id_class = new HashMap<String, ev_3>();

    public static ev_3 id_class(String string) {
        ev_3 ev_32 = id_class.get(string);
        if (ev_32 == null) {
            rqO_2 rqO_22 = new rqO_2(string);
            if (rVL.id_boolean.id_byte(rqO_22)) {
                ev_32 = rVL.id_boolean.id_class(rqO_22);
            }
            id_class.put(string, ev_32);
        }
        return ev_32;
    }

    public static ev_3 id_class(rqO_2 rqO_22) {
        return !rVL.id_boolean.id_byte(rqO_22) ? null : rVL.id_boolean.id_class(rqO_22);
    }
}

