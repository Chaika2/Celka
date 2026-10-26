/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.HashSet;
import java.util.Set;

public class rrWZ {
    private static Set<String> id_class = new HashSet<String>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean id_byte(String string) {
        Set<String> set = id_class;
        synchronized (set) {
            return id_class.contains(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void id_class(String string) {
        Set<String> set = id_class;
        synchronized (set) {
            id_class.add(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean id_break(String string) {
        Set<String> set = id_class;
        synchronized (set) {
            return id_class.remove(string);
        }
    }

    public static boolean id_protected(String string) {
        return rrWZ.id_break(string);
    }
}

