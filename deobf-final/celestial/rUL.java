package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUL extends rDN {
   public rUL(Codec<rUa_1> var1) {
      super(var1);
   }

   @Override
   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUa_1 var5) {
      while (var1.finally_(var4) && var4.c_() > 2) {
         var4 = var4.break_();
      }

      return !var1.byte_(var4).class_(xu_3.Pt) ? false : super.class_(var1, var2, var3, var4, var5);
   }
}
