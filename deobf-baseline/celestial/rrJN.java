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
   private static Map id_finally = new HashMap();
   public static final String id_class = "User-Agent";
   public static final String id_break = "Host";
   public static final String id_byte = "Accept";
   public static final String id_protected = "Location";
   public static final String id_throws = "Keep-Alive";
   public static final String id_case = "Connection";
   public static final String id_catch = "keep-alive";
   public static final String id_private = "Transfer-Encoding";
   public static final String id_implements = "chunked";

   private rrJN() {
   }

   public static void id_class(String var0, rrJQ var1) throws IOException {
      id_class(var0, var1, Proxy.NO_PROXY);
   }

   private static synchronized void id_class(String var0, int var1, Proxy var2, rrJu_1 var3) {
      String var4 = id_break(var0, var1, var2);
      rrJu_1 var5 = (rrJu_1)id_finally.get(var4);
      if (var5 == var3) {
         id_finally.remove(var4);
      }
   }

   public static byte[] id_class(String var0) throws IOException {
      return id_break(var0, Proxy.NO_PROXY);
   }

   public static rrJL id_class(rrJF var0) throws IOException {
      HashMap var1 = new HashMap();
      String var2 = "Response";
      String var3 = "Exception";
      rrJc_1 var4 = new rrJc_1(var1);
      synchronized (var1) {
         rrJZ var6 = new rrJZ(var0, var4);
         id_class(var6);

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

   public static boolean id_class() {
      for (rrJu_1 var1 : id_finally.values()) {
         if (var1.id_catch()) {
            return true;
         }
      }

      return false;
   }

   public static void id_class(String var0, rrJQ var1, Proxy var2) throws IOException {
      rrJF var3 = id_class(var0, var2);
      rrJZ var4 = new rrJZ(var3, var1);
      id_class(var4);
   }

   public static rrJF id_class(String var0, Proxy var1) throws IOException {
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

   private static synchronized rrJu_1 id_class(String var0, int var1, Proxy var2) {
      String var3 = id_break(var0, var1, var2);
      rrJu_1 var4 = (rrJu_1)id_finally.get(var3);
      if (var4 == null) {
         var4 = new rrJu_1(var0, var1, var2);
         id_finally.put(var3, var4);
      }

      return var4;
   }

   public static void id_class(rrJZ var0) {
      rrJF var1 = var0.id_class();

      for (rrJu_1 var2 = id_class(var1.id_class(), var1.id_break(), var1.id_implements());
         !var2.id_class(var0);
         var2 = id_class(var1.id_class(), var1.id_break(), var1.id_implements())
      ) {
         id_class(var1.id_class(), var1.id_break(), var1.id_implements(), var2);
      }
   }

   private static String id_break(String var0, int var1, Proxy var2) {
      return var0 + ":" + var1 + "-" + var2;
   }

   public static byte[] id_break(String var0, Proxy var1) throws IOException {
      if (var0.startsWith("file:")) {
         URL var4 = new URL(var0);
         InputStream var5 = var4.openStream();
         return rrbb_3.id_byte(var5);
      } else {
         rrJF var2 = id_class(var0, var1);
         rrJL var3 = id_class(var2);
         if (var3.id_class() / 100 != 2) {
            throw new IOException("HTTP response: " + var3.id_class());
         } else {
            return var3.id_protected();
         }
      }
   }
}
