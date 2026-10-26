package celestial;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AJ extends Thread {
   private static final AtomicInteger class_ = new AtomicInteger(0);
   private static final Logger break_ = LogManager.getLogger();
   private final String byte_;
   private final DatagramSocket protected_;
   private boolean throws_ = true;
   private final String case_;

   public AJ(String var1, String var2) throws IOException {
      super("LanServerPinger #" + class_.incrementAndGet());
      this.byte_ = var1;
      this.case_ = var2;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new rya_3(break_));
      this.protected_ = new DatagramSocket();
   }

   @Override
   public void run() {
      String var1 = class_(this.byte_, this.case_);
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);

      while (!this.isInterrupted() && this.throws_) {
         try {
            InetAddress var3 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, 4445);
            this.protected_.send(var4);
         } catch (IOException var6) {
            break_.warn("LanServerPinger: {}", var6.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var5) {
         }
      }
   }

   @Override
   public void interrupt() {
      super.interrupt();
      this.throws_ = false;
   }

   public static String class_(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String class_(String var0) {
      int var1 = var0.indexOf("[MOTD]");
      if (var1 < 0) {
         return "missing no";
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[MOTD]".length());
         return var2 < var1 ? "missing no" : var0.substring(var1 + "[MOTD]".length(), var2);
      }
   }

   public static String break_(String var0) {
      int var1 = var0.indexOf("[/MOTD]");
      if (var1 < 0) {
         return null;
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[/MOTD]".length());
         if (var2 >= 0) {
            return null;
         } else {
            int var3 = var0.indexOf("[AD]", var1 + "[/MOTD]".length());
            if (var3 < 0) {
               return null;
            } else {
               int var4 = var0.indexOf("[/AD]", var3 + "[AD]".length());
               return var4 < var3 ? null : var0.substring(var3 + "[AD]".length(), var4);
            }
         }
      }
   }
}
