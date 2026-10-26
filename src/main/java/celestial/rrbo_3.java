/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.rrbK_2;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class rrbo_3 {
    private static boolean id_class = false;
    private static long id_break = -1L;
    private static Int2ObjectOpenHashMap<rrbK_2> id_byte = new Int2ObjectOpenHashMap();
    private static final long id_protected = 3000L;
    private static final int id_throws = 10;

    public static void id_class() {
        id_class = true;
        if (!id_byte.isEmpty()) {
            if (id_break < 0L) {
                id_break = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() > id_break + 3000L) {
                for (rrbK_2 rrbK_22 : id_byte.values()) {
                    rrbK_22.id_class();
                }
                id_break = System.currentTimeMillis();
            }
        }
    }

    public static boolean id_class(int n) {
        if (!id_class) {
            return true;
        }
        rrbK_2 rrbK_22 = rrbo_3.id_break(n);
        return rrbK_22.id_break();
    }

    private static rrbK_2 id_break(int n) {
        rrbK_2 rrbK_22 = (rrbK_2)id_byte.get(n);
        if (rrbK_22 == null) {
            rrbK_22 = new rrbK_2(n);
            id_byte.put(n, (Object)rrbK_22);
        }
        return rrbK_22;
    }
}

