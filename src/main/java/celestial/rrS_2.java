/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.il_3;
import celestial.rfU_2;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rrS_2
extends rrr_3<iB_2> {
    private static final ImmutableMap<aI_2<?>, Float> id_class = ImmutableMap.builder().put(aI_2.id_new, (Object)Float.valueOf(8.0f)).put(aI_2.id_return, (Object)Float.valueOf(12.0f)).put(aI_2.id_void, (Object)Float.valueOf(8.0f)).put(aI_2.id_static, (Object)Float.valueOf(12.0f)).put(aI_2.W, (Object)Float.valueOf(15.0f)).put(aI_2.u, (Object)Float.valueOf(12.0f)).put(aI_2.K, (Object)Float.valueOf(8.0f)).put(aI_2.U, (Object)Float.valueOf(10.0f)).put(aI_2.rS, (Object)Float.valueOf(10.0f)).put(aI_2.rs, (Object)Float.valueOf(8.0f)).put(aI_2.rG, (Object)Float.valueOf(8.0f)).build();

    private boolean id_byte(iB_2 iB_22) {
        return id_class.containsKey(iB_22.BC());
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_try);
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        iB_22.SF().id_class(il_3.id_try, this.id_class(iB_22));
    }

    private Optional<iB_2> id_class(iB_2 iB_22) {
        return this.id_break(iB_22).flatMap(list -> list.stream().filter(this::id_byte).filter(iB_23 -> this.id_break(iB_22, (iB_2)iB_23)).min((iB_23, iB_24) -> this.id_class(iB_22, (iB_2)iB_23, (iB_2)iB_24)));
    }

    private int id_class(iB_2 iB_22, iB_2 iB_23, iB_2 iB_24) {
        return rfU_2.id_byte(iB_23.id_int(iB_22) - iB_24.id_int(iB_22));
    }

    private boolean id_break(iB_2 iB_22, iB_2 iB_23) {
        float f = ((Float)id_class.get(iB_23.BC())).floatValue();
        return iB_23.id_int(iB_22) <= (double)(f * f);
    }

    private Optional<List<iB_2>> id_break(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_private);
    }
}

