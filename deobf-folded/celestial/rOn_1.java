package celestial;

import java.util.Random;

class rOn_1 extends rBk_1 {
   private final rON id_class;
   private final double id_break;
   private boolean id_byte;

   @Override
   public void id_byte() {
      short var1 = 512;
      byte var2 = 4;
      Random var3 = rON.id_byte(this.id_class);
      int var4 = var3.nextInt(1025) - 512;
      int var5 = var3.nextInt(9) - 4;
      int var6 = var3.nextInt(1025) - 512;
      if ((double)var5 + this.id_class.re() > (double)(((rYB)this.id_class.id_throws[7]).id_short() - 1)) {
         var5 = 0;
      }

      rfH_2 var7 = new rfH_2((double)var4 + this.id_class.rx(), (double)var5 + this.id_class.re(), (double)var6 + this.id_class.BO());
      this.id_class.id_finally(var7);
      this.id_class.id_return(true);
      this.id_byte = false;
   }

   rOn_1(rON var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean id_class() {
      return !this.id_class.sc() && !this.id_class.L() && this.id_class.rT();
   }

   @Override
   public boolean id_break() {
      return !this.id_class.id_public().id_native() && !this.id_byte && !this.id_class.sc() && !this.id_class.sQ() && !this.id_class.L();
   }

   @Override
   public void id_throws() {
      if (this.id_class.id_public().id_native()) {
         rjU_2 var1 = rjU_2.id_protected(this.id_class.sd());
         rjU_2 var2 = iX_2.id_class(this.id_class, 16, 3, var1, (float) (Math.PI / 10));
         if (var2 == null) {
            var2 = iX_2.id_break(this.id_class, 8, 7, var1);
         }

         if (var2 != null) {
            int var3 = rfU_2.id_byte(var2.id_break);
            int var4 = rfU_2.id_byte(var2.id_protected);
            byte var5 = 34;
            if (!((rYB)this.id_class.id_throws[7]).id_class(var3 - 34, 0, var4 - 34, var3 + 34, 0, var4 + 34)) {
               var2 = null;
            }
         }

         if (var2 == null) {
            this.id_byte = true;
            return;
         }

         this.id_class.id_public().id_class(var2.id_break, var2.id_byte, var2.id_protected, this.id_break);
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_return(false);
      super.id_protected();
   }
}
