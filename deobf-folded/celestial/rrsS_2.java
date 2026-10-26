package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rrsS_2 extends rrsE_2<rrsG_2> {
   public rrsS_2(Codec<rrsG_2> var1) {
      super(var1);
   }

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      if (var7 > 1.75) {
         rrsE_2.id_synchronized.id_class(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, rrsE_2.id_implements);
      } else if (var7 > -0.5) {
         rrsE_2.id_synchronized.id_class(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, rrsE_2.id_finally);
      } else {
         rrsE_2.id_synchronized.id_class(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, rrsE_2.id_private);
      }
   }
}
