/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rMZ;
import celestial.rMv_1;
import celestial.rqO_2;
import celestial.tD_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Tw_1
extends Tf_1<rMZ, tD_2<rMZ>> {
    private static final Map<rMv_1, rqO_2> id_class = ImmutableMap.of((Object)((Object)rMv_1.LOW), (Object)new rqO_2("textures/entity/iron_golem/iron_golem_crackiness_low.png"), (Object)((Object)rMv_1.MEDIUM), (Object)new rqO_2("textures/entity/iron_golem/iron_golem_crackiness_medium.png"), (Object)((Object)rMv_1.HIGH), (Object)new rqO_2("textures/entity/iron_golem/iron_golem_crackiness_high.png"));

    public Tw_1(qE_2<rMZ, tD_2<rMZ>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rMZ rMZ2, float f, float f2, float f3, float f4, float f5, float f6) {
        rMv_1 rMv_12;
        if (!rMZ2.Pp() && (rMv_12 = rMZ2.n()) != rMv_1.NONE) {
            rqO_2 rqO_22 = id_class.get((Object)rMv_12);
            Tw_1.id_class(this.id_byte(), rqO_22, ml_1, hx_1, n, rMZ2, 1.0f, 1.0f, 1.0f);
        }
    }
}

