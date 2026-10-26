package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Map;

public class rrJv_1 extends Thread {
   private rrJu_1 class_ = null;
   private static final String break_ = "\r\n";
   private static Charset byte_ = Charset.forName("ASCII");

   public rrJv_1(rrJu_1 var1) {
      super("HttpPipelineSender");
      this.class_ = var1;
   }

   @Override
   public void run() {
      rrJZ var1 = null;

      try {
         this.class_();

         while (!Thread.interrupted()) {
            var1 = this.class_.byte_();
            rrJF var2 = var1.class_();
            OutputStream var3 = this.class_.class_();
            this.class_(var2, var3);
            this.class_.break_(var1);
         }
      } catch (InterruptedException var4) {
         return;
      } catch (Exception var5) {
         this.class_.class_(var1, var5);
      }
   }

   private void class_(rrJF var1, OutputStream var2) throws IOException {
      this.class_(var2, var1.byte_() + " " + var1.protected_() + " " + var1.throws_() + "\r\n");
      Map var3 = var1.case_();

      for (String var5 : var3.keySet()) {
         String var6 = var1.case_().get(var5);
         this.class_(var2, var5 + ": " + var6 + "\r\n");
      }

      this.class_(var2, "\r\n");
   }

   private void class_(OutputStream var1, String var2) throws IOException {
      byte[] var3 = var2.getBytes(byte_);
      var1.write(var3);
   }

   private void class_() throws IOException {
      String var1 = this.class_.private_();
      int var2 = this.class_.implements_();
      Proxy var3 = this.class_.finally_();
      Socket var4 = new Socket(var3);
      var4.connect(new InetSocketAddress(var1, var2), 5000);
      this.class_.class_(var4);
   }
}
