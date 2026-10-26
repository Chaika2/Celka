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
   private static double[] break_;
   private static String[] byte_;
   public static Object[] class_;
   private static float[] protected_;
   private static boolean[] throws_;
   private static short[] case_;
   private static byte[] catch_;

   public static void byte_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      class_(var0, var1 - var5, var2 - var5, var3 + var5 * 2.0F, var4 + var5 * 2.0F, 3.0F, 8.0F, var6, var7, var8, var9);
   }

   public static void byte_(lD_2 var0) {
      var0.class_(7, ju_3.public_);
   }

   public static void byte_(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      rjV_2 var7 = var0.byte_().class_();
      var1.class_(var7, -var2, -var2, 0.0F).class_(0.0F, 0.0F).class_(var3).class_();
      var1.class_(var7, -var2, var2, 0.0F).class_(0.0F, 1.0F).class_(var4).class_();
      var1.class_(var7, var2, var2, 0.0F).class_(1.0F, 1.0F).class_(var5).class_();
      var1.class_(var7, var2, -var2, 0.0F).class_(1.0F, 0.0F).class_(var6).class_();
   }

   public static void byte_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rjV_2 var7 = var0.byte_().class_();
      RenderSystem.shadeModel(7425);
      RenderSystem.disableDepthTest();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.disableAlphaTest();
      strictfp_.class_(7, ju_3.this_);
      strictfp_.class_(var7, var1, var2 + var4, 0.0F).class_(var5).class_();
      strictfp_.class_(var7, var1 + var3, var2 + var4, 0.0F).class_(var5).class_();
      strictfp_.class_(var7, var1 + var3, var2, 0.0F).class_(var6).class_();
      strictfp_.class_(var7, var1, var2, 0.0F).class_(var6).class_();
      default_.break_();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      RenderSystem.shadeModel(7424);
   }

   private static void byte_() {
      case_ = new short[]{
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

   public static void byte_(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      class_(var0, var1, var2, var3, var4, var5, var6, var7, var7, var6);
   }

   public static void byte_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.byte_().class_();
      float var7 = var1 + (var3 - var1) * 0.25F;
      float var8 = var1 + (var3 - var1) * 0.75F;
      strictfp_.class_(3, ju_3.this_);
      strictfp_.class_(var6, var1, var2, 0.0F).class_(var5).class_();
      byte var9 = 20;

      for (int var10 = 1; var10 <= 20; var10++) {
         float var11 = (float)var10 / 20.0F;
         float var12 = class_(var1, var7, var8, var3, var11);
         float var13 = class_(var2, var2, var4, var4, var11);
         strictfp_.class_(var6, var12, var13, 0.0F).class_(var5).class_();
      }

      strictfp_.class_(var6, var3, var4, 0.0F).class_(var5).class_();
      GL11.glEnable(2848);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(2.0F);
      RenderSystem.disableAlphaTest();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.enableBlend();
      default_.break_();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      RenderSystem.enableAlphaTest();
      GL11.glDisable(2848);
      rrfa_3.class_();
   }

   static {
      ntfClinit();
   }

   public static void class_(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      class_(var0, var1, var2, var3, var4, var5, var7, var7, var6, var6);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      rjV_2 var7 = var0.byte_().class_();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      ((ShaderManager)class_[3]).protected_();
      ((ShaderManager)class_[3]).break_("rectSize", var3 * 2.0F, var4 * 2.0F);
      ((ShaderManager)class_[3]).break_("radius", var5 * 2.0F);
      ((ShaderManager)class_[3]).break_("alpha", var6);
      strictfp_.class_(7, ju_3.synchronized_);
      strictfp_.class_(var7, var1, var2, 0.0F).class_(0.0F, 0.0F).class_();
      strictfp_.class_(var7, var1, var2 + var4, 0.0F).class_(0.0F, 1.0F).class_();
      strictfp_.class_(var7, var1 + var3, var2 + var4, 0.0F).class_(1.0F, 1.0F).class_();
      strictfp_.class_(var7, var1 + var3, var2, 0.0F).class_(1.0F, 0.0F).class_();
      default_.break_();
      RenderSystem.bindTexture(0);
      ((ShaderManager)class_[3]).byte_();
   }

   public static void class_(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, float var7, float var8) {
      rjV_2 var9 = var0.byte_().class_();
      float var10 = 1.0F / var7;
      float var11 = 1.0F / var8;
      strictfp_.class_(7, ju_3.synchronized_);
      strictfp_.class_(var9, (float)var1, (float)(var2 + var6), 0.0F).class_(var3 * var10, (var4 + (float)var6) * var11).class_();
      strictfp_.class_(var9, (float)(var1 + var5), (float)(var2 + var6), 0.0F).class_((var3 + (float)var5) * var10, (var4 + (float)var6) * var11).class_();
      strictfp_.class_(var9, (float)(var1 + var5), (float)var2, 0.0F).class_((var3 + (float)var5) * var10, var4 * var11).class_();
      strictfp_.class_(var9, (float)var1, (float)var2, 0.0F).class_(var3 * var10, var4 * var11).class_();
      default_.break_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1259755972;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2680144456404671720L;
   }

   public static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      float var12 = var3 + var5 * 2.0F;
      float var13 = var4 + var5 * 2.0F;
      class_(var0, var1 - var5, var2 - var5, var12, var13, (float)var6, (float)var7, var8, var9, var10, var11);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, int var4, float var5) {
      var0.class_();
      var0.class_((double)var1, (double)var2, 0.0);
      var0.class_(rje_3.case_.byte_(180.0F + var3));
      var0.class_(var5, var5, var5);
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.disableAlphaTest();
      GL11.glEnable(2848);
      GL11.glEnable(2881);
      GL11.glHint(3155, 4354);
      GL11.glBlendFunc(770, 771);
      rjV_2 var6 = var0.byte_().class_();
      strictfp_.class_(4, ju_3.this_);
      strictfp_.class_(var6, 0.0F, 1.5F, 0.0F).class_(var4).class_();
      strictfp_.class_(var6, 2.0F, -0.5F, 0.0F).class_(var4).class_();
      strictfp_.class_(var6, -2.3F, -0.5F, 0.0F).class_(var4).class_();
      default_.break_();
      GL11.glDisable(2848);
      GL11.glDisable(2881);
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
      RenderSystem.enableAlphaTest();
      var0.break_();
   }

   public static void class_(Ml_1 var0, double var1, double var3, float var5, int var6, float var7) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.disableTexture();
      GL11.glEnable(2832);
      GL11.glHint(3153, 4354);
      GL11.glPointSize(var5 * 2.0F * var7);
      strictfp_.class_(0, ju_3.this_);
      strictfp_.class_(var0.byte_().class_(), (float)var1, (float)var3, 0.0F).class_(var6).class_();
      default_.break_();
      GL11.glEnable(3553);
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
   }

   public static void class_(Ml_1 var0, rfl_3 var1, int var2) {
      rjV_2 var3 = var0.byte_().class_();
      float var4 = (float)var1.protected_;
      float var5 = (float)var1.class_;
      float var6 = (float)var1.throws_;
      float var7 = (float)var1.break_;
      float var8 = (float)var1.case_;
      float var9 = (float)var1.byte_;
      strictfp_.class_(var3, var5, var7, var9).class_(var2).class_();
      strictfp_.class_(var3, var4, var7, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var7, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var6, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var7, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var7, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var7, var9).class_(var2).class_();
      strictfp_.class_(var3, var4, var6, var9).class_(var2).class_();
      strictfp_.class_(var3, var4, var6, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var6, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var6, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var6, var8).class_(var2).class_();
      strictfp_.class_(var3, var5, var6, var8).class_(var2).class_();
      strictfp_.class_(var3, var5, var7, var8).class_(var2).class_();
      strictfp_.class_(var3, var5, var7, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var7, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var7, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var7, var9).class_(var2).class_();
      strictfp_.class_(var3, var5, var6, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var6, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var7, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var6, var8).class_(var2).class_();
      strictfp_.class_(var3, var4, var6, var9).class_(var2).class_();
      strictfp_.class_(var3, var4, var6, var8).class_(var2).class_();
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      RenderSystem.enableBlend();
      RenderSystem.disableAlphaTest();
      ((ShaderManager)class_[1]).class_();
      ((ShaderManager)class_[1]).break_("width", var3);
      ((ShaderManager)class_[1]).break_("height", var4);
      ((ShaderManager)class_[1]).break_("radius", var5);
      ((ShaderManager)class_[1]).break_("glowRadius", var6);
      ((ShaderManager)class_[1])
         .break_(
            "color1",
            (float)ColorHelper.byte_(var7) / 255.0F,
            (float)ColorHelper.protected_(var7) / 255.0F,
            (float)ColorHelper.break_(var7) / 255.0F,
            (float)ColorHelper.throws_(var7) / 255.0F
         );
      ((ShaderManager)class_[1])
         .break_(
            "color2",
            (float)ColorHelper.byte_(var8) / 255.0F,
            (float)ColorHelper.protected_(var8) / 255.0F,
            (float)ColorHelper.break_(var8) / 255.0F,
            (float)ColorHelper.throws_(var8) / 255.0F
         );
      ((ShaderManager)class_[1])
         .break_(
            "color3",
            (float)ColorHelper.byte_(var9) / 255.0F,
            (float)ColorHelper.protected_(var9) / 255.0F,
            (float)ColorHelper.break_(var9) / 255.0F,
            (float)ColorHelper.throws_(var9) / 255.0F
         );
      ((ShaderManager)class_[1])
         .break_(
            "color4",
            (float)ColorHelper.byte_(var10) / 255.0F,
            (float)ColorHelper.protected_(var10) / 255.0F,
            (float)ColorHelper.break_(var10) / 255.0F,
            (float)ColorHelper.throws_(var10) / 255.0F
         );
      ShaderManager.break_(var0, var1 - 1.0F - var6, var2 - 1.0F - var6, var3 + 2.0F + var6 * 2.0F, var4 + 2.0F + var6 * 2.0F);
      ((ShaderManager)class_[1]).break_();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      class_(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 4.0F);
   }

   public static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, int var11
   ) {
      rrfa_3.class_();
      RenderSystem.disableAlphaTest();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      ((ShaderManager)class_[2]).class_();
      ((ShaderManager)class_[2]).break_("width", var3);
      ((ShaderManager)class_[2]).break_("height", var4);
      ((ShaderManager)class_[2]).break_("radius", var5);
      ((ShaderManager)class_[2]).break_("thickness", var6);
      ((ShaderManager)class_[2]).break_("smoothness", 0.0F, var7);
      ((ShaderManager)class_[2])
         .break_(
            "color",
            (float)ColorHelper.byte_(var8) / 255.0F,
            (float)ColorHelper.protected_(var8) / 255.0F,
            (float)ColorHelper.break_(var8) / 255.0F,
            (float)ColorHelper.throws_(var8) / 255.0F
         );
      ((ShaderManager)class_[2])
         .break_(
            "color2",
            (float)ColorHelper.byte_(var9) / 255.0F,
            (float)ColorHelper.protected_(var9) / 255.0F,
            (float)ColorHelper.break_(var9) / 255.0F,
            (float)ColorHelper.throws_(var9) / 255.0F
         );
      ((ShaderManager)class_[2])
         .break_(
            "color3",
            (float)ColorHelper.byte_(var10) / 255.0F,
            (float)ColorHelper.protected_(var10) / 255.0F,
            (float)ColorHelper.break_(var10) / 255.0F,
            (float)ColorHelper.throws_(var10) / 255.0F
         );
      ((ShaderManager)class_[2])
         .break_(
            "color4",
            (float)ColorHelper.byte_(var11) / 255.0F,
            (float)ColorHelper.protected_(var11) / 255.0F,
            (float)ColorHelper.break_(var11) / 255.0F,
            (float)ColorHelper.throws_(var11) / 255.0F
         );
      ShaderManager.break_(var0, var1 - 1.0F, var2 - 1.0F, var3 + 2.0F, var4 + 2.0F);
      ((ShaderManager)class_[2]).break_();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rjV_2 var7 = var0.byte_().class_();
      RenderSystem.enableTexture();
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.alphaFunc(516, 0.0F);
      MT.super_(class_((int)var3, (int)var4, var5));
      var3 += (float)(var5 * 2);
      var4 += (float)(var5 * 2);
      var1 -= (float)var5;
      var2 -= (float)var5;
      strictfp_.class_(7, ju_3.public_);
      strictfp_.class_(var7, var1, var2, 0.0F).class_(0.0F, 0.0F).class_(var6).class_();
      strictfp_.class_(var7, var1, var2 + var4, 0.0F).class_(0.0F, 1.0F).class_(var6).class_();
      strictfp_.class_(var7, var1 + var3, var2 + var4, 0.0F).class_(1.0F, 1.0F).class_(var6).class_();
      strictfp_.class_(var7, var1 + var3, var2, 0.0F).class_(1.0F, 0.0F).class_(var6).class_();
      default_.break_();
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
   }

   public static void class_(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, int var5, float var6) {
      rjV_2 var7 = var0.byte_().class_();
      GL11.glPointSize(var4 * 2.0F * var6);
      var1.class_(var7, var2, var3, 0.0F).class_(var5).class_();
   }

   public static void class_(Ml_1 var0, iB_2 var1, float var2, float var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      rqO_2 var10 = import_.case_().class_(var1).class_(var1);
      import_.A().class_(var10);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableAlphaTest();
      rrfa_3.class_();
      ((ShaderManager)class_[4]).protected_();
      ((ShaderManager)class_[4]).break_("width", (float)var4);
      ((ShaderManager)class_[4]).break_("height", (float)var5);
      ((ShaderManager)class_[4]).break_("radius", var6);
      ((ShaderManager)class_[4]).break_("hurtStrength", var7);
      ((ShaderManager)class_[4]).break_("alpha", var8);
      ((ShaderManager)class_[4])
         .class_("hurtColor", (float)ColorHelper.byte_(var9) / 255.0F, (float)ColorHelper.protected_(var9) / 255.0F, (float)ColorHelper.break_(var9) / 255.0F);
      ShaderManager.break_(var0, var2, var3, (float)var4, (float)var5);
      ((ShaderManager)class_[4]).byte_();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      rjV_2 var11 = var0.byte_().class_();
      float var12 = 1.0F / var9;
      float var13 = 1.0F / var10;
      strictfp_.class_(7, ju_3.synchronized_);
      strictfp_.class_(var11, var1, var2 + (float)var8, 0.0F).class_(var3 * var12, (var4 + (float)var6) * var13).class_();
      strictfp_.class_(var11, var1 + (float)var7, var2 + (float)var8, 0.0F).class_((var3 + (float)var5) * var12, (var4 + (float)var6) * var13).class_();
      strictfp_.class_(var11, var1 + (float)var7, var2, 0.0F).class_((var3 + (float)var5) * var12, var4 * var13).class_();
      strictfp_.class_(var11, var1, var2, 0.0F).class_(var3 * var12, var4 * var13).class_();
      default_.break_();
   }

   public static void class_(Ml_1 var0, rLR var1, float var2, float var3, float var4) {
      var0.class_();
      fj_3 var5 = import_.abstract_().class_(var1);
      static_.class_(var5.extends_().protected_());
      var0.class_((double)var2, (double)var3, 0.0);
      var0.class_(var4, var4, var4);
      ch_3.class_(var0, 0, 0, 0, 18, 18, var5);
      var0.break_();
   }

   public static void class_(Ml_1 var0, rfl_3 var1, rpr_3 var2, int var3) {
      rfl_3 var4 = class_(var1, var2);
      class_(var0, var4, var3);
   }

   public static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = ColorHelper.break_(var8, var12);
      int var14 = ColorHelper.break_(var9, var12);
      int var15 = ColorHelper.break_(var10, var12);
      int var16 = ColorHelper.break_(var11, var12);
      float var17 = var3 + var5 * 2.0F;
      float var18 = var4 + var5 * 2.0F;
      class_(var0, var1 - var5, var2 - var5, var17, var18, (float)var6, (float)var7, var13, var14, var15, var16);
   }

   public static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11
   ) {
      int var12 = ColorHelper.break_(var7, var11);
      int var13 = ColorHelper.break_(var8, var11);
      int var14 = ColorHelper.break_(var9, var11);
      int var15 = ColorHelper.break_(var10, var11);
      float var16 = var3 + var5 * 2.0F;
      float var17 = var4 + var5 * 2.0F;
      class_(var0, var1 - var5, var2 - var5, var16, var17, 3.0F, var6, var12, var13, var14, var15);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      class_(var0, strictfp_, var1, var2, var3, var4, var5);
   }

   public static void class_(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      rrfa_3.class_(var6);
      import_.A().class_(var1);
      GL11.glTexParameteri(3553, 10240, 9729);
      class_(var0, var2, var3, 0.0F, 0.0F, var4, var5, var4, var5);
      RenderSystem.disableBlend();
      rrfa_3.class_();
   }

   public static void class_(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.disableAlphaTest();
      RenderSystem.depthMask(false);
      import_.A().class_(var1);
      GL11.glTexParameteri(3553, 10240, 9729);
      class_(var0, var2, var3, 0.0F, 0.0F, var4, var5, var4, var5, var6, var7, var8, var9);
      RenderSystem.enableAlphaTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableSmoothShadeModel();
   }

   public static void class_(lD_2 var0) {
      RenderSystem.enableTexture();
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.alphaFunc(516, 0.0F);
      default_.class_(var0);
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
   }

   private static rfl_3 class_(rfl_3 var0, rpr_3 var1) {
      return switch (((int[])rrfU_2.class_[0])[var1.ordinal()]) {
         case 1 -> new rfl_3(var0.class_, var0.break_, var0.byte_, var0.protected_, var0.break_, var0.case_);
         case 2 -> new rfl_3(var0.class_, var0.throws_, var0.byte_, var0.protected_, var0.throws_, var0.case_);
         case 3 -> new rfl_3(var0.class_, var0.break_, var0.byte_, var0.protected_, var0.throws_, var0.byte_);
         case 4 -> new rfl_3(var0.class_, var0.break_, var0.case_, var0.protected_, var0.throws_, var0.case_);
         case 5 -> new rfl_3(var0.class_, var0.break_, var0.byte_, var0.class_, var0.throws_, var0.case_);
         case 6 -> new rfl_3(var0.protected_, var0.break_, var0.byte_, var0.protected_, var0.throws_, var0.case_);
         default -> throw new IncompatibleClassChangeError();
      };
   }

   private static int class_(int var0, int var1, int var2) {
      int var3 = (var0 * 401 + var1) * 407 + var2;
      Integer var4 = (Integer)((HashMap)class_[6]).get(var3);
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
            var4 = rrjr_3.class_(var8, throws_[3], throws_[4], throws_[5], throws_[6]).new_();
            ((HashMap)class_[case_[64]]).put(var3, var4);
         } catch (Exception var10) {
         }

         return var4 != null ? var4 : catch_[21];
      }
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      rjV_2 var9 = var0.byte_().class_();
      float var10 = 1.0F / var7;
      float var11 = 1.0F / var8;
      strictfp_.class_(7, ju_3.synchronized_);
      strictfp_.class_(var9, var1, var2 + var6, 0.0F).class_(var3 * var10, (var4 + var6) * var11).class_();
      strictfp_.class_(var9, var1 + var5, var2 + var6, 0.0F).class_((var3 + var5) * var10, (var4 + var6) * var11).class_();
      strictfp_.class_(var9, var1 + var5, var2, 0.0F).class_((var3 + var5) * var10, var4 * var11).class_();
      strictfp_.class_(var9, var1, var2, 0.0F).class_(var3 * var10, var4 * var11).class_();
      default_.break_();
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, int var4) {
      rjV_2 var5 = var0.byte_().class_();
      strictfp_.class_(var5, var1, var2, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2, var3).class_(var4).class_();
      strictfp_.class_(var5, var1, var2 + 1.0F, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2 + 1.0F, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2 + 1.0F, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2 + 1.0F, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2 + 1.0F, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2 + 1.0F, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2 + 1.0F, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2 + 1.0F, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2 + 1.0F, var3).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1 + 1.0F, var2 + 1.0F, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2 + 1.0F, var3 + 1.0F).class_(var4).class_();
      strictfp_.class_(var5, var1, var2, var3).class_(var4).class_();
      strictfp_.class_(var5, var1, var2 + 1.0F, var3).class_(var4).class_();
   }

   private static float class_(float var0, float var1, float var2, float var3, float var4) {
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

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, 88, 81, -118, -119, 36, -111, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      class_(var0, var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      rrfa_3.class_();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      ((ShaderManager)class_[5]).class_();
      ((ShaderManager)class_[5]).break_("width", var3);
      ((ShaderManager)class_[5]).break_("height", var4);
      ((ShaderManager)class_[5]).break_("radius", var5);
      ((ShaderManager)class_[5])
         .break_(
            "color1",
            (float)ColorHelper.byte_(var6) / 255.0F,
            (float)ColorHelper.protected_(var6) / 255.0F,
            (float)ColorHelper.break_(var6) / 255.0F,
            (float)ColorHelper.throws_(var6) / 255.0F
         );
      ((ShaderManager)class_[5])
         .break_(
            "color2",
            (float)ColorHelper.byte_(var7) / 255.0F,
            (float)ColorHelper.protected_(var7) / 255.0F,
            (float)ColorHelper.break_(var7) / 255.0F,
            (float)ColorHelper.throws_(var7) / 255.0F
         );
      ((ShaderManager)class_[5])
         .break_(
            "color3",
            (float)ColorHelper.byte_(var8) / 255.0F,
            (float)ColorHelper.protected_(var8) / 255.0F,
            (float)ColorHelper.break_(var8) / 255.0F,
            (float)ColorHelper.throws_(var8) / 255.0F
         );
      ((ShaderManager)class_[5])
         .break_(
            "color4",
            (float)ColorHelper.byte_(var9) / 255.0F,
            (float)ColorHelper.protected_(var9) / 255.0F,
            (float)ColorHelper.break_(var9) / 255.0F,
            (float)ColorHelper.throws_(var9) / 255.0F
         );
      ShaderManager.break_(var0, var1, var2, var3, var4);
      ((ShaderManager)class_[5]).break_();
      RenderSystem.disableBlend();
   }

   public static void class_(Ml_1 var0, rqO_2 var1, boolean var2, float var3, float var4, int var5, int var6, float var7) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableAlphaTest();
      import_.A().class_(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var7);
      class_(var0, var3, var4, 8.0F, 8.0F, 8, 8, var5, var6, 64.0F, 64.0F);
      if (var2) {
         class_(var0, var3, var4, 40.0F, 8.0F, 8, 8, var5, var6, 64.0F, 64.0F);
      }

      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void class_(Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9) {
      class_(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   public static void class_(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      rjV_2 var7 = var0.byte_().class_();
      var1.class_(7, ju_3.public_);
      var1.class_(var7, -var2, -var2, 0.0F).class_(0.0F, 0.0F).class_(var3).class_();
      var1.class_(var7, -var2, var2, 0.0F).class_(0.0F, 1.0F).class_(var4).class_();
      var1.class_(var7, var2, var2, 0.0F).class_(1.0F, 1.0F).class_(var5).class_();
      var1.class_(var7, var2, -var2, 0.0F).class_(1.0F, 0.0F).class_(var6).class_();
      default_.class_(var1);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((ShaderManager)class_[0]).protected_();
      float var10 = 2.0F;
      float var11 = (float)ColorHelper.byte_(var9) / 255.0F;
      float var12 = (float)ColorHelper.protected_(var9) / 255.0F;
      float var13 = (float)ColorHelper.break_(var9) / 255.0F;
      float var14 = (float)ColorHelper.throws_(var9) / 255.0F;
      ((ShaderManager)class_[0]).class_("location", var1 * var10, (float)const_.native_() - var4 * var10 - var2 * var10);
      ((ShaderManager)class_[0]).class_("rectSize", var3 * var10, var4 * var10);
      ((ShaderManager)class_[0]).class_("cornerRadii", var5 * var10, var6 * var10, var8 * var10, var7 * var10);
      ((ShaderManager)class_[0]).class_("color1", var11, var12, var13, var14);
      ((ShaderManager)class_[0]).class_("color2", var11, var12, var13, var14);
      ((ShaderManager)class_[0]).class_("color3", var11, var12, var13, var14);
      ((ShaderManager)class_[0]).class_("color4", var11, var12, var13, var14);
      ShaderManager.break_(var0, var1 - 1.0F, var2 - 1.0F, var3 + 2.0F, var4 + 2.0F);
      ((ShaderManager)class_[0]).byte_();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
   }

   public static void class_(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6) {
      rjV_2 var7 = var0.byte_().class_();
      var1.class_(var7, var2, var3 + var5, 0.0F).class_(var6).class_();
      var1.class_(var7, var2 + var4, var3 + var5, 0.0F).class_(var6).class_();
      var1.class_(var7, var2 + var4, var3, 0.0F).class_(var6).class_();
      var1.class_(var7, var2, var3, 0.0F).class_(var6).class_();
   }

   public static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, boolean var10, float var11
   ) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w().goto_()) {
         byte var12 = 3;
         byte var13 = 6;
         class_(
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

      class_(var0, var1, var2, var3, var4, var11, var11, var11, var11, ColorHelper.break_(rrZF.j_, var5));
      if (var10) {
         break_(var0, var1 - 0.5F, var2 - 0.5F, var3 + 1.0F, 12.0F, var11, var11, 0.0F, 0.0F, var6, var7, var8, var9);
      }

      break_(var0, var1 - 1.5F, var2 - 1.5F, var3 + 3.0F, var4 + 3.0F, var11 + 1.0F, var6, var7, var8, var9);
   }

   public static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      rjV_2 var13 = var0.byte_().class_();
      float var14 = 1.0F / var7;
      float var15 = 1.0F / var8;
      strictfp_.class_(7, ju_3.public_);
      strictfp_.class_(var13, var1, var2 + var6, 0.0F).class_(var3 * var14, (var4 + var6) * var15).class_(var9).class_();
      strictfp_.class_(var13, var1 + var5, var2 + var6, 0.0F).class_((var3 + var5) * var14, (var4 + var6) * var15).class_(var10).class_();
      strictfp_.class_(var13, var1 + var5, var2, 0.0F).class_((var3 + var5) * var14, var4 * var15).class_(var11).class_();
      strictfp_.class_(var13, var1, var2, 0.0F).class_(var3 * var14, var4 * var15).class_(var12).class_();
      default_.break_();
   }

   public static void class_() {
      if (!((HashMap)class_[6]).isEmpty()) {
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
               for (Integer var1x : ((HashMap)class_[6]).values()) {
                  GL11.glDeleteTextures(var1x);
               }

               ((HashMap)class_[6]).clear();
            });
         } else {
            for (Integer var1 : ((HashMap)class_[6]).values()) {
               GL11.glDeleteTextures(var1);
            }

            ((HashMap)class_[6]).clear();
         }
      }
   }

   public static void class_(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      rjV_2 var10 = var0.byte_().class_();
      var1.class_(var10, var2, var3 + var5, 0.0F).class_(var6).class_();
      var1.class_(var10, var2 + var4, var3 + var5, 0.0F).class_(var7).class_();
      var1.class_(var10, var2 + var4, var3, 0.0F).class_(var8).class_();
      var1.class_(var10, var2, var3, 0.0F).class_(var9).class_();
   }

   public static void class_(Ml_1 var0, lD_2 var1, rdn_3 var2, float var3, float var4, boolean var5, boolean var6, float var7, float var8, int var9) {
      var0.class_();
      var0.class_((double)var3, (double)var4, 0.0);
      MT.transient_();
      MT.byte_(var3, var4, 0.0F);
      MT.break_(var7, var7, var7);
      MT.volatile_();
      if (!var5) {
         Hz_1.protected_ = false;
      }

      short_.class_(var2, 0.0F, 0.0F);
      if (var6) {
         short_.class_(var0, var1, var2, 0.0F, var8, (float)var9, 255);
      }

      Hz_1.protected_ = throws_[10];
      MT.native_();
      MT.for_();
      var0.break_();
   }

   public static void class_(
      Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9, boolean var10
   ) {
      MT.transient_();
      MT.byte_(var2, var3, 0.0F);
      MT.break_(var5, var5, var5);
      MT.volatile_();
      Hz_1.protected_ = var9;
      short_.class_(var0, var1, 0.0F, 0.0F, var4);
      if (var8 > 0) {
         short_.class_(var0, var1, var6, var7, (float)var8, var4 * 255.0F);
      }

      if (var10) {
         short_.class_((cm_3)import_.class_[15], var1, 0.0F, 0.0F, null, var4);
      }

      Hz_1.protected_ = throws_[13];
      MT.native_();
      MT.for_();
   }

   public static void break_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
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

      break_(var0, var1 - 0.5F, var2 - 0.5F, var1 + 0.5F + var3, var2 + 0.5F + var4, var6);
      break_(var0, var1, var2, var1 + var3, var2 + var4, var5);
   }

   public static void break_(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      byte_(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void break_() {
      default_.break_();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
   }

   public static void break_(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((ShaderManager)class_[0]).protected_();
      float var13 = 2.0F;
      ((ShaderManager)class_[0]).class_("location", var1 * var13, (float)const_.native_() - var4 * var13 - var2 * var13);
      ((ShaderManager)class_[0]).class_("rectSize", var3 * var13, var4 * var13);
      ((ShaderManager)class_[0]).class_("cornerRadii", var5 * var13, var6 * var13, var8 * var13, var7 * var13);
      ((ShaderManager)class_[0])
         .class_(
            "color1",
            (float)ColorHelper.byte_(var9) / 255.0F,
            (float)ColorHelper.protected_(var9) / 255.0F,
            (float)ColorHelper.break_(var9) / 255.0F,
            (float)ColorHelper.throws_(var9) / 255.0F
         );
      ((ShaderManager)class_[0])
         .class_(
            "color2",
            (float)ColorHelper.byte_(var10) / 255.0F,
            (float)ColorHelper.protected_(var10) / 255.0F,
            (float)ColorHelper.break_(var10) / 255.0F,
            (float)ColorHelper.throws_(var10) / 255.0F
         );
      ((ShaderManager)class_[0])
         .class_(
            "color3",
            (float)ColorHelper.byte_(var11) / 255.0F,
            (float)ColorHelper.protected_(var11) / 255.0F,
            (float)ColorHelper.break_(var11) / 255.0F,
            (float)ColorHelper.throws_(var11) / 255.0F
         );
      ((ShaderManager)class_[0])
         .class_(
            "color4",
            (float)ColorHelper.byte_(var12) / 255.0F,
            (float)ColorHelper.protected_(var12) / 255.0F,
            (float)ColorHelper.break_(var12) / 255.0F,
            (float)ColorHelper.throws_(var12) / 255.0F
         );
      ShaderManager.break_(var0, var1 - 1.0F, var2 - 1.0F, var3 + 2.0F, var4 + 2.0F);
      ((ShaderManager)class_[0]).byte_();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
   }

   public static void break_(lD_2 var0) {
      default_.class_(var0);
      GL11.glEnable(3553);
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
   }

   public static void break_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.byte_().class_();
      strictfp_.class_(var6, var1, var4, 0.0F).class_(var5).class_();
      strictfp_.class_(var6, var3, var4, 0.0F).class_(var5).class_();
      strictfp_.class_(var6, var3, var2, 0.0F).class_(var5).class_();
      strictfp_.class_(var6, var1, var2, 0.0F).class_(var5).class_();
   }

   public static void break_(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rjV_2 var8 = var0.byte_().class_();
      MT.super_(class_((int)var4, (int)var5, var6));
      var4 += (float)(var6 * 2);
      var5 += (float)(var6 * 2);
      var2 -= (float)var6;
      var3 -= (float)var6;
      var1.class_(var8, var2, var3, 0.0F).class_(0.0F, 0.0F).class_(var7).class_();
      var1.class_(var8, var2, var3 + var5, 0.0F).class_(0.0F, 1.0F).class_(var7).class_();
      var1.class_(var8, var2 + var4, var3 + var5, 0.0F).class_(1.0F, 1.0F).class_(var7).class_();
      var1.class_(var8, var2 + var4, var3, 0.0F).class_(1.0F, 0.0F).class_(var7).class_();
   }

   public static void break_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      class_(var0, var1, var2, var3, var4, var5, 1.1F, 0.5F, var6, var7, var8, var9);
   }

   private static void throws_() {
      protected_ = new float[]{
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

   public static void throws_(lD_2 var0) {
      var0.class_(7, ju_3.this_);
   }

   public static void catch_(lD_2 var0) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.enableBlend();
      RenderSystem.enableTexture();
      RenderSystem.disableAlphaTest();
      GL11.glTexParameteri(3553, 10240, 9729);
      default_.class_(var0);
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
      RenderSystem.enableAlphaTest();
   }

   private static void catch_() {
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
      class_ = var0;
   }

   private static void case_() {
      throws_ = new boolean[]{
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

   public static void case_(lD_2 var0) {
      var0.class_(7, ju_3.public_);
   }

   private static void implements_() {
      catch_ = new byte[]{7, 7, 7, 7, 3, 20, 20, 7, 7, 7, 7, 4, 2, 2, 7, 7, 2, 2, 2, 2, 3, -1, 3, 6, 2, 2, 18, 18, 8, 8, 8, 8, 7, 7, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void protected_() {
      break_ = new double[3];
   }

   public static void protected_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.byte_().class_();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      strictfp_.class_(7, ju_3.this_);
      strictfp_.class_(var6, var1, var2 + var4, 0.0F).class_(var5).class_();
      strictfp_.class_(var6, var1 + var3, var2 + var4, 0.0F).class_(var5).class_();
      strictfp_.class_(var6, var1 + var3, var2, 0.0F).class_(var5).class_();
      strictfp_.class_(var6, var1, var2, 0.0F).class_(var5).class_();
      default_.break_();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   public static void protected_(lD_2 var0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.disableTexture();
      GL11.glEnable(2832);
      GL11.glHint(3153, 4354);
      var0.class_(0, ju_3.this_);
   }

   private static void private_() {
      byte_ = new String[]{
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

   public static void private_(lD_2 var0) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      default_.class_(var0);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
   }
}
