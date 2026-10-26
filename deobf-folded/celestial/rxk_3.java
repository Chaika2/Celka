package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rxk_3 extends rdb_3 {
   private static final Predicate<an_3> id_class = rpJ_2.id_catch.and(an_3::rY);
   private final rSe_1 id_break;

   public rxk_3(rSe_1 var1, rdO_2 var2) {
      super(var2);
      this.id_break = var1;
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rff_3 var5 = id_class(var1, var2, rjs_3.ANY);
      if (var5.id_byte() == rjM_2.MISS) {
         return rym_3.id_byte(var4);
      } else {
         rjU_2 var6 = var2.id_break(1.0F);
         double var7 = 5.0;
         List var9 = var1.id_break(var2, var2.rN().id_break(var6.id_class(5.0)).id_class(1.0), id_class);
         if (!var9.isEmpty()) {
            rjU_2 var10 = var2.id_new(1.0F);

            for (an_3 var12 : var9) {
               rfl_3 var13 = var12.rN().id_class((double)var12.f());
               if (var13.id_case(var10)) {
                  return rym_3.id_byte(var4);
               }
            }
         }

         if (var5.id_byte() == rjM_2.BLOCK) {
            rSK var19 = new rSK(var1, var5.id_case().id_break, var5.id_case().id_byte, var5.id_case().id_protected);
            var19.id_class(this.id_break);
            Float var18 = (Float)var2.id_throws[15];
            var19.id_throws[15] = var18;
            if (!var1.a_(var19, var19.rN().id_class(-0.1))) {
               return rym_3.id_protected(var4);
            } else {
               if (!var1.id_continue) {
                  var1.a_(var19);
                  if (!((rhx_3)var2.id_implements[18]).id_protected) {
                     var4.id_catch(1);
                  }
               }

               var2.id_class(rlB_2.id_byte.id_break(this));
               return rym_3.id_class(var4, var1.id_import());
            }
         } else {
            return rym_3.id_byte(var4);
         }
      }
   }
}
