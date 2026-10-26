package celestial;

class rMI extends rBY {
   private final rMl_1 id_catch;

   public rMI(rMl_1 var1, double var2) {
      super(var1, var2);
      this.id_catch = var1;
   }

   @Override
   public boolean id_class() {
      if (!this.id_catch.Pz()) {
         return false;
      } else {
         rfH_2 var1 = this.id_class((rYB)this.id_class.id_throws[7], this.id_class, 5, 4);
         if (var1 != null) {
            this.id_byte = (double)var1.b_();
            this.id_protected = (double)var1.c_();
            this.id_throws = (double)var1.d_();
            return true;
         } else {
            return this.id_catch();
         }
      }
   }

   @Override
   public boolean id_break() {
      if (this.id_catch.sJ()) {
         this.id_catch.id_public().id_final();
         return false;
      } else {
         return super.id_break();
      }
   }
}
