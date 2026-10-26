package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUp_1 extends rUO<rUy_1> {
   public rUp_1(Codec<rUy_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUy_1 var5) {
      for (rDR var7 : var5.id_break) {
         if (var3.nextFloat() < var7.id_byte) {
            return var7.id_class(var1, var2, var3, var4);
         }
      }

      return var5.id_byte.get().id_class(var1, var2, var3, var4);
   }
}
