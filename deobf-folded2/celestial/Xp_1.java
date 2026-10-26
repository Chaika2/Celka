package celestial;

import com.google.gson.JsonObject;

public class Xp_1 extends hZ_2 {
   private final xd_3 id_class;
   private final JS id_break;
   private final XN id_byte;
   private final Xh_1 id_protected;

   public Xp_1(ho_3 var1, xd_3 var2, JS var3, XN var4, Xh_1 var5) {
      super(Xy_1.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      if (this.id_class != null) {
         var2.addProperty("block", rVL.id_strictfp.id_break(this.id_class).toString());
      }

      var2.add("state", this.id_break.id_class());
      var2.add("location", this.id_byte.id_class());
      var2.add("item", this.id_protected.id_class());
      return var2;
   }

   public boolean id_class(xc_3 var1, rfH_2 var2, rrEm_1 var3, rdn_3 var4) {
      if (this.id_class != null && !var1.id_class(this.id_class)) {
         return false;
      } else if (!this.id_break.id_class(var1)) {
         return false;
      } else {
         return !this.id_byte.id_class(var3, (float)var2.b_(), (float)var2.c_(), (float)var2.d_()) ? false : this.id_protected.id_class(var4);
      }
   }

   public static Xp_1 id_class(xd_3 var0) {
      return new Xp_1(ho_3.id_class, var0, JS.id_class, XN.id_class, Xh_1.id_class);
   }
}
