package celestial;

import java.util.Random;

public class rxG_2 extends rdb_3 {
   public rxG_2(rdO_2 var1) {
      super(var1);
   }

   private void id_class(rSY var1, Random var2) {
      rjO_2 var3 = var1.id_final();
      float var4 = var2.nextFloat() * 5.0F;
      float var5 = var2.nextFloat() * 20.0F - 10.0F;
      rjO_2 var6 = new rjO_2(var3.id_break() + var4, var3.id_byte() + var5, var3.id_protected());
      var1.id_class(var6);
      var3 = var1.id_package();
      var4 = var2.nextFloat() * 10.0F - 5.0F;
      var6 = new rjO_2(var3.id_break(), var3.id_byte() + var4, var3.id_protected());
      var1.id_break(var6);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rpr_3 var2 = var1.id_finally();
      if (var2 == rpr_3.DOWN) {
         return ryZ_2.FAIL;
      } else {
         rYB var3 = var1.id_int();
         rxx_3 var4 = new rxx_3(var1);
         rfH_2 var5 = var4.id_class();
         rdn_3 var6 = var1.id_volatile();
         rjU_2 var7 = rjU_2.id_protected(var5);
         rfl_3 var8 = aI_2.id_break.id_volatile().id_class(var7.id_class(), var7.id_break(), var7.id_byte());
         if (var3.a_((an_3)null, var8, var0 -> true) && var3.id_class((an_3)null, var8).isEmpty()) {
            if (var3 instanceof rrEm_1 var9) {
               rSY var10 = aI_2.id_break.id_break(var9, var6.id_package(), (rgP_2)null, var1.id_final(), var5, iO_2.SPAWN_EGG, true, true);
               if (var10 == null) {
                  return ryZ_2.FAIL;
               }

               var9.id_class(var10);
               float var11 = (float)rfU_2.id_protected((rfU_2.id_catch(var1.id_private() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               var10.id_class(var10.rx(), var10.re(), var10.BO(), var11, 0.0F);
               this.id_class(var10, var3.id_int);
               var3.a_(var10);
               var3.id_class((rhd_3)null, var10.rx(), var10.re(), var10.BO(), rqn_3.P, rqL_2.BLOCKS, 0.75F, 0.8F);
            }

            var6.id_catch(1);
            return ryZ_2.id_class(var3.id_continue);
         } else {
            return ryZ_2.FAIL;
         }
      }
   }
}
