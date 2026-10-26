package celestial;

import com.google.gson.JsonObject;

public class XU extends hZ_2 {
   private final rqO_2 id_class;

   public XU(ho_3 var1, rqO_2 var2) {
      super(XD.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.addProperty("recipe", this.id_class.toString());
      return var2;
   }

   public boolean id_class(rkw_3<?> var1) {
      return this.id_class.equals(var1.id_case());
   }
}
