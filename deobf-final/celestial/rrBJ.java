package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrBJ {
   private static final Logger class_ = LogManager.getLogger();
   private final rKg_1 break_;

   public rrBJ(rKV<rKg_1> var1) {
      this.break_ = (rKg_1)var1.make();
   }

   public rYG class_(rVL<rYG> var1, int var2, int var3) {
      int var4 = this.break_.class_(var2, var3);
      rqM_2 var5 = rYC.class_(var4);
      if (var5 == null) {
         throw new IllegalStateException("Unknown biome id emitted by layers: " + var4);
      } else {
         rYG var6 = (rYG)var1.class_(var5);
         if (var6 == null) {
            if (rqu_3.byte_) {
               throw (IllegalStateException)rqR_2.byte_(new IllegalStateException("Unknown biome id: " + var4));
            } else {
               class_.warn("Unknown biome id: ", var4);
               return var1.class_(rYC.class_(0));
            }
         } else {
            return var6;
         }
      }
   }
}
