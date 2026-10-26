package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class rxj_3 extends rdb_3 {
   public rxj_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rcd_3 var5 = var1.id_break("Fireworks");
      if (var5 != null) {
         if (var5.id_byte("Flight", 99)) {
            var3.add(new rgn_3("item.minecraft.firework_rocket.flight").id_break(" ").id_break(String.valueOf(var5.id_case("Flight"))).id_class(rgF_2.GRAY));
         }

         rcy_3 var6 = var5.id_protected("Explosions", 10);
         if (!var6.isEmpty()) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               rcd_3 var8 = var6.id_class(var7);
               ArrayList var9 = Lists.newArrayList();
               rxg_3.id_class(var8, var9);
               if (!var9.isEmpty()) {
                  for (int var10 = 1; var10 < var9.size(); var10++) {
                     var9.set(var10, new rgN_2("  ").id_class((rgP_2)var9.get(var10)).id_class(rgF_2.GRAY));
                  }

                  var3.addAll(var9);
               }
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      if (var2.Sy()) {
         rdn_3 var4 = var2.id_protected(var3);
         if (!var1.id_continue) {
            var1.a_(new rhy_3(var1, var4, var2));
            if (!((rhx_3)var2.id_implements[18]).id_protected) {
               var4.id_catch(1);
            }
         }

         return rym_3.id_class(var2.id_protected(var3), var1.id_import());
      } else {
         return rym_3.id_byte(var2.id_protected(var3));
      }
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      if (!var2.id_continue) {
         rdn_3 var3 = var1.id_volatile();
         rjU_2 var4 = var1.id_extends();
         rpr_3 var5 = var1.id_finally();
         rhy_3 var6 = new rhy_3(
            var2,
            var1.id_final(),
            var4.id_break + (double)var5.id_implements() * 0.15,
            var4.id_byte + (double)var5.id_finally() * 5.0,
            var4.id_protected + (double)var5.id_extends() * 0.15,
            var3
         );
         var2.a_(var6);
         var3.id_catch(1);
      }

      return ryZ_2.id_class(var2.id_continue);
   }
}
