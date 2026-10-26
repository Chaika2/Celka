package celestial;

import java.util.Random;

public class xh_3 extends dO_2 {
   public static final rCm_1 id_volatile = rCT.J;
   private static final rjC_2[] id_package = new rjC_2[]{
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public xh_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_package[var1.id_byte(this.id_break())];
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(3) != 0) {
         super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   protected int id_class(rYB var1) {
      return super.id_class(var1) / 3;
   }

   @Override
   public rCm_1 id_break() {
      return id_volatile;
   }

   @Override
   protected rpL_2 id_finally() {
      return rdy_3.kJ;
   }

   @Override
   public int id_implements() {
      return 3;
   }
}
