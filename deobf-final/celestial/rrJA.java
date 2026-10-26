package celestial;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class rrJA {
   private static String byte_ = null;
   public static final String class_ = "http://s.optifine.net";
   public static final String break_ = "http://optifine.net";

   public static byte[] class_(String var0) throws IOException {
      HttpURLConnection var1 = null;

      byte[] var2;
      try {
         URL var3 = new URL(var0);
         var1 = (HttpURLConnection)var3.openConnection(QY.instanceof_().W());
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();
         if (var1.getResponseCode() / 100 != 2) {
            if (var1.getErrorStream() != null) {
               rrbb_3.byte_(var1.getErrorStream());
            }

            throw new IOException("HTTP response: " + var1.getResponseCode());
         }

         InputStream var4 = var1.getInputStream();
         byte[] var5 = new byte[var1.getContentLength()];
         int var6 = 0;

         do {
            int var7 = var4.read(var5, var6, var5.length - var6);
            if (var7 < 0) {
               throw new IOException("Input stream closed: " + var0);
            }

            var6 += var7;
         } while (var6 < var5.length);

         var2 = var5;
      } finally {
         if (var1 != null) {
            var1.disconnect();
         }
      }

      return var2;
   }

   public static synchronized String class_() {
      if (byte_ == null) {
         try {
            boolean var0 = rrbb_3.class_(System.getProperty("player.models.local"), false);
            if (var0) {
               File var1 = (File)QY.instanceof_().class_[24];
               File var2 = new File(var1, "playermodels");
               byte_ = var2.toURI().toURL().toExternalForm();
            }
         } catch (Exception var3) {
            rrbb_3.protected_(var3.getClass().getName() + ": " + var3.getMessage());
         }

         if (byte_ == null) {
            byte_ = "http://s.optifine.net";
         }
      }

      return byte_;
   }

   public static String class_(String var0, Map var1, byte[] var2) throws IOException {
      HttpURLConnection var3 = null;

      String var4;
      try {
         URL var5 = new URL(var0);
         var3 = (HttpURLConnection)var5.openConnection(QY.instanceof_().W());
         var3.setRequestMethod("POST");
         if (var1 != null) {
            for (String var7 : var1.keySet()) {
               String var8 = var1.get(var7) + "";
               var3.setRequestProperty(var7, var8);
            }
         }

         var3.setRequestProperty("Content-Type", "text/plain");
         var3.setRequestProperty("Content-Length", var2.length + "");
         var3.setRequestProperty("Content-Language", "en-US");
         var3.setUseCaches(false);
         var3.setDoInput(true);
         var3.setDoOutput(true);
         OutputStream var15 = var3.getOutputStream();
         var15.write(var2);
         var15.flush();
         var15.close();
         InputStream var16 = var3.getInputStream();
         InputStreamReader var17 = new InputStreamReader(var16, "ASCII");
         BufferedReader var9 = new BufferedReader(var17);
         StringBuffer var10 = new StringBuffer();

         String var11;
         while ((var11 = var9.readLine()) != null) {
            var10.append(var11);
            var10.append('\r');
         }

         var9.close();
         var4 = var10.toString();
      } finally {
         if (var3 != null) {
            var3.disconnect();
         }
      }

      return var4;
   }
}
