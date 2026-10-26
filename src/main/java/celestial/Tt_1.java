/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.qd_3;
import celestial.rOe_1;
import celestial.rOi_1;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.tV_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class Tt_1
extends Tf_1<rOi_1, tV_2<rOi_1>> {
    private static final Map<rOe_1, rqO_2> id_class = rqR_2.id_class(Maps.newEnumMap(rOe_1.class), enumMap -> {
        enumMap.put(rOe_1.NONE, null);
        enumMap.put(rOe_1.WHITE, new rqO_2("textures/entity/horse/horse_markings_white.png"));
        enumMap.put(rOe_1.WHITE_FIELD, new rqO_2("textures/entity/horse/horse_markings_whitefield.png"));
        enumMap.put(rOe_1.WHITE_DOTS, new rqO_2("textures/entity/horse/horse_markings_whitedots.png"));
        enumMap.put(rOe_1.BLACK_DOTS, new rqO_2("textures/entity/horse/horse_markings_blackdots.png"));
    });

    public Tt_1(qE_2<rOi_1, tV_2<rOi_1>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rOi_1 rOi_12, float f, float f2, float f3, float f4, float f5, float f6) {
        rqO_2 rqO_22 = id_class.get((Object)rOi_12.sd());
        if (rqO_22 != null && !rOi_12.Pp()) {
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_private(rqO_22));
            ((tV_2)this.id_byte()).id_class(ml_1, ok_1, n, qd_3.id_byte(rOi_12, 0.0f), 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}

