package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rUN<U extends rUv_1> extends rUO<U> {
   public rUN(Codec<U> var1) {
      super(var1);
   }

   public abstract xc_3 id_class(Random var1, rfH_2 var2, U var3);

   public abstract int id_class(U var1);

   public abstract boolean id_class(rRg_1 var1, rfH_2 var2, U var3);

   @Override
   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, U var5) {
      xc_3 var6 = this.id_class(var3, var4, (U)var5);
      int var7 = 0;

      for (int var8 = 0; var8 < this.id_class((U)var5); var8++) {
         rfH_2 var9 = this.id_break(var3, var4, (U)var5);
         if (var1.id_finally(var9) && var9.c_() < 255 && var6.id_class(var1, var9) && this.id_class(var1, var9, (U)var5)) {
            var1.id_class(var9, var6, 2);
            var7++;
         }
      }

      return var7 > 0;
   }

   public abstract rfH_2 id_break(Random var1, rfH_2 var2, U var3);
}
