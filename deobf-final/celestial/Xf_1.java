package celestial;

import com.google.gson.JsonObject;

public class Xf_1 extends hZ_2 {
   private final hL_2 class_;
   private final ho_3 break_;

   public Xf_1(ho_3 var1, hL_2 var2, ho_3 var3) {
      super(XI.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("damage", this.class_.class_());
      var2.add("entity", this.break_.class_(var1));
      return var2;
   }

   public boolean class_(rhN_2 var1, rzr_3 var2, rye_3 var3, float var4, float var5, boolean var6) {
      return !this.class_.class_(var1, var3, var4, var5, var6) ? false : this.break_.class_(var2);
   }

   public static Xf_1 class_(hA_2 var0) {
      return new Xf_1(ho_3.class_, var0.break_(), ho_3.class_);
   }
}
