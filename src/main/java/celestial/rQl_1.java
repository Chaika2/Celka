/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.eA_2;
import celestial.iB_2;
import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQl_1
implements rQz_1 {
    public final float id_class;
    public final float id_break;

    public rQl_1(float f, float f2) {
        this.id_class = f;
        this.id_break = f2;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        an_3 an_32 = rzr_32.id_break(rzQ_2.id_protected);
        int n = 0;
        if (an_32 instanceof iB_2) {
            n = eA_2.id_catch((iB_2)an_32);
        }
        return rzr_32.id_class().nextFloat() < this.id_class + (float)n * this.id_break;
    }

    public static rQQ id_class(float f, float f2) {
        return () -> new rQl_1(f, f2);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_protected);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_protected;
    }
}

