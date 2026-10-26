/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbH_2;
import java.util.Comparator;

public class rrbp_3
implements Comparator {
    public int compare(Object object, Object object2) {
        rrbH_2 rrbH_22 = (rrbH_2)object;
        rrbH_2 rrbH_23 = (rrbH_2)object2;
        if (rrbH_22.id_this != rrbH_23.id_this) {
            return rrbH_22.id_this - rrbH_23.id_this;
        }
        if (rrbH_22.id_synchronized != rrbH_23.id_synchronized) {
            return rrbH_23.id_synchronized - rrbH_22.id_synchronized;
        }
        return !rrbH_22.id_break.equals(rrbH_23.id_break) ? rrbH_22.id_break.compareTo(rrbH_23.id_break) : rrbH_22.id_class.compareTo(rrbH_23.id_class);
    }
}

