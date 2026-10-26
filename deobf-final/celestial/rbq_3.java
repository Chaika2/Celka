package celestial;

abstract class rbq_3 extends rBk_1 {
   rbq_3(rbF_2 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      return this.catch_() && !this.break_.T_();
   }

   @Override
   public boolean break_() {
      return this.private_() && !this.break_.T_();
   }

   public abstract boolean catch_();

   public abstract boolean private_();
}
