package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDS extends rKi_1 {
   public static final Codec<rDS> id_class = xc_3.id_break.fieldOf("state").xmap(rDS::new, var0 -> var0.id_byte).codec();
   private final xc_3 id_byte;

   public rDS(xc_3 var1) {
      this.id_byte = var1;
   }

   @Override
   protected rDr_1<?> id_class() {
      return rDr_1.id_class;
   }

   @Override
   public xc_3 id_class(Random var1, rfH_2 var2) {
      return this.id_byte;
   }
}
