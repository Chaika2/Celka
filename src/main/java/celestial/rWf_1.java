/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQz_1;
import celestial.rWV;
import celestial.rzE_2;
import celestial.rzM_2;
import celestial.rzm_3;
import celestial.rzt_3;

public class rWf_1
extends rzt_3 {
    public rWf_1(rzE_2[] rzE_2Array, rQz_1[] rQz_1Array) {
        super(rzE_2Array, rQz_1Array);
    }

    @Override
    protected rWV id_class(rWV[] rWVArray) {
        switch (rWVArray.length) {
            case 0: {
                return id_break;
            }
            case 1: {
                return rWVArray[0];
            }
            case 2: {
                rWV rWV2 = rWVArray[0];
                rWV rWV3 = rWVArray[1];
                return (rzr_32, consumer) -> {
                    rWV2.expand(rzr_32, consumer);
                    rWV3.expand(rzr_32, consumer);
                    return true;
                };
            }
        }
        return (rzr_32, consumer) -> {
            for (rWV rWV2 : rWVArray) {
                rWV2.expand(rzr_32, consumer);
            }
            return true;
        };
    }

    @Override
    public rzm_3 id_class() {
        return rzM_2.id_private;
    }
}

