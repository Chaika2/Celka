/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rHE;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rxL_2;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class rHG {
    private final List<Pair<rHE, rxL_2>> id_class = Lists.newArrayList();

    public rHG id_class(rHE rHE2, rxL_2 rxL_22) {
        this.id_class.add((Pair<rHE, rxL_2>)Pair.of((Object)((Object)rHE2), (Object)rxL_22));
        return this;
    }

    public rcy_3 id_class() {
        rcy_3 rcy_32 = new rcy_3();
        for (Pair<rHE, rxL_2> pair : this.id_class) {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("Pattern", ((rHE)((Object)pair.getLeft())).hashname);
            rcd_32.id_break("Color", ((rxL_2)pair.getRight()).id_break());
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }
}

