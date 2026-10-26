/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rhN_2;
import celestial.rpD_2;
import celestial.rvs_3;

public class rqQ_2
extends rpD_2 {
    private final rhN_2 id_class;

    @Override
    protected void id_byte(rdb_3 rdb_32) {
        super.id_byte(rdb_32);
        this.id_class.id_class.id_class(new rvs_3(rdb_32, 0));
    }

    public rqQ_2(rhN_2 rhN_22) {
        this.id_class = rhN_22;
    }

    @Override
    protected void id_break(rdb_3 rdb_32, int n) {
        super.id_break(rdb_32, n);
        this.id_class.id_class.id_class(new rvs_3(rdb_32, n));
    }
}

