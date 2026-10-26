/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class rPn_1
extends rPm_1<aA_2> {
    private final float id_class;

    public rPn_1(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, aA_2 aA_22) {
        return !rrEm_12.id_case(aA_22.Bs());
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        rfH_2 rfH_23 = aA_22.Bs();
        List list = rfH_2.id_break(rfH_23.id_break(-1, -1, -1), rfH_23.id_break(1, 1, 1)).map(rfH_2::id_int).collect(Collectors.toList());
        Collections.shuffle(list);
        Optional<rfH_2> optional = list.stream().filter(rfH_22 -> !rrEm_12.id_case((rfH_2)rfH_22)).filter(rfH_22 -> rrEm_12.id_class((rfH_2)rfH_22, (an_3)aA_22)).filter(rfH_22 -> rrEm_12.id_throws(aA_22)).findFirst();
        optional.ifPresent(rfH_22 -> aA_22.SF().id_class(il_3.id_volatile, new iH_2((rfH_2)rfH_22, this.id_class, 0)));
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }
}

