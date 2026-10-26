/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.an_3;
import celestial.rKG;
import celestial.rKb_1;
import celestial.rRz_1;
import celestial.rSa_1;
import celestial.rUE;
import celestial.rUG;
import celestial.rUM;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

public final class rKh_1
extends rKb_1 {
    @Override
    public void id_class(rrEm_1 rrEm_12, rKG rKG2, List<rSa_1> list, int n, rfH_2 rfH_22) {
        boolean bl;
        int n2 = 40;
        boolean bl2 = n % 40 == 0;
        boolean bl3 = bl = n % 40 == 39;
        if (bl2 || bl) {
            int n3 = n / 40;
            List<rUG> list2 = rUE.id_class(rrEm_12);
            if (n3 < list2.size()) {
                rUG rUG2 = list2.get(n3);
                if (bl2) {
                    for (rSa_1 rSa_12 : list) {
                        rSa_12.id_class(new rfH_2(rUG2.id_class(), rUG2.id_protected() + 1, rUG2.id_break()));
                    }
                } else {
                    int n4 = 10;
                    for (rfH_2 rfH_23 : rfH_2.id_class(new rfH_2(rUG2.id_class() - 10, rUG2.id_protected() - 10, rUG2.id_break() - 10), new rfH_2(rUG2.id_class() + 10, rUG2.id_protected() + 10, rUG2.id_break() + 10))) {
                        rrEm_12.id_class(rfH_23, false);
                    }
                    rrEm_12.id_class((an_3)null, (float)rUG2.id_class() + 0.5f, (double)rUG2.id_protected(), (double)((float)rUG2.id_break() + 0.5f), 5.0f, rRz_1.DESTROY);
                    rUM rUM2 = new rUM(true, (List<rUG>)ImmutableList.of((Object)rUG2), new rfH_2(0, 128, 0));
                    rUO.id_instanceof.id_break(rUM2).id_class(rrEm_12, rrEm_12.id_else().id_implements(), new Random(), new rfH_2(rUG2.id_class(), 45, rUG2.id_break()));
                }
            } else if (bl2) {
                rKG2.id_class(SUMMONING_DRAGON);
            }
        }
    }
}

