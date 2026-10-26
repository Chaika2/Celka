package celestial;

import com.google.gson.JsonObject;

public class hR_2 extends hZ_2 {
   private final hL_2 id_class;

   public hR_2(ho_3 var1, hL_2 var2) {
      super(hg_3.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("damage", this.id_class.id_class());
      return var2;
   }

   public boolean id_class(rhN_2 var1, rye_3 var2, float var3, float var4, boolean var5) {
      return this.id_class.id_class(var1, var2, var3, var4, var5);
   }

   public static hR_2 id_class(hA_2 var0) {
      return new hR_2(ho_3.id_class, var0.id_break());
   }
}
