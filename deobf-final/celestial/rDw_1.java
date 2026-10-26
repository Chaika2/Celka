package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDw_1 extends rUO<rDt_1> {
   public rDw_1(Codec<rDt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDt_1 var5) {
      if (var5.byte_.contains(var1.byte_(var4.break_())) && var5.protected_.contains(var1.byte_(var4)) && var5.throws_.contains(var1.byte_(var4.final_()))) {
         var1.class_(var4, var5.break_, 2);
         return true;
      } else {
         return false;
      }
   }
}
