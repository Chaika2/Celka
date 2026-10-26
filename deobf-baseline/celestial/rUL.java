package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUL extends rDN {
   public rUL(Codec<rUa_1> var1) {
      super(var1);
   }

   @Override
   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUa_1 var5) {
      while (var1.id_finally(var4) && var4.c_() > 2) {
         var4 = var4.id_break();
      }

      return !var1.id_byte(var4).id_class(xu_3.Pt) ? false : super.id_class(var1, var2, var3, var4, var5);
   }
}
