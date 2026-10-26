/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfK_2;
import celestial.rfY_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrW_2
extends rPm_1<iB_2> {
    public rrW_2() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_throws, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_private, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_new, (Object)((Object)iC_2.VALUE_ABSENT)));
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_23) {
        iZ_2<?> iZ_22 = iB_23.SF();
        Optional<rfK_2> optional = iZ_22.id_byte(il_3.id_throws);
        return rrEm_12.id_long().nextInt(100) == 0 && optional.isPresent() && rrEm_12.E() == optional.get().id_class() && optional.get().id_break().id_class((eX_2)iB_23.Ps(), 4.0) && iZ_22.id_byte(il_3.id_private).get().stream().anyMatch(iB_22 -> aI_2.D.equals(iB_22.BC()));
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_byte(il_3.id_private).ifPresent(list -> list.stream().filter(iB_22 -> aI_2.D.equals(iB_22.BC())).filter(iB_23 -> iB_23.id_int(iB_22) <= 32.0).findFirst().ifPresent(iB_22 -> {
            iZ_22.id_class(il_3.id_new, iB_22);
            iZ_22.id_class(il_3.id_final, new rfY_2((an_3)iB_22, true));
            iZ_22.id_class(il_3.id_volatile, new iH_2(new rfY_2((an_3)iB_22, false), 0.3f, 1));
        }));
    }
}

