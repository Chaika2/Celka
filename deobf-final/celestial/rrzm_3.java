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
   private static String[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   private static void byte_() {
      break_ = new String[]{new String("")};
   }

   public rrzm_3(rrzu_3 var1, Enumeration var2) {
      this.break_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7502453632238485033L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 683104698;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 78, -5, -19, 71, 10, 46, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public URL class_() {
      URL var1 = (URL)((Enumeration)this.class_[0]).nextElement();
      Function var2 = rrzL_2.break_(var1.getPath());
      if (var2 != null) {
         try {
            return new URL(var1, break_[0], new rrzF_2(var1, var2));
         } catch (MalformedURLException var4) {
            throw new RuntimeException(var4);
         }
      } else {
         return var1;
      }
   }

   @Override
   public boolean hasMoreElements() {
      return ((Enumeration)this.class_[0]).hasMoreElements();
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{true};
   }

   private static void protected_() {
      protected_ = new short[3];
   }
}
