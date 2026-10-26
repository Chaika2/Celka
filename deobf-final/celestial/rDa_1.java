package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDa_1 extends rUN<rDH> {
   public rDa_1(Codec<rDH> var1) {
      super(var1);
   }

   public boolean class_(rRg_1 var1, rfH_2 var2, rDH var3) {
      return !var3.throws_.contains(var1.byte_(var2));
   }

   public int class_(rDH var1) {
      return var1.case_;
   }

   public rfH_2 class_(Random var1, rfH_2 var2, rDH var3) {
      return var2.break_(
         var1.nextInt(var3.catch_) - var1.nextInt(var3.catch_),
         var1.nextInt(var3.private_) - var1.nextInt(var3.private_),
         var1.nextInt(var3.implements_) - var1.nextInt(var3.implements_)
      );
   }

   public xc_3 break_(Random var1, rfH_2 var2, rDH var3) {
      return var3.break_.class_(var1, var2);
   }
}
