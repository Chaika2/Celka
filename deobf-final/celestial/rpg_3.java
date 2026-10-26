package celestial;

class rpg_3 extends rpj_3 {
   rpg_3(int[] var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void class_(int var1) {
      this.class_[this.break_] = var1;
   }

   @Override
   public int break_() {
      return this.class_[this.break_];
   }
}
