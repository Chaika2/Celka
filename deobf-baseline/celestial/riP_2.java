package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class riP_2 extends rUO<rDC> {
   public riP_2(Codec<rDC> var1) {
      super(var1);
   }

   private static rfH_2 id_class(rRg_1 var0, rfw_3 var1, xd_3 var2) {
      while (var1.c_() > 1) {
         xc_3 var3 = var0.id_byte(var1);
         if (var3.id_class(var2)) {
            return var1;
         }

         var1.id_class(rpr_3.DOWN);
      }

      return null;
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDC var5) {
      xd_3 var6 = var5.id_break.id_break();
      rfH_2 var7 = id_class(var1, var4.id_new().id_class(rpB_2.Y, 1, var1.id_try() - 1), var6);
      if (var7 == null) {
         return false;
      } else {
         int var8 = var5.id_class().id_class(var3);
         boolean var9 = false;

         for (rfH_2 var11 : rfH_2.id_class(var7, var8, var8, var8)) {
            if (var11.id_implements(var7) > var8) {
               break;
            }

            xc_3 var12 = var1.id_byte(var11);
            if (var12.id_class(var6)) {
               this.id_class(var1, var11, var5.id_byte);
               var9 = true;
            }
         }

         return var9;
      }
   }
}
