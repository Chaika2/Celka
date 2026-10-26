package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rdp_3 extends rdb_3 {
   private static final Logger id_class = LogManager.getLogger();

   public rdp_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rcd_3 var5 = var4.id_package();
      if (!((rhx_3)var2.id_implements[18]).id_protected) {
         var2.id_class(var3, rdn_3.id_break);
      }

      if (var5 != null && var5.id_byte("Recipes", 9)) {
         if (!var1.id_continue) {
            rcy_3 var6 = var5.id_protected("Recipes", 8);
            ArrayList var7 = Lists.newArrayList();
            rWB var8 = var1.id_const().V();

            for (int var9 = 0; var9 < var6.size(); var9++) {
               String var10 = var6.id_implements(var9);
               Optional var11 = var8.id_class(new rqO_2(var10));
               if (!var11.isPresent()) {
                  id_class.error("Invalid recipe: {}", var10);
                  return rym_3.id_protected(var4);
               }

               var7.add((rkw_3)var11.get());
            }

            var2.id_break(var7);
            var2.id_class(rlB_2.id_byte.id_break(this));
         }

         return rym_3.id_class(var4, var1.id_import());
      } else {
         id_class.error("Tag not valid: {}", var5);
         return rym_3.id_protected(var4);
      }
   }
}
