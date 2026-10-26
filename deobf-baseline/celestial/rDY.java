package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class rDY extends rDo_1 {
   public rDY(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   protected boolean id_class(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      if (!this.id_break(var1, var2, var3, var4)) {
         return false;
      } else {
         rpr_3 var5 = rpb_3.HORIZONTAL.id_class(var2);
         int var6 = var2.nextInt(2) + 2;
         ArrayList var7 = Lists.newArrayList(new rpr_3[]{var5, var5.id_catch(), var5.id_private()});
         Collections.shuffle(var7, var2);

         for (rpr_3 var9 : var7.subList(0, var6)) {
            rfw_3 var10 = var3.id_new();
            int var11 = var2.nextInt(2) + 1;
            var10.id_class(var9);
            int var12;
            rpr_3 var13;
            if (var9 == var5) {
               var13 = var5;
               var12 = var2.nextInt(3) + 2;
            } else {
               var10.id_class(rpr_3.UP);
               rpr_3[] var14 = new rpr_3[]{var9, rpr_3.UP};
               var13 = rqR_2.id_class(var14, var2);
               var12 = var2.nextInt(3) + 3;
            }

            for (int var15 = 0; var15 < var11 && this.id_break(var1, var2, var10, var4); var15++) {
               var10.id_class(var13);
            }

            var10.id_class(var13.id_case());
            var10.id_class(rpr_3.UP);

            for (int var16 = 0; var16 < var12; var16++) {
               var10.id_class(var5);
               if (!this.id_break(var1, var2, var10, var4)) {
                  break;
               }

               if (var2.nextFloat() < 0.25F) {
                  var10.id_class(rpr_3.UP);
               }
            }
         }

         return true;
      }
   }
}
