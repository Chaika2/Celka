package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rh_3 implements PZ, rP_2 {
   private static boolean[] break_;
   private static int[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   private static short[] case_;
   public Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{true, true, false, true, true, false, true, false, false, true, false, false, true, false, false};
   }

   public rh_3(rfH_2 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rh_3(int var1, int var2, int var3) {
      this.protected_();
      Integer var8 = var1;
      this.class_[0] = var8;
      Integer var9 = var2;
      this.class_[1] = var9;
      Integer var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rh_3 var2 = (rh_3)var1;
         return this.class_[0] == var2.class_[0] && this.class_[1] == var2.class_[1] && this.class_[2] == var2.class_[2] ? true : break_[7];
      } else {
         return break_[5];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalTwoBlocks{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      return (int)rU_2.byte_((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]) * 516508351;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 127, -104, -89, -49, 43, -77, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1644760468;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3671922935217675364L;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return rS_2.class_((double)var4, var5 < 0 ? var5 + 1 : var5, (double)var6);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var1 == this.class_[0] && (var2 == this.class_[1] || var2 == this.class_[1] - 1) && var3 == this.class_[2] ? true : break_[2];
   }

   @Override
   public rfH_2 break_() {
      return new rfH_2((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]);
   }

   private static void throws_() {
      throws_ = new byte[]{3, 2, 3, 2};
   }

   private static void catch_() {
      protected_ = new String[]{new String("GoalTwoBlocks{x=%s,y=%s,z=%s}")};
   }

   private static void case_() {
      case_ = new short[]{0, 1, 2, 0, 1, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   private static void private_() {
      byte_ = new int[]{516508351};
   }
}
