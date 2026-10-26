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
import celestial.rEg_1;
import celestial.rPm_1;
import celestial.rbW_2;
import celestial.rbk_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rbQ_2<E extends rbk_3>
extends rPm_1<E> {
    public rbQ_2() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.r, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_short, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_for, (Object)((Object)iC_2.VALUE_ABSENT), il_3.s, (Object)((Object)iC_2.REGISTERED)));
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        rEg_1 rEg_12 = ((rbk_3)e).SF().id_byte(il_3.r).get();
        rbW_2.id_byte(e, (iB_2)rEg_12);
        rbW_2.id_byte(e);
        rbW_2.id_break(e, (iB_2)rEg_12);
        rbW_2.id_case(e);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rbk_3 rbk_32) {
        return !rbk_32.n_() && !rbW_2.id_throws(rbk_32);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbk_3)iB_22, l);
    }
}

