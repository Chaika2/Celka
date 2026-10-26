package celestial;

import com.google.gson.JsonObject;

public class hw_3 extends hZ_2 {
   private final xd_3 id_class;
   private final JS id_break;

   public hw_3(ho_3 var1, xd_3 var2, JS var3) {
      super(ht_3.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   public boolean id_class(xc_3 var1) {
      return this.id_class != null && !var1.id_class(this.id_class) ? false : this.id_break.id_class(var1);
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      if (this.id_class != null) {
         var2.addProperty("block", rVL.id_strictfp.id_break(this.id_class).toString());
      }

      var2.add("state", this.id_break.id_class());
      return var2;
   }

   public static hw_3 id_class(xd_3 var0) {
      return new hw_3(ho_3.id_class, var0, JS.id_class);
   }
}
