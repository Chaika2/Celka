package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ry_3 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
      }
   }

   public ry_3(rq_3 var1, int var2, int var3, int var4) {
      this.byte_();
      this.class_[0] = var1;
      Integer var10 = var2;
      this.class_[1] = var10;
      Integer var11 = var3;
      this.class_[2] = var11;
      Integer var12 = var4;
      this.class_[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8538990649725726379L;
   }

   private static void class_() {
      byte_ = new short[]{0, 1, 2, 3};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -39, 74, 122, 6, -69, -116, -110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -551747534;
   }

   private static void break_() {
      protected_ = new byte[]{4, 2, 3};
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, false, false};
   }
}
