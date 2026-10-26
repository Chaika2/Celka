package celestial;

import com.google.gson.JsonObject;

public class JO extends hZ_2 {
   private final ho_3 class_;

   public JO(ho_3 var1, ho_3 var2) {
      super(JM.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("entity", this.class_.class_(var1));
      return var2;
   }

   public boolean class_(rzr_3 var1) {
      return this.class_.class_(var1);
   }

   public static JO class_(hK_2 var0) {
      return new JO(ho_3.class_, ho_3.class_(var0.break_()));
   }
}
