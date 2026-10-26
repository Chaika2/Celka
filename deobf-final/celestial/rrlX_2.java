package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlX_2 implements MinecraftAccessor {
   private static double[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   public Object[] class_;
   private static float[] case_;

   public double byte_() {
      return (Double)this.class_[1];
   }

   public rrlX_2(Strafe var1) {
      this.finally_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void class_(int var1) {
      Integer var6 = var1;
      this.class_[4] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7582180784691737228L;
   }

   public float class_(rrLz_1 var1) {
      boolean var2 = ((cb_3)import_.class_[57]).BL();
      boolean var3 = var1.throws_();
      boolean var4 = var1.catch_().byte_ > 0.0 ? true : byte_[4];
      float var5 = this.class_((cb_3)import_.class_[57]);
      float var6 = this.class_((cb_3)import_.class_[57], var1);
      float var7 = 0.91F;
      if (var2) {
         var7 = var6;
      }

      float var8 = case_[1] / (var7 * var7 * var7);
      float var9;
      if (var2) {
         var9 = var5 * var8;
         if (var4) {
            var9 += 0.2F;
         }
      } else {
         var9 = var1.throws_() ? 0.0269F : case_[4];
      }

      boolean var10 = byte_[5];
      float var11 = (float)((Double)this.class_[1] + (double)var9);
      if (((cb_3)import_.class_[57]).return_() && !var4) {
         double var12 = (double)var9 * 0.5 + 0.005F;
         double var14 = var1.catch_().byte_;
         if (var14 != 0.0 && Math.abs(var14) < 0.08) {
            var12 += 0.055;
         }

         if ((double)var11 > Math.max(0.043, var12)) {
            var10 = true;
            Integer var20 = (Integer)this.class_[5] + 1;
            this.class_[5] = var20;
         } else {
            Integer var21 = Math.max((Integer)this.class_[5] - 1, 0);
            this.class_[5] = var21;
         }
      } else {
         Integer var22 = 0;
         this.class_[5] = var22;
      }

      if (((cb_3)import_.class_[57]).return_() && !((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_ && var2) {
         float var26 = (1.0F - ((cb_3)import_.class_[57]).sB()) * 0.9F;
         var26 += 0.02F;
         if ((Float)((cb_3)import_.class_[57]).private_[42] != 0.0F || ((rqr_3)((cb_3)import_.class_[57]).break_[17]).throws_) {
            var26 *= 0.9F;
         }

         var11 *= var26;
      }

      if ((Integer)this.class_[5] > 3) {
         var11 -= 0.019F;
      } else if (!(Boolean)((cb_3)import_.class_[57]).throws_[23]) {
         float var10000 = Math.max(var10 ? 0.0F : case_[12], var11);
         int var10003 = (Integer)this.class_[4];
         Integer var23 = var10003 + 1;
         this.class_[4] = var23;
         var11 = var10000 - (var10003 % 2 == 0 ? 0.001F : case_[14]);
      }

      Double var24 = (double)var7;
      this.class_[2] = var24;
      if (!var3 && !var2) {
         Boolean var25 = true;
         this.class_[3] = var25;
         ((Strafe)this.class_[0]).case_(!((cb_3)import_.class_[57]).break_[13] ? true : byte_[14]);
      }

      if (var3 && var2) {
         ((Strafe)this.class_[0]).case_(false);
      }

      return var11;
   }

   public void class_(double var1) {
      Double var7 = var1;
      this.class_[1] = var7;
   }

   public void class_(rrAo_1 var1) {
      if ((Boolean)this.class_[3]) {
         var1.protected_(!((cb_3)import_.class_[57]).break_[13] ? true : byte_[1]);
         Boolean var6 = false;
         this.class_[3] = var6;
      }
   }

   public void class_(rrLW var1) {
      Double var6 = var1.class_() * (Double)this.class_[2];
      this.class_[1] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -119, -25, 54, 99, -64, -28, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[3] = var6;
   }

   private float class_(rhd_3 var1) {
      boolean var2 = var1.PF();
      var1.c_(false);
      float var3 = var1.sB() * 1.3F;
      var1.c_(var2);
      return var3;
   }

   public int class_() {
      return (Integer)this.class_[5];
   }

   private float class_(rhd_3 var1, rrLz_1 var2) {
      rfw_3 var3 = new rfw_3(var2.break_().break_, var2.implements_().break_ - 1.0, var2.break_().byte_);
      return ((rYB)var1.throws_[7]).byte_(var3).break_().final_() * 0.91F;
   }

   public void break_(double var1) {
      Double var7 = var1;
      this.class_[2] = var7;
   }

   public boolean break_() {
      return (Boolean)this.class_[3];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 182717284;
   }

   private static void throws_() {
      break_ = new double[]{0.0, 0.5, 0.005F, 0.0, 0.08, 0.055, 0.043, 1.0, 0.0, 0.0};
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[1] = 0.0;
         this.class_[2] = 0.0;
         this.class_[3] = false;
         this.class_[4] = 0;
         this.class_[5] = 0;
      }
   }

   private static void catch_() {
      protected_ = new byte[]{3, 2, 6, 2, 3, 4, 5};
   }

   private static void case_() {
      case_ = new float[]{0.91F, 0.16277136F, 0.2F, 0.0269F, 0.0255F, 1.0F, 0.9F, 0.02F, 0.0F, 0.9F, 0.019F, 0.0F, 0.05F, 0.001F, 0.002F, 1.3F, 0.91F};
   }

   private static void implements_() {
      throws_ = new short[]{
         0,
         2,
         1,
         3,
         57,
         13,
         3,
         57,
         57,
         57,
         1,
         57,
         5,
         5,
         5,
         5,
         5,
         57,
         57,
         17,
         57,
         57,
         42,
         57,
         17,
         5,
         57,
         23,
         4,
         4,
         2,
         3,
         0,
         57,
         13,
         0,
         7,
         1,
         2,
         1,
         2,
         3,
         3,
         4,
         5
      };
   }

   public double protected_() {
      return (Double)this.class_[2];
   }

   private static void private_() {
      byte_ = new boolean[]{
         true, false, false, true, false, false, true, true, true, false, false, true, true, true, false, false, false, true, false, false, false
      };
   }
}
