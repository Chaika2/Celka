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
   private static final Logger protected_ = LogManager.getLogger();
   private final ServerSocket throws_;
   private final String case_;
   private final List<rFg_1> catch_ = Lists.newArrayList();
   private final rFR private_;

   private rFY(rFR var1, ServerSocket var2, String var3) {
      super("RCON Listener");
      this.private_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
   }

   @Override
   public void run() {
      try {
         while (this.class_) {
            try {
               Socket var1 = this.throws_.accept();
               rFg_1 var2 = new rFg_1(this.private_, this.case_, var1);
               var2.break_();
               this.catch_.add(var2);
               this.protected_();
            } catch (SocketTimeoutException var7) {
               this.protected_();
            } catch (IOException var8) {
               if (this.class_) {
                  protected_.info("IO exception: ", var8);
               }
            }
         }
      } finally {
         this.class_(this.throws_);
      }
   }

   private void class_(ServerSocket var1) {
      protected_.debug("closeSocket: {}", var1);

      try {
         var1.close();
      } catch (IOException var3) {
         protected_.warn("Failed to close socket", var3);
      }
   }

   @Override
   public void class_() {
      this.class_ = false;
      this.class_(this.throws_);
      super.class_();

      for (rFg_1 var2 : this.catch_) {
         if (var2.byte_()) {
            var2.class_();
         }
      }

      this.catch_.clear();
   }

   public static rFY class_(rFR var0) {
      rnp_3 var1 = var0.class_();
      String var2 = var0.break_();
      if (var2.isEmpty()) {
         var2 = "0.0.0.0";
      }

      int var3 = var1.else_;
      if (0 < var3 && 65535 >= var3) {
         String var4 = var1.synchronized_;
         if (var4.isEmpty()) {
            protected_.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
         } else {
            try {
               ServerSocket var5 = new ServerSocket(var3, 0, InetAddress.getByName(var2));
               var5.setSoTimeout(500);
               rFY var6 = new rFY(var0, var5, var4);
               if (!var6.break_()) {
                  return null;
               } else {
                  protected_.info("RCON running on {}:{}", var2, var3);
                  return var6;
               }
            } catch (IOException var7) {
               protected_.warn("Unable to initialise RCON on {}:{}", var2, var3, var7);
               return null;
            }
         }
      } else {
         protected_.warn("Invalid rcon port {} found in server.properties, rcon disabled!", var3);
         return null;
      }
   }

   private void protected_() {
      this.catch_.removeIf(var0 -> !var0.byte_());
   }
}
