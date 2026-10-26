package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EQ {
   private static short[] break_;
   private static double[] byte_;
   private static byte[] protected_;
   public Object[] class_;
   private static String[] throws_;
   private static boolean[] case_;

   private static void byte_() {
      protected_ = new byte[]{4, 2, 3, -1, -1, 8, 2, 3, 4, 5, 7};
   }

   public EQ(int var1, int var2, int var3, rP_2 var4) {
      this.protected_();
      Object var9 = null;
      this.class_[6] = var9;
      Double var10 = 1000000.0;
      this.class_[4] = var10;
      Double var11 = var4.class_(var1, var2, var3);
      this.class_[3] = var11;
      if (Double.isNaN((Double)this.class_[3])) {
         throw new IllegalStateException(
            String.format("%s calculated implausible heuristic NaN at %s %s %s", var4, Pd_1.class_(var1), Pd_1.class_(var2), Pd_1.class_(var3))
         );
      } else {
         Integer var12 = -1;
         this.class_[7] = var12;
         Integer var13 = var1;
         this.class_[0] = var13;
         Integer var14 = var2;
         this.class_[1] = var14;
         Integer var15 = var3;
         this.class_[2] = var15;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      EQ var2 = (EQ)var1;
      return this.class_[0] == var2.class_[0] && this.class_[1] == var2.class_[1] && this.class_[2] == var2.class_[2] ? true : case_[5];
   }

   @Override
   public int hashCode() {
      return (int)rU_2.byte_((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]);
   }

   public boolean class_() {
      return this.class_[7] != -1 ? true : case_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3072391282506715228L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1240112285;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 114, 75, 80, -127, 36, 53, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new double[]{1000000.0, 0.0, 0.0, 0.0};
   }

   private static void throws_() {
      case_ = new boolean[]{false, true, true, false, true, false, false, false, true, false, false, false};
   }

   private static void catch_() {
      throws_ = new String[]{new String("%s calculated implausible heuristic NaN at %s %s %s")};
   }

   private static void case_() {
      break_ = new short[]{6, 4, 3, 3, 7, 0, 1, 2, 7, 0, 1, 2, 0, 0, 1, 1, 2, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[8];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
         var1[7] = 0;
      }
   }
}
