package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UJ implements Ur_1 {
   private static final Logger id_class = LogManager.getLogger();

   @Override
   public rcd_3 id_class(String var1, rcd_3 var2) {
      return var1.startsWith("data/minecraft/structures/") ? id_break(var1, id_class(var2)) : var2;
   }

   private static rcd_3 id_class(rcd_3 var0) {
      if (!var0.id_byte("DataVersion", 99)) {
         var0.id_break("DataVersion", 500);
      }

      return var0;
   }

   private static rcd_3 id_break(String var0, rcd_3 var1) {
      rrPl_1 var2 = new rrPl_1();
      int var3 = var1.id_private("DataVersion");
      short var4 = 2532;
      if (var3 < 2532) {
         id_class.warn("SNBT Too old, do not forget to update: " + var3 + " < 2532: " + var0);
      }

      rcd_3 var5 = rco_3.id_class(rTu_1.id_class(), rTv_1.STRUCTURE, var1, var3);
      var2.id_break(var5);
      return var2.id_class(new rcd_3());
   }
}
