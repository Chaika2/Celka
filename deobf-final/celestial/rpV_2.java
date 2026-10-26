package celestial;

class rpV_2 extends rpj_3 {
   rpV_2(rpF_2 var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void class_(int var1) {
      this.class_.class_(this.break_, var1);
   }

   @Override
   public int break_() {
      return this.class_.class_(this.break_);
   }
}
