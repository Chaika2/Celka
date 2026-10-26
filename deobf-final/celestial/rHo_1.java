package celestial;

class rHo_1 implements rpF_2 {
   rHo_1(rHR var1) {
      this.class_ = var1;
   }

   @Override
   public int class_() {
      return 1;
   }

   @Override
   public void class_(int var1, int var2) {
      if (var1 == 0) {
         this.class_.class_(var2);
      }
   }

   @Override
   public int class_(int var1) {
      return var1 == 0 ? this.class_.protected_ : 0;
   }
}
