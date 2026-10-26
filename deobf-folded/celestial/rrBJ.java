package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrBJ {
   private static final Logger id_class = LogManager.getLogger();
   private final rKg_1 id_break;

   public rrBJ(rKV<rKg_1> var1) {
      this.id_break = (rKg_1)var1.make();
   }

   public rYG id_class(rVL<rYG> var1, int var2, int var3) {
      int var4 = this.id_break.id_class(var2, var3);
      rqM_2 var5 = rYC.id_class(var4);
      if (var5 == null) {
         throw new IllegalStateException("Unknown biome id emitted by layers: " + var4);
      } else {
         rYG var6 = (rYG)var1.id_class(var5);
         if (var6 == null) {
            if (rqu_3.id_byte) {
               throw (IllegalStateException)rqR_2.id_byte(new IllegalStateException("Unknown biome id: " + var4));
            } else {
               id_class.warn("Unknown biome id: ", var4);
               return var1.id_class(rYC.id_class(0));
            }
         } else {
            return var6;
         }
      }
   }
}
