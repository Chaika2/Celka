package celestial;

import com.google.gson.JsonObject;

public class Xa_1 extends hZ_2 {
   private final XN class_;
   private final Xh_1 break_;

   public Xa_1(ho_3 var1, XN var2, Xh_1 var3) {
      super(Xe_1.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("location", this.class_.class_());
      var2.add("item", this.break_.class_());
      return var2;
   }

   public boolean class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      return !this.class_.class_(var2, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5) ? false : this.break_.class_(var4);
   }

   public static Xa_1 class_(Xc_1 var0, XX var1) {
      return new Xa_1(ho_3.class_, var0.break_(), var1.break_());
   }
}
