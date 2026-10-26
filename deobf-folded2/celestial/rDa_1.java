package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDa_1 extends rUN<rDH> {
   public rDa_1(Codec<rDH> var1) {
      super(var1);
   }

   public boolean id_class(rRg_1 var1, rfH_2 var2, rDH var3) {
      return !var3.id_throws.contains(var1.id_byte(var2));
   }

   public int id_class(rDH var1) {
      return var1.id_case;
   }

   public rfH_2 id_class(Random var1, rfH_2 var2, rDH var3) {
      return var2.id_break(
         var1.nextInt(var3.id_catch) - var1.nextInt(var3.id_catch),
         var1.nextInt(var3.id_private) - var1.nextInt(var3.id_private),
         var1.nextInt(var3.id_implements) - var1.nextInt(var3.id_implements)
      );
   }

   public xc_3 id_break(Random var1, rfH_2 var2, rDH var3) {
      return var3.id_break.id_class(var1, var2);
   }
}
