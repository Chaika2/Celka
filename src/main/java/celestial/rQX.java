/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.hC_2;
import celestial.hn_3;
import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rjU_2;
import celestial.rye_3;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQX
implements rQz_1 {
    public final hn_3 id_class;

    public rQX(hn_3 hn_32) {
        this.id_class = hn_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        rye_3 rye_32 = rzr_32.id_break(rzQ_2.id_byte);
        rjU_2 rjU_22 = rzr_32.id_break(rzQ_2.id_case);
        return rjU_22 != null && rye_32 != null && this.id_class.id_class(rzr_32.id_byte(), rjU_22, rye_32);
    }

    public static rQQ id_class(hC_2 hC_22) {
        return () -> new rQX(hC_22.id_break());
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_case, rzQ_2.id_byte);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_native;
    }
}

