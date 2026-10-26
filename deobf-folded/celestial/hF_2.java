package celestial;

import com.google.gson.JsonObject;

public class hF_2 extends hZ_2 {
   private final ho_3 id_class;
   private final ho_3 id_break;

   public hF_2(ho_3 var1, ho_3 var2, ho_3 var3) {
      super(hv_3.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("zombie", this.id_class.id_class(var1));
      var2.add("villager", this.id_break.id_class(var1));
      return var2;
   }

   public boolean id_class(rzr_3 var1, rzr_3 var2) {
      return !this.id_class.id_class(var1) ? false : this.id_break.id_class(var2);
   }

   public static hF_2 id_break() {
      return new hF_2(ho_3.id_class, ho_3.id_class, ho_3.id_class);
   }
}
