package celestial;

import com.google.gson.JsonObject;
import java.util.Date;

public class rnD_2 extends rnY_2<String> {
   public rnD_2(JsonObject var1) {
      super(break_(var1), var1);
   }

   public rnD_2(String var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public rnD_2(String var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   @Override
   protected void class_(JsonObject var1) {
      if (this.case_() != null) {
         var1.addProperty("ip", this.case_());
         super.class_(var1);
      }
   }

   private static String break_(JsonObject var0) {
      return var0.has("ip") ? var0.get("ip").getAsString() : null;
   }

   @Override
   public rgP_2 protected_() {
      return new rgN_2(this.case_());
   }
}
