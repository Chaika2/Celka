package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class df_3 extends xd_3 {
   private static final Map<xd_3, xd_3> id_final = Maps.newHashMap();
   protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final xd_3 id_package;

   public df_3(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
      id_final.put(var1, this);
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return this.id_package == xu_3.id_class ? super.id_class(var1, var2, var3) : new rdn_3(this.id_package);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.id_protected(var5);
      rdb_3 var8 = var7.id_break();
      xd_3 var9 = var8 instanceof rxJ_2 ? id_final.getOrDefault(((rxJ_2)var8).id_catch(), xu_3.id_class) : xu_3.id_class;
      boolean var10 = var9 == xu_3.id_class;
      boolean var11 = this.id_package == xu_3.id_class;
      if (var10 != var11) {
         if (var11) {
            var2.id_class(var3, var9.id_continue(), 3);
            var4.id_break(rlB_2.J);
            if (!((rhx_3)var4.id_implements[18]).id_protected) {
               var7.id_catch(1);
            }
         } else {
            rdn_3 var12 = new rdn_3(this.id_package);
            if (var7.id_class()) {
               var4.id_class(var5, var12);
            } else if (!var4.id_catch(var12)) {
               var4.id_class(var12, false);
            }

            var2.id_class(var3, xu_3.SA.id_continue(), 3);
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   public xd_3 id_break() {
      return this.id_package;
   }
}
