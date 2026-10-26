package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rdp_3 extends rdb_3 {
   private static final Logger class_ = LogManager.getLogger();

   public rdp_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rcd_3 var5 = var4.package_();
      if (!((rhx_3)var2.implements_[18]).protected_) {
         var2.class_(var3, rdn_3.break_);
      }

      if (var5 != null && var5.byte_("Recipes", 9)) {
         if (!var1.continue_) {
            rcy_3 var6 = var5.protected_("Recipes", 8);
            ArrayList var7 = Lists.newArrayList();
            rWB var8 = var1.const_().V();

            for (int var9 = 0; var9 < var6.size(); var9++) {
               String var10 = var6.implements_(var9);
               Optional var11 = var8.class_(new rqO_2(var10));
               if (!var11.isPresent()) {
                  class_.error("Invalid recipe: {}", var10);
                  return rym_3.protected_(var4);
               }

               var7.add((rkw_3)var11.get());
            }

            var2.break_(var7);
            var2.class_(rlB_2.byte_.break_(this));
         }

         return rym_3.class_(var4, var1.import_());
      } else {
         class_.error("Tag not valid: {}", var5);
         return rym_3.protected_(var4);
      }
   }
}
