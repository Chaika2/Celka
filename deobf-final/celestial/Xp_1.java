package celestial;

import com.google.gson.JsonObject;

public class Xp_1 extends hZ_2 {
   private final xd_3 class_;
   private final JS break_;
   private final XN byte_;
   private final Xh_1 protected_;

   public Xp_1(ho_3 var1, xd_3 var2, JS var3, XN var4, Xh_1 var5) {
      super(Xy_1.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      if (this.class_ != null) {
         var2.addProperty("block", rVL.strictfp_.break_(this.class_).toString());
      }

      var2.add("state", this.break_.class_());
      var2.add("location", this.byte_.class_());
      var2.add("item", this.protected_.class_());
      return var2;
   }

   public boolean class_(xc_3 var1, rfH_2 var2, rrEm_1 var3, rdn_3 var4) {
      if (this.class_ != null && !var1.class_(this.class_)) {
         return false;
      } else if (!this.break_.class_(var1)) {
         return false;
      } else {
         return !this.byte_.class_(var3, (float)var2.b_(), (float)var2.c_(), (float)var2.d_()) ? false : this.protected_.class_(var4);
      }
   }

   public static Xp_1 class_(xd_3 var0) {
      return new Xp_1(ho_3.class_, var0, JS.class_, XN.class_, Xh_1.class_);
   }
}
