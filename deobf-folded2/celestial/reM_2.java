package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reM_2 extends rUO<rUt_1> {
   private static final rpr_3[] id_class = rpr_3.values();

   public reM_2(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfw_3 var6 = var4.id_new();

      for (int var7 = 64; var7 < 256; var7++) {
         var6.id_class(var4);
         var6.id_byte(var3.nextInt(4) - var3.nextInt(4), 0, var3.nextInt(4) - var3.nextInt(4));
         var6.b_(var7);
         if (var1.id_finally(var6)) {
            for (rpr_3 var11 : id_class) {
               if (var11 != rpr_3.DOWN && zq_3.id_class(var1, var6, var11)) {
                  var1.id_class(var6, xu_3.BD.id_continue().id_class(zq_3.id_class(var11), Boolean.valueOf(true)), 2);
                  break;
               }
            }
         }
      }

      return true;
   }
}
