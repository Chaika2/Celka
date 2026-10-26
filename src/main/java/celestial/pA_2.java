/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.pg_3;
import celestial.pk_3;
import celestial.rOK;
import celestial.rqO_2;
import celestial.tj_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class pA_2<T extends rOK>
extends pk_3<T, tj_3<T>> {
    private static final Map<aI_2<?>, rqO_2> id_class = Maps.newHashMap((Map)ImmutableMap.of(aI_2.id_package, (Object)new rqO_2("textures/entity/horse/donkey.png"), aI_2.G, (Object)new rqO_2("textures/entity/horse/mule.png")));

    public pA_2(pg_3 pg_32, float f) {
        super(pg_32, new tj_3(0.0f), f);
    }

    @Override
    public rqO_2 id_class(T t) {
        return id_class.get(((an_3)t).BC());
    }
}

