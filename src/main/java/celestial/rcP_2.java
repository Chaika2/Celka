/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Iterables
 */
package celestial;

import celestial.rLR;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rcB_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkJ_2;
import celestial.rzO_2;
import celestial.rzV_2;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Map;
import java.util.Random;

public class rcP_2
extends rzO_2 {
    public final Map<rLR, rzV_2> id_break;

    public static rcB_2 id_byte() {
        return new rcB_2();
    }

    public rcP_2(rQz_1[] rQz_1Array, Map<rLR, rzV_2> map) {
        super(rQz_1Array);
        this.id_break = ImmutableMap.copyOf(map);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_native;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        if (rdn_32.id_break() == rdy_3.ke && !this.id_break.isEmpty()) {
            Random random = rzr_32.id_class();
            int n = random.nextInt(this.id_break.size());
            Map.Entry entry = (Map.Entry)Iterables.get(this.id_break.entrySet(), (int)n);
            rLR rLR2 = (rLR)entry.getKey();
            int n2 = ((rzV_2)entry.getValue()).id_class(random);
            if (!rLR2.id_class()) {
                n2 *= 20;
            }
            rkJ_2.id_class(rdn_32, rLR2, n2);
            return rdn_32;
        }
        return rdn_32;
    }
}

