/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.XX;
import celestial.Xh_1;
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

public class rQL
implements rQz_1 {
    public final Xh_1 id_class;

    public rQL(Xh_1 xh_1) {
        this.id_class = xh_1;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        rdn_3 rdn_32 = rzr_32.id_break(rzQ_2.id_implements);
        return rdn_32 != null && this.id_class.id_class(rdn_32);
    }

    public static rQQ id_class(XX xX) {
        return () -> new rQL(xX.id_break());
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_implements);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_implements;
    }
}

