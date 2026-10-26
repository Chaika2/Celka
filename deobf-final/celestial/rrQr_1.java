package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQr_1 extends rrzi_3 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] throws_;
   private static byte[] case_;

   private static void byte_() {
      case_ = new byte[]{31};
   }

   public rrQr_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.protected_();
      if (!(var1 instanceof rrzi_3)) {
         return false;
      } else {
         byte[] var2 = (byte[])((rrzi_3)var1).protected_[0];
         return Arrays.equals((byte[])this.protected_[0], 0, (Integer)this.class_[0], var2, 0, var2.length);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -13629788;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4097667861974187502L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, 95, 90, -122, -21, -91, -117, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new boolean[]{true, false, false, false, false, true, false, false};
   }

   public rrQr_1 class_(byte[] var1, int var2) {
      this.break_(var1, var2);
      return this;
   }

   private static void break_() {
      throws_ = new short[]{0, 0, 1, 0, 0, 0};
   }

   public void break_(byte[] var1, int var2) {
      this.protected_();
      this.protected_[0] = var1;
      Integer var10 = var2;
      this.class_[0] = var10;
      int var3 = 1;

      for (int var4 = 0; var4 < var2; var4++) {
         var3 = 31 * var3 + var1[var4];
      }

      Integer var11 = var3;
      this.protected_[1] = var11;
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0;
      }
   }
}
