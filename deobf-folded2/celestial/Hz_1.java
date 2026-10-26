package celestial;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.List;
import java.util.Set;

public class Hz_1 implements rAn_1 {
   public static final rqO_2 id_class = new rqO_2("textures/misc/enchanted_item_glint.png");
   private static final Set<rdb_3> id_throws = Sets.newHashSet(new rdb_3[]{rdy_3.id_class});
   public float id_break;
   private final HW id_case;
   private final fY_2 id_catch;
   private final yq_3 id_private;
   public Ip_1 id_byte;
   public static boolean id_protected = true;
   private final rTO id_implements = new rTO();

   public static Ok_1 id_byte(Hx_1 var0, HU var1, boolean var2, boolean var3) {
      if (!id_protected) {
         var3 = false;
      }

      if (rrdZ.id_new) {
         var3 = false;
      }

      if (rrbY_2.id_case()) {
         var3 = false;
      }

      return var3 ? OQ.id_class(var0.getBuffer(var2 ? HU.id_continue() : HU.id_this()), var0.getBuffer(var1)) : var0.getBuffer(var1);
   }

   public rrGK id_byte() {
      return rrGD.MODELS;
   }

   public Hz_1(fY_2 var1, Ip_1 var2, yq_3 var3) {
      this.id_catch = var1;
      this.id_byte = var2;
      this.id_case = new HW(var2);

      for (rdb_3 var5 : rVL.id_for) {
         if (!id_throws.contains(var5)) {
            this.id_case.id_class(var5, new II(rVL.id_for.id_break(var5), "inventory"));
         }
      }

      this.id_private = var3;
   }

   public void id_class(iB_2 var1, rdn_3 var2, float var3, float var4) {
      this.id_break(var1, var2, var3, var4);
   }

   public void id_class(cm_3 var1, rdn_3 var2, float var3, float var4) {
      this.id_class(var1, var2, var3, var4, null, true);
   }

   public void id_class(cm_3 var1, rdn_3 var2, float var3, float var4, String var5, float var6) {
      if (!var2.id_class()) {
         Ml_1 var7 = new Ml_1();
         int var8 = (int)(var6 * 255.0F);
         if ((var2.id_char() != 1 || var5 != null) && var8 > 0) {
            String var9 = var5 == null ? String.valueOf(var2.id_char()) : var5;
            var7.id_class(0.0, 0.0, (double)(this.id_break + 200.0F));
            Hd_1 var10 = Hx_1.id_class(yb_3.id_class().id_byte());
            boolean var11 = cm_3.id_byte;
            cm_3.id_byte = true;

            try {
               var1.id_class(
                  var9,
                  var3 + 19.0F - 2.0F - (float)var1.id_break(var9),
                  var4 + 6.0F + 3.0F,
                  ColorHelper.id_break(16777215, var8),
                  true,
                  var7.id_byte().id_class(),
                  var10,
                  false,
                  0,
                  15728880
               );
               var10.id_break();
            } finally {
               cm_3.id_byte = var11;
            }
         }
      }
   }

   public void id_class(cm_3 var1, rdn_3 var2, float var3, float var4, String var5) {
      this.id_class(var1, var2, var3, var4, var5, false);
   }

   public void id_class(rdn_3 var1, int var2, int var3) {
      this.id_break((cb_3)QY.id_instanceof().id_class[57], var1, (float)var2, (float)var3);
   }

   protected void id_class(rdn_3 var1, float var2, float var3, IJ var4) {
      RenderSystem.pushMatrix();
      this.id_catch.id_class(fJ_2.id_class);
      this.id_catch.id_break(fJ_2.id_class).id_class(false, false);
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableAlphaTest();
      RenderSystem.defaultAlphaFunc();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.translatef(var2, var3, 100.0F + this.id_break);
      RenderSystem.translatef(8.0F, 8.0F, 0.0F);
      RenderSystem.scalef(1.0F, -1.0F, 1.0F);
      RenderSystem.scalef(16.0F, 16.0F, 16.0F);
      Ml_1 var5 = new Ml_1();
      Hd_1 var6 = QY.id_instanceof().id_interface().id_break();
      boolean var7 = !var4.id_byte();
      if (var7) {
         HF.id_byte();
      }

      this.id_class(var1, IQ.GUI, false, var5, var6, 15728880, fZ_2.id_class, var4);
      var6.id_break();
      RenderSystem.enableDepthTest();
      if (var7) {
         HF.id_protected();
      }

      RenderSystem.disableAlphaTest();
      RenderSystem.disableRescaleNormal();
      RenderSystem.popMatrix();
   }

