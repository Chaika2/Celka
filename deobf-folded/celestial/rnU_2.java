package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class rnU_2 extends rCx_1<String, rnD_2> {
   private String id_byte(SocketAddress var1) {
      String var2 = var1.toString();
      if (var2.contains("/")) {
         var2 = var2.substring(var2.indexOf(47) + 1);
      }

      if (var2.contains(":")) {
         var2 = var2.substring(0, var2.indexOf(58));
      }

      return var2;
   }

   public rnU_2(File var1) {
      super(var1);
   }

   public boolean id_class(String var1) {
      return this.id_protected(var1);
   }

   @Override
   protected rCd_1<String> id_class(JsonObject var1) {
      return new rnD_2(var1);
   }

   public boolean id_class(SocketAddress var1) {
      String var2 = this.id_byte(var1);
      return this.id_protected(var2);
   }

   public rnD_2 id_break(SocketAddress var1) {
      String var2 = this.id_byte(var1);
      return this.id_break(var2);
   }
}
