package celestial;

import com.google.gson.JsonObject;

public class hq_3 extends hZ_2 {
   private final Xh_1 id_class;
   private final XF id_break;

   public hq_3(ho_3 var1, Xh_1 var2, XF var3) {
      super(hp_3.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("item", this.id_class.id_class());
      var2.add("levels", this.id_break.id_protected());
      return var2;
   }

   public boolean id_class(rdn_3 var1, int var2) {
      return !this.id_class.id_class(var1) ? false : this.id_break.id_byte(var2);
   }

   public static hq_3 id_break() {
      return new hq_3(ho_3.id_class, Xh_1.id_class, XF.id_throws);
   }
}
