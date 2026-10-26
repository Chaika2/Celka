package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDS extends rKi_1 {
   public static final Codec<rDS> class_ = xc_3.break_.fieldOf("state").xmap(rDS::new, var0 -> var0.byte_).codec();
   private final xc_3 byte_;

   public rDS(xc_3 var1) {
      this.byte_ = var1;
   }

   @Override
   protected rDr_1<?> class_() {
      return rDr_1.class_;
   }

   @Override
   public xc_3 class_(Random var1, rfH_2 var2) {
      return this.byte_;
   }
}
