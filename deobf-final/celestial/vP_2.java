package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public class vP_2 extends Fu_1<rJL> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/loom.png");
   private static final int throws_ = (rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS - 1 + 4 - 1) / 4;
   private final Iq_1 case_;
   private List<Pair<rHE, rxL_2>> catch_;
   private rdn_3 private_ = rdn_3.break_;
   private rdn_3 implements_ = rdn_3.break_;
   private rdn_3 finally_ = rdn_3.break_;
   private boolean boolean_;
   private boolean transient_;
   private boolean for_;
   private float double_;
   private boolean switch_;
   private int r = 1;

   private void byte_(int var1, int var2, int var3) {
      rdn_3 var4 = new rdn_3(rdy_3.di);
      rcd_3 var5 = var4.class_("BlockEntityTag");
      rcy_3 var6 = new rHG().class_(rHE.BASE, rxL_2.GRAY).class_(rHE.values()[var1], rxL_2.WHITE).class_();
      var5.class_("Patterns", var6);
      Ml_1 var7 = new Ml_1();
      var7.class_();
      var7.class_((double)((float)var2 + 0.5F), (double)(var3 + 16), 0.0);
      var7.class_(6.0F, -6.0F, 1.0F);
      var7.class_(0.5, 0.5, 0.0);
      var7.class_(0.5, 0.5, 0.5);
      float var8 = 0.6666667F;
      var7.class_(0.6666667F, -0.6666667F, -0.6666667F);
      Hd_1 var9 = this.volatile_.interface_().break_();
      this.case_.case_ = 0.0F;
      this.case_.protected_ = -32.0F;
      List var10 = rHb_1.class_(rxL_2.GRAY, rHb_1.class_(var4));
      fD_2.class_(var7, var9, 15728880, fZ_2.class_, this.case_, IC.case_, true, var10);
      var7.break_();
      var9.break_();
   }

   public vP_2(rJL var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.case_ = fD_2.class_();
      var1.class_(this::finally_);
      this.goto_ -= 2;
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (this.switch_ && this.boolean_) {
         int var10 = this.abstract_ + 13;
         int var11 = var10 + 56;
         this.double_ = ((float)var3 - (float)var10 - 7.5F) / ((float)(var11 - var10) - 15.0F);
         this.double_ = rfU_2.class_(this.double_, 0.0F, 1.0F);
         int var12 = throws_ - 4;
         int var13 = (int)((double)(this.double_ * (float)var12) + 0.5);
         if (var13 < 0) {
            var13 = 0;
         }

         this.r = 1 + var13 * 4;
         return true;
      } else {
         return super.class_(var1, var3, var5, var6, var8);
      }
   }

   @Override
   protected boolean class_(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.synchronized_) || var3 >= (double)(var6 + this.return_);
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      if (this.boolean_) {
         int var7 = throws_ - 4;
         this.double_ = (float)((double)this.double_ - var5 / (double)var7);
         this.double_ = rfU_2.class_(this.double_, 0.0F, 1.0F);
         this.r = 1 + (int)((double)(this.double_ * (float)var7) + 0.5) * 4;
      }

      return true;
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      this.class_(var1);
      this.volatile_.A().class_(class_);
      int var5 = this.char_;
      int var6 = this.abstract_;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      rJY var7 = this.instanceof_.break_();
      rJY var8 = this.instanceof_.byte_();
      rJY var9 = this.instanceof_.protected_();
      rJY var10 = this.instanceof_.throws_();
      if (!var7.break_()) {
         this.break_(var1, var5 + var7.throws_, var6 + var7.case_, this.synchronized_, 0, 16, 16);
      }

      if (!var8.break_()) {
         this.break_(var1, var5 + var8.throws_, var6 + var8.case_, this.synchronized_ + 16, 0, 16, 16);
      }

      if (!var9.break_()) {
         this.break_(var1, var5 + var9.throws_, var6 + var9.case_, this.synchronized_ + 32, 0, 16, 16);
      }

      int var11 = (int)(41.0F * this.double_);
      this.break_(var1, var5 + 119, var6 + 13 + var11, 232 + (this.boolean_ ? 0 : 12), 0, 12, 15);
      HF.byte_();
      if (this.catch_ != null && !this.for_) {
         Hd_1 var12 = this.volatile_.interface_().break_();
         var1.class_();
         var1.class_((double)(var5 + 139), (double)(var6 + 52), 0.0);
         var1.class_(24.0F, -24.0F, 1.0F);
         var1.class_(0.5, 0.5, 0.5);
         float var13 = 0.6666667F;
         var1.class_(0.6666667F, -0.6666667F, -0.6666667F);
         this.case_.case_ = 0.0F;
         this.case_.protected_ = -32.0F;
         fD_2.class_(var1, var12, 15728880, fZ_2.class_, this.case_, IC.case_, true, this.catch_);
         var1.break_();
         var12.break_();
      } else if (this.for_) {
         this.break_(var1, var5 + var10.throws_ - 2, var6 + var10.case_ - 2, this.synchronized_, 17, 17, 16);
      }

      if (this.boolean_) {
         int var20 = var5 + 60;
         int var22 = var6 + 13;
         int var14 = this.r + 16;

         for (int var15 = this.r; var15 < var14 && var15 < rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS; var15++) {
            int var16 = var15 - this.r;
            int var17 = var20 + var16 % 4 * 14;
            int var18 = var22 + var16 / 4 * 14;
            this.volatile_.A().class_(class_);
            int var19 = this.return_;
            if (var15 == this.instanceof_.class_()) {
               var19 += 14;
            } else if (var3 >= var17 && var4 >= var18 && var3 < var17 + 14 && var4 < var18 + 14) {
               var19 += 28;
            }

            this.break_(var1, var17, var18, 0, var19, 14, 14);
            this.byte_(var15, var17, var18);
         }
      } else if (this.transient_) {
         int var21 = var5 + 60;
         int var23 = var6 + 13;
         this.volatile_.A().class_(class_);
         this.break_(var1, var21, var23, 0, this.return_, 14, 14);
         int var24 = this.instanceof_.class_();
         this.byte_(var24, var21, var23);
      }

      HF.protected_();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.switch_ = false;
      if (this.boolean_) {
         int var6 = this.char_ + 60;
         int var7 = this.abstract_ + 13;
         int var8 = this.r + 16;

         for (int var9 = this.r; var9 < var8; var9++) {
            int var10 = var9 - this.r;
            double var11 = var1 - (double)(var6 + var10 % 4 * 14);
            double var13 = var3 - (double)(var7 + var10 / 4 * 14);
            if (var11 >= 0.0 && var13 >= 0.0 && var11 < 14.0 && var13 < 14.0 && this.instanceof_.break_((cb_3)this.volatile_.class_[57], var9)) {
               QY.instanceof_().c().class_(Np_1.class_(rqn_3.dI, 1.0F));
               ((Ax_1)this.volatile_.class_[55]).class_(this.instanceof_.case_, var9);
               return true;
            }
         }

         var6 = this.char_ + 119;
         var7 = this.abstract_ + 9;
         if (var1 >= (double)var6 && var1 < (double)(var6 + 12) && var3 >= (double)var7 && var3 < (double)(var7 + 56)) {
            this.switch_ = true;
         }
      }

      return super.break_(var1, var3, var5);
   }

   private void finally_() {
      rdn_3 var1 = this.instanceof_.throws_().class_();
      if (var1.class_()) {
         this.catch_ = null;
      } else {
         this.catch_ = rHb_1.class_(((rxO_2)var1.break_()).byte_(), rHb_1.class_(var1));
      }

      rdn_3 var2 = this.instanceof_.break_().class_();
      rdn_3 var3 = this.instanceof_.byte_().class_();
      rdn_3 var4 = this.instanceof_.protected_().class_();
      rcd_3 var5 = var2.class_("BlockEntityTag");
      this.for_ = var5.byte_("Patterns", 9) && !var2.class_() && var5.protected_("Patterns", 10).size() >= 6;
      if (this.for_) {
         this.catch_ = null;
      }

      if (!rdn_3.break_(var2, this.private_) || !rdn_3.break_(var3, this.implements_) || !rdn_3.break_(var4, this.finally_)) {
         this.boolean_ = !var2.class_() && !var3.class_() && var4.class_() && !this.for_;
         this.transient_ = !this.for_ && !var4.class_() && !var2.class_() && !var3.class_();
      }

      this.private_ = var2.implements_();
      this.implements_ = var3.implements_();
      this.finally_ = var4.implements_();
   }
}
