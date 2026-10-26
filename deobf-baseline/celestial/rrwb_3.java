package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwb_3 {
   public static Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static String[] id_case;

   private static void id_byte() {
      id_break = new short[]{0, 0, 4, 4, 0, 5, 5, 0, 12, 230, 200, 230, 200};
   }

   private rrwb_3() {
   }

   static {
      ntfClinit();
   }

   private static void id_class(Ml_1 var0, rrtN_2 var1) {
      rrws_3 var2 = var1.id_short();
      if (var2.id_class()) {
         float var3 = var2.id_byte();
         float var4 = var2.id_throws();
         float var5 = var2.id_extends();
         float var6 = var2.id_private();
         float var7 = ((AnimValue)id_class[id_break[8]]).id_final();
         int var8 = (int)(id_protected[14] + id_protected[15] * var7);
         rrfD_2.id_class(var0, var3, var4, var5, var6, ColorHelper.id_break(rrZF.d_, var8));
         float var9 = Math.min(Math.max(Math.min(var5, var6) * id_protected[16], id_protected[17]), id_protected[18]);
         float var10 = id_protected[19];
         int var11 = ColorHelper.id_break(rrZF.d_, id_break[9]);
         rrfD_2.id_class(var0, var3, var4, var9, var10, var11);
         rrfD_2.id_class(var0, var3, var4, var10, var9, var11);
         rrfD_2.id_class(var0, var3 + var5 - var9, var4, var9, var10, var11);
         rrfD_2.id_class(var0, var3 + var5 - var10, var4, var10, var9, var11);
         rrfD_2.id_class(var0, var3, var4 + var6 - var10, var9, var10, var11);
         rrfD_2.id_class(var0, var3, var4 + var6 - var9, var10, var9, var11);
         rrfD_2.id_class(var0, var3 + var5 - var9, var4 + var6 - var10, var9, var10, var11);
         rrfD_2.id_class(var0, var3 + var5 - var10, var4 + var6 - var9, var10, var9, var11);
         float var12 = var3 + var5 / id_protected[20];
         float var13 = var4 + var6 / id_protected[21];
         int var14 = ColorHelper.id_break(rrZF.d_, id_break[10]);
         rrfD_2.id_class(var0, var12 - id_protected[22], var13 - id_protected[23], id_protected[24], id_protected[25], var14);
         rrfD_2.id_class(var0, var12 - id_protected[26], var13 - id_protected[27], id_protected[28], id_protected[29], var14);
      }
   }

   public static void id_class(Ml_1 var0, rrtu_3 var1, float var2, float var3) {
      rrtN_2 var4 = id_class(var1);
      if (var4 != null) {
         rrwh_3 var5 = var4.id_short().id_implements();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         rrfD_2.id_throws(MinecraftAccessor.id_strictfp);
         if (var5 != null) {
            id_class(var0, var5, var2, var3);
         }

         id_class(var0, var4);
         rrfD_2.id_break();
         if (var4 instanceof rrvj_1 var6 && var6.id_return().id_byte() > id_protected[5]) {
            return;
         }

         float var7;
         float var8;
         rrZO var11;
         String var10000;
         label22: {
            var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[1]]).id_implements();
            var7 = var4.id_default() + var4.id_implements() / id_protected[6];
            var8 = var4.id_abstract() - var4.au_() - id_protected[7];
            if (var4 instanceof rrvj_1 var10 && var10.id_continue()) {
               var10000 = id_case[0];
               break label22;
            }

            var10000 = id_case[1];
         }

         String var9 = var10000;
         var11.id_byte(var0, var9, var7, var8, rrZF.d_, id_throws[1]);
      }
   }

   private static rrtN_2 id_class(rrtu_3 var0) {
      for (rrtN_2 var2 : var0.id_class()) {
         if (var2 instanceof rrvj_1 && var2.id_short().id_catch()) {
            return var2;
         }
      }

      return null;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -672057470;
   }

   private static void id_class(Ml_1 var0, rrwh_3 var1, float var2, float var3) {
      if ((Float)var1.id_class[id_break[2]] != null) {
         rrfD_2.id_class(var0, (Float)var1.id_class[id_break[3]] - id_protected[8], id_protected[9], id_protected[10], var3, (Integer)id_class[id_break[4]]);
      }

      if ((Float)var1.id_class[id_break[5]] != null) {
         rrfD_2.id_class(var0, id_protected[11], (Float)var1.id_class[id_break[6]] - id_protected[12], var2, id_protected[13], (Integer)id_class[id_break[7]]);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3868675602288975437L;
   }

   public static void id_class(Ml_1 var0, rrtu_3 var1) {
      rrZO var2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[0]]).id_implements();

      for (rrtN_2 var4 : var1.id_class()) {
         if (var4 instanceof rrvj_1) {
            rrvj_1 var5 = (rrvj_1)var4;
            if (var4.aq_()) {
               var5.id_else();
               float var6 = var5.id_return().id_byte();
               float var7 = var5.id_long();
               if (!(var6 <= id_protected[0]) && !(var7 <= id_protected[1]) && var5.id_break() != null) {
                  int var8 = (int)(var6 * var7 * id_protected[2]);
                  int var9 = ColorHelper.id_break(rrZF.d_, var8);
                  float var10 = var4.id_default() + var4.id_implements() / id_protected[3];
                  float var11 = var4.id_abstract() - var4.au_() - id_protected[4];
                  var2.id_byte(var0, var5.id_break(), var10, var11, var9, id_throws[0]);
               }
            }
         }
      }
   }

   private static void id_class() {
      id_byte = new byte[]{7, 12, 16, 2, 30, 3, 80, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 22, 124, 46, -108, -103, 18, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{
         -1315861, 0.0F, 30, 80, 230, 200, 0.0F, -0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new AnimValue(0.25F, false), id_case[2], id_case[3], 0.0F
      };
      id_class = var0;
   }

   private static void id_throws() {
      id_throws = new boolean[]{false, false, false, false, false, false, true};
   }

   private static void id_case() {
      id_case = new String[]{
         new String("ПКМ - Отключить центрирование"),
         new String("ПКМ - Включить центрирование"),
         new String("ПКМ - Включить центрирование"),
         new String("ПКМ - Отключить центрирование")
      };
   }

   private static void id_protected() {
      id_protected = new float[]{
         0.0F,
         0.0F,
         255.0F,
         2.0F,
         8.0F,
         0.01F,
         2.0F,
         8.0F,
         0.25F,
         0.0F,
         0.5F,
         0.0F,
         0.25F,
         0.5F,
         30.0F,
         50.0F,
         0.18F,
         6.0F,
         18.0F,
         1.0F,
         2.0F,
         2.0F,
         2.5F,
         0.5F,
         5.0F,
         1.0F,
         0.5F,
         2.5F,
         1.0F,
         5.0F,
         0.25F,
         0.5F,
         1.0F,
         0.18F,
         6.0F,
         18.0F,
         2.5F,
         1.0F,
         8.0F
      };
   }
}
