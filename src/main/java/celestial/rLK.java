/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rLD;
import celestial.rLY;
import celestial.rLo_1;
import celestial.rfU_2;
import celestial.rql_3;

public final class rLK {
    public static boolean id_byte(iB_2 iB_22) {
        return iB_22.id_break(rLD.id_volatile) || iB_22.id_break(rLD.id_throw);
    }

    public static boolean id_class(rLY rLY2) {
        if (rLY2.id_break() < 200) {
            return false;
        }
        if (rLY2.id_class() == rLD.id_package) {
            return false;
        }
        if (rLY2.id_class().id_throws() == rLo_1.HARMFUL) {
            return true;
        }
        if (rLY2.id_class() == rLD.id_private) {
            return true;
        }
        return rLY2.id_class() == rLD.id_instanceof;
    }

    public static boolean id_class(iB_2 iB_22) {
        return iB_22.id_break(rLD.id_byte) || iB_22.id_break(rLD.id_throw);
    }

    public static String id_class(rLY rLY2, float f) {
        if (rLY2.id_implements()) {
            return "**:**";
        }
        int n = rfU_2.id_protected((float)rLY2.id_break() * f);
        return rql_3.id_class(n);
    }

    public static int id_break(iB_2 iB_22) {
        int n = 0;
        int n2 = 0;
        if (iB_22.id_break(rLD.id_byte)) {
            n = iB_22.id_byte(rLD.id_byte).id_byte();
        }
        if (iB_22.id_break(rLD.id_throw)) {
            n2 = iB_22.id_byte(rLD.id_throw).id_byte();
        }
        return Math.max(n, n2);
    }
}

