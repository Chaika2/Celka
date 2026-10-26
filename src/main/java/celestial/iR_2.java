/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rEg_1;
import celestial.rbk_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;

public class iR_2
extends rrr_3<rEg_1> {
    @Override
    protected void id_class(rrEm_1 rrEm_12, rEg_1 rEg_12) {
        iZ_2<rEg_1> iZ_22 = rEg_12.SF();
        iZ_22.id_class(il_3.J, this.id_break(rrEm_12, rEg_12));
        Optional<Object> optional = Optional.empty();
        int n = 0;
        ArrayList arrayList = Lists.newArrayList();
        for (iB_2 iB_22 : iZ_22.id_byte(il_3.id_private).orElse(Lists.newArrayList())) {
            if (iB_22 instanceof rbk_3 && !iB_22.n_()) {
                ++n;
                if (!optional.isPresent()) {
                    optional = Optional.of((rbk_3)iB_22);
                }
            }
            if (!(iB_22 instanceof rEg_1) || iB_22.n_()) continue;
            arrayList.add((rEg_1)iB_22);
        }
        iZ_22.id_class(il_3.G, optional);
        iZ_22.id_class(il_3.E, arrayList);
        iZ_22.id_class(il_3.M, Integer.valueOf(n));
        iZ_22.id_class(il_3.O, Integer.valueOf(arrayList.size()));
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_private, il_3.J, il_3.G, il_3.E, il_3.M, il_3.O, (Object[])new il_3[0]);
    }

    private Optional<rfH_2> id_break(rrEm_1 rrEm_12, rEg_1 rEg_12) {
        return rfH_2.id_class(rEg_12.Bs(), 8, 4, rfH_22 -> rrEm_12.id_byte((rfH_2)rfH_22).id_class(rls_3.A));
    }
}

