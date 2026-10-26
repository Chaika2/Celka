package celestial;

class rHh_1 implements rpF_2 {
   rHh_1(rHO var1) {
      this.id_class = var1;
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public void id_class(int var1, int var2) {
      switch (var1) {
         case 0:
            this.id_class.id_throws = var2;
            break;
         case 1:
            if (!this.id_class.id_extends.id_continue && !this.id_class.id_byte.isEmpty()) {
               this.id_class.id_class(rqn_3.C);
            }

            this.id_class.id_catch = rHO.id_class(var2);
            break;
         case 2:
            this.id_class.id_private = rHO.id_class(var2);
      }
   }

   @Override
   public int id_class(int var1) {
      switch (var1) {
         case 0:
            return this.id_class.id_throws;
         case 1:
            return rLR.id_class(this.id_class.id_catch);
         case 2:
            return rLR.id_class(this.id_class.id_private);
         default:
            return 0;
      }
   }
}
