package celestial;

import com.google.gson.JsonObject;

public class JX extends hZ_2 {
   private final ho_3 id_class;

   public JX(ho_3 var1, ho_3 var2) {
      super(Jh_1.id_class, var1);
      this.id_class = var2;
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = super.id_class(var1);
      var2.add("entity", this.id_class.id_class(var1));
      return var2;
   }

   public boolean id_class(rzr_3 var1) {
      return this.id_class.id_class(var1);
   }

   public static JX id_class(hY_2 var0) {
      return new JX(ho_3.id_class, ho_3.id_class(var0));
   }

   public static JX id_break() {
      return new JX(ho_3.id_class, ho_3.id_class);
   }
}
