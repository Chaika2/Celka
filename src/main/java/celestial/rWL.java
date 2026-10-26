/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWA;
import celestial.rWV;
import celestial.rzE_2;
import celestial.rzG_2;
import celestial.rzM_2;
import celestial.rzm_3;
import celestial.rzt_3;
import org.apache.commons.lang3.ArrayUtils;

public class rWL
extends rzt_3 {
    public rWL(rzE_2[] rzE_2Array, rQz_1[] rQz_1Array) {
        super(rzE_2Array, rQz_1Array);
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        super.id_class(rQs_12);
        for (int i = 0; i < this.id_protected.length - 1; ++i) {
            if (!ArrayUtils.isEmpty((Object[])this.id_protected[i].id_byte)) continue;
            rQs_12.id_class("Unreachable entry!");
        }
    }

    public static rWA id_class(rzG_2<?> ... rzG_2Array) {
        return new rWA(rzG_2Array);
    }

    @Override
    protected rWV id_class(rWV[] rWVArray) {
        switch (rWVArray.length) {
            case 0: {
                return id_class;
            }
            case 1: {
                return rWVArray[0];
            }
            case 2: {
                return rWVArray[0].id_break(rWVArray[1]);
            }
        }
        return (rzr_32, consumer) -> {
            for (rWV rWV2 : rWVArray) {
                if (!rWV2.expand(rzr_32, consumer)) continue;
                return true;
            }
            return false;
        };
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_case;
    }
}

