package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruW {
   private static byte[] break_;
   private static float[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = 0.0F;
      }
   }

   public rruW(rruk_1 var1, rruk_1 var2, float var3) {
      this.byte_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Float var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, 27, 77, 29, 102, 75, -13, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1396608766;
   }

   private static void class_() {
      byte_ = new float[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6513212307341370335L;
   }

   private static void break_() {
      break_ = new byte[]{3, 2};
   }

   private static void protected_() {
      protected_ = new short[]{0, 1, 2};
   }
}
