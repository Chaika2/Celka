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
import celestial.iX_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.iq_3;
import celestial.is_3;
import celestial.rEg_1;
import celestial.rPC;
import celestial.rPE;
import celestial.rPJ;
import celestial.rPN;
import celestial.rPO;
import celestial.rPQ;
import celestial.rPS;
import celestial.rPb_1;
import celestial.rPh_1;
import celestial.rPm_1;
import celestial.rPq_1;
import celestial.rPs_1;
import celestial.rPy_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rbM_2;
import celestial.rbN_2;
import celestial.rbO_2;
import celestial.rbQ_2;
import celestial.rbX_2;
import celestial.rbh_3;
import celestial.rbk_3;
import celestial.rbz_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlc_3;
import celestial.rpJ_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqb_3;
import celestial.rqn_3;
import celestial.rqt_3;
import celestial.rrEm_1;
import celestial.rrK_2;
import celestial.rrL_2;
import celestial.rrM_2;
import celestial.rrN_2;
import celestial.rrO_2;
import celestial.rrQ_2;
import celestial.rrR_2;
import celestial.rrU_2;
import celestial.rrV_2;
import celestial.rrg_3;
import celestial.rrn_3;
import celestial.rro_3;
import celestial.rrp_3;
import celestial.rrw_3;
import celestial.rry_3;
import celestial.rsE_2;
import celestial.rxE_2;
import celestial.rxS_2;
import celestial.ryZ_2;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzl_3;
import celestial.rzz_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class rbW_2 {
    public static final rdb_3 id_class = rdy_3.Od;
    private static final rqb_3 id_break = rqt_3.id_class(30, 120);
    private static final rqb_3 id_byte = rqt_3.id_class(10, 40);
    private static final rqb_3 id_protected = rqt_3.id_class(10, 30);
    private static final rqb_3 id_throws = rqt_3.id_class(5, 20);
    private static final rqb_3 id_case = rqt_3.id_class(5, 7);
    private static final rqb_3 id_catch = rqt_3.id_class(5, 7);
    private static final Set<rdb_3> id_private = ImmutableSet.of((Object)rdy_3.hC, (Object)rdy_3.hl);

    private static void id_byte(rbk_3 rbk_32, iB_2 iB_22) {
        rbW_2.id_volatile(rbk_32).stream().filter(rbM_22 -> rbM_22 instanceof rbk_3).forEach(rbM_22 -> rbW_2.id_protected((rbk_3)rbM_22, iB_22));
    }

    private static rPO<rfH_2> id_byte() {
        return rPO.id_class(il_3.J, 1.0f, 8, false);
    }

    protected static void id_byte(rbM_2 rbM_22, iB_2 iB_22) {
        if (rbW_2.id_throws(iB_22)) {
            rbM_22.SF().id_break(il_3.id_interface);
            rbM_22.SF().id_class(il_3.id_short, iB_22.ro(), 600L);
            if (iB_22.BC() == aI_2.id_long && rbM_22.id_throws()) {
                rbW_2.id_byte(rbM_22);
            }
            if (iB_22.BC() == aI_2.rM && ((rYB)rbM_22.id_throws[7]).B().id_break(rRu_1.id_long)) {
                rbM_22.SF().id_class(il_3.id_default, true, 600L);
            }
        }
    }

    protected static void id_byte(rbk_3 rbk_32) {
        if (rbW_2.id_else(rbk_32) && !rbk_32.Sn().id_class()) {
            rbk_32.a_(rbk_32.Sn());
            rbk_32.id_class(rpm_3.OFF_HAND, rdn_3.id_break);
        }
    }

    private static void id_byte(rbk_3 rbk_32, rdn_3 rdn_32) {
        if (rbW_2.id_public(rbk_32)) {
            rbk_32.a_(rbk_32.id_protected(rpm_3.OFF_HAND));
        }
        rbk_32.id_final(rdn_32);
    }

    private static void id_byte(iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_native, 10, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of(rbW_2.id_byte(), (Object)new rro_3(rbW_2::id_break, 14.0f), new rrp_3<rbk_3>(rbM_2::sx, rbW_2::id_extends), new rPN<rbk_3>(rbk_32 -> !rbk_32.sQ(), new rrV_2(2, 1.0f)), new rPN<rbk_3>(rbk_3::sQ, new rrV_2(4, 0.6f)), new rry_3(ImmutableList.of((Object)Pair.of((Object)new rro_3(aI_2.d, 8.0f), (Object)1), (Object)Pair.of((Object)new rPC(0.6f, 2, 1), (Object)1), (Object)Pair.of((Object)new rrQ_2(10, 20), (Object)1)))), il_3.id_double);
    }

    private static boolean id_byte(rdb_3 rdb_32) {
        return id_private.contains(rdb_32);
    }

    protected static void id_byte(rbM_2 rbM_22) {
        rbM_22.SF().id_class(il_3.id_for, true, id_break.id_class(((rYB)rbM_22.id_throws[7]).id_int));
    }

    private static boolean id_byte(iB_2 iB_22) {
        return iB_22.id_class(rdy_3.kU);
    }

    private static boolean id_int(rbk_3 rbk_32) {
        return !rbW_2.id_new(rbk_32);
    }

    private static boolean id_this(rbk_3 rbk_32) {
        return rbk_32.SF().id_class(il_3.X);
    }

    protected static void id_class(rbM_2 rbM_23) {
        rbW_2.id_throws(rbM_23).forEach(rbM_22 -> rbW_2.id_break(rbM_22).ifPresent(rhd_32 -> rbW_2.id_byte(rbM_22, (iB_2)rhd_32)));
    }

    private static boolean id_class(rbk_3 rbk_32, an_3 an_32) {
        if (!(an_32 instanceof is_3)) {
            return false;
        }
        is_3 is_32 = (is_3)an_32;
        return !is_32.n_() || !is_32.BM() || rbW_2.id_private((iB_2)rbk_32) || rbW_2.id_private(is_32) || is_32 instanceof rbk_3 && is_32.ra() == null;
    }

    protected static iZ_2<?> id_class(rbk_3 rbk_32, iZ_2<rbk_3> iZ_22) {
        rbW_2.id_class(iZ_22);
        rbW_2.id_break(iZ_22);
        rbW_2.id_protected(iZ_22);
        rbW_2.id_break(rbk_32, iZ_22);
        rbW_2.id_byte(iZ_22);
        rbW_2.id_throws(iZ_22);
        rbW_2.id_case(iZ_22);
        iZ_22.id_class((Set<iq_3>)ImmutableSet.of((Object)iq_3.id_class));
        iZ_22.id_break(iq_3.id_break);
        iZ_22.id_byte();
        return iZ_22;
    }

    public static void id_class(rhd_3 rhd_32, boolean bl) {
        List<rbk_3> list = ((rYB)rhd_32.id_throws[7]).id_class(rbk_3.class, rhd_32.rN().id_class(16.0));
        list.stream().filter(rbW_2::id_protected).filter(rbk_32 -> !bl || iA_2.id_byte(rbk_32, rhd_32)).forEach(rbk_32 -> {
            if (((rYB)rbk_32.id_throws[7]).B().id_break(rRu_1.id_long)) {
                rbW_2.id_protected((rbM_2)rbk_32, (iB_2)rhd_32);
            } else {
                rbW_2.id_byte((rbM_2)rbk_32, (iB_2)rhd_32);
            }
        });
    }

    protected static boolean id_class(rbk_3 rbk_32, rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32.id_class(rlc_3.id_const)) {
            return false;
        }
        if (rbW_2.id_return(rbk_32) && rbk_32.SF().id_class(il_3.id_package)) {
            return false;
        }
        if (rbW_2.id_break(rdb_32)) {
            return rbW_2.id_goto(rbk_32);
        }
        boolean bl = rbk_32.id_native(rdn_32);
        if (rdb_32 == rdy_3.JF) {
            return bl;
        }
        if (rbW_2.id_byte(rdb_32)) {
            return !rbW_2.id_this(rbk_32) && bl;
        }
        if (!rbW_2.id_class(rdb_32)) {
            return rbk_32.id_package(rdn_32);
        }
        return rbW_2.id_goto(rbk_32) && bl;
    }

    private static boolean id_class(iB_2 iB_22, iB_2 iB_23) {
        if (iB_23.BC() != aI_2.id_long) {
            return false;
        }
        return new Random(((rYB)iB_22.id_throws[7]).r()).nextFloat() < 0.1f;
    }

    public static boolean id_class(aI_2 aI_22) {
        return aI_22 == aI_2.rb || aI_22 == aI_2.rS;
    }

    protected static void id_class(rbM_2 rbM_22, iB_2 iB_22) {
        if (!rbM_22.SF().id_byte(iq_3.id_final) && rbW_2.id_throws(iB_22) && !iA_2.id_class((iB_2)rbM_22, iB_22, 4.0)) {
            if (iB_22.BC() == aI_2.rM && ((rYB)rbM_22.id_throws[7]).B().id_break(rRu_1.id_long)) {
                rbW_2.id_protected(rbM_22, iB_22);
                rbW_2.id_class(rbM_22);
            } else {
                rbW_2.id_byte(rbM_22, iB_22);
                rbW_2.id_break(rbM_22, iB_22);
            }
        }
    }

    private static rqA_2 id_class(rbk_3 rbk_32, iq_3 iq_32) {
        if (iq_32 == iq_3.id_extends) {
            return rqn_3.hr;
        }
        if (rbk_32.sJ()) {
            return rqn_3.hE;
        }
        if (iq_32 == iq_3.id_final && rbW_2.id_native(rbk_32)) {
            return rqn_3.hE;
        }
        if (iq_32 == iq_3.id_volatile) {
            return rqn_3.Oa;
        }
        if (iq_32 == iq_3.id_native) {
            return rqn_3.hP;
        }
        if (rbW_2.id_case((iB_2)rbk_32)) {
            return rqn_3.hS;
        }
        return rbW_2.id_synchronized(rbk_32) ? rqn_3.hE : rqn_3.Oi;
    }

    private static void id_class(iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_class, 0, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of((Object)new rrK_2(45, 90), (Object)new rPy_1(), (Object)new rrg_3(), rbW_2.id_protected(), rbW_2.id_throws(), new rbz_3(), new rbO_2(120), (Object)new rrN_2(300, rbW_2::id_class), new rrw_3()));
    }

    public static boolean id_class(iB_2 iB_22) {
        for (rdn_3 rdn_32 : iB_22.PV()) {
            rdb_3 rdb_32 = rdn_32.id_break();
            if (!(rdb_32 instanceof rxS_2) || ((rxS_2)rdb_32).id_throws() != rxE_2.GOLD) continue;
            return true;
        }
        return false;
    }

    protected static void id_class(rbk_3 rbk_32, iB_2 iB_22) {
        if (!(iB_22 instanceof rbk_3)) {
            if (rbW_2.id_public(rbk_32)) {
                rbW_2.id_class(rbk_32, false);
            }
            iZ_2<rbk_3> iZ_22 = rbk_32.SF();
            iZ_22.id_break(il_3.id_double);
            iZ_22.id_break(il_3.id_switch);
            iZ_22.id_break(il_3.id_const);
            if (iB_22 instanceof rhd_3) {
                iZ_22.id_class(il_3.id_transient, true, 400L);
            }
            rbW_2.id_catch(rbk_32).ifPresent(iB_23 -> {
                if (iB_23.BC() != iB_22.BC()) {
                    iZ_22.id_break(il_3.id_while);
                }
            });
            if (rbk_32.n_()) {
                iZ_22.id_class(il_3.id_while, iB_22, 100L);
                if (rbW_2.id_throws(iB_22)) {
                    rbW_2.id_break((rbM_2)rbk_32, iB_22);
                }
            } else if (iB_22.BC() == aI_2.id_long && rbW_2.id_new(rbk_32)) {
                rbW_2.id_throws(rbk_32, iB_22);
                rbW_2.id_byte(rbk_32, iB_22);
            } else {
                rbW_2.id_class((rbM_2)rbk_32, iB_22);
            }
        }
    }

    protected static void id_class(rbk_3 rbk_32) {
        int n = id_break.id_class(((rYB)rbk_32.id_throws[7]).id_int);
        rbk_32.SF().id_class(il_3.id_for, true, n);
    }

    public static ryZ_2 id_class(rbk_3 rbk_32, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rbW_2.id_break(rbk_32, rdn_32)) {
            rdn_3 rdn_33 = rdn_32.id_class(1);
            rbW_2.id_byte(rbk_32, rdn_33);
            rbW_2.id_protected((iB_2)rbk_32);
            rbW_2.id_final(rbk_32);
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    protected static void id_class(rbk_3 rbk_32, rsE_2 rsE_22) {
        rdn_3 rdn_32;
        rbW_2.id_final(rbk_32);
        if (rsE_22.id_protected().id_break() == rdy_3.JF) {
            rbk_32.id_class((an_3)rsE_22, rsE_22.id_protected().id_char());
            rdn_32 = rsE_22.id_protected();
            rsE_22.PD();
        } else {
            rbk_32.id_class((an_3)rsE_22, 1);
            rdn_32 = rbW_2.id_class(rsE_22);
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rbW_2.id_class(rdb_32)) {
            rbk_32.SF().id_break(il_3.id_strictfp);
            rbW_2.id_byte(rbk_32, rdn_32);
            rbW_2.id_protected((iB_2)rbk_32);
        } else if (rbW_2.id_byte(rdb_32) && !rbW_2.id_this(rbk_32)) {
            rbW_2.id_continue(rbk_32);
        } else {
            boolean bl = rbk_32.id_catch(rdn_32);
            if (!bl) {
                rbW_2.id_protected(rbk_32, rdn_32);
            }
        }
    }

    private static rry_3<rbk_3> id_class() {
        return new rry_3<rbk_3>((List<Pair<rPm_1<rbk_3>, Integer>>)ImmutableList.of((Object)Pair.of((Object)new rro_3(aI_2.rM, 8.0f), (Object)1), (Object)Pair.of((Object)new rro_3(aI_2.d, 8.0f), (Object)1), (Object)Pair.of((Object)new rro_3(8.0f), (Object)1), (Object)Pair.of((Object)new rrQ_2(30, 60), (Object)1)));
    }

    private static rdn_3 id_class(rsE_2 rsE_22) {
        rdn_3 rdn_32 = rsE_22.id_protected();
        rdn_3 rdn_33 = rdn_32.id_class(1);
        if (rdn_32.id_class()) {
            rsE_22.PD();
        } else {
            rsE_22.id_break(rdn_32);
        }
        return rdn_33;
    }

    protected static void id_class(rbk_3 rbk_32, boolean bl) {
        rdn_3 rdn_32 = rbk_32.id_protected(rpm_3.OFF_HAND);
        rbk_32.id_class(rpm_3.OFF_HAND, rdn_3.id_break);
        if (rbk_32.sx()) {
            boolean bl2;
            boolean bl3 = rbW_2.id_break(rdn_32.id_break());
            if (bl && bl3) {
                rbW_2.id_class(rbk_32, rbW_2.id_implements(rbk_32));
            } else if (!bl3 && !(bl2 = rbk_32.id_catch(rdn_32))) {
                rbW_2.id_protected(rbk_32, rdn_32);
            }
        } else {
            boolean bl4 = rbk_32.id_catch(rdn_32);
            if (!bl4) {
                rdn_3 rdn_33 = rbk_32.ss();
                if (rbW_2.id_class(rdn_33.id_break())) {
                    rbW_2.id_protected(rbk_32, rdn_33);
                } else {
                    rbW_2.id_class(rbk_32, Collections.singletonList(rdn_33));
                }
                rbk_32.id_volatile(rdn_32);
            }
        }
    }

    protected static boolean id_class(rdb_3 rdb_32) {
        return rdb_32.id_class(rlc_3.id_strictfp);
    }

    private static void id_class(rbk_3 rbk_32, List<rdn_3> list, rjU_2 rjU_22) {
        if (!list.isEmpty()) {
            rbk_32.id_class(rpm_3.OFF_HAND);
            for (rdn_3 rdn_32 : list) {
                iA_2.id_class((iB_2)rbk_32, rdn_32, rjU_22.id_break(0.0, 1.0, 0.0));
            }
        }
    }

    private static void id_class(rbk_3 rbk_32, List<rdn_3> list) {
        Optional<rhd_3> optional = rbk_32.SF().id_byte(il_3.id_extends);
        if (optional.isPresent()) {
            rbW_2.id_class(rbk_32, optional.get(), list);
        } else {
            rbW_2.id_break(rbk_32, list);
        }
    }

    private static void id_class(rbk_3 rbk_32, rhd_3 rhd_32, List<rdn_3> list) {
        rbW_2.id_class(rbk_32, list, rhd_32.Ps());
    }

    private static void id_break(rbk_3 rbk_32, iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_extends, 10, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of(new rrn_3(iB_22 -> !rbW_2.id_break(rbk_32, iB_22)), new rPN<rbk_3>(rbW_2::id_byte, new rrM_2(5, 0.75f)), (Object)new rrU_2(1.0f), (Object)new rrO_2(20), new rPJ(), new rbh_3(), new rPE<rbk_3>(rbW_2::id_finally, il_3.id_package)), il_3.id_package);
    }

    public static Optional<rhd_3> id_break(rbM_2 rbM_22) {
        return rbM_22.SF().id_class(il_3.id_native) ? rbM_22.SF().id_byte(il_3.id_native) : Optional.empty();
    }

    protected static void id_break(rbM_2 rbM_23, iB_2 iB_22) {
        rbW_2.id_throws(rbM_23).forEach(rbM_22 -> {
            if (iB_22.BC() != aI_2.id_long || rbM_22.id_throws() && ((rEg_1)iB_22).sd()) {
                rbW_2.id_throws(rbM_22, iB_22);
            }
        });
    }

    public static boolean id_break(iB_2 iB_22) {
        return iB_22.BC() == aI_2.rM && iB_22.id_class(rbW_2::id_class);
    }

    private static boolean id_break(rdb_3 rdb_32) {
        return rdb_32 == id_class;
    }

    private static void id_break(iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_break, 10, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of((Object)new rro_3(rbW_2::id_break, 14.0f), new rrp_3<rbk_3>(rbM_2::sx, rbW_2::id_extends), new rPN<rbk_3>(rbk_3::id_throws, new rbQ_2()), rbW_2.id_byte(), rbW_2.id_case(), rbW_2.id_class(), rbW_2.id_break(), (Object)new rrL_2(aI_2.rM, 4)));
    }

    protected static boolean id_break(rbk_3 rbk_32, rdn_3 rdn_32) {
        return !rbW_2.id_return(rbk_32) && !rbW_2.id_else(rbk_32) && rbk_32.sx() && rbW_2.id_break(rdn_32.id_break());
    }

    private static void id_break(rbk_3 rbk_32, List<rdn_3> list) {
        rbW_2.id_class(rbk_32, list, rbW_2.id_super(rbk_32));
    }

    protected static void id_break(rbk_3 rbk_32) {
        iZ_2<rbk_3> iZ_22 = rbk_32.SF();
        iq_3 iq_32 = iZ_22.id_protected().orElse(null);
        iZ_22.id_class((List<iq_3>)ImmutableList.of((Object)iq_3.id_volatile, (Object)iq_3.id_extends, (Object)iq_3.id_final, (Object)iq_3.id_native, (Object)iq_3.id_package, (Object)iq_3.id_break));
        iq_3 iq_33 = iZ_22.id_protected().orElse(null);
        if (iq_32 != iq_33) {
            rbW_2.id_protected(rbk_32).ifPresent(rbk_32::id_class);
        }
        rbk_32.id_case(iZ_22.id_class(il_3.id_package));
        if (!iZ_22.id_class(il_3.id_super) && rbW_2.id_private(rbk_32)) {
            rbk_32.BH();
        }
        if (!iZ_22.id_class(il_3.id_double)) {
            iZ_22.id_break(il_3.id_switch);
        }
        rbk_32.id_else(iZ_22.id_class(il_3.id_switch));
    }

    private static rry_3<rbk_3> id_break() {
        return new rry_3<rbk_3>((List<Pair<rPm_1<rbk_3>, Integer>>)ImmutableList.of((Object)Pair.of((Object)new rPC(0.6f), (Object)2), (Object)Pair.of(rrR_2.id_class(aI_2.d, 8, il_3.id_new, 0.6f, 2), (Object)2), (Object)Pair.of(new rPN<iB_2>(rbW_2::id_catch, new rPq_1(0.6f, 3)), (Object)2), (Object)Pair.of((Object)new rrQ_2(30, 60), (Object)1)));
    }

    private static boolean id_break(rbk_3 rbk_32, iB_2 iB_22) {
        return rbW_2.id_extends(rbk_32).filter(iB_23 -> iB_23 == iB_22).isPresent();
    }

    private static List<rbM_2> id_throws(rbM_2 rbM_22) {
        return rbM_22.SF().id_byte(il_3.S).orElse((List<rbM_2>)ImmutableList.of());
    }

    private static void id_throws(rbk_3 rbk_32, iB_2 iB_22) {
        rbk_32.SF().id_break(il_3.id_short);
        rbk_32.SF().id_break(il_3.id_package);
        rbk_32.SF().id_break(il_3.id_volatile);
        rbk_32.SF().id_class(il_3.id_while, iB_22, id_throws.id_class(((rYB)rbk_32.id_throws[7]).id_int));
        rbW_2.id_byte((rbM_2)rbk_32);
    }

    protected static boolean id_throws(rbk_3 rbk_32) {
        return rbk_32.SF().id_class(il_3.id_for) || rbW_2.id_volatile(rbk_32).stream().anyMatch(rbM_22 -> rbM_22.SF().id_class(il_3.id_for));
    }

    private static rPs_1<rbk_3, iB_2> id_throws() {
        return new rPs_1<rbk_3, iB_2>(rbW_2::id_finally, il_3.b, il_3.id_while, id_case);
    }

    private static void id_throws(rbM_2 rbM_22, iB_2 iB_22) {
        Optional<iB_2> optional = rbW_2.id_case(rbM_22);
        iB_2 iB_23 = iA_2.id_class((iB_2)rbM_22, optional, iB_22);
        if (!optional.isPresent() || optional.get() != iB_23) {
            rbW_2.id_byte(rbM_22, iB_23);
        }
    }

    private static void id_throws(iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_final, 10, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of(rPO.id_break(il_3.id_while, 1.0f, 12, true), rbW_2.id_class(), rbW_2.id_break(), new rPE<rbk_3>(rbW_2::id_package, il_3.id_while)), il_3.id_while);
    }

    private static boolean id_throws(iB_2 iB_22) {
        return rpJ_2.id_case.test(iB_22);
    }

    private static boolean id_finally(rbk_3 rbk_32) {
        iZ_2<rbk_3> iZ_22 = rbk_32.SF();
        if (iZ_22.id_class(il_3.b)) {
            iB_2 iB_22 = iZ_22.id_byte(il_3.b).get();
            return rbk_32.id_class((an_3)iB_22, 6.0);
        }
        return false;
    }

    public static Optional<iB_2> id_catch(rbk_3 rbk_32) {
        return rbk_32.SF().id_class(il_3.id_while) ? rbk_32.SF().id_byte(il_3.id_while) : Optional.empty();
    }

    private static boolean id_catch(iB_2 iB_22) {
        return !rbW_2.id_case(iB_22);
    }

    private static Optional<? extends iB_2> id_extends(rbk_3 rbk_32) {
        Optional<iB_2> optional;
        iZ_2<rbk_3> iZ_22 = rbk_32.SF();
        if (rbW_2.id_finally(rbk_32)) {
            return Optional.empty();
        }
        Optional<iB_2> optional2 = iA_2.id_class((iB_2)rbk_32, il_3.id_short);
        if (optional2.isPresent() && rbW_2.id_throws(optional2.get())) {
            return optional2;
        }
        if (iZ_22.id_class(il_3.id_default) && (optional = iZ_22.id_byte(il_3.id_native)).isPresent()) {
            return optional;
        }
        optional = iZ_22.id_byte(il_3.id_import);
        if (optional.isPresent()) {
            return optional;
        }
        Optional<rhd_3> optional3 = iZ_22.id_byte(il_3.B);
        return optional3.isPresent() && rbW_2.id_throws(optional3.get()) ? optional3 : Optional.empty();
    }

    private static boolean id_goto(rbk_3 rbk_32) {
        return rbk_32.Sn().id_class() || !rbW_2.id_class(rbk_32.Sn().id_break());
    }

    private static Optional<iB_2> id_case(rbM_2 rbM_22) {
        return iA_2.id_class((iB_2)rbM_22, il_3.id_short);
    }

    private static boolean id_case(iB_2 iB_22) {
        return iB_22.SF().id_class(il_3.h);
    }

    protected static void id_case(rbk_3 rbk_32) {
        rbW_2.id_volatile(rbk_32).forEach(rbW_2::id_byte);
    }

    private static rPh_1<rbk_3> id_case() {
        return new rPh_1<rbk_3>(new rPs_1<rbk_3, an_3>(rbk_3::n_, il_3.P, il_3.id_super, id_protected), id_byte);
    }

    private static void id_case(iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_package, 10, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of(new rPb_1(0.8f), (Object)new rro_3(rbW_2::id_break, 8.0f), new rPN<rbk_3>(an_3::Pm, rbW_2.id_class()), new rPQ(8, rbW_2::id_class)), il_3.id_super);
    }

    private static void id_continue(rbk_3 rbk_32) {
        rbk_32.SF().id_class(il_3.X, true, 200L);
    }

    private static boolean id_else(rbk_3 rbk_32) {
        return rbk_32.SF().id_class(il_3.id_const);
    }

    private static List<rdn_3> id_implements(rbk_3 rbk_32) {
        rzL_2 rzL_22 = ((rYB)rbk_32.id_throws[7]).id_const().o().id_class(rzl_3.l);
        return rzL_22.id_class(new rzP_2((rrEm_1)((rYB)rbk_32.id_throws[7])).id_class(rzQ_2.id_class, rbk_32).id_class(((rYB)rbk_32.id_throws[7]).id_int).id_class(rzz_3.id_private));
    }

    private static boolean id_new(rbk_3 rbk_32) {
        int n = rbk_32.SF().id_byte(il_3.M).orElse(0) + 1;
        int n2 = rbk_32.SF().id_byte(il_3.O).orElse(0);
        return n2 > n;
    }

    private static boolean id_package(rbk_3 rbk_32) {
        iZ_2<rbk_3> iZ_22 = rbk_32.SF();
        if (!iZ_22.id_class(il_3.id_while)) {
            return true;
        }
        iB_2 iB_22 = iZ_22.id_byte(il_3.id_while).get();
        aI_2<?> aI_22 = iB_22.BC();
        if (aI_22 == aI_2.id_long) {
            return rbW_2.id_int(rbk_32);
        }
        if (rbW_2.id_class(aI_22)) {
            return !iZ_22.id_break(il_3.b, iB_22);
        }
        return false;
    }

    private static boolean id_return(rbk_3 rbk_32) {
        return rbk_32.SF().id_class(il_3.id_transient);
    }

    private static rjU_2 id_super(rbk_3 rbk_32) {
        rjU_2 rjU_22 = iX_2.id_break(rbk_32, 4, 2);
        return rjU_22 == null ? rbk_32.Ps() : rjU_22;
    }

    private static boolean id_public(rbk_3 rbk_32) {
        return !rbk_32.Sn().id_class();
    }

    private static void id_protected(rbk_3 rbk_32, rdn_3 rdn_32) {
        rdn_3 rdn_33 = rbk_32.id_extends(rdn_32);
        rbW_2.id_break(rbk_32, Collections.singletonList(rdn_33));
    }

    private static rPs_1<rbk_3, iB_2> id_protected() {
        return new rPs_1<rbk_3, iB_2>(rbk_3::n_, il_3.id_import, il_3.id_while, id_catch);
    }

    public static Optional<rqA_2> id_protected(rbk_3 rbk_32) {
        return rbk_32.SF().id_protected().map(iq_32 -> rbW_2.id_class(rbk_32, iq_32));
    }

    private static void id_protected(iZ_2<rbk_3> iZ_22) {
        iZ_22.id_class(iq_3.id_volatile, 10, (ImmutableList<rPm_1<rbk_3>>)ImmutableList.of(new rPS<rbk_3>(rbW_2::id_goto, 1.0f, true, 9), new rbX_2(9), new rbN_2(200, 200)), il_3.id_const);
    }

    protected static boolean id_protected(rbM_2 rbM_22) {
        return rbM_22.SF().id_byte(iq_3.id_break);
    }

    private static void id_protected(iB_2 iB_22) {
        iB_22.SF().id_class(il_3.id_const, true, 120L);
    }

    private static void id_protected(rbM_2 rbM_22, iB_2 iB_22) {
        Optional<rhd_3> optional = rbW_2.id_break(rbM_22);
        if (optional.isPresent()) {
            rbW_2.id_byte(rbM_22, (iB_2)optional.get());
        } else {
            rbW_2.id_byte(rbM_22, iB_22);
        }
    }

    private static void id_protected(rbk_3 rbk_32, iB_2 iB_22) {
        iZ_2<rbk_3> iZ_22 = rbk_32.SF();
        iB_2 iB_23 = iA_2.id_class((iB_2)rbk_32, iZ_22.id_byte(il_3.id_while), iB_22);
        iB_23 = iA_2.id_class((iB_2)rbk_32, iZ_22.id_byte(il_3.id_package), iB_23);
        rbW_2.id_throws(rbk_32, iB_23);
    }

    private static boolean id_private(iB_2 iB_22) {
        return iB_22.SF().id_class(il_3.id_public);
    }

    private static boolean id_private(rbk_3 rbk_32) {
        if (!rbk_32.n_()) {
            return false;
        }
        an_3 an_32 = rbk_32.ra();
        return an_32 instanceof rbk_3 && ((rbk_3)an_32).n_() || an_32 instanceof rEg_1 && ((rEg_1)an_32).n_();
    }

    private static void id_final(rbk_3 rbk_32) {
        rbk_32.SF().id_break(il_3.id_volatile);
        rbk_32.id_public().id_final();
    }

    private static List<rbM_2> id_volatile(rbk_3 rbk_32) {
        return rbk_32.SF().id_byte(il_3.s).orElse((List<rbM_2>)ImmutableList.of());
    }

    private static boolean id_synchronized(rbk_3 rbk_32) {
        return rbk_32.SF().id_class(il_3.J);
    }

    private static boolean id_native(rbk_3 rbk_32) {
        iZ_2<rbk_3> iZ_22 = rbk_32.SF();
        return !iZ_22.id_class(il_3.id_while) ? false : iZ_22.id_byte(il_3.id_while).get().id_class((an_3)rbk_32, 12.0);
    }
}

