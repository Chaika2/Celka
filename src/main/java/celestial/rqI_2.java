/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.iM_2;
import celestial.rRT;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.zv_3;
import java.util.function.Function;

public class rqI_2 {
    public static rjC_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        return !xc_32.id_class(rls_3.F) && (!(xc_32.id_break() instanceof zv_3) || xc_32.id_byte(zv_3.id_volatile) == false) ? xc_32.id_extends(rRq_12, rfH_22) : rjw_3.id_class();
    }

    public static double id_class(rfH_2 rfH_22, int n, Function<rfH_2, rjC_2> function) {
        rfw_3 rfw_32 = rfH_22.id_new();
        for (int i = 0; i < n; ++i) {
            rjC_2 rjC_22 = function.apply(rfw_32);
            if (!rjC_22.id_break()) {
                return (double)(rfH_22.c_() + i) + rjC_22.id_break(rpB_2.Y);
            }
            rfw_32.id_class(rpr_3.UP);
        }
        return Double.POSITIVE_INFINITY;
    }

    public static rjU_2 id_class(aI_2<?> aI_22, rRT rRT2, rfH_2 rfH_22, boolean bl) {
        if (bl && aI_22.id_class(rRT2.id_byte(rfH_22))) {
            return null;
        }
        double d = rRT2.id_class(rqI_2.id_class((rRq_1)rRT2, rfH_22), () -> rqI_2.id_class((rRq_1)rRT2, rfH_22.id_break()));
        if (!rqI_2.id_class(d)) {
            return null;
        }
        if (bl && d <= 0.0 && aI_22.id_class(rRT2.id_byte(rfH_22.id_break()))) {
            return null;
        }
        rjU_2 rjU_22 = rjU_2.id_class(rfH_22, d);
        return rRT2.id_byte(null, aI_22.id_volatile().id_class(rjU_22)).allMatch(rjC_2::id_break) ? rjU_22 : null;
    }

    public static int[][] id_class(rpr_3 rpr_32) {
        rpr_3 rpr_33 = rpr_32.id_catch();
        rpr_3 rpr_34 = rpr_33.id_case();
        rpr_3 rpr_35 = rpr_32.id_case();
        return new int[][]{{rpr_33.id_implements(), rpr_33.id_extends()}, {rpr_34.id_implements(), rpr_34.id_extends()}, {rpr_35.id_implements() + rpr_33.id_implements(), rpr_35.id_extends() + rpr_33.id_extends()}, {rpr_35.id_implements() + rpr_34.id_implements(), rpr_35.id_extends() + rpr_34.id_extends()}, {rpr_32.id_implements() + rpr_33.id_implements(), rpr_32.id_extends() + rpr_33.id_extends()}, {rpr_32.id_implements() + rpr_34.id_implements(), rpr_32.id_extends() + rpr_34.id_extends()}, {rpr_35.id_implements(), rpr_35.id_extends()}, {rpr_32.id_implements(), rpr_32.id_extends()}};
    }

    public static boolean id_class(double d) {
        return !Double.isInfinite(d) && d < 1.0;
    }

    public static boolean id_class(rRT rRT2, iB_2 iB_22, rfl_3 rfl_32) {
        return rRT2.id_byte(iB_22, rfl_32).allMatch(rjC_2::id_break);
    }

    public static rjU_2 id_class(rRT rRT2, double d, double d2, double d3, iB_2 iB_22, iM_2 iM_22) {
        if (rqI_2.id_class(d2)) {
            rjU_2 rjU_22 = new rjU_2(d, d2, d3);
            if (rqI_2.id_class(rRT2, iB_22, iB_22.id_catch(iM_22).id_protected(rjU_22))) {
                return rjU_22;
            }
        }
        return null;
    }
}

