package celestial;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQE implements Iterator<Path> {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new short[]{1, 0, 0, 1, 0, 1, 1, 0, 0, 0};
   }

   public rrQE(rrQs_1 var1) {
      this.protected_();
      this.class_[1] = var1;
      Integer var7 = 0;
      this.class_[0] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public void remove() {
      throw new ReadOnlyFileSystemException();
   }

   @Override
   public boolean hasNext() {
      return this.class_[0] < ((rrQs_1)this.class_[1]).getNameCount() ? true : protected_[2];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1405969425;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, 91, 123, 0, -22, 100, 98, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8181194376249765417L;
   }

   public Path class_() {
      if ((Integer)this.class_[0] < ((rrQs_1)this.class_[1]).getNameCount()) {
         rrQs_1 var1 = ((rrQs_1)this.class_[1]).class_((Integer)this.class_[0]);
         Integer var6 = (Integer)this.class_[0] + 1;
         this.class_[0] = var6;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   private static void break_() {
      break_ = new byte[]{2};
   }

   private static void throws_() {
      protected_ = new boolean[]{false, true, false, true, false, false};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }
}
