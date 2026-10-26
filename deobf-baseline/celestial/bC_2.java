package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bC_2 implements bZ_2 {
   private static boolean[] id_class;
   private static short[] id_break;
   private static double[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      id_byte = new double[]{0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 553227917;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7143708061469298091L;
   }

   private static void id_class() {
      id_protected = new byte[]{2, 2};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, -62, 80, -102, -11, -68, -116, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public bv_3[] id_class(Ps_1 var1, rY_2 var2) {
      if (var2 == null) {
         return null;
      } else {
         rU_2 var3 = var1.id_volatile();
         rU_2 var4 = var2.id_class();
         rU_2 var5 = var2.id_protected();
         int var6 = (Integer)var5.id_break[id_break[0]] - (Integer)var4.id_break[id_break[1]] + id_class[0];
         int var7 = (Integer)var5.id_break[id_break[2]] - (Integer)var4.id_break[id_break[3]] + id_class[1];
         boolean var8 = var6 >= var7 ? id_class[2] : id_class[3];
         int var9 = var8 ? var7 : var6;
         int var10 = var8 ? var6 : var7;
         int var11 = (Integer)var4.id_break[id_break[4]];
         int var12 = var8 ? (Integer)var4.id_break[id_break[5]] + var6 / id_protected[0] : (Integer)var4.id_break[id_break[6]];
         int var13 = var8 ? (Integer)var4.id_break[id_break[7]] : (Integer)var4.id_break[id_break[8]] + var7 / id_protected[1];
         int var14 = var8 ? var12 : (Integer)var4.id_break[id_break[9]] + var6 - id_class[4];
         int var15 = var8 ? (Integer)var4.id_break[id_break[10]] + var7 - id_class[5] : var13;
         double var16 = var3.id_protected((double)var12, (double)var11, (double)var13);
         double var18 = var3.id_protected((double)var14, (double)var11, (double)var15);
         boolean var20 = var18 < var16 ? id_class[6] : id_class[7];
         bv_3[] var21 = new bv_3[var9];
         bL_2[] var22 = new bL_2[var10];

         for (int var23 = id_class[8]; var23 < var9; var23++) {
            int var24 = var20 ? var9 - id_class[9] - var23 : var23;
            if (var8) {
               int var27 = (Integer)var4.id_break[id_break[11]] + var24;

               for (int var28 = id_class[10]; var28 < var10; var28++) {
                  var22[var28] = new bL_2((Integer)var4.id_break[id_break[12]] + var28, var11, var27);
               }

               var21[var23] = new bF_2(
                  new rfl_3(
                        (double)((Integer)var4.id_break[id_break[13]]).intValue(),
                        (double)var11,
                        (double)var27,
                        (double)((Integer)var5.id_break[id_break[14]]).intValue(),
                        (double)var11,
                        (double)var27
                     )
                     .id_class(id_byte[0])
                     .id_protected(id_byte[1], id_byte[2], id_byte[3]),
                  (bL_2[])var22.clone(),
                  var23
               );
            } else {
               int var25 = (Integer)var4.id_break[id_break[15]] + var24;

               for (int var26 = id_class[11]; var26 < var10; var26++) {
                  var22[var26] = new bL_2(var25, var11, (Integer)var4.id_break[id_break[16]] + var26);
               }

               var21[var23] = new bF_2(
                  new rfl_3(
                        (double)var25,
                        (double)var11,
                        (double)((Integer)var4.id_break[id_break[17]]).intValue(),
                        (double)var25,
                        (double)var11,
                        (double)((Integer)var5.id_break[id_break[18]]).intValue()
                     )
                     .id_class(id_byte[4])
                     .id_protected(id_byte[5], id_byte[6], id_byte[7]),
                  (bL_2[])var22.clone(),
                  var23
               );
            }
         }

         return var21;
      }
   }

   private static void id_break() {
      id_class = new boolean[]{true, true, true, false, true, true, true, false, false, true, false, false};
   }

   private static void id_protected() {
      id_break = new short[]{0, 0, 2, 2, 1, 0, 0, 2, 2, 0, 2, 2, 0, 0, 0, 0, 2, 2, 2};
   }
}
