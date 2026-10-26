package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNZ {
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;

   public rrNd_1 byte_() {
      return (rrNd_1)this.class_[0];
   }

   public rrNZ(rrNd_1 var1, rrNw_1 var2, int var3) {
      this.protected_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Integer var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrNZ var2 = (rrNZ)var1;
         return Objects.equals(((rrNd_1)this.class_[0]).case_(), ((rrNd_1)var2.class_[0]).case_());
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((rrNd_1)this.class_[0]).case_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5940649948841523519L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 66, 103, -15, 108, -108, 61, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1376904309;
   }

   public rrNw_1 class_() {
      return (rrNw_1)this.class_[1];
   }

   public int break_() {
      return (Integer)this.class_[2];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, false};
   }

   private static void catch_() {
      byte_ = new byte[]{3, 2};
   }

   private static void case_() {
      break_ = new short[]{0, 0, 0, 0, 1, 2, 0, 1, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }
}
