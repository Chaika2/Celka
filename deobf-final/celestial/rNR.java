package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNR extends rzO_2 {
   private static final Logger break_ = LogManager.getLogger();
   final rzV_2 byte_;

   rNR(rQz_1[] var1, rzV_2 var2) {
      super(var1);
      this.byte_ = var2;
   }

   public static rzh_3<?> class_(rzV_2 var0) {
      return class_(var1 -> new rNR(var1, var0));
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.private_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.throws_()) {
         float var3 = 1.0F - this.byte_.break_(var2.class_());
         var1.break_(rfU_2.protected_(var3 * (float)var1.private_()));
      } else {
         break_.warn("Couldn't set damage of loot item {}", var1);
      }

      return var1;
   }
}
