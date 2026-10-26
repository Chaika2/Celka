package celestial;

public class rrbz_3 {
   private rjU_2 class_ = null;
   private long break_ = System.currentTimeMillis();

   public rjU_2 class_(double var1, double var3, double var5) {
      if (this.class_ == null) {
         this.class_ = new rjU_2(var1, var3, var5);
         return this.class_;
      } else {
         long var7 = System.currentTimeMillis();
         long var9 = var7 - this.break_;
         if (var9 == 0L) {
            return this.class_;
         } else {
            this.break_ = var7;
            if (Math.abs(var1 - this.class_.break_) < 0.004 && Math.abs(var3 - this.class_.byte_) < 0.004 && Math.abs(var5 - this.class_.protected_) < 0.004) {
               return this.class_;
            } else {
               double var11 = (double)var9 * 0.001;
               var11 = rrbb_3.class_(var11, 0.0, 1.0);
               double var13 = var1 - this.class_.break_;
               double var15 = var3 - this.class_.byte_;
               double var17 = var5 - this.class_.protected_;
               double var19 = this.class_.break_ + var13 * var11;
               double var21 = this.class_.byte_ + var15 * var11;
               double var23 = this.class_.protected_ + var17 * var11;
               this.class_ = new rjU_2(var19, var21, var23);
               return this.class_;
            }
         }
      }
   }
}
