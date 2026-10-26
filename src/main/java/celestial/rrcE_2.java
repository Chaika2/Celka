/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcG_2;
import celestial.rrcT_2;
import celestial.rrfI_2;

public class rrcE_2
implements rrcT_2<Boolean> {
    @Override
    public rrfI_2<Boolean> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcG_2(this, rrNw_12, rrNd_12);
    }
}

