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
import celestial.rPm_1;
import celestial.rRP;
import celestial.rfK_2;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPu_1
extends rPm_1<rsq_3> {
    public final rsT_2 id_class;

    public rPu_1(rsT_2 rsT_22) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_byte, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_catch, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = rsT_22;
    }

    private boolean id_class(rRP rRP2, rsT_2 rsT_22) {
        return rsT_22.id_class().id_break().test(rRP2);
    }

    private boolean id_class(rsq_3 rsq_32) {
        return rsq_32.SF().id_byte(il_3.id_byte).isPresent();
    }

    private boolean id_class(rfK_2 rfK_22, rRP rRP2, rsq_3 rsq_32) {
        return this.id_class(rsq_32) && rfK_22.equals(rsq_32.SF().id_byte(il_3.id_byte).get()) && this.id_class(rRP2, rsq_32.su().id_break());
    }

    private static rsq_3 id_class(rsq_3 rsq_32, rsq_3 rsq_33) {
        rsq_3 rsq_34;
        rsq_3 rsq_35;
        if (rsq_32.id_protected() > rsq_33.id_protected()) {
            rsq_35 = rsq_32;
            rsq_34 = rsq_33;
        } else {
            rsq_35 = rsq_33;
            rsq_34 = rsq_32;
        }
        rsq_34.SF().id_break(il_3.id_byte);
        return rsq_35;
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rfK_2 rfK_22 = rsq_32.SF().id_byte(il_3.id_byte).get();
        rrEm_12.d().id_byte(rfK_22.id_break()).ifPresent(rRP2 -> iA_2.id_class(rsq_32, (rsq_3 rsq_32) -> this.id_class(rfK_22, (rRP)rRP2, (rsq_3)rsq_32)).reduce(rsq_32, rPu_1::id_class));
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

