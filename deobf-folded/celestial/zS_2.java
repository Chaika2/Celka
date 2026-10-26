package celestial;

import java.util.Random;

public abstract class zS_2 extends We_1 {
   private static boolean id_byte(xc_3 var0, rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.id_final();
      return id_break(var0, var1, var2) && !var1.id_break(var3).id_class(rlG_2.id_break);
   }

   protected zS_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!id_break(var1, var2, var3)) {
         var2.id_break(var3, xu_3.id_finally.id_continue());
      } else if (var2.id_package(var3.id_final()) >= 9) {
         xc_3 var5 = this.id_continue();

         for (int var6 = 0; var6 < 4; var6++) {
            rfH_2 var7 = var3.id_break(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
            if (var2.id_byte(var7).id_class(xu_3.id_finally) && id_byte(var5, var2, var7)) {
               var2.id_break(var7, var5.id_class(id_volatile, Boolean.valueOf(var2.id_byte(var7.id_final()).id_class(xu_3.Pq))));
            }
         }
      }
   }

   private static boolean id_break(xc_3 var0, rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.id_final();
      xc_3 var4 = var1.id_byte(var3);
      if (var4.id_class(xu_3.Pq) && var4.id_byte(WD.id_volatile) == 1) {
         return true;
      } else if (var4.id_volatile().id_throws() == 8) {
         return false;
      } else {
         int var5 = rrsV_2.id_class(var1, var0, var2, var4, var3, rpr_3.UP, var4.id_break(var1, var3));
         return var5 < var1.id_while();
      }
   }
}
