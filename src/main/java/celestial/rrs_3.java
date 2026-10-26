/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import celestial.rsE_2;
import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rrs_3
extends rrr_3<is_3> {
    @Override
    protected void id_class(rrEm_1 rrEm_12, is_3 is_32) {
        iZ_2<?> iZ_22 = is_32.SF();
        List<rsE_2> list = rrEm_12.id_class(rsE_2.class, is_32.rN().id_byte(8.0, 4.0, 8.0), rsE_22 -> true);
        list.sort(Comparator.comparingDouble(is_32::id_int));
        Optional<rsE_2> optional = list.stream().filter(rsE_22 -> is_32.id_implements(rsE_22.id_protected())).filter(rsE_22 -> rsE_22.id_class((an_3)is_32, 9.0)).filter(is_32::id_while).findFirst();
        iZ_22.id_class(il_3.id_static, optional);
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_static);
    }
}

