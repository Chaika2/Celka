/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfY_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class rrR_2<E extends iB_2, T extends iB_2>
extends rPm_1<E> {
    private final int id_class;
    private final float id_byte;
    private final aI_2<? extends T> id_protected;
    private final int id_throws;
    private final Predicate<T> id_case;
    private final Predicate<E> id_catch;
    private final il_3<T> id_private;

    public rrR_2(aI_2<? extends T> aI_22, int n, Predicate<E> predicate, Predicate<T> predicate2, il_3<T> il_32, float f, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_protected = aI_22;
        this.id_byte = f;
        this.id_throws = n * n;
        this.id_class = n2;
        this.id_case = predicate2;
        this.id_catch = predicate;
        this.id_private = il_32;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return this.id_catch.test(e) && this.id_class(e);
    }

    private boolean id_class(E e) {
        List<iB_2> list = ((iB_2)e).SF().id_byte(il_3.id_private).get();
        return list.stream().anyMatch(this::id_break);
    }

    public static <T extends iB_2> rrR_2<iB_2, T> id_class(aI_2<? extends T> aI_22, int n, il_3<T> il_32, float f, int n2) {
        return new rrR_2<iB_2, iB_2>(aI_22, n, iB_22 -> true, iB_22 -> true, il_32, f, n2);
    }

    private boolean id_break(iB_2 iB_22) {
        return this.id_protected.equals(iB_22.BC()) && this.id_case.test(iB_22);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        iZ_2<?> iZ_22 = ((iB_2)e).SF();
        iZ_22.id_byte(il_3.id_private).ifPresent(list -> list.stream().filter(iB_22 -> this.id_protected.equals(iB_22.BC())).map(iB_22 -> iB_22).filter(iB_23 -> iB_23.id_int((an_3)e) <= (double)this.id_throws).filter(this.id_case).findFirst().ifPresent(iB_22 -> {
            iZ_22.id_class(this.id_private, iB_22);
            iZ_22.id_class(il_3.id_final, new rfY_2((an_3)iB_22, true));
            iZ_22.id_class(il_3.id_volatile, new iH_2(new rfY_2((an_3)iB_22, false), this.id_byte, this.id_class));
        }));
    }
}

