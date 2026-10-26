/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.rXQ;
import celestial.rdb_3;
import celestial.rxS_2;

public final class eI_2
extends eC_2 {
    @Override
    public boolean id_class(rdb_3 rdb_32) {
        return rdb_32 instanceof rxS_2 && ((rxS_2)rdb_32).id_byte() == rXQ.CHEST;
    }
}

