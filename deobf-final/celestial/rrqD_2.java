package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqD_2 {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   public rjU_2 byte_() {
      return (rjU_2)this.class_[3];
   }

   public rrqD_2(rrqU_2 var1, rfH_2 var2, rfj_3 var3) {
      this.private_();
      this.class_[0] = var1;
      this.class_[1] = var3;
      rjU_2 var10 = new rjU_2((double)var2.b_(), (double)var2.c_(), (double)var2.d_());
      this.class_[3] = var10;
      rfH_2 var11 = new rfH_2((rjU_2)this.class_[3]);
      this.class_[2] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrqD_2 var2 = (rrqD_2)var1;
         return Objects.equals((rjU_2)this.class_[3], (rjU_2)var2.class_[3]);
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((rjU_2)this.class_[3]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6803050990364531202L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1306660529;
   }

   public rfj_3 class_() {
      return (rfj_3)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -122, -56, 61, 35, -87, -15, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrqU_2 break_() {
      return (rrqU_2)this.class_[0];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, true, false};
   }

   private static void catch_() {
      byte_ = new short[]{0, 1, 3, 3, 2, 3, 3, 3, 0, 1, 2, 3};
   }

   private static void case_() {
      break_ = new byte[]{4};
   }

   public rfH_2 protected_() {
      return (rfH_2)this.class_[2];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
      }
   }
}
