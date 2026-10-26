/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrbH_2;
import celestial.rrbb_3;
import java.util.Comparator;

public class rrbq_3
implements Comparator {
    public int compare(Object object, Object object2) {
        rrbH_2 rrbH_22 = (rrbH_2)object;
        rrbH_2 rrbH_23 = (rrbH_2)object2;
        if (rrbH_22.id_synchronized != rrbH_23.id_synchronized) {
            return rrbH_23.id_synchronized - rrbH_22.id_synchronized;
        }
        return !rrbb_3.id_class((Object)rrbH_22.id_break, (Object)rrbH_23.id_break) ? rrbH_22.id_break.compareTo(rrbH_23.id_break) : rrbH_22.id_class.compareTo(rrbH_23.id_class);
    }
}

