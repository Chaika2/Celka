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
import celestial.is_3;
import celestial.rPm_1;
import celestial.rfU_2;
import celestial.rfY_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrM_2<E extends is_3>
extends rPm_1<E> {
    private final int id_class;
    private final float id_byte;

    private iB_2 id_byte(E e) {
        return ((iB_2)e).SF().id_byte(il_3.id_package).get();
    }

    public rrM_2(int n, float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = n;
        this.id_byte = f;
    }

    private boolean id_class(E e) {
        return ((iB_2)e).SF().id_byte(il_3.id_private).get().contains(this.id_byte(e));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return this.id_class(e) && this.id_break(e);
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        ((iB_2)e).SF().id_class(il_3.id_final, new rfY_2(this.id_byte(e), true));
        ((is_3)e).id_super().id_class(-this.id_byte, 0.0f);
        Float f = Float.valueOf(rfU_2.id_break(((Float)((is_3)e).id_throws[15]).floatValue(), ((Float)((is_3)e).id_private[25]).floatValue(), 0.0f));
        ((is_3)e).id_throws[15] = f;
    }

    private boolean id_break(E e) {
        return this.id_byte(e).id_class((an_3)e, (double)this.id_class);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

