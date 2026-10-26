package celestial;

import java.util.List;

public class rxq_3 extends rdb_3 {
   public rxq_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (!var4.id_class(xu_3.rg) && !var4.id_class(xu_3.id_while)) {
         return ryZ_2.FAIL;
      } else {
         rfH_2 var5 = var3.id_final();
         if (!var2.id_finally(var5)) {
            return ryZ_2.FAIL;
         } else {
            double var6 = (double)var5.b_();
            double var8 = (double)var5.c_();
            double var10 = (double)var5.d_();
            List var12 = var2.id_class((an_3)null, new rfl_3(var6, var8, var10, var6 + 1.0, var8 + 2.0, var10 + 1.0));
            if (!var12.isEmpty()) {
               return ryZ_2.FAIL;
            } else {
               if (var2 instanceof rrEm_1) {
                  rSa_1 var13 = new rSa_1(var2, var6 + 0.5, var8, var10 + 0.5);
                  var13.id_class(false);
                  var2.a_(var13);
                  rKG var14 = ((rrEm_1)var2).Q();
                  if (var14 != null) {
                     var14.id_throws();
                  }
               }

               var1.id_volatile().id_catch(1);
               return ryZ_2.id_class(var2.id_continue);
            }
         }
      }
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return true;
   }
}
