package celestial;

import java.util.List;
import java.util.Random;

public class dU_2 extends zS_2 implements kX_2 {
   public dU_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.final_();
      xc_3 var6 = xu_3.e.continue_();

      label47:
      for (int var7 = 0; var7 < 128; var7++) {
         rfH_2 var8 = var5;

         for (int var9 = 0; var9 < var7 / 16; var9++) {
            var8 = var8.break_(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
            if (!var1.byte_(var8.break_()).class_(this) || var1.byte_(var8).new_(var1, var8)) {
               continue label47;
            }
         }

         xc_3 var14 = var1.byte_(var8);
         if (var14.class_(var6.break_()) && var2.nextInt(10) == 0) {
            ((kX_2)var6.break_()).class_(var1, var2, var8, var14);
         }

         if (var14.catch_()) {
            xc_3 var10;
            if (var2.nextInt(8) == 0) {
               List var11 = var1.implements_(var8).throws_().break_();
               if (var11.isEmpty()) {
                  continue;
               }

               rDg_1 var12 = (rDg_1)var11.get(0);
               rUN var13 = (rUN)var12.throws_;
               var10 = var13.class_(var2, var8, var12.byte_());
            } else {
               var10 = var6;
            }

            if (var10.class_(var1, var8)) {
               var1.class_(var8, var10, 3);
            }
         }
      }
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var1.byte_(var2.final_()).catch_();
   }
}
