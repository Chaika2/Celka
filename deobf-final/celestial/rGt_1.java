package celestial;

public abstract class rGt_1 extends rBk_1 {
   protected int break_;
   protected int byte_;

   @Override
   public void byte_() {
      this.break_ = this.volatile_();
      this.protected_.protected_ = this.catch_();
      this.byte_ = (Integer)this.protected_.throws_[41] + this.private_();
      rqA_2 var1 = this.extends_();
      if (var1 != null) {
         this.protected_.class_(var1, 1.0F, 1.0F);
      }

      this.protected_.class_(this.native_());
   }

   protected rGt_1(rGp_1 var1) {
      this.protected_ = var1;
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.protected_.I_();
      if (var1 == null || !var1.BM()) {
         return false;
      } else {
         return this.protected_.sn() ? false : (Integer)this.protected_.throws_[41] >= this.byte_;
      }
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.protected_.I_();
      return var1 != null && var1.BM() && this.break_ > 0;
   }

   @Override
   public void throws_() {
      this.break_--;
      if (this.break_ == 0) {
         this.finally_();
         this.protected_.class_(this.protected_.sc(), 1.0F, 1.0F);
      }
   }

   protected abstract void finally_();

   protected abstract int catch_();

   protected abstract rqA_2 extends_();

   protected abstract int private_();

   protected int volatile_() {
      return 20;
   }

   protected abstract rGT native_();
}
