package celestial;

import com.google.gson.JsonObject;

public class hy_3 extends hZ_2 {
   private final XA class_;

   public hy_3(ho_3 var1, XA var2) {
      super(hH_2.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("effects", this.class_.break_());
      return var2;
   }

   public boolean class_(rhN_2 var1) {
      return this.class_.class_((iB_2)var1);
   }

   public static hy_3 class_(XA var0) {
      return new hy_3(ho_3.class_, var0);
   }
}
