package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;

class Jb_1 extends JG {
   private final String id_class;
   private final String id_break;

   public Jb_1(String var1, String var2, String var3) {
      super(var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   protected <T extends Comparable<T>> boolean id_class(rCn_1<?, ?> var1, rCZ<T> var2) {
      Comparable var3 = var1.id_byte(var2);
      if (this.id_class != null) {
         Optional var4 = var2.id_break(this.id_class);
         if (!var4.isPresent() || var3.compareTo((Comparable)var4.get()) < 0) {
            return false;
         }
      }

      if (this.id_break != null) {
         Optional var5 = var2.id_break(this.id_break);
         if (!var5.isPresent() || var3.compareTo((Comparable)var5.get()) > 0) {
            return false;
         }
      }

      return true;
   }

   @Override
   public JsonElement id_class() {
      JsonObject var1 = new JsonObject();
      if (this.id_class != null) {
         var1.addProperty("min", this.id_class);
      }

      if (this.id_break != null) {
         var1.addProperty("max", this.id_break);
      }

      return var1;
   }
}
