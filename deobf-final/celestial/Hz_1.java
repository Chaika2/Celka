package celestial;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.List;
import java.util.Set;

public class Hz_1 implements rAn_1 {
   public static final rqO_2 class_ = new rqO_2("textures/misc/enchanted_item_glint.png");
   private static final Set<rdb_3> throws_ = Sets.newHashSet(new rdb_3[]{rdy_3.class_});
   public float break_;
   private final HW case_;
   private final fY_2 catch_;
   private final yq_3 private_;
   public Ip_1 byte_;
   public static boolean protected_ = true;
   private final rTO implements_ = new rTO();

   public static Ok_1 byte_(Hx_1 var0, HU var1, boolean var2, boolean var3) {
      if (!protected_) {
         var3 = false;
      }

      if (rrdZ.new_) {
         var3 = false;
      }

      if (rrbY_2.case_()) {
         var3 = false;
      }

      return var3 ? OQ.class_(var0.getBuffer(var2 ? HU.continue_() : HU.this_()), var0.getBuffer(var1)) : var0.getBuffer(var1);
   }

   public rrGK byte_() {
      return rrGD.MODELS;
   }

   public Hz_1(fY_2 var1, Ip_1 var2, yq_3 var3) {
      this.catch_ = var1;
      this.byte_ = var2;
      this.case_ = new HW(var2);

      for (rdb_3 var5 : rVL.for_) {
         if (!throws_.contains(var5)) {
            this.case_.class_(var5, new II(rVL.for_.break_(var5), "inventory"));
         }
      }

      this.private_ = var3;
   }

   public void class_(iB_2 var1, rdn_3 var2, float var3, float var4) {
      this.break_(var1, var2, var3, var4);
   }

   public void class_(cm_3 var1, rdn_3 var2, float var3, float var4) {
      this.class_(var1, var2, var3, var4, null, true);
   }

   public void class_(cm_3 var1, rdn_3 var2, float var3, float var4, String var5, float var6) {
      if (!var2.class_()) {
         Ml_1 var7 = new Ml_1();
         int var8 = (int)(var6 * 255.0F);
         if ((var2.char_() != 1 || var5 != null) && var8 > 0) {
            String var9 = var5 == null ? String.valueOf(var2.char_()) : var5;
            var7.class_(0.0, 0.0, (double)(this.break_ + 200.0F));
            Hd_1 var10 = Hx_1.class_(yb_3.class_().byte_());
            boolean var11 = cm_3.byte_;
            cm_3.byte_ = true;

            try {
               var1.class_(
                  var9,
                  var3 + 19.0F - 2.0F - (float)var1.break_(var9),
                  var4 + 6.0F + 3.0F,
                  ColorHelper.break_(16777215, var8),
                  true,
                  var7.byte_().class_(),
                  var10,
                  false,
                  0,
                  15728880
               );
               var10.break_();
            } finally {
               cm_3.byte_ = var11;
            }
         }
      }
   }

   public void class_(cm_3 var1, rdn_3 var2, float var3, float var4, String var5) {
      this.class_(var1, var2, var3, var4, var5, false);
   }

   public void class_(rdn_3 var1, int var2, int var3) {
      this.break_((cb_3)QY.instanceof_().class_[57], var1, (float)var2, (float)var3);
   }

   protected void class_(rdn_3 var1, float var2, float var3, IJ var4) {
      RenderSystem.pushMatrix();
      this.catch_.class_(fJ_2.class_);
      this.catch_.break_(fJ_2.class_).class_(false, false);
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableAlphaTest();
      RenderSystem.defaultAlphaFunc();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.translatef(var2, var3, 100.0F + this.break_);
      RenderSystem.translatef(8.0F, 8.0F, 0.0F);
      RenderSystem.scalef(1.0F, -1.0F, 1.0F);
      RenderSystem.scalef(16.0F, 16.0F, 16.0F);
      Ml_1 var5 = new Ml_1();
      Hd_1 var6 = QY.instanceof_().interface_().break_();
      boolean var7 = !var4.byte_();
      if (var7) {
         HF.byte_();
      }

      this.class_(var1, IQ.GUI, false, var5, var6, 15728880, fZ_2.class_, var4);
      var6.break_();
      RenderSystem.enableDepthTest();
      if (var7) {
         HF.protected_();
      }

      RenderSystem.disableAlphaTest();
      RenderSystem.disableRescaleNormal();
      RenderSystem.popMatrix();
   }

