package celestial;

class rGm_1 extends rBk_1 {
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 20 * (1 + rGz_1.throws_(this.class_).nextInt(3));
      this.class_.class_(30);
   }

   rGm_1(rGz_1 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      return this.class_.I_() == null && rGz_1.protected_(this.class_).nextInt(40) == 0;
   }

   @Override
   public boolean break_() {
      return this.class_.I_() == null && this.break_ > 0;
   }

   @Override
   public void throws_() {
      this.break_--;
   }

   @Override
   public void protected_() {
      if (this.class_.I_() == null) {
         this.class_.class_(0);
      }
   }
}
