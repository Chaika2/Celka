package celestial;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfj_3 implements MinecraftAccessor {
   private static byte[] class_;
   private static double[] break_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static short[] throws_;

   public static double byte_() {
      float var0 = (Float)((cb_3)import_.class_[57]).break_[45];
      float var1 = 1.0F;
      if ((Float)((cb_3)import_.class_[57]).private_[44] < 0.0F) {
         var0 += 180.0F;
      }

      if ((Float)((cb_3)import_.class_[57]).private_[44] < 0.0F) {
         var1 = -0.5F;
      } else if ((Float)((cb_3)import_.class_[57]).private_[44] > 0.0F) {
         var1 = 0.5F;
      }

      if ((Float)((cb_3)import_.class_[57]).private_[42] > 0.0F) {
         var0 -= 90.0F * var1;
      }

      if ((Float)((cb_3)import_.class_[57]).private_[42] < 0.0F) {
         var0 += 90.0F * var1;
      }

      return Math.toRadians((double)var0);
   }

   static {
      ntfClinit();
   }

   public static void class_(rrAO var0, rjU_2 var1, float var2) {
      double var3 = var1.break_ - ((cb_3)import_.class_[57]).rx();
      double var5 = var1.protected_ - ((cb_3)import_.class_[57]).BO();
      double var7 = Math.toDegrees(Math.atan2(var5, var3)) - 90.0;
      class_(var0, var7, var2);
   }

   public static void class_(rrAO var0, an_3 var1, boolean var2, float var3, float var4) {
      rjU_2 var5 = var1.Ps();
      double var6 = var5.break_ - ((cb_3)import_.class_[57]).rx();
      double var8 = var5.protected_ - ((cb_3)import_.class_[57]).BO();
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      double var12 = Math.toDegrees(Math.atan2(var8, var6)) - 90.0;
      if (var2 && var10 < (double)var3) {
         var12 = (double)((Float)var1.throws_[15] + 180.0F);
      }

      class_(var0, var12, var4);
   }

   public static float class_(AtomicReference<Float> var0) {
      rdn_3 var1 = ((cb_3)import_.class_[57]).Sn();
      var1.class_(rXQ.OFFHAND).forEach((var1x, var2) -> var0.updateAndGet(var1xx -> var1xx * (float)(1.0 + var2.protected_())));
      return (Float)var0.get();
   }

   public static void class_(rrAO var0, float var1, float var2) {
      float var3 = var0.catch_();
      float var4 = var0.throws_();
      double var5 = rfU_2.case_(Math.toDegrees(class_(var2, (double)var3, (double)var4)));
      if (var3 != 0.0F || var4 != 0.0F) {
         float var7 = protected_[36];
         float var8 = 0.0F;
         float var9 = Float.MAX_VALUE;

         for (float var10 = -1.0F; var10 <= 1.0F; var10++) {
            for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
               double var12;
               if ((var11 != 0.0F || var10 != 0.0F)
                  && (var12 = Math.abs(var5 - rfU_2.case_(Math.toDegrees(class_(var1, (double)var10, (double)var11))))) < (double)var9) {
                  var9 = (float)var12;
                  var7 = var10;
                  var8 = var11;
               }
            }
         }

         var0.break_(var7);
         var0.class_(var8);
      }
   }

   public static void class_(float var0, boolean var1) {
      ((cb_3)import_.class_[57]).byte_(((cb_3)import_.class_[57]).rv().throws_((double)var0, var1 ? (double)var0 : break_[3], (double)var0));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4679095994890031329L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 758215353;
   }

   public static void class_(rrLz_1 var0, float var1) {
      if (catch_()) {
         rjU_2 var2 = var0.catch_();
         float var3 = (float)byte_();
         var2.break_ = -Math.sin((double)var3) * (double)var1;
         var2.protected_ = Math.cos((double)var3) * (double)var1;
      }
   }

   private static void class_(rrAO var0, double var1, float var3) {
      var1 = rfU_2.case_(var1);
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = Float.MAX_VALUE;

      for (float var7 = -1.0F; var7 <= 1.0F; var7++) {
         for (float var8 = -1.0F; var8 <= 1.0F; var8++) {
            if (var7 != 0.0F || var8 != 0.0F) {
               double var9 = Math.toDegrees(class_(var3, (double)var7, (double)var8));
               double var11 = Math.abs(var1 - rfU_2.case_(var9));
               if (var11 < (double)var6) {
                  var6 = (float)var11;
                  var4 = var7;
                  var5 = var8;
               }
            }
         }
      }

      var0.break_(var4);
      var0.class_(var5);
   }

   public static float class_() {
      return ((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_
         ? 1.0F
         : (((rqr_3)((cb_3)import_.class_[57]).break_[17]).implements_ ? -1.0F : protected_[15]);
   }

   public static void class_(boolean var0) {
      ((cb_3)import_.class_[57]).catch_(0.0, var0 ? 0.0 : ((cb_3)import_.class_[57]).rv().byte_, break_[2]);
   }

   public static void class_(float var0) {
      float var1 = ((cb_3)import_.class_[57]).sO();
      float var2 = ((rqr_3)((cb_3)import_.class_[57]).break_[17]).byte_;
      float var3 = ((rqr_3)((cb_3)import_.class_[57]).break_[17]).break_;
      if (var2 != 0.0F) {
         if (var3 > 0.0F) {
            var1 += (float)(var2 > 0.0F ? -45 : class_[1]);
         } else if (var3 < 0.0F) {
            var1 += (float)(var2 > 0.0F ? 45 : class_[3]);
         }

         var3 = protected_[5];
         if (var2 > 0.0F) {
            var2 = 1.0F;
         } else if (var2 < 0.0F) {
            var2 = -1.0F;
         }
      }

      double var4 = (double)rfU_2.break_(rrfQ_2.class_(var1 + 90.0F));
      double var6 = (double)rfU_2.class_(rrfQ_2.class_(var1 + 90.0F));
      ((cb_3)import_.class_[57])
         .catch_(
            (double)(var2 * var0) * var4 + (double)(var3 * var0) * var6,
            ((cb_3)import_.class_[57]).rv().byte_,
            (double)(var2 * var0) * var6 - (double)(var3 * var0) * var4
         );
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 65, -85, 13, 78, -78, 58, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static double class_(float var0, double var1, double var3) {
      if (var1 < 0.0) {
         var0 += 180.0F;
      }

      float var5 = protected_[29];
      if (var1 < 0.0) {
         var5 = -0.5F;
      } else if (var1 > 0.0) {
         var5 = 0.5F;
      }

      if (var3 > 0.0) {
         var0 -= 90.0F * var5;
      } else if (var3 < 0.0) {
         var0 += 90.0F * var5;
      }

      return Math.toRadians((double)var0);
   }

   public static boolean break_(boolean var0) {
      return !((rqr_3)((cb_3)import_.class_[57]).break_[17]).protected_() && (!var0 || !((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_)
         ? byte_[2]
         : byte_[1];
   }

   public static float break_() {
      rjU_2 var0 = ((cb_3)import_.class_[57]).rv();
      return rfU_2.class_(var0.break_ * var0.break_ + var0.protected_ * var0.protected_);
   }

   public static boolean throws_() {
      return !((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_ && ((cb_3)import_.class_[57]).BL() ? true : byte_[6];
   }

   private static void finally_() {
      class_ = new byte[]{-45, 45, 45, -45, 6};
   }

   public static boolean catch_() {
      return break_(false);
   }

   private static void extends_() {
      protected_ = new float[]{
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         -1.0F,
         90.0F,
         90.0F,
         0.8F,
         1.0F,
         -1.0F,
         0.0F,
         100.0F,
         1.0F,
         0.0F,
         180.0F,
         0.0F,
         -0.5F,
         0.0F,
         0.5F,
         0.0F,
         90.0F,
         0.0F,
         90.0F,
         180.0F,
         1.0F,
         -0.5F,
         0.5F,
         90.0F,
         90.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         Float.MAX_VALUE,
         -1.0F,
         1.0F,
         -1.0F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         180.0F,
         0.0F,
         0.0F,
         Float.MAX_VALUE,
         -1.0F,
         1.0F,
         -1.0F,
         1.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F
      };
   }

   public static float case_() {
      return (float)Math.round(
            Math.hypot(
                  ((cb_3)import_.class_[57]).rx() - (Double)((cb_3)import_.class_[57]).throws_[8],
                  ((cb_3)import_.class_[57]).BO() - (Double)((cb_3)import_.class_[57]).throws_[10]
               )
               * (double)((rqw_3)import_.class_[6]).class_()
               * 20.0
               * 100.0
         )
         / 100.0F;
   }

   private static void implements_() {
      byte_ = new boolean[]{false, true, false, true, false, true, false};
   }

   public static boolean protected_() {
      return ((cb_3)import_.class_[57]).private_[44] >= 0.8F
            && !((cb_3)import_.class_[57]).throws_[23]
            && (((cb_3)import_.class_[57]).sk().class_() > 6 || ((rhx_3)((cb_3)import_.class_[57]).implements_[18]).byte_)
            && !((cb_3)import_.class_[57]).break_(rLD.package_)
            && !((cb_3)import_.class_[57]).sL()
            && !((cb_3)import_.class_[57]).h()
         ? true
         : byte_[4];
   }

   private static void private_() {
      throws_ = new short[]{
         57,
         57,
         17,
         57,
         17,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         17,
         57,
         17,
         57,
         44,
         57,
         23,
         57,
         57,
         18,
         57,
         57,
         57,
         57,
         17,
         57,
         17,
         57,
         57,
         57,
         8,
         57,
         57,
         10,
         6,
         57,
         17,
         57,
         57,
         45,
         57,
         44,
         57,
         44,
         57,
         44,
         57,
         42,
         57,
         42,
         57,
         57,
         57,
         57,
         15
      };
   }

   private static void native_() {
      break_ = new double[]{0.0, 0.0, 0.0, 1.0, 20.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 90.0, 90.0, 1.0};
   }
}
