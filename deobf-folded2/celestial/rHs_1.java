package celestial;

class rHs_1 implements rpF_2 {
   rHs_1(rHS var1) {
      this.id_class = var1;
   }

   @Override
   public int id_class() {
      return 4;
   }

   @Override
   public void id_class(int var1, int var2) {
      switch (var1) {
         case 0:
            this.id_class.id_catch = var2;
            break;
         case 1:
            this.id_class.id_private = var2;
            break;
         case 2:
            this.id_class.id_implements = var2;
            break;
         case 3:
            this.id_class.id_finally = var2;
      }
   }

   @Override
   public int id_class(int var1) {
      switch (var1) {
         case 0:
            return this.id_class.id_catch;
         case 1:
            return this.id_class.id_private;
         case 2:
            return this.id_class.id_implements;
         case 3:
            return this.id_class.id_finally;
         default:
            return 0;
      }
   }
}
