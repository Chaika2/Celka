/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.il_3;
import celestial.rKv_1;
import celestial.rPm_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class rrD_2
extends rPm_1<iB_2> {
    private final float id_class;

    public rrD_2(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
    }

    public static boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, rfH_2 rfH_22) {
        return rrEm_12.id_case(rfH_22) && (double)rrEm_12.id_class(rKv_1.MOTION_BLOCKING, rfH_22).c_() <= iB_22.re();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return !rrEm_12.id_case(iB_22.Bs());
    }

    private rjU_2 id_break(rrEm_1 rrEm_12, iB_2 iB_22) {
        Random random = iB_22.Sa();
        rfH_2 rfH_22 = iB_22.Bs();
        for (int i = 0; i < 10; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
            if (!rrD_2.id_class(rrEm_12, iB_22, rfH_23)) continue;
            return rjU_2.id_protected(rfH_23);
        }
        return null;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        Optional<rjU_2> optional = Optional.ofNullable(this.id_break(rrEm_12, iB_22));
        if (optional.isPresent()) {
            iB_22.SF().id_class(il_3.id_volatile, optional.map(rjU_22 -> new iH_2((rjU_2)rjU_22, this.id_class, 0)));
        }
    }
}

