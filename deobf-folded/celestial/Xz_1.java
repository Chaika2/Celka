package celestial;

import com.google.gson.JsonObject;

public class Xz_1 extends hZ_2 {
   private final hl_3 id_class;
   private final XF id_break;

   public Xz_1(ho_3 var1, hl_3 var2, XF var3) {
      super(XW.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("distance", this.id_class.id_class());
      var2.add("duration", this.id_break.id_protected());
      return var2;
   }

   public boolean id_class(rhN_2 var1, rjU_2 var2, int var3) {
      return !this.id_class.id_class(var2.id_break, var2.id_byte, var2.id_protected, var1.rx(), var1.re(), var1.BO()) ? false : this.id_break.id_byte(var3);
   }

   public static Xz_1 id_class(hl_3 var0) {
      return new Xz_1(ho_3.id_class, var0, XF.id_throws);
   }
}
