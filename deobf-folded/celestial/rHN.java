package celestial;

class rHN implements rpF_2 {
   rHN(rHQ var1) {
      this.id_class = var1;
   }

   @Override
   public int id_class() {
      return 2;
   }

   @Override
   public void id_class(int var1, int var2) {
      switch (var1) {
         case 0:
            this.id_class.id_case = var2;
            break;
         case 1:
            this.id_class.id_implements = var2;
      }
   }

   @Override
   public int id_class(int var1) {
      switch (var1) {
         case 0:
            return this.id_class.id_case;
         case 1:
            return this.id_class.id_implements;
         default:
            return 0;
      }
   }
}
