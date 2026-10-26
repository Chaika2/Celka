package celestial;

import com.google.gson.JsonObject;

public class JZ extends hZ_2 {
   private final ho_3 id_class;
   private final Xh_1 id_break;

   public JZ(ho_3 var1, ho_3 var2, Xh_1 var3) {
      super(Jm_1.id_class, var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("item", this.id_break.id_class());
      var2.add("villager", this.id_class.id_class(var1));
      return var2;
   }

   public boolean id_class(rzr_3 var1, rdn_3 var2) {
      return !this.id_class.id_class(var1) ? false : this.id_break.id_class(var2);
   }

   public static JZ id_break() {
      return new JZ(ho_3.id_class, ho_3.id_class, Xh_1.id_class);
   }
}
