/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.Aw_1;
import celestial.rRl_1;
import celestial.rnB_2;
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class uY_2
implements Comparator<Aw_1> {
    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((Aw_1)object, (Aw_1)object2);
    }

    public int id_class(Aw_1 aw_1, Aw_1 aw_12) {
        rnB_2 rnB_22 = aw_1.id_implements();
        rnB_2 rnB_23 = aw_12.id_implements();
        return ComparisonChain.start().compareTrueFirst(aw_1.id_break() != rRl_1.SPECTATOR, aw_12.id_break() != rRl_1.SPECTATOR).compare((Comparable)((Object)(rnB_22 != null ? rnB_22.id_class() : "")), (Comparable)((Object)(rnB_23 != null ? rnB_23.id_class() : ""))).compare((Object)aw_1.id_class().getName(), (Object)aw_12.id_class().getName(), String::compareToIgnoreCase).result();
    }
}

