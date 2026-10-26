/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hn_1;
import java.util.Arrays;
import java.util.List;

public class rrxL_2 {
    private static boolean id_class;
    private static final Hn_1[] id_break;

    private static void id_byte(List<Hn_1> list) {
        for (int i = 0; i < list.size(); ++i) {
            Hn_1 hn_1 = list.get(i);
            rrxL_2.id_class(hn_1, i);
        }
    }

    static {
        id_break = new Hn_1[HU.id_long()];
    }

    public static void id_class() {
        if (!id_class) {
            id_class = true;
            Arrays.fill(id_break, null);
        }
    }

    public static void id_class(List<Hn_1> list) {
        if (id_class) {
            rrxL_2.id_byte(list);
        } else {
            for (int i = 0; i < list.size(); ++i) {
                Hn_1 hn_1 = list.get(i);
                hn_1.id_class();
            }
        }
    }

    private static void id_class(Hn_1 hn_1, int n) {
        Hn_1 hn_12 = id_break[n];
        if (hn_12 != null) {
            if (hn_1 == hn_12) {
                rrxL_2.id_break[n] = null;
                return;
            }
            hn_12.id_break();
            rrxL_2.id_break[n] = null;
        }
        hn_1.id_class();
    }

    public static void id_break() {
        if (id_class) {
            id_class = false;
            for (int i = 0; i < id_break.length; ++i) {
                Hn_1 hn_1 = id_break[i];
                if (hn_1 == null) continue;
                hn_1.id_break();
            }
            Arrays.fill(id_break, null);
        }
    }

    public static void id_break(List<Hn_1> list) {
        if (id_class) {
            rrxL_2.id_protected(list);
        } else {
            for (int i = 0; i < list.size(); ++i) {
                Hn_1 hn_1 = list.get(i);
                hn_1.id_break();
            }
        }
    }

    private static void id_break(Hn_1 hn_1, int n) {
        Hn_1 hn_12 = id_break[n];
        if (hn_12 != null) {
            hn_12.id_break();
        }
        rrxL_2.id_break[n] = hn_1;
    }

    private static void id_protected(List<Hn_1> list) {
        for (int i = 0; i < list.size(); ++i) {
            Hn_1 hn_1 = list.get(i);
            rrxL_2.id_break(hn_1, i);
        }
    }
}

