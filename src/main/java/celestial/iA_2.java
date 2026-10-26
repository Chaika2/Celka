/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iH_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfI_2;
import celestial.rfY_2;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rkB_2;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rsq_3;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class iA_2 {
    public static boolean id_byte(iB_2 iB_22, iB_2 iB_23) {
        iZ_2<List<iB_2>> iZ_22 = iB_22.SF();
        return !iZ_22.id_class(il_3.id_private) ? false : iZ_22.id_byte(il_3.id_private).get().contains(iB_23);
    }

    public static Stream<rsq_3> id_class(rsq_3 rsq_32, Predicate<rsq_3> predicate) {
        return rsq_32.SF().id_byte(il_3.id_catch).map(list -> list.stream().filter(iB_22 -> iB_22 instanceof rsq_3 && iB_22 != rsq_32).map(iB_22 -> (rsq_3)iB_22).filter(iB_2::BM).filter(predicate)).orElseGet(Stream::empty);
    }

    public static Optional<iB_2> id_class(iB_2 iB_22, il_3<UUID> il_32) {
        Optional<UUID> optional = iB_22.SF().id_byte(il_32);
        return optional.map(uUID -> (iB_2)((rrEm_1)((rYB)iB_22.id_throws[7])).id_break((UUID)uUID));
    }

    public static iB_2 id_class(iB_2 iB_22, iB_2 iB_23, iB_2 iB_24) {
        rjU_2 rjU_22 = iB_23.Ps();
        rjU_2 rjU_23 = iB_24.Ps();
        return iB_22.id_break(rjU_22) < iB_22.id_break(rjU_23) ? iB_23 : iB_24;
    }

    public static iB_2 id_class(iB_2 iB_22, Optional<iB_2> optional, iB_2 iB_23) {
        return !optional.isPresent() ? iB_23 : iA_2.id_class(iB_22, optional.get(), iB_23);
    }

    public static boolean id_class(iB_2 iB_22, iB_2 iB_23, double d) {
        Optional<iB_2> optional = iB_22.SF().id_byte(il_3.id_package);
        if (!optional.isPresent()) {
            return false;
        }
        double d2 = iB_22.id_break(optional.get().Ps());
        double d3 = iB_22.id_break(iB_23.Ps());
        return d3 > d2 + d * d;
    }

    public static void id_class(iB_2 iB_22, an_3 an_32, float f, int n) {
        iH_2 iH_22 = new iH_2(new rfY_2(an_32, false), f, n);
        iB_22.SF().id_class(il_3.id_final, new rfY_2(an_32, true));
        iB_22.SF().id_class(il_3.id_volatile, iH_22);
    }

    public static void id_class(iB_2 iB_22, iB_2 iB_23, float f) {
        iA_2.id_protected(iB_22, iB_23);
        iA_2.id_break(iB_22, iB_23, f);
    }

    private static boolean id_class(iZ_2<?> iZ_22, il_3<? extends iB_2> il_32, Predicate<iB_2> predicate) {
        return iZ_22.id_byte(il_32).filter(predicate).filter(iB_2::BM).filter(iB_22 -> iA_2.id_class(iZ_22, iB_22)).isPresent();
    }

    public static boolean id_class(iZ_2<?> iZ_22, il_3<? extends iB_2> il_32, aI_2<?> aI_22) {
        return iA_2.id_class(iZ_22, il_32, (iB_2 iB_22) -> iB_22.BC() == aI_22);
    }

    public static boolean id_class(iZ_2<?> iZ_22, iB_2 iB_22) {
        return iZ_22.id_byte(il_3.id_private).filter(list -> list.contains(iB_22)).isPresent();
    }

    public static void id_class(iB_2 iB_22, iB_2 iB_23) {
        iB_22.SF().id_class(il_3.id_final, new rfY_2(iB_23, true));
    }

    public static boolean id_class(is_3 is_32, iB_2 iB_22, int n) {
        rdb_3 rdb_32 = is_32.ss().id_break();
        if (rdb_32 instanceof rkB_2 && is_32.id_class((rkB_2)rdb_32)) {
            int n2 = ((rkB_2)rdb_32).id_throws() - n;
            return is_32.id_class((an_3)iB_22, (double)n2);
        }
        return iA_2.id_break(is_32, iB_22);
    }

    public static rjh_3 id_class(rrEm_1 rrEm_12, rjh_3 rjh_33, int n) {
        int n2 = rrEm_12.id_break(rjh_33);
        return rjh_3.id_class(rjh_33, n).filter(rjh_32 -> rrEm_12.id_break((rjh_3)rjh_32) < n2).min(Comparator.comparingInt(rrEm_12::id_break)).orElse(rjh_33);
    }

    public static void id_class(iB_2 iB_22, rfH_2 rfH_22, float f, int n) {
        iH_2 iH_22 = new iH_2(new rfI_2(rfH_22), f, n);
        iB_22.SF().id_class(il_3.id_final, new rfI_2(rfH_22));
        iB_22.SF().id_class(il_3.id_volatile, iH_22);
    }

    public static void id_class(iB_2 iB_22, rdn_3 rdn_32, rjU_2 rjU_22) {
        double d = iB_22.rH() - (double)0.3f;
        rsE_2 rsE_22 = new rsE_2((rYB)iB_22.id_throws[7], iB_22.rx(), d, iB_22.BO(), rdn_32);
        float f = 0.3f;
        rjU_2 rjU_23 = rjU_22.id_protected(iB_22.Ps());
        rjU_23 = rjU_23.id_protected().id_class((double)0.3f);
        rsE_22.id_byte(rjU_23);
        rsE_22.id_private();
        ((rYB)iB_22.id_throws[7]).a_(rsE_22);
    }

    public static boolean id_break(iB_2 iB_22, iB_2 iB_23) {
        double d;
        double d2 = iB_22.id_class(iB_23.rx(), iB_23.re(), iB_23.BO());
        return d2 <= (d = (double)(iB_22.PN() * 2.0f * iB_22.PN() * 2.0f + iB_23.PN()));
    }

    private static void id_break(iB_2 iB_22, iB_2 iB_23, float f) {
        int n = 2;
        iA_2.id_class(iB_22, iB_23, f, 2);
        iA_2.id_class(iB_23, iB_22, f, 2);
    }

    private static void id_protected(iB_2 iB_22, iB_2 iB_23) {
        iA_2.id_class(iB_22, iB_23);
        iA_2.id_class(iB_23, iB_22);
    }
}

