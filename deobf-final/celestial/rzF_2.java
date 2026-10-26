package celestial;

import com.google.gson.GsonBuilder;

public class rzF_2 {
   public static GsonBuilder byte_() {
      return break_().registerTypeAdapter(rzN_2.class, new rzu_3()).registerTypeAdapter(rzL_2.class, new rzn_3());
   }

   public static GsonBuilder class_() {
      return new GsonBuilder()
         .registerTypeAdapter(rzV_2.class, new rzg_3())
         .registerTypeAdapter(rWn_1.class, new rWC())
         .registerTypeAdapter(rWy_1.class, new rWp_1())
         .registerTypeHierarchyAdapter(rQz_1.class, rQF.class_())
         .registerTypeHierarchyAdapter(rzB_2.class, new rzS_2());
   }

   public static GsonBuilder break_() {
      return class_()
         .registerTypeAdapter(rWD.class, new rWU())
         .registerTypeHierarchyAdapter(rzE_2.class, rzM_2.class_())
         .registerTypeHierarchyAdapter(rNL.class, rNl_1.class_());
   }
}
