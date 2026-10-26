package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqz_3 {
   private static short[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   public Object[] class_;

   public xd_3 byte_() {
      return (xd_3)this.class_[0];
   }

   public rrqz_3(xd_3 var1, int var2) {
      this.throws_();
      this.class_[0] = var1;
      Integer var8 = var2;
      this.class_[2] = var8;
      String var9 = ri_3.class_(var1);
      this.class_[1] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqz_3 var2 = (rrqz_3)var1;
         return Objects.equals((String)this.class_[1], (String)var2.class_[1]);
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((String)this.class_[1]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 389164944810939150L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 690361776;
   }

   public int class_() {
      return (Integer)this.class_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-35, 124, -22, 2, 50, 11, -102, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String break_() {
      return (String)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[2] = 0;
      }
   }

   private static void catch_() {
      break_ = new short[]{0, 2, 1, 1, 1, 1, 0, 1, 2};
   }

   private static void case_() {
      protected_ = new byte[]{3, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, false, false};
   }
}
