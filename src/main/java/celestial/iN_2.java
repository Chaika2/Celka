/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aH_2;
import celestial.aI_2;
import celestial.iB_2;
import celestial.iW_2;
import celestial.is_3;
import celestial.rEA;
import celestial.rED;
import celestial.rEI;
import celestial.rEJ;
import celestial.rEL;
import celestial.rEO;
import celestial.rEX;
import celestial.rEa_1;
import celestial.rEb_1;
import celestial.rEc_1;
import celestial.rEg_1;
import celestial.rEi_1;
import celestial.rEu_1;
import celestial.rEw_1;
import celestial.rEy_1;
import celestial.rGD;
import celestial.rGJ;
import celestial.rGZ;
import celestial.rGg_1;
import celestial.rGi_1;
import celestial.rGw_1;
import celestial.rGx_1;
import celestial.rGz_1;
import celestial.rMA;
import celestial.rMK;
import celestial.rMR;
import celestial.rMZ;
import celestial.rMi_1;
import celestial.rMl_1;
import celestial.rMo_1;
import celestial.rOD;
import celestial.rOH;
import celestial.rOJ;
import celestial.rOK;
import celestial.rON;
import celestial.rOX;
import celestial.rOb_1;
import celestial.rOk_1;
import celestial.rOp_1;
import celestial.rSN;
import celestial.rSu_1;
import celestial.rVL;
import celestial.rbB_2;
import celestial.rbF_2;
import celestial.rbG_2;
import celestial.rbP_2;
import celestial.rbR_2;
import celestial.rbY_2;
import celestial.rba_3;
import celestial.rbd_3;
import celestial.rbf_3;
import celestial.rbk_3;
import celestial.rbo_3;
import celestial.rbv_3;
import celestial.rhG_2;
import celestial.rhO_2;
import celestial.rhP_2;
import celestial.rhd_3;
import celestial.rqu_3;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class iN_2 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Map<aI_2<? extends iB_2>, iW_2> id_break = ImmutableMap.builder().put(aI_2.id_break, (Object)iB_2.SD().id_class()).put(aI_2.id_protected, (Object)rbv_3.id_throws().id_class()).put(aI_2.id_throws, (Object)rbF_2.sm().id_class()).put(aI_2.id_case, (Object)rEO.id_throws().id_class()).put(aI_2.id_private, (Object)rbf_3.su().id_class()).put(aI_2.id_implements, (Object)rEX.id_throws().id_class()).put(aI_2.id_finally, (Object)rbR_2.L().id_class()).put(aI_2.id_extends, (Object)rOp_1.id_throws().id_class()).put(aI_2.id_native, (Object)rbY_2.L().id_class()).put(aI_2.id_volatile, (Object)rEJ.id_throws().id_class()).put(aI_2.id_final, (Object)rbo_3.sJ().id_class()).put(aI_2.id_package, (Object)rOK.n().id_class()).put(aI_2.id_new, (Object)rbB_2.sz().id_class()).put(aI_2.id_continue, (Object)rEc_1.id_throws().id_class()).put(aI_2.id_else, (Object)rEu_1.L().id_class()).put(aI_2.id_synchronized, (Object)rEL.id_throws().id_class()).put(aI_2.id_this, (Object)rSu_1.id_throws().id_class()).put(aI_2.id_return, (Object)rEA.sN().id_class()).put(aI_2.id_throw, (Object)rba_3.L().id_class()).put(aI_2.id_interface, (Object)rEy_1.id_implements().id_class()).put(aI_2.id_char, (Object)rEw_1.id_throws().id_class()).put(aI_2.id_abstract, (Object)rEI.sx().id_class()).put(aI_2.id_long, (Object)rEg_1.L().id_class()).put(aI_2.id_float, (Object)rOD.sq().id_class()).put(aI_2.id_void, (Object)rbB_2.sz().id_class()).put(aI_2.id_static, (Object)rED.sN().id_class()).put(aI_2.id_import, (Object)rMZ.L().id_class()).put(aI_2.id_transient, (Object)rhP_2.sU().id_class()).put(aI_2.id_double, (Object)rEa_1.id_throws().id_class()).put(aI_2.b, (Object)rbY_2.L().id_class()).put(aI_2.G, (Object)rOK.n().id_class()).put(aI_2.M, (Object)rMA.L().id_class()).put(aI_2.h, (Object)rMl_1.sv().id_class()).put(aI_2.X, (Object)rMR.L().id_class()).put(aI_2.J, (Object)rEi_1.sm().id_class()).put(aI_2.x, (Object)rMo_1.L().id_class()).put(aI_2.d, (Object)rbk_3.sz().id_class()).put(aI_2.k, (Object)rbd_3.sz().id_class()).put(aI_2.W, (Object)rGJ.sN().id_class()).put(aI_2.rM, (Object)rhd_3.sy().id_class()).put(aI_2.z, (Object)rMK.L().id_class()).put(aI_2.N, (Object)rOp_1.id_throws().id_class()).put(aI_2.c, (Object)rMi_1.n().id_class()).put(aI_2.u, (Object)rGx_1.id_throws().id_class()).put(aI_2.m, (Object)rOp_1.id_throws().id_class()).put(aI_2.Z, (Object)rOb_1.L().id_class()).put(aI_2.v, (Object)rGz_1.id_throws().id_class()).put(aI_2.L, (Object)rGZ.id_throws().id_class()).put(aI_2.A, (Object)rEb_1.id_throws().id_class()).put(aI_2.n, (Object)rhG_2.n().id_class()).put(aI_2.C, (Object)rEi_1.sm().id_class()).put(aI_2.H, (Object)rOX.id_throws().id_class()).put(aI_2.q, (Object)rGw_1.L().id_class()).put(aI_2.T, (Object)rOJ.id_throws().id_class()).put(aI_2.t, (Object)rEb_1.id_throws().id_class()).put(aI_2.w, (Object)rOk_1.sJ().id_class()).put(aI_2.R, (Object)rhP_2.sU().id_class()).put(aI_2.Y, (Object)rOp_1.id_throws().id_class()).put(aI_2.o, (Object)rON.sJ().id_class()).put(aI_2.K, (Object)rGg_1.id_throws().id_class()).put(aI_2.D, (Object)rsq_3.sW().id_class()).put(aI_2.U, (Object)rGD.sN().id_class()).put(aI_2.e, (Object)is_3.id_package().id_class()).put(aI_2.a, (Object)rGi_1.sN().id_class()).put(aI_2.i, (Object)rSN.L().id_class()).put(aI_2.rr, (Object)rEb_1.id_throws().id_class()).put(aI_2.rB, (Object)rOH.L().id_class()).put(aI_2.rS, (Object)rbP_2.id_throws().id_class()).put(aI_2.rs, (Object)rbB_2.sz().id_class()).put(aI_2.rE, (Object)rhO_2.n().id_class()).put(aI_2.rG, (Object)rbB_2.sz().id_class()).put(aI_2.rb, (Object)rbG_2.su().id_class()).build();

    public static iW_2 id_class(aI_2<? extends iB_2> aI_22) {
        return id_break.get(aI_22);
    }

    public static void id_class() {
        rVL.id_transient.id_case().filter(aI_22 -> aI_22.id_throws() != aH_2.MISC).filter(aI_22 -> !iN_2.id_break(aI_22)).map(rVL.id_transient::id_break).forEach(rqO_22 -> {
            if (rqu_3.id_byte) {
                throw new IllegalStateException("Entity " + rqO_22 + " has no attributes");
            }
            id_class.error("Entity {} has no attributes", rqO_22);
        });
    }

    public static boolean id_break(aI_2<?> aI_22) {
        return id_break.containsKey(aI_22);
    }
}

