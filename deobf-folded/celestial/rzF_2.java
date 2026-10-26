package celestial;

import com.google.gson.GsonBuilder;

public class rzF_2 {
   public static GsonBuilder id_byte() {
      return id_break().registerTypeAdapter(rzN_2.class, new rzu_3()).registerTypeAdapter(rzL_2.class, new rzn_3());
   }

   public static GsonBuilder id_class() {
      return new GsonBuilder()
         .registerTypeAdapter(rzV_2.class, new rzg_3())
         .registerTypeAdapter(rWn_1.class, new rWC())
         .registerTypeAdapter(rWy_1.class, new rWp_1())
         .registerTypeHierarchyAdapter(rQz_1.class, rQF.id_class())
         .registerTypeHierarchyAdapter(rzB_2.class, new rzS_2());
   }

   public static GsonBuilder id_break() {
      return id_class()
         .registerTypeAdapter(rWD.class, new rWU())
         .registerTypeHierarchyAdapter(rzE_2.class, rzM_2.id_class())
         .registerTypeHierarchyAdapter(rNL.class, rNl_1.id_class());
   }
}
