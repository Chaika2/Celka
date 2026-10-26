package celestial;

import java.util.List;

public class rxe_3 extends rdb_3 {
   public rxe_3(rdO_2 var1) {
      super(var1);
   }

   protected rdn_3 id_class(rdn_3 var1, rhd_3 var2, rdn_3 var3) {
      var2.id_class(rlB_2.id_byte.id_break(this));
      return rpO_2.id_class(var1, var2, var3);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      List var4 = var1.id_class(aZ_2.class, var2.rN().id_class(2.0), var0 -> var0 != null && var0.BM() && var0.id_implements() instanceof rSu_1);
      rdn_3 var5 = var2.id_protected(var3);
      if (!var4.isEmpty()) {
         aZ_2 var8 = (aZ_2)var4.get(0);
         var8.id_byte(var8.id_protected() - 0.5F);
         var1.id_class((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.rM, rqL_2.NEUTRAL, 1.0F, 1.0F);
         return rym_3.id_class(this.id_class(var5, var2, new rdn_3(rdy_3.kd)), var1.id_import());
      } else {
         rff_3 var6 = id_class(var1, var2, rjs_3.SOURCE_ONLY);
         if (var6.id_byte() == rjM_2.MISS) {
            return rym_3.id_byte(var5);
         } else {
            if (var6.id_byte() == rjM_2.BLOCK) {
               rfH_2 var7 = var6.id_class();
               if (!var1.id_class(var2, var7)) {
                  return rym_3.id_byte(var5);
               }

               if (var1.id_break(var7).id_class(rlG_2.id_break)) {
                  var1.id_class(var2, var2.rx(), var2.re(), var2.BO(), rqn_3.rb, rqL_2.NEUTRAL, 1.0F, 1.0F);
                  return rym_3.id_class(this.id_class(var5, var2, rAB.id_class(new rdn_3(rdy_3.JA), rAS.id_break)), var1.id_import());
               }
            }

            return rym_3.id_byte(var5);
         }
      }
   }
}
