package celestial;

import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrfa_3 implements MinecraftAccessor {
   private static short[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static float[] id_throws;
   private static int[] id_case;

   private static void id_byte() {
      id_break = new short[]{255, 255, 255, 255, 57, 16, 57, 0, 3089, 1, 3088, 1, 1, 1, 1, 1, 3089};
   }

   static {
      ntfClinit();
   }

   public static void id_class(rjV_2 var0, rjV_2 var1, float var2) {
      rjV_2 var3 = new rjV_2(var0);
      var3.id_throws();
      rjV_2 var4 = new rjV_2(var1);
      var4.id_throws();
      rji_3 var5 = new rji_3(0.0F, 0.0F, 0.0F, 1.0F);
      var5.id_class(var3);
      var5.id_class(var4);
      var5.id_class(var5.id_protected());
      rjU_2 var6 = (cb_3)id_import.id_class[57] == null ? ((Hh_1)id_import.id_class[16]).id_finally().id_break() : ((cb_3)id_import.id_class[57]).id_new(var2);
      rjU_2 var11 = new rjU_2(var6.id_break + (double)var5.id_class(), var6.id_byte + (double)var5.id_break(), var6.id_protected + (double)var5.id_byte());
      id_class[0] = var11;
   }

   public static rji_3 id_class(rjV_2 var0, an_3 var1, float var2) {
      float var3 = var1.Bd();
      float var4 = var1.Bm();
      float var5 = (float)rrjZ_2.id_throws(var1, var2);
      float var6 = (float)rrjZ_2.id_private(var1, var2);
      float var7 = (float)rrjZ_2.id_class(var1, var2);
      if (var1.BC() == aI_2.id_short) {
         var6 = var1.id_extends(var2);
      }

      float var8 = var5 - var3;
      float var9 = var7 - var3;
      float var10 = var5 + var3;
      float var11 = var6 + var4;
      float var12 = var7 + var3;
      float var13 = var0.id_class;
      float var14 = var0.id_break;
      float var15 = var0.id_byte;
      float var16 = var0.id_protected;
      float var17 = var0.id_throws;
      float var18 = var0.id_case;
      float var19 = var0.id_catch;
      float var20 = var0.id_private;
      float var21 = var0.id_volatile;
      float var22 = var0.id_final;
      float var23 = var0.id_package;
      float var24 = var0.id_int;
      float var25 = (var8 + var10) * 0.5F;
      float var26 = (var6 + var11) * 0.5F;
      float var27 = (var9 + var12) * 0.5F;
      float var28 = (var10 - var8) * 0.5F;
      float var29 = (var11 - var6) * 0.5F;
      float var30 = (var12 - var9) * 0.5F;
      float var31 = var21 * var25 + var22 * var26 + var23 * var27 + var24;
      float var32 = Math.abs(var21) * var28 + Math.abs(var22) * var29 + Math.abs(var23) * var30;
      if (var31 + var32 < 0.01F) {
         return new rji_3(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
      } else {
         float var33 = id_const.id_volatile();
         float var34 = id_const.id_final();
         float var35 = Float.MAX_VALUE;
         float var36 = Float.MAX_VALUE;
         float var37 = Float.MIN_VALUE;
         float var38 = Float.MIN_VALUE;

         for (int var39 = 0; var39 < 8; var39++) {
            float var40 = (var39 & 1) == 0 ? var8 : var10;
            float var41 = (var39 & 2) == 0 ? var6 : var11;
            float var42 = (var39 & 4) == 0 ? var9 : var12;
            float var43 = var21 * var40 + var22 * var41 + var23 * var42 + var24;
            if (!(var43 < 0.01F)) {
               float var44 = id_throws[16] / var43;
               float var45 = (var13 * var40 + var14 * var41 + var15 * var42 + var16) * var44;
               float var46 = (var17 * var40 + var18 * var41 + var19 * var42 + var20) * var44;
               float var47 = var33 * 0.5F + 0.5F * (var45 * var33 + 1.0F);
               float var48 = var34 * 0.5F - 0.5F * (var46 * var34 + 1.0F);
               if (var47 < var35) {
                  var35 = var47;
               }

               if (var48 < var36) {
                  var36 = var48;
               }

               if (var47 > var37) {
                  var37 = var47;
               }

               if (var48 > var38) {
                  var38 = var48;
               }
            }
         }

         return new rji_3(var35, var36, var37, var38);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1375466537865557595L;
   }

   public static void id_class(int var0) {
      float var1 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var2 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var3 = (float)(var0 & 0xFF) / 255.0F;
      float var4 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      MT.id_protected(var1, var2, var3, var4);
   }

   private static boolean id_class(rjV_2 var0, float var1, float var2, float var3, rjK_2 var4, float var5, float var6) {
      float var7 = var0.id_volatile * var1 + var0.id_final * var2 + var0.id_package * var3 + var0.id_int;
      if (var7 < 0.01F) {
         return false;
      } else {
         float var8 = id_throws[24] / var7;
         float var9 = (var0.id_class * var1 + var0.id_break * var2 + var0.id_byte * var3 + var0.id_protected) * var8;
         float var10 = (var0.id_throws * var1 + var0.id_case * var2 + var0.id_catch * var3 + var0.id_private) * var8;
         var4.id_class(var5 * 0.5F + 0.5F * (var9 * var5 + 1.0F), var6 * 0.5F - 0.5F * (var10 * var6 + 1.0F));
         return true;
      }
   }

   public static void id_class() {
      MT.id_protected(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static rji_3 id_class(rjV_2 var0, eX_2 var1) {
      float var2 = (float)(var1.id_class() - id_void.id_case());
      float var3 = (float)(var1.id_break() - id_void.id_catch());
      float var4 = (float)(var1.id_byte() - id_void.id_private());
      rji_3 var5 = new rji_3(Float.MAX_VALUE, Float.MAX_VALUE, -1.0F, -1.0F);
      rjK_2 var6 = new rjK_2(0.0F, 0.0F);
      float var7 = id_const.id_volatile();
      float var8 = id_const.id_final();
      if (id_class(var0, var2, var3, var4, var6, var7, var8)) {
         var5.id_class(
            Math.min(var6.id_byte, var5.id_class()),
            Math.min(var6.id_protected, var5.id_break()),
            Math.max(var6.id_byte, var5.id_byte()),
            Math.max(var6.id_protected, var5.id_protected())
         );
      }

      return var5;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, -61, -107, 94, -128, 91, 79, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float id_class(Ml_1 var0) {
      return var0.id_throws();
   }

   public static void id_class(Ml_1 var0, Runnable var1, float var2, float var3, float var4, float var5) {
      var0.id_class();
      var4 *= 2.0F;
      var5 *= 2.0F;
      var2 *= 2.0F;
      var3 *= 2.0F;
      int var6 = (int)var2;
      int var7 = (int)((float)id_const.id_continue() - (var3 + var5));
      int var8 = (int)var4;
      int var9 = (int)var5;
      GL11.glPushAttrib(524288);
      if (GL11.glGetBoolean(3089)) {
         ((IntBuffer)id_class[1]).rewind();
         GL11.glGetIntegerv(3088, (IntBuffer)id_class[1]);
         var6 = Math.max(var6, ((IntBuffer)id_class[1]).get(0));
         var7 = Math.max(var7, ((IntBuffer)id_class[1]).get(1));
         var8 = Math.min(var8, ((IntBuffer)id_class[1]).get(2));
         var9 = Math.min(var9, ((IntBuffer)id_class[1]).get(3));
      } else {
         GL11.glEnable(id_break[16]);
      }

      GL11.glScissor(var6, var7, var8, var9);
      var1.run();
      GL11.glPopAttrib();
      var0.id_break();
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 159719085;
   }

   private static void id_break() {
      id_protected = new boolean[]{false, true, false, true, false, true, true};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{null, BufferUtils.createIntBuffer(16)};
      id_class = var0;
   }

   private static void id_catch() {
      id_throws = new float[]{
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.01F,
         Float.MAX_VALUE,
         Float.MAX_VALUE,
         Float.MIN_VALUE,
         Float.MIN_VALUE,
         Float.MAX_VALUE,
         Float.MAX_VALUE,
         Float.MIN_VALUE,
         Float.MIN_VALUE,
         0.01F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.01F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         Float.MAX_VALUE,
         Float.MAX_VALUE,
         -1.0F,
         -1.0F,
         0.0F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F
      };
   }

   private static void id_case() {
      id_byte = new byte[]{8, 2, 4, 16, 8, 24, 2, 3, 16, 2};
   }

   private static void id_protected() {
      id_case = new int[]{524288};
   }
}
