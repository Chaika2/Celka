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
import celestial.rYB;
import celestial.rpJ_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class rrn_3<E extends is_3>
extends rPm_1<E> {
    private final Predicate<iB_2> id_class;

    private boolean id_byte(E e) {
        Optional<iB_2> optional = ((iB_2)e).SF().id_byte(il_3.id_package);
        return optional.isPresent() && !optional.get().BM();
    }

    public rrn_3(Predicate<iB_2> predicate) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_interface, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = predicate;
    }

    public rrn_3() {
        this((iB_2 iB_22) -> false);
    }

    private static <E extends iB_2> boolean id_class(E e) {
        Optional<Long> optional = e.SF().id_byte(il_3.id_interface);
        return optional.isPresent() && ((rYB)e.id_throws[7]).r() - optional.get() > 200L;
    }

    private boolean id_class(E e) {
        return (rYB)this.id_break(e).id_throws[7] != (rYB)((is_3)e).id_throws[7];
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        if (rrn_3.id_class(e)) {
            this.id_protected(e);
        } else if (this.id_byte(e)) {
            this.id_protected(e);
        } else if (this.id_class(e)) {
            this.id_protected(e);
        } else if (!rpJ_2.id_case.test(this.id_break(e))) {
            this.id_protected(e);
        } else if (this.id_class.test(this.id_break(e))) {
            this.id_protected(e);
        }
    }

    private iB_2 id_break(E e) {
        return ((iB_2)e).SF().id_byte(il_3.id_package).get();
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }

    private void id_protected(E e) {
        ((iB_2)e).SF().id_break(il_3.id_package);
    }
}

