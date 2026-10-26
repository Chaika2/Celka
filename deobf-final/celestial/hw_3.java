package celestial;

import com.google.gson.JsonObject;

public class hw_3 extends hZ_2 {
   private final xd_3 class_;
   private final JS break_;

   public hw_3(ho_3 var1, xd_3 var2, JS var3) {
      super(ht_3.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   public boolean class_(xc_3 var1) {
      return this.class_ != null && !var1.class_(this.class_) ? false : this.break_.class_(var1);
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      if (this.class_ != null) {
         var2.addProperty("block", rVL.strictfp_.break_(this.class_).toString());
      }

      var2.add("state", this.break_.class_());
      return var2;
   }

   public static hw_3 class_(xd_3 var0) {
      return new hw_3(ho_3.class_, var0, JS.class_);
   }
}
