package celestial;

import java.util.List;

public class rxe_3 extends rdb_3 {
   public rxe_3(rdO_2 var1) {
      super(var1);
   }

   protected rdn_3 class_(rdn_3 var1, rhd_3 var2, rdn_3 var3) {
      var2.class_(rlB_2.byte_.break_(this));
      return rpO_2.class_(var1, var2, var3);
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      List var4 = var1.class_(aZ_2.class, var2.rN().class_(2.0), var0 -> var0 != null && var0.BM() && var0.implements_() instanceof rSu_1);
      rdn_3 var5 = var2.protected_(var3);
      if (!var4.isEmpty()) {
         aZ_2 var8 = (aZ_2)var4.get(0);
         var8.byte_(var8.protected_() - 0.5F);
         var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.rM, rqL_2.NEUTRAL, 1.0F, 1.0F);
         return rym_3.class_(this.class_(var5, var2, new rdn_3(rdy_3.kd)), var1.import_());
      } else {
         rff_3 var6 = class_(var1, var2, rjs_3.SOURCE_ONLY);
         if (var6.byte_() == rjM_2.MISS) {
            return rym_3.byte_(var5);
         } else {
            if (var6.byte_() == rjM_2.BLOCK) {
               rfH_2 var7 = var6.class_();
               if (!var1.class_(var2, var7)) {
                  return rym_3.byte_(var5);
               }

               if (var1.break_(var7).class_(rlG_2.break_)) {
                  var1.class_(var2, var2.rx(), var2.re(), var2.BO(), rqn_3.rb, rqL_2.NEUTRAL, 1.0F, 1.0F);
                  return rym_3.class_(this.class_(var5, var2, rAB.class_(new rdn_3(rdy_3.JA), rAS.break_)), var1.import_());
               }
            }

            return rym_3.byte_(var5);
         }
      }
   }
}
