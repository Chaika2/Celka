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
import celestial.rrEm_1;
import celestial.rsE_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rbO_2<E extends rbk_3>
extends rPm_1<E> {
    private final int id_class;

    public rbO_2(int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_static, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_const, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_transient, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_boolean, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = n;
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        ((rbk_3)e).SF().id_class(il_3.id_const, true, this.id_class);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        rsE_2 rsE_22 = ((rbk_3)e).SF().id_byte(il_3.id_static).get();
        return rbW_2.id_class(rsE_22.id_protected().id_break());
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbk_3)iB_22, l);
    }
}

