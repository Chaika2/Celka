package celestial;

class rMT extends rBk_1 {
   private final rMl_1 class_;
   private int break_;

   @Override
   public void byte_() {
      this.class_.else_(true);
      this.break_ = 0;
   }

   public rMT(rMl_1 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      return this.break_ < (Integer)this.class_.throws_[41] && this.class_.sL() && this.class_.sy() && rMl_1.byte_(this.class_).nextInt(400) == 1;
   }

   @Override
   public boolean break_() {
      return !this.class_.rT() && (this.class_.sL() || rMl_1.protected_(this.class_).nextInt(600) != 1) ? rMl_1.throws_(this.class_).nextInt(2000) != 1 : false;
   }

   @Override
   public void protected_() {
      this.class_.else_(false);
      this.break_ = (Integer)this.class_.throws_[41] + 200;
   }
}
