package celestial;

import com.google.gson.JsonObject;

public class Ju_1 extends hZ_2 {
   private final Xh_1 class_;

   public Ju_1(ho_3 var1, Xh_1 var2) {
      super(Jc_1.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.class_.class_());
      return var2;
   }

   public boolean class_(rdn_3 var1) {
      return this.class_.class_(var1);
   }

   public static Ju_1 class_(rpL_2 var0) {
      return new Ju_1(ho_3.class_, XX.class_().class_(var0).break_());
   }
}
