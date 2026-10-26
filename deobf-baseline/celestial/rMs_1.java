package celestial;

class rMs_1 extends rBO {
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_break.sL();
      super.id_byte();
   }

   public rMs_1(rba_3 var1, double var2) {
      super(var1, var2);
      this.id_break = var1;
      this.id_byte = 100;
   }

   @Override
   public boolean id_class() {
      if (this.id_break.Sc() || this.id_class.I_() != null) {
         return false;
      } else if (((rYB)this.id_break.id_throws[7]).S()) {
         return true;
      } else if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else {
         this.id_byte = 100;
         rfH_2 var1 = this.id_class.Bs();
         return ((rYB)this.id_break.id_throws[7]).id_strictfp()
            && ((rYB)this.id_break.id_throws[7]).id_case(var1)
            && !((rrEm_1)((rYB)this.id_break.id_throws[7])).id_throw(var1)
            && this.id_catch();
      }
   }
}
