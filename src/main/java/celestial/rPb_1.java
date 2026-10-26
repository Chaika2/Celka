/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.an_3;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPb_1<E extends iB_2>
extends rPm_1<E> {
    private final float id_class;

    public rPb_1(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_super, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = f;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return !((an_3)e).Pm();
    }

    private boolean id_class(E e) {
        return this.id_break(e).id_class((an_3)e, 1.0);
    }

    private an_3 id_break(E e) {
        return ((iB_2)e).SF().id_byte(il_3.id_super).get();
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        if (this.id_class(e)) {
            ((an_3)e).id_this(this.id_break(e));
        } else {
            iA_2.id_class(e, this.id_break(e), this.id_class, 1);
        }
    }
}

