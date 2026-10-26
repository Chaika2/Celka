/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.au_3;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.iq_3;
import celestial.is_3;
import celestial.rEg_1;
import celestial.rPC;
import celestial.rPE;
import celestial.rPG;
import celestial.rPN;
import celestial.rPO;
import celestial.rPh_1;
import celestial.rPm_1;
import celestial.rPq_1;
import celestial.rPy_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpJ_2;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrG_2;
import celestial.rrK_2;
import celestial.rrO_2;
import celestial.rrQ_2;
import celestial.rrU_2;
import celestial.rrd_3;
import celestial.rrn_3;
import celestial.rro_3;
import celestial.rrp_3;
import celestial.rry_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rER {
    private static final rqb_3 id_class = rqt_3.id_class(5, 20);
    private static final rqb_3 id_break = rqb_3.id_class(5, 16);

    private static void id_byte(rEg_1 rEg_13, iB_2 iB_22) {
        rER.id_catch(rEg_13).forEach(rEg_12 -> rER.id_protected(rEg_12, iB_22));
    }

    protected static boolean id_byte(rEg_1 rEg_12) {
        return rEg_12.SF().id_class(il_3.x);
    }

    private static void id_byte(iZ_2<rEg_1> iZ_22) {
        iZ_22.id_class(iq_3.id_break, 10, (ImmutableList<rPm_1<rEg_1>>)ImmutableList.of((Object)new rPG(il_3.J, 200), (Object)new rrG_2(aI_2.id_long, 0.6f), rPO.id_class(il_3.J, 1.0f, 8, true), new rrp_3<rEg_1>(rER::id_protected), new rPN<aA_2>(rEg_1::sJ, rPO.id_break(il_3.G, 0.4f, 8, false)), new rPh_1<iB_2>(new rro_3(8.0f), rqb_3.id_class(30, 60)), new rrd_3(id_break, 0.6f), rER.id_class()));
    }

    protected static void id_class(rEg_1 rEg_12, iB_2 iB_22) {
        if (!rEg_12.n_()) {
            if (iB_22.BC() == aI_2.d && rER.id_case(rEg_12)) {
                rER.id_throws(rEg_12, iB_22);
                rER.id_byte(rEg_12, iB_22);
            } else {
                rER.id_private(rEg_12, iB_22);
            }
        }
    }

    private static rqA_2 id_class(rEg_1 rEg_12, iq_3 iq_32) {
        if (iq_32 != iq_3.id_final && !rEg_12.sx()) {
            if (iq_32 == iq_3.id_extends) {
                return rqn_3.sq;
            }
            return rER.id_private(rEg_12) ? rqn_3.sf : rqn_3.sp;
        }
        return rqn_3.sf;
    }

    protected static iZ_2<?> id_class(iZ_2<rEg_1> iZ_22) {
        rER.id_break(iZ_22);
        rER.id_byte(iZ_22);
        rER.id_protected(iZ_22);
        rER.id_throws(iZ_22);
        iZ_22.id_class((Set<iq_3>)ImmutableSet.of((Object)iq_3.id_class));
        iZ_22.id_break(iq_3.id_break);
        iZ_22.id_byte();
        return iZ_22;
    }

    public static boolean id_class(rEg_1 rEg_12, rfH_2 rfH_22) {
        Optional<rfH_2> optional = rEg_12.SF().id_byte(il_3.J);
        return optional.isPresent() && optional.get().id_class(rfH_22, 8.0);
    }

    private static rry_3<rEg_1> id_class() {
        return new rry_3<rEg_1>((List<Pair<rPm_1<rEg_1>, Integer>>)ImmutableList.of((Object)Pair.of((Object)new rPC(0.4f), (Object)2), (Object)Pair.of((Object)new rPq_1(0.4f, 3), (Object)2), (Object)Pair.of((Object)new rrQ_2(30, 60), (Object)1)));
    }

    protected static void id_class(rEg_1 rEg_12) {
        iZ_2<rEg_1> iZ_22 = rEg_12.SF();
        iq_3 iq_32 = iZ_22.id_protected().orElse(null);
        iZ_22.id_class((List<iq_3>)ImmutableList.of((Object)iq_3.id_extends, (Object)iq_3.id_final, (Object)iq_3.id_break));
        iq_3 iq_33 = iZ_22.id_protected().orElse(null);
        if (iq_32 != iq_33) {
            rER.id_break(rEg_12).ifPresent(rEg_12::id_class);
        }
        rEg_12.id_case(iZ_22.id_class(il_3.id_package));
    }

    protected static void id_break(rEg_1 rEg_12, iB_2 iB_22) {
        iZ_2<rEg_1> iZ_22 = rEg_12.SF();
        iZ_22.id_break(il_3.x);
        iZ_22.id_break(il_3.id_continue);
        if (rEg_12.n_()) {
            rER.id_protected(rEg_12, iB_22);
        } else {
            rER.id_case(rEg_12, iB_22);
        }
    }

    private static void id_break(iZ_2<rEg_1> iZ_22) {
        iZ_22.id_class(iq_3.id_class, 0, (ImmutableList<rPm_1<rEg_1>>)ImmutableList.of((Object)new rrK_2(45, 90), (Object)new rPy_1()));
    }

    public static Optional<rqA_2> id_break(rEg_1 rEg_12) {
        return rEg_12.SF().id_protected().map(iq_32 -> rER.id_class(rEg_12, iq_32));
    }

    private static void id_throws(iZ_2<rEg_1> iZ_22) {
        iZ_22.id_class(iq_3.id_final, 10, (ImmutableList<rPm_1<rEg_1>>)ImmutableList.of(rPO.id_break(il_3.id_while, 1.3f, 15, false), rER.id_class(), new rPh_1<iB_2>(new rro_3(8.0f), rqb_3.id_class(30, 60)), new rPE<rEg_1>(rER::id_throws, il_3.id_while)), il_3.id_while);
    }

    private static void id_throws(rEg_1 rEg_12, iB_2 iB_22) {
        rEg_12.SF().id_break(il_3.id_package);
        rEg_12.SF().id_break(il_3.id_volatile);
        rEg_12.SF().id_class(il_3.id_while, iB_22, id_class.id_class(((rYB)rEg_12.id_throws[7]).id_int));
    }

    private static boolean id_throws(rEg_1 rEg_12) {
        return rEg_12.sJ() && !rER.id_case(rEg_12);
    }

    private static List<rEg_1> id_catch(rEg_1 rEg_12) {
        return rEg_12.SF().id_byte(il_3.E).orElse((List<rEg_1>)ImmutableList.of());
    }

    private static void id_catch(rEg_1 rEg_12, iB_2 iB_22) {
        iZ_2<rEg_1> iZ_22 = rEg_12.SF();
        iZ_22.id_break(il_3.id_interface);
        iZ_22.id_break(il_3.id_continue);
        iZ_22.id_class(il_3.id_package, iB_22, 200L);
    }

    private static boolean id_case(rEg_1 rEg_12) {
        int n;
        if (rEg_12.n_()) {
            return false;
        }
        int n2 = rEg_12.SF().id_byte(il_3.M).orElse(0);
        return n2 > (n = rEg_12.SF().id_byte(il_3.O).orElse(0) + 1);
    }

    private static void id_case(rEg_1 rEg_12, iB_2 iB_22) {
        if (!(rEg_12.SF().id_byte(iq_3.id_final) && iB_22.BC() == aI_2.d || !rpJ_2.id_case.test(iB_22) || iB_22.BC() == aI_2.id_long || iA_2.id_class((iB_2)rEg_12, iB_22, 4.0))) {
            rER.id_catch(rEg_12, iB_22);
            rER.id_private(rEg_12, iB_22);
        }
    }

    private static boolean id_implements(rEg_1 rEg_12) {
        return rEg_12.SF().id_class(il_3.id_continue);
    }

    private static void id_implements(rEg_1 rEg_12, iB_2 iB_22) {
        if (!rER.id_byte(rEg_12)) {
            Optional<iB_2> optional = rEg_12.SF().id_byte(il_3.id_package);
            iB_2 iB_23 = iA_2.id_class((iB_2)rEg_12, optional, iB_22);
            rER.id_catch(rEg_12, iB_23);
        }
    }

    private static void id_protected(iZ_2<rEg_1> iZ_22) {
        iZ_22.id_class(iq_3.id_extends, 10, (ImmutableList<rPm_1<rEg_1>>)ImmutableList.of((Object)new rPG(il_3.J, 200), (Object)new rrG_2(aI_2.id_long, 0.6f), (Object)new rrU_2(1.0f), new rPN<is_3>(rEg_1::sJ, new rrO_2(40)), new rPN<is_3>(au_3::n_, new rrO_2(15)), new rrn_3(), new rPE<rEg_1>(rER::id_implements, il_3.id_package)), il_3.id_package);
    }

    private static void id_protected(rEg_1 rEg_12, iB_2 iB_22) {
        iZ_2<rEg_1> iZ_22 = rEg_12.SF();
        iB_2 iB_23 = iA_2.id_class((iB_2)rEg_12, iZ_22.id_byte(il_3.id_while), iB_22);
        iB_23 = iA_2.id_class((iB_2)rEg_12, iZ_22.id_byte(il_3.id_package), iB_23);
        rER.id_throws(rEg_12, iB_23);
    }

    private static Optional<? extends iB_2> id_protected(rEg_1 rEg_12) {
        return !rER.id_byte(rEg_12) && !rER.id_implements(rEg_12) ? rEg_12.SF().id_byte(il_3.id_native) : Optional.empty();
    }

    private static boolean id_private(rEg_1 rEg_12) {
        return rEg_12.SF().id_class(il_3.J);
    }

    private static void id_private(rEg_1 rEg_13, iB_2 iB_22) {
        rER.id_catch(rEg_13).forEach(rEg_12 -> rER.id_implements(rEg_12, iB_22));
    }
}

