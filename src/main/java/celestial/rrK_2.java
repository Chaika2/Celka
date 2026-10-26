/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iC_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrK_2
extends rPm_1<is_3> {
    @Override
    protected void id_byte(rrEm_1 rrEm_12, is_3 is_32, long l) {
        is_32.SF().id_byte(il_3.id_final).ifPresent(rfD_22 -> is_32.id_continue().id_class(rfD_22.id_class()));
    }

    public rrK_2(int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.VALUE_PRESENT)), n, n2);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        return is_32.SF().id_byte(il_3.id_final).filter(rfD_22 -> rfD_22.id_class(is_32)).isPresent();
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, is_3 is_32, long l) {
        is_32.SF().id_break(il_3.id_final);
    }
}

