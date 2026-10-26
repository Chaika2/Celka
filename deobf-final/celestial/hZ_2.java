package celestial;

import com.google.gson.JsonObject;

public abstract class hZ_2 implements hr_3 {
   private final rqO_2 class_;
   private final ho_3 break_;

   protected ho_3 byte_() {
      return this.break_;
   }

   public hZ_2(rqO_2 var1, ho_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.class_ + "}";
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = new JsonObject();
      var2.add("player", this.break_.class_(var1));
      return var2;
   }

   @Override
   public rqO_2 class_() {
      return this.class_;
   }
}
