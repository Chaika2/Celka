package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.function.Supplier;

class rNh_1 {
   private final String id_class;
   private final YJ id_break;
   private final String id_byte;
   private final YJ id_protected;
   private final rNE id_throws;

   rNh_1(String var1, String var2, rNE var3) {
      this.id_class = var1;
      this.id_break = rNs_1.id_class(var1);
      this.id_byte = var2;
      this.id_protected = rNs_1.id_class(var2);
      this.id_throws = var3;
   }

   public static rNh_1 id_class(JsonObject var0) {
      String var1 = rpY_2.id_case(var0, "source");
      String var2 = rpY_2.id_case(var0, "target");
      rNE var3 = rNE.id_class(rpY_2.id_case(var0, "op"));
      return new rNh_1(var1, var2, var3);
   }

   public JsonObject id_class() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("source", this.id_class);
      var1.addProperty("target", this.id_byte);
      var1.addProperty("op", this.id_throws.op);
      return var1;
   }

   public void id_class(Supplier<rcZ_2> var1, rcZ_2 var2) {
      try {
         List var3 = this.id_break.id_class(var2);
         if (!var3.isEmpty()) {
            this.id_throws.id_class((rcZ_2)var1.get(), this.id_protected, var3);
         }
      } catch (CommandSyntaxException var4) {
      }
   }
}
