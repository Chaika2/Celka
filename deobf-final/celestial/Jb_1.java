package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Optional;

class Jb_1 extends JG {
   private final String class_;
   private final String break_;

   public Jb_1(String var1, String var2, String var3) {
      super(var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   protected <T extends Comparable<T>> boolean class_(rCn_1<?, ?> var1, rCZ<T> var2) {
      Comparable var3 = var1.byte_(var2);
      if (this.class_ != null) {
         Optional var4 = var2.break_(this.class_);
         if (!var4.isPresent() || var3.compareTo((Comparable)var4.get()) < 0) {
            return false;
         }
      }

      if (this.break_ != null) {
         Optional var5 = var2.break_(this.break_);
         if (!var5.isPresent() || var3.compareTo((Comparable)var5.get()) > 0) {
            return false;
         }
      }

      return true;
   }

   @Override
   public JsonElement class_() {
      JsonObject var1 = new JsonObject();
      if (this.class_ != null) {
         var1.addProperty("min", this.class_);
      }

      if (this.break_ != null) {
         var1.addProperty("max", this.break_);
      }

      return var1;
   }
}
