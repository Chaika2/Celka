/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdG;

public class rrdO {
    public static boolean id_class(rrdG[] rrdGArray) {
        for (int i = 0; i < rrdGArray.length; ++i) {
            rrdG rrdG2 = rrdGArray[i];
            if (rrdG2.id_private() != 0) {
                return true;
            }
            if (rrdG2.id_goto().length <= 0) continue;
            return true;
        }
        return false;
    }
}

