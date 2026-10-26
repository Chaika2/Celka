package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rS_2 implements PZ, rP_2 {
   private static short[] break_;
   private static boolean[] byte_;
   private static double[] protected_;
   private static byte[] throws_;
   private static int[] case_;
   public Object[] class_;
   private static String[] catch_;

   private static void byte_() {
      case_ = new int[]{905165533};
   }

   public rS_2(rfH_2 var1) {
      this(var1.b_(), var1.c_(), var1.d_());
   }

   public rS_2(int var1, int var2, int var3) {
      this.private_();
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
         rS_2 var2 = (rS_2)var1;
         return this.class_[0] == var2.class_[0] && this.class_[1] == var2.class_[1] && this.class_[2] == var2.class_[2] ? true : byte_[5];
      } else {
         return byte_[3];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalBlock{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      return (int)rU_2.byte_((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]) * 905165533;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return class_((double)var4, var5, (double)var6);
   }

   public static double class_(double var0, int var2, double var3) {
      double var5 = 0.0;
      var5 += rJ_2.class_(0, var2);
      return var5 + rX_2.class_(var0, var3);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 611550311;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, 42, -30, -43, 102, 120, 50, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7342487622152534617L;
   }

   @Override
   public rfH_2 break_() {
      return new rfH_2((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var1 == this.class_[0] && var2 == this.class_[1] && var3 == this.class_[2] ? true : byte_[1];
   }

   private static void throws_() {
      throws_ = new byte[]{3, 2, 3, 2};
   }

   private static void catch_() {
      protected_ = new double[1];
   }

   private static void case_() {
      break_ = new short[]{0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void implements_() {
      byte_ = new boolean[]{true, false, true, false, true, false, false, true, false, false, false, true, false, false};
   }

   private static void protected_() {
      catch_ = new String[]{new String("GoalBlock{x=%s,y=%s,z=%s}")};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }
}
