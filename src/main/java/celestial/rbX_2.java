/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rbk_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rbX_2<E extends rbk_3>
extends rPm_1<E> {
    private final int id_class;

    public rbX_2(int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_const, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_static, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = n;
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        ((rbk_3)e).SF().id_break(il_3.id_const);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        if (!((iB_2)e).Sn().id_class()) {
            return false;
        }
        Optional<rsE_2> optional = ((rbk_3)e).SF().id_byte(il_3.id_static);
        if (!optional.isPresent()) {
            return true;
        }
        return !optional.get().id_class((an_3)e, (double)this.id_class);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbk_3)iB_22, l);
    }
}

