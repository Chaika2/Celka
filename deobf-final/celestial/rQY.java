package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

final class rQY implements rQo_1 {
   public static final rqO_2 class_ = new rqO_2("binomial_with_bonus_count");
   private final int break_;
   private final float byte_;

   public rQY(int var1, float var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public static rQo_1 class_(JsonObject var0, JsonDeserializationContext var1) {
      int var2 = rpY_2.extends_(var0, "extra");
      float var3 = rpY_2.implements_(var0, "probability");
      return new rQY(var2, var3);
   }

   @Override
   public rqO_2 class_() {
      return class_;
   }

   @Override
   public int class_(Random var1, int var2, int var3) {
      for (int var4 = 0; var4 < var3 + this.break_; var4++) {
         if (var1.nextFloat() < this.byte_) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public void class_(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("extra", this.break_);
      var1.addProperty("probability", this.byte_);
   }
}
