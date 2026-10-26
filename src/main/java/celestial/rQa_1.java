/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rCZ;
import celestial.rNl_1;
import celestial.rQi_1;
import celestial.rQz_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rQa_1
extends rzO_2 {
    public final xd_3 id_break;
    public final Set<rCZ<?>> id_byte;

    public rQa_1(rQz_1[] rQz_1Array, xd_3 xd_32, Set<rCZ<?>> set) {
        super(rQz_1Array);
        this.id_break = xd_32;
        this.id_byte = set;
    }

    public static rQi_1 id_class(xd_3 xd_32) {
        return new rQi_1(xd_32);
    }

    private static <T extends Comparable<T>> String id_class(xc_3 xc_32, rCZ<T> rCZ2) {
        T t = xc_32.id_byte(rCZ2);
        return rCZ2.id_class(t);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_catch);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_synchronized;
    }

    @Override
    protected rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        xc_3 xc_32 = rzr_32.id_break(rzQ_2.id_catch);
        if (xc_32 != null) {
            rcd_3 rcd_32;
            rcd_3 rcd_33 = rdn_32.id_int();
            if (rcd_33.id_byte("BlockStateTag", 10)) {
                rcd_32 = rcd_33.id_int("BlockStateTag");
            } else {
                rcd_32 = new rcd_3();
                rcd_33.id_class("BlockStateTag", rcd_32);
            }
            this.id_byte.stream().filter(xc_32::id_break).forEach(rCZ2 -> rcd_32.id_class(rCZ2.id_throws(), rQa_1.id_class(xc_32, rCZ2)));
        }
        return rdn_32;
    }
}

