/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rNS;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rpA_2;
import celestial.rzO_2;
import celestial.rzd_3;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rNP
extends rzO_2 {
    public final rNS id_break;

    public rNP(rQz_1[] rQz_1Array, rNS rNS2) {
        super(rQz_1Array);
        this.id_break = rNS2;
    }

    public static rzh_3<?> id_class(rNS rNS2) {
        return rNP.id_class((rQz_1[] rQz_1Array) -> new rNP((rQz_1[])rQz_1Array, rNS2));
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(this.id_break.parameter);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_volatile;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rpA_2 rpA_22;
        Object obj = rzr_32.id_break(this.id_break.parameter);
        if (obj instanceof rpA_2 && (rpA_22 = (rpA_2)obj).Bk()) {
            rdn_32.id_class(rpA_22.L_());
        }
        return rdn_32;
    }
}

