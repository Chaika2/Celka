/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrzQ_2 {
    private static Map<String, Long> id_class = new HashMap<String, Long>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean id_class(String string, long l) {
        Map<String, Long> map = id_class;
        synchronized (map) {
            long l2;
            long l3 = System.currentTimeMillis();
            Long l4 = id_class.get(string);
            if (l4 == null) {
                l4 = new Long(l3);
                id_class.put(string, l4);
            }
            if (l3 < (l2 = l4.longValue()) + l) {
                return false;
            }
            id_class.put(string, new Long(l3));
            return true;
        }
    }
}

