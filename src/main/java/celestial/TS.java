/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aI_2;
import celestial.pg_3;
import celestial.pk_3;
import celestial.rOD;
import celestial.rqO_2;
import celestial.tV_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class TS
extends pk_3<rOD, tV_2<rOD>> {
    private static final Map<aI_2<?>, rqO_2> id_class = Maps.newHashMap((Map)ImmutableMap.of(aI_2.rE, (Object)new rqO_2("textures/entity/horse/horse_zombie.png"), aI_2.n, (Object)new rqO_2("textures/entity/horse/horse_skeleton.png")));

    public TS(pg_3 pg_32) {
        super(pg_32, new tV_2(0.0f), 1.0f);
    }

    @Override
    public rqO_2 id_class(rOD rOD2) {
        return id_class.get(rOD2.BC());
    }
}

