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
   protected boolean class_(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      if (!this.break_(var1, var2, var3, var4)) {
         return false;
      } else {
         rpr_3 var5 = rpb_3.HORIZONTAL.class_(var2);
         int var6 = var2.nextInt(2) + 2;
         ArrayList var7 = Lists.newArrayList(new rpr_3[]{var5, var5.catch_(), var5.private_()});
         Collections.shuffle(var7, var2);

         for (rpr_3 var9 : var7.subList(0, var6)) {
            rfw_3 var10 = var3.new_();
            int var11 = var2.nextInt(2) + 1;
            var10.class_(var9);
            int var12;
            rpr_3 var13;
            if (var9 == var5) {
               var13 = var5;
               var12 = var2.nextInt(3) + 2;
            } else {
               var10.class_(rpr_3.UP);
               rpr_3[] var14 = new rpr_3[]{var9, rpr_3.UP};
               var13 = rqR_2.class_(var14, var2);
               var12 = var2.nextInt(3) + 3;
            }

            for (int var15 = 0; var15 < var11 && this.break_(var1, var2, var10, var4); var15++) {
               var10.class_(var13);
            }

            var10.class_(var13.case_());
            var10.class_(rpr_3.UP);

            for (int var16 = 0; var16 < var12; var16++) {
               var10.class_(var5);
               if (!this.break_(var1, var2, var10, var4)) {
                  break;
               }

               if (var2.nextFloat() < 0.25F) {
                  var10.class_(rpr_3.UP);
               }
            }
         }

         return true;
      }
   }
}
