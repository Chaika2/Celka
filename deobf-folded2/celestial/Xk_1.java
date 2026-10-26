package celestial;

import com.google.gson.JsonObject;

public class Xk_1 extends hZ_2 {
   private final ho_3 id_class;
   private final hn_3 id_break;

   public Xk_1(rqO_2 var1, ho_3 var2, ho_3 var3, hn_3 var4) {
      super(var1, var2);
      this.id_class = var3;
      this.id_break = var4;
   }

   public static Xk_1 id_class(hK_2 var0, hC_2 var1) {
      return new Xk_1(Oo_1.id_break.id_class, ho_3.id_class, ho_3.id_class(var0.id_break()), var1.id_break());
   }

   public boolean id_class(rhN_2 var1, rzr_3 var2, rye_3 var3) {
      return !this.id_break.id_class(var1, var3) ? false : this.id_class.id_class(var2);
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("entity", this.id_class.id_class(var1));
      var2.add("killing_blow", this.id_break.id_class());
      return var2;
   }

   public static Xk_1 id_class(hK_2 var0) {
      return new Xk_1(Oo_1.id_break.id_class, ho_3.id_class, ho_3.id_class(var0.id_break()), hn_3.id_class);
   }

   public static Xk_1 id_break() {
      return new Xk_1(Oo_1.id_break.id_class, ho_3.id_class, ho_3.id_class, hn_3.id_class);
   }

   public static Xk_1 id_protected() {
      return new Xk_1(Oo_1.id_byte.id_class, ho_3.id_class, ho_3.id_class, hn_3.id_class);
   }
}
