package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reM_2 extends rUO<rUt_1> {
   private static final rpr_3[] class_ = rpr_3.values();

   public reM_2(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfw_3 var6 = var4.new_();

      for (int var7 = 64; var7 < 256; var7++) {
         var6.class_(var4);
         var6.byte_(var3.nextInt(4) - var3.nextInt(4), 0, var3.nextInt(4) - var3.nextInt(4));
         var6.b_(var7);
         if (var1.finally_(var6)) {
            for (rpr_3 var11 : class_) {
               if (var11 != rpr_3.DOWN && zq_3.class_(var1, var6, var11)) {
                  var1.class_(var6, xu_3.BD.continue_().class_(zq_3.class_(var11), Boolean.valueOf(true)), 2);
                  break;
               }
            }
         }
      }

      return true;
   }
}
