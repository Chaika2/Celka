package celestial;

class rEU extends rGt_1 {
   private int throws_;

   @Override
   public void byte_() {
      super.byte_();
      this.throws_ = this.class_.I_().V();
   }

   rEU(rED var1) {
      super(var1);
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      if (!super.class_()) {
         return false;
      } else if (this.class_.I_() == null) {
         return false;
      } else {
         return this.class_.I_().V() == this.throws_ ? false : ((rYB)this.class_.throws_[7]).throws_(this.class_.Bs()).class_((float)rRO.NORMAL.ordinal());
      }
   }

   @Override
   protected void finally_() {
      this.class_.I_().break_(new rLY(rLD.package_, 400));
   }

   @Override
   protected int catch_() {
      return 20;
   }

   @Override
   protected rqA_2 extends_() {
      return rqn_3.EF;
   }

   @Override
   protected int private_() {
      return 180;
   }

   @Override
   protected rGT native_() {
      return rGT.BLINDNESS;
   }
}
