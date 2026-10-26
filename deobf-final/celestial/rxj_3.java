package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class rxj_3 extends rdb_3 {
   public rxj_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rcd_3 var5 = var1.break_("Fireworks");
      if (var5 != null) {
         if (var5.byte_("Flight", 99)) {
            var3.add(new rgn_3("item.minecraft.firework_rocket.flight").break_(" ").break_(String.valueOf(var5.case_("Flight"))).class_(rgF_2.GRAY));
         }

         rcy_3 var6 = var5.protected_("Explosions", 10);
         if (!var6.isEmpty()) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               rcd_3 var8 = var6.class_(var7);
               ArrayList var9 = Lists.newArrayList();
               rxg_3.class_(var8, var9);
               if (!var9.isEmpty()) {
                  for (int var10 = 1; var10 < var9.size(); var10++) {
                     var9.set(var10, new rgN_2("  ").class_((rgP_2)var9.get(var10)).class_(rgF_2.GRAY));
                  }

                  var3.addAll(var9);
               }
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      if (var2.Sy()) {
         rdn_3 var4 = var2.protected_(var3);
         if (!var1.continue_) {
            var1.a_(new rhy_3(var1, var4, var2));
            if (!((rhx_3)var2.implements_[18]).protected_) {
               var4.catch_(1);
            }
         }

         return rym_3.class_(var2.protected_(var3), var1.import_());
      } else {
         return rym_3.byte_(var2.protected_(var3));
      }
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      if (!var2.continue_) {
         rdn_3 var3 = var1.volatile_();
         rjU_2 var4 = var1.extends_();
         rpr_3 var5 = var1.finally_();
         rhy_3 var6 = new rhy_3(
            var2,
            var1.final_(),
            var4.break_ + (double)var5.implements_() * 0.15,
            var4.byte_ + (double)var5.finally_() * 5.0,
            var4.protected_ + (double)var5.extends_() * 0.15,
            var3
         );
         var2.a_(var6);
         var3.catch_(1);
      }

      return ryZ_2.class_(var2.continue_);
   }
}
