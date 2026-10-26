package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUe_1 extends rUO<rUU> {
   public rUe_1(Codec<rUU> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUU var5) {
      int var6 = var3.nextInt(var5.break_.size());
      rDg_1 var7 = var5.break_.get(var6).get();
      return var7.class_(var1, var2, var3, var4);
   }
}
