/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWI;
import celestial.rrWw_1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class rrWt_1 {
    private static Deque<rrWI<Object>> id_class = new ArrayDeque<rrWI<Object>>();

    static {
        for (int i = 0; i < 1000; ++i) {
            rrWw_1 rrWw_12 = new rrWw_1();
            id_class.add(rrWw_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Iterator<Object> id_class(List list) {
        Deque<rrWI<Object>> deque = id_class;
        synchronized (deque) {
            rrWw_1 rrWw_12 = id_class.pollFirst();
            if (rrWw_12 == null) {
                rrWw_12 = new rrWw_1();
            }
            rrWw_12.id_class((List<Object>)list);
            return rrWw_12;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_class(rrWI<Object> rrWI2) {
        Deque<rrWI<Object>> deque = id_class;
        synchronized (deque) {
            if (id_class.size() <= 1000) {
                rrWI2.id_class(null);
                id_class.addLast(rrWI2);
            }
        }
    }
}

