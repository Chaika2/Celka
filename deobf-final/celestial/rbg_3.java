package celestial;

class rbg_3 extends rSO {
   private rhd_3 byte_;
   private final rbf_3 protected_;

   public rbg_3(rbf_3 var1, double var2, rkg_3 var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.protected_ = var1;
   }

   @Override
   public boolean class_() {
      return super.class_() && !this.protected_.sZ();
   }

   @Override
   public void throws_() {
      super.throws_();
      if (this.byte_ == null && this.class_.Sa().nextInt(600) == 0) {
         this.byte_ = this.break_;
      } else if (this.class_.Sa().nextInt(500) == 0) {
         this.byte_ = null;
      }
   }

   @Override
   protected boolean catch_() {
      return this.byte_ != null && this.byte_.equals(this.break_) ? false : super.catch_();
   }
}
