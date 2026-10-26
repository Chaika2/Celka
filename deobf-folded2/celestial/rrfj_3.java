package celestial;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfj_3 implements MinecraftAccessor {
   private static byte[] id_class;
   private static double[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;

   public static double id_byte() {
      float var0 = (Float)((cb_3)id_import.id_class[57]).id_break[45];
      float var1 = 1.0F;
      if ((Float)((cb_3)id_import.id_class[57]).id_private[44] < 0.0F) {
         var0 += 180.0F;
      }

      if ((Float)((cb_3)id_import.id_class[57]).id_private[44] < 0.0F) {
         var1 = -0.5F;
      } else if ((Float)((cb_3)id_import.id_class[57]).id_private[44] > 0.0F) {
         var1 = 0.5F;
      }

      if ((Float)((cb_3)id_import.id_class[57]).id_private[42] > 0.0F) {
         var0 -= 90.0F * var1;
      }

      if ((Float)((cb_3)id_import.id_class[57]).id_private[42] < 0.0F) {
         var0 += 90.0F * var1;
      }

      return Math.toRadians((double)var0);
   }

   static {
      ntfClinit();
   }

   public static void id_class(rrAO var0, rjU_2 var1, float var2) {
      double var3 = var1.id_break - ((cb_3)id_import.id_class[57]).rx();
      double var5 = var1.id_protected - ((cb_3)id_import.id_class[57]).BO();
      double var7 = Math.toDegrees(Math.atan2(var5, var3)) - 90.0;
      id_class(var0, var7, var2);
   }

   public static void id_class(rrAO var0, an_3 var1, boolean var2, float var3, float var4) {
      rjU_2 var5 = var1.Ps();
      double var6 = var5.id_break - ((cb_3)id_import.id_class[57]).rx();
      double var8 = var5.id_protected - ((cb_3)id_import.id_class[57]).BO();
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      double var12 = Math.toDegrees(Math.atan2(var8, var6)) - 90.0;
      if (var2 && var10 < (double)var3) {
         var12 = (double)((Float)var1.id_throws[15] + 180.0F);
      }

      id_class(var0, var12, var4);
   }

   public static float id_class(AtomicReference<Float> var0) {
      rdn_3 var1 = ((cb_3)id_import.id_class[57]).Sn();
      var1.id_class(rXQ.OFFHAND).forEach((var1x, var2) -> var0.updateAndGet(var1xx -> var1xx * (float)(1.0 + var2.id_protected())));
      return (Float)var0.get();
   }

   public static void id_class(rrAO var0, float var1, float var2) {
      float var3 = var0.id_catch();
      float var4 = var0.id_throws();
      double var5 = rfU_2.id_case(Math.toDegrees(id_class(var2, (double)var3, (double)var4)));
      if (var3 != 0.0F || var4 != 0.0F) {
         float var7 = id_protected[36];
         float var8 = 0.0F;
         float var9 = Float.MAX_VALUE;

         for (float var10 = -1.0F; var10 <= 1.0F; var10++) {
            for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
               double var12;
               if ((var11 != 0.0F || var10 != 0.0F)
                  && (var12 = Math.abs(var5 - rfU_2.id_case(Math.toDegrees(id_class(var1, (double)var10, (double)var11))))) < (double)var9) {
                  var9 = (float)var12;
                  var7 = var10;
                  var8 = var11;
               }
            }
         }

         var0.id_break(var7);
         var0.id_class(var8);
      }
   }

   public static void id_class(float var0, boolean var1) {
      ((cb_3)id_import.id_class[57]).id_byte(((cb_3)id_import.id_class[57]).rv().id_throws((double)var0, var1 ? (double)var0 : id_break[3], (double)var0));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4679095994890031329L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 758215353;
   }

   public static void id_class(rrLz_1 var0, float var1) {
      if (id_catch()) {
         rjU_2 var2 = var0.id_catch();
         float var3 = (float)id_byte();
         var2.id_break = -Math.sin((double)var3) * (double)var1;
         var2.id_protected = Math.cos((double)var3) * (double)var1;
      }
   }

   private static void id_class(rrAO var0, double var1, float var3) {
      var1 = rfU_2.id_case(var1);
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = Float.MAX_VALUE;

      for (float var7 = -1.0F; var7 <= 1.0F; var7++) {
         for (float var8 = -1.0F; var8 <= 1.0F; var8++) {
            if (var7 != 0.0F || var8 != 0.0F) {
               double var9 = Math.toDegrees(id_class(var3, (double)var7, (double)var8));
               double var11 = Math.abs(var1 - rfU_2.id_case(var9));
               if (var11 < (double)var6) {
                  var6 = (float)var11;
                  var4 = var7;
                  var5 = var8;
               }
            }
         }
      }

      var0.id_break(var4);
      var0.id_class(var5);
   }

   public static float id_class() {
      return ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private
         ? 1.0F
         : (((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_implements ? -1.0F : id_protected[15]);
   }

   public static void id_class(boolean var0) {
      ((cb_3)id_import.id_class[57]).id_catch(0.0, var0 ? 0.0 : ((cb_3)id_import.id_class[57]).rv().id_byte, id_break[2]);
   }

   public static void id_class(float var0) {
      float var1 = ((cb_3)id_import.id_class[57]).sO();
      float var2 = ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_byte;
      float var3 = ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_break;
      if (var2 != 0.0F) {
         if (var3 > 0.0F) {
            var1 += (float)(var2 > 0.0F ? -45 : id_class[1]);
         } else if (var3 < 0.0F) {
            var1 += (float)(var2 > 0.0F ? 45 : id_class[3]);
         }

         var3 = id_protected[5];
         if (var2 > 0.0F) {
            var2 = 1.0F;
         } else if (var2 < 0.0F) {
            var2 = -1.0F;
         }
      }

      double var4 = (double)rfU_2.id_break(rrfQ_2.id_class(var1 + 90.0F));
      double var6 = (double)rfU_2.id_class(rrfQ_2.id_class(var1 + 90.0F));
      ((cb_3)id_import.id_class[57])
         .id_catch(
            (double)(var2 * var0) * var4 + (double)(var3 * var0) * var6,
            ((cb_3)id_import.id_class[57]).rv().id_byte,
            (double)(var2 * var0) * var6 - (double)(var3 * var0) * var4
         );
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{119, 65, -85, 13, 78, -78, 58, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static double id_class(float var0, double var1, double var3) {
      if (var1 < 0.0) {
         var0 += 180.0F;
      }

      float var5 = id_protected[29];
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

   public static boolean id_break(boolean var0) {
      return !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_protected()
            && (!var0 || !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private)
         ? id_byte[2]
         : id_byte[1];
   }

   public static float id_break() {
      rjU_2 var0 = ((cb_3)id_import.id_class[57]).rv();
      return rfU_2.id_class(var0.id_break * var0.id_break + var0.id_protected * var0.id_protected);
   }

   public static boolean id_throws() {
      return !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private && ((cb_3)id_import.id_class[57]).BL() ? true : id_byte[6];
   }

   private static void id_finally() {
      id_class = new byte[]{-45, 45, 45, -45, 6};
   }

   public static boolean id_catch() {
      return id_break(false);
   }

   private static void id_extends() {
      id_protected = new float[]{
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

   public static float id_case() {
      return (float)Math.round(
            Math.hypot(
                  ((cb_3)id_import.id_class[57]).rx() - (Double)((cb_3)id_import.id_class[57]).id_throws[8],
                  ((cb_3)id_import.id_class[57]).BO() - (Double)((cb_3)id_import.id_class[57]).id_throws[10]
               )
               * (double)((rqw_3)id_import.id_class[6]).id_class()
               * 20.0
               * 100.0
         )
         / 100.0F;
   }

   private static void id_implements() {
      id_byte = new boolean[]{false, true, false, true, false, true, false};
   }

   public static boolean id_protected() {
      return ((cb_3)id_import.id_class[57]).id_private[44] >= 0.8F
            && !((cb_3)id_import.id_class[57]).id_throws[23]
            && (((cb_3)id_import.id_class[57]).sk().id_class() > 6 || ((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_byte)
            && !((cb_3)id_import.id_class[57]).id_break(rLD.id_package)
            && !((cb_3)id_import.id_class[57]).sL()
            && !((cb_3)id_import.id_class[57]).h()
         ? true
         : id_byte[4];
   }

   private static void id_private() {
      id_throws = new short[]{
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

   private static void id_native() {
      id_break = new double[]{0.0, 0.0, 0.0, 1.0, 20.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 90.0, 90.0, 1.0};
   }
}
