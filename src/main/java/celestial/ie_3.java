/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rSN;
import celestial.rbM_2;
import celestial.rbr_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ie_3
extends rrr_3<iB_2> {
    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_private, il_3.id_import, il_3.S);
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        iZ_2<?> iZ_22 = iB_22.SF();
        Optional<Object> optional = Optional.empty();
        ArrayList arrayList = Lists.newArrayList();
        for (iB_2 iB_23 : iZ_22.id_byte(il_3.id_private).orElse((List<iB_2>)ImmutableList.of())) {
            if (!(iB_23 instanceof rbr_3) && !(iB_23 instanceof rSN)) continue;
            optional = Optional.of((is_3)iB_23);
            break;
        }
        for (iB_2 iB_23 : iZ_22.id_byte(il_3.id_catch).orElse((List<iB_2>)ImmutableList.of())) {
            if (!(iB_23 instanceof rbM_2) || !((rbM_2)iB_23).sx()) continue;
            arrayList.add((rbM_2)iB_23);
        }
        iZ_22.id_class(il_3.id_import, optional);
        iZ_22.id_class(il_3.S, arrayList);
    }
}

