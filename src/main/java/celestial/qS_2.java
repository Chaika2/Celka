/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Tj_1;
import celestial.Tt_1;
import celestial.pg_3;
import celestial.pk_3;
import celestial.rOU;
import celestial.rOi_1;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.tV_2;
import com.google.common.collect.Maps;
import java.util.Map;

public final class qS_2
extends pk_3<rOi_1, tV_2<rOi_1>> {
    private static final Map<rOU, rqO_2> id_class = rqR_2.id_class(Maps.newEnumMap(rOU.class), enumMap -> {
        enumMap.put(rOU.WHITE, new rqO_2("textures/entity/horse/horse_white.png"));
        enumMap.put(rOU.CREAMY, new rqO_2("textures/entity/horse/horse_creamy.png"));
        enumMap.put(rOU.CHESTNUT, new rqO_2("textures/entity/horse/horse_chestnut.png"));
        enumMap.put(rOU.BROWN, new rqO_2("textures/entity/horse/horse_brown.png"));
        enumMap.put(rOU.BLACK, new rqO_2("textures/entity/horse/horse_black.png"));
        enumMap.put(rOU.GRAY, new rqO_2("textures/entity/horse/horse_gray.png"));
        enumMap.put(rOU.DARKBROWN, new rqO_2("textures/entity/horse/horse_darkbrown.png"));
    });

    public qS_2(pg_3 pg_32) {
        super(pg_32, new tV_2(0.0f), 1.1f);
        this.id_class(new Tt_1(this));
        this.id_class(new Tj_1(this));
    }

    @Override
    public rqO_2 id_class(rOi_1 rOi_12) {
        return id_class.get((Object)rOi_12.sJ());
    }
}

