package celestial;

import com.google.gson.JsonObject;

public class XU extends hZ_2 {
   private final rqO_2 class_;

   public XU(ho_3 var1, rqO_2 var2) {
      super(XD.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.addProperty("recipe", this.class_.toString());
      return var2;
   }

   public boolean class_(rkw_3<?> var1) {
      return this.class_.equals(var1.case_());
   }
}
