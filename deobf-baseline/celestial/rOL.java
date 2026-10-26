package celestial;

class rOL extends rBY {
   rOL(rON var1, double var2) {
      super(var1, var2);
   }

   @Override
   public boolean id_class() {
      if (this.id_class.Sr() == null && !this.id_class.Pz()) {
         return false;
      } else {
         rfH_2 var1 = this.id_class((rYB)this.id_class.id_throws[7], this.id_class, 7, 4);
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
}
