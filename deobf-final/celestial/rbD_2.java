package celestial;

import java.util.List;

class rbD_2 extends rBk_1 {
   private int break_;

   @Override
   public void byte_() {
      List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rbo_3.class_);
      if (!var1.isEmpty()) {
         this.class_.public_().class_((an_3)var1.get(0), 1.2F);
         this.class_.class_(rqn_3.Pg, 1.0F, 1.0F);
      }

      this.break_ = 0;
   }

   rbD_2(rbo_3 var1) {
      this.class_ = var1;
   }

   private void class_(rdn_3 var1) {
      if (!var1.class_()) {
         double var2 = this.class_.rH() - 0.3F;
         rsE_2 var4 = new rsE_2((rYB)this.class_.throws_[7], this.class_.rx(), var2, this.class_.BO(), var1);
         var4.class_(40);
         var4.byte_(this.class_.ro());
         float var5 = 0.3F;
         float var6 = rbo_3.break_(this.class_).nextFloat() * (float) (Math.PI * 2);
         float var7 = 0.02F * rbo_3.byte_(this.class_).nextFloat();
         var4.catch_(
            (double)(
               0.3F
                     * -rfU_2.class_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0))
                     * rfU_2.break_((Float)this.class_.throws_[16] * (float) (Math.PI / 180.0))
                  + rfU_2.break_(var6) * var7
            ),
            (double)(0.3F * rfU_2.class_((Float)this.class_.throws_[16] * (float) (Math.PI / 180.0)) * 1.5F),
            (double)(
               0.3F
                     * rfU_2.break_((Float)this.class_.throws_[15] * (float) (Math.PI / 180.0))
                     * rfU_2.break_((Float)this.class_.throws_[16] * (float) (Math.PI / 180.0))
                  + rfU_2.class_(var6) * var7
            )
         );
         ((rYB)this.class_.throws_[7]).a_(var4);
      }
   }

   @Override
   public boolean class_() {
      if (this.break_ > (Integer)this.class_.throws_[41]) {
         return false;
      } else {
         List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rbo_3.class_);
         return !var1.isEmpty() || !this.class_.class_(rXQ.MAINHAND).class_();
      }
   }

   @Override
   public void throws_() {
      List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rbo_3.class_);
      rdn_3 var2 = this.class_.class_(rXQ.MAINHAND);
      if (!var2.class_()) {
         this.class_(var2);
         this.class_.class_(rXQ.MAINHAND, rdn_3.break_);
      } else if (!var1.isEmpty()) {
         this.class_.public_().class_((an_3)var1.get(0), 1.2F);
      }
   }

   @Override
   public void protected_() {
      rdn_3 var1 = this.class_.class_(rXQ.MAINHAND);
      if (!var1.class_()) {
         this.class_(var1);
         this.class_.class_(rXQ.MAINHAND, rdn_3.break_);
         this.break_ = (Integer)this.class_.throws_[41] + rbo_3.class_(this.class_).nextInt(100);
      }
   }
}
