/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rqb_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Predicate;

public class rPs_1<E extends is_3, T>
extends rPm_1<E> {
    private final Predicate<E> id_class;
    private final il_3<? extends T> id_byte;
    private final il_3<T> id_protected;
    private final rqb_3 id_throws;

    public rPs_1(Predicate<E> predicate, il_3<? extends T> il_32, il_3<T> il_33, rqb_3 rqb_32) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_32, (Object)((Object)iC_2.VALUE_PRESENT), il_33, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = predicate;
        this.id_byte = il_32;
        this.id_protected = il_33;
        this.id_throws = rqb_32;
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        iZ_2<?> iZ_22 = ((iB_2)e).SF();
        iZ_22.id_class(this.id_protected, iZ_22.id_byte(this.id_byte).get(), this.id_throws.id_class(rrEm_12.id_int));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return this.id_class.test(e);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (is_3)iB_22, l);
    }
}

