package celestial;

import com.jhlabs.image.GaussianFilter;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class rrfD_2 implements MinecraftAccessor {
   private static double[] id_break;
   private static String[] id_byte;
   public static Object[] id_class;
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static byte[] id_catch;

   public static void id_byte(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      id_class(var0, var1 - var5, var2 - var5, var3 + var5 * 2.0F, var4 + var5 * 2.0F, 3.0F, 8.0F, var6, var7, var8, var9);
   }

   public static void id_byte(lD_2 var0) {
      var0.id_class(7, ju_3.id_public);
   }

   public static void id_byte(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      var1.id_class(var7, -var2, -var2, 0.0F).id_class(0.0F, 0.0F).id_class(var3).id_class();
      var1.id_class(var7, -var2, var2, 0.0F).id_class(0.0F, 1.0F).id_class(var4).id_class();
      var1.id_class(var7, var2, var2, 0.0F).id_class(1.0F, 1.0F).id_class(var5).id_class();
      var1.id_class(var7, var2, -var2, 0.0F).id_class(1.0F, 0.0F).id_class(var6).id_class();
   }

   public static void id_byte(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      RenderSystem.shadeModel(7425);
      RenderSystem.disableDepthTest();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.disableAlphaTest();
      id_strictfp.id_class(7, ju_3.id_this);
      id_strictfp.id_class(var7, var1, var2 + var4, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2 + var4, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2, 0.0F).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1, var2, 0.0F).id_class(var6).id_class();
      id_default.id_break();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      RenderSystem.shadeModel(7424);
   }

   private static void id_byte() {
      id_case = new short[]{
         6,
         6,
         6,
         3553,
         10240,
         9729,
         5,
         5,
         5,
         5,
         5,
         5,
         5,
         5,
         5,
         770,
         771,
         3553,
         10240,
         9729,
         3553,
         10240,
         9729,
         7425,
         7424,
         2848,
         770,
         771,
         2848,
         2848,
         2881,
         3155,
         4354,
         770,
         771,
         2848,
         2881,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         770,
         771,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         2,
         516,
         516,
         401,
         407,
         6,
         6,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         770,
         771,
         2832,
         3153,
         4354,
         3553,
         770,
         771,
         2832,
         3153,
         4354,
         3553,
         255,
         15,
         4,
         4,
         4,
         4,
         4,
         4,
         4,
         4,
         3,
         3,
         3,
         3,
         3,
         0,
         6,
         6,
         256,
         256
      };
   }

   public static void id_byte(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var7, var6);
   }

   public static void id_byte(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.id_byte().id_class();
      float var7 = var1 + (var3 - var1) * 0.25F;
      float var8 = var1 + (var3 - var1) * 0.75F;
      id_strictfp.id_class(3, ju_3.id_this);
      id_strictfp.id_class(var6, var1, var2, 0.0F).id_class(var5).id_class();
      byte var9 = 20;

      for (int var10 = 1; var10 <= 20; var10++) {
         float var11 = (float)var10 / 20.0F;
         float var12 = id_class(var1, var7, var8, var3, var11);
         float var13 = id_class(var2, var2, var4, var4, var11);
         id_strictfp.id_class(var6, var12, var13, 0.0F).id_class(var5).id_class();
      }

      id_strictfp.id_class(var6, var3, var4, 0.0F).id_class(var5).id_class();
      GL11.glEnable(2848);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(2.0F);
      RenderSystem.disableAlphaTest();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.enableBlend();
      id_default.id_break();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      RenderSystem.enableAlphaTest();
      GL11.glDisable(2848);
      rrfa_3.id_class();
   }

   static {
      ntfClinit();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      id_class(var0, var1, var2, var3, var4, var5, var7, var7, var6, var6);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      ((ShaderManager)id_class[3]).id_protected();
      ((ShaderManager)id_class[3]).id_break("rectSize", var3 * 2.0F, var4 * 2.0F);
      ((ShaderManager)id_class[3]).id_break("radius", var5 * 2.0F);
      ((ShaderManager)id_class[3]).id_break("alpha", var6);
      id_strictfp.id_class(7, ju_3.id_synchronized);
      id_strictfp.id_class(var7, var1, var2, 0.0F).id_class(0.0F, 0.0F).id_class();
      id_strictfp.id_class(var7, var1, var2 + var4, 0.0F).id_class(0.0F, 1.0F).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2 + var4, 0.0F).id_class(1.0F, 1.0F).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2, 0.0F).id_class(1.0F, 0.0F).id_class();
      id_default.id_break();
      RenderSystem.bindTexture(0);
      ((ShaderManager)id_class[3]).id_byte();
   }

   public static void id_class(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, float var7, float var8) {
      rjV_2 var9 = var0.id_byte().id_class();
      float var10 = 1.0F / var7;
      float var11 = 1.0F / var8;
      id_strictfp.id_class(7, ju_3.id_synchronized);
      id_strictfp.id_class(var9, (float)var1, (float)(var2 + var6), 0.0F).id_class(var3 * var10, (var4 + (float)var6) * var11).id_class();
      id_strictfp.id_class(var9, (float)(var1 + var5), (float)(var2 + var6), 0.0F)
         .id_class((var3 + (float)var5) * var10, (var4 + (float)var6) * var11)
         .id_class();
      id_strictfp.id_class(var9, (float)(var1 + var5), (float)var2, 0.0F).id_class((var3 + (float)var5) * var10, var4 * var11).id_class();
      id_strictfp.id_class(var9, (float)var1, (float)var2, 0.0F).id_class(var3 * var10, var4 * var11).id_class();
      id_default.id_break();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1259755972;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2680144456404671720L;
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      float var12 = var3 + var5 * 2.0F;
      float var13 = var4 + var5 * 2.0F;
      id_class(var0, var1 - var5, var2 - var5, var12, var13, (float)var6, (float)var7, var8, var9, var10, var11);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, int var4, float var5) {
      var0.id_class();
      var0.id_class((double)var1, (double)var2, 0.0);
      var0.id_class(rje_3.id_case.id_byte(180.0F + var3));
      var0.id_class(var5, var5, var5);
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.disableAlphaTest();
      GL11.glEnable(2848);
      GL11.glEnable(2881);
      GL11.glHint(3155, 4354);
      GL11.glBlendFunc(770, 771);
      rjV_2 var6 = var0.id_byte().id_class();
      id_strictfp.id_class(4, ju_3.id_this);
      id_strictfp.id_class(var6, 0.0F, 1.5F, 0.0F).id_class(var4).id_class();
      id_strictfp.id_class(var6, 2.0F, -0.5F, 0.0F).id_class(var4).id_class();
      id_strictfp.id_class(var6, -2.3F, -0.5F, 0.0F).id_class(var4).id_class();
      id_default.id_break();
      GL11.glDisable(2848);
      GL11.glDisable(2881);
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
      RenderSystem.enableAlphaTest();
      var0.id_break();
   }

   public static void id_class(Ml_1 var0, double var1, double var3, float var5, int var6, float var7) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.disableTexture();
      GL11.glEnable(2832);
      GL11.glHint(3153, 4354);
      GL11.glPointSize(var5 * 2.0F * var7);
      id_strictfp.id_class(0, ju_3.id_this);
      id_strictfp.id_class(var0.id_byte().id_class(), (float)var1, (float)var3, 0.0F).id_class(var6).id_class();
      id_default.id_break();
      GL11.glEnable(3553);
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
   }

   public static void id_class(Ml_1 var0, rfl_3 var1, int var2) {
      rjV_2 var3 = var0.id_byte().id_class();
      float var4 = (float)var1.id_protected;
      float var5 = (float)var1.id_class;
      float var6 = (float)var1.id_throws;
      float var7 = (float)var1.id_break;
      float var8 = (float)var1.id_case;
      float var9 = (float)var1.id_byte;
      id_strictfp.id_class(var3, var5, var7, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var7, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var7, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var6, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var7, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var7, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var7, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var6, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var6, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var6, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var6, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var6, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var6, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var7, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var7, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var7, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var7, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var7, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var5, var6, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var6, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var7, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var6, var8).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var6, var9).id_class(var2).id_class();
      id_strictfp.id_class(var3, var4, var6, var8).id_class(var2).id_class();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      RenderSystem.enableBlend();
      RenderSystem.disableAlphaTest();
      ((ShaderManager)id_class[1]).id_class();
      ((ShaderManager)id_class[1]).id_break("width", var3);
      ((ShaderManager)id_class[1]).id_break("height", var4);
      ((ShaderManager)id_class[1]).id_break("radius", var5);
      ((ShaderManager)id_class[1]).id_break("glowRadius", var6);
      ((ShaderManager)id_class[1])
         .id_break(
            "color1",
            (float)ColorHelper.id_byte(var7) / 255.0F,
            (float)ColorHelper.id_protected(var7) / 255.0F,
            (float)ColorHelper.id_break(var7) / 255.0F,
            (float)ColorHelper.id_throws(var7) / 255.0F
         );
      ((ShaderManager)id_class[1])
         .id_break(
            "color2",
            (float)ColorHelper.id_byte(var8) / 255.0F,
            (float)ColorHelper.id_protected(var8) / 255.0F,
            (float)ColorHelper.id_break(var8) / 255.0F,
            (float)ColorHelper.id_throws(var8) / 255.0F
         );
      ((ShaderManager)id_class[1])
         .id_break(
            "color3",
            (float)ColorHelper.id_byte(var9) / 255.0F,
            (float)ColorHelper.id_protected(var9) / 255.0F,
            (float)ColorHelper.id_break(var9) / 255.0F,
            (float)ColorHelper.id_throws(var9) / 255.0F
         );
      ((ShaderManager)id_class[1])
         .id_break(
            "color4",
            (float)ColorHelper.id_byte(var10) / 255.0F,
            (float)ColorHelper.id_protected(var10) / 255.0F,
            (float)ColorHelper.id_break(var10) / 255.0F,
            (float)ColorHelper.id_throws(var10) / 255.0F
         );
      ShaderManager.id_break(var0, var1 - 1.0F - var6, var2 - 1.0F - var6, var3 + 2.0F + var6 * 2.0F, var4 + 2.0F + var6 * 2.0F);
      ((ShaderManager)id_class[1]).id_break();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 4.0F);
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, int var11
   ) {
      rrfa_3.id_class();
      RenderSystem.disableAlphaTest();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      ((ShaderManager)id_class[2]).id_class();
      ((ShaderManager)id_class[2]).id_break("width", var3);
      ((ShaderManager)id_class[2]).id_break("height", var4);
      ((ShaderManager)id_class[2]).id_break("radius", var5);
      ((ShaderManager)id_class[2]).id_break("thickness", var6);
      ((ShaderManager)id_class[2]).id_break("smoothness", 0.0F, var7);
      ((ShaderManager)id_class[2])
         .id_break(
            "color",
            (float)ColorHelper.id_byte(var8) / 255.0F,
            (float)ColorHelper.id_protected(var8) / 255.0F,
            (float)ColorHelper.id_break(var8) / 255.0F,
            (float)ColorHelper.id_throws(var8) / 255.0F
         );
      ((ShaderManager)id_class[2])
         .id_break(
            "color2",
            (float)ColorHelper.id_byte(var9) / 255.0F,
            (float)ColorHelper.id_protected(var9) / 255.0F,
            (float)ColorHelper.id_break(var9) / 255.0F,
            (float)ColorHelper.id_throws(var9) / 255.0F
         );
      ((ShaderManager)id_class[2])
         .id_break(
            "color3",
            (float)ColorHelper.id_byte(var10) / 255.0F,
            (float)ColorHelper.id_protected(var10) / 255.0F,
            (float)ColorHelper.id_break(var10) / 255.0F,
            (float)ColorHelper.id_throws(var10) / 255.0F
         );
      ((ShaderManager)id_class[2])
         .id_break(
            "color4",
            (float)ColorHelper.id_byte(var11) / 255.0F,
            (float)ColorHelper.id_protected(var11) / 255.0F,
            (float)ColorHelper.id_break(var11) / 255.0F,
            (float)ColorHelper.id_throws(var11) / 255.0F
         );
      ShaderManager.id_break(var0, var1 - 1.0F, var2 - 1.0F, var3 + 2.0F, var4 + 2.0F);
      ((ShaderManager)id_class[2]).id_break();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      RenderSystem.enableTexture();
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.alphaFunc(516, 0.0F);
      MT.id_super(id_class((int)var3, (int)var4, var5));
      var3 += (float)(var5 * 2);
      var4 += (float)(var5 * 2);
      var1 -= (float)var5;
      var2 -= (float)var5;
      id_strictfp.id_class(7, ju_3.id_public);
      id_strictfp.id_class(var7, var1, var2, 0.0F).id_class(0.0F, 0.0F).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1, var2 + var4, 0.0F).id_class(0.0F, 1.0F).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2 + var4, 0.0F).id_class(1.0F, 1.0F).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2, 0.0F).id_class(1.0F, 0.0F).id_class(var6).id_class();
      id_default.id_break();
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, int var5, float var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      GL11.glPointSize(var4 * 2.0F * var6);
      var1.id_class(var7, var2, var3, 0.0F).id_class(var5).id_class();
   }

   public static void id_class(Ml_1 var0, iB_2 var1, float var2, float var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      rqO_2 var10 = id_import.id_case().id_class(var1).id_class(var1);
      id_import.A().id_class(var10);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableAlphaTest();
      rrfa_3.id_class();
      ((ShaderManager)id_class[4]).id_protected();
      ((ShaderManager)id_class[4]).id_break("width", (float)var4);
      ((ShaderManager)id_class[4]).id_break("height", (float)var5);
      ((ShaderManager)id_class[4]).id_break("radius", var6);
      ((ShaderManager)id_class[4]).id_break("hurtStrength", var7);
      ((ShaderManager)id_class[4]).id_break("alpha", var8);
      ((ShaderManager)id_class[4])
         .id_class(
            "hurtColor", (float)ColorHelper.id_byte(var9) / 255.0F, (float)ColorHelper.id_protected(var9) / 255.0F, (float)ColorHelper.id_break(var9) / 255.0F
         );
      ShaderManager.id_break(var0, var2, var3, (float)var4, (float)var5);
      ((ShaderManager)id_class[4]).id_byte();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      rjV_2 var11 = var0.id_byte().id_class();
      float var12 = 1.0F / var9;
      float var13 = 1.0F / var10;
      id_strictfp.id_class(7, ju_3.id_synchronized);
      id_strictfp.id_class(var11, var1, var2 + (float)var8, 0.0F).id_class(var3 * var12, (var4 + (float)var6) * var13).id_class();
      id_strictfp.id_class(var11, var1 + (float)var7, var2 + (float)var8, 0.0F).id_class((var3 + (float)var5) * var12, (var4 + (float)var6) * var13).id_class();
      id_strictfp.id_class(var11, var1 + (float)var7, var2, 0.0F).id_class((var3 + (float)var5) * var12, var4 * var13).id_class();
      id_strictfp.id_class(var11, var1, var2, 0.0F).id_class(var3 * var12, var4 * var13).id_class();
      id_default.id_break();
   }

   public static void id_class(Ml_1 var0, rLR var1, float var2, float var3, float var4) {
      var0.id_class();
      fj_3 var5 = id_import.id_abstract().id_class(var1);
      id_static.id_class(var5.id_extends().id_protected());
      var0.id_class((double)var2, (double)var3, 0.0);
      var0.id_class(var4, var4, var4);
      ch_3.id_class(var0, 0, 0, 0, 18, 18, var5);
      var0.id_break();
   }

   public static void id_class(Ml_1 var0, rfl_3 var1, rpr_3 var2, int var3) {
      rfl_3 var4 = id_class(var1, var2);
      id_class(var0, var4, var3);
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = ColorHelper.id_break(var8, var12);
      int var14 = ColorHelper.id_break(var9, var12);
      int var15 = ColorHelper.id_break(var10, var12);
      int var16 = ColorHelper.id_break(var11, var12);
      float var17 = var3 + var5 * 2.0F;
      float var18 = var4 + var5 * 2.0F;
      id_class(var0, var1 - var5, var2 - var5, var17, var18, (float)var6, (float)var7, var13, var14, var15, var16);
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11
   ) {
      int var12 = ColorHelper.id_break(var7, var11);
      int var13 = ColorHelper.id_break(var8, var11);
      int var14 = ColorHelper.id_break(var9, var11);
      int var15 = ColorHelper.id_break(var10, var11);
      float var16 = var3 + var5 * 2.0F;
      float var17 = var4 + var5 * 2.0F;
      id_class(var0, var1 - var5, var2 - var5, var16, var17, 3.0F, var6, var12, var13, var14, var15);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      id_class(var0, id_strictfp, var1, var2, var3, var4, var5);
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      rrfa_3.id_class(var6);
      id_import.A().id_class(var1);
      GL11.glTexParameteri(3553, 10240, 9729);
      id_class(var0, var2, var3, 0.0F, 0.0F, var4, var5, var4, var5);
      RenderSystem.disableBlend();
      rrfa_3.id_class();
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.disableAlphaTest();
      RenderSystem.depthMask(false);
      id_import.A().id_class(var1);
      GL11.glTexParameteri(3553, 10240, 9729);
      id_class(var0, var2, var3, 0.0F, 0.0F, var4, var5, var4, var5, var6, var7, var8, var9);
      RenderSystem.enableAlphaTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableSmoothShadeModel();
   }

   public static void id_class(lD_2 var0) {
      RenderSystem.enableTexture();
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.alphaFunc(516, 0.0F);
      id_default.id_class(var0);
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
   }

   private static rfl_3 id_class(rfl_3 var0, rpr_3 var1) {
      return switch (((int[])rrfU_2.id_class[0])[var1.ordinal()]) {
         case 1 -> new rfl_3(var0.id_class, var0.id_break, var0.id_byte, var0.id_protected, var0.id_break, var0.id_case);
         case 2 -> new rfl_3(var0.id_class, var0.id_throws, var0.id_byte, var0.id_protected, var0.id_throws, var0.id_case);
         case 3 -> new rfl_3(var0.id_class, var0.id_break, var0.id_byte, var0.id_protected, var0.id_throws, var0.id_byte);
         case 4 -> new rfl_3(var0.id_class, var0.id_break, var0.id_case, var0.id_protected, var0.id_throws, var0.id_case);
         case 5 -> new rfl_3(var0.id_class, var0.id_break, var0.id_byte, var0.id_class, var0.id_throws, var0.id_case);
         case 6 -> new rfl_3(var0.id_protected, var0.id_break, var0.id_byte, var0.id_protected, var0.id_throws, var0.id_case);
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static int id_class(int var0, int var1, int var2) {
      int var3 = (var0 * 401 + var1) * 407 + var2;
      Integer var4 = (Integer)((HashMap)id_class[6]).get(var3);
      if (var4 != null) {
         return var4;
      } else {
         BufferedImage var5 = new BufferedImage(var0 + var2 * 2, var1 + var2 * 2, 3);
         Graphics var6 = var5.getGraphics();
         var6.setColor(Color.WHITE);
         var6.fillRect(var2, var2, var0, var1);
         var6.dispose();
         GaussianFilter var7 = new GaussianFilter((float)var2);
         BufferedImage var8 = var7.filter(var5, null);

         try {
            var4 = rrjr_3.id_class(var8, id_throws[3], id_throws[4], id_throws[5], id_throws[6]).id_new();
            ((HashMap)id_class[id_case[64]]).put(var3, var4);
         } catch (Exception var10) {
         }

         return var4 != null ? var4 : id_catch[21];
      }
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      rjV_2 var9 = var0.id_byte().id_class();
      float var10 = 1.0F / var7;
      float var11 = 1.0F / var8;
      id_strictfp.id_class(7, ju_3.id_synchronized);
      id_strictfp.id_class(var9, var1, var2 + var6, 0.0F).id_class(var3 * var10, (var4 + var6) * var11).id_class();
      id_strictfp.id_class(var9, var1 + var5, var2 + var6, 0.0F).id_class((var3 + var5) * var10, (var4 + var6) * var11).id_class();
      id_strictfp.id_class(var9, var1 + var5, var2, 0.0F).id_class((var3 + var5) * var10, var4 * var11).id_class();
      id_strictfp.id_class(var9, var1, var2, 0.0F).id_class(var3 * var10, var4 * var11).id_class();
      id_default.id_break();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, int var4) {
      rjV_2 var5 = var0.id_byte().id_class();
      id_strictfp.id_class(var5, var1, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + 1.0F, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2 + 1.0F, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2 + 1.0F, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2 + 1.0F, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2 + 1.0F, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + 1.0F, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + 1.0F, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + 1.0F, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2 + 1.0F, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + 1.0F, var2 + 1.0F, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + 1.0F, var3 + 1.0F).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + 1.0F, var3).id_class(var4).id_class();
   }

   private static float id_class(float var0, float var1, float var2, float var3, float var4) {
      float var5 = 1.0F - var4;
      float var6 = var4 * var4;
      float var7 = var5 * var5;
      float var8 = var7 * var5;
      float var9 = var6 * var4;
      float var10 = var8 * var0;
      var10 += 3.0F * var7 * var4 * var1;
      var10 += 3.0F * var5 * var6 * var2;
      return var10 + var9 * var3;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 88, 81, -118, -119, 36, -111, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      rrfa_3.id_class();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      ((ShaderManager)id_class[5]).id_class();
      ((ShaderManager)id_class[5]).id_break("width", var3);
      ((ShaderManager)id_class[5]).id_break("height", var4);
      ((ShaderManager)id_class[5]).id_break("radius", var5);
      ((ShaderManager)id_class[5])
         .id_break(
            "color1",
            (float)ColorHelper.id_byte(var6) / 255.0F,
            (float)ColorHelper.id_protected(var6) / 255.0F,
            (float)ColorHelper.id_break(var6) / 255.0F,
            (float)ColorHelper.id_throws(var6) / 255.0F
         );
      ((ShaderManager)id_class[5])
         .id_break(
            "color2",
            (float)ColorHelper.id_byte(var7) / 255.0F,
            (float)ColorHelper.id_protected(var7) / 255.0F,
            (float)ColorHelper.id_break(var7) / 255.0F,
            (float)ColorHelper.id_throws(var7) / 255.0F
         );
      ((ShaderManager)id_class[5])
         .id_break(
            "color3",
            (float)ColorHelper.id_byte(var8) / 255.0F,
            (float)ColorHelper.id_protected(var8) / 255.0F,
            (float)ColorHelper.id_break(var8) / 255.0F,
            (float)ColorHelper.id_throws(var8) / 255.0F
         );
      ((ShaderManager)id_class[5])
         .id_break(
            "color4",
            (float)ColorHelper.id_byte(var9) / 255.0F,
            (float)ColorHelper.id_protected(var9) / 255.0F,
            (float)ColorHelper.id_break(var9) / 255.0F,
            (float)ColorHelper.id_throws(var9) / 255.0F
         );
      ShaderManager.id_break(var0, var1, var2, var3, var4);
      ((ShaderManager)id_class[5]).id_break();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, boolean var2, float var3, float var4, int var5, int var6, float var7) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableAlphaTest();
      id_import.A().id_class(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var7);
      id_class(var0, var3, var4, 8.0F, 8.0F, 8, 8, var5, var6, 64.0F, 64.0F);
      if (var2) {
         id_class(var0, var3, var4, 40.0F, 8.0F, 8, 8, var5, var6, 64.0F, 64.0F);
      }

      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      var1.id_class(7, ju_3.id_public);
      var1.id_class(var7, -var2, -var2, 0.0F).id_class(0.0F, 0.0F).id_class(var3).id_class();
      var1.id_class(var7, -var2, var2, 0.0F).id_class(0.0F, 1.0F).id_class(var4).id_class();
      var1.id_class(var7, var2, var2, 0.0F).id_class(1.0F, 1.0F).id_class(var5).id_class();
      var1.id_class(var7, var2, -var2, 0.0F).id_class(1.0F, 0.0F).id_class(var6).id_class();
      id_default.id_class(var1);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((ShaderManager)id_class[0]).id_protected();
      float var10 = 2.0F;
      float var11 = (float)ColorHelper.id_byte(var9) / 255.0F;
      float var12 = (float)ColorHelper.id_protected(var9) / 255.0F;
      float var13 = (float)ColorHelper.id_break(var9) / 255.0F;
      float var14 = (float)ColorHelper.id_throws(var9) / 255.0F;
      ((ShaderManager)id_class[0]).id_class("location", var1 * var10, (float)id_const.id_native() - var4 * var10 - var2 * var10);
      ((ShaderManager)id_class[0]).id_class("rectSize", var3 * var10, var4 * var10);
      ((ShaderManager)id_class[0]).id_class("cornerRadii", var5 * var10, var6 * var10, var8 * var10, var7 * var10);
      ((ShaderManager)id_class[0]).id_class("color1", var11, var12, var13, var14);
      ((ShaderManager)id_class[0]).id_class("color2", var11, var12, var13, var14);
      ((ShaderManager)id_class[0]).id_class("color3", var11, var12, var13, var14);
      ((ShaderManager)id_class[0]).id_class("color4", var11, var12, var13, var14);
      ShaderManager.id_break(var0, var1 - 1.0F, var2 - 1.0F, var3 + 2.0F, var4 + 2.0F);
      ((ShaderManager)id_class[0]).id_byte();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      var1.id_class(var7, var2, var3 + var5, 0.0F).id_class(var6).id_class();
      var1.id_class(var7, var2 + var4, var3 + var5, 0.0F).id_class(var6).id_class();
      var1.id_class(var7, var2 + var4, var3, 0.0F).id_class(var6).id_class();
      var1.id_class(var7, var2, var3, 0.0F).id_class(var6).id_class();
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, boolean var10, float var11
   ) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_goto()) {
         byte var12 = 3;
         byte var13 = 6;
         id_class(
            var0,
            var1 - (float)var12,
            var2 - (float)var12,
            var3 + (float)(var12 * 2),
            var4 + (float)(var12 * 2),
            (float)var13,
            (float)var13,
            var6,
            var7,
            var8,
            var9
         );
      }

      id_class(var0, var1, var2, var3, var4, var11, var11, var11, var11, ColorHelper.id_break(rrZF.j_, var5));
      if (var10) {
         id_break(var0, var1 - 0.5F, var2 - 0.5F, var3 + 1.0F, 12.0F, var11, var11, 0.0F, 0.0F, var6, var7, var8, var9);
      }

      id_break(var0, var1 - 1.5F, var2 - 1.5F, var3 + 3.0F, var4 + 3.0F, var11 + 1.0F, var6, var7, var8, var9);
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      rjV_2 var13 = var0.id_byte().id_class();
      float var14 = 1.0F / var7;
      float var15 = 1.0F / var8;
      id_strictfp.id_class(7, ju_3.id_public);
      id_strictfp.id_class(var13, var1, var2 + var6, 0.0F).id_class(var3 * var14, (var4 + var6) * var15).id_class(var9).id_class();
      id_strictfp.id_class(var13, var1 + var5, var2 + var6, 0.0F).id_class((var3 + var5) * var14, (var4 + var6) * var15).id_class(var10).id_class();
      id_strictfp.id_class(var13, var1 + var5, var2, 0.0F).id_class((var3 + var5) * var14, var4 * var15).id_class(var11).id_class();
      id_strictfp.id_class(var13, var1, var2, 0.0F).id_class(var3 * var14, var4 * var15).id_class(var12).id_class();
      id_default.id_break();
   }

   public static void id_class() {
      if (!((HashMap)id_class[6]).isEmpty()) {
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
               for (Integer var1x : ((HashMap)id_class[6]).values()) {
                  GL11.glDeleteTextures(var1x);
               }

               ((HashMap)id_class[6]).clear();
            });
         } else {
            for (Integer var1 : ((HashMap)id_class[6]).values()) {
               GL11.glDeleteTextures(var1);
            }

            ((HashMap)id_class[6]).clear();
         }
      }
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      rjV_2 var10 = var0.id_byte().id_class();
      var1.id_class(var10, var2, var3 + var5, 0.0F).id_class(var6).id_class();
      var1.id_class(var10, var2 + var4, var3 + var5, 0.0F).id_class(var7).id_class();
      var1.id_class(var10, var2 + var4, var3, 0.0F).id_class(var8).id_class();
      var1.id_class(var10, var2, var3, 0.0F).id_class(var9).id_class();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, rdn_3 var2, float var3, float var4, boolean var5, boolean var6, float var7, float var8, int var9) {
      var0.id_class();
      var0.id_class((double)var3, (double)var4, 0.0);
      MT.id_transient();
      MT.id_byte(var3, var4, 0.0F);
      MT.id_break(var7, var7, var7);
      MT.id_volatile();
      if (!var5) {
         Hz_1.id_protected = false;
      }

      id_short.id_class(var2, 0.0F, 0.0F);
      if (var6) {
         id_short.id_class(var0, var1, var2, 0.0F, var8, (float)var9, 255);
      }

      Hz_1.id_protected = id_throws[10];
      MT.id_native();
      MT.id_for();
      var0.id_break();
   }

   public static void id_class(
      Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9, boolean var10
   ) {
      MT.id_transient();
      MT.id_byte(var2, var3, 0.0F);
      MT.id_break(var5, var5, var5);
      MT.id_volatile();
      Hz_1.id_protected = var9;
      id_short.id_class(var0, var1, 0.0F, 0.0F, var4);
      if (var8 > 0) {
         id_short.id_class(var0, var1, var6, var7, (float)var8, var4 * 255.0F);
      }

      if (var10) {
         id_short.id_class((cm_3)id_import.id_class[15], var1, 0.0F, 0.0F, null, var4);
      }

      Hz_1.id_protected = id_throws[13];
      MT.id_native();
      MT.id_for();
   }

   public static void id_break(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      if (var1 < var3) {
         float var7 = var1;
         var1 = var3;
         var3 = var7;
      }

      if (var2 < var4) {
         float var8 = var2;
         var2 = var4;
         var4 = var8;
      }

      id_break(var0, var1 - 0.5F, var2 - 0.5F, var1 + 0.5F + var3, var2 + 0.5F + var4, var6);
      id_break(var0, var1, var2, var1 + var3, var2 + var4, var5);
   }

   public static void id_break(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      id_byte(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void id_break() {
      id_default.id_break();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
   }

   public static void id_break(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((ShaderManager)id_class[0]).id_protected();
      float var13 = 2.0F;
      ((ShaderManager)id_class[0]).id_class("location", var1 * var13, (float)id_const.id_native() - var4 * var13 - var2 * var13);
      ((ShaderManager)id_class[0]).id_class("rectSize", var3 * var13, var4 * var13);
      ((ShaderManager)id_class[0]).id_class("cornerRadii", var5 * var13, var6 * var13, var8 * var13, var7 * var13);
      ((ShaderManager)id_class[0])
         .id_class(
            "color1",
            (float)ColorHelper.id_byte(var9) / 255.0F,
            (float)ColorHelper.id_protected(var9) / 255.0F,
            (float)ColorHelper.id_break(var9) / 255.0F,
            (float)ColorHelper.id_throws(var9) / 255.0F
         );
      ((ShaderManager)id_class[0])
         .id_class(
            "color2",
            (float)ColorHelper.id_byte(var10) / 255.0F,
            (float)ColorHelper.id_protected(var10) / 255.0F,
            (float)ColorHelper.id_break(var10) / 255.0F,
            (float)ColorHelper.id_throws(var10) / 255.0F
         );
      ((ShaderManager)id_class[0])
         .id_class(
            "color3",
            (float)ColorHelper.id_byte(var11) / 255.0F,
            (float)ColorHelper.id_protected(var11) / 255.0F,
            (float)ColorHelper.id_break(var11) / 255.0F,
            (float)ColorHelper.id_throws(var11) / 255.0F
         );
      ((ShaderManager)id_class[0])
         .id_class(
            "color4",
            (float)ColorHelper.id_byte(var12) / 255.0F,
            (float)ColorHelper.id_protected(var12) / 255.0F,
            (float)ColorHelper.id_break(var12) / 255.0F,
            (float)ColorHelper.id_throws(var12) / 255.0F
         );
      ShaderManager.id_break(var0, var1 - 1.0F, var2 - 1.0F, var3 + 2.0F, var4 + 2.0F);
      ((ShaderManager)id_class[0]).id_byte();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
   }

   public static void id_break(lD_2 var0) {
      id_default.id_class(var0);
      GL11.glEnable(3553);
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
   }

   public static void id_break(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.id_byte().id_class();
      id_strictfp.id_class(var6, var1, var4, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var6, var3, var4, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var6, var3, var2, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1, var2, 0.0F).id_class(var5).id_class();
   }

   public static void id_break(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rjV_2 var8 = var0.id_byte().id_class();
      MT.id_super(id_class((int)var4, (int)var5, var6));
      var4 += (float)(var6 * 2);
      var5 += (float)(var6 * 2);
      var2 -= (float)var6;
      var3 -= (float)var6;
      var1.id_class(var8, var2, var3, 0.0F).id_class(0.0F, 0.0F).id_class(var7).id_class();
      var1.id_class(var8, var2, var3 + var5, 0.0F).id_class(0.0F, 1.0F).id_class(var7).id_class();
      var1.id_class(var8, var2 + var4, var3 + var5, 0.0F).id_class(1.0F, 1.0F).id_class(var7).id_class();
      var1.id_class(var8, var2 + var4, var3, 0.0F).id_class(1.0F, 0.0F).id_class(var7).id_class();
   }

   public static void id_break(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      id_class(var0, var1, var2, var3, var4, var5, 1.1F, 0.5F, var6, var7, var8, var9);
   }

   private static void id_throws() {
      id_protected = new float[]{
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.25F,
         0.75F,
         0.0F,
         20.0F,
         0.0F,
         0.0F,
         2.0F,
         1.0F,
         3.0F,
         3.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         180.0F,
         0.0F,
         1.5F,
         0.0F,
         2.0F,
         -0.5F,
         0.0F,
         -2.3F,
         -0.5F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         2.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         1.1F,
         0.5F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         4.0F,
         0.5F,
         0.5F,
         1.0F,
         12.0F,
         0.0F,
         0.0F,
         1.5F,
         1.5F,
         3.0F,
         3.0F,
         1.0F,
         2.0F,
         2.0F,
         3.0F,
         8.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         3.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         0.0F,
         2.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         255.0F,
         0.0F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         1.0F,
         8.0F,
         8.0F,
         64.0F,
         64.0F,
         40.0F,
         8.0F,
         64.0F,
         64.0F,
         2.0F,
         2.0F,
         2.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         1.0F,
         0.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   public static void id_throws(lD_2 var0) {
      var0.id_class(7, ju_3.id_this);
   }

   public static void id_catch(lD_2 var0) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.enableBlend();
      RenderSystem.enableTexture();
      RenderSystem.disableAlphaTest();
      GL11.glTexParameteri(3553, 10240, 9729);
      id_default.id_class(var0);
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
      RenderSystem.enableAlphaTest();
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new ShaderManager("gradient_rect", true),
         new ShaderManager("glow_rect", false),
         new ShaderManager("outline_gradient_rect", false),
         new ShaderManager("rounded_texture", false),
         new ShaderManager("targethud_head", false),
         new ShaderManager("colored_texture", false),
         new HashMap(),
         new lD_2(256),
         new lD_2(256)
      };
      id_class = var0;
   }

   private static void id_case() {
      id_throws = new boolean[]{
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false
      };
   }

   public static void id_case(lD_2 var0) {
      var0.id_class(7, ju_3.id_public);
   }

   private static void id_implements() {
      id_catch = new byte[]{7, 7, 7, 7, 3, 20, 20, 7, 7, 7, 7, 4, 2, 2, 7, 7, 2, 2, 2, 2, 3, -1, 3, 6, 2, 2, 18, 18, 8, 8, 8, 8, 7, 7, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void id_protected() {
      id_break = new double[3];
   }

   public static void id_protected(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.id_byte().id_class();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      id_strictfp.id_class(7, ju_3.id_this);
      id_strictfp.id_class(var6, var1, var2 + var4, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1 + var3, var2 + var4, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1 + var3, var2, 0.0F).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1, var2, 0.0F).id_class(var5).id_class();
      id_default.id_break();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   public static void id_protected(lD_2 var0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.disableTexture();
      GL11.glEnable(2832);
      GL11.glHint(3153, 4354);
      var0.id_class(0, ju_3.id_this);
   }

   private static void id_private() {
      id_byte = new String[]{
         new String("width"),
         new String("height"),
         new String("radius"),
         new String("color1"),
         new String("color2"),
         new String("color3"),
         new String("color4"),
         new String("location"),
         new String("rectSize"),
         new String("cornerRadii"),
         new String("color1"),
         new String("color2"),
         new String("color3"),
         new String("color4"),
         new String("width"),
         new String("height"),
         new String("radius"),
         new String("thickness"),
         new String("smoothness"),
         new String("color"),
         new String("color2"),
         new String("color3"),
         new String("color4"),
         new String("width"),
         new String("height"),
         new String("radius"),
         new String("glowRadius"),
         new String("color1"),
         new String("color2"),
         new String("color3"),
         new String("color4"),
         new String("location"),
         new String("rectSize"),
         new String("cornerRadii"),
         new String("color1"),
         new String("color2"),
         new String("color3"),
         new String("color4"),
         new String("width"),
         new String("height"),
         new String("radius"),
         new String("hurtStrength"),
         new String("alpha"),
         new String("hurtColor"),
         new String("rectSize"),
         new String("radius"),
         new String("alpha"),
         new String("gradient_rect"),
         new String("glow_rect"),
         new String("outline_gradient_rect"),
         new String("rounded_texture"),
         new String("targethud_head"),
         new String("colored_texture")
      };
   }

   public static void id_private(lD_2 var0) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      id_default.id_class(var0);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
   }
}
