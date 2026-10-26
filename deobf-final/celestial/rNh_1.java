package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.function.Supplier;

class rNh_1 {
   private final String class_;
   private final YJ break_;
   private final String byte_;
   private final YJ protected_;
   private final rNE throws_;

   rNh_1(String var1, String var2, rNE var3) {
      this.class_ = var1;
      this.break_ = rNs_1.class_(var1);
      this.byte_ = var2;
      this.protected_ = rNs_1.class_(var2);
      this.throws_ = var3;
   }

   public static rNh_1 class_(JsonObject var0) {
      String var1 = rpY_2.case_(var0, "source");
      String var2 = rpY_2.case_(var0, "target");
      rNE var3 = rNE.class_(rpY_2.case_(var0, "op"));
      return new rNh_1(var1, var2, var3);
   }

   public JsonObject class_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("source", this.class_);
      var1.addProperty("target", this.byte_);
      var1.addProperty("op", this.throws_.op);
      return var1;
   }

   public void class_(Supplier<rcZ_2> var1, rcZ_2 var2) {
      try {
         List var3 = this.break_.class_(var2);
         if (!var3.isEmpty()) {
            this.throws_.class_((rcZ_2)var1.get(), this.protected_, var3);
         }
      } catch (CommandSyntaxException var4) {
      }
   }
}
