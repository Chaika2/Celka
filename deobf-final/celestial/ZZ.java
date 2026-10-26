package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.stream.IntStream;

public class ZZ extends vm_3 implements rrvs_1 {
   private final jJ_2 class_ = new jJ_2();
   private final ryS_2 throws_;
   private int case_;
   private int catch_;
   private ux_3 private_;
   private final String[] implements_;

   public ZZ(ryS_2 var1) {
      super(new rgn_3("sign.edit"));
      this.implements_ = IntStream.range(0, 4).mapToObj(var1::class_).map(rgP_2::getString).toArray(String[]::new);
      this.throws_ = var1;
      vs_3.INSTANCE.class_(this);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 265) {
         this.catch_ = this.catch_ - 1 & 3;
         this.private_.throws_();
         return true;
      } else if (var1 != 264 && var1 != 257 && var1 != 335) {
         return this.private_.class_(var1) ? true : super.class_(var1, var2, var3);
      } else {
         this.catch_ = this.catch_ + 1 & 3;
         this.private_.throws_();
         return true;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      HF.byte_();
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 40, 16777215);
      var1.class_();
      var1.class_((double)(this.package_ / 2), 0.0, 50.0);
      float var5 = 93.75F;
      var1.class_(93.75F, -93.75F, 93.75F);
      var1.class_(0.0, -1.3125, 0.0);
      xc_3 var6 = this.throws_.abstract_();
      boolean var7 = var6.break_() instanceof zM_2;
      if (!var7) {
         var1.class_(0.0, -0.3125, 0.0);
      }

      boolean var8 = this.case_ / 6 % 2 == 0;
      float var9 = 0.6666667F;
      var1.class_();
      var1.class_(0.6666667F, -0.6666667F, -0.6666667F);
      Hd_1 var10 = this.volatile_.interface_().break_();
      Ig_1 var11 = jX_2.class_(var6.break_());
      Ok_1 var12 = var11.class_(var10, this.class_::class_);
      this.class_.class_.class_(var1, var12, 15728880, fZ_2.class_);
      if (var7) {
         this.class_.break_.class_(var1, var12, 15728880, fZ_2.class_);
      }

      var1.break_();
      float var13 = 0.010416667F;
      var1.class_(0.0, 0.33333334F, 0.046666667F);
      var1.class_(0.010416667F, -0.010416667F, 0.010416667F);
      int var14 = this.throws_.private_().catch_();
      int var15 = this.private_.case_();
      int var16 = this.private_.catch_();
      int var17 = this.catch_ * 10 - this.implements_.length * 5;
      rjV_2 var18 = var1.byte_().class_();

      for (int var19 = 0; var19 < this.implements_.length; var19++) {
         String var20 = this.implements_[var19];
         if (var20 != null) {
            if (this.super_.class_()) {
               var20 = this.super_.class_(var20);
            }

            float var21 = (float)(-((cm_3)this.volatile_.class_[15]).break_(var20) / 2);
            ((cm_3)this.volatile_.class_[15])
               .class_(var20, var21, (float)(var19 * 10 - this.implements_.length * 5), var14, false, var18, var10, false, 0, 15728880, false);
            if (var19 == this.catch_ && var15 >= 0 && var8) {
               int var22 = ((cm_3)this.volatile_.class_[15]).break_(var20.substring(0, Math.max(Math.min(var15, var20.length()), 0)));
               int var23 = var22 - ((cm_3)this.volatile_.class_[15]).break_(var20) / 2;
               if (var15 >= var20.length()) {
                  ((cm_3)this.volatile_.class_[15]).class_("_", (float)var23, (float)var17, var14, false, var18, var10, false, 0, 15728880, false);
               }
            }
         }
      }

      var10.break_();

      for (int var31 = 0; var31 < this.implements_.length; var31++) {
         String var32 = this.implements_[var31];
         if (var32 != null && var31 == this.catch_ && var15 >= 0) {
            int var33 = ((cm_3)this.volatile_.class_[15]).break_(var32.substring(0, Math.max(Math.min(var15, var32.length()), 0)));
            int var34 = var33 - ((cm_3)this.volatile_.class_[15]).break_(var32) / 2;
            if (var8 && var15 < var32.length()) {
               class_(var1, var34, var17 - 1, var34 + 1, var17 + 9, 0xFF000000 | var14);
            }

            if (var16 != var15) {
               int var35 = Math.min(var15, var16);
               int var24 = Math.max(var15, var16);
               int var25 = ((cm_3)this.volatile_.class_[15]).break_(var32.substring(0, var35)) - ((cm_3)this.volatile_.class_[15]).break_(var32) / 2;
               int var26 = ((cm_3)this.volatile_.class_[15]).break_(var32.substring(0, var24)) - ((cm_3)this.volatile_.class_[15]).break_(var32) / 2;
               int var27 = Math.min(var25, var26);
               int var28 = Math.max(var25, var26);
               yb_3 var29 = yb_3.class_();
               lD_2 var30 = var29.byte_();
               RenderSystem.disableTexture();
               RenderSystem.enableColorLogicOp();
               RenderSystem.logicOp(Ma_1.OR_REVERSE);
               var30.class_(7, ju_3.this_);
               var30.class_(var18, (float)var27, (float)(var17 + 9), 0.0F).break_(0, 0, 255, 255).class_();
               var30.class_(var18, (float)var28, (float)(var17 + 9), 0.0F).break_(0, 0, 255, 255).class_();
               var30.class_(var18, (float)var28, (float)var17, 0.0F).break_(0, 0, 255, 255).class_();
               var30.class_(var18, (float)var27, (float)var17, 0.0F).break_(0, 0, 255, 255).class_();
               var30.finally_();
               yk_3.class_(var30);
               RenderSystem.disableColorLogicOp();
               RenderSystem.enableTexture();
            }
         }
      }

      var1.break_();
      HF.protected_();
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.private_.class_(var1);
      return true;
   }

   @Override
   public void private_() {
      this.case_++;
      if (!this.throws_.void_().class_(this.throws_.abstract_().break_())) {
         this.native_();
      }
   }

   @Override
   public void volatile_() {
      this.native_();
   }

   private void native_() {
      this.throws_.break_();
      this.volatile_.break_((vm_3)null);
   }

   @Override
   public boolean aO_() {
      return true;
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 4 + 120, 200, 20, cN_2.byte_, var1 -> this.native_())));
      this.throws_.class_(false);
      this.private_ = new ux_3(() -> this.implements_[this.catch_], var1 -> {
         this.implements_[this.catch_] = var1;
         this.throws_.class_(this.catch_, new rgN_2(var1));
      }, ux_3.class_(this.volatile_), ux_3.byte_(this.volatile_), var1 -> ((cm_3)this.volatile_.class_[15]).break_(var1) <= 90);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
      Aq_1 var1 = this.volatile_.void_();
      if (var1 != null) {
         var1.class_(new rZy_1(this.throws_.char_(), this.implements_[0], this.implements_[1], this.implements_[2], this.implements_[3]));
      }

      this.throws_.class_(true);
   }
}
