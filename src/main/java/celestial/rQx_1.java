/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.hK_2;
import celestial.hY_2;
import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rjU_2;
import celestial.rzB_2;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQx_1
implements rQz_1 {
    public final hY_2 id_class;
    public final rzB_2 id_break;

    public rQx_1(hY_2 hY_22, rzB_2 rzB_22) {
        this.id_class = hY_22;
        this.id_break = rzB_22;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public static rQQ id_class(rzB_2 rzB_22, hK_2 hK_22) {
        return () -> new rQx_1(hK_22.id_break(), rzB_22);
    }

    public static rQQ id_class(rzB_2 rzB_22, hY_2 hY_22) {
        return () -> new rQx_1(hY_22, rzB_22);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_case, this.id_break.id_class());
    }

    public boolean id_class(rzr_3 rzr_32) {
        an_3 an_32 = rzr_32.id_break(this.id_break.id_class());
        rjU_2 rjU_22 = rzr_32.id_break(rzQ_2.id_case);
        return this.id_class.id_class(rzr_32.id_byte(), rjU_22, an_32);
    }

    public static rQQ id_class(rzB_2 rzB_22) {
        return rQx_1.id_class(rzB_22, hK_2.id_class());
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_throws;
    }
}

