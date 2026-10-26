package celestial;

import java.util.Random;

public abstract class zS_2 extends We_1 {
   private static boolean byte_(xc_3 var0, rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.final_();
      return break_(var0, var1, var2) && !var1.break_(var3).class_(rlG_2.break_);
   }

   protected zS_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!break_(var1, var2, var3)) {
         var2.break_(var3, xu_3.finally_.continue_());
      } else if (var2.package_(var3.final_()) >= 9) {
         xc_3 var5 = this.continue_();

         for (int var6 = 0; var6 < 4; var6++) {
            rfH_2 var7 = var3.break_(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
            if (var2.byte_(var7).class_(xu_3.finally_) && byte_(var5, var2, var7)) {
               var2.break_(var7, var5.class_(volatile_, Boolean.valueOf(var2.byte_(var7.final_()).class_(xu_3.Pq))));
            }
         }
      }
   }

   private static boolean break_(xc_3 var0, rRR var1, rfH_2 var2) {
      rfH_2 var3 = var2.final_();
      xc_3 var4 = var1.byte_(var3);
      if (var4.class_(xu_3.Pq) && var4.byte_(WD.volatile_) == 1) {
         return true;
      } else if (var4.volatile_().throws_() == 8) {
         return false;
      } else {
         int var5 = rrsV_2.class_(var1, var0, var2, var4, var3, rpr_3.UP, var4.break_(var1, var3));
         return var5 < var1.while_();
      }
   }
}
