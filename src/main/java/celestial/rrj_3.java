/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.iq_3;
import celestial.rPm_1;
import celestial.rrEm_1;
import celestial.rrEr_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrj_3
extends rPm_1<iB_2> {
    public rrj_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_throw, (Object)((Object)iC_2.VALUE_PRESENT)));
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iZ_2<?> iZ_22 = iB_22.SF();
        rrEr_1 rrEr_12 = rrEm_12.id_interface(iB_22.Bs());
        if (rrEr_12 == null) {
            iZ_22.id_class(iq_3.id_finally);
        }
    }
}

