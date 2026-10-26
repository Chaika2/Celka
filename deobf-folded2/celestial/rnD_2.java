package celestial;

import com.google.gson.JsonObject;
import java.util.Date;

public class rnD_2 extends rnY_2<String> {
   public rnD_2(JsonObject var1) {
      super(id_break(var1), var1);
   }

   public rnD_2(String var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public rnD_2(String var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   @Override
   protected void id_class(JsonObject var1) {
      if (this.id_case() != null) {
         var1.addProperty("ip", this.id_case());
         super.id_class(var1);
      }
   }

   private static String id_break(JsonObject var0) {
      return var0.has("ip") ? var0.get("ip").getAsString() : null;
   }

   @Override
   public rgP_2 id_protected() {
      return new rgN_2(this.id_case());
   }
}
