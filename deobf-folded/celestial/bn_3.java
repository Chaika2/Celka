package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bn_3 implements bZ_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   public static Object[] id_class;
   private static byte[] id_throws;

   private static void id_byte() {
      id_protected = new float[]{0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 48, 10, -16, -66, -99, 41, -55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 661340480;
   }

   private bF_2 id_class(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var1 + 1;
      bL_2[] var7 = new bL_2[var6];

      for (int var8 = id_byte[19]; var8 < var6; var8++) {
         var7[var8] = new bL_2(var1 + var8, var3, var4);
      }

      rfl_3 var9 = new rfl_3(
         (double)((float)var1 - 0.5F + 0.5F),
         (double)((float)var3 - 0.5F + 0.5F),
         (double)((float)var4 - 0.5F + 0.5F),
         (double)((float)var2 + 0.5F + 0.5F),
         (double)((float)var3 + 0.5F + 0.5F),
         (double)((float)var4 + 0.5F + 0.5F)
      );
      return new bF_2(var9, var7, var5);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1038936609292186693L;
   }

   @Override
   public bv_3[] id_class(Ps_1 var1, rY_2 var2) {
      if (var2 == null) {
         return null;
      } else {
         rU_2 var3 = var1.id_volatile();
         rU_2 var4 = var2.id_class();
         rU_2 var5 = var2.id_protected();
         int var6 = (Integer)var4.id_break[id_break[0]];
         int var7 = (Integer)var4.id_break[1];
         int var8 = (Integer)var4.id_break[2];
         int var9 = (Integer)var5.id_break[id_break[3]];
         int var10 = (Integer)var5.id_break[2];
         int var11 = var9 - var6 + 1;
         int var12 = var10 - var8 + 1;
         int var13 = (var11 + 6 - 1) / 6;
         bv_3[] var14 = new bv_3[var13];
         byte var15 = 3;
         int var16 = var12 >> 1;
         int var17 = var6 + var15;
         int var18 = var6 + (var13 - 1) * 6 + var15;
         int var19 = var8 + var16;
         boolean var20 = var3.id_protected((double)var18, (double)var7, (double)var19) < var3.id_protected((double)var17, (double)var7, (double)var19)
            ? true
            : id_byte[6];
         int var21 = (var12 + 3 - 1) / 3;
         float var22 = 0.5F;
         float var23 = 0.5F;
         float var24 = (float)var7 - var22 + var23;
         float var25 = (float)var7 + var22 + var23;
         float var26 = (float)var8 - var22 + var23;
         float var27 = (float)var10 + var22 + var23;
         int var28;
         int var29;
         byte var30;
         if (var20) {
            var28 = var13 - 1;
            var29 = -1;
            var30 = -1;
         } else {
            var28 = id_byte[9];
            var29 = var13;
            var30 = 1;
         }

         int var31 = var28;

         for (int var32 = id_byte[11]; var31 != var29; var32++) {
            int var33 = var6 + var31 * 6;
            int var34 = Math.min(var33 + 6 - 1, var9);
            int var35 = var34 - var33 + 1;
            int var36 = (var35 + 3 - 1) / 3;
            float var37 = (float)var33 - var22 + var23;
            float var38 = (float)var34 + var22 + var23;
            bL_2[] var39 = new bL_2[var36 * var21];
            int var40 = id_byte[15];
            int var41 = var8;

            for (int var42 = id_byte[16]; var42 < var21; var42++) {
               if (var41 <= var10) {
                  int var43 = var33;

                  for (int var44 = id_byte[17]; var44 < var36; var44++) {
                     if (var43 <= var34) {
                        var39[var40++] = new bL_2(var43, var7, var41);
                     }

                     var43 += 3;
                  }
               }

               var41 += 3;
            }

            if (var40 < var39.length) {
               var39 = Arrays.copyOf(var39, var40);
            }

            rfl_3 var45 = new rfl_3((double)var37, (double)var24, (double)var26, (double)var38, (double)var25, (double)var27);
            bF_2 var46 = this.id_class(var33, var34, var7, var8, var32);
            bF_2 var47 = this.id_class(var33, var34, var7, var10, var32);
            var14[var31] = new bA_2(var45, var39, var32, var46, var47);
            var31 += var30;
         }

         return var14;
      }
   }

   private static void id_class() {
      id_break = new short[]{0, 1, 2, 0, 2};
   }

   private static void id_break() {
      id_throws = new byte[]{6, 6, 3, 6, 3, 3, -1, -1, 6, 6, 3, 3, 3, 6, 3, 2, 3};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{6, 3, 3};
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new boolean[]{
         true, true, true, true, true, true, false, true, true, false, true, false, true, true, true, false, false, false, true, false, false, true
      };
   }
}
