/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rqM_2;

public class rrzc_3 {
    public static boolean id_byte(rYB rYB2) {
        rqM_2<rYB> rqM_22 = rYB2.E();
        return rrzc_3.id_class(rqM_22) == 0;
    }

    public static int id_class(rYB rYB2) {
        return rYB2 == null ? 0 : rrzc_3.id_class(rYB2.E());
    }

    public static int id_class(rqM_2<rYB> rqM_22) {
        if (rqM_22 == rYB.id_protected) {
            return -1;
        }
        if (rqM_22 == rYB.id_byte) {
            return 0;
        }
        return rqM_22 == rYB.id_throws ? 1 : 0;
    }

    public static boolean id_break(rYB rYB2) {
        return rYB2.E() == rYB.id_protected;
    }

    public static boolean id_protected(rYB rYB2) {
        return rYB2.E() == rYB.id_throws;
    }
}

