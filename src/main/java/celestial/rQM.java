/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.JS;
import celestial.rQF;
import celestial.rQO;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQM
implements rQz_1 {
    public final xd_3 id_class;
    public final JS id_break;

    public rQM(xd_3 xd_32, JS jS) {
        this.id_class = xd_32;
        this.id_break = jS;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        xc_3 xc_32 = rzr_32.id_break(rzQ_2.id_catch);
        return xc_32 != null && this.id_class == xc_32.id_break() && this.id_break.id_class(xc_32);
    }

    public static rQO id_class(xd_3 xd_32) {
        return new rQO(xd_32);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_catch);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_private;
    }
}