   protected void id_class(Ml_1 var1, rdn_3 var2, float var3, float var4, float var5, IJ var6) {
      var1.id_class();
      this.id_catch.id_class(fJ_2.id_class);
      this.id_catch.id_break(fJ_2.id_class).id_class(false, false);
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableAlphaTest();
      RenderSystem.defaultAlphaFunc();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var5);
      var1.id_class((double)var3, (double)var4, (double)(100.0F + this.id_break));
      var1.id_class(8.0, 8.0, 0.0);
      var1.id_class(1.0F, -1.0F, 1.0F);
      var1.id_class(16.0F, 16.0F, 16.0F);
      Hd_1 var7 = QY.id_instanceof().id_interface().id_break();
      boolean var8 = !var6.id_byte();
      if (var8) {
         HF.id_byte();
      }

      float var9 = Hn_1.id_break;
      Hn_1.id_break = var5;

      try {
         this.id_class(var2, IQ.GUI, false, var1, var7, 15728880, fZ_2.id_class, var5, var6);
         var7.id_break();
      } finally {
         Hn_1.id_break = var9;
      }

      RenderSystem.enableDepthTest();
      if (var8) {
         HF.id_protected();
      }

      RenderSystem.disableAlphaTest();
      RenderSystem.disableRescaleNormal();
      var1.id_break();
   }

   private void id_class(lD_2 var1, float var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.id_class(7, ju_3.id_this);
      var1.id_class((double)var2, (double)var3, 0.0).id_break(var6, var7, var8, var9).id_class();
      var1.id_class((double)var2, (double)(var3 + (float)var5), 0.0).id_break(var6, var7, var8, var9).id_class();
      var1.id_class((double)(var2 + (float)var4), (double)(var3 + (float)var5), 0.0).id_break(var6, var7, var8, var9).id_class();
      var1.id_class((double)(var2 + (float)var4), (double)var3, 0.0).id_break(var6, var7, var8, var9).id_class();
      yb_3.id_class().id_break();
   }

   private void id_class(Ml_1 var1, lD_2 var2, float var3, float var4, float var5, float var6, int var7) {
      rjV_2 var8 = var1.id_byte().id_class();
      var2.id_class(var8, var3, var4, 0.0F).id_class(var7).id_class();
      var2.id_class(var8, var3, var4 + var6, 0.0F).id_class(var7).id_class();
      var2.id_class(var8, var3 + var5, var4 + var6, 0.0F).id_class(var7).id_class();
      var2.id_class(var8, var3 + var5, var4, 0.0F).id_class(var7).id_class();
   }

   @Override
   public void id_class(rAL var1) {
      this.id_case.id_break();
   }

   public void id_class(Ml_1 var1, rdn_3 var2, float var3, float var4, float var5) {
      this.id_class(var1, var2, var3, var4, var5, this.id_class(var2, null, null));
   }

   public void id_class(Ml_1 var1, lD_2 var2, rdn_3 var3, float var4, float var5, float var6, int var7) {
      if (var3.id_case()) {
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.disableBlend();
         float var8 = (float)var3.id_catch();
         float var9 = (float)var3.id_private();
         float var10 = Math.max(0.0F, (var9 - var8) / var9);
         int var11 = Math.round(var6 - var8 * var6 / var9);
         int var12 = ColorHelper.id_break(rfU_2.id_case(var10 / 3.0F, 1.0F, 1.0F), var7);
         if (rrbb_3.K()) {
            var12 = rrbN_2.id_class(var10, var12);
         }

         this.id_class(var1, var2, var4, var5, var6, 1.5F, ColorHelper.id_break(Color.BLACK.getRGB(), var7));
         this.id_class(var1, var2, var4, var5, (float)var11, 1.0F, var12);
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
      }
   }

   public void id_class(Ml_1 var1, rdn_3 var2, float var3, float var4, float var5, float var6) {
      if (!var2.id_class() && var2.id_case()) {
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.disableBlend();
         float var7 = (float)var2.id_catch();
         float var8 = (float)var2.id_private();
         float var9 = Math.max(0.0F, (var8 - var7) / var8);
         int var10 = Math.round(var5 - var7 * var5 / var8);
         int var11 = rfU_2.id_case(var9 / 3.0F, 1.0F, 1.0F);
         if (rrbb_3.K()) {
            var11 = rrbN_2.id_class(var9, var11);
         }

         rrfD_2.id_protected(var1, var3, var4, var5, 2.0F, ColorHelper.id_break(Color.BLACK.getRGB(), (int)var6));
         rrfD_2.id_protected(var1, var3, var4, (float)var10, 1.0F, ColorHelper.id_break(var11, (int)var6));
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
      }
   }

   public void id_class(cm_3 var1, rdn_3 var2, float var3, float var4, String var5, boolean var6) {
      if (!var2.id_class()) {
         rdb_3 var7 = var2.id_break();
         Ml_1 var8 = new Ml_1();
         if (var2.id_case()) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.disableAlphaTest();
            RenderSystem.disableBlend();
            yb_3 var9 = yb_3.id_class();
            lD_2 var10 = var9.id_byte();
            float var11 = (float)var2.id_catch();
            float var12 = (float)var2.id_private();
            float var13 = Math.max(0.0F, (var12 - var11) / var12);
            int var14 = Math.round(13.0F - var11 * 13.0F / var12);
            int var15 = rfU_2.id_case(var13 / 3.0F, 1.0F, 1.0F);
            if (rrbb_3.K()) {
               var15 = rrbN_2.id_class(var13, var15);
            }

            this.id_class(var10, var3 + 2.0F, var4 + 13.0F, 13, 2, 0, 0, 0, 255);
            this.id_class(var10, var3 + 2.0F, var4 + 13.0F, var14, 1, var15 >> 16 & 0xFF, var15 >> 8 & 0xFF, var15 & 0xFF, 255);
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }

         cb_3 var23 = (cb_3)QY.id_instanceof().id_class[57];
         boolean var24 = var23 != null;
         float var25 = QY.id_instanceof().X();
         float var26 = var24 ? var23.sK().id_class(var7, var25) : 0.0F;
         float var27 = var24 ? var23.r().id_class(var2, var25) : 0.0F;
         float var28 = Math.max(var26, var27);
         if (var2.id_char() != 1 || var5 != null) {
            String var29 = var5 == null ? String.valueOf(var2.id_char()) : var5;
            var8.id_class(0.0, 0.0, (double)(this.id_break + 200.0F));
            Hd_1 var16 = Hx_1.id_class(yb_3.id_class().id_byte());
            var1.id_class(
               var29,
               var3 + 19.0F - 2.0F - (float)var1.id_break(var29),
               var4 + 6.0F + 3.0F,
               16777215,
               true,
               var8.id_byte().id_class(),
               var16,
               false,
               0,
               15728880
            );
            var16.id_break();
         }

         if (var28 > 0.0F) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            yb_3 var30 = yb_3.id_class();
            lD_2 var32 = var30.id_byte();
            this.id_class(var32, var3, var4 + (float)rfU_2.id_protected(16.0F * (1.0F - var28)), 16, rfU_2.id_case(16.0F * var28), 255, 255, 255, 127);
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }

         if (var6 && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_int().aJ_() && var7 instanceof rdS_2 var31 && var24) {
            rrZO var33 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break();
            String var17 = var31.id_class(var23, var2);
            float var18 = var33.id_break(var17);
            var8.id_class();
            var8.id_class((double)var3, (double)var4, (double)(this.id_break + 160.0F));
            var8.id_class(0.5F, 0.5F, 0.5F);
            rdn_3 var19 = var31.id_catch();
            rdb_3 var20 = var19.id_break();
            byte var21 = 16;
            byte var22 = 9;
            if (var20 == rdy_3.dc) {
               var21 = 20;
            } else if (var20 == rdy_3.Pz) {
               var21 = 17;
               var22 = 10;
            }

            this.id_class(var8, var19, (float)var21, (float)var22, 1.0F);
            var8.id_class(2.0F, 2.0F, 2.0F);
            var33.id_class(MinecraftAccessor.id_strictfp);
            var33.id_class(var8, MinecraftAccessor.id_strictfp, var17, (double)(16.0F - var18), 2.0, -1, false, false);
            var33.id_byte(MinecraftAccessor.id_strictfp);
            var8.id_break();
         }
      }
   }

   public static Ok_1 id_class(Hx_1 var0, HU var1, MH var2) {
      return OQ.id_class(new Oz_1(var0.getBuffer(HU.id_new()), var2.id_class(), var2.id_break()), var0.getBuffer(var1));
   }

   public void id_class(IJ var1, rdn_3 var2, float var3, int var4, int var5, Ml_1 var6, Ok_1 var7) {
      if (rrbb_3.w()) {
         var7.id_class(true);
      }

      for (rpr_3 var11 : rpr_3.VALUES) {
         this.id_implements.setSeed(42L);
         this.id_class(var6, var7, var1.id_class(null, var11, this.id_implements), var2, var4, var5, var3);
      }

      this.id_implements.setSeed(42L);
      this.id_class(var6, var7, var1.id_class(null, null, this.id_implements), var2, var4, var5, var3);
   }

   private void id_class(Ml_1 var1, Ok_1 var2, List<wK_2> var3, rdn_3 var4, int var5, int var6) {
      boolean var7 = !var4.id_class();
      MH var8 = var1.id_byte();
      boolean var9 = rrbY_2.id_class();

      for (wK_2 var11 : var3) {
         if (var9) {
            var11 = rrbY_2.id_class(var11);
            if (var11 == null) {
               continue;
            }
         }

         int var12 = -1;
         if (var7 && var11.id_break()) {
            var12 = this.id_private.id_class(var4, var11.id_byte());
            if (rrbb_3.K()) {
               var12 = rrbN_2.id_class(var4, var11.id_byte(), var12);
            }
         }

         float var13 = (float)(var12 >> 16 & 0xFF) / 255.0F;
         float var14 = (float)(var12 >> 8 & 0xFF) / 255.0F;
         float var15 = (float)(var12 & 0xFF) / 255.0F;
         var2.id_class(var8, var11, var13, var14, var15, var5, var6);
      }
   }

   private void id_class(Ml_1 var1, Ok_1 var2, List<wK_2> var3, rdn_3 var4, int var5, int var6, float var7) {
      boolean var8 = !var4.id_class();
      MH var9 = var1.id_byte();
      boolean var10 = rrbY_2.id_class();
      int var11 = var3.size();

      for (int var12 = 0; var12 < var11; var12++) {
         wK_2 var13 = (wK_2)var3.get(var12);
         if (var10) {
            var13 = rrbY_2.id_class(var13);
            if (var13 == null) {
               continue;
            }
         }

         int var14 = -1;
         if (var8 && var13.id_break()) {
            var14 = this.id_private.id_class(var4, var13.id_byte());
            if (rrbb_3.K()) {
               var14 = rrbN_2.id_class(var4, var13.id_byte(), var14);
            }
         }

         float var15 = (float)(var14 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var14 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var14 & 0xFF) / 255.0F;
         var2.id_break(var9, var13, var15, var16, var17, var7, var5, var6);
      }
   }

   public static Ok_1 id_class(Hx_1 var0, HU var1, boolean var2, boolean var3) {
      if (!id_protected) {
         var3 = false;
      }

      if (rrdZ.id_new) {
         var3 = false;
      }

      if (rrbY_2.id_case()) {
         var3 = false;
      }

      return var3 ? OQ.id_class(var0.getBuffer(var2 ? HU.id_final() : HU.id_package()), var0.getBuffer(var1)) : var0.getBuffer(var1);
   }

   public void id_class(rdn_3 var1, IQ var2, boolean var3, Ml_1 var4, Hx_1 var5, int var6, int var7, IJ var8) {
      if (!var1.id_class()) {
         var4.id_class();
         boolean var9 = var2 == IQ.GUI || var2 == IQ.GROUND || var2 == IQ.FIXED;
         if (var1.id_break() == rdy_3.kY && var9) {
            var8 = this.id_case.id_class().id_class(new II("minecraft:trident#inventory"));
         }

         var8.id_case().id_class(var2).id_class(var3, var4);
         var4.id_class(-0.5, -0.5, -0.5);
         if (!var8.id_protected() && (var1.id_break() != rdy_3.kY || var9)) {
            boolean var10;
            if (var2 != IQ.GUI && !var2.id_class() && var1.id_break() instanceof rxJ_2) {
               xd_3 var11 = ((rxJ_2)var1.id_break()).id_catch();
               var10 = !(var11 instanceof xm_3) && !(var11 instanceof zE_2);
            } else {
               var10 = true;
            }

            if (var8.id_implements()) {
               rrxr_3.rX.id_class(this, var8, var1, var4, var5, var6, var7, var10);
            } else {
               HU var14 = yS_2.id_class(var1, var10);
               Ok_1 var12;
               if (var1.id_break() == rdy_3.Xx && var1.id_else()) {
                  var4.id_class();
                  MH var13 = var4.id_byte();
                  if (var2 == IQ.GUI) {
                     var13.id_class().id_class(0.5F);
                  } else if (var2.id_class()) {
                     var13.id_class().id_class(0.75F);
                  }

                  if (var10) {
                     var12 = id_break(var5, var14, var13);
                  } else {
                     var12 = id_class(var5, var14, var13);
                  }

                  var4.id_break();
               } else if (var10) {
                  var12 = id_byte(var5, var14, true, var1.id_else());
               } else {
                  var12 = id_break(var5, var14, true, var1.id_else());
               }

               if (rrbb_3.rd()) {
                  var8 = rrby_3.id_class(var1, var8, IF.id_break, false);
                  IF.id_break = null;
               }

               if (rrbY_2.id_class()) {
                  rrbY_2.id_byte();
               }

               this.id_class(var8, var1, var6, var7, var4, var12);
               if (rrbY_2.id_class()) {
                  if (rrbY_2.id_protected()) {
                     rrbY_2.id_throws();
                     Ok_1 var15 = var12 instanceof rrxp_3 ? ((rrxp_3)var12).id_case() : var12;
                     this.id_class(var8, var1, HQ.id_class, var7, var4, var15);
                     rrbY_2.id_catch();
                  }

                  rrbY_2.id_private();
               }
            }
         } else {
            jG_2.id_class.id_class(var1, var2, var4, var5, var6, var7);
         }

         var4.id_break();
      }
   }

   public void id_class(rdn_3 var1, IQ var2, boolean var3, Ml_1 var4, Hx_1 var5, int var6, int var7, float var8, IJ var9) {
      if (!var1.id_class()) {
         var4.id_class();
         boolean var10 = var2 == IQ.GUI || var2 == IQ.GROUND || var2 == IQ.FIXED;
         if (var1.id_break() == rdy_3.kY && var10) {
            var9 = this.id_case.id_class().id_class(new II("minecraft:trident#inventory"));
         }

         var9.id_case().id_class(var2).id_class(var3, var4);
         var4.id_class(-0.5, -0.5, -0.5);
         if (!var9.id_protected() && (var1.id_break() != rdy_3.kY || var10)) {
            boolean var16;
            if (var2 != IQ.GUI && !var2.id_class() && var1.id_break() instanceof rxJ_2) {
               xd_3 var12 = ((rxJ_2)var1.id_break()).id_catch();
               var16 = !(var12 instanceof xm_3) && !(var12 instanceof zE_2);
            } else {
               var16 = true;
            }

            Object var17 = var8 < 1.0F ? ((rrjP_2)rrjP_2.id_break[0]).id_class(var5, var8, false) : var5;
            if (var9.id_implements()) {
               rrxr_3.rX.id_class(this, var9, var1, var4, var17, var6, var7, var16);
            } else {
               HU var13 = yS_2.id_class(var1, var16);
               Ok_1 var14;
               if (var1.id_break() == rdy_3.Xx && var1.id_else()) {
                  var4.id_class();
                  MH var15 = var4.id_byte();
                  if (var2 == IQ.GUI) {
                     var15.id_class().id_class(0.5F);
                  } else if (var2.id_class()) {
                     var15.id_class().id_class(0.75F);
                  }

                  if (var16) {
                     var14 = id_break((Hx_1)var17, var13, var15);
                  } else {
                     var14 = id_class((Hx_1)var17, var13, var15);
                  }

                  var4.id_break();
               } else if (var16) {
                  var14 = id_byte((Hx_1)var17, var13, true, var1.id_else());
               } else {
                  var14 = id_break((Hx_1)var17, var13, true, var1.id_else());
               }

               if (rrbb_3.rd()) {
                  var9 = rrby_3.id_class(var1, var9, IF.id_break, false);
                  IF.id_break = null;
               }

               if (rrbY_2.id_class()) {
                  rrbY_2.id_byte();
               }

               this.id_class(var9, var1, var8, var6, var7, var4, var14);
               if (rrbY_2.id_class()) {
                  if (rrbY_2.id_protected()) {
                     rrbY_2.id_throws();
                     Ok_1 var18 = var14 instanceof rrxp_3 ? ((rrxp_3)var14).id_case() : var14;
                     this.id_class(var9, var1, var8, HQ.id_class, var7, var4, var18);
                     rrbY_2.id_catch();
                  }

                  rrbY_2.id_private();
               }
            }
         } else {
            Object var11 = var8 < 1.0F ? ((rrjP_2)rrjP_2.id_break[0]).id_class(var5, var8) : var5;
            jG_2.id_class.id_class(var1, var2, var4, (Hx_1)var11, var6, var7);
         }

         var4.id_break();
      }
   }

   public void id_class(rdn_3 var1, float var2, float var3) {
      this.id_class(var1, var2, var3, this.id_class(var1, null, null));
   }

   public void id_class(iB_2 var1, rdn_3 var2, IQ var3, boolean var4, Ml_1 var5, Hx_1 var6, rYB var7, int var8, int var9) {
      if (!var2.id_class()) {
         IJ var10 = this.id_class(var2, var7, var1);
         this.id_class(var2, var3, var4, var5, var6, var8, var9, var10);
      }
   }

   public void id_class(IJ var1, rdn_3 var2, int var3, int var4, Ml_1 var5, Ok_1 var6) {
      if (rrbb_3.w()) {
         var6.id_class(true);
      }

      for (rpr_3 var10 : rpr_3.VALUES) {
         this.id_class(var5, var6, var1.id_class(null, var10, this.id_implements), var2, var3, var4);
      }

      this.id_implements.setSeed(42L);
      this.id_class(var5, var6, var1.id_class(null, null, this.id_implements), var2, var3, var4);
   }

   public IJ id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      rdb_3 var4 = var1.id_break();
      IJ var5;
      if (var4 == rdy_3.kY) {
         var5 = this.id_case.id_class().id_class(new II("minecraft:trident_in_hand#inventory"));
      } else {
         var5 = this.id_case.id_break(var1);
      }

      gm_3 var6 = var2 instanceof gm_3 ? (gm_3)var2 : null;
      IF.id_break = null;
      IJ var7 = var5.id_catch().id_class(var5, var1, var6, var3);
      if (rrbb_3.rd()) {
         var7 = rrby_3.id_class(var1, var7, IF.id_break, true);
      }

      return var7 == null ? this.id_case.id_class().id_break() : var7;
   }

   public void id_class(rdn_3 var1, IQ var2, int var3, int var4, Ml_1 var5, Hx_1 var6) {
      this.id_class(null, var1, var2, false, var5, var6, null, var3, var4);
   }

   public HW id_break() {
      return this.id_case;
   }

   public void id_break(rdn_3 var1, int var2, int var3) {
      this.id_break(null, var1, (float)var2, (float)var3);
   }

   private void id_break(iB_2 var1, rdn_3 var2, float var3, float var4) {
      if (!var2.id_class()) {
         this.id_break += 50.0F;
         this.id_class(var2, var3, var4, this.id_class(var2, null, var1));
         this.id_break -= 50.0F;
      }
   }

   public static Ok_1 id_break(Hx_1 var0, HU var1, MH var2) {
      return OQ.id_class(new Oz_1(var0.getBuffer(HU.id_continue()), var2.id_class(), var2.id_break()), var0.getBuffer(var1));
   }

   public static Ok_1 id_break(Hx_1 var0, HU var1, boolean var2, boolean var3) {
      if (!id_protected) {
         var3 = false;
      }

      if (rrdZ.id_new) {
         var3 = false;
      }

      if (rrbY_2.id_case()) {
         var3 = false;
      }

      if (!var3) {
         return var0.getBuffer(var1);
      } else {
         return QY.d() && var1 == lp_3.id_implements()
            ? OQ.id_class(var0.getBuffer(HU.id_int()), var0.getBuffer(var1))
            : OQ.id_class(var0.getBuffer(var2 ? HU.id_new() : HU.id_super()), var0.getBuffer(var1));
      }
   }
}
