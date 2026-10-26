package celestial;

import java.util.List;

enum rKX {
   @Override
   public void id_class(rrEm_1 var1, rKG var2, List<rSa_1> var3, int var4, rfH_2 var5) {
      if (var4 >= 100) {
         var2.id_class(END);
         var2.id_case();

         for (rSa_1 var7 : var3) {
            var7.id_class((rfH_2)null);
            var1.id_class(var7, var7.rx(), var7.re(), var7.BO(), 6.0F, rRz_1.NONE);
            var7.PD();
         }
      } else if (var4 >= 80) {
         var1.id_byte(3001, new rfH_2(0, 128, 0), 0);
      } else if (var4 == 0) {
         for (rSa_1 var9 : var3) {
            var9.id_class(new rfH_2(0, 128, 0));
         }
      } else if (var4 < 5) {
         var1.id_byte(3001, new rfH_2(0, 128, 0), 0);
      }
   }
}
