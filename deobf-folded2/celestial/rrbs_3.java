package celestial;

import java.util.Comparator;

public class rrbs_3 implements Comparator<rfj_3> {
   private int id_class;
   private int id_break;
   private double id_byte;
   private double id_protected;

   public rrbs_3(int var1, int var2, double var3, double var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = 1.0 - rfU_2.id_class(Math.abs(var5) / (Math.PI / 2), 0.0, 1.0);
   }

   public int id_class(rfj_3 var1, rfj_3 var2) {
      int var3 = this.id_class(var1);
      int var4 = this.id_class(var2);
      return var3 - var4;
   }

   private int id_class(rfj_3 var1) {
      int var2 = var1.id_break - this.id_class;
      int var3 = var1.id_byte - this.id_break;
      int var4 = var2 * var2 + var3 * var3;
      double var5 = rfU_2.id_protected((double)var3, (double)var2);
      double var7 = Math.abs(var5 - this.id_byte);
      if (var7 > Math.PI) {
         var7 = (Math.PI * 2) - var7;
      }

      return (int)((double)var4 * 1000.0 * this.id_protected * var7 * var7);
   }
}
