/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class rrzh_3 {
    private static final Map<String, Object> id_class = Collections.synchronizedMap(new HashMap());

    public static long id_class(String string, long l, long l2) {
        long l3 = rrzh_3.id_class(string, l2);
        Long l4 = l;
        id_class.put(string, l4);
        return l3;
    }

    public static boolean id_class(String string) {
        return id_class.containsKey(string);
    }

    public static int id_class(String string, int n) {
        Object object = id_class.get(string);
        if (!(object instanceof Integer)) {
            return n;
        }
        Integer n2 = (Integer)object;
        return n2;
    }

    public static long id_class(String string, long l) {
        Object object = id_class.get(string);
        if (!(object instanceof Long)) {
            return l;
        }
        Long l2 = (Long)object;
        return l2;
    }

    public static void id_class(String string, Object object) {
        id_class.put(string, object);
    }

    public static int id_break(String string, int n) {
        int n2 = rrzh_3.id_class(string, 0);
        Integer n3 = n;
        id_class.put(string, n3);
        return n2;
    }

    public static long id_break(String string, long l, long l2) {
        long l3 = rrzh_3.id_class(string, l2);
        rrzh_3.id_break(string, l3 += l);
        return l3;
    }

    public static void id_break(String string, long l) {
        Long l2 = l;
        id_class.put(string, l2);
    }

    public static Object id_break(String string) {
        return id_class.get(string);
    }
}

