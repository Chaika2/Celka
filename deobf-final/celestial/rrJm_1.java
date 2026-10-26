package celestial;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;

public class rrJm_1 extends Thread {
   private rrJu_1 class_ = null;
   private static final Charset break_ = Charset.forName("ASCII");
   private static final String byte_ = "Content-Length";
   private static final char protected_ = '\r';
   private static final char throws_ = '\n';

   private String byte_(InputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      int var3 = -1;
      boolean var4 = false;

      while (true) {
         int var5 = var1.read();
         if (var5 < 0) {
            break;
         }

         var2.write(var5);
         if (var3 == 13 && var5 == 10) {
            var4 = true;
            break;
         }

         var3 = var5;
      }

      byte[] var7 = var2.toByteArray();
      String var6 = new String(var7, break_);
      if (var4) {
         var6 = var6.substring(0, var6.length() - 2);
      }

      return var6;
   }

   public rrJm_1(rrJu_1 var1) {
      super("HttpPipelineReceiver");
      this.class_ = var1;
   }

   @Override
   public void run() {
      while (!Thread.interrupted()) {
         rrJZ var1 = null;

         try {
            var1 = this.class_.protected_();
            InputStream var2 = this.class_.break_();
            rrJL var3 = this.class_(var2);
            this.class_.class_(var1, var3);
         } catch (InterruptedException var4) {
            return;
         } catch (Exception var5) {
            this.class_.break_(var1, var5);
         }
      }
   }

   private rrJL class_(InputStream var1) throws IOException {
      String var2 = this.byte_(var1);
      String[] var3 = rrbb_3.class_(var2, " ");
      if (var3.length < 3) {
         throw new IOException("Invalid status line: " + var2);
      } else {
         String var4 = var3[0];
         int var5 = rrbb_3.class_(var3[1], 0);
         String var6 = var3[2];
         LinkedHashMap var7 = new LinkedHashMap();

         while (true) {
            String var8 = this.byte_(var1);
            if (var8.length() <= 0) {
               byte[] var12 = null;
               String var13 = (String)var7.get("Content-Length");
               if (var13 != null) {
                  int var14 = rrbb_3.class_(var13, -1);
                  if (var14 > 0) {
                     var12 = new byte[var14];
                     this.class_(var12, var1);
                  }
               } else {
                  String var15 = (String)var7.get("Transfer-Encoding");
                  if (rrbb_3.class_((Object)var15, (Object)"chunked")) {
                     var12 = this.break_(var1);
                  }
               }

               return new rrJL(var5, var2, var7, var12);
            }

            int var9 = var8.indexOf(":");
            if (var9 > 0) {
               String var10 = var8.substring(0, var9).trim();
               String var11 = var8.substring(var9 + 1).trim();
               var7.put(var10, var11);
            }
         }
      }
   }

   private void class_(byte[] var1, InputStream var2) throws IOException {
      int var4 = 0;

      while (var4 < var1.length) {
         int var3 = var2.read(var1, var4, var1.length - var4);
         if (var3 < 0) {
            throw new EOFException();
         }

         var4 += var3;
      }
   }

   private byte[] break_(InputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();

      int var3;
      do {
         String var4 = this.byte_(var1);
         String[] var5 = rrbb_3.class_(var4, "; ");
         var3 = Integer.parseInt(var5[0], 16);
         byte[] var6 = new byte[var3];
         this.class_(var6, var1);
         var2.write(var6);
         this.byte_(var1);
      } while (var3 != 0);

      return var2.toByteArray();
   }
}
