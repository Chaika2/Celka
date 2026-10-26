package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UJ implements Ur_1 {
   private static final Logger class_ = LogManager.getLogger();

   @Override
   public rcd_3 class_(String var1, rcd_3 var2) {
      return var1.startsWith("data/minecraft/structures/") ? break_(var1, class_(var2)) : var2;
   }

   private static rcd_3 class_(rcd_3 var0) {
      if (!var0.byte_("DataVersion", 99)) {
         var0.break_("DataVersion", 500);
      }

      return var0;
   }

   private static rcd_3 break_(String var0, rcd_3 var1) {
      rrPl_1 var2 = new rrPl_1();
      int var3 = var1.private_("DataVersion");
      short var4 = 2532;
      if (var3 < 2532) {
         class_.warn("SNBT Too old, do not forget to update: " + var3 + " < 2532: " + var0);
      }

      rcd_3 var5 = rco_3.class_(rTu_1.class_(), rTv_1.STRUCTURE, var1, var3);
      var2.break_(var5);
      return var2.class_(new rcd_3());
   }
}
