package celestial;

public class rSL extends rSp_1 {
   private rjU_2 break_;
   private int byte_;

   @Override
   public void byte_() {
      this.break_ = null;
      this.byte_ = 0;
   }

   public rSL(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void class_() {
      if (this.byte_++ % 10 == 0) {
         float var1 = (this.class_.Sa().nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.class_.Sa().nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.class_.Sa().nextFloat() - 0.5F) * 8.0F;
         ((rYB)this.class_.throws_[7])
            .class_(rLQ.synchronized_, this.class_.rx() + (double)var1, this.class_.re() + 2.0 + (double)var2, this.class_.BO() + (double)var3, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void break_() {
      this.byte_++;
      if (this.break_ == null) {
         rfH_2 var1 = ((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING, rUs_1.class_);
         this.break_ = rjU_2.protected_(var1);
      }

      double var3 = this.break_.protected_(this.class_.rx(), this.class_.re(), this.class_.BO());
      if (!(var3 < 100.0) && !(var3 > 22500.0) && !(Boolean)this.class_.throws_[23] && !(Boolean)this.class_.throws_[24]) {
         this.class_.public_(1.0F);
      } else {
         this.class_.public_(0.0F);
      }
   }

   @Override
   public float throws_() {
      return 3.0F;
   }

   @Override
   public rjU_2 case_() {
      return this.break_;
   }

   @Override
   public rST<rSL> protected_() {
      return rST.finally_;
   }
}
