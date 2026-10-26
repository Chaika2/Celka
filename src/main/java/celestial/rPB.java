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
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPB
extends rPm_1<rsq_3> {
    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        if (l % 100L == 0L) {
            rsq_32.id_class(rrEm_12, l, 3);
        }
    }

    public rPB() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of());
    }

    public static boolean id_class(iB_2 iB_22) {
        return iB_22.SF().id_class(il_3.id_try);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return rPB.id_break(rsq_32) || rPB.id_class(rsq_32);
    }

    public static boolean id_break(iB_2 iB_22) {
        return iB_22.SF().id_class(il_3.id_public);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        if (rPB.id_break(rsq_32) || rPB.id_class(rsq_32)) {
            iZ_2<rsq_3> iZ_22 = rsq_32.SF();
            if (!iZ_22.id_byte(iq_3.id_catch)) {
                iZ_22.id_break(il_3.id_this);
                iZ_22.id_break(il_3.id_volatile);
                iZ_22.id_break(il_3.id_final);
                iZ_22.id_break(il_3.id_continue);
                iZ_22.id_break(il_3.id_new);
            }
            iZ_22.id_class(iq_3.id_catch);
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (rsq_3)iB_22, l);
    }
}

