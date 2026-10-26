/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rnW_2;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrb_3
extends rPm_1<rsq_3> {
    public rrb_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_protected, (Object)((Object)iC_2.VALUE_PRESENT)));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rfH_2 rfH_22 = rsq_32.SF().id_byte(il_3.id_protected).get().id_break();
        return rfH_22.id_class((eX_2)rsq_32.Ps(), 2.0) || rsq_32.sz();
    }

    protected void id_class(rrEm_1 rrEm_13, rsq_3 rsq_32, long l) {
        rfK_2 rfK_22 = rsq_32.SF().id_byte(il_3.id_protected).get();
        rsq_32.SF().id_break(il_3.id_protected);
        rsq_32.SF().id_class(il_3.id_byte, rfK_22);
        rrEm_13.id_class((an_3)rsq_32, (byte)14);
        if (rsq_32.su().id_break() == rsT_2.id_class) {
            rnW_2 rnW_22 = rrEm_13.id_const();
            Optional.ofNullable(rnW_22.id_class(rfK_22.id_class())).flatMap(rrEm_12 -> rrEm_12.d().id_byte(rfK_22.id_break())).flatMap(rRP2 -> rVL.J.id_case().filter(rsT_22 -> rsT_22.id_class() == rRP2).findFirst()).ifPresent(rsT_22 -> {
                rsq_32.id_class(rsq_32.su().id_class((rsT_2)rsT_22));
                rsq_32.id_byte(rrEm_13);
            });
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

