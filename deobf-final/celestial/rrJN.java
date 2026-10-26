package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class rrJN {
   private static Map finally_ = new HashMap();
   public static final String class_ = "User-Agent";
   public static final String break_ = "Host";
   public static final String byte_ = "Accept";
   public static final String protected_ = "Location";
   public static final String throws_ = "Keep-Alive";
   public static final String case_ = "Connection";
   public static final String catch_ = "keep-alive";
   public static final String private_ = "Transfer-Encoding";
   public static final String implements_ = "chunked";

   private rrJN() {
   }

   public static void class_(String var0, rrJQ var1) throws IOException {
      class_(var0, var1, Proxy.NO_PROXY);
   }

   private static synchronized void class_(String var0, int var1, Proxy var2, rrJu_1 var3) {
      String var4 = break_(var0, var1, var2);
      rrJu_1 var5 = (rrJu_1)finally_.get(var4);
      if (var5 == var3) {
         finally_.remove(var4);
      }
   }

   public static byte[] class_(String var0) throws IOException {
      return break_(var0, Proxy.NO_PROXY);
   }

   public static rrJL class_(rrJF var0) throws IOException {
      HashMap var1 = new HashMap();
      String var2 = "Response";
      String var3 = "Exception";
      rrJc_1 var4 = new rrJc_1(var1);
      synchronized (var1) {
         rrJZ var6 = new rrJZ(var0, var4);
         class_(var6);

         try {
            var1.wait();
         } catch (InterruptedException var10) {
            throw new InterruptedIOException("Interrupted");
         }

         Exception var7 = (Exception)var1.get("Exception");
         if (var7 != null) {
            if (var7 instanceof IOException) {
               throw (IOException)var7;
            } else if (var7 instanceof RuntimeException) {
               throw (RuntimeException)var7;
            } else {
               throw new RuntimeException(var7.getMessage(), var7);
            }
         } else {
            rrJL var8 = (rrJL)var1.get("Response");
            if (var8 == null) {
               throw new IOException("Response is null");
            } else {
               return var8;
            }
         }
      }
   }

   public static boolean class_() {
      for (rrJu_1 var1 : finally_.values()) {
         if (var1.catch_()) {
            return true;
         }
      }

      return false;
   }

   public static void class_(String var0, rrJQ var1, Proxy var2) throws IOException {
      rrJF var3 = class_(var0, var2);
      rrJZ var4 = new rrJZ(var3, var1);
      class_(var4);
   }

   public static rrJF class_(String var0, Proxy var1) throws IOException {
      URL var2 = new URL(var0);
      if (!var2.getProtocol().equals("http")) {
         throw new IOException("Only protocol http is supported: " + var2);
      } else {
         String var3 = var2.getFile();
         String var4 = var2.getHost();
         int var5 = var2.getPort();
         if (var5 <= 0) {
            var5 = 80;
         }

         String var6 = "GET";
         String var7 = "HTTP/1.1";
         LinkedHashMap var8 = new LinkedHashMap();
         var8.put("User-Agent", "Java/" + System.getProperty("java.version"));
         var8.put("Host", var4);
         var8.put("Accept", "text/html, image/gif, image/png");
         var8.put("Connection", "keep-alive");
         byte[] var9 = new byte[0];
         return new rrJF(var4, var5, var1, var6, var3, var7, var8, var9);
      }
   }

   private static synchronized rrJu_1 class_(String var0, int var1, Proxy var2) {
      String var3 = break_(var0, var1, var2);
      rrJu_1 var4 = (rrJu_1)finally_.get(var3);
      if (var4 == null) {
         var4 = new rrJu_1(var0, var1, var2);
         finally_.put(var3, var4);
      }

      return var4;
   }

   public static void class_(rrJZ var0) {
      rrJF var1 = var0.class_();

      for (rrJu_1 var2 = class_(var1.class_(), var1.break_(), var1.implements_());
         !var2.class_(var0);
         var2 = class_(var1.class_(), var1.break_(), var1.implements_())
      ) {
         class_(var1.class_(), var1.break_(), var1.implements_(), var2);
      }
   }

   private static String break_(String var0, int var1, Proxy var2) {
      return var0 + ":" + var1 + "-" + var2;
   }

   public static byte[] break_(String var0, Proxy var1) throws IOException {
      if (var0.startsWith("file:")) {
         URL var4 = new URL(var0);
         InputStream var5 = var4.openStream();
         return rrbb_3.byte_(var5);
      } else {
         rrJF var2 = class_(var0, var1);
         rrJL var3 = class_(var2);
         if (var3.class_() / 100 != 2) {
            throw new IOException("HTTP response: " + var3.class_());
         } else {
            return var3.protected_();
         }
      }
   }
}
