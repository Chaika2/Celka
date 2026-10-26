package celestial;

import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hh_1 implements AutoCloseable, rAn_1 {
   private static final rqO_2 byte_ = new rqO_2("textures/misc/nausea.png");
   private static final Logger protected_ = LogManager.getLogger();
   private final QY throws_;
   private final rAL case_;
   private final Random catch_ = new Random();
   private float private_;
   public final HB class_;
   private final ct_3 implements_;
   private final yB_2 finally_;
   private int extends_;
   private float native_;
   private float volatile_;
   private float final_;
   private float package_;
   private final boolean int_ = true;
   private final boolean new_ = true;
   private long continue_;
   private long super_ = rqR_2.break_();
   private final HQ this_;
   private final fZ_2 else_ = new fZ_2();
   private boolean synchronized_;
   private final float return_ = 1.0F;
   private float public_;
   private float goto_;
   private rdn_3 while_;
   private int try_;
   private float instanceof_;
   private float throw_;
   private Vq_1 interface_;
   private rjV_2 char_ = new rjV_2();
   private static final rqO_2[] abstract_ = new rqO_2[]{
      new rqO_2("shaders/post/notch.json"),
      new rqO_2("shaders/post/fxaa.json"),
      new rqO_2("shaders/post/art.json"),
      new rqO_2("shaders/post/bumpy.json"),
      new rqO_2("shaders/post/blobs2.json"),
      new rqO_2("shaders/post/pencil.json"),
      new rqO_2("shaders/post/color_convolve.json"),
      new rqO_2("shaders/post/deconverge.json"),
      new rqO_2("shaders/post/flip.json"),
      new rqO_2("shaders/post/invert.json"),
      new rqO_2("shaders/post/ntsc.json"),
      new rqO_2("shaders/post/outline.json"),
      new rqO_2("shaders/post/phosphor.json"),
      new rqO_2("shaders/post/scan_pincushion.json"),
      new rqO_2("shaders/post/sobel.json"),
      new rqO_2("shaders/post/bits.json"),
      new rqO_2("shaders/post/desaturate.json"),
      new rqO_2("shaders/post/green.json"),
      new rqO_2("shaders/post/blur.json"),
      new rqO_2("shaders/post/wobble.json"),
      new rqO_2("shaders/post/blobs.json"),
      new rqO_2("shaders/post/antialias.json"),
      new rqO_2("shaders/post/creeper.json"),
      new rqO_2("shaders/post/spider.json")
   };
   public static final int break_ = abstract_.length;
   private int long_ = break_;
   private boolean float_;
   private final ly_3 void_ = new ly_3();
   private boolean static_ = false;
   private rYB import_ = null;
   private float short_ = 128.0F;
   private long default_ = 0L;
   private int const_ = 0;
   private int strictfp_ = 0;
   private int boolean_ = 0;
   private float transient_ = 0.0F;
   private float for_ = 0.0F;
   private final Vq_1[] double_ = new Vq_1[10];
   private boolean switch_ = false;
   private long r;

   private void byte_(float var1) {
      int var2 = this.throws_.else_().super_();
      int var3 = this.throws_.else_().this_();
      double var4 = rfU_2.protected_((double)var1, 2.0, 1.0);
      float var6 = 0.2F * var1;
      float var7 = 0.4F * var1;
      float var8 = 0.2F * var1;
      double var9 = (double)var2 * var4;
      double var11 = (double)var3 * var4;
      double var13 = ((double)var2 - var9) / 2.0;
      double var15 = ((double)var3 - var11) / 2.0;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.ONE, MK.ONE, OP.ONE, MK.ONE);
      RenderSystem.color4f(var6, var7, var8, 1.0F);
      this.throws_.A().class_(byte_);
      yb_3 var17 = yb_3.class_();
      lD_2 var18 = var17.byte_();
      var18.class_(7, ju_3.synchronized_);
      var18.class_(var13, var15 + var11, -90.0).class_(0.0F, 1.0F).class_();
      var18.class_(var13 + var9, var15 + var11, -90.0).class_(1.0F, 1.0F).class_();
      var18.class_(var13 + var9, var15, -90.0).class_(1.0F, 0.0F).class_();
      var18.class_(var13, var15, -90.0).class_(0.0F, 0.0F).class_();
      var17.break_();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
   }

   public void byte_() {
      this.float_ = !this.float_;
   }

   private boolean int_() {
      Objects.requireNonNull(this);
      an_3 var1 = this.throws_.catch_();
      boolean var2 = var1 instanceof rhd_3 && !((Qw_1)this.throws_.class_[20]).g;
      if (var2 && !((rhx_3)((rhd_3)var1).implements_[18]).throws_) {
         rdn_3 var3 = ((iB_2)var1).ss();
         rjG_2 var4 = (rjG_2)this.throws_.class_[64];
         if (var4 != null && var4.byte_() == rjM_2.BLOCK) {
            rfH_2 var5 = ((rff_3)var4).class_();
            xc_3 var6 = ((gm_3)this.throws_.class_[56]).byte_(var5);
            if (((Ax_1)this.throws_.class_[55]).native_() == rRl_1.SPECTATOR) {
               var2 = var6.break_((gm_3)this.throws_.class_[56], var5) != null;
            } else {
               ryw_3 var7 = new ryw_3((gm_3)this.throws_.class_[56], var5, false);
               var2 = !var3.class_()
                  && (var3.class_(((gm_3)this.throws_.class_[56]).int_(), var7) || var3.break_(((gm_3)this.throws_.class_[56]).int_(), var7));
            }
         }
      }

      return var2;
   }

   public Hh_1(QY var1, rAL var2, yB_2 var3) {
      this.throws_ = var1;
      this.case_ = var2;
      this.class_ = var1.import_();
      this.implements_ = new ct_3(var1.A());
      this.this_ = new HQ(this, var1);
      this.finally_ = var3;
      this.interface_ = null;
   }

   public void class_(Qg_1 var1, double var2) {
      RenderSystem.clear(256, (Boolean)QY.break_[2]);
      RenderSystem.matrixMode(5889);
      RenderSystem.loadIdentity();
      double var4 = (double)var1.extends_() / var2;
      double var6 = (double)var1.native_() / var2;
      RenderSystem.ortho(0.0, var4, var6, 0.0, 1000.0, 3000.0);
      RenderSystem.matrixMode(5888);
      RenderSystem.loadIdentity();
      RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
   }

   public void class_(an_3 var1) {
      if (this.interface_ != null) {
         this.interface_.close();
      }

      this.interface_ = null;
      if (var1 instanceof rEJ) {
         this.class_(new rqO_2("shaders/post/creeper.json"));
      } else if (var1 instanceof rGw_1) {
         this.class_(new rqO_2("shaders/post/spider.json"));
      } else if (var1 instanceof rEu_1) {
         this.class_(new rqO_2("shaders/post/invert.json"));
      } else if (rrxr_3.rF.byte_()) {
         rrxr_3.private_(rrxr_3.rF, var1, this);
      }
   }

   public void class_(float var1, long var2, Ml_1 var4) {
      this.this_.class_(var1);
      if (this.throws_.catch_() == null) {
         this.throws_.break_((cb_3)this.throws_.class_[57]);
      }

      this.class_(var1);
      if (rrbb_3.rs()) {
         rrdZ.class_(this.throws_, this.void_, var1, var2);
      }

      boolean var5 = rrbb_3.rs();
      if (var5) {
         rrdZ.class_(var1, var2);
      }

      boolean var6 = this.int_();
      ly_3 var7 = this.void_;
      this.private_ = (float)(((Qw_1)this.throws_.class_[20]).break_ * 16);
      if (rrbb_3.this_()) {
         this.private_ *= 0.95F;
      }

      if (rrbb_3.else_()) {
         this.private_ *= 0.83F;
      }

      Ml_1 var8 = new Ml_1();
      var8.byte_().class_().class_(this.class_(var7, var1, true));
      Ml_1 var9 = var8;
      if (rrdZ.rr()) {
         var8 = var4;
      }

      if (((Qw_1)this.throws_.class_[20]).E > 0.0) {
         this.class_(var8, var1);
      }

      if (rrdZ.rr()) {
         var8 = var9;
      }

      rjV_2 var10 = var8.byte_().class_();
      this.class_(var10);
      var7.class_(
         this.throws_,
         (gm_3)this.throws_.class_[56],
         (an_3)(this.throws_.catch_() == null ? (cb_3)this.throws_.class_[57] : this.throws_.catch_()),
         !((Qw_1)this.throws_.class_[20]).volatile_().class_(),
         ((Qw_1)this.throws_.class_[20]).volatile_().break_(),
         var1
      );
      var4.class_(rje_3.break_.byte_(var7.protected_()));
      var4.class_(rje_3.protected_.byte_(var7.throws_() + 180.0F));
      ((yX_2)this.throws_.class_[8]).class_(var4, var1, var2, var6, var7, this, this.this_, var10);
      this.char_ = var10.case_();
      rjV_2 var11 = var4.byte_().class_();
      this.char_.class_(var11);
      rrfa_3.class_(var10, var11, var1);
      RenderEvent.class_(var4, var11, var1);
      Objects.requireNonNull(this);
      if (!rrdZ.new_) {
         if (var5) {
            rrdL.break_(this, var4, var7, var1);
            rrdZ.float_();
         }

         RenderSystem.clear(256, (Boolean)QY.break_[2]);
         if (var5) {
            rrdL.byte_(this, var4, var7, var1);
         } else {
            this.class_(var4, var7, var1);
         }
      }

      if (var5) {
         rrdZ.import_();
      }
   }

   public void class_(float var1, long var2, boolean var4) {
      this.continue_();
      if (!this.throws_.static_() && ((Qw_1)this.throws_.class_[20]).new_ && (!((Qw_1)this.throws_.class_[20]).S || !((Qi_1)this.throws_.class_[22]).break_())) {
         if (this.r < 2L) {
            this.r++;
         }

         if (this.r == 1L) {
            rrfc_3.class_();
         }

         if (rqR_2.break_() - this.super_ > 500L) {
            this.throws_.break_(false);
         }
      } else {
         this.super_ = rqR_2.break_();
      }

      if (!(Boolean)this.throws_.class_[72]) {
         int var5 = (int)(((Qi_1)this.throws_.class_[22]).byte_() * (double)this.throws_.else_().super_() / (double)this.throws_.else_().new_());
         int var6 = (int)(((Qi_1)this.throws_.class_[22]).protected_() * (double)this.throws_.else_().this_() / (double)this.throws_.else_().continue_());
         if (var4 && (gm_3)this.throws_.class_[56] != null && !rrbb_3.rw()) {
            this.class_(var1, var2, new Ml_1());
            if (this.throws_.finally_() && this.continue_ < rqR_2.break_() - 1000L) {
               this.continue_ = rqR_2.break_();
               if (!this.throws_.this_().while_()) {
                  this.package_();
               }
            }

            ((yX_2)this.throws_.class_[8]).byte_();
            if (this.interface_ != null && this.float_) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.disableAlphaTest();
               RenderSystem.enableTexture();
               RenderSystem.matrixMode(5890);
               RenderSystem.pushMatrix();
               RenderSystem.loadIdentity();
               this.interface_.class_(var1);
               RenderSystem.popMatrix();
               RenderSystem.enableTexture();
            }

            this.throws_.B().class_(true);
         } else {
            RenderSystem.viewport(0, 0, this.throws_.else_().extends_(), this.throws_.else_().native_());
         }

         Qg_1 var7 = this.throws_.else_();
         this.class_(var7, var7.return_());
         HF.protected_();
         Ml_1 var8 = new Ml_1();
         if (this.this_.throws_()) {
            this.this_.class_(false);
         }

         rrnG_2 var9 = rrnG_2.class_((vm_3)this.throws_.class_[73], var8, var5, var6, var1);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var9);
         QY var10000 = this.throws_;
         vm_3 var19;
         vm_3 var30 = var19 = var9.break_();
         var10000.class_[74] = var19;
         vm_3 var10 = var30;
         if (var4 && (gm_3)this.throws_.class_[56] != null && (!((Qw_1)this.throws_.class_[20]).g || var10 != null)) {
            RenderSystem.defaultAlphaFunc();
            this.class_(this.throws_.else_().super_(), this.throws_.else_().this_(), var1);
            ((cq_3)this.throws_.class_[19]).class_(var8, var1);
            if (((Qw_1)this.throws_.class_[20]).rC && !((Qw_1)this.throws_.class_[20]).R) {
               rrbb_3.class_(var8);
            }

            RenderSystem.clear(256, (Boolean)QY.break_[2]);
         }

         if (this.switch_ == ((cT_2)this.throws_.class_[75] == null)) {
            if ((cT_2)this.throws_.class_[75] != null) {
               cj_3.class_(this.throws_);
               cT_2 var12 = (cT_2)this.throws_.class_[75];
               if (var12 instanceof cj_3 var11) {
                  var11.protected_();
               }
            }

            this.switch_ = (cT_2)this.throws_.class_[75] != null;
         }

         if ((cT_2)this.throws_.class_[75] != null) {
            try {
               ((cT_2)this.throws_.class_[75]).class_(var8, var5, var6, this.throws_.default_());
            } catch (Throwable var23) {
               KY var25 = KY.class_(var23, "Rendering overlay");
               Ko_1 var13 = var25.class_("Overlay render details");
               var13.class_("Overlay name", () -> ((cT_2)this.throws_.class_[75]).getClass().getCanonicalName());
               throw new KU(var25);
            }
         } else if (var10 != null) {
            try {
               boolean var24 = ((Qw_1)this.throws_.class_[20]).rs != 2;
               if (var24 && var10 instanceof rrvE) {
                  this.class_(var7, 2.0);
               }

               int var27 = (int)(((Qi_1)this.throws_.class_[22]).byte_() * (double)var7.volatile_() / (double)var7.new_());
               int var29 = (int)(((Qi_1)this.throws_.class_[22]).protected_() * (double)var7.final_() / (double)var7.continue_());
               var10.class_(var8, var5, var6, this.throws_.default_());
               if (var10 instanceof ClickGuiScreen) {
                  ClickGuiScreen var14 = (ClickGuiScreen)ClickGuiScreen.class_[0];
                  var14.byte_(false);
                  var14.class_(var8, (Integer)rrvk_1.class_[0], (Integer)rrvk_1.class_[1], this.throws_.default_());
                  var14.byte_(true);
               }

               Integer var20 = var27;
               rrvk_1.class_[0] = var20;
               Integer var21 = var29;
               rrvk_1.class_[1] = var21;
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnS_2.class_(var10, var8, var5, var6, var1));
            } catch (Throwable var22) {
               KY var26 = KY.class_(var22, "Rendering screen");
               Ko_1 var28 = var26.class_("Screen render details");
               var28.class_("Screen name", () -> var10.getClass().getCanonicalName());
               var28.class_(
                  "Mouse location",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%f, %f)",
                        var5,
                        var6,
                        ((Qi_1)this.throws_.class_[22]).byte_(),
                        ((Qi_1)this.throws_.class_[22]).protected_()
                     )
               );
               var28.class_(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.throws_.else_().super_(),
                        this.throws_.else_().this_(),
                        this.throws_.else_().extends_(),
                        this.throws_.else_().native_(),
                        this.throws_.else_().return_()
                     )
               );
               throw new KU(var26);
            }
         }

         this.this_.class_(true);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(var8);
      }

      this.super_();
      this.new_();
      rrWU.class_();
      if (((Qw_1)this.throws_.class_[20]).rn) {
         ((Qw_1)this.throws_.class_[20]).Y = true;
      }
   }

   public static float class_(iB_2 var0, float var1) {
      int var2 = var0.byte_(rLD.int_).break_();
      return var2 > 200 ? 1.0F : 0.7F + rfU_2.class_(((float)var2 - var1) * (float) Math.PI * 0.2F) * 0.3F;
   }

   public rjV_2 class_(ly_3 var1, float var2, boolean var3) {
      Ml_1 var4 = new Ml_1();
      var4.byte_().class_().class_();
      if (rrbb_3.rs() && rrdZ.R()) {
         rrdZ.case_(var4);
      }

      this.short_ = this.private_ * 2.0F;
      if (this.short_ < 173.0F) {
         this.short_ = 173.0F;
      }

      if (1.0F != 1.0F) {
         var4.class_((double)this.public_, (double)(-this.goto_), 0.0);
         var4.class_(1.0F, 1.0F, 1.0F);
      }

      var4.byte_()
         .class_()
         .class_(
            rjV_2.class_(this.break_(var1, var2, var3), (float)this.throws_.else_().extends_() / (float)this.throws_.else_().native_(), 0.05F, this.short_)
         );
      return var4.byte_().class_();
   }

   private void class_(int var1, int var2, float var3) {
      if (this.while_ != null && this.try_ > 0) {
         int var4 = 40 - this.try_;
         float var5 = ((float)var4 + var3) / 40.0F;
         float var6 = var5 * var5;
         float var7 = var5 * var6;
         float var8 = 10.25F * var7 * var6 - 24.95F * var6 * var6 + 25.5F * var7 - 13.8F * var6 + 4.0F * var5;
         float var9 = var8 * (float) Math.PI;
         float var10 = this.instanceof_ * (float)(var1 / 4);
         float var11 = this.throw_ * (float)(var2 / 4);
         RenderSystem.enableAlphaTest();
         RenderSystem.pushMatrix();
         RenderSystem.pushLightingAttributes();
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         Ml_1 var12 = new Ml_1();
         var12.class_();
         var12.class_(
            (double)((float)(var1 / 2) + var10 * rfU_2.throws_(rfU_2.class_(var9 * 2.0F))),
            (double)((float)(var2 / 2) + var11 * rfU_2.throws_(rfU_2.class_(var9 * 2.0F))),
            -50.0
         );
         float var13 = 50.0F + 175.0F * rfU_2.class_(var9);
         var12.class_(var13, -var13, var13);
         var12.class_(rje_3.protected_.byte_(900.0F * rfU_2.throws_(rfU_2.class_(var9))));
         var12.class_(rje_3.break_.byte_(6.0F * rfU_2.break_(var5 * 8.0F)));
         var12.class_(rje_3.case_.byte_(6.0F * rfU_2.break_(var5 * 8.0F)));
         Hd_1 var14 = this.finally_.break_();
         this.throws_.float_().class_(this.while_, IQ.FIXED, 15728880, fZ_2.class_, var12, var14);
         var12.break_();
         var14.break_();
         RenderSystem.popAttributes();
         RenderSystem.popMatrix();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   public void class_(rdn_3 var1) {
      this.while_ = var1;
      this.try_ = 40;
      this.instanceof_ = this.catch_.nextFloat() * 2.0F - 1.0F;
      this.throw_ = this.catch_.nextFloat() * 2.0F - 1.0F;
   }

   public boolean class_(int var1) {
      if (!GLX.isUsingFBOs()) {
         return false;
      } else if (this.interface_ != null && this.interface_ != this.double_[2] && this.interface_ != this.double_[4]) {
         return true;
      } else if (var1 != 2 && var1 != 4) {
         if (this.interface_ == null) {
            return true;
         } else {
            this.interface_.close();
            this.interface_ = null;
            return true;
         }
      } else if (this.interface_ != null && this.interface_ == this.double_[var1]) {
         return true;
      } else if ((gm_3)this.throws_.class_[56] == null) {
         return true;
      } else {
         this.class_(new rqO_2("shaders/post/fxaa_of_" + var1 + "x.json"));
         this.double_[var1] = this.interface_;
         return this.float_;
      }
   }

   private void class_(vB_2 var1) {
      try {
         String var2 = null;
         Calendar var3 = Calendar.getInstance();
         var3.setTime(new Date());
         int var4 = var3.get(5);
         int var5 = var3.get(2) + 1;
         if (var4 == 8 && var5 == 4) {
            var2 = "Happy birthday, OptiFine!";
         }

         if (var4 == 14 && var5 == 8) {
            var2 = "Happy birthday, sp614x!";
         }

         if (var2 == null) {
            return;
         }

         rrxr_3.class_(var1, rrxr_3.SX, var2);
      } catch (Throwable var6) {
      }
   }

   public void class_(float var1) {
      an_3 var2 = this.throws_.catch_();
      if (var2 != null && (gm_3)this.throws_.class_[56] != null) {
         Object var24 = null;
         this.throws_.class_[63] = var24;
         double var3 = (double)((Ax_1)this.throws_.class_[55]).byte_();
         rrAz_1 var5 = rrAz_1.class_(var2.break_(var3, var1, false), 3.0, var3, var2.new_(var1), var2.rN(), var2.rO(), false, var1);
         rrAz_1.class_(var5);
         QY var10000 = this.throws_;
         rjG_2 var25 = var5.break_();
         var10000.class_[64] = var25;
         if ((rjG_2)this.throws_.class_[64] != null && ((rjG_2)this.throws_.class_[64]).byte_() == rjM_2.NONE) {
            return;
         }

         rjU_2 var6 = var5.throws_();
         boolean var7 = false;
         double var8 = var3;
         if (!var5.byte_() && ((Ax_1)this.throws_.class_[55]).private_()) {
            var8 = 6.0;
            var3 = var8;
         } else if (var3 > 3.0) {
            var7 = true;
         }

         var8 *= var8;
         if ((rjG_2)this.throws_.class_[64] != null) {
            var8 = ((rjG_2)this.throws_.class_[64]).case_().implements_(var6);
         }

         PX var10 = var5.catch_();
         rjU_2 var11 = var2.class_(var10.throws_(), var10.protected_(), 1.0F);
         rjU_2 var12 = var6.break_(var11.break_ * var3, var11.byte_ * var3, var11.protected_ * var3);
         rfl_3 var13 = var5.implements_().break_(var11.class_(var3)).byte_(1.0, 1.0, 1.0);
         rfo_3 var14 = rhj_3.class_(var2, var6, var12, var13, var0 -> !var0.native_() && var0.rY(), var8);
         if (var14 != null) {
            rrAW var15 = rrAW.class_(var14);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var15);
            an_3 var16 = var14.class_();
            rjU_2 var17 = var14.case_();
            double var18 = var6.implements_(var17);
            if (var7 && var18 > 9.0) {
               var10000 = this.throws_;
               rff_3 var26 = rff_3.class_(var17, rpr_3.class_(var11.break_, var11.byte_, var11.protected_), new rfH_2(var17));
               var10000.class_[64] = var26;
            } else if (!var15.byte_() && (var18 < var8 || (rjG_2)this.throws_.class_[64] == null)) {
               var10000 = this.throws_;
               rfo_3 var27 = var15.class_();
               var10000.class_[64] = var27;
               if (var16 instanceof iB_2 || var16 instanceof rsG_2) {
                  this.throws_.class_[63] = var16;
               }
            }
         }
      }
   }

   public void class_(int var1, int var2) {
      if (this.interface_ != null) {
         this.interface_.class_(var1, var2);
      }

      ((yX_2)this.throws_.class_[8]).class_(var1, var2);
   }

   public void class_(Vq_1 var1) {
      this.interface_ = var1;
   }

   @Override
   public void class_(rAL var1) {
      if (this.interface_ != null) {
         this.interface_.close();
      }

      this.interface_ = null;
      if (this.long_ == break_) {
         this.class_(this.throws_.catch_());
      } else {
         this.class_(abstract_[this.long_]);
      }
   }

   public void class_(rqO_2 var1) {
      if (GLX.isUsingFBOs()) {
         if (this.interface_ != null) {
            this.interface_.close();
         }

         try {
            this.interface_ = new Vq_1(this.throws_.A(), this.case_, this.throws_.B(), var1);
            this.interface_.class_(this.throws_.else_().extends_(), this.throws_.else_().native_());
            this.float_ = true;
         } catch (IOException var3) {
            protected_.warn("Failed to load shader: {}", var1, var3);
            this.long_ = break_;
            this.float_ = false;
         } catch (JsonSyntaxException var4) {
            protected_.warn("Failed to parse shader: {}", var1, var4);
            this.long_ = break_;
            this.float_ = false;
         }
      }
   }

   private void class_(Ml_1 var1, ly_3 var2, float var3) {
      this.class_(var1, var2, var3, true, true, false);
   }

   public void class_(Ml_1 var1, ly_3 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (!this.synchronized_) {
         rrdZ.break_(var6);
         this.class_(this.class_(var2, var3, false));
         MH var7 = var1.byte_();
         var7.class_().class_();
         var7.break_().byte_();
         boolean var8 = false;
         if (var4) {
            var1.class_();
            if (((Qw_1)this.throws_.class_[20]).E > 0.0) {
               this.class_(var1, var3);
            }

            var8 = this.throws_.catch_() instanceof iB_2 && ((iB_2)this.throws_.catch_()).Sc();
            if ((((Qw_1)this.throws_.class_[20]).volatile_().class_() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_())
               && !var8
               && !((Qw_1)this.throws_.class_[20]).g
               && ((Ax_1)this.throws_.class_[55]).native_() != rRl_1.SPECTATOR) {
               this.this_.byte_();
               if (rrbb_3.rs()) {
                  rrdL.class_(
                     this.class_,
                     var3,
                     var1,
                     this.finally_.break_(),
                     (cb_3)this.throws_.class_[57],
                     this.throws_.case_().class_((cb_3)this.throws_.class_[57], var3),
                     var6
                  );
               } else {
                  this.class_
                     .class_(
                        var3, var1, this.finally_.break_(), (cb_3)this.throws_.class_[57], this.throws_.case_().class_((cb_3)this.throws_.class_[57], var3)
                     );
               }

               this.this_.break_();
            }

            var1.break_();
         }

         rrdZ.g();
         if (!var5) {
            return;
         }

         this.this_.break_();
         if ((((Qw_1)this.throws_.class_[20]).volatile_().class_() || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_())
            && !var8) {
            Hm_1.class_(this.throws_, var1);
         }

         if (((Qw_1)this.throws_.class_[20]).E > 0.0) {
            this.class_(var1, var3);
         }
      }
   }

   private void class_(Ml_1 var1, float var2) {
      if (this.throws_.catch_() instanceof rhd_3 var3) {
         float var7 = (Float)var3.throws_[29] - (Float)var3.throws_[28];
         float var5 = -((Float)var3.throws_[29] + var7 * var2);
         float var6 = rfU_2.catch_(var2, (Float)var3.implements_[7], (Float)var3.implements_[8]);
         var6 *= (float)((Qw_1)this.throws_.class_[20]).E;
         var1.class_((double)(rfU_2.class_(var5 * (float) Math.PI) * var6 * 0.5F), (double)(-Math.abs(rfU_2.break_(var5 * (float) Math.PI) * var6)), 0.0);
         var1.class_(rje_3.case_.byte_(rfU_2.class_(var5 * (float) Math.PI) * var6 * 3.0F));
         var1.class_(rje_3.break_.byte_(Math.abs(rfU_2.break_(var5 * (float) Math.PI - 0.2F) * var6) * 5.0F));
      }
   }

   public void class_(rjV_2 var1) {
      RenderSystem.matrixMode(5889);
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var1);
      RenderSystem.matrixMode(5888);
   }

   @Override
   public void close() {
      this.this_.close();
      this.implements_.close();
      this.else_.close();
      this.break_();
   }

   public float break_(float var1) {
      return rfU_2.catch_(var1, this.package_, this.final_);
   }

   public void break_() {
      if (this.interface_ != null) {
         this.interface_.close();
      }

      this.interface_ = null;
      this.long_ = break_;
   }

   private double break_(ly_3 var1, float var2, boolean var3) {
      if (this.synchronized_) {
         return 90.0;
      } else {
         double var4 = 70.0;
         if (var3) {
            var4 = ((Qw_1)this.throws_.class_[20]).U;
            if (rrbb_3.rX()) {
               var4 *= (double)rfU_2.catch_(var2, this.volatile_, this.native_);
            }
         }

         boolean var6 = false;
         if ((vm_3)this.throws_.class_[73] == null) {
            var6 = ((Qw_1)this.throws_.class_[20]).Pf.protected_();
         }

         if (var6) {
            if (!rrbb_3.package_) {
               rrbb_3.package_ = true;
               int_ = ((Qw_1)this.throws_.class_[20]).D;
               ((Qw_1)this.throws_.class_[20]).D = true;
               ((yX_2)this.throws_.class_[8]).volatile_();
            }

            if (rrbb_3.package_) {
               var4 /= 4.0;
            }
         } else if (rrbb_3.package_) {
            rrbb_3.package_ = false;
            ((Qw_1)this.throws_.class_[20]).D = rrbb_3.int_;
            ((yX_2)this.throws_.class_[8]).volatile_();
         }

         if (var1.catch_() instanceof iB_2 && ((iB_2)var1.catch_()).Sl()) {
            float var7 = Math.min((float)((Integer)((iB_2)var1.catch_()).private_[13]).intValue() + var2, 20.0F);
            var4 /= (double)((1.0F - 500.0F / (var7 + 500.0F)) * 2.0F + 1.0F);
         }

         return var4;
      }
   }

   public Vq_1 throws_() {
      return this.interface_;
   }

   public ly_3 finally_() {
      return this.void_;
   }

   public ct_3 catch_() {
      return this.implements_;
   }

   public HQ extends_() {
      return this.this_;
   }

   public void case_() {
      this.while_ = null;
      this.implements_.class_();
      this.void_.package_();
   }

   private void continue_() {
      rrbb_3.rf();
      rrbo_3.class_();
      if (!this.static_) {
         rrxM_2.class_();
         if (rrbb_3.ru() == 64 && rrbb_3.rm() == 32) {
            rrbb_3.class_(true);
         }

         this.static_ = true;
      }

      gm_3 var1 = (gm_3)this.throws_.class_[56];
      if (var1 != null && rrbb_3.rZ()) {
         rrbb_3.class_(false);
         rgN_2 var2 = new rgN_2(jI_2.class_("of.message.java64Bit"));
         ((cq_3)this.throws_.class_[19]).throws_().class_(var2);
      }

      vm_3 var3 = (vm_3)this.throws_.class_[73];
      if (var3 instanceof vB_2 var4) {
         this.class_(var4);
      }

      if (this.import_ != var1) {
         rrME.class_(this.import_, var1);
         rrbb_3.volatile_();
         this.default_ = 0L;
         this.const_ = 0;
         this.import_ = var1;
      }

      if (!this.class_(rrdZ.So)) {
         rrdZ.So = 0;
      }

      if ((vm_3)this.throws_.class_[73] != null && ((vm_3)this.throws_.class_[73]).getClass() == FP.class) {
         this.throws_.break_(new rrJr_1((FP)((vm_3)this.throws_.class_[73])));
      }
   }

   public float implements_() {
      return this.private_;
   }

   private void new_() {
      this.boolean_ = 0;
      if (!rrbb_3.rO() || !rrbb_3.rM()) {
         this.default_ = 0L;
         this.const_ = 0;
      } else if (this.throws_.switch_()) {
         rng_3 var1 = this.throws_.this_();
         if (var1 != null) {
            boolean var2 = this.throws_.throw_();
            if (!var2 && !((vm_3)this.throws_.class_[73] instanceof Zb_1)) {
               if (this.strictfp_ > 0) {
                  rrbb_3.class_((long)this.strictfp_);
                  this.boolean_ = this.strictfp_;
               }

               long var3 = System.nanoTime() / 1000000L;
               if (this.default_ != 0L && this.const_ != 0) {
                  long var5 = var3 - this.default_;
                  if (var5 < 0L) {
                     this.default_ = var3;
                     var5 = 0L;
                  }

                  if (var5 >= 50L) {
                     this.default_ = var3;
                     int var7 = var1.Q();
                     int var8 = var7 - this.const_;
                     if (var8 < 0) {
                        this.const_ = var7;
                        var8 = 0;
                     }

                     if (var8 < 1 && this.strictfp_ < 100) {
                        this.strictfp_ += 2;
                     }

                     if (var8 > 1 && this.strictfp_ > 0) {
                        this.strictfp_--;
                     }

                     this.const_ = var7;
                  }
               } else {
                  this.default_ = var3;
                  this.const_ = var1.Q();
                  this.for_ = 1.0F;
                  this.transient_ = 50.0F;
               }
            } else {
               if ((vm_3)this.throws_.class_[73] instanceof Zb_1) {
                  rrbb_3.class_(20L);
               }

               this.default_ = 0L;
               this.const_ = 0;
            }
         }
      }
   }

   private void package_() {
      if (((yX_2)this.throws_.class_[8]).private_() > 10 && ((yX_2)this.throws_.class_[8]).native_() && !this.throws_.this_().while_()) {
         fN_2 var1 = rqW_2.class_(this.throws_.else_().extends_(), this.throws_.else_().native_(), this.throws_.B());
         rqR_2.catch_().execute(() -> {
            int var2 = var1.class_();
            int var3 = var1.break_();
            int var4 = 0;
            int var5 = 0;
            if (var2 > var3) {
               var4 = (var2 - var3) / 2;
               var2 = var3;
            } else {
               var5 = (var3 - var2) / 2;
               var3 = var2;
            }

            try (fN_2 var6 = new fN_2(64, 64, false)) {
               var1.class_(var4, var5, var2, var3, var6);
               var6.class_(this.throws_.this_().try_());
            } catch (IOException var16) {
               protected_.warn("Couldn't save auto screenshot", var16);
            } finally {
               var1.close();
            }
         });
      }
   }

   private void super_() {
      if ((gm_3)this.throws_.class_[56] != null && rrbb_3.rT() && rrzQ_2.class_("CheckGlErrorFrameFinish", 10000L)) {
         int var1 = MT.switch_();
         if (var1 != 0 && rrbo_3.class_(var1)) {
            String var2 = rrbb_3.byte_(var1);
            rgN_2 var3 = new rgN_2(jI_2.class_("of.message.openglError", var1, var2));
            ((cq_3)this.throws_.class_[19]).throws_().class_(var3);
         }
      }
   }

   public void protected_() {
      this.final_();
      this.this_.class_();
      if (this.throws_.catch_() == null) {
         this.throws_.break_((cb_3)this.throws_.class_[57]);
      }

      this.void_.class_();
      this.extends_++;
      this.class_.class_();
      ((yX_2)this.throws_.class_[8]).class_(this.void_);
      this.package_ = this.final_;
      if (((cq_3)this.throws_.class_[19]).extends_().throws_()) {
         this.final_ += 0.05F;
         if (this.final_ > 1.0F) {
            this.final_ = 1.0F;
         }
      } else if (this.final_ > 0.0F) {
         this.final_ -= 0.0125F;
      }

      if (this.try_ > 0) {
         this.try_--;
         if (this.try_ == 0) {
            this.while_ = null;
         }
      }
   }

   public rrGK private_() {
      return rrGD.SHADERS;
   }

   private void final_() {
      float var1 = 1.0F;
      if (this.throws_.catch_() instanceof cG_2 var2) {
         var1 = var2.new_();
      }

      this.volatile_ = this.native_;
      this.native_ = this.native_ + (var1 - this.native_) * 0.5F;
      if (this.native_ > 1.5F) {
         this.native_ = 1.5F;
      }

      if (this.native_ < 0.1F) {
         this.native_ = 0.1F;
      }
   }

   public rjV_2 volatile_() {
      return this.char_;
   }

   public fZ_2 native_() {
      return this.else_;
   }
}
