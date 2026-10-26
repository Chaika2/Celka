package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwO_2 {
   private static float[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_throws = new byte[]{3, 2, 3, 2};
   }

   private rrwO_2() {
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_protected = new short[]{0, 1, 4, 4, 0, 2, 5, 5, 1, 3};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1130893836;
   }

   public static rrwh_3 id_class(rrtN_2 var0, rrtu_3 var1, float var2, float var3, float var4, float var5) {
      float var6 = var0.id_implements();
      float var7 = var0.ao_();
      float var8 = var0.id_import();
      float[] var9 = new float[]{var2, var2 + var6 / 2.0F, var2 + var6};
      float[] var10 = new float[]{var3, var3 + var7 / 2.0F, var3 + var7};
      List var11 = id_break(var0, var1, var4, var8);
      List var12 = id_class(var0, var1, var5, var8);
      rrwh_3 var13 = new rrwh_3();
      Float var27 = var2;
      var13.id_class[0] = var27;
      Float var28 = var3;
      var13.id_class[1] = var28;
      float var14 = 5.0F;

      for (float var16 : var11) {
         for (float var20 : var9) {
            float var21 = var16 - var20;
            if (Math.abs(var21) <= 4.0F && Math.abs(var21) < Math.abs(var14)) {
               var14 = var21;
               Float var29 = var16;
               var13.id_class[4] = var29;
            }
         }
      }

      if ((Float)var13.id_class[4] != null) {
         Float var30 = var2 + var14;
         var13.id_class[0] = var30;
         Boolean var31 = true;
         var13.id_class[2] = var31;
      }

      float var35 = id_break[4];

      for (float var37 : var12) {
         for (float var41 : var10) {
            float var22 = var37 - var41;
            if (Math.abs(var22) <= 4.0F && Math.abs(var22) < Math.abs(var35)) {
               var35 = var22;
               Float var32 = var37;
               var13.id_class[5] = var32;
            }
         }
      }

      if ((Float)var13.id_class[5] != null) {
         Float var33 = var3 + var35;
         var13.id_class[1] = var33;
         Boolean var34 = true;
         var13.id_class[3] = var34;
      }

      return var13;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -101, -128, -128, -43, -70, 35, -128}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1817861102095534634L;
   }

   private static List<Float> id_class(rrtN_2 var0, rrtu_3 var1, float var2, float var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var3);
      var4.add(var2 / 2.0F);
      var4.add(var2 - var3);

      for (rrtN_2 var6 : var1.id_class()) {
         if (var6 != var0 && var6 instanceof rrvj_1 && var6.aq_()) {
            float var7 = var6.id_abstract();
            float var8 = var6.ao_();
            var4.add(var7);
            var4.add(var7 + var8 / 2.0F);
            var4.add(var7 + var8);
         }
      }

      return var4;
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true, false, true, false, true, false, true, true, false};
   }

   private static List<Float> id_break(rrtN_2 var0, rrtu_3 var1, float var2, float var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var3);
      var4.add(var2 / 2.0F);
      var4.add(var2 - var3);

      for (rrtN_2 var6 : var1.id_class()) {
         if (var6 != var0 && var6 instanceof rrvj_1 && var6.aq_()) {
            float var7 = var6.id_default();
            float var8 = var6.id_implements();
            var4.add(var7);
            var4.add(var7 + var8 / 2.0F);
            var4.add(var7 + var8);
         }
      }

      return var4;
   }

   private static void id_throws() {
      id_break = new float[]{2.0F, 2.0F, 5.0F, 4.0F, 5.0F, 4.0F, 2.0F, 2.0F, 2.0F, 2.0F, 4.0F};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{0.0F};
      id_class = var0;
   }
}
