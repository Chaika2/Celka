package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class rnU_2 extends rCx_1<String, rnD_2> {
   private String byte_(SocketAddress var1) {
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

   public boolean class_(String var1) {
      return this.protected_(var1);
   }

   @Override
   protected rCd_1<String> class_(JsonObject var1) {
      return new rnD_2(var1);
   }

   public boolean class_(SocketAddress var1) {
      String var2 = this.byte_(var1);
      return this.protected_(var2);
   }

   public rnD_2 break_(SocketAddress var1) {
      String var2 = this.byte_(var1);
      return this.break_(var2);
   }
}
