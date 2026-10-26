package celestial;

import com.google.gson.JsonObject;

public class JO extends hZ_2 {
   private final ho_3 id_class;

   public JO(ho_3 var1, ho_3 var2) {
      super(JM.id_class, var1);
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

   public static JO id_class(hK_2 var0) {
      return new JO(ho_3.id_class, ho_3.id_class(var0.id_break()));
   }
}
