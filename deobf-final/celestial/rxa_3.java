package celestial;

public class rxa_3 extends rdb_3 {
   private final aI_2<? extends rsS_2> class_;

   public rxa_3(aI_2<? extends rsS_2> var1, rdO_2 var2) {
      super(var2);
      this.class_ = var1;
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rfH_2 var2 = var1.class_();
      rpr_3 var3 = var1.finally_();
      rfH_2 var4 = var2.break_(var3);
      rhd_3 var5 = var1.final_();
      rdn_3 var6 = var1.volatile_();
      if (var5 != null && !this.class_(var5, var3, var6, var4)) {
         return ryZ_2.FAIL;
      } else {
         rYB var7 = var1.int_();
         Object var8;
         if (this.class_ == aI_2.O) {
            var8 = new rsO_2(var7, var4, var3);
         } else {
            if (this.class_ != aI_2.default_) {
               return ryZ_2.class_(var7.continue_);
            }

            var8 = new rsG_2(var7, var4, var3);
         }

         rcd_3 var9 = var6.package_();
         if (var9 != null) {
            aI_2.class_(var7, var5, (an_3)var8, var9);
         }

         if (((rsS_2)var8).throws_()) {
            if (!var7.continue_) {
               ((rsS_2)var8).private_();
               var7.a_((an_3)var8);
            }

            var6.catch_(1);
            return ryZ_2.class_(var7.continue_);
         } else {
            return ryZ_2.CONSUME;
         }
      }
   }

   protected boolean class_(rhd_3 var1, rpr_3 var2, rdn_3 var3, rfH_2 var4) {
      return !var2.final_().byte_() && var1.class_(var4, var2, var3);
   }
}
