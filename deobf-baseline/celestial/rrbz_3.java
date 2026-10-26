package celestial;

public class rrbz_3 {
   private rjU_2 id_class = null;
   private long id_break = System.currentTimeMillis();

   public rjU_2 id_class(double var1, double var3, double var5) {
      if (this.id_class == null) {
         this.id_class = new rjU_2(var1, var3, var5);
         return this.id_class;
      } else {
         long var7 = System.currentTimeMillis();
         long var9 = var7 - this.id_break;
         if (var9 == 0L) {
            return this.id_class;
         } else {
            this.id_break = var7;
            if (Math.abs(var1 - this.id_class.id_break) < 0.004
               && Math.abs(var3 - this.id_class.id_byte) < 0.004
               && Math.abs(var5 - this.id_class.id_protected) < 0.004) {
               return this.id_class;
            } else {
               double var11 = (double)var9 * 0.001;
               var11 = rrbb_3.id_class(var11, 0.0, 1.0);
               double var13 = var1 - this.id_class.id_break;
               double var15 = var3 - this.id_class.id_byte;
               double var17 = var5 - this.id_class.id_protected;
               double var19 = this.id_class.id_break + var13 * var11;
               double var21 = this.id_class.id_byte + var15 * var11;
               double var23 = this.id_class.id_protected + var17 * var11;
               this.id_class = new rjU_2(var19, var21, var23);
               return this.id_class;
            }
         }
      }
   }
}
