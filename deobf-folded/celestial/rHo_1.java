package celestial;

class rHo_1 implements rpF_2 {
   rHo_1(rHR var1) {
      this.id_class = var1;
   }

   @Override
   public int id_class() {
      return 1;
   }

   @Override
   public void id_class(int var1, int var2) {
      if (var1 == 0) {
         this.id_class.id_class(var2);
      }
   }

   @Override
   public int id_class(int var1) {
      return var1 == 0 ? this.id_class.id_protected : 0;
   }
}
