package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GJ {
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static boolean[] throws_;
   public static Object[] break_;

   private static void byte_() {
      throws_ = new boolean[]{false, true, true, true, false, true, true, false, true, true, false, true, false, true, true};
   }

   public boolean byte_(bw_3 var1, int var2, int var3, int var4, xc_3 var5) {
      int var6 = xd_3.char_.class_(var5);
      int var7 = ((int[])this.class_[0])[var6];
      if ((var7 & 1) == 0) {
         var7 = this.class_(var6, var5);
      }

      if ((var7 & 16) != 0) {
         return EF.throws_(var1, var2, var3, var4, var5);
      } else {
         return (var7 & 8) != 0 ? true : throws_[7];
      }
   }

   public GJ() {
      this.class_();
      int[] var5 = new int[xd_3.char_.class_()];
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3636416815881542624L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 26, -7, 0, -13, 121, 89, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 773148430;
   }

   public boolean class_(bw_3 var1, int var2, int var3, int var4, xc_3 var5) {
      int var6 = xd_3.char_.class_(var5);
      int var7 = ((int[])this.class_[0])[var6];
      if ((var7 & 1) == 0) {
         var7 = this.class_(var6, var5);
      }

      if ((var7 & 64) != 0) {
         return EF.protected_(var1, var2, var3, var4, var5);
      } else {
         return (var7 & 32) != 0 ? true : throws_[10];
      }
   }

   private int class_(int var1, xc_3 var2) {
      int var3 = 0;
      Gx_1 var4 = EF.implements_(var2);
      if (var4 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         var3 |= 2;
      }

      if (var4 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]) {
         var3 |= 4;
      }

      Gx_1 var5 = EF.private_(var2);
      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         var3 |= 8;
      }

      if (var5 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]) {
         var3 |= 16;
      }

      Gx_1 var6 = EF.class_(var2);
      if (var6 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]) {
         var3 |= 32;
      }

      if (var6 == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]) {
         var3 |= 64;
      }

      var3 |= 1;
      ((int[])this.class_[0])[var1] = var3;
      return var3;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void break_() {
      protected_ = new short[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0};
   }

   public boolean break_(bw_3 var1, int var2, int var3, int var4, xc_3 var5) {
      int var6 = xd_3.char_.class_(var5);
      int var7 = ((int[])this.class_[0])[var6];
      if ((var7 & 1) == 0) {
         var7 = this.class_(var6, var5);
      }

      if ((var7 & 4) != 0) {
         return EF.catch_(var1, var2, var3, var4, var5);
      } else {
         return (var7 & 2) != 0 ? true : throws_[4];
      }
   }

   private static void throws_() {
      byte_ = new byte[]{2, 4, 8, 16, 32, 64, 4, 2, 16, 8, 64, 32, 7, 2, 2, 4, 3, 8, 4, 16, 5, 32, 6, 64};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{1, 2, 4, 8, 16, 32, 64};
      break_ = var0;
   }
}
