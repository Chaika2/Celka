/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aH_2;
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
import java.util.Map;
import java.util.function.Predicate;

public class rro_3
extends rPm_1<iB_2> {
    private final Predicate<iB_2> id_class;
    private final float id_byte;

    public rro_3(Predicate<iB_2> predicate, float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = predicate;
        this.id_byte = f * f;
    }

    public rro_3(float f) {
        this((iB_2 iB_22) -> true, f);
    }

    public rro_3(aI_2<?> aI_22, float f) {
        this((iB_2 iB_22) -> aI_22.equals(iB_22.BC()), f);
    }

    public rro_3(aH_2 aH_22, float f) {
        this((iB_2 iB_22) -> aH_22.equals(iB_22.BC().id_throws()), f);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_private).get().stream().anyMatch(this.id_class);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_byte(il_3.id_private).ifPresent(list -> list.stream().filter(this.id_class).filter(iB_23 -> iB_23.id_int(iB_22) <= (double)this.id_byte).findFirst().ifPresent(iB_22 -> iZ_22.id_class(il_3.id_final, new rfY_2((an_3)iB_22, true))));
    }
}

