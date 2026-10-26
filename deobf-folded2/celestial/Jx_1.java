package celestial;

import com.google.gson.JsonObject;

public class Jx_1 extends hZ_2 {
   private final XF id_class;
   private final ho_3 id_break;

   public Jx_1(ho_3 var1, XF var2, ho_3 var3) {
      super(JJ.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   public boolean id_class(rzr_3 var1, rjU_2 var2, int var3) {
      return !this.id_class.id_byte(var3) ? false : this.id_break.id_class(var1);
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("signal_strength", this.id_class.id_protected());
      var2.add("projectile", this.id_break.id_class(var1));
      return var2;
   }

   public static Jx_1 id_class(XF var0, ho_3 var1) {
      return new Jx_1(ho_3.id_class, var0, var1);
   }
}
