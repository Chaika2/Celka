package celestial;

class rdF_2 implements rdE_2 {
   private double id_class;
   private double id_break;
   private long id_byte;

   private double id_class(rYB var1, double var2) {
      if (var1.r() != this.id_byte) {
         this.id_byte = var1.r();
         double var4 = var2 - this.id_class;
         var4 = rfU_2.id_byte(var4 + 0.5, 1.0) - 0.5;
         this.id_break += var4 * 0.1;
         this.id_break *= 0.9;
         this.id_class = rfU_2.id_byte(this.id_class + this.id_break, 1.0);
      }

      return this.id_class;
   }

   @Override
   public float call(rdn_3 var1, gm_3 var2xx, iB_2 var3) {
      Object var4 = var3 != null ? var3 : var1.id_try();
      if (var4 == null) {
         return 0.0F;
      } else {
         if (var2xx == null && (rYB)((an_3)var4).id_throws[7] instanceof gm_3 var2xx) {
            ;
         }

         if (var2xx == null) {
            return 0.0F;
         } else {
            double var5;
            if (var2xx.id_default().id_throws()) {
               var5 = (double)var2xx.id_protected(1.0F);
            } else {
               var5 = Math.random();
            }

            var5 = this.id_class(var2xx, var5);
            return (float)var5;
         }
      }
   }
}