   protected void class_(Ml_1 var1, rdn_3 var2, float var3, float var4, float var5, IJ var6) {
      var1.class_();
      this.catch_.class_(fJ_2.class_);
      this.catch_.break_(fJ_2.class_).class_(false, false);
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableAlphaTest();
      RenderSystem.defaultAlphaFunc();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var5);
      var1.class_((double)var3, (double)var4, (double)(100.0F + this.break_));
      var1.class_(8.0, 8.0, 0.0);
      var1.class_(1.0F, -1.0F, 1.0F);
      var1.class_(16.0F, 16.0F, 16.0F);
      Hd_1 var7 = QY.instanceof_().interface_().break_();
      boolean var8 = !var6.byte_();
      if (var8) {
         HF.byte_();
      }

      float var9 = Hn_1.break_;
      Hn_1.break_ = var5;

      try {
         this.class_(var2, IQ.GUI, false, var1, var7, 15728880, fZ_2.class_, var5, var6);
         var7.break_();
      } finally {
         Hn_1.break_ = var9;
      }

      RenderSystem.enableDepthTest();
      if (var8) {
         HF.protected_();
      }

      RenderSystem.disableAlphaTest();
      RenderSystem.disableRescaleNormal();
      var1.break_();
   }

   private void class_(lD_2 var1, float var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.class_(7, ju_3.this_);
      var1.class_((double)var2, (double)var3, 0.0).break_(var6, var7, var8, var9).class_();
      var1.class_((double)var2, (double)(var3 + (float)var5), 0.0).break_(var6, var7, var8, var9).class_();
      var1.class_((double)(var2 + (float)var4), (double)(var3 + (float)var5), 0.0).break_(var6, var7, var8, var9).class_();
      var1.class_((double)(var2 + (float)var4), (double)var3, 0.0).break_(var6, var7, var8, var9).class_();
      yb_3.class_().break_();
   }

   private void class_(Ml_1 var1, lD_2 var2, float var3, float var4, float var5, float var6, int var7) {
      rjV_2 var8 = var1.byte_().class_();
      var2.class_(var8, var3, var4, 0.0F).class_(var7).class_();
      var2.class_(var8, var3, var4 + var6, 0.0F).class_(var7).class_();
      var2.class_(var8, var3 + var5, var4 + var6, 0.0F).class_(var7).class_();
      var2.class_(var8, var3 + var5, var4, 0.0F).class_(var7).class_();
   }

   @Override
   public void class_(rAL var1) {
      this.case_.break_();
   }

   public void class_(Ml_1 var1, rdn_3 var2, float var3, float var4, float var5) {
      this.class_(var1, var2, var3, var4, var5, this.class_(var2, null, null));
   }

   public void class_(Ml_1 var1, lD_2 var2, rdn_3 var3, float var4, float var5, float var6, int var7) {
      if (var3.case_()) {
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.disableBlend();
         float var8 = (float)var3.catch_();
         float var9 = (float)var3.private_();
         float var10 = Math.max(0.0F, (var9 - var8) / var9);
         int var11 = Math.round(var6 - var8 * var6 / var9);
         int var12 = ColorHelper.break_(rfU_2.case_(var10 / 3.0F, 1.0F, 1.0F), var7);
         if (rrbb_3.K()) {
            var12 = rrbN_2.class_(var10, var12);
         }

         this.class_(var1, var2, var4, var5, var6, 1.5F, ColorHelper.break_(Color.BLACK.getRGB(), var7));
         this.class_(var1, var2, var4, var5, (float)var11, 1.0F, var12);
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
      }
   }

   public void class_(Ml_1 var1, rdn_3 var2, float var3, float var4, float var5, float var6) {
      if (!var2.class_() && var2.case_()) {
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.disableBlend();
         float var7 = (float)var2.catch_();
         float var8 = (float)var2.private_();
         float var9 = Math.max(0.0F, (var8 - var7) / var8);
         int var10 = Math.round(var5 - var7 * var5 / var8);
         int var11 = rfU_2.case_(var9 / 3.0F, 1.0F, 1.0F);
         if (rrbb_3.K()) {
            var11 = rrbN_2.class_(var9, var11);
         }

         rrfD_2.protected_(var1, var3, var4, var5, 2.0F, ColorHelper.break_(Color.BLACK.getRGB(), (int)var6));
         rrfD_2.protected_(var1, var3, var4, (float)var10, 1.0F, ColorHelper.break_(var11, (int)var6));
         RenderSystem.enableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
      }
   }

   public void class_(cm_3 var1, rdn_3 var2, float var3, float var4, String var5, boolean var6) {
      if (!var2.class_()) {
         rdb_3 var7 = var2.break_();
         Ml_1 var8 = new Ml_1();
         if (var2.case_()) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.disableAlphaTest();
            RenderSystem.disableBlend();
            yb_3 var9 = yb_3.class_();
            lD_2 var10 = var9.byte_();
            float var11 = (float)var2.catch_();
            float var12 = (float)var2.private_();
            float var13 = Math.max(0.0F, (var12 - var11) / var12);
            int var14 = Math.round(13.0F - var11 * 13.0F / var12);
            int var15 = rfU_2.case_(var13 / 3.0F, 1.0F, 1.0F);
            if (rrbb_3.K()) {
               var15 = rrbN_2.class_(var13, var15);
            }

            this.class_(var10, var3 + 2.0F, var4 + 13.0F, 13, 2, 0, 0, 0, 255);
            this.class_(var10, var3 + 2.0F, var4 + 13.0F, var14, 1, var15 >> 16 & 0xFF, var15 >> 8 & 0xFF, var15 & 0xFF, 255);
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }

         cb_3 var23 = (cb_3)QY.instanceof_().class_[57];
         boolean var24 = var23 != null;
         float var25 = QY.instanceof_().X();
         float var26 = var24 ? var23.sK().class_(var7, var25) : 0.0F;
         float var27 = var24 ? var23.r().class_(var2, var25) : 0.0F;
         float var28 = Math.max(var26, var27);
         if (var2.char_() != 1 || var5 != null) {
            String var29 = var5 == null ? String.valueOf(var2.char_()) : var5;
            var8.class_(0.0, 0.0, (double)(this.break_ + 200.0F));
            Hd_1 var16 = Hx_1.class_(yb_3.class_().byte_());
            var1.class_(
               var29, var3 + 19.0F - 2.0F - (float)var1.break_(var29), var4 + 6.0F + 3.0F, 16777215, true, var8.byte_().class_(), var16, false, 0, 15728880
            );
            var16.break_();
         }

         if (var28 > 0.0F) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            yb_3 var30 = yb_3.class_();
            lD_2 var32 = var30.byte_();
            this.class_(var32, var3, var4 + (float)rfU_2.protected_(16.0F * (1.0F - var28)), 16, rfU_2.case_(16.0F * var28), 255, 255, 255, 127);
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }

         if (var6 && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().int_().aJ_() && var7 instanceof rdS_2 var31 && var24) {
            rrZO var33 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).break_();
            String var17 = var31.class_(var23, var2);
            float var18 = var33.break_(var17);
            var8.class_();
            var8.class_((double)var3, (double)var4, (double)(this.break_ + 160.0F));
            var8.class_(0.5F, 0.5F, 0.5F);
            rdn_3 var19 = var31.catch_();
            rdb_3 var20 = var19.break_();
            byte var21 = 16;
            byte var22 = 9;
            if (var20 == rdy_3.dc) {
               var21 = 20;
            } else if (var20 == rdy_3.Pz) {
               var21 = 17;
               var22 = 10;
            }

            this.class_(var8, var19, (float)var21, (float)var22, 1.0F);
            var8.class_(2.0F, 2.0F, 2.0F);
            var33.class_(MinecraftAccessor.strictfp_);
            var33.class_(var8, MinecraftAccessor.strictfp_, var17, (double)(16.0F - var18), 2.0, -1, false, false);
            var33.byte_(MinecraftAccessor.strictfp_);
            var8.break_();
         }
      }
   }

   public static Ok_1 class_(Hx_1 var0, HU var1, MH var2) {
      return OQ.class_(new Oz_1(var0.getBuffer(HU.new_()), var2.class_(), var2.break_()), var0.getBuffer(var1));
   }

   public void class_(IJ var1, rdn_3 var2, float var3, int var4, int var5, Ml_1 var6, Ok_1 var7) {
      if (rrbb_3.w()) {
         var7.class_(true);
      }

      for (rpr_3 var11 : rpr_3.VALUES) {
         this.implements_.setSeed(42L);
         this.class_(var6, var7, var1.class_(null, var11, this.implements_), var2, var4, var5, var3);
      }

      this.implements_.setSeed(42L);
      this.class_(var6, var7, var1.class_(null, null, this.implements_), var2, var4, var5, var3);
   }

   private void class_(Ml_1 var1, Ok_1 var2, List<wK_2> var3, rdn_3 var4, int var5, int var6) {
      boolean var7 = !var4.class_();
      MH var8 = var1.byte_();
      boolean var9 = rrbY_2.class_();

      for (wK_2 var11 : var3) {
         if (var9) {
            var11 = rrbY_2.class_(var11);
            if (var11 == null) {
               continue;
            }
         }

         int var12 = -1;
         if (var7 && var11.break_()) {
            var12 = this.private_.class_(var4, var11.byte_());
            if (rrbb_3.K()) {
               var12 = rrbN_2.class_(var4, var11.byte_(), var12);
            }
         }

         float var13 = (float)(var12 >> 16 & 0xFF) / 255.0F;
         float var14 = (float)(var12 >> 8 & 0xFF) / 255.0F;
         float var15 = (float)(var12 & 0xFF) / 255.0F;
         var2.class_(var8, var11, var13, var14, var15, var5, var6);
      }
   }

   private void class_(Ml_1 var1, Ok_1 var2, List<wK_2> var3, rdn_3 var4, int var5, int var6, float var7) {
      boolean var8 = !var4.class_();
      MH var9 = var1.byte_();
      boolean var10 = rrbY_2.class_();
      int var11 = var3.size();

      for (int var12 = 0; var12 < var11; var12++) {
         wK_2 var13 = (wK_2)var3.get(var12);
         if (var10) {
            var13 = rrbY_2.class_(var13);
            if (var13 == null) {
               continue;
            }
         }

         int var14 = -1;
         if (var8 && var13.break_()) {
            var14 = this.private_.class_(var4, var13.byte_());
            if (rrbb_3.K()) {
               var14 = rrbN_2.class_(var4, var13.byte_(), var14);
            }
         }

         float var15 = (float)(var14 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var14 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var14 & 0xFF) / 255.0F;
         var2.break_(var9, var13, var15, var16, var17, var7, var5, var6);
      }
   }

   public static Ok_1 class_(Hx_1 var0, HU var1, boolean var2, boolean var3) {
      if (!protected_) {
         var3 = false;
      }

      if (rrdZ.new_) {
         var3 = false;
      }

      if (rrbY_2.case_()) {
         var3 = false;
      }

      return var3 ? OQ.class_(var0.getBuffer(var2 ? HU.final_() : HU.package_()), var0.getBuffer(var1)) : var0.getBuffer(var1);
   }

   public void class_(rdn_3 var1, IQ var2, boolean var3, Ml_1 var4, Hx_1 var5, int var6, int var7, IJ var8) {
      if (!var1.class_()) {
         var4.class_();
         boolean var9 = var2 == IQ.GUI || var2 == IQ.GROUND || var2 == IQ.FIXED;
         if (var1.break_() == rdy_3.kY && var9) {
            var8 = this.case_.class_().class_(new II("minecraft:trident#inventory"));
         }

         var8.case_().class_(var2).class_(var3, var4);
         var4.class_(-0.5, -0.5, -0.5);
         if (!var8.protected_() && (var1.break_() != rdy_3.kY || var9)) {
            boolean var10;
            if (var2 != IQ.GUI && !var2.class_() && var1.break_() instanceof rxJ_2) {
               xd_3 var11 = ((rxJ_2)var1.break_()).catch_();
               var10 = !(var11 instanceof xm_3) && !(var11 instanceof zE_2);
            } else {
               var10 = true;
            }

            if (var8.implements_()) {
               rrxr_3.rX.class_(this, var8, var1, var4, var5, var6, var7, var10);
            } else {
               HU var14 = yS_2.class_(var1, var10);
               Ok_1 var12;
               if (var1.break_() == rdy_3.Xx && var1.else_()) {
                  var4.class_();
                  MH var13 = var4.byte_();
                  if (var2 == IQ.GUI) {
                     var13.class_().class_(0.5F);
                  } else if (var2.class_()) {
                     var13.class_().class_(0.75F);
                  }

                  if (var10) {
                     var12 = break_(var5, var14, var13);
                  } else {
                     var12 = class_(var5, var14, var13);
                  }

                  var4.break_();
               } else if (var10) {
                  var12 = byte_(var5, var14, true, var1.else_());
               } else {
                  var12 = break_(var5, var14, true, var1.else_());
               }

               if (rrbb_3.rd()) {
                  var8 = rrby_3.class_(var1, var8, IF.break_, false);
                  IF.break_ = null;
               }

               if (rrbY_2.class_()) {
                  rrbY_2.byte_();
               }

               this.class_(var8, var1, var6, var7, var4, var12);
               if (rrbY_2.class_()) {
                  if (rrbY_2.protected_()) {
                     rrbY_2.throws_();
                     Ok_1 var15 = var12 instanceof rrxp_3 ? ((rrxp_3)var12).case_() : var12;
                     this.class_(var8, var1, HQ.class_, var7, var4, var15);
                     rrbY_2.catch_();
                  }

                  rrbY_2.private_();
               }
            }
         } else {
            jG_2.class_.class_(var1, var2, var4, var5, var6, var7);
         }

         var4.break_();
      }
   }

   public void class_(rdn_3 var1, IQ var2, boolean var3, Ml_1 var4, Hx_1 var5, int var6, int var7, float var8, IJ var9) {
      if (!var1.class_()) {
         var4.class_();
         boolean var10 = var2 == IQ.GUI || var2 == IQ.GROUND || var2 == IQ.FIXED;
         if (var1.break_() == rdy_3.kY && var10) {
            var9 = this.case_.class_().class_(new II("minecraft:trident#inventory"));
         }

         var9.case_().class_(var2).class_(var3, var4);
         var4.class_(-0.5, -0.5, -0.5);
         if (!var9.protected_() && (var1.break_() != rdy_3.kY || var10)) {
            boolean var16;
            if (var2 != IQ.GUI && !var2.class_() && var1.break_() instanceof rxJ_2) {
               xd_3 var12 = ((rxJ_2)var1.break_()).catch_();
               var16 = !(var12 instanceof xm_3) && !(var12 instanceof zE_2);
            } else {
               var16 = true;
            }

            Object var17 = var8 < 1.0F ? ((rrjP_2)rrjP_2.break_[0]).class_(var5, var8, false) : var5;
            if (var9.implements_()) {
               rrxr_3.rX.class_(this, var9, var1, var4, var17, var6, var7, var16);
            } else {
               HU var13 = yS_2.class_(var1, var16);
               Ok_1 var14;
               if (var1.break_() == rdy_3.Xx && var1.else_()) {
                  var4.class_();
                  MH var15 = var4.byte_();
                  if (var2 == IQ.GUI) {
                     var15.class_().class_(0.5F);
                  } else if (var2.class_()) {
                     var15.class_().class_(0.75F);
                  }

                  if (var16) {
                     var14 = break_((Hx_1)var17, var13, var15);
                  } else {
                     var14 = class_((Hx_1)var17, var13, var15);
                  }

                  var4.break_();
               } else if (var16) {
                  var14 = byte_((Hx_1)var17, var13, true, var1.else_());
               } else {
                  var14 = break_((Hx_1)var17, var13, true, var1.else_());
               }

               if (rrbb_3.rd()) {
                  var9 = rrby_3.class_(var1, var9, IF.break_, false);
                  IF.break_ = null;
               }

               if (rrbY_2.class_()) {
                  rrbY_2.byte_();
               }

               this.class_(var9, var1, var8, var6, var7, var4, var14);
               if (rrbY_2.class_()) {
                  if (rrbY_2.protected_()) {
                     rrbY_2.throws_();
                     Ok_1 var18 = var14 instanceof rrxp_3 ? ((rrxp_3)var14).case_() : var14;
                     this.class_(var9, var1, var8, HQ.class_, var7, var4, var18);
                     rrbY_2.catch_();
                  }

                  rrbY_2.private_();
               }
            }
         } else {
            Object var11 = var8 < 1.0F ? ((rrjP_2)rrjP_2.break_[0]).class_(var5, var8) : var5;
            jG_2.class_.class_(var1, var2, var4, (Hx_1)var11, var6, var7);
         }

         var4.break_();
      }
   }

   public void class_(rdn_3 var1, float var2, float var3) {
      this.class_(var1, var2, var3, this.class_(var1, null, null));
   }

   public void class_(iB_2 var1, rdn_3 var2, IQ var3, boolean var4, Ml_1 var5, Hx_1 var6, rYB var7, int var8, int var9) {
      if (!var2.class_()) {
         IJ var10 = this.class_(var2, var7, var1);
         this.class_(var2, var3, var4, var5, var6, var8, var9, var10);
      }
   }

   public void class_(IJ var1, rdn_3 var2, int var3, int var4, Ml_1 var5, Ok_1 var6) {
      if (rrbb_3.w()) {
         var6.class_(true);
      }

      for (rpr_3 var10 : rpr_3.VALUES) {
         this.class_(var5, var6, var1.class_(null, var10, this.implements_), var2, var3, var4);
      }

      this.implements_.setSeed(42L);
      this.class_(var5, var6, var1.class_(null, null, this.implements_), var2, var3, var4);
   }

   public IJ class_(rdn_3 var1, rYB var2, iB_2 var3) {
      rdb_3 var4 = var1.break_();
      IJ var5;
      if (var4 == rdy_3.kY) {
         var5 = this.case_.class_().class_(new II("minecraft:trident_in_hand#inventory"));
      } else {
         var5 = this.case_.break_(var1);
      }

      gm_3 var6 = var2 instanceof gm_3 ? (gm_3)var2 : null;
      IF.break_ = null;
      IJ var7 = var5.catch_().class_(var5, var1, var6, var3);
      if (rrbb_3.rd()) {
         var7 = rrby_3.class_(var1, var7, IF.break_, true);
      }

      return var7 == null ? this.case_.class_().break_() : var7;
   }

   public void class_(rdn_3 var1, IQ var2, int var3, int var4, Ml_1 var5, Hx_1 var6) {
      this.class_(null, var1, var2, false, var5, var6, null, var3, var4);
   }

   public HW break_() {
      return this.case_;
   }

   public void break_(rdn_3 var1, int var2, int var3) {
      this.break_(null, var1, (float)var2, (float)var3);
   }

   private void break_(iB_2 var1, rdn_3 var2, float var3, float var4) {
      if (!var2.class_()) {
         this.break_ += 50.0F;
         this.class_(var2, var3, var4, this.class_(var2, null, var1));
         this.break_ -= 50.0F;
      }
   }

   public static Ok_1 break_(Hx_1 var0, HU var1, MH var2) {
      return OQ.class_(new Oz_1(var0.getBuffer(HU.continue_()), var2.class_(), var2.break_()), var0.getBuffer(var1));
   }

   public static Ok_1 break_(Hx_1 var0, HU var1, boolean var2, boolean var3) {
      if (!protected_) {
         var3 = false;
      }

      if (rrdZ.new_) {
         var3 = false;
      }

      if (rrbY_2.case_()) {
         var3 = false;
      }

      if (!var3) {
         return var0.getBuffer(var1);
      } else {
         return QY.d() && var1 == lp_3.implements_()
            ? OQ.class_(var0.getBuffer(HU.int_()), var0.getBuffer(var1))
            : OQ.class_(var0.getBuffer(var2 ? HU.new_() : HU.super_()), var0.getBuffer(var1));
      }
   }
}
