package celestial;

public class rhH_2 extends rhv_3 {
   public int catch_ = 1;

   public rhH_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.const_, var2, var3, var5, var7, var1);
   }

   public rhH_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.const_, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhH_2(aI_2<? extends rhH_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("ExplosionPower", this.catch_);
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         an_3 var2 = var1.class_();
         an_3 var3 = this.else_();
         var2.break_(rye_3.class_((rhv_3)this, var3), 6.0F);
         if (var3 instanceof iB_2) {
            this.class_((iB_2)var3, var2);
         }
      }
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         boolean var2 = ((rYB)this.throws_[7]).B().break_(rRu_1.break_);
         ((rYB)this.throws_[7]).class_((an_3)null, this.rx(), this.re(), this.BO(), (float)this.catch_, var2, var2 ? rRz_1.DESTROY : rRz_1.NONE);
         this.PD();
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("ExplosionPower", 99)) {
         this.catch_ = var1.private_("ExplosionPower");
      }
   }
}
