package celestial;

import com.google.gson.JsonObject;

public class DB {
   private final T id_break;

   public DB(T var1, Object var2) {
      this.id_class = var1;
      this.id_break = (T)var2;
   }

   @Override
   public String toString() {
      return this.id_class.id_class + "=" + this.id_break;
   }

   public void id_class(JsonObject var1) {
      var1.add(this.id_class.id_class, this.id_class.id_break.apply(this.id_break));
   }
}
