package celestial;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Au_1 extends Thread {
   private final Am_1 class_;
   private final InetAddress break_;
   private final MulticastSocket byte_;

   public Au_1(Am_1 var1) throws IOException {
      super("LanServerDetector #" + Ac_1.class_.incrementAndGet());
      this.class_ = var1;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new rya_3(Ac_1.break_));
      this.byte_ = new MulticastSocket(4445);
      this.break_ = InetAddress.getByName("224.0.2.60");
      this.byte_.setSoTimeout(5000);
      this.byte_.joinGroup(this.break_);
   }

   @Override
   public void run() {
      byte[] var1 = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);

         try {
            this.byte_.receive(var2);
         } catch (SocketTimeoutException var5) {
            continue;
         } catch (IOException var6) {
            Ac_1.break_.error("Couldn't ping server", var6);
            break;
         }

         String var3 = new String(var2.getData(), var2.getOffset(), var2.getLength(), StandardCharsets.UTF_8);
         Ac_1.break_.debug("{}: {}", var2.getAddress(), var3);
         this.class_.class_(var3, var2.getAddress());
      }

      try {
         this.byte_.leaveGroup(this.break_);
      } catch (IOException var4) {
      }

      this.byte_.close();
   }
}
