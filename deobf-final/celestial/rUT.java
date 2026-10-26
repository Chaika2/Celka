package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUT extends rUO<rUf_1> {
   rUT(Codec<rUf_1> var1) {
      super(var1);
   }

   private int class_(Random var1, int var2) {
      return Math.round((var1.nextFloat() - var1.nextFloat()) * (float)var2);
   }

   private boolean class_(rRg_1 var1, rfH_2 var2) {
      rfw_3 var3 = new rfw_3();

      for (rpr_3 var7 : rpr_3.values()) {
         var3.class_(var2, var7);
         if (var1.byte_(var3).catch_()) {
            return true;
         }
      }

      return false;
   }

   private void class_(rfw_3 var1, Random var2, rfH_2 var3, int var4) {
      int var5 = this.class_(var2, var4);
      int var6 = this.class_(var2, var4);
      int var7 = this.class_(var2, var4);
      var1.class_(var3, var5, var6, var7);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUf_1 var5) {
      int var6 = var3.nextInt(var5.byte_ + 1);
      rfw_3 var7 = new rfw_3();

      for (int var8 = 0; var8 < var6; var8++) {
         this.class_(var7, var3, var4, Math.min(var8, 7));
         if (var5.break_.class_(var1.byte_(var7), var3) && !this.class_(var1, var7)) {
            var1.class_(var7, var5.protected_, 2);
         }
      }

      return true;
   }
}
