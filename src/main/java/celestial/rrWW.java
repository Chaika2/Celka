/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.yM_2;
import java.util.Comparator;

public class rrWW
implements Comparator {
    public int compare(Object object, Object object2) {
        int n;
        yM_2 yM_22 = (yM_2)object;
        yM_2 yM_23 = (yM_2)object2;
        if (yM_22.id_class() != yM_23.id_class()) {
            return yM_22.id_class() - yM_23.id_class();
        }
        if (yM_22.id_break() != yM_23.id_break()) {
            return yM_22.id_break() - yM_23.id_break();
        }
        int n2 = yM_22.id_byte() + yM_22.id_protected() + yM_22.id_throws();
        if (n2 != (n = yM_23.id_byte() + yM_23.id_protected() + yM_23.id_throws())) {
            return n2 - n;
        }
        return yM_22.id_case() != yM_23.id_case() ? yM_22.id_case() - yM_23.id_case() : 0;
    }
}

