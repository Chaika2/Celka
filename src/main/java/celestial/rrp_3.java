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
import celestial.is_3;
import celestial.rPm_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class rrp_3<E extends is_3>
extends rPm_1<E> {
    private final Predicate<E> id_class;
    private final Function<E, Optional<? extends iB_2>> id_byte;

    public rrp_3(Predicate<E> predicate, Function<E, Optional<? extends iB_2>> function) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_package, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_interface, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = predicate;
        this.id_byte = function;
    }

    public rrp_3(Function<E, Optional<? extends iB_2>> function) {
        this((E is_32) -> true, function);
    }

    private void id_class(E e, iB_2 iB_22) {
        ((iB_2)e).SF().id_class(il_3.id_package, iB_22);
        ((iB_2)e).SF().id_break(il_3.id_interface);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        if (!this.id_class.test(e)) {
            return false;
        }
        Optional<? extends iB_2> optional = this.id_byte.apply(e);
        return optional.isPresent() && optional.get().BM();
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        this.id_byte.apply(e).ifPresent(iB_22 -> this.id_class(e, (iB_2)iB_22));
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

