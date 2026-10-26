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
      id_class(
         var0,
         var1 - var5,
         var2 - var5,
         var3 + var5 * id_protected[180],
         var4 + var5 * id_protected[181],
         id_protected[182],
         id_protected[183],
         var6,
         var7,
         var8,
         var9
      );
   }

   public static void id_byte(lD_2 var0) {
      var0.id_class(id_catch[2], ju_3.id_public);
   }

   public static void id_byte(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      var1.id_class(var7, -var2, -var2, id_protected[72]).id_class(id_protected[73], id_protected[74]).id_class(var3).id_class();
      var1.id_class(var7, -var2, var2, id_protected[75]).id_class(id_protected[76], id_protected[77]).id_class(var4).id_class();
      var1.id_class(var7, var2, var2, id_protected[78]).id_class(id_protected[79], id_protected[80]).id_class(var5).id_class();
      var1.id_class(var7, var2, -var2, id_protected[81]).id_class(id_protected[82], id_protected[83]).id_class(var6).id_class();
   }

   public static void id_byte(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      RenderSystem.shadeModel(id_case[23]);
      RenderSystem.disableDepthTest();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.disableAlphaTest();
      id_strictfp.id_class(id_catch[3], ju_3.id_this);
      id_strictfp.id_class(var7, var1, var2 + var4, id_protected[28]).id_class(var5).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2 + var4, id_protected[29]).id_class(var5).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2, id_protected[30]).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1, var2, id_protected[31]).id_class(var6).id_class();
      id_default.id_break();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      RenderSystem.shadeModel(id_case[24]);
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
      float var7 = var1 + (var3 - var1) * id_protected[32];
      float var8 = var1 + (var3 - var1) * id_protected[33];
      id_strictfp.id_class(id_catch[4], ju_3.id_this);
      id_strictfp.id_class(var6, var1, var2, id_protected[34]).id_class(var5).id_class();
      byte var9 = id_catch[5];

      for (int var10 = id_throws[2]; var10 <= id_catch[6]; var10++) {
         float var11 = (float)var10 / id_protected[35];
         float var12 = id_class(var1, var7, var8, var3, var11);
         float var13 = id_class(var2, var2, var4, var4, var11);
         id_strictfp.id_class(var6, var12, var13, id_protected[36]).id_class(var5).id_class();
      }

      id_strictfp.id_class(var6, var3, var4, id_protected[37]).id_class(var5).id_class();
      GL11.glEnable(id_case[25]);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(id_protected[38]);
      RenderSystem.disableAlphaTest();
      RenderSystem.blendFunc(id_case[26], id_case[27]);
      RenderSystem.enableBlend();
      id_default.id_break();
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
      RenderSystem.enableAlphaTest();
      GL11.glDisable(id_case[28]);
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
      ((ShaderManager)id_class[id_case[107]]).id_protected();
      ((ShaderManager)id_class[id_case[108]]).id_break(id_byte[44], var3 * id_protected[250], var4 * id_protected[251]);
      ((ShaderManager)id_class[id_case[109]]).id_break(id_byte[45], var5 * id_protected[252]);
      ((ShaderManager)id_class[id_case[110]]).id_break(id_byte[46], var6);
      id_strictfp.id_class(id_catch[32], ju_3.id_synchronized);
      id_strictfp.id_class(var7, var1, var2, id_protected[253]).id_class(id_protected[254], id_protected[255]).id_class();
      id_strictfp.id_class(var7, var1, var2 + var4, id_protected[256]).id_class(id_protected[257], id_protected[258]).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2 + var4, id_protected[259]).id_class(id_protected[260], id_protected[261]).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2, id_protected[262]).id_class(id_protected[263], id_protected[264]).id_class();
      id_default.id_break();
      RenderSystem.bindTexture(id_throws[17]);
      ((ShaderManager)id_class[id_case[111]]).id_byte();
   }

   public static void id_class(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, float var7, float var8) {
      rjV_2 var9 = var0.id_byte().id_class();
      float var10 = id_protected[42] / var7;
      float var11 = id_protected[43] / var8;
      id_strictfp.id_class(id_catch[7], ju_3.id_synchronized);
      id_strictfp.id_class(var9, (float)var1, (float)(var2 + var6), id_protected[44]).id_class(var3 * var10, (var4 + (float)var6) * var11).id_class();
      id_strictfp.id_class(var9, (float)(var1 + var5), (float)(var2 + var6), id_protected[45])
         .id_class((var3 + (float)var5) * var10, (var4 + (float)var6) * var11)
         .id_class();
      id_strictfp.id_class(var9, (float)(var1 + var5), (float)var2, id_protected[46]).id_class((var3 + (float)var5) * var10, var4 * var11).id_class();
      id_strictfp.id_class(var9, (float)var1, (float)var2, id_protected[47]).id_class(var3 * var10, var4 * var11).id_class();
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
      float var12 = var3 + var5 * id_protected[186];
      float var13 = var4 + var5 * id_protected[187];
      id_class(var0, var1 - var5, var2 - var5, var12, var13, (float)var6, (float)var7, var8, var9, var10, var11);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, int var4, float var5) {
      var0.id_class();
      var0.id_class((double)var1, (double)var2, id_break[0]);
      var0.id_class(rje_3.id_case.id_byte(id_protected[84] + var3));
      var0.id_class(var5, var5, var5);
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.disableAlphaTest();
      GL11.glEnable(id_case[29]);
      GL11.glEnable(id_case[30]);
      GL11.glHint(id_case[31], id_case[32]);
      GL11.glBlendFunc(id_case[33], id_case[34]);
      rjV_2 var6 = var0.id_byte().id_class();
      id_strictfp.id_class(id_catch[11], ju_3.id_this);
      id_strictfp.id_class(var6, id_protected[85], id_protected[86], id_protected[87]).id_class(var4).id_class();
      id_strictfp.id_class(var6, id_protected[88], id_protected[89], id_protected[90]).id_class(var4).id_class();
      id_strictfp.id_class(var6, id_protected[91], id_protected[92], id_protected[93]).id_class(var4).id_class();
      id_default.id_break();
      GL11.glDisable(id_case[35]);
      GL11.glDisable(id_case[36]);
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
      RenderSystem.enableAlphaTest();
      var0.id_break();
   }

   public static void id_class(Ml_1 var0, double var1, double var3, float var5, int var6, float var7) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(id_case[85], id_case[86]);
      RenderSystem.disableTexture();
      GL11.glEnable(id_case[87]);
      GL11.glHint(id_case[88], id_case[89]);
      GL11.glPointSize(var5 * id_protected[222] * var7);
      id_strictfp.id_class(id_throws[7], ju_3.id_this);
      id_strictfp.id_class(var0.id_byte().id_class(), (float)var1, (float)var3, id_protected[223]).id_class(var6).id_class();
      id_default.id_break();
      GL11.glEnable(id_case[90]);
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
      ((ShaderManager)id_class[id_case[66]]).id_class();
      ((ShaderManager)id_class[id_case[67]]).id_break(id_byte[23], var3);
      ((ShaderManager)id_class[id_case[68]]).id_break(id_byte[24], var4);
      ((ShaderManager)id_class[id_case[69]]).id_break(id_byte[25], var5);
      ((ShaderManager)id_class[id_case[70]]).id_break(id_byte[26], var6);
      ((ShaderManager)id_class[id_case[71]])
         .id_break(
            id_byte[27],
            (float)ColorHelper.id_byte(var7) / id_protected[191],
            (float)ColorHelper.id_protected(var7) / id_protected[192],
            (float)ColorHelper.id_break(var7) / id_protected[193],
            (float)ColorHelper.id_throws(var7) / id_protected[194]
         );
      ((ShaderManager)id_class[id_case[72]])
         .id_break(
            id_byte[28],
            (float)ColorHelper.id_byte(var8) / id_protected[195],
            (float)ColorHelper.id_protected(var8) / id_protected[196],
            (float)ColorHelper.id_break(var8) / id_protected[197],
            (float)ColorHelper.id_throws(var8) / id_protected[198]
         );
      ((ShaderManager)id_class[id_case[73]])
         .id_break(
            id_byte[29],
            (float)ColorHelper.id_byte(var9) / id_protected[199],
            (float)ColorHelper.id_protected(var9) / id_protected[200],
            (float)ColorHelper.id_break(var9) / id_protected[201],
            (float)ColorHelper.id_throws(var9) / id_protected[202]
         );
      ((ShaderManager)id_class[id_case[74]])
         .id_break(
            id_byte[30],
            (float)ColorHelper.id_byte(var10) / id_protected[203],
            (float)ColorHelper.id_protected(var10) / id_protected[204],
            (float)ColorHelper.id_break(var10) / id_protected[205],
            (float)ColorHelper.id_throws(var10) / id_protected[206]
         );
      ShaderManager.id_break(
         var0,
         var1 - id_protected[207] - var6,
         var2 - id_protected[208] - var6,
         var3 + id_protected[209] + var6 * id_protected[210],
         var4 + id_protected[211] + var6 * id_protected[212]
      );
      ((ShaderManager)id_class[id_case[75]]).id_break();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, id_protected[168]);
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, int var11
   ) {
      rrfa_3.id_class();
      RenderSystem.disableAlphaTest();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(id_case[46], id_case[47]);
      ((ShaderManager)id_class[id_case[48]]).id_class();
      ((ShaderManager)id_class[id_case[49]]).id_break(id_byte[14], var3);
      ((ShaderManager)id_class[id_case[50]]).id_break(id_byte[15], var4);
      ((ShaderManager)id_class[id_case[51]]).id_break(id_byte[16], var5);
      ((ShaderManager)id_class[id_case[52]]).id_break(id_byte[17], var6);
      ((ShaderManager)id_class[id_case[53]]).id_break(id_byte[18], id_protected[119], var7);
      ((ShaderManager)id_class[id_case[54]])
         .id_break(
            id_byte[19],
            (float)ColorHelper.id_byte(var8) / id_protected[120],
            (float)ColorHelper.id_protected(var8) / id_protected[121],
            (float)ColorHelper.id_break(var8) / id_protected[122],
            (float)ColorHelper.id_throws(var8) / id_protected[123]
         );
      ((ShaderManager)id_class[id_case[55]])
         .id_break(
            id_byte[20],
            (float)ColorHelper.id_byte(var9) / id_protected[124],
            (float)ColorHelper.id_protected(var9) / id_protected[125],
            (float)ColorHelper.id_break(var9) / id_protected[126],
            (float)ColorHelper.id_throws(var9) / id_protected[127]
         );
      ((ShaderManager)id_class[id_case[56]])
         .id_break(
            id_byte[21],
            (float)ColorHelper.id_byte(var10) / id_protected[128],
            (float)ColorHelper.id_protected(var10) / id_protected[129],
            (float)ColorHelper.id_break(var10) / id_protected[130],
            (float)ColorHelper.id_throws(var10) / id_protected[131]
         );
      ((ShaderManager)id_class[id_case[57]])
         .id_break(
            id_byte[22],
            (float)ColorHelper.id_byte(var11) / id_protected[132],
            (float)ColorHelper.id_protected(var11) / id_protected[133],
            (float)ColorHelper.id_break(var11) / id_protected[134],
            (float)ColorHelper.id_throws(var11) / id_protected[135]
         );
      ShaderManager.id_break(var0, var1 - id_protected[136], var2 - id_protected[137], var3 + id_protected[138], var4 + id_protected[139]);
      ((ShaderManager)id_class[id_case[58]]).id_break();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      RenderSystem.enableTexture();
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.alphaFunc(id_case[59], id_protected[142]);
      MT.id_super(id_class((int)var3, (int)var4, var5));
      var3 += (float)(var5 * id_catch[12]);
      var4 += (float)(var5 * id_catch[13]);
      var1 -= (float)var5;
      var2 -= (float)var5;
      id_strictfp.id_class(id_catch[14], ju_3.id_public);
      id_strictfp.id_class(var7, var1, var2, id_protected[143]).id_class(id_protected[144], id_protected[145]).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1, var2 + var4, id_protected[146]).id_class(id_protected[147], id_protected[148]).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2 + var4, id_protected[149]).id_class(id_protected[150], id_protected[151]).id_class(var6).id_class();
      id_strictfp.id_class(var7, var1 + var3, var2, id_protected[152]).id_class(id_protected[153], id_protected[154]).id_class(var6).id_class();
      id_default.id_break();
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, int var5, float var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      GL11.glPointSize(var4 * id_protected[224] * var6);
      var1.id_class(var7, var2, var3, id_protected[225]).id_class(var5).id_class();
   }

   public static void id_class(Ml_1 var0, iB_2 var1, float var2, float var3, int var4, int var5, float var6, float var7, float var8, int var9) {
      rqO_2 var10 = id_import.id_case().id_class(var1).id_class(var1);
      id_import.A().id_class(var10);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableAlphaTest();
      rrfa_3.id_class();
      ((ShaderManager)id_class[id_case[99]]).id_protected();
      ((ShaderManager)id_class[id_case[100]]).id_break(id_byte[38], (float)var4);
      ((ShaderManager)id_class[id_case[101]]).id_break(id_byte[39], (float)var5);
      ((ShaderManager)id_class[id_case[102]]).id_break(id_byte[40], var6);
      ((ShaderManager)id_class[id_case[103]]).id_break(id_byte[41], var7);
      ((ShaderManager)id_class[id_case[104]]).id_break(id_byte[42], var8);
      ((ShaderManager)id_class[id_case[105]])
         .id_class(
            id_byte[43],
            (float)ColorHelper.id_byte(var9) / id_protected[236],
            (float)ColorHelper.id_protected(var9) / id_protected[237],
            (float)ColorHelper.id_break(var9) / id_protected[238]
         );
      ShaderManager.id_break(var0, var2, var3, (float)var4, (float)var5);
      ((ShaderManager)id_class[id_case[106]]).id_byte();
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      rjV_2 var11 = var0.id_byte().id_class();
      float var12 = id_protected[265] / var9;
      float var13 = id_protected[266] / var10;
      id_strictfp.id_class(id_catch[33], ju_3.id_synchronized);
      id_strictfp.id_class(var11, var1, var2 + (float)var8, id_protected[267]).id_class(var3 * var12, (var4 + (float)var6) * var13).id_class();
      id_strictfp.id_class(var11, var1 + (float)var7, var2 + (float)var8, id_protected[268])
         .id_class((var3 + (float)var5) * var12, (var4 + (float)var6) * var13)
         .id_class();
      id_strictfp.id_class(var11, var1 + (float)var7, var2, id_protected[269]).id_class((var3 + (float)var5) * var12, var4 * var13).id_class();
      id_strictfp.id_class(var11, var1, var2, id_protected[270]).id_class(var3 * var12, var4 * var13).id_class();
      id_default.id_break();
   }

   public static void id_class(Ml_1 var0, rLR var1, float var2, float var3, float var4) {
      var0.id_class();
      fj_3 var5 = id_import.id_abstract().id_class(var1);
      id_static.id_class(var5.id_extends().id_protected());
      var0.id_class((double)var2, (double)var3, id_break[2]);
      var0.id_class(var4, var4, var4);
      ch_3.id_class(var0, id_throws[14], id_throws[15], id_throws[16], id_catch[26], id_catch[27], var5);
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
      float var17 = var3 + var5 * id_protected[184];
      float var18 = var4 + var5 * id_protected[185];
      id_class(var0, var1 - var5, var2 - var5, var17, var18, (float)var6, (float)var7, var13, var14, var15, var16);
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11
   ) {
      int var12 = ColorHelper.id_break(var7, var11);
      int var13 = ColorHelper.id_break(var8, var11);
      int var14 = ColorHelper.id_break(var9, var11);
      int var15 = ColorHelper.id_break(var10, var11);
      float var16 = var3 + var5 * id_protected[188];
      float var17 = var4 + var5 * id_protected[189];
      id_class(var0, var1 - var5, var2 - var5, var16, var17, id_protected[190], var6, var12, var13, var14, var15);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      id_class(var0, id_strictfp, var1, var2, var3, var4, var5);
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(id_case[15], id_case[16]);
      rrfa_3.id_class(var6);
      id_import.A().id_class(var1);
      GL11.glTexParameteri(id_case[17], id_case[18], id_case[19]);
      id_class(var0, var2, var3, id_protected[24], id_protected[25], var4, var5, var4, var5);
      RenderSystem.disableBlend();
      rrfa_3.id_class();
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.disableAlphaTest();
      RenderSystem.depthMask(id_throws[0]);
      id_import.A().id_class(var1);
      GL11.glTexParameteri(id_case[20], id_case[21], id_case[22]);
      id_class(var0, var2, var3, id_protected[26], id_protected[27], var4, var5, var4, var5, var6, var7, var8, var9);
      RenderSystem.enableAlphaTest();
      RenderSystem.depthMask(id_throws[1]);
      RenderSystem.disableSmoothShadeModel();
   }

   public static void id_class(lD_2 var0) {
      RenderSystem.enableTexture();
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.alphaFunc(id_case[60], id_protected[155]);
      id_default.id_class(var0);
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
   }

   private static rfl_3 id_class(rfl_3 var0, rpr_3 var1) {
      return switch (((int[])rrfU_2.id_class[id_case[112]])[var1.ordinal()]) {
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
      int var3 = (var0 * id_case[61] + var1) * id_case[62] + var2;
      Integer var4 = (Integer)((HashMap)id_class[id_case[63]]).get(var3);
      if (var4 != null) {
         return var4;
      } else {
         BufferedImage var5 = new BufferedImage(var0 + var2 * id_catch[18], var1 + var2 * id_catch[19], id_catch[20]);
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
      float var10 = id_protected[48] / var7;
      float var11 = id_protected[49] / var8;
      id_strictfp.id_class(id_catch[8], ju_3.id_synchronized);
      id_strictfp.id_class(var9, var1, var2 + var6, id_protected[50]).id_class(var3 * var10, (var4 + var6) * var11).id_class();
      id_strictfp.id_class(var9, var1 + var5, var2 + var6, id_protected[51]).id_class((var3 + var5) * var10, (var4 + var6) * var11).id_class();
      id_strictfp.id_class(var9, var1 + var5, var2, id_protected[52]).id_class((var3 + var5) * var10, var4 * var11).id_class();
      id_strictfp.id_class(var9, var1, var2, id_protected[53]).id_class(var3 * var10, var4 * var11).id_class();
      id_default.id_break();
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, int var4) {
      rjV_2 var5 = var0.id_byte().id_class();
      id_strictfp.id_class(var5, var1, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[271], var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[272], var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[273], var2, var3 + id_protected[274]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[275], var2, var3 + id_protected[276]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3 + id_protected[277]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3 + id_protected[278]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + id_protected[279], var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[280], var2 + id_protected[281], var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[282], var2 + id_protected[283], var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[284], var2 + id_protected[285], var3 + id_protected[286]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[287], var2 + id_protected[288], var3 + id_protected[289]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + id_protected[290], var3 + id_protected[291]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + id_protected[292], var3 + id_protected[293]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + id_protected[294], var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[295], var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[296], var2 + id_protected[297], var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[298], var2, var3 + id_protected[299]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1 + id_protected[300], var2 + id_protected[301], var3 + id_protected[302]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3 + id_protected[303]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + id_protected[304], var3 + id_protected[305]).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2, var3).id_class(var4).id_class();
      id_strictfp.id_class(var5, var1, var2 + id_protected[306], var3).id_class(var4).id_class();
   }

   private static float id_class(float var0, float var1, float var2, float var3, float var4) {
      float var5 = id_protected[39] - var4;
      float var6 = var4 * var4;
      float var7 = var5 * var5;
      float var8 = var7 * var5;
      float var9 = var6 * var4;
      float var10 = var8 * var0;
      var10 += id_protected[40] * var7 * var4 * var1;
      var10 += id_protected[41] * var5 * var6 * var2;
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
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var8, id_throws[11]);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      rrfa_3.id_class();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      ((ShaderManager)id_class[id_case[6]]).id_class();
      ((ShaderManager)id_class[id_case[7]]).id_break(id_byte[0], var3);
      ((ShaderManager)id_class[id_case[8]]).id_break(id_byte[1], var4);
      ((ShaderManager)id_class[id_case[9]]).id_break(id_byte[2], var5);
      ((ShaderManager)id_class[id_case[10]])
         .id_break(
            id_byte[3],
            (float)ColorHelper.id_byte(var6) / id_protected[8],
            (float)ColorHelper.id_protected(var6) / id_protected[9],
            (float)ColorHelper.id_break(var6) / id_protected[10],
            (float)ColorHelper.id_throws(var6) / id_protected[11]
         );
      ((ShaderManager)id_class[id_case[11]])
         .id_break(
            id_byte[4],
            (float)ColorHelper.id_byte(var7) / id_protected[12],
            (float)ColorHelper.id_protected(var7) / id_protected[13],
            (float)ColorHelper.id_break(var7) / id_protected[14],
            (float)ColorHelper.id_throws(var7) / id_protected[15]
         );
      ((ShaderManager)id_class[id_case[12]])
         .id_break(
            id_byte[5],
            (float)ColorHelper.id_byte(var8) / id_protected[16],
            (float)ColorHelper.id_protected(var8) / id_protected[17],
            (float)ColorHelper.id_break(var8) / id_protected[18],
            (float)ColorHelper.id_throws(var8) / id_protected[19]
         );
      ((ShaderManager)id_class[id_case[13]])
         .id_break(
            id_byte[6],
            (float)ColorHelper.id_byte(var9) / id_protected[20],
            (float)ColorHelper.id_protected(var9) / id_protected[21],
            (float)ColorHelper.id_break(var9) / id_protected[22],
            (float)ColorHelper.id_throws(var9) / id_protected[23]
         );
      ShaderManager.id_break(var0, var1, var2, var3, var4);
      ((ShaderManager)id_class[id_case[14]]).id_break();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, rqO_2 var1, boolean var2, float var3, float var4, int var5, int var6, float var7) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableAlphaTest();
      id_import.A().id_class(var1);
      RenderSystem.color4f(id_protected[239], id_protected[240], id_protected[241], var7);
      id_class(var0, var3, var4, id_protected[242], id_protected[243], id_catch[28], id_catch[29], var5, var6, id_protected[244], id_protected[245]);
      if (var2) {
         id_class(var0, var3, var4, id_protected[246], id_protected[247], id_catch[30], id_catch[31], var5, var6, id_protected[248], id_protected[249]);
      }

      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public static void id_class(Ml_1 var0, rdn_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9) {
      id_class(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, id_throws[12]);
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, int var3, int var4, int var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      var1.id_class(id_catch[10], ju_3.id_public);
      var1.id_class(var7, -var2, -var2, id_protected[60]).id_class(id_protected[61], id_protected[62]).id_class(var3).id_class();
      var1.id_class(var7, -var2, var2, id_protected[63]).id_class(id_protected[64], id_protected[65]).id_class(var4).id_class();
      var1.id_class(var7, var2, var2, id_protected[66]).id_class(id_protected[67], id_protected[68]).id_class(var5).id_class();
      var1.id_class(var7, var2, -var2, id_protected[69]).id_class(id_protected[70], id_protected[71]).id_class(var6).id_class();
      id_default.id_class(var1);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((ShaderManager)id_class[id_case[76]]).id_protected();
      float var10 = id_protected[213];
      float var11 = (float)ColorHelper.id_byte(var9) / id_protected[214];
      float var12 = (float)ColorHelper.id_protected(var9) / id_protected[215];
      float var13 = (float)ColorHelper.id_break(var9) / id_protected[216];
      float var14 = (float)ColorHelper.id_throws(var9) / id_protected[217];
      ((ShaderManager)id_class[id_case[77]]).id_class(id_byte[31], var1 * var10, (float)id_const.id_native() - var4 * var10 - var2 * var10);
      ((ShaderManager)id_class[id_case[78]]).id_class(id_byte[32], var3 * var10, var4 * var10);
      ((ShaderManager)id_class[id_case[79]]).id_class(id_byte[33], var5 * var10, var6 * var10, var8 * var10, var7 * var10);
      ((ShaderManager)id_class[id_case[80]]).id_class(id_byte[34], var11, var12, var13, var14);
      ((ShaderManager)id_class[id_case[81]]).id_class(id_byte[35], var11, var12, var13, var14);
      ((ShaderManager)id_class[id_case[82]]).id_class(id_byte[36], var11, var12, var13, var14);
      ((ShaderManager)id_class[id_case[83]]).id_class(id_byte[37], var11, var12, var13, var14);
      ShaderManager.id_break(var0, var1 - id_protected[218], var2 - id_protected[219], var3 + id_protected[220], var4 + id_protected[221]);
      ((ShaderManager)id_class[id_case[84]]).id_byte();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6) {
      rjV_2 var7 = var0.id_byte().id_class();
      var1.id_class(var7, var2, var3 + var5, id_protected[4]).id_class(var6).id_class();
      var1.id_class(var7, var2 + var4, var3 + var5, id_protected[5]).id_class(var6).id_class();
      var1.id_class(var7, var2 + var4, var3, id_protected[6]).id_class(var6).id_class();
      var1.id_class(var7, var2, var3, id_protected[7]).id_class(var6).id_class();
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9, boolean var10, float var11
   ) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[65]]).id_private().w().id_goto()) {
         byte var12 = id_catch[22];
         byte var13 = id_catch[23];
         id_class(
            var0,
            var1 - (float)var12,
            var2 - (float)var12,
            var3 + (float)(var12 * id_catch[24]),
            var4 + (float)(var12 * id_catch[25]),
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
         id_break(
            var0,
            var1 - id_protected[169],
            var2 - id_protected[170],
            var3 + id_protected[171],
            id_protected[172],
            var11,
            var11,
            id_protected[173],
            id_protected[174],
            var6,
            var7,
            var8,
            var9
         );
      }

      id_break(
         var0,
         var1 - id_protected[175],
         var2 - id_protected[176],
         var3 + id_protected[177],
         var4 + id_protected[178],
         var11 + id_protected[179],
         var6,
         var7,
         var8,
         var9
      );
   }

   public static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      rjV_2 var13 = var0.id_byte().id_class();
      float var14 = id_protected[54] / var7;
      float var15 = id_protected[55] / var8;
      id_strictfp.id_class(id_catch[9], ju_3.id_public);
      id_strictfp.id_class(var13, var1, var2 + var6, id_protected[56]).id_class(var3 * var14, (var4 + var6) * var15).id_class(var9).id_class();
      id_strictfp.id_class(var13, var1 + var5, var2 + var6, id_protected[57]).id_class((var3 + var5) * var14, (var4 + var6) * var15).id_class(var10).id_class();
      id_strictfp.id_class(var13, var1 + var5, var2, id_protected[58]).id_class((var3 + var5) * var14, var4 * var15).id_class(var11).id_class();
      id_strictfp.id_class(var13, var1, var2, id_protected[59]).id_class(var3 * var14, var4 * var15).id_class(var12).id_class();
      id_default.id_break();
   }

   public static void id_class() {
      if (!((HashMap)id_class[id_case[0]]).isEmpty()) {
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
               for (Integer var1x : ((HashMap)id_class[id_case[113]]).values()) {
                  GL11.glDeleteTextures(var1x);
               }

               ((HashMap)id_class[id_case[114]]).clear();
            });
         } else {
            for (Integer var1 : ((HashMap)id_class[id_case[1]]).values()) {
               GL11.glDeleteTextures(var1);
            }

            ((HashMap)id_class[id_case[2]]).clear();
         }
      }
   }

   public static void id_class(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      rjV_2 var10 = var0.id_byte().id_class();
      var1.id_class(var10, var2, var3 + var5, id_protected[94]).id_class(var6).id_class();
      var1.id_class(var10, var2 + var4, var3 + var5, id_protected[95]).id_class(var7).id_class();
      var1.id_class(var10, var2 + var4, var3, id_protected[96]).id_class(var8).id_class();
      var1.id_class(var10, var2, var3, id_protected[97]).id_class(var9).id_class();
   }

   public static void id_class(Ml_1 var0, lD_2 var1, rdn_3 var2, float var3, float var4, boolean var5, boolean var6, float var7, float var8, int var9) {
      var0.id_class();
      var0.id_class((double)var3, (double)var4, id_break[1]);
      MT.id_transient();
      MT.id_byte(var3, var4, id_protected[226]);
      MT.id_break(var7, var7, var7);
      MT.id_volatile();
      if (!var5) {
         Hz_1.id_protected = id_throws[9];
      }

      id_short.id_class(var2, id_protected[227], id_protected[228]);
      if (var6) {
         id_short.id_class(var0, var1, var2, id_protected[229], var8, (float)var9, id_case[97]);
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
      MT.id_byte(var2, var3, id_protected[230]);
      MT.id_break(var5, var5, var5);
      MT.id_volatile();
      Hz_1.id_protected = var9;
      id_short.id_class(var0, var1, id_protected[231], id_protected[232], var4);
      if (var8 > 0) {
         id_short.id_class(var0, var1, var6, var7, (float)var8, var4 * id_protected[233]);
      }

      if (var10) {
         id_short.id_class((cm_3)id_import.id_class[id_case[98]], var1, id_protected[234], id_protected[235], null, var4);
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

      id_break(var0, var1 - id_protected[307], var2 - id_protected[308], var1 + id_protected[309] + var3, var2 + id_protected[310] + var4, var6);
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
      ((ShaderManager)id_class[id_case[37]]).id_protected();
      float var13 = id_protected[98];
      ((ShaderManager)id_class[id_case[38]]).id_class(id_byte[7], var1 * var13, (float)id_const.id_native() - var4 * var13 - var2 * var13);
      ((ShaderManager)id_class[id_case[39]]).id_class(id_byte[8], var3 * var13, var4 * var13);
      ((ShaderManager)id_class[id_case[40]]).id_class(id_byte[9], var5 * var13, var6 * var13, var8 * var13, var7 * var13);
      ((ShaderManager)id_class[id_case[41]])
         .id_class(
            id_byte[10],
            (float)ColorHelper.id_byte(var9) / id_protected[99],
            (float)ColorHelper.id_protected(var9) / id_protected[100],
            (float)ColorHelper.id_break(var9) / id_protected[101],
            (float)ColorHelper.id_throws(var9) / id_protected[102]
         );
      ((ShaderManager)id_class[id_case[42]])
         .id_class(
            id_byte[11],
            (float)ColorHelper.id_byte(var10) / id_protected[103],
            (float)ColorHelper.id_protected(var10) / id_protected[104],
            (float)ColorHelper.id_break(var10) / id_protected[105],
            (float)ColorHelper.id_throws(var10) / id_protected[106]
         );
      ((ShaderManager)id_class[id_case[43]])
         .id_class(
            id_byte[12],
            (float)ColorHelper.id_byte(var11) / id_protected[107],
            (float)ColorHelper.id_protected(var11) / id_protected[108],
            (float)ColorHelper.id_break(var11) / id_protected[109],
            (float)ColorHelper.id_throws(var11) / id_protected[110]
         );
      ((ShaderManager)id_class[id_case[44]])
         .id_class(
            id_byte[13],
            (float)ColorHelper.id_byte(var12) / id_protected[111],
            (float)ColorHelper.id_protected(var12) / id_protected[112],
            (float)ColorHelper.id_break(var12) / id_protected[113],
            (float)ColorHelper.id_throws(var12) / id_protected[114]
         );
      ShaderManager.id_break(var0, var1 - id_protected[115], var2 - id_protected[116], var3 + id_protected[117], var4 + id_protected[118]);
      ((ShaderManager)id_class[id_case[45]]).id_byte();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
   }

   public static void id_break(lD_2 var0) {
      id_default.id_class(var0);
      GL11.glEnable(id_case[96]);
      RenderSystem.disableBlend();
      RenderSystem.enableTexture();
   }

   public static void id_break(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      rjV_2 var6 = var0.id_byte().id_class();
      id_strictfp.id_class(var6, var1, var4, id_protected[311]).id_class(var5).id_class();
      id_strictfp.id_class(var6, var3, var4, id_protected[312]).id_class(var5).id_class();
      id_strictfp.id_class(var6, var3, var2, id_protected[313]).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1, var2, id_protected[314]).id_class(var5).id_class();
   }

   public static void id_break(Ml_1 var0, lD_2 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rjV_2 var8 = var0.id_byte().id_class();
      MT.id_super(id_class((int)var4, (int)var5, var6));
      var4 += (float)(var6 * id_catch[16]);
      var5 += (float)(var6 * id_catch[17]);
      var2 -= (float)var6;
      var3 -= (float)var6;
      var1.id_class(var8, var2, var3, id_protected[156]).id_class(id_protected[157], id_protected[158]).id_class(var7).id_class();
      var1.id_class(var8, var2, var3 + var5, id_protected[159]).id_class(id_protected[160], id_protected[161]).id_class(var7).id_class();
      var1.id_class(var8, var2 + var4, var3 + var5, id_protected[162]).id_class(id_protected[163], id_protected[164]).id_class(var7).id_class();
      var1.id_class(var8, var2 + var4, var3, id_protected[165]).id_class(id_protected[166], id_protected[167]).id_class(var7).id_class();
   }

   public static void id_break(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      id_class(var0, var1, var2, var3, var4, var5, id_protected[140], id_protected[141], var6, var7, var8, var9);
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
      var0.id_class(id_catch[1], ju_3.id_this);
   }

   public static void id_catch(lD_2 var0) {
      RenderSystem.enableSmoothShadeModel();
      RenderSystem.enableBlend();
      RenderSystem.enableTexture();
      RenderSystem.disableAlphaTest();
      GL11.glTexParameteri(id_case[3], id_case[4], id_case[5]);
      id_default.id_class(var0);
      RenderSystem.disableTexture();
      RenderSystem.disableBlend();
      RenderSystem.disableSmoothShadeModel();
      RenderSystem.enableAlphaTest();
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new ShaderManager(id_byte[47], true),
         new ShaderManager(id_byte[48], false),
         new ShaderManager(id_byte[49], false),
         new ShaderManager(id_byte[50], false),
         new ShaderManager(id_byte[51], false),
         new ShaderManager(id_byte[52], false),
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
      var0.id_class(id_catch[15], ju_3.id_public);
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
      id_strictfp.id_class(id_catch[0], ju_3.id_this);
      id_strictfp.id_class(var6, var1, var2 + var4, id_protected[0]).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1 + var3, var2 + var4, id_protected[1]).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1 + var3, var2, id_protected[2]).id_class(var5).id_class();
      id_strictfp.id_class(var6, var1, var2, id_protected[3]).id_class(var5).id_class();
      id_default.id_break();
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   public static void id_protected(lD_2 var0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(id_case[91], id_case[92]);
      RenderSystem.disableTexture();
      GL11.glEnable(id_case[93]);
      GL11.glHint(id_case[94], id_case[95]);
      var0.id_class(id_throws[8], ju_3.id_this);
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
