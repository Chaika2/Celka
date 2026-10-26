/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.yX_2;
import java.util.HashMap;
import java.util.Map;

public class rrWL {
    private static Map<String, Integer> id_class = new HashMap<String, Integer>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean id_class(String string, int n) {
        Map<String, Integer> map = id_class;
        synchronized (map) {
            int n2;
            int n3 = ((yX_2)QY.id_instanceof().id_class[8]).id_public();
            if (n3 <= 0) {
                return false;
            }
            Integer n4 = id_class.get(string);
            if (n4 == null) {
                n4 = new Integer(n3);
                id_class.put(string, n4);
            }
            if (n3 > (n2 = n4.intValue()) && n3 < n2 + n) {
                return false;
            }
            id_class.put(string, new Integer(n3));
            return true;
        }
    }
}

