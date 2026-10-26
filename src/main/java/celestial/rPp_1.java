/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rfY_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class rPp_1
extends rPm_1<aA_2> {
    private Map<iB_2, Integer> id_byte(aA_2 aA_22) {
        HashMap hashMap = Maps.newHashMap();
        this.id_protected(aA_22).stream().filter(this::id_byte).forEach(iB_23 -> {
            Integer n2 = hashMap.compute(this.id_class((iB_2)iB_23), (iB_22, n) -> n == null ? 1 : n + 1);
        });
        return hashMap;
    }

    private boolean id_byte(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_new).isPresent();
    }

    public rPp_1() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_implements, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_new, (Object)((Object)iC_2.REGISTERED)));
    }

    private iB_2 id_class(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_new).get();
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        iB_2 iB_23 = this.id_break((iB_2)aA_22);
        if (iB_23 != null) {
            this.id_class(rrEm_12, aA_22, iB_23);
        } else {
            Optional<iB_2> optional = this.id_break(aA_22);
            if (optional.isPresent()) {
                rPp_1.id_class(aA_22, optional.get());
            } else {
                this.id_class(aA_22).ifPresent(iB_22 -> rPp_1.id_class(aA_22, iB_22));
            }
        }
    }

    private boolean id_class(iB_2 iB_22, iB_2 iB_24) {
        return iB_24.SF().id_byte(il_3.id_new).filter(iB_23 -> iB_23 == iB_22).isPresent();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, aA_2 aA_22) {
        return rrEm_12.id_long().nextInt(10) == 0 && this.id_throws(aA_22);
    }

    private static void id_class(aA_2 aA_22, iB_2 iB_22) {
        iZ_2<?> iZ_22 = aA_22.SF();
        iZ_22.id_class(il_3.id_new, iB_22);
        iZ_22.id_class(il_3.id_final, new rfY_2(iB_22, true));
        iZ_22.id_class(il_3.id_volatile, new iH_2(new rfY_2(iB_22, false), 0.6f, 1));
    }

    private Optional<iB_2> id_class(aA_2 aA_22) {
        return this.id_protected(aA_22).stream().findAny();
    }

    private void id_class(rrEm_1 rrEm_12, aA_2 aA_22, iB_2 iB_22) {
        for (int i = 0; i < 10; ++i) {
            rjU_2 rjU_22 = iX_2.id_break(aA_22, 20, 8);
            if (rjU_22 == null || !rrEm_12.id_throw(new rfH_2(rjU_22))) continue;
            aA_22.SF().id_class(il_3.id_volatile, new iH_2(rjU_22, 0.6f, 0));
            return;
        }
    }

    private Optional<iB_2> id_break(aA_2 aA_22) {
        Map<iB_2, Integer> map = this.id_byte(aA_22);
        return map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).filter(entry -> (Integer)entry.getValue() > 0 && (Integer)entry.getValue() <= 5).map(Map.Entry::getKey).findFirst();
    }

    private iB_2 id_break(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_implements).get().stream().filter(iB_23 -> this.id_class(iB_22, (iB_2)iB_23)).findAny().orElse(null);
    }

    private boolean id_throws(aA_2 aA_22) {
        return aA_22.SF().id_class(il_3.id_implements);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }

    private List<iB_2> id_protected(aA_2 aA_22) {
        return aA_22.SF().id_byte(il_3.id_implements).get();
    }
}

