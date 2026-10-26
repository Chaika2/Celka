package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class df_3 extends xd_3 {
   private static final Map<xd_3, xd_3> final_ = Maps.newHashMap();
   protected static final rjC_2 volatile_ = xd_3.class_(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final xd_3 package_;

   public df_3(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.package_ = var1;
      final_.put(var1, this);
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return this.package_ == xu_3.class_ ? super.class_(var1, var2, var3) : new rdn_3(this.package_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.class_(var4, var5) ? xu_3.class_.continue_() : super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.protected_(var5);
      rdb_3 var8 = var7.break_();
      xd_3 var9 = var8 instanceof rxJ_2 ? final_.getOrDefault(((rxJ_2)var8).catch_(), xu_3.class_) : xu_3.class_;
      boolean var10 = var9 == xu_3.class_;
      boolean var11 = this.package_ == xu_3.class_;
      if (var10 != var11) {
         if (var11) {
            var2.class_(var3, var9.continue_(), 3);
            var4.break_(rlB_2.J);
            if (!((rhx_3)var4.implements_[18]).protected_) {
               var7.catch_(1);
            }
         } else {
            rdn_3 var12 = new rdn_3(this.package_);
            if (var7.class_()) {
               var4.class_(var5, var12);
            } else if (!var4.catch_(var12)) {
               var4.class_(var12, false);
            }

            var2.class_(var3, xu_3.SA.continue_(), 3);
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   public xd_3 break_() {
      return this.package_;
   }
}
