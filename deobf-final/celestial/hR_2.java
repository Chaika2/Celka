package celestial;

import com.google.gson.JsonObject;

public class hR_2 extends hZ_2 {
   private final hL_2 class_;

   public hR_2(ho_3 var1, hL_2 var2) {
      super(hg_3.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("damage", this.class_.class_());
      return var2;
   }

   public boolean class_(rhN_2 var1, rye_3 var2, float var3, float var4, boolean var5) {
      return this.class_.class_(var1, var2, var3, var4, var5);
   }

   public static hR_2 class_(hA_2 var0) {
      return new hR_2(ho_3.class_, var0.break_());
   }
}
