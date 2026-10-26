package celestial;

import com.google.gson.JsonObject;

public class Jx_1 extends hZ_2 {
   private final XF class_;
   private final ho_3 break_;

   public Jx_1(ho_3 var1, XF var2, ho_3 var3) {
      super(JJ.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   public boolean class_(rzr_3 var1, rjU_2 var2, int var3) {
      return !this.class_.byte_(var3) ? false : this.break_.class_(var1);
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("signal_strength", this.class_.protected_());
      var2.add("projectile", this.break_.class_(var1));
      return var2;
   }

   public static Jx_1 class_(XF var0, ho_3 var1) {
      return new Jx_1(ho_3.class_, var0, var1);
   }
}
