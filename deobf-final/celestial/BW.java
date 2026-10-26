package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BW {
   public Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;
   private static long[] protected_;
   private static short[] throws_;

   public int byte_() {
      return (Integer)this.class_[1];
   }

   public BW(rjU_2 var1, int var2) {
      this.private_();
      Long var7 = rqR_2.break_();
      this.class_[2] = var7;
      this.class_[0] = var1;
      Integer var9 = var2;
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
         BW var2 = (BW)var1;
         return this.class_[1] == var2.class_[1] && Objects.equals((rjU_2)this.class_[0], (rjU_2)var2.class_[0]) ? true : byte_[3];
      } else {
         return byte_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rjU_2)this.class_[0], (Integer)this.class_[1]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 86732890;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4247795190290538087L;
   }

   public long class_() {
      return (Long)this.class_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, 69, -24, -33, -10, -91, -49, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rjU_2 break_() {
      return (rjU_2)this.class_[0];
   }

   private static void throws_() {
      protected_ = new long[1];
   }

   private static void catch_() {
      throws_ = new short[]{1, 1, 0, 0, 0, 1, 0, 1, 2, 2, 0, 1};
   }

   private static void case_() {
      break_ = new byte[]{2, 3, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false, true, false, false, true, true, false};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0L;
      }
   }
}
