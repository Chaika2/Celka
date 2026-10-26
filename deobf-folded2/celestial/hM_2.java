package celestial;

import com.google.gson.JsonObject;

public class hM_2 extends hZ_2 {
   private final xd_3 id_class;
   private final Xh_1 id_break;
   private final XF id_byte;

   public hM_2(ho_3 var1, xd_3 var2, Xh_1 var3, XF var4) {
      super(hb_3.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      if (this.id_class != null) {
         var2.addProperty("block", rVL.id_strictfp.id_break(this.id_class).toString());
      }

      var2.add("item", this.id_break.id_class());
      var2.add("num_bees_inside", this.id_byte.id_protected());
      return var2;
   }

   public boolean id_class(xd_3 var1, rdn_3 var2, int var3) {
      if (this.id_class != null && var1 != this.id_class) {
         return false;
      } else {
         return !this.id_break.id_class(var2) ? false : this.id_byte.id_byte(var3);
      }
   }

   public static hM_2 id_class(xd_3 var0, XX var1, XF var2) {
      return new hM_2(ho_3.id_class, var0, var1.id_break(), var2);
   }
}
