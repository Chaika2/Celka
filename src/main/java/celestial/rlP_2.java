/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.rCi_1;
import celestial.rhd_3;
import celestial.rlr_3;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rlP_2 {
    protected final Object2IntMap<rCi_1<?>> id_class = Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap());

    public rlP_2() {
        this.id_class.defaultReturnValue(0);
    }

    public int id_class(rCi_1<?> rCi_12) {
        return this.id_class.getInt(rCi_12);
    }

    public <T> int id_class(rlr_3<T> rlr_32, T t) {
        return rlr_32.id_class(t) ? this.id_class(rlr_32.id_break(t)) : 0;
    }

    public void id_class(rhd_3 rhd_32, rCi_1<?> rCi_12, int n) {
        this.id_class.put(rCi_12, n);
    }

    public void id_break(rhd_3 rhd_32, rCi_1<?> rCi_12, int n) {
        int n2 = (int)Math.min((long)this.id_class(rCi_12) + (long)n, Integer.MAX_VALUE);
        this.id_class(rhd_32, rCi_12, n2);
    }
}

