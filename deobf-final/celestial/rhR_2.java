package celestial;

public class rhR_2 extends rhv_3 {
   public rhR_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.l, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhR_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.l, var2, var3, var5, var7, var1);
   }

   public rhR_2(aI_2<? extends rhR_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         this.PD();
      }
   }

   @Override
   protected void class_(rff_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         an_3 var2 = this.else_();
         if (var2 == null || !(var2 instanceof is_3) || ((rYB)this.throws_[7]).B().break_(rRu_1.break_)) {
            rfH_2 var3 = var1.class_().break_(var1.break_());
            if (((rYB)this.throws_[7]).finally_(var3)) {
               ((rYB)this.throws_[7]).break_(var3, Jj_1.class_((rYB)this.throws_[7], var3));
            }
         }
      }
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         an_3 var2 = var1.class_();
         if (!var2.q()) {
            an_3 var3 = this.else_();
            int var4 = var2.ru();
            var2.case_(5);
            boolean var5 = var2.break_(rye_3.class_((rhv_3)this, var3), 5.0F);
            if (!var5) {
               var2.protected_(var4);
            } else if (var3 instanceof iB_2) {
               this.class_((iB_2)var3, var2);
            }
         }
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return false;
   }

   @Override
   public boolean rY() {
      return false;
   }
}
