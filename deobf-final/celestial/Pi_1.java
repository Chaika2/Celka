package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pi_1 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public Pi_1(iB_2 var1, rjG_2 var2) {
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
         Pi_1 var2 = (Pi_1)var1;
         return Objects.equals((iB_2)this.class_[0], (iB_2)var2.class_[0]);
      } else {
         return protected_[1];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash((iB_2)this.class_[0]);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{116, -85, -8, 103, 37, 32, -69, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6114049577812694849L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1673216064;
   }

   public rjG_2 class_() {
      return (rjG_2)this.class_[1];
   }

   public iB_2 break_() {
      return (iB_2)this.class_[0];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, true, false};
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 0, 0, 1, 0, 1};
   }

   private static void protected_() {
      break_ = new byte[]{2};
   }
}
