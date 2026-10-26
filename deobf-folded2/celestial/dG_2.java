package celestial;

import java.util.Random;

public class dG_2 extends Jf_1 {
   private final xd_3 id_package;
   protected static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected dG_2(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.DOWN && !var1.id_class(var4, var5)) {
         return xu_3.id_class.id_continue();
      } else {
         this.id_class(var1, var4, var5);
         if (var1.id_byte(id_volatile)) {
            var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
         }

         return super.id_class(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      this.id_class(var1, (rRg_1)var2, var3);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!id_case(var1, var2, var3)) {
         var2.id_class(var3, this.id_package.id_continue().id_class(id_volatile, Boolean.valueOf(false)), 2);
      }
   }
}
