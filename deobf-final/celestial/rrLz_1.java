package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLz_1 implements MinecraftAccessor {
   private static float[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] case_;

   public void byte_(boolean var1) {
      Boolean var6 = var1;
      this.break_[6] = var6;
   }

   public float byte_() {
      return (float)Math.sqrt(
         ((rjU_2)this.break_[0]).break_ * ((rjU_2)this.break_[0]).break_ + ((rjU_2)this.break_[0]).protected_ * ((rjU_2)this.break_[0]).protected_
      );
   }

   public rrLz_1() {
      this.volatile_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7270740889899848619L;
   }

   public void class_(rfl_3 var1) {
      this.break_[2] = var1;
   }

   public void class_(float var1) {
      float var2 = ((cb_3)import_.class_[57]).sO();
      float var3 = ((rqr_3)((cb_3)import_.class_[57]).break_[17]).byte_;
      float var4 = ((rqr_3)((cb_3)import_.class_[57]).break_[17]).break_;
      if (var3 != 0.0F) {
         if (var4 > 0.0F) {
            var2 += (float)(var3 > 0.0F ? -45 : throws_[1]);
         } else if (var4 < 0.0F) {
            var2 += (float)(var3 > 0.0F ? 45 : throws_[3]);
         }

         var4 = byte_[5];
         if (var3 > 0.0F) {
            var3 = 1.0F;
         } else if (var3 < 0.0F) {
            var3 = -1.0F;
         }
      }

      double var5 = (double)rfU_2.break_(rrfQ_2.class_(var2 + 90.0F));
      double var7 = (double)rfU_2.class_(rrfQ_2.class_(var2 + 90.0F));
      ((rjU_2)this.break_[0]).break_ = (double)(var3 * var1) * var5 + (double)(var4 * var1) * var7;
      ((rjU_2)this.break_[0]).protected_ = (double)(var3 * var1) * var7 - (double)(var4 * var1) * var5;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1753145702;
   }

   public static rrLz_1 class_(rjU_2 var0, rjU_2 var1, rfl_3 var2, boolean var3, boolean var4, boolean var5) {
      rrLz_1 var6 = break_(var0, var1, var2, var3, var4, var5);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var6);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var6);
      return var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, 75, -18, -63, -108, -47, -61, -110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      return (Boolean)this.break_[5];
   }

   public void class_(rjU_2 var1) {
      this.break_[0] = var1;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[3] = var6;
   }

   public static rrLz_1 break_(rjU_2 var0, rjU_2 var1, rfl_3 var2, boolean var3, boolean var4, boolean var5) {
      ((rrLz_1)class_[0]).break_[0] = var0;
      ((rrLz_1)class_[0]).break_[1] = var1;
      ((rrLz_1)class_[0]).break_[2] = var2;
      rrLz_1 var10000 = (rrLz_1)class_[0];
      Boolean var13 = var3;
      var10000.break_[4] = var13;
      var10000 = (rrLz_1)class_[0];
      Boolean var14 = var4;
      var10000.break_[5] = var14;
      var10000 = (rrLz_1)class_[0];
      Boolean var15 = var5;
      var10000.break_[3] = var15;
      return (rrLz_1)class_[0];
   }

   public rjU_2 break_() {
      return (rjU_2)this.break_[1];
   }

   public void break_(boolean var1) {
      Boolean var6 = var1;
      this.break_[5] = var6;
   }

   public void break_(rjU_2 var1) {
      this.break_[1] = var1;
   }

   public boolean throws_() {
      return (Boolean)this.break_[3];
   }

   public void throws_(boolean var1) {
      Boolean var6 = var1;
      this.break_[7] = var6;
   }

   private static void finally_() {
      protected_ = new boolean[]{false, false, false, false, false, false, true};
   }

   public rjU_2 catch_() {
      return (rjU_2)this.break_[0];
   }

   private static void extends_() {
      throws_ = new byte[]{-45, 45, 45, -45, 8, 3, 4, 5, 6, 7};
   }

   public boolean case_() {
      return (Boolean)this.break_[4];
   }

   public rfl_3 implements_() {
      return (rfl_3)this.break_[2];
   }

   private static void package_() {
      case_ = new short[]{0, 0, 0, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 0, 0, 57, 57, 17, 57, 17, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   public boolean protected_() {
      return (Boolean)this.break_[7];
   }

   public void protected_(boolean var1) {
      Boolean var6 = var1;
      this.break_[4] = var6;
   }

   public boolean private_() {
      return (Boolean)this.break_[6];
   }

   private static void final_() {
      Object[] var0 = new Object[]{new rrLz_1()};
      class_ = var0;
   }

   private void volatile_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         Object[] var1 = this.break_;
         var1[3] = false;
         var1[4] = false;
         var1[5] = false;
         var1[6] = false;
         var1[7] = false;
      }
   }

   private static void native_() {
      byte_ = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F, 90.0F, 90.0F};
   }
}
