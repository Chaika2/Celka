/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rrbb_3;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class rrWu_1 {
    private static final Map<aI_2, Integer> id_class = new HashMap<aI_2, Integer>();
    private static final Map<String, Integer> id_break = new HashMap<String, Integer>();
    private static final Map<String, Integer> id_byte = new HashMap<String, Integer>();

    static {
        for (aI_2 aI_22 : rVL.id_transient) {
            int n = rVL.id_transient.id_class(aI_22);
            rqO_2 rqO_22 = rVL.id_transient.id_break(aI_22);
            String string = rqO_22.toString();
            String string2 = rqO_22.id_break();
            if (id_class.containsKey(aI_22)) {
                rrbb_3.id_protected("Duplicate entity type: " + aI_22 + ", id1: " + id_class.get(aI_22) + ", id2: " + n);
            }
            if (id_break.containsKey(string)) {
                rrbb_3.id_protected("Duplicate entity location: " + string + ", id1: " + id_break.get(string) + ", id2: " + n);
            }
            if (id_byte.containsKey(string)) {
                rrbb_3.id_protected("Duplicate entity name: " + string2 + ", id1: " + id_byte.get(string2) + ", id2: " + n);
            }
            id_class.put(aI_22, n);
            id_break.put(string, n);
            id_byte.put(string2, n);
        }
    }

    public static int id_class(String string) {
        Integer n = id_break.get(string);
        return n == null ? -1 : n;
    }

    public static int id_class(an_3 an_32) {
        return an_32 == null ? -1 : rrWu_1.id_class(an_32.BC());
    }

    public static int id_class(aI_2 aI_22) {
        Integer n = id_class.get(aI_22);
        return n == null ? -1 : n;
    }

    public static int id_break(String string) {
        Integer n = id_byte.get(string = string.toLowerCase(Locale.ROOT));
        return n == null ? -1 : n;
    }
}

