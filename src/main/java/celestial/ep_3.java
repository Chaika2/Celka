/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.eU_2;
import celestial.rdb_3;
import celestial.xd_3;

public final class ep_3
extends eC_2 {
    @Override
    public boolean id_class(rdb_3 rdb_32) {
        return rdb_32 instanceof eU_2 || xd_3.id_class(rdb_32) instanceof eU_2;
    }
}

