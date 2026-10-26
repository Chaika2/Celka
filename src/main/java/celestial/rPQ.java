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
import celestial.rYB;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class rPQ<E extends iB_2, T extends an_3>
extends rPm_1<E> {
    private final int id_class;
    private final BiPredicate<E, an_3> id_byte;

    public rPQ(int n, BiPredicate<E, an_3> biPredicate) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_super, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = n;
        this.id_byte = biPredicate;
    }

    private boolean id_class(E e, an_3 an_32) {
        return an_32.BM() && an_32.id_class((an_3)e, (double)this.id_class) && (rYB)an_32.id_throws[7] == (rYB)((iB_2)e).id_throws[7];
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        an_3 an_32 = ((an_3)e).ra();
        an_3 an_33 = ((iB_2)e).SF().id_byte(il_3.id_super).orElse(null);
        if (an_32 == null && an_33 == null) {
            return false;
        }
        an_3 an_34 = an_32 == null ? an_33 : an_32;
        return !this.id_class(e, an_34) || this.id_byte.test(e, an_34);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        ((iB_2)e).BH();
        ((iB_2)e).SF().id_break(il_3.id_super);
    }
}

