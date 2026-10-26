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
import java.util.Set;

public class rQu_1
implements rQz_1 {
    public static final rQu_1 id_class = new rQu_1();

    public static rQQ id_byte() {
        return () -> id_class;
    }

    private rQu_1() {
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_break);
    }

    public boolean id_class(rzr_3 rzr_32) {
        return rzr_32.id_class(rzQ_2.id_break);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_case;
    }
}

