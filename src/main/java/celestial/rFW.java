/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.At_1;
import celestial.rCi_1;
import celestial.rVL;
import celestial.rlr_3;
import celestial.ruS_2;
import celestial.ruu_3;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.util.Map;

public class rFW
implements ruS_2<At_1> {
    private Object2IntMap<rCi_1<?>> id_class;

    public rFW() {
    }

    public rFW(Object2IntMap<rCi_1<?>> object2IntMap) {
        this.id_class = object2IntMap;
    }

    private <T> int id_class(rCi_1<T> rCi_12) {
        return rCi_12.id_protected().id_class().id_class(rCi_12.id_throws());
    }

    private <T> void id_class(rlr_3<T> rlr_32, ruu_3 ruu_32) {
        int n = ruu_32.id_case();
        int n2 = ruu_32.id_case();
        this.id_class.put(rlr_32.id_break(rlr_32.id_class().id_class(n)), n2);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        int n = ruu_32.id_case();
        this.id_class = new Object2IntOpenHashMap(n);
        for (int i = 0; i < n; ++i) {
            this.id_class((rlr_3)rVL.h.id_class(ruu_32.id_case()), ruu_32);
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class.size());
        for (Object2IntMap.Entry entry : this.id_class.object2IntEntrySet()) {
            rCi_1 rCi_12 = (rCi_1)entry.getKey();
            ruu_32.id_protected(rVL.h.id_class(rCi_12.id_protected()));
            ruu_32.id_protected(this.id_class(rCi_12));
            ruu_32.id_protected(entry.getIntValue());
        }
    }

    public Map<rCi_1<?>, Integer> id_break() {
        return this.id_class;
    }
}

