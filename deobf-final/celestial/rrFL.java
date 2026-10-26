package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFL {
   public static Object[] class_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static byte[] throws_;
   private static short[] case_;
   public Object[] break_;

   public boolean byte_() {
      return (Boolean)this.break_[5];
   }

   public rrFL(float var1, float var2, float var3) {
      this.implements_();
      rdn_3 var8 = rdn_3.break_;
      this.break_[3] = var8;
      rdn_3 var9 = rdn_3.break_;
      this.break_[4] = var9;
      Boolean var10 = false;
      this.break_[5] = var10;
      Boolean var11 = false;
      this.break_[6] = var11;
      AnimValue var12 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var1, false).package_();
      this.break_[0] = var12;
      AnimValue var13 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var2, false);
      this.break_[1] = var13;
      AnimValue var14 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var3, true);
      this.break_[2] = var14;
   }

   static {
      ntfClinit();
   }

   public void class_(rdn_3 var1) {
      if (!rdn_3.byte_(var1, (rdn_3)this.break_[3])) {
         if (!var1.class_() && !((rdn_3)this.break_[3]).class_()) {
            ((AnimValue)this.break_[1]).extends_();
         }

         rdn_3 var6 = var1.implements_();
         this.break_[3] = var6;
      }

      ((AnimValue)this.break_[0]).class_(!var1.class_() ? true : byte_[7]);
      if (!var1.class_()) {
         this.break_[4] = var1;
         Boolean var8 = true;
         this.break_[5] = var8;
      } else if (((AnimValue)this.break_[0]).byte_() < 0.05F) {
         Boolean var9 = false;
         this.break_[5] = var9;
         Boolean var10 = false;
         this.break_[6] = var10;
      }

      ((AnimValue)this.break_[1]).class_(true);
   }

   public void class_(Ml_1 var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = ((AnimValue)this.break_[0]).byte_();
      if (!(var7 <= 0.001F) && !((rdn_3)this.break_[4]).class_()) {
         float var8 = rfU_2.class_(var4 * var7, 0.0F, 1.0F);
         if (!(var8 <= 0.001F)) {
            float var9 = protected_[5] + 0.9F * ((AnimValue)this.break_[1]).byte_();
            float var10 = var5 * (1.0F - var9) / 2.0F;
            float var11 = (1.0F - var7) * 5.0F;
            rrfD_2.class_(var1, (rdn_3)this.break_[4], var2 + var10, var3 + var10 + var11, var8, var9 * var6, 2.0F, 13.0F, 13, true, true);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 301653027;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 99, 89, 56, -60, -52, 46, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(float var1) {
      if (!(Boolean)this.break_[6]) {
         ((AnimValue)this.break_[2]).class_(var1);
         Boolean var6 = true;
         this.break_[6] = var6;
      }

      ((AnimValue)this.break_[2]).break_(var1);
   }

   public float class_() {
      return ((AnimValue)this.break_[2]).byte_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8112820882067099157L;
   }

   public void break_() {
      ((AnimValue)this.break_[0]).package_();
      Boolean var5 = false;
      this.break_[6] = var5;
   }

   private static void throws_() {
      case_ = new short[]{3, 4, 5, 6, 0, 0, 0, 1, 0, 2, 0, 6, 3, 3, 1, 3, 0, 4, 5, 0, 5, 6, 1, 6, 2, 6, 2, 5, 2, 0, 0, 4, 1, 4};
   }

   private static void finally_() {
      Object[] var0 = new Object[]{-1.0842022E-19F, -1.0842022E-19F, 0.0F};
      class_ = var0;
   }

   private static void catch_() {
      protected_ = new float[]{0.05F, 0.001F, 0.0F, 1.0F, 0.001F, 0.1F, 0.9F, 1.0F, 2.0F, 1.0F, 5.0F, 2.0F, 13.0F, 0.05F, 0.1F, 5.0F};
   }

   private static void case_() {
      throws_ = new byte[]{13, 7, 5, 6, 3, 2};
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         Object[] var1 = this.break_;
         var1[5] = false;
         var1[6] = false;
      }
   }

   public float protected_() {
      return ((AnimValue)this.break_[0]).byte_();
   }

   private static void private_() {
      byte_ = new boolean[]{false, false, false, false, true, false, true, false, true, false, false, true, true, true, true, false, false, false, true};
   }
}
