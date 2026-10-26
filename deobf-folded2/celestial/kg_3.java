package celestial;

import java.util.Random;

public class kg_3 extends xd_3 implements kX_2 {
   protected kg_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var1.id_byte(var2.id_final()).id_catch();
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      xc_3 var5 = var1.id_byte(var3);
      rfH_2 var6 = var3.id_final();
      if (var5.id_class(xu_3.XL)) {
         rUq_1.id_class(var1, var2, var6, rUd_1.id_extends, 3, 1);
      } else if (var5.id_class(xu_3.Xz)) {
         rUq_1.id_class(var1, var2, var6, rUd_1.id_native, 3, 1);
         rUq_1.id_class(var1, var2, var6, rUd_1.id_volatile, 3, 1);
         if (var2.nextInt(8) == 0) {
            res_3.id_class(var1, var2, var6, 3, 1, 2);
         }
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!id_break(var1, var2, var3)) {
         var2.id_break(var3, xu_3.PR.id_continue());
      }
   }

   private static boolean id_break(xc_3 var0, rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.id_final();
      xc_3 var4 = var1.id_byte(var3);
      int var5 = rrsV_2.id_class(var1, var0, var2, var4, var3, rpr_3.UP, var4.id_break(var1, var3));
      return var5 < var1.id_while();
   }
}
