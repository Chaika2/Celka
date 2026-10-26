package celestial;

import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rDf_1 extends rUO<rUt_1> {
   public rDf_1(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfj_3 var6 = new rfj_3(var4);
      List var7 = IntStream.rangeClosed(var6.break_(), var6.protected_()).boxed().collect(Collectors.toList());
      Collections.shuffle(var7, var3);
      List var8 = IntStream.rangeClosed(var6.byte_(), var6.throws_()).boxed().collect(Collectors.toList());
      Collections.shuffle(var8, var3);
      rfw_3 var9 = new rfw_3();

      for (Integer var11 : var7) {
         for (Integer var13 : var8) {
            var9.class_(var11, 0, var13);
            rfH_2 var14 = var1.class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, var9);
            if (var1.finally_(var14) || var1.byte_(var14).extends_(var1, var14).break_()) {
               var1.class_(var14, xu_3.re.continue_(), 2);
               rHK.class_(var1, var3, var14, rzl_3.break_);
               xc_3 var15 = xu_3.rR.continue_();

               for (rpr_3 var17 : rpb_3.HORIZONTAL) {
                  rfH_2 var18 = var14.break_(var17);
                  if (var15.class_(var1, var18)) {
                     var1.class_(var18, var15, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
