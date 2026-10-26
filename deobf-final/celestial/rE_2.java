package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rE_2 implements PZ, rP_2 {
   private static int[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static String[] protected_;
   private static boolean[] throws_;
   private static short[] case_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   public rE_2(rfH_2 var1) {
      this.byte_();
      Integer var6 = var1.b_();
      this.class_[0] = var6;
      Integer var7 = var1.c_();
      this.class_[1] = var7;
      Integer var8 = var1.d_();
      this.class_[2] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rE_2 var2 = (rE_2)var1;
         return this.class_[0] == var2.class_[0] && this.class_[1] == var2.class_[1] && this.class_[2] == var2.class_[2] ? true : throws_[8];
      } else {
         return throws_[6];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalGetToBlock{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      return (int)rU_2.byte_((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]) * -49639096;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1775437066;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return rS_2.class_((double)var4, var5 < 0 ? var5 + 1 : var5, (double)var6);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, 60, -92, -2, -98, -51, 18, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6906107583425140550L;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.class_[0];
      int var5 = var2 - (Integer)this.class_[1];
      int var6 = var3 - (Integer)this.class_[2];
      return Math.abs(var4) + Math.abs(var5 < 0 ? var5 + 1 : var5) + Math.abs(var6) <= 1 ? true : throws_[3];
   }

   @Override
   public rfH_2 break_() {
      return new rfH_2((Integer)this.class_[0], (Integer)this.class_[1], (Integer)this.class_[2]);
   }

   private static void throws_() {
      break_ = new int[]{-49639096};
   }

   private static void catch_() {
      case_ = new short[]{0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 0, 1, 1, 2, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void case_() {
      protected_ = new String[]{new String("GoalGetToBlock{x=%s,y=%s,z=%s}")};
   }

   private static void protected_() {
      throws_ = new boolean[]{true, true, true, false, true, true, false, true, false, false, true, false, false, true, false, false};
   }

   private static void private_() {
      byte_ = new byte[]{3, 2, 3, 2};
   }
}
