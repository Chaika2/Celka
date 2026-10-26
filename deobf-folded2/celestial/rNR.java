package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNR extends rzO_2 {
   private static final Logger id_break = LogManager.getLogger();
   final rzV_2 id_byte;

   rNR(rQz_1[] var1, rzV_2 var2) {
      super(var1);
      this.id_byte = var2;
   }

   public static rzh_3<?> id_class(rzV_2 var0) {
      return id_class(var1 -> new rNR(var1, var0));
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_private;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_throws()) {
         float var3 = 1.0F - this.id_byte.id_break(var2.id_class());
         var1.id_break(rfU_2.id_protected(var3 * (float)var1.id_private()));
      } else {
         id_break.warn("Couldn't set damage of loot item {}", var1);
      }

      return var1;
   }
}
