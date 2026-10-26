/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfD_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPq_1
extends rPm_1<iB_2> {
    private final float id_class;
    private final int id_byte;

    public rPq_1(float f, int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_final, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = f;
        this.id_byte = n;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iZ_2<?> iZ_22 = iB_22.SF();
        rfD_2 rfD_22 = iZ_22.id_byte(il_3.id_final).get();
        iZ_22.id_class(il_3.id_volatile, new iH_2(rfD_22, this.id_class, this.id_byte));
    }
}

