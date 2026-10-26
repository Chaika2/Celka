package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcH_2 {
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rrcH_2(rdb_3 var1, rrcy_3[] var2) {
      this.byte_();
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
         rrcH_2 var2 = (rrcH_2)var1;
         return Objects.equals((rdb_3)this.class_[0], (rdb_3)var2.class_[0]);
      } else {
         return break_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rdb_3)this.class_[0]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -249867815;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, 46, 15, -55, -42, 50, -64, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6823131687009805751L;
   }

   public rdb_3 class_() {
      return (rdb_3)this.class_[0];
   }

   public rrcy_3[] break_() {
      return (rrcy_3[])this.class_[1];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, true, false};
   }
}
