package celestial;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Au_1 extends Thread {
   private final Am_1 id_class;
   private final InetAddress id_break;
   private final MulticastSocket id_byte;

   public Au_1(Am_1 var1) throws IOException {
      super("LanServerDetector #" + Ac_1.id_class.incrementAndGet());
      this.id_class = var1;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new rya_3(Ac_1.id_break));
      this.id_byte = new MulticastSocket(4445);
      this.id_break = InetAddress.getByName("224.0.2.60");
      this.id_byte.setSoTimeout(5000);
      this.id_byte.joinGroup(this.id_break);
   }

   @Override
   public void run() {
      byte[] var1 = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.id_byte.receive(var2);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            Ac_1.id_break.error("Couldn't ping server", var6);
            break;
         }

         String var3 = new String(var2.getData(), var2.getOffset(), var2.getLength(), StandardCharsets.UTF_8);
         Ac_1.id_break.debug("{}: {}", var2.getAddress(), var3);
         this.id_class.id_class(var3, var2.getAddress());
      }

      try {
         this.id_byte.leaveGroup(this.id_break);
      } catch (IOException var4) {
      }

      this.id_byte.close();
   }
}
