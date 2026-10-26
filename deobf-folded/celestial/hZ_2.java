package celestial;

import com.google.gson.JsonObject;

public abstract class hZ_2 implements hr_3 {
   private final rqO_2 id_class;
   private final ho_3 id_break;

   protected ho_3 id_byte() {
      return this.id_break;
   }

   public hZ_2(rqO_2 var1, ho_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.id_class + "}";
   }

   @Override
   public JsonObject id_class(rWH var1) {
      JsonObject var2 = new JsonObject();
      var2.add("player", this.id_break.id_class(var1));
      return var2;
   }

   @Override
   public rqO_2 id_class() {
      return this.id_class;
   }
}
