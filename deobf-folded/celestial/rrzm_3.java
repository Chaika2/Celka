package celestial;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzm_3 implements Enumeration<URL> {
   private static String[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   private static void id_byte() {
      id_break = new String[]{new String("")};
   }

   public rrzm_3(rrzu_3 var1, Enumeration var2) {
      this.id_break();
      this.id_class[id_protected[0]] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7502453632238485033L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 683104698;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 78, -5, -19, 71, 10, 46, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public URL id_class() {
      URL var1 = (URL)((Enumeration)this.id_class[id_protected[2]]).nextElement();
      Function var2 = rrzL_2.id_break(var1.getPath());
      if (var2 != null) {
         try {
            return new URL(var1, id_break[0], new rrzF_2(var1, var2));
         } catch (MalformedURLException var4) {
            throw new RuntimeException(var4);
         }
      } else {
         return var1;
      }
   }

   @Override
   public boolean hasMoreElements() {
      return ((Enumeration)this.id_class[id_protected[1]]).hasMoreElements();
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_byte = new boolean[]{true};
   }

   private static void id_protected() {
      id_protected = new short[3];
   }
}
