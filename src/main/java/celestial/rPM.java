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
import celestial.rPm_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xX_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPM
extends rPm_1<iB_2> {
    public rPM() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_throws, (Object)((Object)iC_2.VALUE_PRESENT)));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return rrEm_12.id_int.nextFloat() > 0.95f;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        xc_3 xc_32;
        iZ_2<?> iZ_22 = iB_22.SF();
        rfH_2 rfH_22 = iZ_22.id_byte(il_3.id_throws).get().id_break();
        if (rfH_22.id_class(iB_22.Bs(), 3.0) && (xc_32 = rrEm_12.id_byte(rfH_22)).id_class(xu_3.Xb)) {
            xX_2 xX_22 = (xX_2)xc_32.id_break();
            xX_22.id_class((rYB)rrEm_12, rfH_22, (rpr_3)null);
        }
    }
}

