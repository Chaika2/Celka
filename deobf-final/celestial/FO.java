package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FO extends FG<rJf_1> implements rrvs_1 {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/anvil.png");
   private static final rgP_2 throws_ = new rgn_3("container.repair.expensive");
   private Lu_1 case_;

   public FO(rJf_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3, class_);
      this.public_ = 60;
   }

   @Override
   public void class_(rJr_1 var1, int var2, rdn_3 var3) {
      if (var2 == 0) {
         this.case_.class_(var3.class_() ? "" : var3.continue_().getString());
         this.case_.case_(!var3.class_());
         this.class_(this.case_);
      }
   }

   private void class_(String var1) {
      if (!var1.isEmpty()) {
         String var2 = var1;
         rJY var3 = this.instanceof_.class_(0);
         if (var3 != null && var3.break_() && !var3.class_().this_() && var1.equals(var3.class_().continue_().getString())) {
            var2 = "";
         }

         this.instanceof_.class_(var2);
         ((Aq_1)((cb_3)this.volatile_.class_[57]).break_[0]).class_(new rZz_1(var2));
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (var1 == 256) {
         ((cb_3)this.volatile_.class_[57]).strictfp_();
      }

      return !this.case_.class_(var1, var2, var3) && !this.case_.volatile_() ? super.class_(var1, var2, var3) : true;
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.class_(var1, var2, var3);
      int var4 = this.instanceof_.break_();
      if (var4 > 0) {
         int var5 = 8453920;
         Object var6;
         if (var4 >= 40 && !((rhx_3)((cb_3)this.volatile_.class_[57]).implements_[18]).protected_) {
            var6 = throws_;
            var5 = 16736352;
         } else if (!this.instanceof_.class_(2).break_()) {
            var6 = null;
         } else {
            var6 = new rgn_3("container.repair.cost", var4);
            if (this.throw_ != null && !this.instanceof_.class_(2).class_(this.throw_.throws_)) {
               var5 = 16736352;
            }
         }

         if (var6 != null) {
            int var7 = this.synchronized_ - 8 - this.super_.class_((rgS_2)var6) - 2;
            byte var8 = 69;
            class_(var1, var7 - 2, 67, this.synchronized_ - 8, 79, 1325400064);
            this.super_.break_(var1, (rgP_2)var6, (float)var7, 69.0F, var5);
         }
      }
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.case_.private_();
      this.break_(var1, var2, var3);
      this.case_.class_(var4);
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      this.case_.class_(var1, var2, var3, var4);
   }

   @Override
   public void private_() {
      super.private_();
      this.case_.catch_();
   }

   @Override
   protected void native_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      int var1 = (this.package_ - this.synchronized_) / 2;
      int var2 = (this.int_ - this.return_) / 2;
      this.case_ = new Lu_1(this.super_, var1 + 62, var2 + 24, 103, 12, null, new rgn_3("container.repair"), false);
      this.case_.catch_(false);
      this.case_.finally_(-1);
      this.case_.extends_(-1);
      this.case_.protected_(false);
      this.case_.implements_(35);
      this.case_.class_(this::class_);
      this.native_.add(this.case_);
      this.break_(this.case_);
      vs_3.INSTANCE.class_(this);
   }

   @Override
   public boolean aO_() {
      return this.case_.volatile_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
