package celestial;

public class gE_2 {
   private double id_class;
   private double id_break;
   private double id_byte;

   public double id_class(double var1, double var3) {
      this.id_class += var1;
      double var5 = this.id_class - this.id_break;
      double var7 = rfU_2.id_protected(0.5, this.id_byte, var5);
      double var9 = Math.signum(var5);
      if (var9 * var5 > var9 * this.id_byte) {
         var5 = var7;
      }

      this.id_byte = var7;
      this.id_break += var5 * var3;
      return var5 * var3;
   }

   public void id_class() {
      this.id_class = 0.0;
      this.id_break = 0.0;
      this.id_byte = 0.0;
   }
}
