package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class iN_2 {
   private static final Logger class_ = LogManager.getLogger();
   private static final Map<aI_2<? extends iB_2>, iW_2> break_ = ImmutableMap.builder()
      .put(aI_2.break_, iB_2.SD().class_())
      .put(aI_2.protected_, rbv_3.throws_().class_())
      .put(aI_2.throws_, rbF_2.sm().class_())
      .put(aI_2.case_, rEO.throws_().class_())
      .put(aI_2.private_, rbf_3.su().class_())
      .put(aI_2.implements_, rEX.throws_().class_())
      .put(aI_2.finally_, rbR_2.L().class_())
      .put(aI_2.extends_, rOp_1.throws_().class_())
      .put(aI_2.native_, rbY_2.L().class_())
      .put(aI_2.volatile_, rEJ.throws_().class_())
      .put(aI_2.final_, rbo_3.sJ().class_())
      .put(aI_2.package_, rOK.n().class_())
      .put(aI_2.new_, rbB_2.sz().class_())
      .put(aI_2.continue_, rEc_1.throws_().class_())
      .put(aI_2.else_, rEu_1.L().class_())
      .put(aI_2.synchronized_, rEL.throws_().class_())
      .put(aI_2.this_, rSu_1.throws_().class_())
      .put(aI_2.return_, rEA.sN().class_())
      .put(aI_2.throw_, rba_3.L().class_())
      .put(aI_2.interface_, rEy_1.implements_().class_())
      .put(aI_2.char_, rEw_1.throws_().class_())
      .put(aI_2.abstract_, rEI.sx().class_())
      .put(aI_2.long_, rEg_1.L().class_())
      .put(aI_2.float_, rOD.sq().class_())
      .put(aI_2.void_, rbB_2.sz().class_())
      .put(aI_2.static_, rED.sN().class_())
      .put(aI_2.import_, rMZ.L().class_())
      .put(aI_2.transient_, rhP_2.sU().class_())
      .put(aI_2.double_, rEa_1.throws_().class_())
      .put(aI_2.b, rbY_2.L().class_())
      .put(aI_2.G, rOK.n().class_())
      .put(aI_2.M, rMA.L().class_())
      .put(aI_2.h, rMl_1.sv().class_())
      .put(aI_2.X, rMR.L().class_())
      .put(aI_2.J, rEi_1.sm().class_())
      .put(aI_2.x, rMo_1.L().class_())
      .put(aI_2.d, rbk_3.sz().class_())
      .put(aI_2.k, rbd_3.sz().class_())
      .put(aI_2.W, rGJ.sN().class_())
      .put(aI_2.rM, rhd_3.sy().class_())
      .put(aI_2.z, rMK.L().class_())
      .put(aI_2.N, rOp_1.throws_().class_())
      .put(aI_2.c, rMi_1.n().class_())
      .put(aI_2.u, rGx_1.throws_().class_())
      .put(aI_2.m, rOp_1.throws_().class_())
      .put(aI_2.Z, rOb_1.L().class_())
      .put(aI_2.v, rGz_1.throws_().class_())
      .put(aI_2.L, rGZ.throws_().class_())
      .put(aI_2.A, rEb_1.throws_().class_())
      .put(aI_2.n, rhG_2.n().class_())
      .put(aI_2.C, rEi_1.sm().class_())
      .put(aI_2.H, rOX.throws_().class_())
      .put(aI_2.q, rGw_1.L().class_())
      .put(aI_2.T, rOJ.throws_().class_())
      .put(aI_2.t, rEb_1.throws_().class_())
      .put(aI_2.w, rOk_1.sJ().class_())
      .put(aI_2.R, rhP_2.sU().class_())
      .put(aI_2.Y, rOp_1.throws_().class_())
      .put(aI_2.o, rON.sJ().class_())
      .put(aI_2.K, rGg_1.throws_().class_())
      .put(aI_2.D, rsq_3.sW().class_())
      .put(aI_2.U, rGD.sN().class_())
      .put(aI_2.e, is_3.package_().class_())
      .put(aI_2.a, rGi_1.sN().class_())
      .put(aI_2.i, rSN.L().class_())
      .put(aI_2.rr, rEb_1.throws_().class_())
      .put(aI_2.rB, rOH.L().class_())
      .put(aI_2.rS, rbP_2.throws_().class_())
      .put(aI_2.rs, rbB_2.sz().class_())
      .put(aI_2.rE, rhO_2.n().class_())
      .put(aI_2.rG, rbB_2.sz().class_())
      .put(aI_2.rb, rbG_2.su().class_())
      .build();

   public static iW_2 class_(aI_2<? extends iB_2> var0) {
      return break_.get(var0);
   }

   public static void class_() {
      rVL.transient_.case_().filter(var0 -> var0.throws_() != aH_2.MISC).filter(var0 -> !break_((aI_2<?>)var0)).map(rVL.transient_::break_).forEach(var0 -> {
         if (rqu_3.byte_) {
            throw new IllegalStateException("Entity " + var0 + " has no attributes");
         } else {
            class_.error("Entity {} has no attributes", var0);
         }
      });
   }

   public static boolean break_(aI_2<?> var0) {
      return break_.containsKey(var0);
   }
}
