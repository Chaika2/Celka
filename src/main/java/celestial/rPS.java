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
import celestial.rsE_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Predicate;

public class rPS<E extends iB_2>
extends rPm_1<E> {
    private final Predicate<E> id_class;
    private final int id_byte;
    private final float id_protected;

    public rPS(float f, boolean bl, int n) {
        this(iB_22 -> true, f, bl, n);
    }

    public rPS(Predicate<E> predicate, float f, boolean bl, int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_volatile, (Object)((Object)(bl ? iC_2.REGISTERED : iC_2.VALUE_ABSENT)), il_3.id_static, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = predicate;
        this.id_byte = n;
        this.id_protected = f;
    }

    private rsE_2 id_class(E e) {
        return ((iB_2)e).SF().id_byte(il_3.id_static).get();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return this.id_class.test(e) && this.id_class(e).id_class((an_3)e, (double)this.id_byte);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        iA_2.id_class(e, this.id_class(e), this.id_protected, 0);
    }
}

