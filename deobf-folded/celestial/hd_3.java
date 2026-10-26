package celestial;

import com.google.gson.JsonObject;

public class hd_3 extends hZ_2 {
   private final rLi_1 id_class;

   public hd_3(ho_3 var1, rLi_1 var2) {
      super(hx_3.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      if (this.id_class != null) {
         var2.addProperty("potion", rVL.id_double.id_break(this.id_class).toString());
      }

      return var2;
   }

   public boolean id_class(rLi_1 var1) {
      return this.id_class == null || this.id_class == var1;
   }

   public static hd_3 id_break() {
      return new hd_3(ho_3.id_class, (rLi_1)null);
   }
}
