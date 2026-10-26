package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruE {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      break_ = new boolean[5];
   }

   public rruE() {
      this.break_();
      Integer var5 = 2;
      this.class_[0] = var5;
      rrus_1 var6 = (rrus_1)rrus_1.staticFields671469053d923ac8912036fe43a40b51[1];
      this.class_[1] = var6;
      rrur_1 var7 = (rrur_1)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[1];
      this.class_[2] = var7;
      rrca_3 var8 = (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[2];
      this.class_[3] = var8;
      Integer var9 = 25;
      this.class_[4] = var9;
      Integer var10 = 6;
      this.class_[5] = var10;
      Integer var11 = 2;
      this.class_[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1057628547;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{13, -18, 54, -71, -80, 69, 89, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1376371597138239098L;
   }

   private static void class_() {
      byte_ = new short[]{0, 1, 1, 1, 2, 2, 3, 4, 5, 6};
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[4] = 0;
         var1[5] = 0;
         var1[6] = 0;
      }
   }

   private static void protected_() {
      protected_ = new byte[]{2, 25, 6, 2, 7, 4, 5, 6};
   }
}
