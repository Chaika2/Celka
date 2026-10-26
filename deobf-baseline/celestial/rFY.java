package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rFY extends rFe_1 {
   private static final Logger id_protected = LogManager.getLogger();
   private final ServerSocket id_throws;
   private final String id_case;
   private final List<rFg_1> id_catch = Lists.newArrayList();
   private final rFR id_private;

   private rFY(rFR var1, ServerSocket var2, String var3) {
      super("RCON Listener");
      this.id_private = var1;
      this.id_throws = var2;
      this.id_case = var3;
   }

   @Override
   public void run() {
      try {
         while (this.id_class) {
            try {
               Socket var1 = this.id_throws.accept();
               rFg_1 var2 = new rFg_1(this.id_private, this.id_case, var1);
               var2.id_break();
               this.id_catch.add(var2);
               this.id_protected();
            } catch (SocketTimeoutException var7) {
               this.id_protected();
            } catch (IOException var8) {
               if (this.id_class) {
                  id_protected.info("IO exception: ", var8);
               }
            }
         }
      } finally {
         this.id_class(this.id_throws);
      }
   }

   private void id_class(ServerSocket var1) {
      id_protected.debug("closeSocket: {}", var1);

      try {
         var1.close();
      } catch (IOException var3) {
         id_protected.warn("Failed to close socket", var3);
      }
   }

   @Override
   public void id_class() {
      this.id_class = false;
      this.id_class(this.id_throws);
      super.id_class();

      for (rFg_1 var2 : this.id_catch) {
         if (var2.id_byte()) {
            var2.id_class();
         }
      }

      this.id_catch.clear();
   }

   public static rFY id_class(rFR var0) {
      rnp_3 var1 = var0.id_class();
      String var2 = var0.id_break();
      if (var2.isEmpty()) {
         var2 = "0.0.0.0";
      }

      int var3 = var1.id_else;
      if (0 < var3 && 65535 >= var3) {
         String var4 = var1.id_synchronized;
         if (var4.isEmpty()) {
            id_protected.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
         } else {
            try {
               ServerSocket var5 = new ServerSocket(var3, 0, InetAddress.getByName(var2));
               var5.setSoTimeout(500);
               rFY var6 = new rFY(var0, var5, var4);
               if (!var6.id_break()) {
                  return null;
               } else {
                  id_protected.info("RCON running on {}:{}", var2, var3);
                  return var6;
               }
            } catch (IOException var7) {
               id_protected.warn("Unable to initialise RCON on {}:{}", var2, var3, var7);
               return null;
            }
         }
      } else {
         id_protected.warn("Invalid rcon port {} found in server.properties, rcon disabled!", var3);
         return null;
      }
   }

   private void id_protected() {
      this.id_catch.removeIf(var0 -> !var0.id_byte());
   }
}
