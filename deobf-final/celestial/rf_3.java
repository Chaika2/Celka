package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rf_3 extends rI_2 {
   private static byte[] protected_;
   private static boolean[] throws_;
   public Object[] byte_;
   private static short[] case_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -27, 14, -94, 124, -69, -92, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rf_3(rq_3 var1, ra_3 var2) {
      super(var1);
      this.case_();
      this.byte_[0] = var2;
      Boolean[][][] var8 = new Boolean[this.break_()][this.class_()][this.byte_()];
      this.byte_[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -67774625;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1915885113435930557L;
   }

   @Override
   public boolean break_(int var1, int var2, int var3, xc_3 var4) {
      this.case_();
      if (((Boolean[][][])this.byte_[1])[var1][var2][var3] == null) {
         ((Boolean[][][])this.byte_[1])[var1][var2][var3] = ((ra_3)this.byte_[0]).class_(var4);
      }

      return ((Boolean[][][])this.byte_[1])[var1][var2][var3];
   }

   private static void throws_() {
      case_ = new short[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 1};
   }

   private static void catch_() {
      protected_ = new byte[]{2};
   }

   private void case_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         Object[] var1 = this.byte_;
      }
   }

   @Override
   public void protected_() {
      this.case_();

      for (int var1 = 0; var1 < ((Boolean[][][])this.byte_[1]).length; var1++) {
         for (int var2 = 0; var2 < ((Boolean[][][])this.byte_[1])[0].length; var2++) {
            for (int var3 = 0; var3 < ((Boolean[][][])this.byte_[1])[0][0].length; var3++) {
               ((Boolean[][][])this.byte_[1])[var1][var2][var3] = null;
            }
         }
      }
   }

   private static void private_() {
      throws_ = new boolean[6];
   }
}
