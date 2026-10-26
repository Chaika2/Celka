package celestial;

class rOc_1 extends rBk_1 {
   private final rON id_class;
   private final double id_break;
   private boolean id_byte;
   private int id_protected;

   @Override
   public void id_byte() {
      this.id_class.id_synchronized(true);
      this.id_byte = false;
      this.id_protected = 0;
   }

   rOc_1(rON var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean id_class() {
      if (this.id_class.n_()) {
         return false;
      } else if (this.id_class.L()) {
         return true;
      } else {
         return this.id_class.Sa().nextInt(700) != 0 ? false : !this.id_class.sx().id_class(this.id_class.Ps(), 64.0);
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.sx().id_class(this.id_class.Ps(), 7.0) && !this.id_byte && this.id_protected <= 600;
   }

   @Override
   public void id_throws() {
      rfH_2 var1 = this.id_class.sx();
      boolean var2 = var1.id_class(this.id_class.Ps(), 16.0);
      if (var2) {
         this.id_protected++;
      }

      if (this.id_class.id_public().id_native()) {
         rjU_2 var3 = rjU_2.id_protected(var1);
         rjU_2 var4 = iX_2.id_class(this.id_class, 16, 3, var3, (float) (Math.PI / 10));
         if (var4 == null) {
            var4 = iX_2.id_break(this.id_class, 8, 7, var3);
         }

         if (var4 != null && !var2 && !((rYB)this.id_class.id_throws[7]).id_byte(new rfH_2(var4)).id_class(xu_3.id_try)) {
            var4 = iX_2.id_break(this.id_class, 16, 5, var3);
         }

         if (var4 == null) {
            this.id_byte = true;
            return;
         }

         this.id_class.id_public().id_class(var4.id_break, var4.id_byte, var4.id_protected, this.id_break);
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_synchronized(false);
   }
}
