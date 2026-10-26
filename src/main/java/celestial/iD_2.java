/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rfl_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class iD_2
extends rrr_3<iB_2> {
    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        rfl_3 rfl_32 = iB_22.rN().id_byte(16.0, 16.0, 16.0);
        List<iB_2> list = rrEm_12.id_class(iB_2.class, rfl_32, iB_23 -> iB_23 != iB_22 && iB_23.BM());
        list.sort(Comparator.comparingDouble(iB_22::id_int));
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_class(il_3.id_catch, list);
        iZ_22.id_class(il_3.id_private, list.stream().filter(iB_23 -> iD_2.id_class(iB_22, iB_23)).collect(Collectors.toList()));
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_catch, il_3.id_private);
    }
}

