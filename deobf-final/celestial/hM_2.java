package celestial;

import com.google.gson.JsonObject;

public class hM_2 extends hZ_2 {
   private final xd_3 class_;
   private final Xh_1 break_;
   private final XF byte_;

   public hM_2(ho_3 var1, xd_3 var2, Xh_1 var3, XF var4) {
      super(hb_3.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      if (this.class_ != null) {
         var2.addProperty("block", rVL.strictfp_.break_(this.class_).toString());
      }

      var2.add("item", this.break_.class_());
      var2.add("num_bees_inside", this.byte_.protected_());
      return var2;
   }

   public boolean class_(xd_3 var1, rdn_3 var2, int var3) {
      if (this.class_ != null && var1 != this.class_) {
         return false;
      } else {
         return !this.break_.class_(var2) ? false : this.byte_.byte_(var3);
      }
   }

   public static hM_2 class_(xd_3 var0, XX var1, XF var2) {
      return new hM_2(ho_3.class_, var0, var1.break_(), var2);
   }
}
