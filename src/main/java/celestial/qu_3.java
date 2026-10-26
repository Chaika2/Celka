/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Tg_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rMF;
import celestial.rML;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.tL_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class qu_3
extends qc_3<rMF, tL_2<rMF>> {
    private static final Map<rML, rqO_2> id_class = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(rML.BROWN, new rqO_2("textures/entity/cow/brown_mooshroom.png"));
        hashMap.put(rML.RED, new rqO_2("textures/entity/cow/red_mooshroom.png"));
    });

    public qu_3(pg_3 pg_32) {
        super(pg_32, new tL_2(), 0.7f);
        this.id_class(new Tg_1<rMF>(this));
    }

    @Override
    public rqO_2 id_class(rMF rMF2) {
        return id_class.get((Object)rMF2.n());
    }
}

