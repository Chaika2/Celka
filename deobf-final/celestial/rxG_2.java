package celestial;

import java.util.Random;

public class rxG_2 extends rdb_3 {
   public rxG_2(rdO_2 var1) {
      super(var1);
   }

   private void class_(rSY var1, Random var2) {
      rjO_2 var3 = var1.final_();
      float var4 = var2.nextFloat() * 5.0F;
      float var5 = var2.nextFloat() * 20.0F - 10.0F;
      rjO_2 var6 = new rjO_2(var3.break_() + var4, var3.byte_() + var5, var3.protected_());
      var1.class_(var6);
      var3 = var1.package_();
      var4 = var2.nextFloat() * 10.0F - 5.0F;
      var6 = new rjO_2(var3.break_(), var3.byte_() + var4, var3.protected_());
      var1.break_(var6);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rpr_3 var2 = var1.finally_();
      if (var2 == rpr_3.DOWN) {
         return ryZ_2.FAIL;
      } else {
         rYB var3 = var1.int_();
         rxx_3 var4 = new rxx_3(var1);
         rfH_2 var5 = var4.class_();
         rdn_3 var6 = var1.volatile_();
         rjU_2 var7 = rjU_2.protected_(var5);
         rfl_3 var8 = aI_2.break_.volatile_().class_(var7.class_(), var7.break_(), var7.byte_());
         if (var3.a_((an_3)null, var8, var0 -> true) && var3.class_((an_3)null, var8).isEmpty()) {
            if (var3 instanceof rrEm_1 var9) {
               rSY var10 = aI_2.break_.break_(var9, var6.package_(), (rgP_2)null, var1.final_(), var5, iO_2.SPAWN_EGG, true, true);
               if (var10 == null) {
                  return ryZ_2.FAIL;
               }

               var9.class_(var10);
               float var11 = (float)rfU_2.protected_((rfU_2.catch_(var1.private_() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               var10.class_(var10.rx(), var10.re(), var10.BO(), var11, 0.0F);
               this.class_(var10, var3.int_);
               var3.a_(var10);
               var3.class_((rhd_3)null, var10.rx(), var10.re(), var10.BO(), rqn_3.P, rqL_2.BLOCKS, 0.75F, 0.8F);
            }

            var6.catch_(1);
            return ryZ_2.class_(var3.continue_);
         } else {
            return ryZ_2.FAIL;
         }
      }
   }
}
