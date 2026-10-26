/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.eA_2;
import celestial.ev_3;
import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rdn_3;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQt_1
implements rQz_1 {
    public final ev_3 id_class;
    public final float[] id_break;

    public rQt_1(ev_3 ev_32, float[] fArray) {
        this.id_class = ev_32;
        this.id_break = fArray;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        rdn_3 rdn_32 = rzr_32.id_break(rzQ_2.id_implements);
        int n = rdn_32 != null ? eA_2.id_class(this.id_class, rdn_32) : 0;
        float f = this.id_break[Math.min(n, this.id_break.length - 1)];
        return rzr_32.id_class().nextFloat() < f;
    }

    public static rQQ id_class(ev_3 ev_32, float ... fArray) {
        return () -> new rQt_1(ev_32, fArray);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_implements);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_finally;
    }
}

