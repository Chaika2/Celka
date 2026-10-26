package celestial;

import com.google.gson.JsonObject;

public class XT extends hZ_2 {
   private final Xh_1 id_class;
   private final ho_3 id_break;

   public XT(ho_3 var1, Xh_1 var2, ho_3 var3) {
      super(Xq_1.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("item", this.id_class.id_class());
      var2.add("entity", this.id_break.id_class(var1));
      return var2;
   }

   public boolean id_class(rdn_3 var1, rzr_3 var2) {
      return !this.id_class.id_class(var1) ? false : this.id_break.id_class(var2);
   }

   public static XT id_class(ho_3 var0, XX var1, ho_3 var2) {
      return new XT(var0, var1.id_break(), var2);
   }
}
