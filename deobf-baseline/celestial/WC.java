package celestial;

import java.util.Random;

public class WC extends xF_2 implements kX_2 {
   public static final rCm_1 id_volatile = rCT.y;
   protected static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   private final QZ id_package;

   protected WC(QZ var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return (double)var1.id_int.nextFloat() < 0.45;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.id_class(var1, var3, var4, var2);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   public void id_class(rrEm_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      if (var3.id_byte(id_volatile) == 0) {
         var1.id_class(var2, var3.id_class(id_volatile), 4);
      } else {
         this.id_package.id_class(var1, var1.id_else().id_implements(), var2, var3, var4);
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_package(var3.id_final()) >= 9 && var4.nextInt(7) == 0) {
         this.id_class(var2, var3, var1, var4);
      }
   }
}
