package celestial;

class rGh_1 extends rBk_1 {
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 10;
      this.class_.super_ = rGS.CIRCLE;
      this.catch_();
   }

   rGh_1(rGB var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      return var1 != null ? this.class_.class_(this.class_.I_(), ay_3.class_) : false;
   }

   @Override
   public void throws_() {
      if (this.class_.super_ == rGS.CIRCLE) {
         this.break_--;
         if (this.break_ <= 0) {
            this.class_.super_ = rGS.SWOOP;
            this.catch_();
            this.break_ = (8 + rGB.finally_(this.class_).nextInt(4)) * 20;
            this.class_.class_(rqn_3.OY, 10.0F, 0.95F + rGB.extends_(this.class_).nextFloat() * 0.1F);
         }
      }
   }

   private void catch_() {
      this.class_.protected_ = this.class_.I_().Bs().break_(20 + rGB.native_(this.class_).nextInt(20));
      if (this.class_.protected_.c_() < ((rYB)this.class_.throws_[7]).short_()) {
         this.class_.protected_ = new rfH_2(this.class_.protected_.b_(), ((rYB)this.class_.throws_[7]).short_() + 1, this.class_.protected_.d_());
      }
   }

   @Override
   public void protected_() {
      this.class_.protected_ = ((rYB)this.class_.throws_[7])
         .class_(rKv_1.MOTION_BLOCKING, this.class_.protected_)
         .break_(10 + rGB.implements_(this.class_).nextInt(20));
   }
}
