/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rfY_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrU_2
extends rPm_1<is_3> {
    private final float id_class;

    public rrU_2(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_private, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = f;
    }

    private void id_class(iB_2 iB_22) {
        iB_22.SF().id_break(il_3.id_volatile);
    }

    private void id_class(iB_2 iB_22, iB_2 iB_23) {
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_class(il_3.id_final, new rfY_2(iB_23, true));
        iH_2 iH_22 = new iH_2(new rfY_2(iB_23, false), this.id_class, 0);
        iZ_22.id_class(il_3.id_volatile, iH_22);
    }

    protected void id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        iB_2 iB_22 = is_32.SF().id_byte(il_3.id_package).get();
        if (iA_2.id_byte(is_32, iB_22) && iA_2.id_class(is_32, iB_22, 1)) {
            this.id_class(is_32);
        } else {
            this.id_class(is_32, iB_22);
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

