/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.Tc_1;
import celestial.aI_2;
import celestial.iB_2;
import celestial.is_3;
import celestial.pg_3;
import celestial.pm_3;
import celestial.rbM_2;
import celestial.rqO_2;
import celestial.tW_2;
import celestial.wO_2;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class qn_3
extends pm_3<is_3, wO_2<is_3>> {
    private static final Map<aI_2<?>, rqO_2> id_class = ImmutableMap.of(aI_2.d, (Object)new rqO_2("textures/entity/piglin/piglin.png"), aI_2.rb, (Object)new rqO_2("textures/entity/piglin/zombified_piglin.png"), aI_2.k, (Object)new rqO_2("textures/entity/piglin/piglin_brute.png"));

    protected boolean id_byte(is_3 is_32) {
        return is_32 instanceof rbM_2 && ((rbM_2)is_32).sJ();
    }

    public qn_3(pg_3 pg_32, boolean bl) {
        super(pg_32, qn_3.id_class(bl), 0.5f, 1.0019531f, 1.0f, 1.0019531f);
        this.id_class(new Tc_1(this, new tW_2(0.5f), new tW_2(1.02f)));
    }

    @Override
    public rqO_2 id_class(is_3 is_32) {
        rqO_2 rqO_22 = id_class.get(is_32.BC());
        if (rqO_22 == null) {
            throw new IllegalArgumentException("I don't know what texture to use for " + is_32.BC());
        }
        return rqO_22;
    }

    @Override
    protected /* synthetic */ boolean id_class(iB_2 iB_22) {
        return this.id_byte((is_3)iB_22);
    }

    private static wO_2<is_3> id_class(boolean bl) {
        wO_2<is_3> wO_22 = new wO_2<is_3>(0.0f, 64, 64);
        if (bl) {
            wO_22.id_volatile.id_finally = false;
        }
        return wO_22;
    }
}

