/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rhd_3;
import celestial.rpJ_2;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class iU_2
extends rrr_3<iB_2> {
    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        List list = rrEm_12.id_continue().stream().filter(rpJ_2.id_catch).filter(rhN_22 -> iB_22.id_class((an_3)rhN_22, 16.0)).sorted(Comparator.comparingDouble(iB_22::id_int)).collect(Collectors.toList());
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_class(il_3.id_finally, list);
        List list2 = list.stream().filter(rhd_32 -> iU_2.id_class(iB_22, rhd_32)).collect(Collectors.toList());
        iZ_22.id_class(il_3.id_extends, list2.isEmpty() ? null : (rhd_3)list2.get(0));
        Optional<an_3> optional = list2.stream().filter(rpJ_2.id_case).findFirst();
        iZ_22.id_class(il_3.id_native, optional);
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_finally, il_3.id_extends, il_3.id_native);
    }
}

