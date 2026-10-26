/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aI_2;
import celestial.aT_2;
import celestial.an_3;
import celestial.at_3;
import celestial.aw_3;
import celestial.iO_2;
import celestial.is_3;
import celestial.rEI;
import celestial.rEL;
import celestial.rEY;
import celestial.rEa_1;
import celestial.rEg_1;
import celestial.rEi_1;
import celestial.rEx_1;
import celestial.rEy_1;
import celestial.rGA;
import celestial.rGV;
import celestial.rGZ;
import celestial.rGr_1;
import celestial.rKv_1;
import celestial.rMA;
import celestial.rMF;
import celestial.rMK;
import celestial.rMR;
import celestial.rMi_1;
import celestial.rOJ;
import celestial.rON;
import celestial.rOk_1;
import celestial.rOp_1;
import celestial.rRf_1;
import celestial.rVL;
import celestial.rbG_2;
import celestial.rbZ_2;
import celestial.rbk_3;
import celestial.rbo_3;
import celestial.rbv_3;
import celestial.rfH_2;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class aq_3 {
    private static final Map<aI_2<?>, aT_2> id_class = Maps.newHashMap();

    static {
        aq_3.id_class(aI_2.id_extends, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rOp_1::id_break);
        aq_3.id_class(aI_2.id_final, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbo_3::id_break);
        aq_3.id_class(aI_2.id_new, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEx_1::id_class);
        aq_3.id_class(aI_2.id_abstract, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEI::id_break);
        aq_3.id_class(aI_2.N, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rOp_1::id_break);
        aq_3.id_class(aI_2.m, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rOp_1::id_break);
        aq_3.id_class(aI_2.T, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rOJ::id_break);
        aq_3.id_class(aI_2.Y, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rOp_1::id_break);
        aq_3.id_class(aI_2.id_protected, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbv_3::id_break);
        aq_3.id_class(aI_2.id_case, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_byte);
        aq_3.id_class(aI_2.id_implements, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.id_finally, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_native, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_volatile, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.id_package, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_else, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.id_synchronized, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEL::id_break);
        aq_3.id_class(aI_2.id_this, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
        aq_3.id_class(aI_2.id_interface, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEy_1::id_break);
        aq_3.id_class(aI_2.id_char, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.id_float, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_void, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEY::id_class);
        aq_3.id_class(aI_2.id_import, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
        aq_3.id_class(aI_2.id_transient, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_double, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEa_1::id_break);
        aq_3.id_class(aI_2.b, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rMF::id_break);
        aq_3.id_class(aI_2.G, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.M, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING, rMA::id_break);
        aq_3.id_class(aI_2.X, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING, rMR::id_break);
        aq_3.id_class(aI_2.x, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_long, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEg_1::id_break);
        aq_3.id_class(aI_2.d, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbk_3::id_break);
        aq_3.id_class(aI_2.W, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rGr_1::id_break);
        aq_3.id_class(aI_2.z, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rMK::id_break);
        aq_3.id_class(aI_2.c, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rMi_1::id_break);
        aq_3.id_class(aI_2.Z, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.L, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rGZ::id_break);
        aq_3.id_class(aI_2.A, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.n, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.C, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rGA::id_byte);
        aq_3.id_class(aI_2.H, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
        aq_3.id_class(aI_2.q, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.t, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rGV::id_class);
        aq_3.id_class(aI_2.w, aw_3.IN_LAVA, rKv_1.MOTION_BLOCKING_NO_LEAVES, rOk_1::id_break);
        aq_3.id_class(aI_2.o, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rON::id_break);
        aq_3.id_class(aI_2.D, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
        aq_3.id_class(aI_2.a, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.i, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.rr, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.rB, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.rs, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.rE, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.rb, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbG_2::id_break);
        aq_3.id_class(aI_2.rG, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.id_private, aw_3.ON_GROUND, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_continue, aw_3.IN_WATER, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEI::id_break);
        aq_3.id_class(aI_2.id_return, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.id_throw, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.id_static, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.h, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.J, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
        aq_3.id_class(aI_2.u, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.v, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
        aq_3.id_class(aI_2.R, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rbZ_2::id_byte);
        aq_3.id_class(aI_2.K, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.U, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, rEi_1::id_break);
        aq_3.id_class(aI_2.e, aw_3.NO_RESTRICTIONS, rKv_1.MOTION_BLOCKING_NO_LEAVES, is_3::id_class);
    }

    public static <T extends an_3> boolean id_class(aI_2<T> aI_22, rRf_1 rRf_12, iO_2 iO_22, rfH_2 rfH_22, Random random) {
        aT_2 aT_22 = id_class.get(aI_22);
        return aT_22 == null || aT_22.id_byte.test(aI_22, rRf_12, iO_22, rfH_22, random);
    }

    private static <T extends is_3> void id_class(aI_2<T> aI_22, aw_3 aw_32, rKv_1 rKv_12, at_3<T> at_32) {
        aT_2 aT_22 = id_class.put(aI_22, new aT_2(rKv_12, aw_32, at_32));
        if (aT_22 != null) {
            throw new IllegalStateException("Duplicate registration for type " + rVL.id_transient.id_break(aI_22));
        }
    }

    public static aw_3 id_class(aI_2<?> aI_22) {
        aT_2 aT_22 = id_class.get(aI_22);
        return aT_22 == null ? aw_3.NO_RESTRICTIONS : aT_22.id_break;
    }

    public static rKv_1 id_break(aI_2<?> aI_22) {
        aT_2 aT_22 = id_class.get(aI_22);
        return aT_22 == null ? rKv_1.MOTION_BLOCKING_NO_LEAVES : aT_22.id_class;
    }
}

