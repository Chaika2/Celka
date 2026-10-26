package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUT extends rUO<rUf_1> {
   rUT(Codec<rUf_1> var1) {
      super(var1);
   }

   private int id_class(Random var1, int var2) {
      return Math.round((var1.nextFloat() - var1.nextFloat()) * (float)var2);
   }

   private boolean id_class(rRg_1 var1, rfH_2 var2) {
      rfw_3 var3 = new rfw_3();

      for (rpr_3 var7 : rpr_3.values()) {
         var3.id_class(var2, var7);
         if (var1.id_byte(var3).id_catch()) {
            return true;
         }
      }

      return false;
   }

   private void id_class(rfw_3 var1, Random var2, rfH_2 var3, int var4) {
      int var5 = this.id_class(var2, var4);
      int var6 = this.id_class(var2, var4);
      int var7 = this.id_class(var2, var4);
      var1.id_class(var3, var5, var6, var7);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUf_1 var5) {
      int var6 = var3.nextInt(var5.id_byte + 1);
      rfw_3 var7 = new rfw_3();

      for (int var8 = 0; var8 < var6; var8++) {
         this.id_class(var7, var3, var4, Math.min(var8, 7));
         if (var5.id_break.id_class(var1.id_byte(var7), var3) && !this.id_class(var1, var7)) {
            var1.id_class(var7, var5.id_protected, 2);
         }
      }

      return true;
   }
}
