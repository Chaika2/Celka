package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class riP_2 extends rUO<rDC> {
   public riP_2(Codec<rDC> var1) {
      super(var1);
   }

   private static rfH_2 class_(rRg_1 var0, rfw_3 var1, xd_3 var2) {
      while (var1.c_() > 1) {
         xc_3 var3 = var0.byte_(var1);
         if (var3.class_(var2)) {
            return var1;
         }

         var1.class_(rpr_3.DOWN);
      }

      return null;
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDC var5) {
      xd_3 var6 = var5.break_.break_();
      rfH_2 var7 = class_(var1, var4.new_().class_(rpB_2.Y, 1, var1.try_() - 1), var6);
      if (var7 == null) {
         return false;
      } else {
         int var8 = var5.class_().class_(var3);
         boolean var9 = false;

         for (rfH_2 var11 : rfH_2.class_(var7, var8, var8, var8)) {
            if (var11.implements_(var7) > var8) {
               break;
            }

            xc_3 var12 = var1.byte_(var11);
            if (var12.class_(var6)) {
               this.class_(var1, var11, var5.byte_);
               var9 = true;
            }
         }

         return var9;
      }
   }
}
