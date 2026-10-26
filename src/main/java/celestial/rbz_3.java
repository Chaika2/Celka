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
import celestial.rbW_2;
import celestial.rbk_3;
import celestial.rdy_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rbz_3<E extends rbk_3>
extends rPm_1<E> {
    public rbz_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_const, (Object)((Object)iC_2.VALUE_ABSENT)));
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        rbW_2.id_class(e, true);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return !((iB_2)e).Sn().id_class() && ((iB_2)e).Sn().id_break() != rdy_3.kN;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbk_3)iB_22, l);
    }
}

