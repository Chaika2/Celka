package celestial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class rrMD {
   private static Map<String, rrMi_1> id_class = id_break();

   private static void id_class(Map<String, rrMi_1> var0, rrMi_1 var1, String var2) {
      if (var0.containsKey(var2)) {
         String var3 = "?";
         rrWQ var4 = var1.id_class();
         if (var4.id_class().isPresent()) {
            var3 = ((aI_2)var4.id_class().get()).id_private();
         }

         if (var4.id_break().isPresent()) {
            var3 = ryW_2.id_class((ryW_2<?>)var4.id_break().get()) + "";
         }

         rrbb_3.id_protected("Model adapter already registered for id: " + var2 + ", type: " + var3);
      }

      var0.put(var2, var1);
   }

   public static String[] id_class() {
      Set var0 = id_class.keySet();
      return var0.toArray(new String[var0.size()]);
   }

   public static rrMi_1 id_class(String var0) {
      return id_class.get(var0);
   }

   private static void id_class(Map<String, rrMi_1> var0, rrMi_1 var1) {
      id_class(var0, var1, var1.id_break());
      String[] var2 = var1.id_byte();
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            id_class(var0, var1, var4);
         }
      }

      In_1 var8 = var1.id_throws();
      String[] var9 = var1.id_case();

      for (int var5 = 0; var5 < var9.length; var5++) {
         String var6 = var9[var5];
         Iq_1 var7 = var1.id_class(var8, var6);
         if (var7 == null) {
            rrbb_3.id_protected("Model renderer not found, model: " + var1.id_break() + ", name: " + var6);
         }
      }
   }

   private static Map<String, rrMi_1> id_break() {
      LinkedHashMap var0 = new LinkedHashMap();
      id_class(var0, new rrOr_1());
      id_class(var0, new rrOB());
      id_class(var0, new rrOs_1());
      id_class(var0, new rrOb_1());
      id_class(var0, new rrOM());
      id_class(var0, new rrOJ());
      id_class(var0, new rrOk_1());
      id_class(var0, new rrOX());
      id_class(var0, new rrOQ());
      id_class(var0, new rrOW());
      id_class(var0, new rrON());
      id_class(var0, new rrOm_1());
      id_class(var0, new rrOu_1());
      id_class(var0, new rrOc_1());
      id_class(var0, new rrOZ());
      id_class(var0, new rrOv_1());
      id_class(var0, new rrOL());
      id_class(var0, new rrOA());
      id_class(var0, new rrOn_1());
      id_class(var0, new rrOC());
      id_class(var0, new rrOl_1());
      id_class(var0, new rrOH());
      id_class(var0, new rrOy_1());
      id_class(var0, new rrOp_1());
      id_class(var0, new rrOq_1());
      id_class(var0, new rrOV());
      id_class(var0, new rrOg_1());
      id_class(var0, new rrOR());
      id_class(var0, new rrOo_1());
      id_class(var0, new rrOK());
      id_class(var0, new rrOD());
      id_class(var0, new rrOU());
      id_class(var0, new rrOa_1());
      id_class(var0, new rrOi_1());
      id_class(var0, new rrhr_3());
      id_class(var0, new rrhP_2());
      id_class(var0, new rrhB_2());
      id_class(var0, new rrhS_2());
      id_class(var0, new rrhs_3());
      id_class(var0, new rrhG_2());
      id_class(var0, new rrhE_2());
      id_class(var0, new rrhb_3());
      id_class(var0, new rrhM_2());
      id_class(var0, new rrhO_2());
      id_class(var0, new rrhh_3());
      id_class(var0, new rrhX_2());
      id_class(var0, new rrhJ_2());
      id_class(var0, new rrhx_3());
      id_class(var0, new rrhd_3());
      id_class(var0, new rrhk_3());
      id_class(var0, new rrhz_3());
      id_class(var0, new rrhW_2());
      id_class(var0, new rrhQ_2());
      id_class(var0, new rrhN_2());
      id_class(var0, new rrhc_3());
      id_class(var0, new rrhm_3());
      id_class(var0, new rrhZ_2());
      id_class(var0, new rrhv_3());
      id_class(var0, new rrhF_2());
      id_class(var0, new rrhA_2());
      id_class(var0, new rrhC_2());
      id_class(var0, new rrhH_2());
      id_class(var0, new rrhy_3());
      id_class(var0, new rrhp_3());
      id_class(var0, new rrhq_3());
      id_class(var0, new rrhT_2());
      id_class(var0, new rrht_3());
      id_class(var0, new rrhw_3());
      id_class(var0, new rrhI_2());
      id_class(var0, new rrhf_3());
      id_class(var0, new rrhj_3());
      id_class(var0, new rrhR_2());
      id_class(var0, new rrhY_2());
      id_class(var0, new rrho_3());
      id_class(var0, new rrhK_2());
      id_class(var0, new rrhD_2());
      id_class(var0, new rrhU_2());
      id_class(var0, new rrhe_3());
      id_class(var0, new rrha_3());
      id_class(var0, new rrhi_3());
      id_class(var0, new rrXr_1());
      id_class(var0, new rrXP());
      id_class(var0, new rrXB());
      id_class(var0, new rrXS());
      id_class(var0, new rrXs_1());
      id_class(var0, new rrXE());
      id_class(var0, new rrXG());
      id_class(var0, new rrXb_1());
      id_class(var0, new rrXM());
      id_class(var0, new rrhL_2());
      id_class(var0, new rrOe_1());
      id_class(var0, new rrOP());
      id_class(var0, new rrOS());
      id_class(var0, new rrOE());
      id_class(var0, new rrOO());
      id_class(var0, new rrOh_1());
      id_class(var0, new rrOx_1());
      id_class(var0, new rrOd_1());
      id_class(var0, new rrOz_1());
      id_class(var0, new rrOF());
      id_class(var0, new rrOT());
      id_class(var0, new rrOt_1());
      id_class(var0, new rrOw_1());
      id_class(var0, new rrOI());
      id_class(var0, new rrOf_1());
      id_class(var0, new rrOj_1());
      id_class(var0, new rrhn_3());
      id_class(var0, new rrhl_3());
      id_class(var0, new rrhV_2());
      id_class(var0, new rrhg_3());
      return var0;
   }
}
