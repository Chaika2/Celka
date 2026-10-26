package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GA {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }

   public GA(int var1, rfH_2 var2, rpr_3 var3, PX var4) {
      this.byte_();
      Integer var9 = var1;
      this.class_[0] = var9;
      this.class_[1] = var2;
      this.class_[2] = var3;
      this.class_[3] = var4;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6520998950048108130L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1970599151;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -17, -53, -97, -75, 113, 122, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      protected_ = new byte[]{4};
   }

   private static void break_() {
      break_ = new short[]{0, 1, 2, 3};
   }

   private static void protected_() {
      byte_ = new boolean[2];
   }
}
