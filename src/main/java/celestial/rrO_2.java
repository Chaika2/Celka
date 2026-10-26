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
import celestial.is_3;
import celestial.rPm_1;
import celestial.rdb_3;
import celestial.rkB_2;
import celestial.rpm_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrO_2
extends rPm_1<is_3> {
    private final int id_class;

    public rrO_2(int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_int, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = n;
    }

    protected void id_class(rrEm_1 rrEm_12, is_3 is_32, long l) {
        iB_2 iB_22 = this.id_break(is_32);
        iA_2.id_class((iB_2)is_32, iB_22);
        is_32.id_class(rpm_3.MAIN_HAND);
        is_32.id_public(iB_22);
        is_32.SF().id_class(il_3.id_int, true, this.id_class);
    }

    private boolean id_class(is_3 is_32) {
        return ((iB_2)is_32).id_class((rdb_3 rdb_32) -> rdb_32 instanceof rkB_2 && is_32.id_class((rkB_2)rdb_32));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, is_3 is_32) {
        iB_2 iB_22 = this.id_break(is_32);
        return !this.id_class(is_32) && iA_2.id_byte(is_32, iB_22) && iA_2.id_break(is_32, iB_22);
    }

    private iB_2 id_break(is_3 is_32) {
        return is_32.SF().id_byte(il_3.id_package).get();
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

