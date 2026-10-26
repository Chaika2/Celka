/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.iq_3;
import celestial.rPC;
import celestial.rPT;
import celestial.rPm_1;
import celestial.rPw_1;
import celestial.rPy_1;
import celestial.rYB;
import celestial.rbM_2;
import celestial.rbW_2;
import celestial.rbd_3;
import celestial.rfK_2;
import celestial.rpJ_2;
import celestial.rrK_2;
import celestial.rrL_2;
import celestial.rrO_2;
import celestial.rrQ_2;
import celestial.rrR_2;
import celestial.rrU_2;
import celestial.rrg_3;
import celestial.rrn_3;
import celestial.rro_3;
import celestial.rrp_3;
import celestial.rrw_3;
import celestial.rry_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class rbx_3 {
    protected static void id_byte(rbd_3 rbd_32) {
        if ((double)((rYB)rbd_32.id_throws[7]).id_int.nextFloat() < 0.0125) {
            rbx_3.id_protected(rbd_32);
        }
    }

    private static void id_byte(rbd_3 rbd_32, iZ_2<rbd_3> iZ_22) {
        iZ_22.id_class(iq_3.id_break, 10, (ImmutableList<rPm_1<rbd_3>>)ImmutableList.of(new rrp_3<rbd_3>(rbx_3::id_class), rbx_3.id_class(), rbx_3.id_break(), (Object)new rrL_2(aI_2.rM, 4)));
    }

    private static Optional<? extends iB_2> id_class(rbM_2 rbM_22, il_3<? extends iB_2> il_32) {
        return rbM_22.SF().id_byte(il_32).filter(iB_22 -> iB_22.id_class((an_3)rbM_22, 12.0));
    }

    private static boolean id_class(iB_2 iB_22) {
        return rpJ_2.id_case.test(iB_22);
    }

    private static boolean id_class(rbM_2 rbM_22, iB_2 iB_22) {
        return rbx_3.id_class(rbM_22).filter(iB_23 -> iB_23 == iB_22).isPresent();
    }

    private static Optional<? extends iB_2> id_class(rbM_2 rbM_22) {
        Optional<iB_2> optional = iA_2.id_class((iB_2)rbM_22, il_3.id_short);
        if (optional.isPresent() && rbx_3.id_class(optional.get())) {
            return optional;
        }
        Optional<? extends iB_2> optional2 = rbx_3.id_class(rbM_22, il_3.id_native);
        return optional2.isPresent() ? optional2 : rbM_22.SF().id_byte(il_3.id_import);
    }

    protected static void id_class(rbd_3 rbd_32, iB_2 iB_22) {
        if (!(iB_22 instanceof rbM_2)) {
            rbW_2.id_class((rbM_2)rbd_32, iB_22);
        }
    }

    protected static void id_class(rbd_3 rbd_32) {
        rfK_2 rfK_22 = rfK_2.id_class(((rYB)rbd_32.id_throws[7]).E(), rbd_32.Bs());
        rbd_32.SF().id_class(il_3.id_break, rfK_22);
    }

    private static rry_3<rbd_3> id_class() {
        return new rry_3<rbd_3>((List<Pair<rPm_1<rbd_3>, Integer>>)ImmutableList.of((Object)Pair.of((Object)new rro_3(aI_2.rM, 8.0f), (Object)1), (Object)Pair.of((Object)new rro_3(aI_2.d, 8.0f), (Object)1), (Object)Pair.of((Object)new rro_3(aI_2.k, 8.0f), (Object)1), (Object)Pair.of((Object)new rro_3(8.0f), (Object)1), (Object)Pair.of((Object)new rrQ_2(30, 60), (Object)1)));
    }

    protected static iZ_2<?> id_class(rbd_3 rbd_32, iZ_2<rbd_3> iZ_22) {
        rbx_3.id_break(rbd_32, iZ_22);
        rbx_3.id_byte(rbd_32, iZ_22);
        rbx_3.id_protected(rbd_32, iZ_22);
        iZ_22.id_class((Set<iq_3>)ImmutableSet.of((Object)iq_3.id_class));
        iZ_22.id_break(iq_3.id_break);
        iZ_22.id_byte();
        return iZ_22;
    }

    protected static void id_break(rbd_3 rbd_32) {
        iZ_2<rbd_3> iZ_22 = rbd_32.SF();
        iq_3 iq_32 = iZ_22.id_protected().orElse(null);
        iZ_22.id_class((List<iq_3>)ImmutableList.of((Object)iq_3.id_extends, (Object)iq_3.id_break));
        iq_3 iq_33 = iZ_22.id_protected().orElse(null);
        if (iq_32 != iq_33) {
            rbx_3.id_protected(rbd_32);
        }
        rbd_32.id_case(iZ_22.id_class(il_3.id_package));
    }

    private static rry_3<rbd_3> id_break() {
        return new rry_3<rbd_3>((List<Pair<rPm_1<rbd_3>, Integer>>)ImmutableList.of((Object)Pair.of((Object)new rPC(0.6f), (Object)2), (Object)Pair.of(rrR_2.id_class(aI_2.d, 8, il_3.id_new, 0.6f, 2), (Object)2), (Object)Pair.of(rrR_2.id_class(aI_2.k, 8, il_3.id_new, 0.6f, 2), (Object)2), (Object)Pair.of((Object)new rPT(il_3.id_break, 0.6f, 2, 100), (Object)2), (Object)Pair.of((Object)new rPw_1(il_3.id_break, 0.6f, 5), (Object)2), (Object)Pair.of((Object)new rrQ_2(30, 60), (Object)1)));
    }

    private static void id_break(rbd_3 rbd_32, iZ_2<rbd_3> iZ_22) {
        iZ_22.id_class(iq_3.id_class, 0, (ImmutableList<rPm_1<rbd_3>>)ImmutableList.of((Object)new rrK_2(45, 90), (Object)new rPy_1(), (Object)new rrg_3(), new rrw_3()));
    }

    private static void id_protected(rbd_3 rbd_32, iZ_2<rbd_3> iZ_22) {
        iZ_22.id_class(iq_3.id_extends, 10, (ImmutableList<rPm_1<rbd_3>>)ImmutableList.of(new rrn_3(iB_22 -> !rbx_3.id_class((rbM_2)rbd_32, iB_22)), (Object)new rrU_2(1.0f), (Object)new rrO_2(20)), il_3.id_package);
    }

    private static void id_protected(rbd_3 rbd_32) {
        rbd_32.SF().id_protected().ifPresent(iq_32 -> {
            if (iq_32 == iq_3.id_extends) {
                rbd_32.sQ();
            }
        });
    }
}

