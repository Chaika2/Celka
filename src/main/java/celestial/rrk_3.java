/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPB;
import celestial.rPm_1;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrk_3
extends rPm_1<rsq_3> {
    public rrk_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of());
    }

    private static boolean id_class(rsq_3 rsq_32) {
        return rsq_32.SF().id_byte(il_3.id_goto).filter(iB_22 -> iB_22.id_int(rsq_32) <= 36.0).isPresent();
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        boolean bl;
        boolean bl2 = bl = rPB.id_break(rsq_32) || rPB.id_class(rsq_32) || rrk_3.id_class(rsq_32);
        if (!bl) {
            rsq_32.SF().id_break(il_3.id_public);
            rsq_32.SF().id_break(il_3.id_goto);
            rsq_32.SF().id_class(rrEm_12.P(), rrEm_12.r());
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

