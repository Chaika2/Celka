/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aI_2;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rRu_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrw_3<E extends is_3>
extends rPm_1<E> {
    public rrw_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_short, (Object)((Object)iC_2.VALUE_PRESENT)));
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        iA_2.id_class(e, il_3.id_short).ifPresent(iB_22 -> {
            if (iB_22.Sl() && (iB_22.BC() != aI_2.rM || rrEm_12.B().id_break(rRu_1.id_abstract))) {
                e.SF().id_break(il_3.id_short);
            }
        });
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

