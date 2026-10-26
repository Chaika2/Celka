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
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfY_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class rrL_2
extends rPm_1<iB_2> {
    private final aI_2<?> id_class;
    private final int id_byte;
    private final Predicate<iB_2> id_protected;
    private final Predicate<iB_2> id_throws;

    public rrL_2(aI_2<?> aI_22, int n, Predicate<iB_2> predicate, Predicate<iB_2> predicate2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_new, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = aI_22;
        this.id_byte = n * n;
        this.id_protected = predicate2;
        this.id_throws = predicate;
    }

    public rrL_2(aI_2<?> aI_22, int n) {
        this(aI_22, n, iB_22 -> true, iB_22 -> true);
    }

    private boolean id_class(iB_2 iB_22) {
        return this.id_class.equals(iB_22.BC()) && this.id_protected.test(iB_22);
    }

    @Override
    public boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return this.id_throws.test(iB_22) && this.id_break(iB_22).stream().anyMatch(this::id_class);
    }

    private List<iB_2> id_break(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_private).get();
    }

    @Override
    public void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        super.id_protected(rrEm_12, iB_22, l);
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_byte(il_3.id_private).ifPresent(list -> list.stream().filter(iB_23 -> iB_23.id_int(iB_22) <= (double)this.id_byte).filter(this::id_class).findFirst().ifPresent(iB_22 -> {
            iZ_22.id_class(il_3.id_new, iB_22);
            iZ_22.id_class(il_3.id_final, new rfY_2((an_3)iB_22, true));
        }));
    }
}

