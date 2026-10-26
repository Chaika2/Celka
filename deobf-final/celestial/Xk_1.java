package celestial;

import com.google.gson.JsonObject;

public class Xk_1 extends hZ_2 {
   private final ho_3 class_;
   private final hn_3 break_;

   public Xk_1(rqO_2 var1, ho_3 var2, ho_3 var3, hn_3 var4) {
      super(var1, var2);
      this.class_ = var3;
      this.break_ = var4;
   }

   public static Xk_1 class_(hK_2 var0, hC_2 var1) {
      return new Xk_1(Oo_1.break_.class_, ho_3.class_, ho_3.class_(var0.break_()), var1.break_());
   }

   public boolean class_(rhN_2 var1, rzr_3 var2, rye_3 var3) {
      return !this.break_.class_(var1, var3) ? false : this.class_.class_(var2);
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("entity", this.class_.class_(var1));
      var2.add("killing_blow", this.break_.class_());
      return var2;
   }

   public static Xk_1 class_(hK_2 var0) {
      return new Xk_1(Oo_1.break_.class_, ho_3.class_, ho_3.class_(var0.break_()), hn_3.class_);
   }

   public static Xk_1 break_() {
      return new Xk_1(Oo_1.break_.class_, ho_3.class_, ho_3.class_, hn_3.class_);
   }

   public static Xk_1 protected_() {
      return new Xk_1(Oo_1.byte_.class_, ho_3.class_, ho_3.class_, hn_3.class_);
   }
}
