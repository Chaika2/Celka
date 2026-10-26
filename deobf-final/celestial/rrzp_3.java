package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzp_3 implements Iterator<Path> {
   public Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new short[]{0, 0, 3, 0, 4, 0, 3, 0, 4};
   }

   public rrzp_3(rrzy_3 var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean hasNext() {
      return ((rrzy_3)this.class_[0]).class_[3] ? false : ((Iterator)((rrzy_3)this.class_[0]).class_[4]).hasNext();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3574219386184917621L;
   }

   public synchronized Path class_() {
      if ((Boolean)((rrzy_3)this.class_[0]).class_[3]) {
         throw new NoSuchElementException();
      } else {
         return (Path)((Iterator)((rrzy_3)this.class_[0]).class_[4]).next();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-18, -30, 106, 13, 25, -89, -77, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 231181357;
   }

   private static void break_() {
      byte_ = new boolean[]{false, true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
