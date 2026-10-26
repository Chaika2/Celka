package celestial;

import com.google.gson.JsonObject;

public class Xa_1 extends hZ_2 {
   private final XN id_class;
   private final Xh_1 id_break;

   public Xa_1(ho_3 var1, XN var2, Xh_1 var3) {
      super(Xe_1.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("location", this.id_class.id_class());
      var2.add("item", this.id_break.id_class());
      return var2;
   }

   public boolean id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      return !this.id_class.id_class(var2, (double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5) ? false : this.id_break.id_class(var4);
   }

   public static Xa_1 id_class(Xc_1 var0, XX var1) {
      return new Xa_1(ho_3.id_class, var0.id_break(), var1.id_break());
   }
}
