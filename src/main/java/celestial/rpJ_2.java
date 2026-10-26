/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rRO;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rnM_2;
import celestial.rnh_3;
import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class rpJ_2 {
    public static final Predicate<an_3> id_class = an_3::BM;
    public static final Predicate<iB_2> id_break = iB_2::BM;
    public static final Predicate<an_3> id_byte = an_32 -> an_32.BM() && !an_32.BP() && !an_32.Pm();
    public static final Predicate<an_3> id_protected = an_32 -> an_32 instanceof rXu_1 && an_32.BM();
    public static final Predicate<an_3> id_throws = an_32 -> !(an_32 instanceof rhd_3) || !an_32.id_native() && !((rhd_3)an_32).id_implements();
    public static final Predicate<an_3> id_case = an_32 -> !(an_32 instanceof rhd_3) || !an_32.id_native() && !((rhd_3)an_32).id_implements() && ((rYB)an_32.id_throws[7]).id_abstract() != rRO.PEACEFUL;
    public static final Predicate<an_3> id_catch = an_32 -> !an_32.id_native();
    public static final Predicate<an_3> id_private = an_32 -> (Boolean)an_32.id_throws[38] == false && !an_32.id_native() && an_32.BM() && an_32.rY();

    public static Predicate<an_3> id_class(double d, double d2, double d3, double d4) {
        double d5 = d4 * d4;
        return an_32 -> an_32 != null && an_32.id_class(d, d2, d3) <= d5;
    }

    public static Predicate<an_3> id_class(an_3 an_32) {
        rnM_2 rnM_22 = an_32.BG();
        rnh_3 rnh_32 = rnM_22 == null ? rnh_3.ALWAYS : rnM_22.id_extends();
        return rnh_32 == rnh_3.NEVER ? Predicates.alwaysFalse() : id_catch.and(an_33 -> {
            if (!an_33.rG()) {
                return false;
            }
            if (!((rYB)an_32.id_throws[7]).id_continue || an_33 instanceof rhd_3 && ((rhd_3)an_33).id_char()) {
                boolean bl;
                rnh_3 rnh_33;
                rnM_2 rnM_23 = an_33.BG();
                rnh_3 rnh_34 = rnh_33 = rnM_23 == null ? rnh_3.ALWAYS : rnM_23.id_extends();
                if (rnh_33 == rnh_3.NEVER) {
                    return false;
                }
                boolean bl2 = bl = rnM_22 != null && rnM_22.id_class(rnM_23);
                if ((rnh_32 == rnh_3.PUSH_OWN_TEAM || rnh_33 == rnh_3.PUSH_OWN_TEAM) && bl) {
                    return false;
                }
                return rnh_32 != rnh_3.PUSH_OTHER_TEAMS && rnh_33 != rnh_3.PUSH_OTHER_TEAMS || bl;
            }
            return false;
        });
    }

    public static Predicate<an_3> id_break(an_3 an_32) {
        return an_33 -> {
            while (an_33.Pm()) {
                if ((an_33 = an_33.ra()) != an_32) continue;
                return false;
            }
            return true;
        };
    }
}

