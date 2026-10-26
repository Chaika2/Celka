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

public class rrh_3
extends rPm_1<iB_2> {
    public rrh_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of());
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return rrEm_12.id_int.nextInt(20) == 0;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iZ_2<?> iZ_22 = iB_22.SF();
        rrEr_1 rrEr_12 = rrEm_12.id_interface(iB_22.Bs());
        if (rrEr_12 != null) {
            if (rrEr_12.id_byte() && !rrEr_12.id_break()) {
                iZ_22.id_break(iq_3.id_private);
                iZ_22.id_class(iq_3.id_private);
            } else {
                iZ_22.id_break(iq_3.id_implements);
                iZ_22.id_class(iq_3.id_implements);
            }
        }
    }
}

