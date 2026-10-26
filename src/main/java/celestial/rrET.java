/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rfH_2;
import celestial.rrEt_1;
import com.google.common.collect.Lists;
import java.util.List;

public class rrET {
    private final List<rrEt_1> id_class = Lists.newArrayList();

    public void id_class(rfH_2 rfH_22, double d) {
        if (d != 0.0) {
            this.id_class.add(new rrEt_1(rfH_22, d));
        }
    }

    public double id_break(rfH_2 rfH_22, double d) {
        if (d == 0.0) {
            return 0.0;
        }
        double d2 = 0.0;
        for (rrEt_1 rrEt_12 : this.id_class) {
            d2 += rrEt_12.id_class(rfH_22);
        }
        return d2 * d;
    }
}

