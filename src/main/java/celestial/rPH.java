/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rga_3;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPH
extends rPm_1<rsq_3> {
    private final float id_class;
    private final int id_byte;

    public rPH(float f, int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
        this.id_byte = n;
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rga_3 rga_32 = rrEm_12.d();
        int n = rga_32.id_class(rjh_3.id_class(rsq_32.Bs()));
        rjU_2 rjU_22 = null;
        for (int i = 0; i < 5; ++i) {
            rjU_2 rjU_23 = iX_2.id_class((aA_2)rsq_32, 15, 7, rfH_22 -> -rrEm_12.id_break(rjh_3.id_class(rfH_22)));
            if (rjU_23 == null) continue;
            int n2 = rga_32.id_class(rjh_3.id_class(new rfH_2(rjU_23)));
            if (n2 < n) {
                rjU_22 = rjU_23;
                break;
            }
            if (n2 != n) continue;
            rjU_22 = rjU_23;
        }
        if (rjU_22 != null) {
            rsq_32.SF().id_class(il_3.id_volatile, new iH_2(rjU_22, this.id_class, this.id_byte));
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        return !rrEm_12.id_throw(rsq_32.Bs());
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

