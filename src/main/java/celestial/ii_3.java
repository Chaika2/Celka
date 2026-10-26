/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iZ_2;
import celestial.il_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rqM_2;
import celestial.rrEm_1;
import celestial.rrr_3;
import celestial.rsq_3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Set;

public class ii_3
extends rrr_3<rsq_3> {
    public ii_3() {
        super(40);
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_case);
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rqM_2<rYB> rqM_22 = rrEm_12.E();
        rfH_2 rfH_22 = rsq_32.Bs();
        ArrayList arrayList = Lists.newArrayList();
        int n = 4;
        for (int i = -4; i <= 4; ++i) {
            for (int j = -2; j <= 2; ++j) {
                for (int k = -4; k <= 4; ++k) {
                    rfH_2 rfH_23 = rfH_22.id_break(i, j, k);
                    if (!rsq_32.su().id_break().id_byte().contains((Object)rrEm_12.id_byte(rfH_23).id_break())) continue;
                    arrayList.add(rfK_2.id_class(rqM_22, rfH_23));
                }
            }
        }
        iZ_2<rsq_3> iZ_22 = rsq_32.SF();
        if (!arrayList.isEmpty()) {
            iZ_22.id_class(il_3.id_case, arrayList);
        } else {
            iZ_22.id_break(il_3.id_case);
        }
    }
}

