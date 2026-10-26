package celestial;

import java.util.Comparator;

public class rrbs_3 implements Comparator<rfj_3> {
   private int class_;
   private int break_;
   private double byte_;
   private double protected_;

   public rrbs_3(int var1, int var2, double var3, double var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = 1.0 - rfU_2.class_(Math.abs(var5) / (Math.PI / 2), 0.0, 1.0);
   }

   public int class_(rfj_3 var1, rfj_3 var2) {
      int var3 = this.class_(var1);
      int var4 = this.class_(var2);
      return var3 - var4;
   }

   private int class_(rfj_3 var1) {
      int var2 = var1.break_ - this.class_;
      int var3 = var1.byte_ - this.break_;
      int var4 = var2 * var2 + var3 * var3;
      double var5 = rfU_2.protected_((double)var3, (double)var2);
      double var7 = Math.abs(var5 - this.byte_);
      if (var7 > Math.PI) {
         var7 = (Math.PI * 2) - var7;
      }

      return (int)((double)var4 * 1000.0 * this.protected_ * var7 * var7);
   }
}
