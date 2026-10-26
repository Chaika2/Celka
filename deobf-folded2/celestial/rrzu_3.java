package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzu_3 extends ClassLoader {
   private static String[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{46, 47};
   }

   public rrzu_3() {
      super(rrzu_3.class.getClassLoader());
   }

   static {
      ntfClinit();
   }

   @Override
   public Class<?> loadClass(String var1, boolean var2) throws ClassNotFoundException {
      synchronized (this.getClassLoadingLock(var1)) {
         Class var4 = this.findLoadedClass(var1);
         if (var4 == null) {
            if (var1.startsWith(id_class[0])) {
               return this.getParent().loadClass(var1);
            }

            URL var5 = this.getResource(var1.replace((char)id_byte[0], (char)id_byte[1]) + ".class");
            if (var5 != null) {
               if (!id_class(var5)) {
                  return this.getParent().loadClass(var1);
               }

               try (InputStream var6 = var5.openStream()) {
                  byte[] var7 = var6.readAllBytes();
                  var4 = this.defineClass(var1, var7, id_break[0], var7.length);
               } catch (Throwable var12) {
                  throw new RuntimeException(var12);
               }
            }
         }

         if (var2) {
            this.resolveClass(var4);
         }

         return var4;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 304642513;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-125, -69, -3, 82, 79, -86, -5, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new String[]{new String("java."), new String("file"), new String("jar"), new String("")};
   }

   private static boolean id_class(URL var0) {
      return !var0.getProtocol().equals("file") && !var0.getProtocol().equals("jar") ? id_break[2] : id_break[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7134191586880796743L;
   }

   @Override
   public URL getResource(String var1) {
      URL var2 = super.getResource(var1);
      if (var2 == null) {
         return null;
      } else {
         Function var3 = rrzL_2.id_break(var1);
         if (var3 != null) {
            try {
               return new URL(var2, id_class[3], new rrzF_2(var2, var3));
            } catch (MalformedURLException var5) {
               throw new RuntimeException(var5);
            }
         } else {
            return var2;
         }
      }
   }

   @Override
   public Enumeration<URL> findResources(String var1) throws IOException {
      Enumeration var2 = super.findResources(var1);
      return new rrzm_3(this, var2);
   }

   private static void id_break() {
      id_break = new boolean[]{false, true, false};
   }
}
