package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reG_2 extends rUO<reE_2> {
   public reG_2(Codec<reE_2> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, reE_2 var5) {
      boolean var6 = var3.nextBoolean();
      return var6 ? var5.break_.get().class_(var1, var2, var3, var4) : var5.byte_.get().class_(var1, var2, var3, var4);
   }
}
