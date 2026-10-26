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
   private static final AtomicInteger id_class = new AtomicInteger(0);
   private static final Logger id_break = LogManager.getLogger();
   private final String id_byte;
   private final DatagramSocket id_protected;
   private boolean id_throws = true;
   private final String id_case;

   public AJ(String var1, String var2) throws IOException {
      super("LanServerPinger #" + id_class.incrementAndGet());
      this.id_byte = var1;
      this.id_case = var2;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new rya_3(id_break));
      this.id_protected = new DatagramSocket();
   }

   @Override
   public void run() {
      String var1 = id_class(this.id_byte, this.id_case);
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);

      while (!this.isInterrupted() && this.id_throws) {
         try {
            InetAddress var3 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var4 = new DatagramPacket(var2, var2.length, var3, 4445);
            this.id_protected.send(var4);
         } catch (IOException var6) {
            id_break.warn("LanServerPinger: {}", var6.getMessage());
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
      this.id_throws = false;
   }

   public static String id_class(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String id_class(String var0) {
      int var1 = var0.indexOf("[MOTD]");
      if (var1 < 0) {
         return "missing no";
      } else {
         int var2 = var0.indexOf("[/MOTD]", var1 + "[MOTD]".length());
         return var2 < var1 ? "missing no" : var0.substring(var1 + "[MOTD]".length(), var2);
      }
   }

   public static String id_break(String var0) {
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
