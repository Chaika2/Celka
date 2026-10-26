/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Random;
import java.util.Set;

public class rQq_1
implements rQz_1 {
    public static final rQq_1 id_class = new rQq_1();

    public static rQQ id_byte() {
        return () -> id_class;
    }

    private rQq_1() {
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_finally);
    }

    public boolean id_class(rzr_3 rzr_32) {
        Float f = rzr_32.id_break(rzQ_2.id_finally);
        if (f != null) {
            Random random = rzr_32.id_class();
            float f2 = 1.0f / f.floatValue();
            return random.nextFloat() <= f2;
        }
        return true;
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_extends;
    }
}

