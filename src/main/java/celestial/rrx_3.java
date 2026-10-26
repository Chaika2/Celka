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
import celestial.rPm_1;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsp_3;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrx_3
extends rPm_1<rsq_3> {
    public rrx_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_byte, (Object)((Object)iC_2.VALUE_ABSENT)));
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_32.id_class(rsq_32.su().id_class(rsT_2.id_class));
        rsq_32.id_byte(rrEm_12);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rsp_3 rsp_32 = rsq_32.su();
        return rsp_32.id_break() != rsT_2.id_class && rsp_32.id_break() != rsT_2.id_native && rsq_32.id_protected() == 0 && rsp_32.id_byte() <= 1;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

