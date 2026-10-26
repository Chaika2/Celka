package celestial;

import com.google.gson.JsonObject;

public class Xz_1 extends hZ_2 {
   private final hl_3 class_;
   private final XF break_;

   public Xz_1(ho_3 var1, hl_3 var2, XF var3) {
      super(XW.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("distance", this.class_.class_());
      var2.add("duration", this.break_.protected_());
      return var2;
   }

   public boolean class_(rhN_2 var1, rjU_2 var2, int var3) {
      return !this.class_.class_(var2.break_, var2.byte_, var2.protected_, var1.rx(), var1.re(), var1.BO()) ? false : this.break_.byte_(var3);
   }

   public static Xz_1 class_(hl_3 var0) {
      return new Xz_1(ho_3.class_, var0, XF.throws_);
   }
}
