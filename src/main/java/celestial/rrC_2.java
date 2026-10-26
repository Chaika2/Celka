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
import celestial.il_3;
import celestial.iq_3;
import celestial.rPm_1;
import celestial.rRP;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rga_3;
import celestial.rrEm_1;
import celestial.rsq_3;
import celestial.ruP_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrC_2
extends rPm_1<rsq_3> {
    public final float id_class;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        Optional<rfK_2> optional = rsq_32.SF().id_byte(il_3.id_protected);
        optional.ifPresent(rfK_22 -> {
            rfH_2 rfH_22 = rfK_22.id_break();
            rrEm_1 rrEm_13 = rrEm_12.id_const().id_class(rfK_22.id_class());
            if (rrEm_13 != null) {
                rga_3 rga_32 = rrEm_13.d();
                if (rga_32.id_class(rfH_22, (rRP rRP2) -> true)) {
                    rga_32.id_break(rfH_22);
                }
                ruP_2.id_byte(rrEm_12, rfH_22);
            }
        });
        rsq_32.SF().id_break(il_3.id_protected);
    }

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }

    public rrC_2(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_protected, (Object)((Object)iC_2.VALUE_PRESENT)), 1200);
        this.id_class = f;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return rsq_32.SF().id_class(il_3.id_protected);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        return rsq_32.SF().id_protected().map(iq_32 -> iq_32 == iq_3.id_break || iq_32 == iq_3.id_byte || iq_32 == iq_3.id_protected).orElse(true);
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_byte(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        iA_2.id_class((iB_2)rsq_32, rsq_32.SF().id_byte(il_3.id_protected).get().id_break(), this.id_class, 1);
    }
}

