/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCc_1;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.ryJ_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.ryX_2;
import celestial.ryd_3;
import celestial.ryk_3;
import celestial.ryx_3;
import celestial.xc_3;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class ryh_3 {
    public static <S extends ryO_2> ryJ_2<S> id_class(ryW_2<S> ryW_22, Function<xc_3, ryk_3> function, Function<xc_3, rpr_3> function2, rCc_1 rCc_12, xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, BiPredicate<rRg_1, rfH_2> biPredicate) {
        ryk_3 ryk_32;
        boolean bl;
        S s = ryW_22.id_class(rRg_12, rfH_22);
        if (s == null) {
            return ryX_2::id_break;
        }
        if (biPredicate.test(rRg_12, rfH_22)) {
            return ryX_2::id_break;
        }
        ryk_3 ryk_33 = function.apply(xc_32);
        boolean bl2 = ryk_33 == ryk_3.SINGLE;
        boolean bl3 = bl = ryk_33 == ryk_3.FIRST;
        if (bl2) {
            return new ryd_3<S>(s);
        }
        rfH_2 rfH_23 = rfH_22.id_break(function2.apply(xc_32));
        xc_3 xc_33 = rRg_12.id_byte(rfH_23);
        if (xc_33.id_class(xc_32.id_break()) && (ryk_32 = function.apply(xc_33)) != ryk_3.SINGLE && ryk_33 != ryk_32 && xc_33.id_byte(rCc_12) == xc_32.id_byte(rCc_12)) {
            if (biPredicate.test(rRg_12, rfH_23)) {
                return ryX_2::id_break;
            }
            S s2 = ryW_22.id_class(rRg_12, rfH_23);
            if (s2 != null) {
                S s3 = bl ? s : s2;
                S s4 = bl ? s2 : s;
                return new ryx_3<S>(s3, s4);
            }
        }
        return new ryd_3<S>(s);
    }
}

