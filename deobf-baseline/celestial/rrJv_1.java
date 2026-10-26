package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;

public class rrJv_1 extends Thread {
   private rrJu_1 id_class = null;
   private static final String id_break = "\r\n";
   private static Charset id_byte = Charset.forName("ASCII");

   public rrJv_1(rrJu_1 var1) {
      super("HttpPipelineSender");
      this.id_class = var1;
   }

   @Override
   public void run() {
      rrJZ var1 = null;

      try {
         this.id_class();

         while (!Thread.interrupted()) {
            var1 = this.id_class.id_byte();
            rrJF var2 = var1.id_class();
            OutputStream var3 = this.id_class.id_class();
            this.id_class(var2, var3);
            this.id_class.id_break(var1);
         }
      } catch (InterruptedException var4) {
         return;
      } catch (Exception var5) {
         this.id_class.id_class(var1, var5);
      }
   }

   private void id_class(rrJF var1, OutputStream var2) throws IOException {
      this.id_class(var2, var1.id_byte() + " " + var1.id_protected() + " " + var1.id_throws() + "\r\n");
      Map var3 = var1.id_case();

      for (String var5 : var3.keySet()) {
         String var6 = var1.id_case().get(var5);
         this.id_class(var2, var5 + ": " + var6 + "\r\n");
      }

      this.id_class(var2, "\r\n");
   }

   private void id_class(OutputStream var1, String var2) throws IOException {
      byte[] var3 = var2.getBytes(id_byte);
      var1.write(var3);
   }

   private void id_class() throws IOException {
      String var1 = this.id_class.id_private();
      int var2 = this.id_class.id_implements();
      Proxy var3 = this.id_class.id_finally();
      Socket var4 = new Socket(var3);
      var4.connect(new InetSocketAddress(var1, var2), 5000);
      this.id_class.id_class(var4);
   }
}
