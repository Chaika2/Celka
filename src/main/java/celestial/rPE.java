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
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Predicate;

public class rPE<E extends iB_2>
extends rPm_1<E> {
    private final Predicate<E> id_class;
    private final il_3<?> id_byte;

    public rPE(Predicate<E> predicate, il_3<?> il_32) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = predicate;
        this.id_byte = il_32;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return this.id_class.test(e);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        ((iB_2)e).SF().id_break(this.id_byte);
    }
}

