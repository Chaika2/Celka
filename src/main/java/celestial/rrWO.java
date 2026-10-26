/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Set;

public class rrWO {
    public static boolean id_class(Set set, Set set2) {
        return !rrWO.id_break(set, set2);
    }

    public static boolean id_break(Set set, Set object) {
        if (!set.isEmpty() && !object.isEmpty()) {
            if (object.size() < set.size()) {
                Set set2 = set;
                set = object;
                object = set2;
            }
            for (Object e : set) {
                if (!object.contains(e)) continue;
                return true;
            }
            return false;
        }
        return false;
    }
}

