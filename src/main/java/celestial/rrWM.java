/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.roJ_2;
import celestial.rrbS_2;

public class rrWM {
    public static boolean id_class(roJ_2 roJ_22) {
        if (roJ_22 instanceof rrbS_2) {
            rrbS_2 rrbS_22 = (rrbS_2)roJ_22;
            return rrbS_22.id_long();
        }
        return true;
    }

    public static boolean id_break(roJ_2 roJ_22) {
        if (roJ_22 instanceof rrbS_2) {
            rrbS_2 rrbS_22 = (rrbS_2)roJ_22;
            return rrbS_22.id_finally();
        }
        return false;
    }
}

