package celestial;

import com.google.gson.JsonObject;

public class Jk_1 extends hZ_2 {
   private final Xh_1 class_;
   private final ho_3 break_;

   public Jk_1(ho_3 var1, Xh_1 var2, ho_3 var3) {
      super(Jd_1.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.class_.class_());
      var2.add("entity", this.break_.class_(var1));
      return var2;
   }

   public boolean class_(rhN_2 var1, rdn_3 var2, rzr_3 var3) {
      return !this.class_.class_(var2) ? false : this.break_.class_(var3);
   }

   public static Jk_1 class_(ho_3 var0, XX var1, ho_3 var2) {
      return new Jk_1(var0, var1.break_(), var2);
   }
}
