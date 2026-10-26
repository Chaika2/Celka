/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Jq_1;
import celestial.aI_2;
import celestial.eA_2;
import celestial.eY_2;
import celestial.rGZ;
import celestial.rRW;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class WT
extends xd_3 {
    private final xd_3 id_volatile;
    private static final Map<xd_3, xd_3> id_final = Maps.newIdentityHashMap();

    public WT(xd_3 xd_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_volatile = xd_32;
        id_final.put(xd_32, this);
    }

    public static xc_3 id_class(xd_3 xd_32) {
        return id_final.get(xd_32).id_continue();
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        super.id_class(xc_32, rrEm_12, rfH_22, rdn_32);
        if (rrEm_12.B().id_break(rRu_1.id_case) && eA_2.id_class(eY_2.id_else, rdn_32) == 0) {
            this.id_class(rrEm_12, rfH_22);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, rRW rRW2) {
        if (rYB2 instanceof rrEm_1) {
            this.id_class((rrEm_1)rYB2, rfH_22);
        }
    }

    private void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        rGZ rGZ2 = aI_2.L.id_class(rrEm_12);
        rGZ2.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_(), (double)rfH_22.d_() + 0.5, 0.0f, 0.0f);
        rrEm_12.a_(rGZ2);
        rGZ2.id_float();
    }

    public xd_3 id_break() {
        return this.id_volatile;
    }

    public static boolean id_private(xc_3 xc_32) {
        return id_final.containsKey(xc_32.id_break());
    }
}

