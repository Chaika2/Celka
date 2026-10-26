package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDw_1 extends rUO<rDt_1> {
   public rDw_1(Codec<rDt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDt_1 var5) {
      if (var5.id_byte.contains(var1.id_byte(var4.id_break()))
         && var5.id_protected.contains(var1.id_byte(var4))
         && var5.id_throws.contains(var1.id_byte(var4.id_final()))) {
         var1.id_class(var4, var5.id_break, 2);
         return true;
      } else {
         return false;
      }
   }
}
