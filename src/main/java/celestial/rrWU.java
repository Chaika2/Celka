/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.ArrayList;
import java.util.List;

public class rrWU {
    private static long id_class = System.currentTimeMillis();
    private static long id_break = rrWU.id_private();
    private static long id_byte = id_class;
    private static long id_protected = id_break;
    private static boolean id_throws = false;
    private static long id_case = 0L;
    private static long id_catch = 0L;
    private static List<Long> id_private = new ArrayList<Long>();
    private static long id_implements = 0L;
    private static long id_finally = 0x100000L;

    public static long id_byte() {
        return id_break / id_finally;
    }

    public static void id_class() {
        long l = System.currentTimeMillis();
        long l2 = rrWU.id_private();
        boolean bl = id_throws = l2 < id_protected;
        if (id_throws) {
            id_implements = id_case;
            id_class = l;
            id_break = l2;
        }
        long l3 = l - id_class;
        long l4 = l2 - id_break;
        double d = (double)l3 / 1000.0;
        if (l4 >= 0L && d > 0.0) {
            id_case = (long)((double)l4 / d);
            id_private.add(id_case);
            if (l / 1000L != id_byte / 1000L) {
                long l5 = 0L;
                for (Long l6 : id_private) {
                    l5 += l6.longValue();
                }
                id_catch = l5 / (long)id_private.size();
                id_private.clear();
            }
        }
        id_byte = l;
        id_protected = l2;
    }

    public static long id_break() {
        return id_class;
    }

    public static long id_throws() {
        return id_case / id_finally;
    }

    public static long id_catch() {
        return id_implements / id_finally;
    }

    public static long id_case() {
        return id_catch / id_finally;
    }

    public static boolean id_protected() {
        return id_throws;
    }

    private static long id_private() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}

