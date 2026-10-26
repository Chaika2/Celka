package celestial;

public class rhU_2 extends rhL_2 {
   private static final rut_3<Boolean> catch_ = rmE_2.class_(rhU_2.class, ruw_3.implements_);

   public rhU_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.rP, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhU_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.rP, var2, var3, var5, var7, var1);
   }

   public rhU_2(aI_2<? extends rhU_2> var1, rYB var2) {
      super(var1, var2);
   }

   public void class_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(catch_, var1);
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         an_3 var2 = var1.class_();
         boolean var4;
         if (this.else_() instanceof iB_2 var5) {
            var4 = var2.break_(rye_3.class_(this, var5), 8.0F);
            if (var4) {
               if (var2.BM()) {
                  this.class_(var5, var2);
               } else {
                  var5.protected_(5.0F);
               }
            }
         } else {
            var4 = var2.break_(rye_3.package_, 5.0F);
         }

         if (var4 && var2 instanceof iB_2) {
            byte var6 = 0;
            if (((rYB)this.throws_[7]).abstract_() == rRO.NORMAL) {
               var6 = 10;
            } else if (((rYB)this.throws_[7]).abstract_() == rRO.HARD) {
               var6 = 40;
            }

            if (var6 > 0) {
               ((iB_2)var2).break_(new rLY(rLD.this_, 20 * var6, 1));
            }
         }
      }
   }

   @Override
   public float class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return this.protected_() && rSN.byte_(var4) ? Math.min(0.8F, var6) : var6;
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         rRz_1 var2 = ((rYB)this.throws_[7]).B().break_(rRu_1.break_) ? rRz_1.DESTROY : rRz_1.NONE;
         ((rYB)this.throws_[7]).class_(this, this.rx(), this.re(), this.BO(), 1.0F, false, var2);
         this.PD();
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return false;
   }

   @Override
   protected boolean throws_() {
      return false;
   }

   @Override
   protected float catch_() {
      return this.protected_() ? 0.73F : super.catch_();
   }

   @Override
   public boolean protected_() {
      return ((rmE_2)this.throws_[49]).class_(catch_);
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public boolean rY() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(catch_, false);
   }
}
