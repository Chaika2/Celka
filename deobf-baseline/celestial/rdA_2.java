package celestial;

class rdA_2 {
   double id_class;
   private double id_break;
   private long id_byte;

   boolean id_class(long var1) {
      return this.id_byte != var1;
   }

   void id_class(long var1, double var3) {
      this.id_byte = var1;
      double var5 = var3 - this.id_class;
      var5 = rfU_2.id_byte(var5 + 0.5, 1.0) - 0.5;
      this.id_break += var5 * 0.1;
      this.id_break *= 0.8;
      this.id_class = rfU_2.id_byte(this.id_class + this.id_break, 1.0);
   }
}
