/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fJ_2;
import celestial.fj_3;
import celestial.rrbb_3;
import celestial.rrdZ;
import java.util.BitSet;

public class rrMh_1 {
    private static boolean id_class;
    private static BitSet id_break;
    private static BitSet id_byte;

    public static void id_byte() {
        id_byte.clear();
    }

    static {
        id_break = new BitSet();
        id_byte = new BitSet();
    }

    public static boolean id_class() {
        return id_class && !rrdZ.id_new;
    }

    public static void id_class(int n) {
        if (n >= 0) {
            id_byte.set(n);
        }
    }

    public static void id_class(fJ_2 fJ_22) {
        if (fJ_22.id_finally()) {
            id_break.clear();
        }
    }

    public static void id_class(BitSet bitSet) {
        if (bitSet != null) {
            id_break.or(bitSet);
        }
    }

    public static void id_class(fj_3 fj_32) {
        int n;
        if (fj_32.id_try() && (n = fj_32.id_continue()) >= 0) {
            id_break.set(n);
        }
    }

    public static boolean id_break(fj_3 fj_32) {
        if (!fj_32.id_try()) {
            return true;
        }
        int n = fj_32.id_continue();
        return n < 0 ? false : id_break.get(n);
    }

    public static boolean id_break(int n) {
        return n < 0 ? false : id_byte.get(n);
    }

    public static void id_break() {
        id_class = rrbb_3.rE().rW;
    }
}

