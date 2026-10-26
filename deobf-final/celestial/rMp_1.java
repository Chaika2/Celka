package celestial;

class rMp_1 extends rBk_1 {
   private final rMl_1 class_;

   @Override
   public void byte_() {
      this.class_.return_(true);
   }

   public rMp_1(rMl_1 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.class_.n_() && this.class_.sy()) {
         return this.class_.sC() && rMl_1.class_(this.class_).nextInt(500) == 1 ? true : rMl_1.break_(this.class_).nextInt(6000) == 1;
      } else {
         return false;
      }
   }

   @Override
   public boolean break_() {
      return false;
   }
}
