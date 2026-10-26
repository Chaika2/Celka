/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWd_1;
import celestial.rrzO_2;
import java.util.HashMap;
import java.util.Map;

public class rrkT {
    private static Map<Integer, rrzO_2> id_class = new HashMap<Integer, rrzO_2>();
    private static rrWd_1 id_break = new rrWd_1(1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float id_class(int n, float f, float f2, float f3) {
        Map<Integer, rrzO_2> map = id_class;
        synchronized (map) {
            Integer n2 = n;
            rrzO_2 rrzO_22 = id_class.get(n2);
            if (rrzO_22 == null) {
                rrzO_22 = new rrzO_2(f, f2, f3);
                id_class.put(n2, rrzO_22);
            }
            return rrzO_22.id_class(f, f2, f3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int id_class() {
        rrWd_1 rrWd_12 = id_break;
        synchronized (rrWd_12) {
            return id_break.id_class();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_break() {
        Map<Integer, rrzO_2> map = id_class;
        synchronized (map) {
            id_class.clear();
        }
    }
}

