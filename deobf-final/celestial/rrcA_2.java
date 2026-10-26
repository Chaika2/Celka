package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcA_2 {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{true, false, true, false};
   }

   public rrcA_2(rdb_3 var1, rrcn_3[] var2) {
      this.protected_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrcA_2 var2 = (rrcA_2)var1;
         return Objects.equals((rdb_3)this.class_[0], (rdb_3)var2.class_[0]);
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rdb_3)this.class_[0]);
   }

   public rrcn_3[] class_() {
      return (rrcn_3[])this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1537601212;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 5, -111, 1, 69, 40, 60, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5844574960034700090L;
   }

   public rdb_3 break_() {
      return (rdb_3)this.class_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      break_ = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
