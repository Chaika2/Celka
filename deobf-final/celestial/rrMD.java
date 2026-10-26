package celestial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class rrMD {
   private static Map<String, rrMi_1> class_ = break_();

   private static void class_(Map<String, rrMi_1> var0, rrMi_1 var1, String var2) {
      if (var0.containsKey(var2)) {
         String var3 = "?";
         rrWQ var4 = var1.class_();
         if (var4.class_().isPresent()) {
            var3 = ((aI_2)var4.class_().get()).private_();
         }

         if (var4.break_().isPresent()) {
            var3 = ryW_2.class_((ryW_2<?>)var4.break_().get()) + "";
         }

         rrbb_3.protected_("Model adapter already registered for id: " + var2 + ", type: " + var3);
      }

      var0.put(var2, var1);
   }

   public static String[] class_() {
      Set var0 = class_.keySet();
      return var0.toArray(new String[var0.size()]);
   }

   public static rrMi_1 class_(String var0) {
      return class_.get(var0);
   }

   private static void class_(Map<String, rrMi_1> var0, rrMi_1 var1) {
      class_(var0, var1, var1.break_());
      String[] var2 = var1.byte_();
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            class_(var0, var1, var4);
         }
      }

      In_1 var8 = var1.throws_();
      String[] var9 = var1.case_();

      for (int var5 = 0; var5 < var9.length; var5++) {
         String var6 = var9[var5];
         Iq_1 var7 = var1.class_(var8, var6);
         if (var7 == null) {
            rrbb_3.protected_("Model renderer not found, model: " + var1.break_() + ", name: " + var6);
         }
      }
   }

   private static Map<String, rrMi_1> break_() {
      LinkedHashMap var0 = new LinkedHashMap();
      class_(var0, new rrOr_1());
      class_(var0, new rrOB());
      class_(var0, new rrOs_1());
      class_(var0, new rrOb_1());
      class_(var0, new rrOM());
      class_(var0, new rrOJ());
      class_(var0, new rrOk_1());
      class_(var0, new rrOX());
      class_(var0, new rrOQ());
      class_(var0, new rrOW());
      class_(var0, new rrON());
      class_(var0, new rrOm_1());
      class_(var0, new rrOu_1());
      class_(var0, new rrOc_1());
      class_(var0, new rrOZ());
      class_(var0, new rrOv_1());
      class_(var0, new rrOL());
      class_(var0, new rrOA());
      class_(var0, new rrOn_1());
      class_(var0, new rrOC());
      class_(var0, new rrOl_1());
      class_(var0, new rrOH());
      class_(var0, new rrOy_1());
      class_(var0, new rrOp_1());
      class_(var0, new rrOq_1());
      class_(var0, new rrOV());
      class_(var0, new rrOg_1());
      class_(var0, new rrOR());
      class_(var0, new rrOo_1());
      class_(var0, new rrOK());
      class_(var0, new rrOD());
      class_(var0, new rrOU());
      class_(var0, new rrOa_1());
      class_(var0, new rrOi_1());
      class_(var0, new rrhr_3());
      class_(var0, new rrhP_2());
      class_(var0, new rrhB_2());
      class_(var0, new rrhS_2());
      class_(var0, new rrhs_3());
      class_(var0, new rrhG_2());
      class_(var0, new rrhE_2());
      class_(var0, new rrhb_3());
      class_(var0, new rrhM_2());
      class_(var0, new rrhO_2());
      class_(var0, new rrhh_3());
      class_(var0, new rrhX_2());
      class_(var0, new rrhJ_2());
      class_(var0, new rrhx_3());
      class_(var0, new rrhd_3());
      class_(var0, new rrhk_3());
      class_(var0, new rrhz_3());
      class_(var0, new rrhW_2());
      class_(var0, new rrhQ_2());
      class_(var0, new rrhN_2());
      class_(var0, new rrhc_3());
      class_(var0, new rrhm_3());
      class_(var0, new rrhZ_2());
      class_(var0, new rrhv_3());
      class_(var0, new rrhF_2());
      class_(var0, new rrhA_2());
      class_(var0, new rrhC_2());
      class_(var0, new rrhH_2());
      class_(var0, new rrhy_3());
      class_(var0, new rrhp_3());
      class_(var0, new rrhq_3());
      class_(var0, new rrhT_2());
      class_(var0, new rrht_3());
      class_(var0, new rrhw_3());
      class_(var0, new rrhI_2());
      class_(var0, new rrhf_3());
      class_(var0, new rrhj_3());
      class_(var0, new rrhR_2());
      class_(var0, new rrhY_2());
      class_(var0, new rrho_3());
      class_(var0, new rrhK_2());
      class_(var0, new rrhD_2());
      class_(var0, new rrhU_2());
      class_(var0, new rrhe_3());
      class_(var0, new rrha_3());
      class_(var0, new rrhi_3());
      class_(var0, new rrXr_1());
      class_(var0, new rrXP());
      class_(var0, new rrXB());
      class_(var0, new rrXS());
      class_(var0, new rrXs_1());
      class_(var0, new rrXE());
      class_(var0, new rrXG());
      class_(var0, new rrXb_1());
      class_(var0, new rrXM());
      class_(var0, new rrhL_2());
      class_(var0, new rrOe_1());
      class_(var0, new rrOP());
      class_(var0, new rrOS());
      class_(var0, new rrOE());
      class_(var0, new rrOO());
      class_(var0, new rrOh_1());
      class_(var0, new rrOx_1());
      class_(var0, new rrOd_1());
      class_(var0, new rrOz_1());
      class_(var0, new rrOF());
      class_(var0, new rrOT());
      class_(var0, new rrOt_1());
      class_(var0, new rrOw_1());
      class_(var0, new rrOI());
      class_(var0, new rrOf_1());
      class_(var0, new rrOj_1());
      class_(var0, new rrhn_3());
      class_(var0, new rrhl_3());
      class_(var0, new rrhV_2());
      class_(var0, new rrhg_3());
      return var0;
   }
}
