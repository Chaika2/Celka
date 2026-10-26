/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 */
package celestial;

import celestial.rCT;
import celestial.rRg_1;
import celestial.rVX;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;

public final class rVk_1
extends rVX {
    private final ThreadLocal<List<ObjectSet<rfH_2>>> field_208828_g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity((int)7));

    public rVk_1(boolean bl, xd_3 ... xd_3Array) {
    }

    @Override
    public void id_class(rRg_1 rRg_12) {
        rfw_3 rfw_32 = new rfw_3();
        List<ObjectSet<rfH_2>> list = this.field_208828_g.get();
        for (int i = 2; i < list.size(); ++i) {
            int n = i - 1;
            ObjectSet<rfH_2> objectSet = list.get(n);
            ObjectSet<rfH_2> objectSet2 = list.get(i);
            for (rfH_2 rfH_22 : objectSet) {
                xc_3 xc_32 = rRg_12.id_byte(rfH_22);
                if (xc_32.id_byte(rCT.N) < n) continue;
                rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(rCT.N, n), 18);
                if (i == 7) continue;
                for (rpr_3 rpr_32 : field_208827_f) {
                    rfw_32.id_class((rja_3)rfH_22, rpr_32);
                    xc_3 xc_33 = rRg_12.id_byte(rfw_32);
                    if (!xc_33.id_break(rCT.N) || xc_32.id_byte(rCT.N) <= i) continue;
                    objectSet2.add((Object)rfw_32.id_int());
                }
            }
        }
        list.clear();
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        xc_3 xc_34 = xc_32.id_class(rpr_32, rRg_12.id_byte(rfH_23), rRg_12, rfH_22, rfH_23);
        if (xc_32 != xc_34) {
            int n = xc_34.id_byte(rCT.N);
            List<ObjectSet<rfH_2>> list = this.field_208828_g.get();
            if (list.isEmpty()) {
                for (int i = 0; i < 7; ++i) {
                    list.add((ObjectSet<rfH_2>)new ObjectOpenHashSet());
                }
            }
            list.get(n).add((Object)rfH_22.id_int());
        }
        return xc_32;
    }
}

