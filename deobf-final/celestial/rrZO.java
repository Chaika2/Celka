package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZO extends rrZb_1 {
   private static String[] protected_;
   private static float[] throws_;
   private static boolean[] case_;
   private static int[] catch_;
   public Object[] break_;
   private static short[] private_;
   private static double[] implements_;
   public static Object[] byte_;
   private static byte[] finally_;

   public void byte_(lD_2 var1) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.enableTexture();
      RenderSystem.bindTexture(((fk_3)this.class_[10]).new_());
      default_.class_(var1);
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{30, -45, 0, 18, -34, -74, 28, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float byte_(Ml_1 var1, String var2, float var3, float var4, int var5) {
      return this.break_(var1, var2, (double)var3, (double)var4, var5, false, true);
   }

   public float byte_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      return this.protected_(var1, var2, var3 - this.break_(var2) / 2.0F, var4, var5, var6);
   }

   public void byte_(Ml_1 var1, lD_2 var2, String var3, double var4, double var6, int var8, boolean var9, boolean var10) {
      this.protected_(var1, var2, var3, var4 - 0.5, var6, -16777216, var9, var10);
      this.protected_(var1, var2, var3, var4 + 0.5, var6, -16777216, var9, var10);
      this.protected_(var1, var2, var3, var4, var6 - 0.5, -16777216, var9, var10);
      this.protected_(var1, var2, var3, var4, var6 + 0.5, -16777216, var9, var10);
      this.protected_(var1, var2, var3, var4, var6, var8, var9, var10);
   }

   public rrZO(Font var1, rrZx_1 var2, boolean var3, boolean var4, boolean var5) {
      super(var1, var2, var3, var4, var5);
      this.case_();
      int[] var15 = new int[32];
      this.break_[0] = var15;

      for (int var6 = 0; var6 < 32; var6++) {
         int var7 = (var6 >> 3 & 1) * 85;
         int var8 = (var6 >> 2 & 1) * 170 + var7;
         int var9 = (var6 >> 1 & 1) * 170 + var7;
         int var10 = (var6 & 1) * 170 + var7;
         if (var6 == 6) {
            var8 += 85;
         }

         if (var6 >= 16) {
            var8 /= 4;
            var9 /= 4;
            var10 /= 4;
         }

         ((int[])this.break_[0])[var6] = (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
      }
   }

   static {
      ntfClinit();
   }

   public void class_(Ml_1 var1, String var2, float var3, float var4, int var5, float var6, float var7, float var8) {
      float var9 = rrfa_3.class_(var1);
      ((ShaderManager)byte_[0]).class_();
      ((ShaderManager)byte_[0])
         .break_(
            "inColor",
            (float)(var5 >> 16 & 0xFF) / 255.0F,
            (float)(var5 >> 8 & 0xFF) / 255.0F,
            (float)(var5 & 0xFF) / 255.0F,
            (float)(var5 >> 24 & 0xFF) / 255.0F
         );
      ((ShaderManager)byte_[0]).break_("width", var6 * var9);
      ((ShaderManager)byte_[0]).break_("maxWidth", (var3 + var6 * var9) * 2.0F);
      ((ShaderManager)byte_[0]).break_("smoothness", var7 * var9);
      ((ShaderManager)byte_[0]).break_("startCutoff", var8 * var9);
      this.break_(var1, var2, (double)var3, (double)var4, var5, false, false);
      ((ShaderManager)byte_[0]).break_();
   }

   public float class_(Ml_1 var1, lD_2 var2, String var3, float var4, float var5, int var6, boolean var7) {
      return this.break_(var1, var2, var3, (double)(var4 - this.break_(var3) / 2.0F), (double)var5, var6, false, var7);
   }

   public float class_(Ml_1 var1, lD_2 var2, String var3, double var4, double var6, int var8) {
      float var9 = this.break_(var1, var2, var3, var4 + 0.5, var6 + 0.5, var8, true, false);
      return Math.max(var9, this.break_(var1, var2, var3, var4, var6, var8, false, false));
   }

   public void class_(Ml_1 var1, String var2, float var3, float var4, int var5, float var6) {
      float var7 = rrfa_3.class_(var1);
      ((ShaderManager)byte_[0]).class_();
      ((ShaderManager)byte_[0])
         .break_(
            "inColor",
            (float)(var5 >> 16 & 0xFF) / 255.0F,
            (float)(var5 >> 8 & 0xFF) / 255.0F,
            (float)(var5 & 0xFF) / 255.0F,
            (float)(var5 >> 24 & 0xFF) / 255.0F
         );
      ((ShaderManager)byte_[0]).break_("width", var6 * var7);
      ((ShaderManager)byte_[0]).break_("maxWidth", (var3 + var6 * var7) * 2.0F);
      ((ShaderManager)byte_[0]).break_("smoothness", 1.0F * var7);
      ((ShaderManager)byte_[0]).break_("startCutoff", 0.5F * var7);
      this.break_(var1, var2, (double)var3, (double)var4, var5, false, false);
      ((ShaderManager)byte_[0]).break_();
   }

   public void class_(Ml_1 var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9) {
      this.case_();
      if (var2 != null) {
         var3--;
         rrfa_3.class_();
         if (var9) {
            if (var7 == 553648127) {
               var7 = -1;
            }

            if ((var7 & -67108864) == 0) {
               var7 |= -16777216;
            }
         }

         if (var8) {
            var7 = (var7 & 16579836) >> 2 | var7 & -938208236;
         }

         float var11 = (float)(var7 >> 16 & 0xFF) / 255.0F;
         float var12 = (float)(var7 >> 8 & 0xFF) / 255.0F;
         float var13 = (float)(var7 & 0xFF) / 255.0F;
         float var14 = (float)(var7 >> 24 & 0xFF) / 255.0F;
         var3 *= 2.0;
         var5 = (var5 - 3.0) * 2.0;
         var1.class_();
         var1.class_(0.5F, 0.5F, 0.5F);
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableTexture();
         MT.super_(((fk_3)this.class_[10]).new_());
         MinecraftAccessor.strictfp_.class_(7, ju_3.public_);
         float var10 = (float)var3;
         float var15 = (float)var5;
         int var16 = var2.length();

         for (int var17 = 0; var17 < var16; var17++) {
            char var18 = var2.charAt(var17);
            if (var18 == 167 && var17 < var16 - 1) {
               if (var7 != -16777216) {
                  char var25 = var2.charAt(var17 + 1);
                  int var26 = "0123456789abcdefklmnor".indexOf(var25);
                  if (var25 == 'r') {
                     var11 = (float)(var7 >> 16 & 0xFF) / 255.0F;
                     var12 = (float)(var7 >> 8 & 0xFF) / 255.0F;
                     var13 = (float)(var7 & 0xFF) / 255.0F;
                  } else if (var26 < 16) {
                     if (var26 < 0) {
                        var26 = 15;
                     }

                     if (var8) {
                        var26 += 16;
                     }

                     int var21 = ((int[])this.break_[0])[var26];
                     var11 = (float)(var21 >> 16 & 0xFF) / 255.0F;
                     var12 = (float)(var21 >> 8 & 0xFF) / 255.0F;
                     var13 = (float)(var21 & 0xFF) / 255.0F;
                  }
               }

               var17++;
            } else {
               rrZM var19 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var18, (rrZM)this.class_[2]);
               if (var19 != null) {
                  float var20 = (float)((Integer)var19.class_[2] - 8 + (Integer)this.class_[8]);
                  if (var18 == '\n') {
                     var10 = (float)var3;
                     var15 += (float)((Integer)var19.class_[3]).intValue();
                  } else {
                     this.class_(var1, var18, var10, var15, var11, var12, var13, var14);
                     var10 += var20;
                  }
               }
            }
         }

         default_.break_();
         var1.break_();
      }
   }

   public float class_(Ml_1 var1, rgP_2 var2, double var3, double var5, int var7, int var8) {
      if (var2 == null) {
         return 0.0F;
      } else {
         var1.class_();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableTexture();
         RenderSystem.bindTexture(((fk_3)this.class_[10]).new_());
         MinecraftAccessor.strictfp_.class_(7, ju_3.public_);
         var1.class_(0.5F, 0.5F, 0.5F);
         var3 = --var3 * 2.0;
         var5 = (var5 - 3.0) * 2.0;
         float var9 = (float)var3;
         float var10 = (float)var5;
         var2.catch_().accept(new rrZh_1(this, var9, var7, var1, var10, var8));
         default_.break_();
         var1.break_();
         return (float)var3 / 2.0F;
      }
   }

   public void class_(Ml_1 var1, String var2, double var3, double var5, int var7, float var8, boolean var9, boolean var10) {
      this.case_();
      if (var2 != null) {
         var1.class_(0.5F, 0.5F, 0.0F);
         var3--;
         if (var10) {
            if (var7 == 553648127) {
               var7 = 16777215;
            }

            if ((var7 & -67108864) == 0) {
               var7 |= -16777216;
            }
         }

         if (var9) {
            var7 = (var7 & 16579836) >> 2 | var7 & -938208236;
         }

         float var12 = (float)(var7 >> 16 & 0xFF) / 255.0F;
         float var13 = (float)(var7 >> 8 & 0xFF) / 255.0F;
         float var14 = (float)(var7 & 0xFF) / 255.0F;
         float var15 = (float)(var7 >> 24 & 0xFF) / 255.0F;
         var3 *= 2.0;
         var5 = (var5 - 3.0) * 2.0;
         float var11 = (float)var3;
         float var16 = (float)var5;
         int var17 = var2.length();

         for (int var18 = 0; var18 < var17; var18++) {
            char var19 = var2.charAt(var18);
            if (var19 == 167 && var18 < var17 - 1) {
               if (var7 != -16777216) {
                  char var26 = var2.charAt(var18 + 1);
                  int var27 = "0123456789abcdefklmnor".indexOf(var26);
                  if (var26 == 'r') {
                     var12 = (float)(var7 >> 16 & 0xFF) / 255.0F;
                     var13 = (float)(var7 >> 8 & 0xFF) / 255.0F;
                     var14 = (float)(var7 & 0xFF) / 255.0F;
                  } else if (var27 < 16) {
                     if (var27 < 0) {
                        var27 = 15;
                     }

                     if (var9) {
                        var27 += 16;
                     }

                     int var22 = ((int[])this.break_[0])[var27];
                     var12 = (float)(var22 >> 16 & 0xFF) / 255.0F;
                     var13 = (float)(var22 >> 8 & 0xFF) / 255.0F;
                     var14 = (float)(var22 & 0xFF) / 255.0F;
                  }
               }

               var18++;
            } else {
               rrZM var20 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var19, (rrZM)this.class_[2]);
               if (var20 != null) {
                  float var21 = (float)((Integer)var20.class_[2] - 8 + (Integer)this.class_[8]);
                  if (var19 == '\n') {
                     var11 = (float)var3;
                     var16 += var8;
                  } else {
                     this.class_(var1, var19, var11, var16, var12, var13, var14, var15);
                     var11 += var21;
                  }
               }
            }
         }

         var1.class_(2.0F, 2.0F, 2.0F);
      }
   }

   public void class_(lD_2 var1) {
      var1.class_(7, ju_3.public_);
   }

   public float class_(Ml_1 var1, String var2, double var3, double var5, int var7, int var8, boolean var9) {
      this.case_();
      if (var2 == null) {
         return 0.0F;
      } else {
         var3--;
         rrfa_3.class_();
         var3 *= 2.0;
         var5 = (var5 - 3.0) * 2.0;
         var1.class_();
         var1.class_(0.5F, 0.5F, 0.5F);
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableTexture();
         RenderSystem.bindTexture(((fk_3)this.class_[10]).new_());
         strictfp_.class_(7, ju_3.public_);
         boolean var10 = false;
         int var11 = -1;
         int var12 = var2.length();

         for (int var13 = 0; var13 < var12; var13++) {
            char var14 = var2.charAt(var13);
            int var15 = ColorHelper.class_((float)(-var13 * var7), var8);
            if (var9) {
               var15 = (var15 & 16579836) >> 2 | var15 & -938208236;
            }

            float var16 = (float)ColorHelper.byte_(var15) / 255.0F;
            float var17 = (float)ColorHelper.protected_(var15) / 255.0F;
            float var18 = (float)ColorHelper.break_(var15) / 255.0F;
            float var19 = (float)ColorHelper.throws_(var15) / 255.0F;
            if (var14 == 167 && var13 < var12 - 1) {
               char var25 = var2.charAt(var13 + 1);
               int var21 = "0123456789abcdefklmnor".indexOf(var25);
               if (var25 != 'r' && var21 < 16) {
                  if (var21 < 0) {
                     var21 = 15;
                  }

                  if (var9) {
                     var21 += 16;
                  }

                  var11 = ((int[])this.break_[0])[var21];
               }

               var10 = case_[39];
               var13++;
            } else {
               rrZM var20 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var14, (rrZM)this.class_[2]);
               if (var20 != null) {
                  if (var10) {
                     var16 = (float)ColorHelper.byte_(var11) / 255.0F;
                     var17 = (float)ColorHelper.protected_(var11) / 255.0F;
                     var18 = (float)ColorHelper.break_(var11) / 255.0F;
                  }

                  this.class_(var1, var14, (float)var3, (float)var5, var16, var17, var18, var19);
                  var3 += (double)(var20.class_[2] - 8 + this.class_[8]);
               }
            }
         }

         default_.break_();
         var1.break_();
         return (float)var3 / 2.0F;
      }
   }

   public void class_(Ml_1 var1, String var2, float var3, float var4, int var5, float var6, float var7) {
      ((ShaderManager)byte_[0]).class_();
      ((ShaderManager)byte_[0])
         .break_(
            "inColor",
            (float)(var5 >> 16 & 0xFF) / 255.0F,
            (float)(var5 >> 8 & 0xFF) / 255.0F,
            (float)(var5 & 0xFF) / 255.0F,
            (float)(var5 >> 24 & 0xFF) / 255.0F
         );
      ((ShaderManager)byte_[0]).break_("width", var6 * var7);
      ((ShaderManager)byte_[0]).break_("maxWidth", (var3 * var7 + var6) * 2.0F);
      ((ShaderManager)byte_[0]).break_("smoothness", 1.0F);
      ((ShaderManager)byte_[0]).break_("startCutoff", 0.5F);
      this.break_(var1, var2, (double)var3, (double)var4, var5, false, false);
      ((ShaderManager)byte_[0]).break_();
   }

   public float class_(Ml_1 var1, String var2, double var3, double var5, int var7, int var8) {
      float var9 = this.class_(var1, var2, var3 + 0.5, var5 + 0.5, var7, var8, true);
      return Math.max(var9, this.class_(var1, var2, var3, var5, var7, var8, false));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 735612409790386770L;
   }

   public void class_(Ml_1 var1, String var2, double var3, double var5, int var7, boolean var8) {
      this.break_(var1, var2, var3 - 0.5, var5, -16777216, false, var8);
      this.break_(var1, var2, var3 + 0.5, var5, -16777216, false, var8);
      this.break_(var1, var2, var3, var5 - 0.5, -16777216, false, var8);
      this.break_(var1, var2, var3, var5 + 0.5, -16777216, false, var8);
      this.break_(var1, var2, var3, var5, var7, false, var8);
   }

   public float class_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      return this.break_(var1, var2, (double)(var3 - this.break_(var2) / 2.0F), (double)var4, var5, var6);
   }

   public float class_(Ml_1 var1, String var2, double var3, double var5, int var7) {
      float var8 = this.break_(var1, var2, var3 + 0.5, var5 + 0.5, var7, true, true);
      return Math.max(var8, this.break_(var1, var2, var3, var5, var7, false, true));
   }

   public float class_(Ml_1 var1, lD_2 var2, String var3, double var4, double var6, int var8, boolean var9) {
      float var10 = this.break_(var1, var2, var3, var4 + 0.5, var6 + 0.5, var8, true, var9);
      return Math.max(var10, this.break_(var1, var2, var3, var4, var6, var8, false, var9));
   }

   public void class_(Ml_1 var1, lD_2 var2, String var3, double var4, double var6, int var8, boolean var9, boolean var10) {
      this.break_(var1, var2, var3, var4 - 0.5, var6, -16777216, var9, var10);
      this.break_(var1, var2, var3, var4 + 0.5, var6, -16777216, var9, var10);
      this.break_(var1, var2, var3, var4, var6 - 0.5, -16777216, var9, var10);
      this.break_(var1, var2, var3, var4, var6 + 0.5, -16777216, var9, var10);
      this.break_(var1, var2, var3, var4, var6, var8, var9, var10);
   }

   public float class_(Ml_1 var1, lD_2 var2, String var3, float var4, float var5, int var6) {
      return this.class_(var1, var2, var3, (double)(var4 - this.break_(var3) / 2.0F), (double)var5, var6);
   }

   public void class_(Ml_1 var1, String var2, double var3, double var5, int var7, int var8, boolean var9, boolean var10) {
      this.class_(var1, var2, var3 - 0.5, var5, -16777216, (float)var8, var9, var10);
      this.class_(var1, var2, var3 + 0.5, var5, -16777216, (float)var8, var9, var10);
      this.class_(var1, var2, var3, var5 - 0.5, -16777216, (float)var8, var9, var10);
      this.class_(var1, var2, var3, var5 + 0.5, -16777216, (float)var8, var9, var10);
      this.class_(var1, var2, var3, var5, var7, (float)var8, var9, var10);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1357407092;
   }

   public void class_(Ml_1 var1, String var2, float var3, float var4, int var5) {
      this.break_(var1, strictfp_, var2, (double)(var3 - this.break_(var2) / 2.0F), (double)var4, var5, false, false);
   }

   public float break_(Ml_1 var1, rgP_2 var2, double var3, double var5, int var7, int var8) {
      if (var2 == null) {
         return 0.0F;
      } else {
         var1.class_(0.5F, 0.5F, 0.0F);
         var3 = --var3 * 2.0;
         var5 = (var5 - 3.0) * 2.0;
         float var9 = (float)var3;
         float var10 = (float)var5;
         var2.catch_().accept(new rrZX(this, var9, var7, var1, var10, var8));
         var1.class_(2.0F, 2.0F, 2.0F);
         return (float)var3 / 2.0F;
      }
   }

   public void break_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      float var7 = var3 - this.break_(var2) / 2.0F;
      int var8 = var5 & 0xFF000000;
      this.protected_(var1, var2, var7 - 0.5F, var4, var8, var6);
      this.protected_(var1, var2, var7 + 0.5F, var4, var8, var6);
      this.protected_(var1, var2, var7, var4 - 0.5F, var8, var6);
      this.protected_(var1, var2, var7, var4 + 0.5F, var8, var6);
      this.protected_(var1, var2, var7, var4, var5, var6);
   }

   public float break_(Ml_1 var1, String var2, float var3, float var4, int var5) {
      return this.class_(var1, var2, (double)(var3 - this.break_(var2) / 2.0F), (double)var4, var5);
   }

   public void break_(lD_2 var1) {
      var1.class_(7, ju_3.public_);
   }

   @Override
   public float break_(String var1) {
      if (var1 == null) {
         return 0.0F;
      } else {
         float var2 = throws_[119];

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (var4 == 167) {
               var3++;
            } else {
               rrZM var5 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var4, (rrZM)this.class_[2]);
               var2 += (float)(var5.class_[2] - 8 + this.class_[8]);
            }
         }

         return (float)Math.ceil((double)(var2 * 0.5F));
      }
   }

   public float break_(Ml_1 var1, lD_2 var2, String var3, double var4, double var6, int var8, boolean var9, boolean var10) {
      this.case_();
      if (var3 == null) {
         return 0.0F;
      } else {
         var1.class_(0.5F, 0.5F, 0.0F);
         var4--;
         if (var10) {
            if (var8 == 553648127) {
               var8 = 16777215;
            }

            if ((var8 & -67108864) == 0) {
               var8 |= -16777216;
            }
         }

         if (var9) {
            var8 = (var8 & 16579836) >> 2 | var8 & -938208236;
         }

         float var11 = (float)(var8 >> 16 & 0xFF) / 255.0F;
         float var12 = (float)(var8 >> 8 & 0xFF) / 255.0F;
         float var13 = (float)(var8 & 0xFF) / 255.0F;
         float var14 = (float)(var8 >> 24 & 0xFF) / 255.0F;
         var4 *= 2.0;
         var6 = (var6 - 3.0) * 2.0;
         int var15 = var3.length();

         for (int var16 = 0; var16 < var15; var16++) {
            char var17 = var3.charAt(var16);
            if (var17 == 167 && var16 < var15 - 1) {
               if (var8 != -16777216) {
                  char var24 = var3.charAt(var16 + 1);
                  int var19 = "0123456789abcdefklmnor".indexOf(var24);
                  if (var24 == 'r') {
                     var11 = (float)(var8 >> 16 & 0xFF) / 255.0F;
                     var12 = (float)(var8 >> 8 & 0xFF) / 255.0F;
                     var13 = (float)(var8 & 0xFF) / 255.0F;
                  } else if (var19 < 16) {
                     if (var19 < 0) {
                        var19 = 15;
                     }

                     if (var9) {
                        var19 += 16;
                     }

                     int var20 = ((int[])this.break_[0])[var19];
                     var11 = (float)(var20 >> 16 & 0xFF) / 255.0F;
                     var12 = (float)(var20 >> 8 & 0xFF) / 255.0F;
                     var13 = (float)(var20 & 0xFF) / 255.0F;
                  }
               }

               var16++;
            } else {
               rrZM var18 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var17, (rrZM)this.class_[2]);
               if (var18 != null) {
                  this.class_(var1, var2, var17, (float)var4, (float)var6, var11, var12, var13, var14);
                  var4 += (double)(var18.class_[2] - 8 + this.class_[8]);
               }
            }
         }

         var1.class_(2.0F, 2.0F, 2.0F);
         return (float)var4 / 2.0F;
      }
   }

   public float break_(Ml_1 var1, String var2, double var3, double var5, int var7, boolean var8) {
      float var9 = this.break_(var1, var2, var3 + 0.5, var5 + 0.5, var7, true, var8);
      return Math.max(var9, this.break_(var1, var2, var3, var5, var7, false, var8));
   }

   public float break_(Ml_1 var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9) {
      this.case_();
      if (var2 == null) {
         return 0.0F;
      } else {
         var3--;
         rrfa_3.class_();
         if (var9) {
            if (var7 == 553648127) {
               var7 = -1;
            }

            if ((var7 & -67108864) == 0) {
               var7 |= -16777216;
            }
         }

         if (var8) {
            var7 = (var7 & 16579836) >> 2 | var7 & -938208236;
         }

         float var10 = (float)(var7 >> 16 & 0xFF) / 255.0F;
         float var11 = (float)(var7 >> 8 & 0xFF) / 255.0F;
         float var12 = (float)(var7 & 0xFF) / 255.0F;
         float var13 = (float)(var7 >> 24 & 0xFF) / 255.0F;
         var3 *= 2.0;
         var5 = (var5 - 3.0) * 2.0;
         var1.class_();
         var1.class_(0.5F, 0.5F, 0.5F);
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableTexture();
         RenderSystem.bindTexture(((fk_3)this.class_[10]).new_());
         strictfp_.class_(7, ju_3.public_);
         int var14 = var2.length();

         for (int var15 = 0; var15 < var14; var15++) {
            char var16 = var2.charAt(var15);
            if (var16 == 167 && var15 < var14 - 1) {
               if (var7 != -16777216) {
                  char var23 = var2.charAt(var15 + 1);
                  int var18 = "0123456789abcdefklmnor".indexOf(var23);
                  if (var23 == 'r') {
                     var10 = (float)(var7 >> 16 & 0xFF) / 255.0F;
                     var11 = (float)(var7 >> 8 & 0xFF) / 255.0F;
                     var12 = (float)(var7 & 0xFF) / 255.0F;
                  } else if (var18 < 16) {
                     if (var18 < 0) {
                        var18 = 15;
                     }

                     if (var8) {
                        var18 += 16;
                     }

                     int var19 = ((int[])this.break_[0])[var18];
                     var10 = (float)(var19 >> 16 & 0xFF) / 255.0F;
                     var11 = (float)(var19 >> 8 & 0xFF) / 255.0F;
                     var12 = (float)(var19 & 0xFF) / 255.0F;
                  }
               }

               var15++;
            } else {
               rrZM var17 = (rrZM)((Int2ObjectOpenHashMap)this.class_[1]).getOrDefault(var16, (rrZM)this.class_[2]);
               if (var17 != null) {
                  this.class_(var1, var16, (float)var3, (float)var5, var10, var11, var12, var13);
                  var3 += (double)(var17.class_[2] - 8 + this.class_[8]);
               }
            }
         }

         default_.break_();
         var1.break_();
         return (float)var3 / 2.0F;
      }
   }

   private static void throws_() {
      protected_ = new String[]{
         new String("inColor"),
         new String("width"),
         new String("maxWidth"),
         new String("smoothness"),
         new String("startCutoff"),
         new String("inColor"),
         new String("width"),
         new String("maxWidth"),
         new String("smoothness"),
         new String("startCutoff"),
         new String("inColor"),
         new String("width"),
         new String("maxWidth"),
         new String("smoothness"),
         new String("startCutoff"),
         new String("0123456789abcdefklmnor"),
         new String("0123456789abcdefklmnor"),
         new String("0123456789abcdefklmnor"),
         new String("0123456789abcdefklmnor"),
         new String("0123456789abcdefklmnor"),
         new String("substring_font")
      };
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new ShaderManager("substring_font", false)};
      byte_ = var0;
   }

   private static void catch_() {
      catch_ = new int[]{
         553648127,
         -67108864,
         -16777216,
         16579836,
         -938208236,
         -16777216,
         16579836,
         -938208236,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         553648127,
         16777215,
         -67108864,
         -16777216,
         16579836,
         -938208236,
         -16777216,
         553648127,
         -67108864,
         -16777216,
         16579836,
         -938208236,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         -16777216,
         553648127,
         16777215,
         -67108864,
         -16777216,
         16579836,
         -938208236,
         -16777216
      };
   }

   private static void extends_() {
      implements_ = new double[]{
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         1.0,
         2.0,
         3.0,
         2.0,
         0.5,
         0.5,
         1.0,
         2.0,
         3.0,
         2.0,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         0.5,
         1.0,
         2.0,
         3.0,
         2.0,
         1.0,
         2.0,
         3.0,
         2.0,
         1.0,
         2.0,
         3.0,
         2.0,
         1.0,
         2.0,
         3.0,
         2.0,
         0.5,
         0.5,
         0.5,
         0.5,
         1.0,
         2.0,
         3.0,
         2.0
      };
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void implements_() {
      throws_ = new float[]{
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         2.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         2.0F,
         1.0F,
         0.5F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         2.0F,
         1.0F,
         0.5F,
         0.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         0.5F,
         0.5F,
         0.5F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         2.0F,
         0.0F,
         0.5F,
         0.5F,
         0.5F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         2.0F,
         2.0F,
         0.5F,
         0.5F,
         0.5F,
         0.5F,
         2.0F,
         0.0F,
         0.5F,
         0.5F,
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
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         0.0F,
         0.5F,
         0.5F,
         0.5F,
         2.0F,
         0.0F,
         0.5F,
         0.5F,
         0.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         0.5F,
         0.5F,
         0.5F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         255.0F,
         0.5F,
         0.5F,
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
         2.0F,
         2.0F,
         2.0F,
         0.0F,
         0.0F,
         0.5F
      };
   }

   public void protected_(Ml_1 var1, String var2, float var3, float var4, int var5) {
      this.break_(var1, var2, var3, var4, var5, true);
   }

   private void protected_(Ml_1 var1, lD_2 var2, String var3, double var4, double var6, int var8, boolean var9, boolean var10) {
      this.break_(var1, var2, var3, var4 - (double)(this.break_(var3) / 2.0F), var6, var8, var9, var10);
   }

   public float protected_(Ml_1 var1, String var2, float var3, float var4, int var5, boolean var6) {
      return this.break_(var1, var2, (double)var3, (double)var4, var5, false, var6);
   }

   private static void private_() {
      case_ = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true
      };
   }

   private static void volatile_() {
      finally_ = new byte[]{
         32,
         32,
         3,
         85,
         2,
         6,
         16,
         4,
         4,
         4,
         16,
         8,
         16,
         8,
         24,
         16,
         8,
         24,
         16,
         8,
         24,
         7,
         7,
         -1,
         2,
         16,
         8,
         24,
         7,
         114,
         16,
         8,
         16,
         15,
         16,
         8,
         8,
         7,
         -1,
         2,
         114,
         16,
         15,
         8,
         2,
         16,
         8,
         24,
         114,
         16,
         8,
         16,
         15,
         16,
         8,
         8,
         7,
         -1,
         2,
         16,
         8,
         24,
         7,
         114,
         16,
         8,
         16,
         15,
         16,
         8,
         8,
         10,
         2,
         16,
         8,
         24,
         114,
         16,
         8,
         16,
         15,
         16,
         8,
         8,
         10,
         8
      };
   }

   private static void native_() {
      private_ = new short[]{
         0,
         170,
         170,
         170,
         0,
         255,
         255,
         255,
         0,
         0,
         255,
         255,
         255,
         255,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         255,
         255,
         255,
         255,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         255,
         255,
         255,
         255,
         0,
         0,
         0,
         0,
         0,
         770,
         771,
         10,
         255,
         255,
         255,
         255,
         770,
         771,
         10,
         167,
         255,
         255,
         255,
         0,
         255,
         255,
         255,
         1,
         2,
         2,
         8,
         770,
         771,
         10,
         167,
         0,
         1,
         2,
         2,
         8,
         255,
         255,
         255,
         255,
         167,
         255,
         255,
         255,
         0,
         255,
         255,
         255,
         1,
         2,
         2,
         8,
         770,
         771,
         10,
         255,
         255,
         255,
         255,
         770,
         771,
         10,
         167,
         255,
         255,
         255,
         0,
         255,
         255,
         255,
         1,
         2,
         2,
         8,
         3,
         255,
         255,
         255,
         255,
         167,
         255,
         255,
         255,
         0,
         255,
         255,
         255,
         1,
         2,
         2,
         8,
         167,
         1,
         2,
         2,
         8
      };
   }
}
