package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rer_3 extends rUO<rUH> {
   public rer_3(Codec<rUH> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUH var5) {
      if (!var5.case_.contains(var1.byte_(var4.final_()).break_())) {
         return false;
      } else if (var5.byte_ && !var5.case_.contains(var1.byte_(var4.break_()).break_())) {
         return false;
      } else {
         xc_3 var6 = var1.byte_(var4);
         if (!var6.catch_() && !var5.case_.contains(var6.break_())) {
            return false;
         } else {
            int var7 = 0;
            int var8 = 0;
            if (var5.case_.contains(var1.byte_(var4.byte_()).break_())) {
               var8++;
            }

            if (var5.case_.contains(var1.byte_(var4.extends_()).break_())) {
               var8++;
            }

            if (var5.case_.contains(var1.byte_(var4.private_()).break_())) {
               var8++;
            }

            if (var5.case_.contains(var1.byte_(var4.protected_()).break_())) {
               var8++;
            }

            if (var5.case_.contains(var1.byte_(var4.break_()).break_())) {
               var8++;
            }

            int var9 = 0;
            if (var1.finally_(var4.byte_())) {
               var9++;
            }

            if (var1.finally_(var4.extends_())) {
               var9++;
            }

            if (var1.finally_(var4.private_())) {
               var9++;
            }

            if (var1.finally_(var4.protected_())) {
               var9++;
            }

            if (var1.finally_(var4.break_())) {
               var9++;
            }

            if (var8 == var5.protected_ && var9 == var5.throws_) {
               var1.class_(var4, var5.break_.catch_(), 2);
               var1.extends_().class_(var4, var5.break_.class_(), 0);
               var7++;
            }

            return var7 > 0;
         }
      }
   }
}
