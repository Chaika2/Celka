package celestial;

import java.util.List;
import java.util.Random;

public class dU_2 extends zS_2 implements kX_2 {
   public dU_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.id_final();
      xc_3 var6 = xu_3.e.id_continue();

      label47:
      for (int var7 = 0; var7 < 128; var7++) {
         rfH_2 var8 = var5;

         for (int var9 = 0; var9 < var7 / 16; var9++) {
            var8 = var8.id_break(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
            if (!var1.id_byte(var8.id_break()).id_class(this) || var1.id_byte(var8).id_new(var1, var8)) {
               continue label47;
            }
         }

         xc_3 var14 = var1.id_byte(var8);
         if (var14.id_class(var6.id_break()) && var2.nextInt(10) == 0) {
            ((kX_2)var6.id_break()).id_class(var1, var2, var8, var14);
         }

         if (var14.id_catch()) {
            xc_3 var10;
            if (var2.nextInt(8) == 0) {
               List var11 = var1.id_implements(var8).id_throws().id_break();
               if (var11.isEmpty()) {
                  continue;
               }

               rDg_1 var12 = (rDg_1)var11.get(0);
               rUN var13 = (rUN)var12.id_throws;
               var10 = var13.id_class(var2, var8, var12.id_byte());
            } else {
               var10 = var6;
            }

            if (var10.id_class(var1, var8)) {
               var1.id_class(var8, var10, 3);
            }
         }
      }
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var1.id_byte(var2.id_final()).id_catch();
   }
}
