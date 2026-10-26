/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcV_2;
import celestial.rrcg_3;
import celestial.rrfI_2;

public class rrcj_3
implements rrcT_2<rrcg_3> {
    @Override
    public rrfI_2<rrcg_3> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcV_2(this, rrNw_12, rrNd_12);
    }
}

